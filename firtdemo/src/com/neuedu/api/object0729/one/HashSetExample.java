package com.neuedu.api.object0729.one;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("zhang");
        hashSet.add("tom");
        hashSet.add("student");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println("========================");
       for(Object obj:hashSet){
           System.out.println(obj);
       }
        System.out.println("=========================");
       Iterator iterator=hashSet.iterator();
       while(iterator.hasNext()){
           Object obj=iterator.next();
           System.out.println(obj);
       }
    }
}
