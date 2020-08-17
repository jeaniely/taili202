package com.neuedu.exception.three;

public class UserMyException01 {

    public static void strCheck(String str) {

        if(str==null){
            throw new MyException01("空字符串");
        }else if("neuedu".equals(str)){
            throw new MyException01("字符串是neuedu");
        }

    }

}
