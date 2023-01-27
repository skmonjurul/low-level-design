package com.skmonjurul.splitwise.model;

public class Balance {
    private double owe;
    private double getBack;

    public Balance() {
        owe = 0.0;
        getBack = 0.0;
    }

    public double getOwe() {
        return owe;
    }

    public void setOwe(double owe) {
        this.owe = owe;
    }

    public double getGetBack() {
        return getBack;
    }

    public void setGetBack(double getBack) {
        this.getBack = getBack;
    }
}
