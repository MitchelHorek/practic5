package com.company;

public class MultiThread {
    private static volatile MultiThread instance;

    public String value;

    private MultiThread(String value) {
        this.value = value;
    }

    public static MultiThread getInstance(String value) {
        MultiThread result = instance;
        if (result != null) {
            return result;
        }
        synchronized(MultiThread.class) {
            if (instance == null) {
                instance = new MultiThread(value);
            }
            return instance;
        }
    }
}

