package com.ibm.newcrm.dto;

/**
 * Created by VivekMadan on 18-06-2017.
 */
public class AadharDto
{
    private String aadharText;
    private String address1Text;
    private String address2Text;
    private String address3Text;
    private String altNumberText;
    private String cityText;
    private String corAddCheck;
    private String document;
    private String documentNumber;
    private String emailText;
    private String fatherNameText;
    private String firstNameText;
    private String landlineText;
    private String landmarkText;
    private String lastNameText;
    private String lob;
    private String middleNameText;
    private String mobileText;
    private String organizationText;
    private String perAddCheck;
    private String sex;
    private String stateText;

    public String getAddress1Text() {
        return address1Text;
    }

    public void setAddress1Text(String address1Text) {
        this.address1Text = address1Text;
    }

    public String getAddress2Text() {
        return address2Text;
    }

    public void setAddress2Text(String address2Text) {
        this.address2Text = address2Text;
    }

    public String getAddress3Text() {
        return address3Text;
    }

    public void setAddress3Text(String address3Text) {
        this.address3Text = address3Text;
    }

    public String getAltNumberText() {
        return altNumberText;
    }

    public void setAltNumberText(String altNumberText) {
        this.altNumberText = altNumberText;
    }

    public String getCityText() {
        return cityText;
    }

    public void setCityText(String cityText) {
        this.cityText = cityText;
    }

    public String getCorAddCheck() {
        return corAddCheck;
    }

    public void setCorAddCheck(String corAddCheck) {
        this.corAddCheck = corAddCheck;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getFatherNameText() {
        return fatherNameText;
    }

    public void setFatherNameText(String fatherNameText) {
        this.fatherNameText = fatherNameText;
    }

    public String getFirstNameText() {
        return firstNameText;
    }

    public void setFirstNameText(String firstNameText) {
        this.firstNameText = firstNameText;
    }

    public String getLandlineText() {
        return landlineText;
    }

    public void setLandlineText(String landlineText) {
        this.landlineText = landlineText;
    }

    public String getLandmarkText() {
        return landmarkText;
    }

    public void setLandmarkText(String landmarkText) {
        this.landmarkText = landmarkText;
    }

    public String getLastNameText() {
        return lastNameText;
    }

    public void setLastNameText(String lastNameText) {
        this.lastNameText = lastNameText;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getMiddleNameText() {
        return middleNameText;
    }

    public void setMiddleNameText(String middleNameText) {
        this.middleNameText = middleNameText;
    }

    public String getMobileText() {
        return mobileText;
    }

    public void setMobileText(String mobileText) {
        this.mobileText = mobileText;
    }

    public String getOrganizationText() {
        return organizationText;
    }

    public void setOrganizationText(String organizationText) {
        this.organizationText = organizationText;
    }

    public String getPerAddCheck() {
        return perAddCheck;
    }

    public void setPerAddCheck(String perAddCheck) {
        this.perAddCheck = perAddCheck;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStateText() {
        return stateText;
    }

    public void setStateText(String stateText) {
        this.stateText = stateText;
    }

    public String getAadharText() {
        return aadharText;
    }

    public void setAadharText(String aadharText) {
        this.aadharText = aadharText;
    }

    @Override
    public String toString() {
        return "AadharDto{" +
                "aadharText='" + aadharText + '\'' +
                ", address1Text='" + address1Text + '\'' +
                ", address2Text='" + address2Text + '\'' +
                ", address3Text='" + address3Text + '\'' +
                ", altNumberText='" + altNumberText + '\'' +
                ", cityText='" + cityText + '\'' +
                ", corAddCheck='" + corAddCheck + '\'' +
                ", document='" + document + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", emailText='" + emailText + '\'' +
                ", fatherNameText='" + fatherNameText + '\'' +
                ", firstNameText='" + firstNameText + '\'' +
                ", landlineText='" + landlineText + '\'' +
                ", landmarkText='" + landmarkText + '\'' +
                ", lastNameText='" + lastNameText + '\'' +
                ", lob='" + lob + '\'' +
                ", middleNameText='" + middleNameText + '\'' +
                ", mobileText='" + mobileText + '\'' +
                ", organizationText='" + organizationText + '\'' +
                ", perAddCheck='" + perAddCheck + '\'' +
                ", sex='" + sex + '\'' +
                ", stateText='" + stateText + '\'' +
                '}';
    }
    
    public void useLambdaMethod(TestLamdaInterface testL)
    {
    	testL.testLambda("Vivek Madan", "Alok");
    }
    
    public void print(String str, String str1)
    {
    	System.out.println("Str: " + str + ", Str1: " + str1);
    }
    
    public static void main(String[] args) {
		AadharDto dto = new AadharDto();
		
	}
}