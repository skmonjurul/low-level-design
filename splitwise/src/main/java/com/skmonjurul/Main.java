package com.skmonjurul;

import com.skmonjurul.splitwise.factory.ExpenseFactory;
import com.skmonjurul.splitwise.model.*;
import com.skmonjurul.splitwise.service.ExpenseFactoryService;
import com.skmonjurul.splitwise.service.ExpenseService;
import com.skmonjurul.splitwise.service.GroupService;
import com.skmonjurul.splitwise.service.UserService;

public class Main {

    private static UserService userService;
    private static GroupService groupService;

    private static ExpenseService expenseService;
    private static ExpenseFactoryService expenseFactoryService;


    public static void init() {
        userService = new UserService();
        groupService = new GroupService();
        expenseService = new ExpenseService();
        expenseFactoryService = new ExpenseFactoryService();
    }
    public static void main(String[] args) {
        init();
        User user = new User("u1", "Sk Monjurul Haque", "9609696421",
                "monjurulhaque2011@gmail.com");

        User user1 = new User("U2", "Sampath", "7076924582", "sampath.kumar@gmail.com");

        userService.save(user);
        userService.save(user1);

        Group group = new Group("g1", "Room 108", user);
        groupService.save(group);
        groupService.addUser("g1", user1);

        System.out.println(group.getId());
        System.out.println(group.getName());
        group.getAllUsers()
                .forEach(System.out::println);


        ExpenseFactory expenseFactory = expenseFactoryService.createExpenseFactory(SplitType.EQUAL);
        Expense expense = expenseFactory.createAndValidateExpense();
        expense.setId("e1");
        expense.setAmount(150);
        expense.setDescription("Grocery");
        expense.setPaidBy(user);
        expense.setSplitList(null);
        expense.validate();


        expenseService.save(expense);
        System.out.println(expenseService.findExpense("e1"));
    }
}