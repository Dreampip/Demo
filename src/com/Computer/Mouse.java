package com.Computer;
//            设计一个鼠标类，实现InsertDrawable接口，并实现方法。
public class Mouse implements InsertDrawable{
    //插槽方法
    public void slot() {
        System.out.println("插上了鼠标");
        System.out.println("拔下了鼠标");
    }
}
