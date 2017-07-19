package com.ibm.newcrm.dto;

/**
 * Created by VivekMadan on 05-07-2017.
 */
public class UserDto {
	private int userId;
    private String lob;
    private String loginId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobileNo;
    private String partner;
    private String userType;
    private String status;
    private String circle;
    

    public UserDto() {
    }

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", lob=" + lob + ", loginId=" + loginId + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", email=" + email + ", mobileNo="
				+ mobileNo + ", partner=" + partner + ", userType=" + userType + ", status=" + status + ", circle="
				+ circle + "]";
	}


}