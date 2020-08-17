package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    /**
     * 从文件中取数数据
     * 这个文件是存在的，不能通过创建来实现
     * @param args
     */
    public static void main(String[] args) {
        File file=new File("test");
        if(!file.exists()){
            System.out.println("文件不存，不能提取数据");
            return;
        }

        //文件存在，进行数据提取
        FileInputStream fis=null;

        try {
            fis=new FileInputStream(file);
            int b=fis.read();
            byte[] bytes=new byte[50];
            int length=fis.read(bytes);
            System.out.println("提取的bytes的长度:"+length+" 内容："+new String(bytes,0,length));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
