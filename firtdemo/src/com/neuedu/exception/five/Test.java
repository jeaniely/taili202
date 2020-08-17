package com.neuedu.exception.five;

public class Test {
    /**
     * 1：使用枚举，将错误信息和编号进行汇总
     * 2：自定义异常
     *     选用的继承RuntimeExample
     *      成员变量，采用枚举类定义
     *  3:使用对象进行错误信息的输出
     *  4：最终处理的异常，使用捕获的形式：try-catch-finally
     *
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
/*   用户名或者密码输入有误的时候：*/

        OutputObject output=null;
        /*添加商品的时候出错*/
        try {
            throw new MyException(EerrorInfo.PRODUCT_INSERT_ERR);
        }catch (MyException e){
           /* EerrorInfo ei=e.getErrorInfo();
            System.out.println(ei.getMsg()+"   "+ei.getCode());*/

           /*以对象的形式进行错误信息的输出*/
           output=new OutputObject(e.getErrorInfo().getCode(),e.getErrorInfo().getMsg());

        }


        System.out.println(output.getCode()+"   "+output.getMsg());
    }
}
