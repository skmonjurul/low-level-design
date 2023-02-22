package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.product.expense.Expense;

import java.util.HashMap;
import java.util.Map;

public class ExpenseRepo {

//    private static Map<String, Expense> expenseMap = new HashMap<>();

    private Driver<Expense> driver;

    public ExpenseRepo() {
        driver = new MapDriver<Expense>();
    }
    public void save(Expense expense) {
//        expenseMap.put(expense.getId(), expense);
        driver.save(expense);
    }


    public Expense findById(String expenseId) {
//        if (!expenseMap.containsKey(expenseId)) {
//            //todo throw exception
//        }
//
//        return expenseMap.get(expenseId);

        return driver.findById(expenseId);
    }
}
