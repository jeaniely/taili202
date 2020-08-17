package com.neuedu.exception.four;

public enum CodeName {
    OK(200,"ok"),
    REQUEST_ERROR(404,"页面没有找到");

    /*定义成员变量*/
    private int code;
    private String name;
    /*定义有参的构造器*/
    private CodeName(int code,String name){
        this.code=code;
        this.name=name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
