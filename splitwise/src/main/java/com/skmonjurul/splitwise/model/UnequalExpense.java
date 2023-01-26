package com.skmonjurul.splitwise.model;

public class UnequalExpense extends Expense{

    public UnequalExpense(SplitType splitType) {
        super(splitType);
    }

    @Override
    public void validate() {
        //todo need to write code to validate the split with amount
    }
}
