package com.neuedu.api.object.three;

public class StringExample {
    /**
     * 1；字符串类
     *    不可变字符串类：String:   private final char value[];
     *                  不能被继承：final修饰类
     *    可变字符串类：StringBuffer                  StringBuilder
     *          开始版本：  1.0                            1.5
     *          线程安全性：线程安全（多线程处理）    线程不安全（单线程处理）
     *          性能：         低                      性能高
     *
     *
     *  2：案例1：电话号码：125-3306-8977  提取，并合并  12533068977
     *
     *     案例2：截取"http://www.baidu.com/list.do"路径中的"list.do"
     *
     */
    public static void main(String[] args) {
        String str=new String("hello");
        String str2=new String("hello");
        System.out.println(str==str2);

        String str3="hello";
        String str4="hello";
        System.out.println(str3==str4);

        System.out.println(str.equals(str2));
        System.out.println(str3.equals(str4));

    }
}
