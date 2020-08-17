package com.neuedu.api.object0805.file01;

import com.neuedu.api.object0805.file01.controller.StudentController;
import com.neuedu.api.object0805.file01.entry.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 案例：使用文件存放学生信息，实现学生信息的增加，删除，修改。
     * 分析：
     * 1）学生类： 姓名，年龄，性别
     * 2）保存多个学生信息
     *      首先使用集合进行学生信息的存储
     *      然后将集合对象存储到文件中
     *      选取List
     * 3） 使用方法的形式进行操作
     *     A：从文件中提取数据
     *     B：将数据存放到文件中
     *     C：学生信息的增加
     *     D：学生信息的删除
     *     E：学生信息的修改
     *
     *
     */

    public static void main(String[] args) {

        List<Student> students= null;

       /* students=new ArrayList<>();
        StudentController.addStudent(students);

        try {
            StudentController.writerFileInformation("D:/demo/dir/student.txt",students);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       try {
            students=StudentController.readerFileInformation("D:/demo/dir/student.txt");
            if(students!=null) {
                System.out.println(students);
            }else{
                System.out.println("文件不存在");
            }




        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
