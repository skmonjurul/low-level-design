package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.model.User;
import com.skmonjurul.splitwise.strategy.SplitBehaviour;

import java.util.List;

public abstract class ExpenseFactory {
    private Expense expense;

    protected SplitBehaviour splitBehaviour;

    public Expense getExpense(String id, String description, double amount, User paidBy, List<Split> splitList) {
        expense = createExpense();
        expense.setId(id);
        expense.setDescription(description);
        expense.setAmount(amount);
        expense.setPaidBy(paidBy);
        splitBehaviour.updateSplitAmount(splitList, amount);
        expense.setSplitList(splitList);
        expense.validate();
        return expense;
    }

    protected abstract Expense createExpense();
}
