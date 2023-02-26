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

    @Override
    protected void updateSplitAmount(List<Split> splitList, double amount) {
        //todo need to update the split amount in each split
        // we can go by using an Interface also where we will mention this method
        // updateSplitAmount whoever needs to update split amount they can just
        // implement this method as we dont need this method in UnequalExpenseFactory
        int totalSplits = splitList.size();
        double splitAmount = ((double) Math.round(amount * 100 / totalSplits)) / 100.0;
        for (Split split : splitList) {
            split.setAmount(splitAmount);
        }
        splitList.get(0).setAmount(splitAmount + (amount - splitAmount * totalSplits));
    }
}
