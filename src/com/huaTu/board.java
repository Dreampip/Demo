package com.huaTu;
//        (2)设计实现画板类，要求：
//                ①画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
//                ②画一个绿色、有填充、半径为3.0的圆形；
//                ③画一个黄色、无填充、边长为4.0的正方形；
//                ④分别求三个对象的面积和周长，并将每个对象的所有属性信息打印到控制台。
public class board {
        public static void main(String[] args) {
                Graphics cc = new rectangle();
                rectangle c = (rectangle)cc;
                c.setColor("红色");
                c.setStuff(false);
                c.setDragon(10.0);
                c.setWide(5.0);
                System.out.println(c);
                c.area();
                c.perimeter();
                System.out.println("-------------------");
                Graphics r = new round(3.0);
                r.setColor("绿色");
                r.setStuff(true);
                System.out.println(r);
                r.area();
                r.perimeter();
                System.out.println("-------------------");
                Graphics s = new square(4.0,4.0);
                s.setColor("黄色");
                s.setStuff(false);
                System.out.println(s);
                s.area();
                s.perimeter();
                System.out.println(round.Pi);
        }
}
