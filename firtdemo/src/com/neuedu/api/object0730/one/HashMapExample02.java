package com.neuedu.api.object0730.one;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();

        Student student1=new Student("001","zhang","m",21);
        Student student2=new Student("002","chen","w",19);
        Student student3=new Student("003","li","m",20);

        hashMap.put(student1.getSid(),student1);
        hashMap.put(student2.getSid(),student2);
        hashMap.put(student3.getSid(),student3);
        System.out.println("源数据：");
        for(Map.Entry<String,Student> e:hashMap.entrySet()){
            System.out.println(e.getValue());
        }

        //删除：
        Student deleteStudent=hashMap.remove("004");
        System.out.println("删除的数据："+deleteStudent);
        System.out.println("删除之后的数据：");
        for(Map.Entry<String,Student> e:hashMap.entrySet()){
            System.out.println(e.getValue());
        }
        System.out.println("使用lambda实现输出：");
        hashMap.forEach((k,v)-> System.out.println(k+"  "+v));

    }
}
