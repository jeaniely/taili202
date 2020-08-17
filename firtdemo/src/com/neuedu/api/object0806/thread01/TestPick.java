package com.neuedu.api.object0806.thread01;

public class TestPick {
    public static void main(String[] args) {
        Pick pick=new Pick(new Object(),20);
        Thread thread1=new Thread(pick,"窗口1");
        Thread thread2=new Thread(pick,"窗口2");
        Thread thread3=new Thread(pick,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
