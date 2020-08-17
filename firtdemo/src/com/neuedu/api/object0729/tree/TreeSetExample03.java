package com.neuedu.api.object0729.tree;

import java.util.TreeSet;

public class TreeSetExample03 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<>(new MyComparor());
        Student student1=new Student();
        student1.setName("tom");
        student1.setSex("m");
        student1.setAge(22);
        Student student2=new Student();
        student2.setName("lili");
        student2.setSex("w");
        student2.setAge(18);
        Student student3=new Student();
        student3.setName("jsaper");
        student3.setSex("w");
        student3.setAge(19);
        Student student4=new Student();
        student4.setName("anan");
        student4.setSex("m");
        student4.setAge(21);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);

        System.out.println(treeSet);

    }
}
