package com.ibm.newcrm.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by VivekMadan on 05-07-2017.
 */

@Entity
@Table(name = "USER_MSTR")
public class UserEntity {
    @Id
    @SequenceGenerator(name = "user_master_id", sequenceName = "USER_MASTER_ID_SEQ")
    @GeneratedValue(generator = "user_master_id", strategy = GenerationType.SEQUENCE)
    private int     USER_ID;
    private String  USER_LOGIN_ID;
    private String  USER_FNAME;
    private String  USER_MNAME;
    private String  USER_LNAME;
    private String  USER_MOBILE_NUMBER;
    private String  USER_EMAILID;
    private String  USER_PASSWORD;
    private Date    USER_PSSWRD_EXPRY_DT;
    private Date    CREATED_DT;
    private int     CREATED_BY;
    private Date    UPDATED_DT;
    private int     UPDATED_BY;
    private char    STATUS;
    private int     GROUP_ID;
    private int     KM_ACTOR_ID;
    private int     KM_OWNER_ID;
    private int     LOGIN_ATTEMPTED;
    private Date    LAST_LOGIN_TIME;
    private char    USER_LOGIN_STATUS;
    private int     FAV_CATEGORY_ID;
    private int     ELEMENT_ID;
    private char    USER_ALERTS;
    private String  ALERT_ID;
    private String  PARTNER_NAME;
    private Date    PASSWORD_RESET_TIME;
    private int     ALERTS_COUNT;
    private String  OLM_ID;
    private String  ROLE;
    private String  BUSINESS_SEGEMENT;
    private String  PROCESS;
    private String  ACTIVITY;
    private String  PARTNER;
    private String  LOCATION;
    private Date    END_LOGIN_TIME;
    private double  TOTAL_LOGIN_TIME;
    private String  PBX_ID;

