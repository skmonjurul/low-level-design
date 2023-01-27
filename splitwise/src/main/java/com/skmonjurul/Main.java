package com.skmonjurul;

import com.skmonjurul.splitwise.factory.expense.ExpenseFactory;
import com.skmonjurul.splitwise.model.*;
import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.service.*;

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


        ExpenseFactory equalExpenseFactory = expenseFactoryService.createExpenseFactory(SplitType.EQUAL);
        Expense equalExpense = equalExpenseFactory.getExpense("e1", "Grocery", 150, user,
                null);

        BalanceService.updateBalance(equalExpense);
        expenseService.save(equalExpense);
        System.out.println(expenseService.findExpense("e1"));


        ExpenseFactory unequallyExpenseFactory = expenseFactoryService.createExpenseFactory(SplitType.UNEQUALLY);
        Expense unequalExpense = unequallyExpenseFactory.getExpense("e2", "Dinner", 1150, user1,
                null);

        BalanceService.updateBalance(unequalExpense);
        expenseService.save(unequalExpense);
        System.out.println(expenseService.findExpense("e2"));


        ExpenseFactory percentageExpenseFactory = expenseFactoryService.createExpenseFactory(SplitType.PERCENTAGE);
        Expense percentageExpense = percentageExpenseFactory.getExpense("e3", "Launch", 560, user,
                null);

        BalanceService.updateBalance(percentageExpense);
        expenseService.save(percentageExpense);
        System.out.println(expenseService.findExpense("e3"));
    }
}