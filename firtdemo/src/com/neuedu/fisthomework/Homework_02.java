package com.neuedu.fisthomework;

import java.util.ArrayList;

public class Homework_02 {
    /**
     * 1:注释
     *     单行注释//
     *     多行注释
     *     文档注释
     * 2:for
     * 3:for 双重循环
     * 4：break
     * 6：表达式
     * @param args
     */
    public static void main(String[] args) {
        int num=0;
        for(int n=200;n<500;n++){
            boolean flag=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag){
                System.out.print(n+"  ");
                num++;
                if(num%10==0){
                    System.out.println();// System.out.print("\n");
                }
            }

        }

     ArrayList a;
    }
    /*
     * 2:查询200-500之间的素数，并输出，每10个数值一行
     * 1）什么是素数，如何判断一个数是不是素数
     *   能够被1或者本身整除数
     *    2 3 5 7 11 13 17 .。。。
     *
     *    boolean flag=true;
     *    for(int i=2;i<n;i++){
     *        if(n%i==0){
     *            flag=false;
     *            break;
     *        }
     *    }
     *
     * 2) for(int n=200;n<500;n++){
     *
     * }
     *
     * 3) 输出
     * 外循环里面，内循环的外面（结束之后）
     * if(flag){
     *     sout(n);
     * }
     *
     */
}
