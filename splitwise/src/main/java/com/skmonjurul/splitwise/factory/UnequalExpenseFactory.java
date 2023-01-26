package com.skmonjurul.splitwise.factory;

import com.skmonjurul.splitwise.model.Expense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.model.UnequalExpense;

public class UnequalExpenseFactory extends ExpenseFactory{

    @Override
    protected Expense createExpense() {
        return new UnequalExpense(SplitType.UNEQUALLY);
    }
}
