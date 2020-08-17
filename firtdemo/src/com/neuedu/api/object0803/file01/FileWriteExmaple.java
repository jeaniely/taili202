package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExmaple {
    //字符流的操作
    public static void main(String[] args) {
        File file=new File("test02.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileWriter writer=null;

        try {
            writer=new FileWriter(file);
            writer.write("hello java");
            writer.write("hello html".toCharArray());
            writer.flush();

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
