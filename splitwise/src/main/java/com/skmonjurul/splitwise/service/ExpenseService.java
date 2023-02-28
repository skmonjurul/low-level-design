package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.repo.ExpenseRepo;

public class ExpenseService {
    private ExpenseRepo expenseRepo;

    public ExpenseService(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    public void save(Expense expense) {
        expenseRepo.save(expense);
    }

    public Expense findExpense(String expenseId) {
        return expenseRepo.findById(expenseId);
    }
}
