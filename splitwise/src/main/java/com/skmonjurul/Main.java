package com.skmonjurul;

import com.skmonjurul.splitwise.model.*;
import com.skmonjurul.splitwise.service.GroupService;
import com.skmonjurul.splitwise.service.UserService;

public class Main {

    private static UserService userService;
    private static GroupService groupService;


    public static void init() {
        userService = new UserService();
        groupService = new GroupService();
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


        Expense expense = new Expense.ExpenseBuilder()
                .id("e1")
                .description("Grocery")
                .paidBy(user)
                .amount(150)
                .splitType(SplitType.EQUAL)
                .build();

        System.out.println(expense);

    }
}