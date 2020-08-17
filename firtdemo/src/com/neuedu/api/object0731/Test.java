package com.neuedu.api.object0731;

import com.neuedu.api.object0731.controller.CardController;
import com.neuedu.api.object0731.entry.Card;
import com.neuedu.api.object0731.entry.PackOfCard;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scanner=new Scanner(System.in);
        PackOfCard packOfCard=new PackOfCard();

       while(true) {

           List<Card> list = packOfCard.getPackOfCardList();
           System.out.println("一副牌的生成：");
           /*System.out.println(list);*/
          CardController.print(list);
           //洗牌数据
           CardController.shuffle(list);
           System.out.println("洗牌之后的数据");
          /* CardController.print(list);*/

           //抽取
           Card personCard = null;
           //人抽取一张牌

           personCard = CardController.getPersonCard(list);
           System.out.println("人选的牌：" + personCard);

           /*CardController.print(list);*/


           Card computerCard = null;
           // 计算机抽取的
           computerCard = CardController.getComputerCard(list);
           System.out.println("计算机随机选取的纸牌：" + computerCard);

          /* CardController.print(list);*/


           int i = CardController.compare(computerCard, personCard);
           if (i == 1) {
               System.out.println("恭喜您赢了");
           } else {
               System.out.println("再接再厉");
           }

           if(list.size()==46){
               System.out.println("只能玩三局，现在结束");
               break;
           }

           System.out.println("是否还玩：y|n");
           char ch=scanner.next().charAt(0);
           if(ch=='n'){
               System.out.println("游戏结束");
               break;
           }

       }
    }
}
