package com.neuedu.api.object0805.thread03;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    Single.getInstance();
                }
            }.start();
        }
    }
}
