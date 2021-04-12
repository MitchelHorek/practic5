package com.company;

public class Main {

    public static void main(String[] args) {
        //жадная
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
        //ленивая
        LazySingleton singleton = LazySingleton.getInstance("123");
        LazySingleton anotherSingleton = LazySingleton.getInstance("456");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
        //многопоточная
        Thread threadfirst = new Thread(()->{
            MultiThread singletonthread1 = MultiThread.getInstance("1111");
            System.out.println(singletonthread1.value);
        });
        Thread threadsecond = new Thread(()->{
            MultiThread singletonthread2 = MultiThread.getInstance("2222");
            System.out.println(singletonthread2.value);
        });
        threadfirst.start();
        threadsecond.start();
    }


    /*static class ThreadSecond implements Runnable {
        @Override
        public void run() {
            MultiThread singleton = MultiThread.getInstance("2222");
            System.out.println(singleton.value);
        }
    }*/

}
