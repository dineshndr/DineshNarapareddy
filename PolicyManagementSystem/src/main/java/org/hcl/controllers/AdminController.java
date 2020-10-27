package org.hcl.controllers;

import java.sql.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hcl.entities.AdminCredentials;
import org.hcl.entities.PolicyData;
import org.hcl.services.AdminService;
import org.hcl.services.PolicyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@Resource
	AdminService service;
	@Resource
	PolicyService policyservice;

	@GetMapping("/admin")
	public String showadmin() {
		return "admin";
	}

	@GetMapping("/adminregisteration")
	public String showRegForm(Model model) {
		return "adminregisteration";
	}

	@PostMapping("/vendorregister")
	public String registerUser(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname,
			@RequestParam("age") int age, @RequestParam("gender") String gender,
			@RequestParam("contactNo") String contactno, @RequestParam("vendorId") String userid,
			@RequestParam("password") String password, Model model) {
		AdminCredentials admin = new AdminCredentials();
		admin.setFirstName(firstname);
		admin.setLastName(lastname);
		admin.setAge(age);
		admin.setGender(gender);
		admin.setContactNo(contactno);
		admin.setVendorId(userid);
		admin.setPassword(password);
		service.insert(admin);

		if (admin.getFirstName().equals(null) || admin.getLastName().equals(null) || admin.getAge() == 0
				|| admin.getGender().equals(null) || admin.getContactNo().equals(null)
				|| admin.getVendorId().equals(null) || admin.getPassword().equals(null)) {
			model.addAttribute("error", "Please fill all the fields");
			return "adminregisteration";
		}
		model.addAttribute("error", "Your Registeration has been completed successfully");
		return "admin";
	}

	@PostMapping("/adminsubmitForm")
	public String validate(@RequestParam("vendorId") String vendorId, @RequestParam("password") String password,
			Model model, HttpSession session, HttpServletRequest request) {

		boolean valid = service.validate(vendorId, password);
		if (valid) {
			model.addAttribute("success", vendorId);
			session.setAttribute("userId", vendorId);
			return "adminhome";
		}
		model.addAttribute("error", "invalid username or password");
		return "admin";
	}

	@GetMapping("/policyregisteration")
	public String policyform() {
		return "policyregisteration";
	}

	@PostMapping("/createpolicy")
	public String createpolicy(@RequestParam("policyName") String policyName,
			@RequestParam("policyProvider") String policyProvider, @RequestParam("policyType") String policyType,
			@RequestParam("duration") String duration, @RequestParam("duedate") Date duedate,
			@RequestParam("amount") int amount, Model model) {
		PolicyData policy = new PolicyData();
		policy.setPolicyName(policyName);
		policy.setPolicyProvider(policyProvider);
		policy.setPolicyType(policyType);
		policy.setPolicyDuration(duration);
		policy.setPolicyDueDate(duedate);
		policy.setPolicyAmount(amount);
		policyservice.insert(policy);
		if (policy.getPolicyName().equals(null) || policy.getPolicyType().equals(null)
				|| policy.getPolicyProvider().equals(null) || policy.getPolicyDuration().equals(null)
				|| policy.getPolicyDueDate().equals(null) || policy.getPolicyAmount().equals(null)) {
			model.addAttribute("error", "Please enter all the fields");
			return "policyregisteration";
		}
		model.addAttribute("success", "Successfully Created Policy");
		return "adminhome";
	}

	@GetMapping("/editedpolicy")
	public String getEdit() {
		return "editedpolicy";
	}

	@PostMapping("/editpolicy")
	public String getEdit(@RequestParam("policyId") Integer policyId, Model model) {
		PolicyData policyform = policyservice.get(policyId);
		model.addAttribute("policy", policyform);
		return "editpolicy";
	}

	@PostMapping("/editingpolicy")
	public String postEdit(@RequestParam("policyId") Integer policyId, @RequestParam("policyName") String policyName,
			@RequestParam("policyProvider") String policyProvider, @RequestParam("policyType") String policyType,
			@RequestParam("duration") String duration, @RequestParam("duedate") Date duedate,
			@RequestParam("amount") int amount, Model model, @ModelAttribute("policy") PolicyData policy) {

		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPolicyProvider(policyProvider);
		policy.setPolicyDuration(duration);
		policy.setPolicyDueDate(duedate);
		policy.setPolicyAmount(amount);
		policyservice.edit(policy);
		return "adminhome";
	}

}
