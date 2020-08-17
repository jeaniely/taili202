package com.neuedu.api.object0803.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Map<String,String> map;
        MyStudent<Integer> int1=new MyStudent<>();
        int1.setData(45);
        System.out.println(int1.getData());

        MyStudent int2=new MyStudent<>();
        int2.setData(78);
        System.out.println(int2.getData());


    }
}
