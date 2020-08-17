package com.neuedu.exception.one;

public class ExceptionExample01 {
    /*Exception:这是异常类，建议其文件名是不能使用这个名字*/
    public static void main(String[] args) {

        int[] array=new int[5];
      /*捕获处理
      *
      * try{
      *     可能发生异常的代码
      * }catch(可能异常类定义的参数){
      *     异常的处理
      * }
      *
      * 捕获异常之后，后面正常执行
      *
      *
      *
      * */
        try {
            array[5] = 34;
        }catch (Exception e){
            e.printStackTrace();
            /*System.out.println(e.getStackTrace());*/
        }
        /*array[5] = 34;*/
        System.out.println("继续执行");


    }


}
