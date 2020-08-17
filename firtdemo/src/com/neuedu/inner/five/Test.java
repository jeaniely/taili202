package com.neuedu.inner.five;

public class Test {
    public static void main(String[] args) {
        System.out.println(OuterClass.InnerClass._name);
        OuterClass.InnerClass iner=new OuterClass.InnerClass();
        iner.innerPlay();
    }
}
