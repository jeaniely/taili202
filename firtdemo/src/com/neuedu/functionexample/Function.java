package com.neuedu.functionexample;

import java.util.Scanner;

public class Function {
    /*
    * 模拟;超市买东西，打印购物小票
    *       XXXXXXX超市
    * --------------------------
    * 商品  数量   单价     合计
    * 水     3      3        9
    * 面包   1      10       10
    * -------------------------
    * 总付款：19
    *
    * 案例分析思路：
    * 1）商品
    *    基本信息
    *     商品名：String[] name;
    *     单价：double[] price;
    *     库存：int[] number;
    * 2)购物车
    *     商品名：String[] cartName
    *      数量:  int[] cartNum
    * 3) 每个商品的合计：double[] namePrices
    *    总付款： sumPrices
    * 4) 打印小票
    *
    *
    *
    *
    *
    *
    *
    *
    * */
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       nemu();
    }

    public static void nemu(){
        String[] name=new String[5];
        double[] price=new double[5];
        int[] number=new int[5];
        String[] cartName=new String[5];
        int[] cartNum=new int[5];
        int num=0;

        for(;;) {
            System.out.println("1:商品添加");
            System.out.println("2:商品显示");
            System.out.println("3:购物车");
            System.out.println("4:打印小票");
            System.out.println("5:退出");
            int n=scanner.nextInt();
            while(n<1||n>5){
                System.out.println("重新输入命令");
                n=scanner.nextInt();
            }

            if(n==1) {
                GoodsCtroller.init(name, number, price);
            }else if(n==2) {
                GoodsCtroller.printGoodsInformation(name, number, price);
            }else if(n==3) {
                num = GoodsCtroller.inputCart(cartName, cartNum);
            }else if(n==4) {
                GoodsCtroller.printCartInformation(name, number, price, cartName, cartNum, num);
            }else if(n==5){
                System.out.println("退出系统");
                break;
            }
        }
    }
}
