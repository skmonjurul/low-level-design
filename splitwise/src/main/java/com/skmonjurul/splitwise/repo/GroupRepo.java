package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.model.Group;

import java.util.HashMap;
import java.util.Map;

public class GroupRepo {
    private static Map<String, Group> groupMap = new HashMap<>();

    public void save(Group group) {
        groupMap.put(group.getId(), group);
    }

    public Group findById(String groupId) {
        if (!groupMap.containsKey(groupId)) {
            //todo throw exception
        }

        return groupMap.get(groupId);
    }
}
