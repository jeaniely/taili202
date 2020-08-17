package com.neuedu.objectexample.second;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1);
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton2);
    }
}
