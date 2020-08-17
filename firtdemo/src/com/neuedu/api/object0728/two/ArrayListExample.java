package com.neuedu.api.object0728.two;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        * 45，"tom",45.6,2020-07-28
        * */

        ArrayList list=new ArrayList();
        list.add(45);
        list.add("tom");
        list.add(45.6);
        list.add(new Date());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("========================");
        for(Object o:list){
            System.out.println(o);
        }
    }
}
