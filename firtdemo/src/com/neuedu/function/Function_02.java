package com.neuedu.function;


import java.util.Scanner;

public class Function_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入年份：");
        int year=scanner.nextInt();

       YearFuncton yearFuncton= new YearFuncton();
      int flag= yearFuncton.fun(year);

      if(flag==1){
          System.out.println("是闰年");
      }else{
          System.out.println("是平年");
      }


    }
}
/*
* 输入一个年，判断这年是闰年还是平年  --- 使用方法
* 1） 方法的设置
*      当返回1是闰年，当返回0，平年
*      int fun （int year）
* 2）如何判断
*    四年以润，百年不润
*    四百年一润
*
*    year%4==0&& year%100！=0  ||  year%400==0
*
* */

class YearFuncton{
    int fun(int year){
        int flag=0;
        if(year%4==0&& year%100!=0 || year%400==0){
            flag=1;
        }
        return flag;
    }
}
