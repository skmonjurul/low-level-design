package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.model.Group;
import com.skmonjurul.splitwise.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
//    private static Map<String, User> userMap = new HashMap<>();

    private Driver<User> driver;

    public UserRepo() {
        driver = new MapDriver<>();
    }

    public void save(User user) {
//        userMap.put(user.getId(), user);
        driver.save(user);
    }

    public User findById(String userId) {
//        if (!userMap.containsKey(userId)) {
//            //todo throws exception
//        }
//
//        return userMap.get(userId);

        return driver.findById(userId);
    }
}
