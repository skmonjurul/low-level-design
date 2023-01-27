package com.skmonjurul.splitwise.model;

import com.skmonjurul.splitwise.product.expense.Expense;

import java.util.HashSet;
import java.util.Set;

public class Group extends Base{

    private User createdBy;
    private Set<User> userList;
    private Set<Expense> expenseList;

    public Group(String id, String name, User createdBy) {
        super(id, name);
        this.createdBy = createdBy;
        userList = new HashSet<>();
        expenseList = new HashSet<>();
        addUser(createdBy);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public Set<User> getAllUsers() {
        return userList;
    }

    public void deleteUser(User user) {
        if (!userList.contains(user)) {
            //todo throw exception
        }

        userList.remove(user);
        //todo balance need to be settled
    }

    public void addExpense(Expense expense) {
        expenseList.add(expense);
        // todo update balance
    }

    public Set<Expense> getAllExpenses() {
        return expenseList;
    }

    public void editExpense(Expense expense) {
        //todo edit expense
    }
}
