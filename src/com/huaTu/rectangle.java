package com.huaTu;
//长方形类
public class rectangle extends Graphics{
    private Double dragon;
    private Double wide;

    public rectangle() {
    }

    public rectangle(Double dragon, Double wide) {
        this.dragon = dragon;
        this.wide = wide;
    }

    public Double getDragon() {
        return dragon;
    }

    public void setDragon(Double dragon) {
        this.dragon = dragon;
    }

    public Double getWide() {
        return wide;
    }

    public void setWide(Double wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "颜色为："+super.getColor()+"  有无填充："+super.isStuff()+"  长为："+getDragon()+"  宽为："+getWide();
    }

    //计算面积
    @Override
    public void area() {
        double s = getDragon()*getWide();
        System.out.println("面积为："+s);
    }

    //获取周长
    @Override
    public void perimeter() {
        double s = getDragon()+getWide();
        System.out.println("周长为："+s);
    }
}
