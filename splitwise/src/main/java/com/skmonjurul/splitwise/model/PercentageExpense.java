package com.skmonjurul.splitwise.model;

public class PercentageExpense extends Expense{

    public PercentageExpense(SplitType splitType) {
        super(splitType);
    }

    @Override
    public void validate() {
        //todo need to write code to validate the split with amount
    }
}
