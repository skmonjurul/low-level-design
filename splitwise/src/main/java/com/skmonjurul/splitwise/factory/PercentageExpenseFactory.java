package com.skmonjurul.splitwise.factory;

import com.skmonjurul.splitwise.model.Expense;
import com.skmonjurul.splitwise.model.PercentageExpense;
import com.skmonjurul.splitwise.model.SplitType;

public class PercentageExpenseFactory extends ExpenseFactory{
    @Override
    protected Expense createExpense() {
        return new PercentageExpense(SplitType.PERCENTAGE);
    }
}