package com.neuedu.inner.seven;

public class OuterClass {
    public InnerClass getInnerClass(final  int num, String str){
        return ()->num+3;/*接口中只有一个方法*/
    }

}


interface  InnerClass{
    int getNumber();
}
