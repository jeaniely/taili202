package com.neuedu.objectexample.second;

public class Singleton {

    private static Singleton instance;/*持有自己类型的属性*/
    private Singleton(){}/*类构造器私有*/


    public static Singleton getInstance(){/*对外提供获取实例的静态方法*/
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }

}
