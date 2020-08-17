package com.neuedu.exception.five;

public enum  EerrorInfo {
    OK(0,"成功"),
    USERNAME_OR_PASSWOR_ERR(1,"用户名或者密码错误"),
    USER_NOT_LOGIN_ERR(2,"用户没有登录"),
    PRODUCT_INSERT_ERR(11,"商品添加错误");


    private int code;
    private String msg;
   private  EerrorInfo(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
   /* private  EerrorInfo(String msg,int code){
        this.code=code;
        this.msg=msg;
    }*/

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
