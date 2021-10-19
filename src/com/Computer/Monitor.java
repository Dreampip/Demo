package com.Computer;
//            设计一个显示器类，实现InsertDrawable接口，并实现方法。
public class Monitor implements InsertDrawable{
    //插槽方法
    public void slot() {
        System.out.println("插上了显示器");
        System.out.println("拔下了显示器");
    }
}
