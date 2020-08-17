package com.neuedu.api.object0804.example02;


import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 文件
        File file=new File("test04.txt");
        if(!file.exists()){
            System.out.println("文件不存在，不能进行读取");
        }

        // 字节输入流
        FileInputStream fis= new FileInputStream(file);


        // 对象输入流
        ObjectInputStream dis=new ObjectInputStream(fis);

        // 对象的提取
       Student student = (Student)dis.readObject();
        Student student2 = (Student)dis.readObject();
        System.out.println(student);
        System.out.println(student2);
        //关闭

        dis.close();
        fis.close();

    }
}
