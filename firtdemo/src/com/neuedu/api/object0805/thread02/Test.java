package com.neuedu.api.object0805.thread02;

public class Test {
    public static void main(String[] args) {
        MyThread myThread= new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();

        for(int i=1;i<=10;i++){
            System.out.println("main:"+i);
        }
    }
}