    public UserEntity() {
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_LOGIN_ID() {
        return USER_LOGIN_ID;
    }

    public void setUSER_LOGIN_ID(String USER_LOGIN_ID) {
        this.USER_LOGIN_ID = USER_LOGIN_ID;
    }

    public String getUSER_FNAME() {
        return USER_FNAME;
    }

    public void setUSER_FNAME(String USER_FNAME) {
        this.USER_FNAME = USER_FNAME;
    }

    public String getUSER_MNAME() {
        return USER_MNAME;
    }

    public void setUSER_MNAME(String USER_MNAME) {
        this.USER_MNAME = USER_MNAME;
    }

    public String getUSER_LNAME() {
        return USER_LNAME;
    }

    public void setUSER_LNAME(String USER_LNAME) {
        this.USER_LNAME = USER_LNAME;
    }

    public String getUSER_MOBILE_NUMBER() {
        return USER_MOBILE_NUMBER;
    }

    public void setUSER_MOBILE_NUMBER(String USER_MOBILE_NUMBER) {
        this.USER_MOBILE_NUMBER = USER_MOBILE_NUMBER;
    }

    public String getUSER_EMAILID() {
        return USER_EMAILID;
    }

    public void setUSER_EMAILID(String USER_EMAILID) {
        this.USER_EMAILID = USER_EMAILID;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(String USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public Date getUSER_PSSWRD_EXPRY_DT() {
        return USER_PSSWRD_EXPRY_DT;
    }

    public void setUSER_PSSWRD_EXPRY_DT(Date USER_PSSWRD_EXPRY_DT) {
        this.USER_PSSWRD_EXPRY_DT = USER_PSSWRD_EXPRY_DT;
    }

    public Date getCREATED_DT() {
        return CREATED_DT;
    }

    public void setCREATED_DT(Date CREATED_DT) {
        this.CREATED_DT = CREATED_DT;
    }

    public int getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(int CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public Date getUPDATED_DT() {
        return UPDATED_DT;
    }

    public void setUPDATED_DT(Date UPDATED_DT) {
        this.UPDATED_DT = UPDATED_DT;
    }

    public int getUPDATED_BY() {
        return UPDATED_BY;
    }

    public void setUPDATED_BY(int UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY;
    }

    public char getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(char STATUS) {
        this.STATUS = STATUS;
    }

    public int getGROUP_ID() {
        return GROUP_ID;
    }

    public void setGROUP_ID(int GROUP_ID) {
        this.GROUP_ID = GROUP_ID;
    }

    public int getKM_ACTOR_ID() {
        return KM_ACTOR_ID;
    }

    public void setKM_ACTOR_ID(int KM_ACTOR_ID) {
        this.KM_ACTOR_ID = KM_ACTOR_ID;
    }

    public int getKM_OWNER_ID() {
        return KM_OWNER_ID;
    }

    public void setKM_OWNER_ID(int KM_OWNER_ID) {
        this.KM_OWNER_ID = KM_OWNER_ID;
    }

    public int getLOGIN_ATTEMPTED() {
        return LOGIN_ATTEMPTED;
    }

    public void setLOGIN_ATTEMPTED(int LOGIN_ATTEMPTED) {
        this.LOGIN_ATTEMPTED = LOGIN_ATTEMPTED;
    }

    public Date getLAST_LOGIN_TIME() {
        return LAST_LOGIN_TIME;
    }

    public void setLAST_LOGIN_TIME(Date LAST_LOGIN_TIME) {
        this.LAST_LOGIN_TIME = LAST_LOGIN_TIME;
    }

    public char getUSER_LOGIN_STATUS() {
        return USER_LOGIN_STATUS;
    }

    public void setUSER_LOGIN_STATUS(char USER_LOGIN_STATUS) {
        this.USER_LOGIN_STATUS = USER_LOGIN_STATUS;
    }

    public int getFAV_CATEGORY_ID() {
        return FAV_CATEGORY_ID;
    }

    public void setFAV_CATEGORY_ID(int FAV_CATEGORY_ID) {
        this.FAV_CATEGORY_ID = FAV_CATEGORY_ID;
    }

    public int getELEMENT_ID() {
        return ELEMENT_ID;
    }

    public void setELEMENT_ID(int ELEMENT_ID) {
        this.ELEMENT_ID = ELEMENT_ID;
    }

    public char getUSER_ALERTS() {
        return USER_ALERTS;
    }

    public void setUSER_ALERTS(char USER_ALERTS) {
        this.USER_ALERTS = USER_ALERTS;
    }

    public String getALERT_ID() {
        return ALERT_ID;
    }

    public void setALERT_ID(String ALERT_ID) {
        this.ALERT_ID = ALERT_ID;
    }

    public String getPARTNER_NAME() {
        return PARTNER_NAME;
    }

    public void setPARTNER_NAME(String PARTNER_NAME) {
        this.PARTNER_NAME = PARTNER_NAME;
    }

    public Date getPASSWORD_RESET_TIME() {
        return PASSWORD_RESET_TIME;
    }

    public void setPASSWORD_RESET_TIME(Date PASSWORD_RESET_TIME) {
        this.PASSWORD_RESET_TIME = PASSWORD_RESET_TIME;
    }

    public int getALERTS_COUNT() {
        return ALERTS_COUNT;
    }

    public void setALERTS_COUNT(int ALERTS_COUNT) {
        this.ALERTS_COUNT = ALERTS_COUNT;
    }

    public String getOLM_ID() {
        return OLM_ID;
    }

    public void setOLM_ID(String OLM_ID) {
        this.OLM_ID = OLM_ID;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    public String getBUSINESS_SEGEMENT() {
        return BUSINESS_SEGEMENT;
    }

    public void setBUSINESS_SEGEMENT(String BUSINESS_SEGEMENT) {
        this.BUSINESS_SEGEMENT = BUSINESS_SEGEMENT;
    }

    public String getPROCESS() {
        return PROCESS;
    }

    public void setPROCESS(String PROCESS) {
        this.PROCESS = PROCESS;
    }

    public String getACTIVITY() {
        return ACTIVITY;
    }

    public void setACTIVITY(String ACTIVITY) {
        this.ACTIVITY = ACTIVITY;
    }

    public String getPARTNER() {
        return PARTNER;
    }

    public void setPARTNER(String PARTNER) {
        this.PARTNER = PARTNER;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public Date getEND_LOGIN_TIME() {
        return END_LOGIN_TIME;
    }

    public void setEND_LOGIN_TIME(Date END_LOGIN_TIME) {
        this.END_LOGIN_TIME = END_LOGIN_TIME;
    }

    public double getTOTAL_LOGIN_TIME() {
        return TOTAL_LOGIN_TIME;
    }

    public void setTOTAL_LOGIN_TIME(double TOTAL_LOGIN_TIME) {
        this.TOTAL_LOGIN_TIME = TOTAL_LOGIN_TIME;
    }

    public String getPBX_ID() {
        return PBX_ID;
    }

    public void setPBX_ID(String PBX_ID) {
        this.PBX_ID = PBX_ID;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "USER_ID=" + USER_ID +
                ", USER_LOGIN_ID='" + USER_LOGIN_ID + '\'' +
                ", USER_FNAME='" + USER_FNAME + '\'' +
                ", USER_MNAME='" + USER_MNAME + '\'' +
                ", USER_LNAME='" + USER_LNAME + '\'' +
                ", USER_MOBILE_NUMBER='" + USER_MOBILE_NUMBER + '\'' +
                ", USER_EMAILID='" + USER_EMAILID + '\'' +
                ", USER_PASSWORD='" + USER_PASSWORD + '\'' +
                ", USER_PSSWRD_EXPRY_DT=" + USER_PSSWRD_EXPRY_DT +
                ", CREATED_DT=" + CREATED_DT +
                ", CREATED_BY=" + CREATED_BY +
                ", UPDATED_DT=" + UPDATED_DT +
                ", UPDATED_BY=" + UPDATED_BY +
                ", STATUS=" + STATUS +
                ", GROUP_ID=" + GROUP_ID +
                ", KM_ACTOR_ID=" + KM_ACTOR_ID +
                ", KM_OWNER_ID=" + KM_OWNER_ID +
                ", LOGIN_ATTEMPTED=" + LOGIN_ATTEMPTED +
                ", LAST_LOGIN_TIME=" + LAST_LOGIN_TIME +
                ", USER_LOGIN_STATUS=" + USER_LOGIN_STATUS +
                ", FAV_CATEGORY_ID=" + FAV_CATEGORY_ID +
                ", ELEMENT_ID=" + ELEMENT_ID +
                ", USER_ALERTS=" + USER_ALERTS +
                ", ALERT_ID='" + ALERT_ID + '\'' +
                ", PARTNER_NAME='" + PARTNER_NAME + '\'' +
                ", PASSWORD_RESET_TIME=" + PASSWORD_RESET_TIME +
                ", ALERTS_COUNT=" + ALERTS_COUNT +
                ", OLM_ID='" + OLM_ID + '\'' +
                ", ROLE='" + ROLE + '\'' +
                ", BUSINESS_SEGEMENT='" + BUSINESS_SEGEMENT + '\'' +
                ", PROCESS='" + PROCESS + '\'' +
                ", ACTIVITY='" + ACTIVITY + '\'' +
                ", PARTNER='" + PARTNER + '\'' +
                ", LOCATION='" + LOCATION + '\'' +
                ", END_LOGIN_TIME=" + END_LOGIN_TIME +
                ", TOTAL_LOGIN_TIME=" + TOTAL_LOGIN_TIME +
                ", PBX_ID='" + PBX_ID + '\'' +
                '}';
    }
}
