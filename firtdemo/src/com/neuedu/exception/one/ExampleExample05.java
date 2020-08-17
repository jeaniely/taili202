package com.neuedu.exception.one;

public class ExampleExample05 {
    public static void main(String[] args) {
        int[] array=new int[5];

        try {
            array[5] = 78;
            System.exit(0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }finally {
            System.out.println("执行");
        }
        System.out.println("继续执行");
    }
}
