package com.Computer;
//            设计一个打印机类，实现InsertDrawable接口，并实现方法。
public class Printer implements InsertDrawable{
    //插槽方法
    public void slot() {
        System.out.println("插上了打印机");
        System.out.println("拔下了打印机");
    }
}
