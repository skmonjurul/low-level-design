package com.skmonjurul.splitwise.factory.expense;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.model.User;

import java.util.List;

public abstract class ExpenseFactory {
    private Expense expense;

    public Expense getExpense(String id, String description, double amount, User paidBy, List<Split> splitList) {
        expense = createExpense();
        expense.setId(id);
        expense.setDescription(description);
        expense.setAmount(amount);
        expense.setPaidBy(paidBy);
        updateSplitAmount(splitList, amount);
        expense.setSplitList(splitList);
        expense.validate();
        return expense;
    }

    protected abstract Expense createExpense();
    protected abstract void updateSplitAmount(List<Split> splitList, double amount);
}
