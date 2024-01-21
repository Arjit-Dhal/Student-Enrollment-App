package com.course.reg.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserRegistration implements Serializable {

	private static final long serialVersionUID = -300263021830590898L;
	
	//NotBlank(message = "Firstname should not be empty")
	//@Size(min = 5, max = 50)
	private String firstName;
	
	//@NotBlank(message = "Lastname should not be empty")
	//@Size(min = 5, max = 50)
	private String lastName;
	
	//@NotBlank(message = "Email should not be empty")
	//@Email(message = "Please enter a valid e-mail address")
	private String emailId;
	
	//@NotBlank(message = "Mobile No should not be empty")
	//@Size(min = 10, max = 10, message = "Please provide your 10 digit mobile no")
	private String mobileNo;
	
	//@NotNull(message = "Date Of Birth should not be empty")
	//@Past(message = "Birth date must be the past date")
	//@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private Date createdDate;
	private Date lastUpdatedDate;
	
	//@NotBlank(message = "Login username should not be empty")
	private String loginUsername;
	
	//@NotEmpty(message = "Login Password should not be empty")
	private String loginPassword;
	
	private String role;
	private short enabled;
	
	private String adminCode;

	public UserRegistration() {
	}

	public UserRegistration(String firstName, String lastName, String emailId, String mobileNo, Date dob,
			Date createdDate, Date lastUpdatedDate, String loginUsername, String loginPassword, String adminCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.loginUsername = loginUsername;
		this.loginPassword = loginPassword;
		this.adminCode = adminCode;
	}
	  
	  public void setRole(String role) {
	  this.role = role;
	  }
	  
	  public short getEnabled() {
	  return enabled;
	  }
	  
	  public void setEnabled(short enabled) {
	  this.enabled = enabled;
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
	  
	  public String getEmailId() {
	  return emailId;
	  }
	  
	  public void setEmailId(String emailId) {
	  this.emailId = emailId;
	  }
	  
	  public String getMobileNo() {
	  return mobileNo;
	  }
	  
	  public void setMobileNo(String mobileNo) {
	  this.mobileNo = mobileNo;
	  }
	  
	  public Date getDob() {
	  return dob;
	  }
	  
	  public void setDob(Date dob) {
	  this.dob = dob;
	  }
	  
	  public Date getCreatedDate() {
	  return createdDate;
	  }
	  
	  public void setCreatedDate(Date createdDate) {
	  this.createdDate = createdDate;
	  }
	  
	  public Date getLastUpdatedDate() {
	  return lastUpdatedDate;
	  }
	  
	  public void setLastUpdatedDate(Date lastUpdatedDate) {
	  this.lastUpdatedDate = lastUpdatedDate;
	  }
	  
	  public String getLoginUsername() {
	  return loginUsername;
	  }
	  
	  public void setLoginUsername(String loginUsername) {
	  this.loginUsername = loginUsername;
	  }
	  
	  public String getLoginPassword() {
	  return loginPassword;
	  }
	  
	  public void setLoginPassword(String loginPassword) {
	  this.loginPassword = loginPassword;
	  }
	  
	
	  public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}
	

	public String getRole() {
		return role;
	}

	@Override
	  public String toString() {
	  return "User [" + ", firstName=" + firstName + ", lastName=" + lastName +
	  ", emailId=" + emailId + ", mobileNo="
	  + mobileNo + ", dob=" + dob + ", createdDate=" + createdDate +
	  ", lastUpdatedDate=" + lastUpdatedDate
	  + ", loginUsername=" + loginUsername + "]";
	  }
	 

}
