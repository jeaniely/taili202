package com.neuedu.inner.seven;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        InnerClass inner=outer.getInnerClass(3,"zhang");
        System.out.println(inner.getNumber());
    }
}
