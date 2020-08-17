package com.neuedu.api.object0805.thread02;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("thread:"+i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
