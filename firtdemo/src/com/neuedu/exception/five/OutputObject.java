package com.neuedu.exception.five;

public class OutputObject<T> {
    private int code;
    private String msg;
    private T data;

    public  OutputObject(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public  OutputObject(int code,T data){
        this.code=code;
        this.data=data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }


}
