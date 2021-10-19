package com.Cylinder;
//（1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
//（2）定义接口B，里面包含抽象方法void setColor(String c)。
//（3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
//（4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
//圆柱体的高height、颜色color。
//（5）创建主类来测试类Cylinder。
public class Cylinder implements C{
    private Double radius;
    private Double height;
    private String color;

    @Override
    public double area() {
        return PI * this.radius * this.radius;
    }

    @Override
    public void volume() {
//        圆柱体体积=底面积×高=πr∧2×h
        double v = area() * this.height;
        System.out.println("体积："+v);
    }

    public Cylinder() {
    }

    public Cylinder(Double radius, Double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
