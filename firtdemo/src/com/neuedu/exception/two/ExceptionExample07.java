package com.neuedu.exception.two;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;

public class ExceptionExample07 {
    /**
     *  如果throw抛出的异常时运行异常，不做处理
     *  如果非运行异常，也就是检查异常，必须做处理
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
       String str=null;
       if(str==null){
           throw  new NullPointerException("字符串不存在");
       }else if(str.equals("123456")){
           throw  new IOException("字符相同");
       }
    }
}
