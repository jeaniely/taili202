package com.neuedu.objectexample02.three;

public class Computer extends Student {
    private double operation;
    private double englishwriter;

    public Computer(){}
    public Computer(String sid,String name,String sex,int age,double finalTerm,double middleTerm,double operation,double englishwriter){
        super(sid,name,sex,age,finalTerm,middleTerm);
        this.operation=operation;
        this.englishwriter=englishwriter;
    }

    public double getOperation() {
        return operation;
    }

    public void setOperation(double operation) {
        this.operation = operation;
    }

    public double getEnglishwriter() {
        return englishwriter;
    }

    public void setEnglishwriter(double englishwriter) {
        this.englishwriter = englishwriter;
    }

    @Override
    public double getScore() {
        return operation*0.4+englishwriter*0.2+getFinalTerm()*0.2+getMiddleTerm()*0.2;
    }

    @Override
    public void show() {
        System.out.println(super.toString()+"综合成绩:"+getScore());
    }
}
