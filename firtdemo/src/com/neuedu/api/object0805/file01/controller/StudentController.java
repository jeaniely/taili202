package com.neuedu.api.object0805.file01.controller;

import com.neuedu.api.object0805.file01.entry.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private StudentController(){}

    static Scanner scanner=new Scanner(System.in);

    /**
     *  添加
     * @param studentList
     */
    public static void addStudent(List<Student> studentList){
        Student student=new Student();
        System.out.println("添加学生信息");
        System.out.println("学生姓名：");
        student.setName(scanner.next());
        System.out.println("年龄：");
        student.setAge(scanner.nextInt());
        System.out.println("性别");
        student.setSex(scanner.next());

        studentList.add(student);
    }

    /**
     * 查找
     * @param studentList
     * @param name
     * @return
     */
    private  static int findStudent(List<Student> studentList,String name){
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    /**
     *   删除
     * @param studentList
     * @param name
     * @return
     */
    public static Student deleteStudent(List<Student> studentList,String name){
        int index=findStudent(studentList,name);
        if(index==-1){
            System.out.println("没有学生信息，不能进行删除");
            return null;
        }else{
            return studentList.remove(index);
        }

    }

    /**
     * 修改
     * @param studentList
     * @param name
     */
    public static void updateStudent(List<Student> studentList,String name){
        int index=findStudent(studentList,name);
        if(index==-1){
            System.out.println("没有学生信息，不能进行修改");

        }else{
            Student student=studentList.get(index);
            System.out.println("年龄修改：");
            student.setAge(scanner.nextInt());

            studentList.set(index,student);
        }

    }

    /**
     * 从文件中提取数据
     *
     * @param pathname  文件路径
     * @return studentList  提取之后，放入List对象中
     */
    public static List<Student> readerFileInformation(String pathname) throws IOException, ClassNotFoundException {
        File file=new File(pathname);
        if(!file.exists()){
            return null;

        }

        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
      List<Student> students=(List<Student>)  ois.readObject();

         ois.close();
         bis.close();
         fis.close();

         return students;
    }

    /**
     *  数据写入文件中
     * @param pathname
     * @param studentList
     * @return
     */
    public static boolean writerFileInformation(String pathname,List<Student> studentList) throws IOException {
        File file=new File(pathname);
        if(!file.exists()){
            file.createNewFile();

        }

        FileOutputStream fos=new FileOutputStream(file);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(studentList);
        oos.flush();

        oos.close();
        bos.close();
        fos.close();
        return true;
    }

    }
