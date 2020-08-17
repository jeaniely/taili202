package com.neuedu.api.object0729.four;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        //对ArrayList对象进行排序
        ArrayList<Student> arrayList=new ArrayList<>();
        Student student1=new Student();
        student1.setName("tom");
        student1.setSex("m");
        student1.setAge(22);
        Student student2=new Student();
        student2.setName("lili");
        student2.setSex("w");
        student2.setAge(18);
        Student student3=new Student();
        student3.setName("jasper");
        student3.setSex("w");
        student3.setAge(19);
        Student student4=new Student();
        student4.setName("anan");
        student4.setSex("m");
        student4.setAge(21);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        System.out.println("原数据：");
        System.out.println(arrayList);
       /* Collections.sort(arrayList);
        System.out.println("按照姓名排序之后的数据");
        System.out.println(arrayList);*/

        /*Collections.sort(arrayList,new MyComparor());
        System.out.println("按照年龄排序之后的数据");
        System.out.println(arrayList);*/

        Collections.reverse(arrayList);
        System.out.println("反转之后的结果：");
        System.out.println(arrayList);

        arrayList.forEach((e)-> System.out.println(e));
    }
}
