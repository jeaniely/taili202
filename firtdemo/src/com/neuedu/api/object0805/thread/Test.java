package com.neuedu.api.object0805.thread;

public class Test {
    /**
     * 线程的实现：
     *   1）实现线程类Thread类
     *   2) 使用Runnable接口
     */

    public static void main(String[] args) {

        MyThread thread=new MyThread();
        thread.start();

        for(int i=1;i<=10;i++){
            System.out.println("main:"+i);
        }
    }
}
