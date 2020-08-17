package com.neuedu.exception.five;

public class MyException extends RuntimeException {
    private EerrorInfo errorInfo;
    public MyException(){}
    public MyException(EerrorInfo eerrorInfo){
        this.errorInfo=eerrorInfo;
    }

    public EerrorInfo getErrorInfo() {
        return errorInfo;
    }
}
