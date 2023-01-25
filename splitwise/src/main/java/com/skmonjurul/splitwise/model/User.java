package com.skmonjurul.splitwise.model;

public class User extends Base{
    private String phoneNumber;
    private String emailId;

    public User(String id, String name, String phoneNumber, String emailId) {
        super(id, name);
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
