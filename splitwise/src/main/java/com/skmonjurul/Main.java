package com.skmonjurul;

import com.skmonjurul.splitwise.factory.expense.ExpenseFactory;
import com.skmonjurul.splitwise.model.*;
import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.split.EqualSplit;
import com.skmonjurul.splitwise.product.split.PercentageSplit;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.product.split.UnequalSplit;
import com.skmonjurul.splitwise.service.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {

    private static UserService userService;
    private static GroupService groupService;
    private static ExpenseService expenseService;
    private static ExpenseFactoryService expenseFactoryService;
    private static BalanceService balanceService;


    public static void init() {
        userService = new UserService();
        groupService = new GroupService();
        expenseService = new ExpenseService();
        expenseFactoryService = new ExpenseFactoryService();
        balanceService = new BalanceService();
    }

    public static List<User> createUser() {
        List<User> userList = Arrays.asList(
        new User("u1", "Sk Monjurul Haque", "9609696421", "monjurulhaque2011@gmail.com"),
        new User("u2", "Sampath", "7076924582", "sampath.kumar@gmail.com"),
        new User("u3", "Haneef Mohamed", "7078926584", "haneef.mohmed@gmail.com"),
        new User("u4", "Arun Kalleda", "7876424889", "arun.kalleda@gmail.com"));

        userList.forEach(user -> userService.save(user));

        return userList;
    }

    public static Group createGroup() {
        List<User> userList = createUser();
        Group group = new Group("g1", "Room 108", userList.get(0));
        groupService.save(group);
        for (int i = 1; i < userList.size(); i++) {
            groupService.addUser(group.getId(), userList.get(i));
        }

        return group;
    }

    public static void show(String[] input) {
        if (input.length == 1) {
            //todo show balance for all user
            balanceService.showBalanceForAllUsers(groupService.findGroup("g1").getAllUsers());
        }
        else {
            String userId = input[1];
            // todo show balance for mentioned user
            balanceService.showBalance(userService.findUser(userId));
        }
    }

    public static void expense(String[] input) {
        int noOfUser = Integer.parseInt(input[3]);
        String expenseType = input[4 + noOfUser];
        switch (expenseType) {
            case "EQUAL":
                equalExpense(input, noOfUser);
                break;
            case "EXACT":
                unequalExpense(input, noOfUser);
                break;
            case "PERCENT":
                percentageExpense(input, noOfUser);
                break;
            default:
        }
    }

    public static void equalExpense(String[] input, int noOfUser) {
        String paidByUserId = input[1];
        double amount = Double.parseDouble(input[2]);

        List<Split> splitList = new ArrayList<>();
        for(int i = 0; i < noOfUser; i++) {
            splitList.add(new EqualSplit(userService.findUser(input[4 + i])));
        }

        ExpenseFactory equalExpenseFactory = expenseFactoryService.createExpenseFactory(SplitType.EQUAL);
        Expense equalExpense = equalExpenseFactory.getExpense("e1", "", amount,
                userService.findUser(paidByUserId), splitList);

        expenseService.save(equalExpense);
        balanceService.updateBalance(equalExpense);
    }

    public static void unequalExpense(String[] input, int noOfUser) {
        String paidByUserId = input[1];
        double amount = Double.parseDouble(input[2]);

        List<Split> splitList = new ArrayList<>();
        for (int i = 0; i < noOfUser; i++) {
            splitList.add(new UnequalSplit(userService.findUser(input[4 + i]),
                    Double.parseDouble(input[5 + noOfUser + i])));
        }

        ExpenseFactory unequallyExpenseFactory = expenseFactoryService.createExpenseFactory(SplitType.UNEQUALLY);
        Expense unequallyExpense = unequallyExpenseFactory.getExpense("e2", "", amount,
                userService.findUser(paidByUserId), splitList);

        expenseService.save(unequallyExpense);
        balanceService.updateBalance(unequallyExpense);

    }

    public static void percentageExpense(String[] input, int noOfUser) {
        String paidByUserId = input[1];
        double amount = Double.parseDouble(input[2]);

        List<Split> splitList = new ArrayList<>();
        for (int i = 0; i < noOfUser; i++) {
            splitList.add(new PercentageSplit(userService.findUser(input[4 + i]),
                    Double.parseDouble(input[5 + noOfUser + i])));
        }

        ExpenseFactory percentageExpenseFactory = expenseFactoryService.createExpenseFactory(SplitType.PERCENTAGE);
        Expense percentageExpense = percentageExpenseFactory.getExpense("e3", "", amount,
                userService.findUser(paidByUserId), splitList);

        expenseService.save(percentageExpense);
        balanceService.updateBalance(percentageExpense);


    }
    public static void main(String[] args) {
        init();

        Group group = createGroup();
        Set<User> userList = group.getAllUsers();

        List<String> inputList = Arrays.asList("SHOW", "SHOW u1", "EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL", "SHOW u4",
                "SHOW u1", "EXPENSE u1 1250 2 u2 u3 EXACT 370 880", "SHOW",
                "EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20", "SHOW u1", "SHOW");

        for (int i = 0; i < inputList.size(); i++) {
                String[] input = inputList.get(i).split(" ");
                String command = input[0];
                switch (command) {
                    case "SHOW":
                        show(input);
                        break;
                    case "EXPENSE":
                        expense(input);
                        break;
                    default:
                        break;
                }
        }

    }
}