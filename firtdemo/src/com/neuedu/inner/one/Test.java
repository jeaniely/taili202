package com.neuedu.inner.one;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();/*先定义外部类*/
        OuterClass.InnerClass inner=outer.new InnerClass();/*通过外部类实现内部类的实例化*/
        inner.print();

        OuterClass.InnerClass inner1=new OuterClass().new InnerClass();



    }
}
