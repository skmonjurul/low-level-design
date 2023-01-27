package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.EqualExpense;
import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.model.SplitType;

public class EqualExpenseFactory extends ExpenseFactory{

    @Override
    protected Expense createExpense() {
        return new EqualExpense(SplitType.EQUAL);
    }
}
