package com.neuedu.api.object0728.one;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample01 {
    public static void main(String[] args) {
        ArrayList<Student> studentList=new ArrayList<>();

        Student student1=new Student();
        student1.setName("tom");
        student1.setAge(21);
        student1.setSex("m");

        studentList.add(student1);

        Student student2=new Student();
        student2.setName("lili");
        student2.setAge(21);
        student2.setSex("w");

        studentList.add(student2);

        Student student3=new Student();
        student3.setName("jasper");
        student3.setAge(18);
        student3.setSex("m");

        studentList.add(student3);

        studentList.add(student3);

        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        System.out.println("=============================");
        for(Student s:studentList){
            System.out.println(s);
        }
        System.out.println("=================================");
        Iterator<Student> iterator=studentList.iterator();
         while(iterator.hasNext()){
             Student s=iterator.next();
             System.out.println(s);
         }

    }
}
