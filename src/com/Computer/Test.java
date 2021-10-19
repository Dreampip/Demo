package com.Computer;

import java.util.Arrays;

//            电脑可插拔鼠标、键盘、显示器、打印机等。
//
//            编写测试程序，创建多个对象，演示接口的作用。
public class Test {
    public static void main(String[] args) {
        //实例化对象
        Computer c = new Computer();
        //实现接口
        c.port(new Mouse());
        c.port(new Keyboard());
        c.port(new Monitor());
        c.port(new Printer());
        c.port(new Earphone());
        String[] s = new String[5];
        s[0] = String.valueOf(c);
        System.out.println(Arrays.toString(s));
    }
}
