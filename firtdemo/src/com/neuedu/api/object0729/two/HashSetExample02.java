package com.neuedu.api.object0729.two;

import java.util.HashSet;

public class HashSetExample02 {
    public static void main(String[] args) {
        HashSet<Student> students=new HashSet<>();
        Student student1=new Student();
        student1.setName("tom");
        student1.setSex("m");
        student1.setAge(22);

        students.add(student1);

        Student student2=new Student();
        student2.setName("lili");
        student2.setSex("w");
        student2.setAge(21);

        students.add(student2);
        Student student3=new Student();
        student3.setName("jasper");
        student3.setSex("m");
        student3.setAge(18);

        students.add(student3);
        System.out.println("原数据：");
        System.out.println(students);

        // 删除元素

        students.remove(student1);
        System.out.println("删除之后的数据：");
        System.out.println(students);

        //判断student2对象是否在集合中，注意是整条记录进行判断的
        boolean flag=students.contains(student2);
        System.out.println("判断是否包含student2对象：");
        System.out.println(flag);

    }
}
