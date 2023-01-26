package com.skmonjurul.splitwise.model;

import com.skmonjurul.splitwise.factory.ExpenseFactory;

import java.util.List;

public abstract class Expense {
    private String id;
    private String description;
    private User paidBy;
    private double amount;
    private SplitType splitType;
    private List<Split> splitList;

    protected Expense(SplitType splitType) {
        this.splitType = splitType;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public double getAmount() {
        return amount;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public List<Split> getSplitList() {
        return splitList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSplitList(List<Split> splitList) {
        this.splitList = splitList;
    }

    public abstract void validate();

    @Override
    public String toString() {
        return "Expense{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", paidBy=" + paidBy +
                ", amount=" + amount +
                ", splitType=" + splitType +
                ", splitList=" + splitList +
                '}';
    }
}
