package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.product.Expense;
import com.skmonjurul.splitwise.repo.ExpenseRepo;

public class ExpenseService {
    private ExpenseRepo expenseRepo;

    public ExpenseService() {
        this.expenseRepo = new ExpenseRepo();
    }

    public void save(Expense expense) {
        expenseRepo.save(expense);
    }

    public Expense findExpense(String expenseId) {
        return expenseRepo.findById(expenseId);
    }
}
