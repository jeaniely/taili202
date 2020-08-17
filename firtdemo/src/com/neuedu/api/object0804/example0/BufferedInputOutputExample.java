package com.neuedu.api.object0804.example0;

import java.io.*;

public class BufferedInputOutputExample {
    /**
     * 图片的复制
     * 将d:/demo中的图片复制到d:/demo/dir中
     * 图片：timg.jfif
     * @param args
     */
    public static void main(String[] args) {
     //1：提取图片
        /**
         * 1） 得到文件
         * 2） 生成字节输入流
         * 3）生成输入缓冲流
         * 4）通过缓冲流得到数据
         */
        File source=new File("D:/demo/timg.jfif");
        if(!source.exists()){
            System.out.println("文件不存，不能进行读取");
            return;
        }

        FileInputStream fis=null;
        BufferedInputStream bis=null;

        try {
            fis=new FileInputStream(source);
            bis=new BufferedInputStream(fis);
           // 读出来
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //2：复制到d:/demo/dir中

        /**
         * 1） 在目录中定义一个新文件，命名和原来一样
         * 2） 生成字节输出流
         * 3）生成输出缓冲流
         * 4）将上面的数据存放到新文件中
         */

        File d=new File("d:/demo/dir",source.getName());
        if(!d.exists()){
            try {
                d.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileOutputStream fos=null;
        BufferedOutputStream bos=null;

        try {
            fos=new FileOutputStream(d);
            bos=new BufferedOutputStream(fos);
            byte[] b=new byte[1024];
            int length = bis.read(b);
            while (length!=-1){
                bos.write(b,0,length);
                length=bis.read(b);
            }
            bos.flush();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 3：关闭

        try {
            bos.close();
            bis.close();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //移动，复制完成之后进行删除，原来文件删除
      /* source.delete();*/



    }

}
