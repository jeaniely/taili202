package com.neuedu.array;

import java.util.Random;

public class ArrayExample_03 {
    /**
     * 二维数组的赋值和输出
     * @param args
     */
    public static void main(String[] args) {
        int[][] array=new int[4][4];

        Random random=new Random();
       /* System.out.println(array[0].length);*/// 12   3   4
        for(int i=0;i<array.length;i++){//提取每行
            for(int j=0;j<array[i].length;j++){//每行中的列
                if(i<=j){
                    array[i][j] = random.nextInt(100);
                }
            }
        }

        for(int i=0;i<array.length;i++){//提取每行
            for(int j=0;j<array[i].length;j++){//每行中的列
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
