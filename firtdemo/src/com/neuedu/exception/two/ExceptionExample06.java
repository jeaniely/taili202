package com.neuedu.exception.two;

import java.io.File;
import java.io.IOException;

public class ExceptionExample06 {
    public static void main(String[] args)  throws IOException {
        File file=new File("d:/test.txt");

        if(file.exists()){
            file.delete();
        }else {
            file.createNewFile();
        }
    }
}
