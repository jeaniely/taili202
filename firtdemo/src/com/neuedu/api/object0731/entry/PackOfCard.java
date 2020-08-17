package com.neuedu.api.object0731.entry;

import java.util.ArrayList;
import java.util.List;

public class PackOfCard {
   private  List<Card> packOfCardList;

    /**
     * 直接生成一副牌的构造器
     */
    public PackOfCard(){
        this.packOfCardList=getPackOfCard();
    }

    private List<Card> getPackOfCard(){
        String[] suids={"红桃","黑桃","方片","梅花"};
        String[] faces={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<Card> cardlist=new ArrayList<>();
        for(int i=0;i<suids.length;i++){
            for(int j=0;j<faces.length;j++){
                Card card=new Card(suids[i],faces[j]);
                cardlist.add(card);
            }
        }

        return cardlist;

    }


    public List<Card> getPackOfCardList(){
        return packOfCardList;
    }


}
