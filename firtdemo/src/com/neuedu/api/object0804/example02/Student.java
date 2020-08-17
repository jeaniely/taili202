package com.neuedu.api.object0804.example02;

import java.io.Serializable;
import java.math.BigDecimal;


public class Student  implements Serializable {

    private static final long serialVersionUID = -4359483165795396704L;
    private  String sname;
    private Integer age;
    private BigDecimal price;



    public Student(String sname, Integer age, BigDecimal price) {
        this.sname = sname;
        this.age = age;
        this.price = price;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

   public Integer getAge() {
        return age;
    }

   public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
