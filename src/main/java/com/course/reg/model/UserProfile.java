package com.course.reg.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class UserProfile implements Serializable {

	private static final long serialVersionUID = -300263021830590898L;
	
	@NotBlank(message = "Firstname should not be empty")
	@Size(min = 3, max = 50)
	private String firstName;

	private String lastName;

	@NotBlank(message = "Email should not be empty")
	@Email(message = "Please enter a valid e-mail address")
	private String emailId;

	@NotBlank(message = "Mobile No should not be empty")
	@Size(min = 10, max = 10, message = "Please provide your 10 digit mobile no")
	private String mobileNo;

	@NotNull(message = "Date Of Birth should not be empty")
	@Past(message = "Birth date must be the past date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;

	private String loginUsername;

	private Date createdDate;
	private Date lastUpdatedDate;

	private String profilePicName;

	public UserProfile() {
	}

	public UserProfile(@NotBlank(message = "Firstname should not be empty") @Size(min = 3, max = 50) String firstName,
			String lastName,
			@NotBlank(message = "Email should not be empty") @Email(message = "Please enter a valid e-mail address") String emailId,
			@NotBlank(message = "Mobile No should not be empty") @Size(min = 10, max = 10, message = "Please provide your 10 digit mobile no") String mobileNo,
			Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.dob = dob;
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

	public String getProfilePicName() {
		return profilePicName;
	}

	public void setProfilePicName(String profilePicName) {
		this.profilePicName = profilePicName;
	}

	@Override
	public String toString() {
		return "UserProfile [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", mobileNo="
				+ mobileNo + ", dob=" + dob + ", loginUsername=" + loginUsername + ", createdDate=" + createdDate
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", profilePicName=" + profilePicName + "]";
	}
}
