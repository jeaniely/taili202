package com.neuedu.api.object0729.four;


import java.util.Comparator;

public class MyComparor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
