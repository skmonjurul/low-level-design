package com.skmonjurul.driver;

import com.skmonjurul.driver.Driver;

import java.util.HashMap;
import java.util.Map;

public class MapDriver<T, K> implements Driver<T, K> {
    Map<K, T> tMap = new HashMap<>();
    @Override
    public void save(K k, T t) {
        tMap.put(k, t);
    }

    @Override
    public T findById(K k) {
        return tMap.get(k);
    }
}
