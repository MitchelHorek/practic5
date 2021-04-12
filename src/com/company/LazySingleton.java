package com.company;

public final class LazySingleton {
    private static LazySingleton instance;//объект
    public String value;

    private LazySingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static LazySingleton getInstance(String value) {
        if (instance == null) {
            instance = new LazySingleton(value);
        }
        return instance;
    }
}