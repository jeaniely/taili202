package com.neuedu.api.object0727.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // Date类
        Date date=new Date(5000);
        System.out.println(date);
        System.out.println("年:"+(date.getYear()+1900));
        System.out.println("月："+date.getMonth());
        System.out.println("============================");
        //
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println("******************************");
        calendar.setTime(date);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println("==========================================");
        /*  ****时间或者日期的字符串转化为时间类型*/
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
           Date date1= sdf.parse("2020-07-27 12:45:25");
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("************************************");
        /*  ****时间类型转为时间或者日期的字符串，进行自定义格式输出*/
       String str= sdf.format(date);
        System.out.println(str);

        System.out.println("===================================");
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df2=DateFormat.getDateInstance();
        /*方法直接调用*/
        System.out.println("=========================================");

        System.out.println(DateToString.getDateByString("2020-07-18 12:45:12"));
        System.out.println(DateToString.getStringByDate(date));

    }
}
