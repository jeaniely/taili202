package com.neuedu.object.static01;

public class Person {
    private String name;
    private int age;
    private static int num=0;/*静态变量*/
    static {/*一般应用在：jdbc导入数据库驱动，参数的赋值，导入文件等等*/
        System.out.println("hello");
    }
    public Person(){
        num++;
        System.out.println("现在创建了"+num+"对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        eat();
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void eat(){/*静态方法中只能使用静态变量和方法*/

        System.out.println("吃苹果"+"  "+num);
    }


}
