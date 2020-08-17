package com.neuedu.object.second;

public class Person {
    /*封装：保证属性安全
    *        私有化private
    *        调用：通过公共的setter和getter方法
    *        其他形式：1）toString 输出
    *                  2）构造器--赋值
    *
    * */

   private String name;
   private int age;

   public Person(){
       System.out.println("Person()");
   }
   public Person(String name,int age){
       System.out.println(" Person(String name,int age)");
       this.name=name;
       this.age=age;
   }

   /*写*/
   public void setName(String name){
       if(name!=null) {
           this.name = name;
       }
   }
   //读取
   public String getName(){
       return name;
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
