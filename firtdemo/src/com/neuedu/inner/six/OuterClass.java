package com.neuedu.inner.six;

public class OuterClass {
    public InnerClass getInnerClass(final  int num,String str){
        return new InnerClass() {
            @Override
            public int getNumber() {
                return num+3;
            }
        };/*直接实例化，需要重写方法*/
    }

}


interface  InnerClass{
    int getNumber();
}
