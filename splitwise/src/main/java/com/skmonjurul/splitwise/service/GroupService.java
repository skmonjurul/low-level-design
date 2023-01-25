package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.model.Group;
import com.skmonjurul.splitwise.model.User;
import com.skmonjurul.splitwise.repo.GroupRepo;

public class GroupService {

    private GroupRepo groupRepo;

    public GroupService() {
        groupRepo = new GroupRepo();
    }

    public void save(Group group) {
        groupRepo.save(group);
    }

    public Group findGroup(String groupId) {
        return groupRepo.findById(groupId);
    }

    public void addUser(String groupId, User user) {
        findGroup(groupId).addUser(user);
    }
}
