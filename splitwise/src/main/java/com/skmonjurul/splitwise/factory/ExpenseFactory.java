package com.skmonjurul.splitwise.factory;

import com.skmonjurul.splitwise.product.Expense;
import com.skmonjurul.splitwise.model.Split;
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
        expense.setSplitList(splitList);
        expense.validate();
        return expense;
    }

    protected abstract Expense createExpense();
}
