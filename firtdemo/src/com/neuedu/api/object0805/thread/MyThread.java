package com.neuedu.api.object0805.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+":"+i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
