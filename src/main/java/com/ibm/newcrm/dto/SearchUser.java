package com.ibm.newcrm.dto;

/**
 * Created by VivekMadan on 06-07-2017.
 */
public class SearchUser {
    private String userId;
    private String firstName;

    public SearchUser() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "SearchUser{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
