package com.neuedu.object.night;

/**
 *  接口
 *  1）抽象方法
 *     public abstract 可省略
 *  2）常量
 *  public static final 可省略
 *  3）static|default
 *     static void cry(){
 *          System.out.println("kkkk");
 *      }
 *      default void jump(){
 *          System.out.println("22222");
 *      }
 *
 *     1.7之前：1，2
 *     1.8：1，2，3
 *
 *
 *    实现：1）implements Person
 *          2）使用抽象类
 *          3）使用接口
 *     接口的实现，使用普通子类实现
 *
 *
 *   作业：抽象类和接口的应用场景
 *
 */
public interface Person {
     /*int MAX=23;*/
     void eat();
     void sleep();

}
