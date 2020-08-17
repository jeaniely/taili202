package com.neuedu.api.object0728.three;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Goods> goodsList=new ArrayList<>();
        int n=3;
        GoodsController.addGoods(goodsList,n);
        System.out.println(goodsList);
        String name="铅笔";
       /* int index=GoodsController.getGoodsByName(goodsList,name);
        if(index==-1){
            System.out.println("没有这个商品");
        }else{
            System.out.println(goodsList.get(index));
        }*/

/*       Goods goods=GoodsController.deleteGoodsByName(goodsList,name);
        System.out.println(goods);
        System.out.println(goodsList);*/

     /* GoodsController.updateGoodsByName(goodsList,name);
        System.out.println(goodsList);*/

    /* Goods goods=new Goods();
     goods.setName("铅笔");
     goods.setPrice(new BigDecimal("45"));
     goods.setStock(100);
     int index=GoodsController.getGoods(goodsList,goods);

        System.out.println(index);*/
    }
}
