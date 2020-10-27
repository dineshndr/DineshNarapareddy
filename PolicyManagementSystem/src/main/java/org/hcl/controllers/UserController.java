package org.hcl.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hcl.dao.UserDao;
import org.hcl.entities.UserData;
import org.hcl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.hcl.entities.PolicyData;

@Controller
public class UserController {
	
	@Resource
	UserService service;
	@Autowired
	UserDao userdao;
	@GetMapping("/user")
	public String showadmin(Model model) {
		return "user";
	}
	
	@GetMapping("/userregisteration")
	public String showRegForm(Model model) {
		return "userregisteration";
	}
	
	@PostMapping("/userregister")
	public String registerUser(@RequestParam("firstName")String firstname,@RequestParam("lastName")String lastname,
			@RequestParam("age")int age,@RequestParam("gender")String gender,@RequestParam("contactNo")String contactno,
			@RequestParam("userId")String userid,@RequestParam("password")String password,Model model) {
		UserData user=new UserData();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setAge(age);
		user.setGender(gender);
		user.setContactNo(contactno);
		user.setUserId(userid);
		user.setPassword(password);
		service.insert(user);
		
		if(user.getFirstName().equals(null)||user.getLastName().equals(null)||user.getAge()==0||
				user.getGender().equals(null)||user.getContactNo().equals(null)||user.getUserId().equals(null)||user.getPassword().equals(null)) {
			model.addAttribute("error","Please fill all the fields");
			return "userregisteration";
		}
		
			model.addAttribute("error","Your Registeration has been completed successfully");
			return "user";
	}
	
	@PostMapping("/usersubmitForm")
	public String validate(@RequestParam("userId")String userId,
			@RequestParam("password")String password,Model model,
			HttpSession session,HttpServletRequest request) {
		
		boolean valid= service.validate(userId, password);
		if(valid) {
			model.addAttribute("success", userId);
			session.setAttribute("userId",userId);
			return "userhome";
		}
		model.addAttribute("error","invalid username or password");
		return "user";
	}
	@GetMapping("/policysearch")
	public String getpolicysearch(HttpServletRequest request,Model model)
	{
		int pid=Integer.parseInt(request.getParameter("search"));
		PolicyData policy  = userdao.getPolicy(pid);
		model.addAttribute("policy",policy);
		return "userhome";
	}
	
	
	
		
	
	
}
	
	
	
	
	
	
	
	

