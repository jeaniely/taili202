package com.neuedu.object.three;

public class Test {
    /**
     * 继承：一个类实现另一类的所有的所有的属性和方法，
     *       其中另一类是父类，超类
     *       一个类：子类
     *       子类还有自己独有的属性和方法
     *
     *       目的：代码重用
     *
     *
     *
     *  限定修饰符：
     *  private：当前类中使用
     *  默认：本类、本包使用
     *  protected：本类、本包、不同包的子类中使用
     *  public：都可以使用
     *
     * 修饰类：默认，public
     * 修饰方法/变量：是private、默认、protected、public
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("lisi");
        student.setScore(98);
        student.height=190;
        student.sex="女";
        System.out.println(student.getName()+" "+student.getScore());

        Person person=new Person();
        person.setName("father");
        person.height=180;
        person.sex="男";

    }
}
