package com.neuedu.api.object0803.file01;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) {
        File file=new File("d:/demo/data.txt");
        if(file.exists()){
            System.out.println("名称"+file.getName());
            System.out.println("路径"+file.getPath());
            System.out.println("绝对路径"+file.getAbsolutePath());
        }

       /* Path path= Paths.get("dir");
        System.out.println(path)*/;
    }
}
