package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.expense.PercentageExpense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.product.split.PercentageSplit;
import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public class PercentageExpenseFactory extends ExpenseFactory{
    @Override
    protected Expense createExpense() {
        return new PercentageExpense(SplitType.PERCENTAGE);
    }

    @Override
    protected void updateSplitAmount(List<Split> splitList, double amount) {
        for(Split split : splitList) {
            PercentageSplit percentSplit = (PercentageSplit) split;
            split.setAmount((amount * percentSplit.getPercentage()) / 100.0);
        }
    }
}
