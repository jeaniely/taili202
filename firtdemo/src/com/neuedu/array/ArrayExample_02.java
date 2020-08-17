package com.neuedu.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample_02 {
    /**
     *  1：有个一个9个数据的数组，
     *    现在插入一个数组，这个数据的位置人为定义的。
     * @param args
     */
    public static void main(String[] args) {
        /*原数组*/
        int[] a=new int[10];
        Random random=new Random();
        for(int i=0;i<a.length-1;i++){
            a[i]=random.nextInt(100);
        }
        System.out.println("插入之前的数组");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+ "   ");
        }
      //插入数据
        Scanner scanner=new Scanner(System.in);
        System.out.println("插入的位置");
        int k=scanner.nextInt();
        System.out.println("插入的值");
        int num=scanner.nextInt();

        if(k<=0||k>a.length){
            System.out.println("插入的位置有误");
        }else {
            for(int last=a.length-2;last>=k-1;last--){
                a[last+1]=a[last];
            }
            a[k-1]=num;
        }


        /*输出插入之后的结果*/
        System.out.println("\n 插入之后的数组");
        for(int i:a){
            System.out.print(i+"  ");
        }

    }
}
