package com.huaTu;
//子类类圆形类
public class round extends Graphics{
    private Double radius;//圆的半径
    public static final Double Pi = 3.14;//派的值为3.14

    public round(){}

    public round(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "颜色为："+super.getColor()+"  有无填充："+super.isStuff()+"  圆的半径为："+getRadius();
    }

    //计算面积
    @Override
    public void area() {
        double s = Pi*getRadius()*getRadius();
        System.out.println("面积为："+s);
    }

    //获取周长
    @Override
    public void perimeter() {
        double s = 2*Pi*getRadius();
        System.out.println("周长为："+s);
    }
}
