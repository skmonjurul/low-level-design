package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.model.Group;
import com.skmonjurul.splitwise.product.expense.Expense;

import java.util.HashMap;
import java.util.Map;

public class GroupRepo {
//    private static Map<String, Group> groupMap = new HashMap<>();

    private Driver<Group, String> driver;

    public GroupRepo() {
        driver = new MapDriver<>();
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
