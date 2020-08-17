package com.neuedu.exception.one;

public class ExceptionExample03 {
    /**
     * 无论发生异常与否，
     * 都要执行一些语句
     * @param args
     */
    public static void main(String[] args) {
        int[] array=new int[5];

        try {
            array[4] = 78;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            System.out.println("执行");
        }



    }
}
