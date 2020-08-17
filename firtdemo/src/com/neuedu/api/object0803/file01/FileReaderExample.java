package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    //使用字符流进行读
    public static void main(String[] args) {
        File file =new File("test02.txt");

      if(!file.exists()){
          System.out.println("文件不存在不能进行读！");
          return;
      }

        FileReader reader=null;

        try {
            reader=new FileReader(file);
           /*
            System.out.println((char)ch);*/
            int ch= reader.read();
           while (ch!=-1){
               System.out.print((char)ch);
               ch=reader.read();
           }


            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
