package com.neuedu.objectexample.second;

public class Singleton02Test {
    public static void main(String[] args) {
        Singleton02 singleton02=Singleton02.getInstance();
        System.out.println(singleton02);
        Singleton02 singleton03=Singleton02.getInstance();
        System.out.println(singleton03);
        Singleton02 singleton04=Singleton02.getInstance();
        System.out.println(singleton04);
    }
}
