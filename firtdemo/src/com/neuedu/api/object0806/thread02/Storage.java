package com.neuedu.api.object0806.thread02;

import java.util.LinkedList;

/**
 *  1：wait、notify、notifyAll 在Object中
 *  2：各自的含义
 *  3：可能的结果：死锁
 *  4: 和同步一起使用
 */
public class Storage {
    private final int MAX_NUMBER=10;
    private LinkedList<String> query=new LinkedList<>();//相当于购买的台子，只能放10个商品

    public void produce(String i){

        synchronized (query) {
           while (query.size()==MAX_NUMBER){
               System.out.println("仓库已满");

               try {
                   query.wait();//等待
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

            System.out.println("生成汉堡：" +i);
            query.add(i);

            query.notifyAll();//唤醒
        }

    }

    public String consumer(){
        synchronized (query) {
            while (query.size()==0){
                System.out.println("仓库已空");

                try {
                    query.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String s = query.getFirst();
            query.remove(s);
            System.out.println("消费："+s);
           query.notifyAll();
            return s;
        }
    }





}
