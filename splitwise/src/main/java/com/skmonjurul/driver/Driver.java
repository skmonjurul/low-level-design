package com.skmonjurul.driver;

public interface Driver<T, K> {
    void save(K k, T t);
    T findById(K k);
}
