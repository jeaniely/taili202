package com.neuedu.objectexample02.two;

public class Rectangle extends Shape{
    /*
    * •	3.2.1  Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，
    * 重写getPer、getArea和showAll三个方法，
    * 另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
    *
    * */

    private  double width;
    private double height;

    public Rectangle(){}



    public Rectangle(double width,double height,String color){
        super(color);
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(width+height);
    }

    @Override
    public void showAll() {
        System.out.println("长度："+width+",高度："+height+" 颜色："+getColor()+" 面积："+getArea()+" 周长："+getPer());
    }


}
