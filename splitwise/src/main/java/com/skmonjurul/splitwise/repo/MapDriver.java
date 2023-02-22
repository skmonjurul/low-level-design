package com.skmonjurul.splitwise.repo;

import com.skmonjurul.splitwise.model.Base;

import java.util.HashMap;
import java.util.Map;

public class MapDriver<T extends Base> implements Driver<T>{
    Map<String, T> tMap = new HashMap<>();
    @Override
    public void save(T t) {
        tMap.put(t.getId(), t);
    }

    @Override
    public T findById(String id) {
        return tMap.get(id);
    }
}
