package com.neuedu.objectexample.first;

public class Players {
    private static int sum;
    private Players(){
        System.out.println("创建一个对象");
    }

    public static Players create(){
        for(;sum<11;sum++) {
             new Players();
        }
        return null;
    }
}
