package org.hcl.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class PolicyData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyId;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyType;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyProvider;

	@NotNull(message = "is required")
	
	private String policyDuration;

	@NotNull(message = "is required")
	
	private Date policyDueDate;

	@NotNull(message = "is required")
	
	private Integer policyAmount;

	@ManyToMany(mappedBy = "policydata")
	private Set< UserData> users=new HashSet<UserData>();

	public PolicyData() {

	}

	

	public Integer getPolicyId() {
		return policyId;
	}



	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}



	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyProvider() {
		return policyProvider;
	}

	public void setPolicyProvider(String policyProvider) {
		this.policyProvider = policyProvider;
	}

	public String getPolicyDuration() {
		return policyDuration;
	}

	public void setPolicyDuration(String policyDuration) {
		this.policyDuration = policyDuration;
	}

	public Date getPolicyDueDate() {
		return policyDueDate;
	}

	public void setPolicyDueDate(Date policyDueDate) {
		this.policyDueDate = policyDueDate;
	}

	public Integer getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}

	public Set<UserData> getUsers() {
		return users;
	}

	public void setUsers(Set<UserData> users) {
		this.users = users;
	}


	public PolicyData(Integer policyId,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyType,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyProvider,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyDuration,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") Date policyDueDate,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") int policyAmount,
			Set<UserData> users) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.policyProvider = policyProvider;
		this.policyDuration = policyDuration;
		this.policyDueDate = policyDueDate;
		this.policyAmount = policyAmount;
		this.users = users;
	}



	public void add(UserData userdata) {
		users.add(userdata);
	}

}
