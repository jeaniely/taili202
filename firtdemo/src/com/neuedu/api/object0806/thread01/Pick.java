package com.neuedu.api.object0806.thread01;

public class Pick implements Runnable {
    private Object obj;
    private Integer ticker;
    public Pick(Object obj,Integer ticker){
        this.obj=obj;
        this.ticker=ticker;
    }

    /**
     * 使用synchronized 定义方法
     *    1) 方法同步
     *    2) 代码块同步
     */
/*    @Override
    public synchronized void run() {
        while(true) {

                    if (ticker > 0) {
                        System.out.println("购买的票为：" + ticker);
                        ticker--;
                    } else {
                        System.out.println("票已经买完！");
                        break;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    }
    }*/
    @Override
    public  void run() {
        while(true) {
            if(ticker>0) {
                synchronized (obj) {
                    if (ticker > 0) {
                        System.out.println("购买的票为：" + ticker+" 出票窗口为："+Thread.currentThread().getName());
                        ticker--;
                    } else {
                        System.out.println("票已经买完！");
                        break;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                System.out.println("票已经买完！");
                break;
            }


        }
    }
}
