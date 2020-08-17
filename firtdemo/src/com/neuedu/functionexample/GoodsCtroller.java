package com.neuedu.functionexample;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class GoodsCtroller {

    private static Scanner scanner=new Scanner(System.in);
    /**
     * 添加商品---数组添加
     * @param name
     * @param number
     * @param price
     */
    public static void init(String[] name,int[] number,double[] price){
        for(int i=0;i<name.length;i++){
            System.out.println("第"+(i+1)+"商品信息的输入");
            System.out.println("商品名：");
            name[i]=scanner.next();
            System.out.println("库存：");
            number[i]=scanner.nextInt();
            System.out.println("单价：");
            price[i]=scanner.nextDouble();
        }
    }

    /**
     * 商品的输出---数组的输出
     * @param name
     * @param number
     * @param price
     */
    public static void printGoodsInformation(String[] name,int[] number,double[] price) {
        System.out.println("商品名\t单价\t库存");
        for(int i=0;i<name.length;i++) {
            System.out.println(name[i]+"\t"+price[i]+"\t"+number[i]);
        }
    }

    /**
     * 购物车
     * @param cartName
     * @param cartNum
     * @return  商品种类
     */
    public static int inputCart(String[] cartName,int[] cartNum ){
        int num=0;
        for(;;){
            System.out.println("第"+(num+1)+"购物商品输入：");
            System.out.println("商品名");
            cartName[num]=scanner.next();
            System.out.println("数量");
            cartNum[num]=scanner.nextInt();

            num++;

            if(num==cartName.length){
                System.out.println("购物车已满");
                break;
            }

            System.out.println("是否继续购买？（1 继续购买，0 不在购买）");

            int k=scanner.nextInt();

            if(k==0){
                System.out.println("不在购买");
                break;
            }


        }

        return num;
    }

    /**
     * 计算每个商品的合计
     * @param name
     * @param number
     * @param price
     * @param cartName
     * @param cartNum
     * @param num
     * @param namePrices
     */
    private static void computerPrice(String[] name,int[] number,double[] price,String[] cartName,int[] cartNum,int num,double[] namePrices){
        for(int i=0;i<num;i++){//购物车
            for(int j=0;j<name.length;j++){
                if(name[j].equals(cartName[i])){
                    number[j]-=cartNum[i];//库存减少
                    namePrices[i]=price[j]*cartNum[i];//每个商品的合计
                }
            }
        }
    }

    /**
     * 总付款
     * @param num
     * @param namePrices
     * @return
     */
    private static double sumPrices(int num,double[] namePrices){
        double sum=0;
        for(int i=0;i<num;i++){
            sum+=namePrices[i];
        }
        return sum;

    }

 public static void printCartInformation(String[] name,int[] number,double[] price,String[] cartName,int[] cartNum,int num){
        double[] namePrices=new double[num];
        computerPrice(name,number,price,cartName,cartNum,num,namePrices);

        double sumPrice=sumPrices(num,namePrices);

     System.out.println("\t七天连锁超市");
     System.out.println("---------------------------");
     System.out.println("商品名\t 数量\t 单价\t 合计");
        for(int i=0;i<num;i++){
            System.out.print(cartName[i]+"\t"+cartNum[i]+"\t");

            for(int j=0;j<name.length;j++){
                if(name[j].equals(cartName[i])){
                    System.out.print(price[j]+"\t");
                    break;
                }
            }
            System.out.println(namePrices[i]);
        }
     System.out.println("---------------------------");
     System.out.println("总付款："+sumPrice);


 }




}
