package com.skmonjurul.splitwise.repo;

import com.skmonjurul.driver.Driver;
import com.skmonjurul.splitwise.product.expense.Expense;

public class ExpenseRepo {

//    private static Map<String, Expense> expenseMap = new HashMap<>();

    private Driver<Expense, String> driver;

    public ExpenseRepo(Driver<Expense, String> driver) {
        this.driver = driver;
    }
    public void save(Expense expense) {
        driver.save(expense.getId(), expense);
    }


    public Expense findById(String expenseId) {
//        if (!expenseMap.containsKey(expenseId)) {
//            //todo throw exception
//        }
//
        return driver.findById(expenseId);
    }
}
