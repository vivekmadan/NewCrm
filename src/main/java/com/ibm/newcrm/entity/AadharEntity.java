package com.ibm.newcrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="AADHAR_DATA")
public class AadharEntity 
{	
	@Id
	@GeneratedValue(generator="aadhar_id_generator",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="aadhar_id_generator", sequenceName="AADHAR_ID")
	@Column(name="ID")
	private int id;
	
	@Column(name="AADHAR_NUMBER")
	private String aadharNumber;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="FATHER_SPOUSE_NAME")
	private String fatherSpouseName;
	
	@Column(name="ORGANIZATION")
	private String organization;
	
	@Column(name="ADDRESS1")
	private String address1;
	
	@Column(name="ADDRESS2")
	private String address2;
	
	@Column(name="ADDRESS3")
	private String address3;
	
	@Column(name="LANDMARK")
	private String landmark;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PIN")
	private String pinCode;
	
	@Column(name="MOBILENO")
	private String mobileNumber;
	
	@Column(name="LANDLINENO")
	private String landlineNumber;
	
	@Column(name="SEX")
	private String sex;
	
	@Column(name="EMAIL")
	private String email;
	
	
	public AadharEntity(){}
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
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
	public String getFatherSpouseName() {
		return fatherSpouseName;
	}
	public void setFatherSpouseName(String fatherSpouseName) {
		this.fatherSpouseName = fatherSpouseName;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLandlineNumber() {
		return landlineNumber;
	}
	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "AadharEntity [id=" + id + ", aadharNumber=" + aadharNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", fatherSpouseName=" + fatherSpouseName
				+ ", organization=" + organization + ", address1=" + address1 + ", address2=" + address2 + ", address3="
				+ address3 + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ ", mobileNumber=" + mobileNumber + ", landlineNumber=" + landlineNumber + ", sex=" + sex + ", email="
				+ email + "]";
	}
}
