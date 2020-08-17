package com.neuedu.api.object0805.thread03;

public class Single {
    private Single(){
        System.out.println("创建一个Single实例");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };
    private static Single instance;
    public static Single getInstance(){
        if(instance==null){
            synchronized (Single.class) {
                if(instance==null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }

}
