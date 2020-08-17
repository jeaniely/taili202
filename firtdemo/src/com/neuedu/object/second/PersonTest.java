package com.neuedu.object.second;

public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("jasper");
        person.setAge(12);
        System.out.println(person.getName()+"   "+person.getAge());
        System.out.println(person);/*对象自动调用toString方法*/

    }
}
