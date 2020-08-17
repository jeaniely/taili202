package com.neuedu.api.object0803.file01;

import java.io.File;

public class FileExample02 {
    public static void main(String[] args) {
        File file=new File("dir");
        if(file.isDirectory()){
            System.out.println("是目录");
            File[] files = file.listFiles();//提取文件
            for(File f:files){
                System.out.println("文件名："+f.getName()+" 绝对路径："+f.getAbsolutePath()+"文件大小："+f.length());
            }
        }else if(file.isFile()){
            System.out.println("是文件");
        }
        System.out.println("结束");
    }
}
