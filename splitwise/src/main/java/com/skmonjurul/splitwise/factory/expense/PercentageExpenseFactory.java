package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.expense.PercentageExpense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.product.split.PercentageSplit;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.strategy.SplitBehaviour;

import java.util.List;

public class PercentageExpenseFactory extends ExpenseFactory{

    public PercentageExpenseFactory(SplitBehaviour splitBehaviour) {
        this.splitBehaviour = splitBehaviour;
    }
    @Override
    protected Expense createExpense() {
        return new PercentageExpense(SplitType.PERCENTAGE);
    }
}
