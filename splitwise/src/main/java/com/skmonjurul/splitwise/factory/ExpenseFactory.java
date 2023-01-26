package com.skmonjurul.splitwise.factory;

import com.skmonjurul.splitwise.model.Expense;
import com.skmonjurul.splitwise.model.SplitType;

public abstract class ExpenseFactory {
    private Expense expense;

    public Expense createAndValidateExpense() {
        expense = createExpense();
        return expense;
    }

    protected abstract Expense createExpense();
}
