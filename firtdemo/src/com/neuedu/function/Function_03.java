package com.neuedu.function;

import java.util.ArrayList;

public class Function_03 {
    public static void main(String[] args) {
       /* FunctionOver functionOver=new FunctionOver();
        System.out.println(functionOver.add(45,56));

        System.out.println(functionOver.add(45.23,56.23));*/

        System.out.println(FunctionOver.add(45,56));

        System.out.println(FunctionOver.add(45.23,56.23));
    }
}
/*
* 两个数相加之和
*  数据类型： 两个整数
*             两个double
*             一个整型一个double
* 返回值：int
*         double
* */
class FunctionOver{
   static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }

    static double add(double a,int b){
        return a+b;
    }

    static double add(int a,double b){
        return a+b;
    }

    static double add(double a,double b,int c){
        return a+b+c;
    }

}