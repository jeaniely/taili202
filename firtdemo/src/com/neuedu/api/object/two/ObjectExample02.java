package com.neuedu.api.object.two;

public class ObjectExample02 {
    /**
     * byte short int long char boolean float double
     * Byte Short Integer  Long Character Boolean Float Double 包装类
     *
     * 1:在实体类中，常用包装类进行声明成员变量
     *   基本数据类型有默认值，比如int 0 ，再有一些字段中0有特殊的用法，特殊功能，
     *   如何不修改这个字段，采用默认形式，那么默认就是0，这就不符合用户要求，这时候
     *   需要不赋值。
     *   包装类，Integer 默认值null
     *
     *   2:自动装箱，自动拆箱
     *
     *  3:字符串转为成包装类/基本类型
     *
     *
     *
     */

    public static void main(String[] args) {
        int int1=23;
        Integer it=int1;//自动装箱

        int int2=it;//自动拆箱

       // 字符串--》基本类型
        String str="123456";/*保证输入的是数字的字符串*/

        int int3=Integer.parseInt(str);

        // 字符串--》包装类

        Integer it1=new Integer(str);
        Integer it2=Integer.valueOf(str);



    }


}
