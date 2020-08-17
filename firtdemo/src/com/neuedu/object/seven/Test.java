package com.neuedu.object.seven;

public class Test {

    public static void main(String[] args) {
        Student student=new Student();
        Person person=student; /*向上转型*/
        person.setName("tom");
        person.eat();
        System.out.println("============================");
        Student student1=(Student)person;/*向下转型，需要强转（）*/
        System.out.println(student1.getName());
        student.eat();
        System.out.println("============================");
        /*转换类型不清楚
        * */
        /*Person person1=new Person();
        Teacher teacher=(Teacher) person1;
        teacher.eat();*/
/*
*  instanceof 判断对象是否类的实例化对象
*             true|false
* 格式：对象  instanceof  类
* */
        System.out.println("student对象是否是Person的实例化对象");
        if(student instanceof Person){
            System.out.println("是");
        }else{
            System.out.println("否");
        }
        System.out.println("student对象是否是Student的实例化对象");
        if(student instanceof Student){
            System.out.println("是");
        }else{
            System.out.println("否");
        }
        System.out.println("person对象是否是Student的实例化对象");
        if(person instanceof Student){
            System.out.println("是");
        }else{
            System.out.println("否");
        }
        System.out.println("person对象是否是Person的实例化对象");
        if(person instanceof Person){
            System.out.println("是");
        }else{
            System.out.println("否");
        }

        Person person1=new Person();
        System.out.println("person1对象是否是Student的实例化对象");
        if(person1 instanceof Student){
            System.out.println("是");
        }else{
            System.out.println("否");
        }
        System.out.println("person1对象是否是Person的实例化对象");
        if(person1 instanceof Person){
            System.out.println("是");
        }else{
            System.out.println("否");
        }


    }
}
