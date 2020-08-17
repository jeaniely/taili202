package com.neuedu.api.object.three;

public class StringExample01 {
    public static void main(String[] args) {
        /*
        * 电话号码：125-3306-8977  提取，并合并  12533068977
        * 1） 分割，-
        * 2）合并
        * */
        String str="125-3306-8977";

        String[] strs=str.split("-");
        for(String s:strs){
            System.out.println(s);
        }

       StringBuilder stringBuilder=new StringBuilder();
        for(String s:strs){
            stringBuilder.append(s);
        }

        System.out.println(stringBuilder.toString());


    }
}
