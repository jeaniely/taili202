package com.neuedu.api.object0730.two;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample0 {
    /**
     * Hashtable:
     * 1)线程安全，适合多线程
     * 2）key和value都不能为null
     * @param args
     */
    public static void main(String[] args) {
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put("001","zhang");
        hashtable.put("002","li");
        hashtable.put("003","an");
        hashtable.put("001","ji");
        System.out.println(hashtable);
        System.out.println("=========================");
        for(Map.Entry<String,String> e:hashtable.entrySet()){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
        System.out.println("=======================");
        hashtable.forEach((k,v)-> System.out.println(k+"  "+v));


        String remove = hashtable.remove("002");
        System.out.println(remove);
    }
}
