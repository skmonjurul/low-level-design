package com.skmonjurul.splitwise.product.expense;

import com.skmonjurul.splitwise.model.SplitType;

public class UnequalExpense extends Expense {

    public UnequalExpense(SplitType splitType) {
        super(splitType);
    }

    @Override
    public void validate() {
        //todo need to write code to validate the split with amount
    }
}
