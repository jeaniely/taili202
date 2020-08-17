package com.neuedu.inner.two;

public class OuterClass {
    public void display(){
        System.out.println("outerclass.....");
    }

    public class InnerClass{
        public OuterClass getOuterClass(){
            return OuterClass.this;
        }
    }
}
