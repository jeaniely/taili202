package com.neuedu.objectexample.second;

public class Singleton02 {

    private static Singleton02 instance=new Singleton02();

    private Singleton02(){}

    public static Singleton02 getInstance(){
        return  instance;
    }
}
