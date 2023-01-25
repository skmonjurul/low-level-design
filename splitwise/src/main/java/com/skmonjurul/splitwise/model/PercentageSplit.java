package com.skmonjurul.splitwise.model;

public class PercentageSplit extends Split{
    private double percentage;

    public PercentageSplit(User user) {
        super(user);
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
