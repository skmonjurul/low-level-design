package com.skmonjurul.splitwise.repo;

public interface Driver<T> {
    void save(T t);
    T findById(String id);
}
