package com.skmonjurul.splitwise.product;

import com.skmonjurul.splitwise.model.SplitType;

public class EqualExpense extends Expense {

    public EqualExpense(SplitType splitType) {
        super(splitType);
    }

    @Override
    public void validate() {
        //todo need to write code to validate the split with amount
    }
}
