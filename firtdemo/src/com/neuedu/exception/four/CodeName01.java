package com.neuedu.exception.four;

public enum  CodeName01 {
    OK(200){
        public String getName(){
            return "ok";
        }
    },
    REQUEST_ERROR(404){
        public String getName(){
            return "页面没有找到";
        }
    };

    private int code;

    private CodeName01(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public abstract  String getName();
    public static void main(String[] args) {
        for(CodeName01 cn:CodeName01.values()){
            System.out.println(cn.getCode()+"   "+cn.getName());
        }
    }
}
