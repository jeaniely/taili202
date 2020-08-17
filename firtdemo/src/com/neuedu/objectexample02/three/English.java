package com.neuedu.objectexample02.three;

public class English extends Student {

    private  double speech;

    public English(){}
    public English(String sid,String name,String sex,int age,double finalTerm,double middleTerm,double speech){
        super(sid,name,sex,age,finalTerm,middleTerm);
        this.speech=speech;
    }

    public double getSpeech() {
        return speech;
    }

    public void setSpeech(double speech) {
        this.speech = speech;
    }

    @Override
    public double getScore() {
        return speech*0.5+getFinalTerm()*0.25+getMiddleTerm()*0.25;
    }

    @Override
    public void show() {
        System.out.println(super.toString()+"综合成绩："+getScore());
    }
}
