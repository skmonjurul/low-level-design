package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.model.User;
import com.skmonjurul.splitwise.repo.UserRepo;

public class UserService {

    private UserRepo userRepo;

    public UserService() {
        userRepo = new UserRepo();
    }

    public void save(User user) {
        userRepo.save(user);
    }

    public User findUser(String userId) {
        return userRepo.findById(userId);
    }
}
