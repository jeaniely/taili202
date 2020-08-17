package com.neuedu.api.object0728.three;

import java.util.List;
import java.util.Scanner;

public class GoodsController {

    static Scanner scanner=new Scanner(System.in);
    /**
     * 单个商品的添加
     * @param goodsList
     */
    public static void addGoods(List<Goods> goodsList){
        Goods goods=new Goods();
        System.out.println("商品名");
        goods.setName(scanner.next());
        System.out.println("单价");
        goods.setPrice(scanner.nextBigDecimal());
        System.out.println("库存");
        goods.setStock(scanner.nextInt());
        goodsList.add(goods);
    }

    /**
     * 多件商品的添加
     * @param goodsList
     * @param n
     */
    public static void  addGoods(List<Goods> goodsList,int n){
        for(int i=0;i<n;i++){
            System.out.println("第"+(i+1)+"件商品的添加：");
            addGoods(goodsList);
        }
    }

    /**
     * 根据名字进行查找，并返回下标
     * @param goodsList
     * @param name
     * @return
     */
    public static int getGoodsByName(List<Goods> goodsList,String name){

        for(int i=0;i<goodsList.size();i++){
            if(goodsList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    /*public static int getGoods(List<Goods> goodsList,Goods goods){

        return goodsList.indexOf(goods);
    }*/
    /**
     * 删除
     * @param goodsList
     * @param name
     * @return
     */
    public static Goods deleteGoodsByName(List<Goods> goodsList,String name){

        int index =getGoodsByName(goodsList,name);
        if(index==-1){
            return  null;
        }else{
            Goods goods=goodsList.get(index);
            goodsList.remove(index);
            return goods;
        }

    }

   public static void updateGoodsByName(List<Goods> goodsList,String name){
       int index =getGoodsByName(goodsList,name);
       if(index==-1){
           System.out.println("不能修改");
       }else{
           Goods goods=goodsList.get(index);
           System.out.println("进行修改");
           System.out.println("修改单价");
           goods.setPrice(scanner.nextBigDecimal());

           goodsList.set(index,goods);

       }
   }

}
