package com.skmonjurul.parkinglot.driver;

public interface Driver<T, K> {
    void save(T t);
    T findById(K k);
    T findAvailableSpot(K k);
}
