package com.neuedu.api.object0731.controller;

import com.neuedu.api.object0731.entry.Card;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CardController {

    private CardController(){}
    /**
     * 洗牌数据
     * @param cardList
     */
    public static void shuffle(List<Card> cardList){
        Collections.shuffle(cardList);
    }

    /**
     * 人抽取纸牌
     * @param cardList
     * @return
     */
   public  static  Card getPersonCard(List<Card> cardList){
       Scanner scanner=new Scanner(System.in);
       System.out.println("人抽取纸牌：");
       System.out.println("输入1-"+cardList.size()+"的数值：");
       int index=scanner.nextInt();

       while(index<1||index>cardList.size()){
           System.out.println("重新输入：");
           index=scanner.nextInt();
       }

       //提取下标为index-1的牌，list中删除此牌

       /*Card card=cardList.get(index-1);

       cardList.remove(index-1);

       return card;*/
       return cardList.remove(index-1);

   }

    /**
     *  计算机随机抽取
     * @param cardList
     * @return
     */
    public  static Card getComputerCard(List<Card> cardList){
        Random random=new Random();
        //1-51的随机数
        int index=random.nextInt(cardList.size())+1;//0-50--> 1-51

       return cardList.remove(index-1);
}

    /**
     * 输出纸牌
     * @param cardList
     */
    public static void print(List<Card> cardList){
    for(int i=0;i<cardList.size();i++){
        System.out.print(cardList.get(i)+"\t");
        if((i+1)%10==0){
            System.out.println();
        }
    }
        System.out.println();
}

    /**
     * 面值转换成double
     * @param faces
     * @return
     */
    private static double concvert(String faces){
        if("A".equals(faces)){
            return 1;
        }else if("J".equals(faces)||"Q".equals(faces)||"K".equals(faces)){
            return 0.5;
        }else{
            return Double.parseDouble(faces);
        }
    }

    /**
     * 面值比较
     * @param computer
     * @param person
     * @return
     */
    private static  int facesCompare(double computer,double person){
         if(computer>person){
             return -1;
         }else if(computer<person){
             return 1;
         }else{
             return 0;
         }
    }

    /**
     * 花色比较
     * @param computer
     * @param person
     * @return
     */
    private static  int suidsCompare(String computer,String person){
        //面值相等，比较花色：红桃>黑桃>方片>梅花
        if("红桃".equals(computer)&& ("黑桃".equals(person)||"方片".equals(person)||"梅花".equals(person))){
            return -1;
        }else if("黑桃".equals(computer)&& ("方片".equals(person)||"梅花".equals(person))){
            return -1;
        }else if("方片".equals(computer)&& "梅花".equals(person)){
            return -1;
        }else{
            return 1;
        }
    }

    /**
     * 计算机和人的牌的比较
     * @param compute
     * @param person
     * @return
     */
    public static int compare(Card compute,Card person){
        int facecom=facesCompare(concvert(compute.getFace()),concvert(person.getFace()));
        if(facecom==0){
            return suidsCompare(compute.getSuid(),person.getSuid());
        }else{
            return facecom;
        }
    }

}
