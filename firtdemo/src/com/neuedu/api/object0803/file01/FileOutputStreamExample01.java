package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample01 {
    /**
     * 按照字节流进行文件的写入
     * @param args
     */
    public static void main(String[] args) {
        //保证文件存在
        File file=new File("test");//写入，文件必须存在
        if(!file.exists()){//如果不存在进行创建
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file,true);
            fos.write(12);
            fos.write("hello student".getBytes());
            fos.flush();
            fos.close();//数据流产生之后需要关闭
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
