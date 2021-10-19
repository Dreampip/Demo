package com.Computer;
//            设计一个键盘类，实现InsertDrawable接口，并实现方法。
public class Keyboard implements InsertDrawable{
    //插槽方法
    public void slot() {
        System.out.println("插上了键盘");
        System.out.println("拔下了键盘");
    }
}
