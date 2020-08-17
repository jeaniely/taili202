package com.neuedu.objectexample.three;

public class SimpleFactory {
    public static Product creat(String type){
        if(type.equals("A")){
            return new ProductA();
        }else if(type.equals("B")){
            return new ProductB();
        }else {
            return null;
        }
    }
}
