package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.product.expense.UnequalExpense;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.strategy.SplitBehaviour;

import java.util.List;

public class UnequalExpenseFactory extends ExpenseFactory{

    public UnequalExpenseFactory(SplitBehaviour splitBehaviour) {
        this.splitBehaviour = splitBehaviour;
    }

    @Override
    protected Expense createExpense() {
        return new UnequalExpense(SplitType.UNEQUALLY);
    }
}
