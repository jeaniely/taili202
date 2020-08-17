package com.neuedu.objectexample02.three;

public class Literature extends Student {
    private double speech;
    private double works;
    public  Literature(){}
    public Literature(String sid,String name,String sex,int age,double finalTerm,double middleTerm,double speech,double works){
        super(sid,name,sex,age,finalTerm,middleTerm);
        this.speech=speech;
        this.works=works;
    }

    public double getSpeech() {
        return speech;
    }

    public void setSpeech(double speech) {
        this.speech = speech;
    }

    public double getWorks() {
        return works;
    }

    public void setWorks(double works) {
        this.works = works;
    }

    @Override
    public double getScore() {
        return speech*0.35+works*0.35+getFinalTerm()*0.15+getMiddleTerm()*0.15;
    }

    @Override
    public void show() {
        System.out.println(super.toString()+" 综合成绩："+getScore());
    }
}
