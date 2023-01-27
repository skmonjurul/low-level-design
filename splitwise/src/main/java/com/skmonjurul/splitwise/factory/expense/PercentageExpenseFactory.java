package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.expense.PercentageExpense;
import com.skmonjurul.splitwise.model.SplitType;

public class PercentageExpenseFactory extends ExpenseFactory{
    @Override
    protected Expense createExpense() {
        return new PercentageExpense(SplitType.PERCENTAGE);
    }
}
