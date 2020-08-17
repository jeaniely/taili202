package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.IOException;

public class FileExample01 {
    public static void main(String[] args) {
        File file=new File("dir/text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("名称："+file.getName());
            System.out.println("路径："+file.getPath());
            System.out.println("绝对路径："+file.getAbsolutePath());
        }else {
            file.delete();
        }
    }
}
