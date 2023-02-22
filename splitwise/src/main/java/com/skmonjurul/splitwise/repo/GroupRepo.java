package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.model.Group;
import com.skmonjurul.splitwise.product.expense.Expense;

import java.util.HashMap;
import java.util.Map;

public class GroupRepo {
//    private static Map<String, Group> groupMap = new HashMap<>();

    private Driver<Group> driver;

    public GroupRepo() {
        driver = new MapDriver<Group>();
    }

    public void save(Group group) {
//        groupMap.put(group.getId(), group);
        driver.save(group);
    }

    public Group findById(String groupId) {
//        if (!groupMap.containsKey(groupId)) {
//            //todo throw exception
//        }
//
//        return groupMap.get(groupId);

        return driver.findById(groupId);
    }
}
