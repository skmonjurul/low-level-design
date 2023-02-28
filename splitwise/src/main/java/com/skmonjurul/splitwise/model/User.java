package com.skmonjurul.splitwise.model;

import java.util.HashMap;
import java.util.Map;

public class User extends Base{
    private String phoneNumber;
    private String emailId;
    private Balance balance;
    private Map<String, Double> balanceSheet;



    public User(String id, String name, String phoneNumber, String emailId) {
        super(id, name);
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        balance = new Balance();
        balanceSheet = new HashMap<>();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getEmailId() {
        return emailId;
    }


    public Balance getBalance() {
        return balance;
    }


    public Map<String, Double> getBalanceSheet() {
        return balanceSheet;
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
