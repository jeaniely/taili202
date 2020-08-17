package com.neuedu.api.object0804.example0;

import java.io.*;

public class DataOutputStreamExample {
    /**
     * Java的基本数据类型的存放操作
     *
     * 写入，输出
     * @param args
     */
    public static void main(String[] args) {

        File file=new File("test03.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 字节输出流
        FileOutputStream fos=null;

        //数据输出流
        DataOutputStream dos=null;
        try {
            fos=new FileOutputStream(file);
            dos=new DataOutputStream(fos);

            dos.writeInt(45);
            dos.writeUTF("hello");
            dos.writeDouble(45.6);
            dos.flush();

            dos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
