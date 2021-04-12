package com.company;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    public String value;
    private EagerSingleton(){
        value = "000000";
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
