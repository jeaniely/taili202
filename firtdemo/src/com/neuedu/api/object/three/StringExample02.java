package com.neuedu.api.object.three;

public class StringExample02 {
    public static void main(String[] args) {
       /*
        *截取"http://www.baidu.com/list.do"路径中的"list.do"
        *
        *
        * 截取"http://www.baidu.com/list.do"路径中的"list"
        */
       String str="http://www.baidu.com/list.do";

       int index=str.lastIndexOf("/");
        System.out.println(index);

        String sustr=str.substring(index+1);
        System.out.println(sustr);

    }
}
