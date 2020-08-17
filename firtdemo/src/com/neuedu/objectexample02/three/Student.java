package com.neuedu.objectexample02.three;

public abstract class Student {
    private  String sid;
    private String sname;
    private String sex;
    private int age;
    private double finalTerm;
    private double middleTerm;
    private double score;

    public Student(){}
    public Student(String sid,String name,String sex,int age,double finalTerm,double middleTerm){
        this.sid=sid;
        this.sname=name;
        this.sex=sex;
        this.age=age;
        this.finalTerm=finalTerm;
        this.middleTerm=middleTerm;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(double finalTerm) {
        this.finalTerm = finalTerm;
    }

    public double getMiddleTerm() {
        return middleTerm;
    }

    public void setMiddleTerm(double middleTerm) {
        this.middleTerm = middleTerm;
    }

    public abstract  double getScore();
    public abstract  void show();

    @Override
    public String toString() {
        return "学号:"+sid+" 姓名："+sname+" 性别："+sex+"年龄"+age;
    }
}
