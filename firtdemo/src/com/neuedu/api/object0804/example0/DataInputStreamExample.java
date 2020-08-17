package com.neuedu.api.object0804.example0;

import java.io.*;

public class DataInputStreamExample {
    /**
     * 读取，输入
     * @param args
     */
    public static void main(String[] args) {
        File file=new File("test03.txt");
        if(!file.exists()){
            System.out.println("文件不存在，不能进行读取");
            return;
        }

        // 字节输入流
        FileInputStream fis=null;
 // 数据输入流
        DataInputStream dis=null;

        try {
            fis=new FileInputStream(file);
            dis=new DataInputStream(fis);

            int i = dis.readInt();
            String s = dis.readUTF();
            double v = dis.readDouble();
            System.out.println(i);
            System.out.println(s);
            System.out.println(v);

            dis.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
