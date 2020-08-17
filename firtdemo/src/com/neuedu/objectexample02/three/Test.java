package com.neuedu.objectexample02.three;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[5];
     /*   students[0]=new English("e0001","张三","男",22,89,99,88);
        students[1]=new Computer("c0001","李四","男",22,81,90,88,98);
        students[2]=new English("e0002","王五","女",22,67,77,88);
        students[3]=new Literature("L0002","赵龙","男",22,79,85,88,98);
        students[4]=new English("e0003","丽丽","女",22,60,88,78);
*/
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<students.length;i++){
            System.out.println("第"+(i+1)+"同学信息输入：");
            if(i%2==0){
                Computer computer=new Computer();
                System.out.println("学号");
                computer.setSid(scanner.next());
                System.out.println("姓名");
                computer.setSname(scanner.next());
                System.out.println("性别");
                computer.setSex(scanner.next());
                System.out.println("年龄");
                computer.setAge(scanner.nextInt());
                System.out.println("期末成绩");
                computer.setFinalTerm(scanner.nextDouble());
                System.out.println("期中成绩");
                computer.setMiddleTerm(scanner.nextDouble());
                System.out.println("操作成绩");
                computer.setOperation(scanner.nextDouble());
                System.out.println("英语写作");
                computer.setEnglishwriter(scanner.nextDouble());

                students[i]=computer;
            }else if(i%3==0){
                English computer=new English();
                System.out.println("学号");
                computer.setSid(scanner.next());
                System.out.println("姓名");
                computer.setSname(scanner.next());
                System.out.println("性别");
                computer.setSex(scanner.next());
                System.out.println("年龄");
                computer.setAge(scanner.nextInt());
                System.out.println("期末成绩");
                computer.setFinalTerm(scanner.nextDouble());
                System.out.println("期中成绩");
                computer.setMiddleTerm(scanner.nextDouble());
                System.out.println("演讲成绩");
                computer.setSpeech(scanner.nextDouble());


                students[i]=computer;
            }else{

                Literature computer=new Literature();
                System.out.println("学号");
                computer.setSid(scanner.next());
                System.out.println("姓名");
                computer.setSname(scanner.next());
                System.out.println("性别");
                computer.setSex(scanner.next());
                System.out.println("年龄");
                computer.setAge(scanner.nextInt());
                System.out.println("期末成绩");
                computer.setFinalTerm(scanner.nextDouble());
                System.out.println("期中成绩");
                computer.setMiddleTerm(scanner.nextDouble());
                System.out.println("演讲成绩");
                computer.setSpeech(scanner.nextDouble());
                System.out.println("作品成绩");
                computer.setWorks(scanner.nextDouble());

                students[i]=computer;

            }
        }

        for(Student s:students){
            s.show();
        }
    }
}
