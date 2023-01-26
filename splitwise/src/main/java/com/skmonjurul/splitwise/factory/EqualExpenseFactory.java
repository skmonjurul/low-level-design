package com.skmonjurul.splitwise.factory;

import com.skmonjurul.splitwise.model.EqualExpense;
import com.skmonjurul.splitwise.model.Expense;
import com.skmonjurul.splitwise.model.SplitType;

public class EqualExpenseFactory extends ExpenseFactory{

    @Override
    protected Expense createExpense() {
        return new EqualExpense(SplitType.EQUAL);
    }
}
