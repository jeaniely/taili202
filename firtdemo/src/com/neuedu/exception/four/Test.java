package com.neuedu.exception.four;

public class Test {
    public static void main(String[] args) {
        /**
         * values():调用Color枚举类中所有的枚举值
         */
       /* for(Color c:Color.values()){
            System.out.println(c+"   "+c.ordinal()+"  "+c.toString());
        }*/


       /*CodeName这个枚举类的值*/
        for(CodeName cn:CodeName.values()){
            System.out.println(cn.getCode()+"  "+cn.getName());
        }

        System.out.println("===================================");
        /*CodeName01这个枚举类的值*/

        for(CodeName01 cn:CodeName01.values()){
            System.out.println(cn.getCode()+"   "+cn.getName());
        }
    }
}
