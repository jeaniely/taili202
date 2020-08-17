package com.neuedu.array;

import java.util.Random;

public class ArrayExample_01 {
    public static void main(String[] args) {
        int[] array=new int[10];
     /*   array[0]=23;*/
        /*通过随机数赋值*/
        Random random=new Random();

        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }
        /*输出数组*/
        System.out.println("输出数组");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println("\n========================");
        for(int a:array){
            System.out.print(a+"  ");
        }
    }
}
