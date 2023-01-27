package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.product.expense.Expense;

import java.util.HashMap;
import java.util.Map;

public class ExpenseRepo {

    private static Map<String, Expense> expenseMap = new HashMap<>();

    public void save(Expense expense) {
        expenseMap.put(expense.getId(), expense);
    }

    public Expense findById(String expenseId) {
        if (!expenseMap.containsKey(expenseId)) {
            //todo throw exception
        }

        return expenseMap.get(expenseId);
    }
}
