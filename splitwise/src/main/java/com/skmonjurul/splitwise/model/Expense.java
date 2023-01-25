package com.skmonjurul.splitwise.model;

import java.util.List;

public class Expense {
    private String id;
    private String description;
    private User paidBy;
    private double amount;
    private SplitType splitType;
    private List<Split> splitList;

    private Expense(ExpenseBuilder expenseBuilder) {
        this.id = expenseBuilder.id;
        this.description = expenseBuilder.description;
        this.paidBy = expenseBuilder.paidBy;
        this.amount = expenseBuilder.amount;
        this.splitType = expenseBuilder.splitType;
        this.splitList = expenseBuilder.splitList;
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

    public void setSplitList(List<Split> splitList) {
        this.splitList = splitList;
    }

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

    public static class ExpenseBuilder {
        private String id;
        private String description;
        private User paidBy;
        private double amount;
        private SplitType splitType;

        private List<Split> splitList;

        public ExpenseBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ExpenseBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ExpenseBuilder paidBy(User paidBy) {
            this.paidBy = paidBy;
            return this;
        }

        public ExpenseBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public ExpenseBuilder splitType(SplitType splitType) {
            this.splitType = splitType;
            return this;
        }

        public ExpenseBuilder splitList(List<Split> splitList) {
            this.splitList = splitList;
            return this;
        }

        public Expense build() {
            return new Expense(this);
        }
    }


}
