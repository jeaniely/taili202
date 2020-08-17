package com.neuedu.inner.six;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
       InnerClass iner=  outer.getInnerClass(3,"zhang");
        System.out.println(iner.getNumber());
    }
}
