package com.neuedu.function;

public class Functon_01 {
    public static void main(String[] args) {
       /* Function function=new Function();
        int a=23,b=45;
        int sum=function.add(b,a);
        System.out.println(sum);*/

       int a=23;
       int[] b={12,56,78};
        System.out.println("a:"+a);
        System.out.println("b:");
        for(int k:b){
            System.out.print(k+"\t");
        }

        new Function().fun(a,b);

        System.out.println();
        System.out.println("======================");
       System.out.println("a:"+a);
       System.out.println("b:");// 12 56 78     99 0        99   56  78
        for(int k:b){
            System.out.print(k+"\t");
        }

    }
}

class Function{
    /*两个整数相加返回之和*/

    int add(int a,int b){
        return a+b;
    }

     void fun(int a,int[] b){
        a=33;
        b[0]=22;
       /*  b=new int[2];
         b[0]=99;*/

     }

     void  fun(String str){

     }
}