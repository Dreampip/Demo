package com.Cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(3.0,2.0,"红色");
        System.out.println(c.area());
        c.volume();
        c.setColor("粉色");
        System.out.println(c);
    }
}
