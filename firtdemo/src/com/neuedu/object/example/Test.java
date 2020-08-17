package com.neuedu.object.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*一个对象*/
       /* Goods goods=new Goods();
        goods.setName("水");
        goods.setPrice(3);
        goods.setArithmeticalUnit("瓶");
        goods.setStock(400);
        System.out.println(goods);*/

        /*数组对象*/
        Goods[] goodsarray=new Goods[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<goodsarray.length;i++){
            goodsarray[i]=new Goods();
            System.out.println("输入第"+(i+1)+"件商品的输入：");
            System.out.println("商品名：");
            goodsarray[i].setName(scanner.next());
            System.out.println("单价：");
            goodsarray[i].setPrice(scanner.nextInt());
            System.out.println("单位：");
            goodsarray[i].setArithmeticalUnit(scanner.next());
            System.out.println("库存：");
            goodsarray[i].setStock(scanner.nextInt());



        }

        for(int i=0;i<goodsarray.length;i++){
            System.out.println(goodsarray[i]);
        }

    }
}
