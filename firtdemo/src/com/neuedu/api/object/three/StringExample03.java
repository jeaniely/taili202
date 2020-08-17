package com.neuedu.api.object.three;

public class StringExample03 {
    public static void main(String[] args) {
        /*
         * 截取"http://www.baidu.com/list.do"路径中的"list"
         */
        String str="http://www.baidu.com/list.do";

        int firstindex=str.lastIndexOf("/");
        System.out.println(firstindex);

        int lastindex=str.lastIndexOf(".");
        System.out.println(lastindex);


        String sustr=str.substring(firstindex+1,lastindex);/* [firstindex+1,lastindex)*/
        System.out.println(sustr);


    }
}
