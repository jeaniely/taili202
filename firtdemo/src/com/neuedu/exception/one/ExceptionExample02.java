package com.neuedu.exception.one;

public class ExceptionExample02 {
    /**
     * 多个异常的处理
     *
     *   先是子类异常，再写父类异常
     *   如果是并级，不分先后
     * @param args
     */
    public static void main(String[] args) {

        int[] array=new int[5];

        try {
            array[5] = 78;
        }catch ( NullPointerException e){
            System.out.println("NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e){
            System.out.println("RuntimeException");
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
