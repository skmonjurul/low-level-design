package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    private static Map<String, User> userMap = new HashMap<>();

    public void save(User user) {
        userMap.put(user.getId(), user);
    }

    public User findById(String userId) {
        if (!userMap.containsKey(userId)) {
            //todo throws exception
        }

        return userMap.get(userId);
    }
}
