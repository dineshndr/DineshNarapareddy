package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AdminCredentials {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	@NotBlank(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@NotNull(message = "is required")
	private Integer age;

	@NotBlank(message = "is required")
	@Size(min = 1, message = "is required")
	private String gender;

	@NotBlank(message = "is required")
	@Size(min = 1, message = "is required")
	private String contactNo;

	@NotBlank(message = "is required")
	@Size(min = 1, message = "is required")
	private String vendorId;

	@NotBlank(message = "is required")
	@Size(min = 1, message = "is required")
	private String password;

	public AdminCredentials() {

	}

	public AdminCredentials(@NotBlank(message = "is required") @Size(min = 1, message = "is required") String firstName,
			@NotBlank(message = "is required") @Size(min = 1, message = "is required") String lastName,
			@NotBlank(message = "is required") @Size(min = 1, message = "is required") int age,
			@NotBlank(message = "is required") @Size(min = 1, message = "is required") String gender,
			@NotBlank(message = "is required") @Size(min = 1, message = "is required") String contactNo,
			@NotBlank(message = "is required") @Size(min = 1, message = "is required") String vendorId,
			@NotBlank(message = "is required") @Size(min = 1, message = "is required") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNo = contactNo;
		this.vendorId = vendorId;
		this.password = password;
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

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
