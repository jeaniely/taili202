package com.neuedu.objectexample.six;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Garderer {
    public static Fruit create(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入苹果，香蕉，或葡萄");
        String name=scanner.next();
        if(name.equals("苹果")){
            return new Apple();
        }else if(name.equals("香蕉")){
            return new Banana();
        }else if(name.equals("葡萄")){
            return new Grape();
        }else{
            return null;
        }

    }
}
