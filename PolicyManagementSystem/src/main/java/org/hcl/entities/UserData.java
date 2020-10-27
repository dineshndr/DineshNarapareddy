package org.hcl.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@NotNull(message = "is required")
	private Integer age;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String gender;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String contactNo;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String userId;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String password;

	private Date enrollementDate;
	private String paymentStatus;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "User_Policy", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "policyId") })
	private  Set<PolicyData> policydata=new HashSet<PolicyData>();

	public UserData() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getEnrollementDate() {
		return enrollementDate;
	}

	public void setEnrollementDate(Date enrollementDate) {
		this.enrollementDate = enrollementDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Set<PolicyData> getPolicydata() {
		return policydata;
	}

	public void setPolicydata(Set<PolicyData> policydata) {
		this.policydata = policydata;
	}

	public UserData(Integer id,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String firstName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") int age,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String gender,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String contactNo,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String userId,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String password,
			Date enrollementDate, String paymentStatus, Set<PolicyData> policydata) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNo = contactNo;
		this.userId = userId;
		this.password = password;
		this.enrollementDate = enrollementDate;
		this.paymentStatus = paymentStatus;
		this.policydata = policydata;
	}

     public void add(PolicyData data) {
    	 policydata.add(data);
     }

}
