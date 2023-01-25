package com.skmonjurul;

import com.skmonjurul.splitwise.model.Group;
import com.skmonjurul.splitwise.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("u1", "Sk Monjurul Haque", "9609696421", "monjurulhaque2011@gmail.com");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getPhoneNumber());
        System.out.println(user.getEmailId());


        Group group = new Group("g1", "Room 108");
        group.addUser(user);

        System.out.println(group.getId());
        System.out.println(group.getName());
        group.getAllUsers()
                .forEach(System.out::println);
    }
}