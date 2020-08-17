package com.neuedu.api.object0727.math;

import java.math.BigDecimal;
import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        //Math中函数的使用
        //圆的面积
        double r=10;
        double area=Math.PI*Math.pow(r,2);
        System.out.println(area);

       // 随机数
        System.out.println("=========================");
       double random= Math.random();
        System.out.println(random);

        int randomint=(int)(random*100);
        System.out.println(randomint);

        System.out.println("==========================");
        // Random类
        Random random1=new Random();
        System.out.println(random1.nextInt(100));

        System.out.println("====================================");
        //BigDecimal类，用于出来数据库中数据类型为Decimal的数据
        BigDecimal price=new BigDecimal(45.6);
        BigDecimal p=new BigDecimal(12);

        System.out.println(price.add(p));
        System.out.println(price.pow(2));
        System.out.println("===============================");



    }
}
