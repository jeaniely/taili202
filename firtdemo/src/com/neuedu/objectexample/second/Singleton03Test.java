package com.neuedu.objectexample.second;

import java.util.ArrayList;

public class Singleton03Test {
    public static void main(String[] args) {
        Singleton03 singleton03=Singleton03.getInstance();
        System.out.println(singleton03);
        Singleton03 singleton05=Singleton03.getInstance();
        System.out.println(singleton05);
        Singleton03 singleton06=Singleton03.getInstance();
        System.out.println(singleton06);


    }

}
