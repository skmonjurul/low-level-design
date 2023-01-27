package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.product.expense.UnequalExpense;
import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public class UnequalExpenseFactory extends ExpenseFactory{

    @Override
    protected Expense createExpense() {
        return new UnequalExpense(SplitType.UNEQUALLY);
    }

    @Override
    protected void updateSplitAmount(List<Split> splitList, double amount) {
        // do nothing
        // no need to update as already updated
    }
}
