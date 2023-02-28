package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.EqualExpense;
import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.strategy.SplitBehaviour;

import java.util.List;

public class EqualExpenseFactory extends ExpenseFactory{

    public EqualExpenseFactory(SplitBehaviour splitBehaviour) {
        this.splitBehaviour = splitBehaviour;
    }

    @Override
    protected Expense createExpense() {
        return new EqualExpense(SplitType.EQUAL);
    }
}
