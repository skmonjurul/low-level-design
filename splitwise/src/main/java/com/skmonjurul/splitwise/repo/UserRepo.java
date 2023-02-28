package com.skmonjurul.splitwise.repo;

import com.skmonjurul.driver.Driver;
import com.skmonjurul.splitwise.model.User;

public class UserRepo {
//    private static Map<String, User> userMap = new HashMap<>();

    private Driver<User, String> driver;

    public UserRepo(Driver<User, String> driver) {
        this.driver = driver;
    }

    public void save(User user) {
        driver.save(user.getId(), user);
    }

    public User findById(String userId) {
//        if (!userMap.containsKey(userId)) {
//            //todo throws exception
//        }
        return driver.findById(userId);
    }
}
