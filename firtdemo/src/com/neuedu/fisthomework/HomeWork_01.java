package com.neuedu.fisthomework;

public class HomeWork_01 {
    /**
     * 1:数组初始化
     * 2：for
     * 3：for 双重循环的使用
     * 4：if
     * @param args
     */
    public static void main(String[] args) {
        int[] array={78,56,45,8,99,5};
        /*1)外循环：计算趟数*/

        for(int i=0;i<array.length-1;i++){
            /*2) 内循环 ；比较出*/
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    /*a:第三个参数*/
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    /*b:
                    *  a=3; b=4;
                    *           a   b
                    *   a=a+b;  7    4
                    *   b=a-b;  7     3
                    *   a=a-b;  4     3
                    *
                    * */
                }
            }
        }

        for(int a:array){
            System.out.print(a+"   ");
        }

    }
    /**
     * 1:冒泡排序 从小到大
     *   78 56 45 8 99 5  6个数值要进行5趟
     * 第一趟： 56 45  8 78 5  99
     * 第二趟： 45  8  56  5 78 99
     * 第三趟： 8 45  5  56  78  99
     * 第四趟： 8 5 45   56  78  99
     * 第五趟： 5 8 45  56  78  99
     *
     */
}
