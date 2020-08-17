package com.neuedu.api.object0728.four;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        long begin01=new Date().getTime();
        ArrayList arrayList=new ArrayList<>();
        for(int i=0;i<10000000;i++){
            arrayList.add(i);
        }
        long end01=new Date().getTime();
        System.out.println(end01-begin01);

        System.out.println("===========================");
        long begin02=new Date().getTime();
        LinkedList linkedList=new LinkedList();
        for(int i=0;i<1000000;i++){
            linkedList.add(i);
        }
        long end02=new Date().getTime();
        System.out.println(end02-begin02);
    }
}
