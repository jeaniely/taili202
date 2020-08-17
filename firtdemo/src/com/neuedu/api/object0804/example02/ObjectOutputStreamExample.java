package com.neuedu.api.object0804.example02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        /**
         * 1 定义输入文件
         *
         * 2 字节输出流
         *
         * 3 对象输出流
         *
         * 4. 将对象写入文件
         *
         * 5. 关闭
         */

        File file=new File("test04.txt");
        if(!file.exists()){
            file.createNewFile();
        }


        FileOutputStream fos=null;
        ObjectOutputStream oos=null;

        fos=new FileOutputStream(file);

        oos=new ObjectOutputStream(fos);

        Student student=new Student("zhang",45,new BigDecimal("456.8"));
        Student student2=new Student("li",45,new BigDecimal("456.8"));
        oos.writeObject(student);
        oos.writeObject(student2);

        oos.flush();

        oos.close();
        fos.close();



    }
}
