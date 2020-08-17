package com.neuedu.object.final01;

public class Person {
    private String name;
    final String SEX="女";

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        /*name="kll";*/
        this.name = name;
    }

    /*public final void eat(){
        System.out.println("kkkk");
    }*/
}
