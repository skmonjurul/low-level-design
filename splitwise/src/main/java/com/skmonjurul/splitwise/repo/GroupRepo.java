package com.skmonjurul.splitwise.repo;

import com.skmonjurul.driver.Driver;
import com.skmonjurul.splitwise.model.Group;

public class GroupRepo {
//    private static Map<String, Group> groupMap = new HashMap<>();

    private Driver<Group, String> driver;

    public GroupRepo(Driver<Group, String> driver) {
        this.driver = driver;
    }

    public void save(Group group) {
        driver.save(group.getId(), group);
    }

    public Group findById(String groupId) {
//        if (!groupMap.containsKey(groupId)) {
//            //todo throw exception
//        }
        return driver.findById(groupId);
    }
}
