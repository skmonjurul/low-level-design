package com.skmonjurul.splitwise.model;

public abstract class Base {
    protected String id;
    protected String name;

    public Base(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
