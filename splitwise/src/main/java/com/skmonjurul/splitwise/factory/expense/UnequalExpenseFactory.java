package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.product.expense.UnequalExpense;

public class UnequalExpenseFactory extends ExpenseFactory{

    @Override
    protected Expense createExpense() {
        return new UnequalExpense(SplitType.UNEQUALLY);
    }
}
