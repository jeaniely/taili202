package com.neuedu.exception.three;

/**
 * 定义了一个自己的异常类
 */
public class MyException01 extends RuntimeException {
    private String massage;
    public MyException01(){}
    public MyException01(String massage){
        super(massage);
        this.massage=massage;
    }

   /* public MyException01(String massage){
        this.massage=massage;
    }*/

    /*alt+insert*/
    public String getMassage() {
        return massage;
    }

}
