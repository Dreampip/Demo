package com.Computer;
//	设计一个笔记本电脑类，属性随意，并且进行属性私有化，对外提供公开的set和get方法。
//
//            设计一个可插拔的接口：InsertDrawable，该接口有什么方法自行定义。
//
//            设计一个鼠标类，实现InsertDrawable接口，并实现方法。
//            设计一个键盘类，实现InsertDrawable接口，并实现方法。
//            设计一个显示器类，实现InsertDrawable接口，并实现方法。
//            设计一个打印机类，实现InsertDrawable接口，并实现方法。
//            手动添加一个耳机
//            在“笔记本电脑类”中有一个InsertDrawable接口属性，可以让笔记本
//            电脑可插拔鼠标、键盘、显示器、打印机等。
//
//            编写测试程序，创建多个对象，演示接口的作用。

//	设计一个笔记本电脑类，属性随意，并且进行属性私有化，对外提供公开的set和get方法。
public class Computer {
    private InsertDrawable i;//在“笔记本电脑类”中有一个InsertDrawable接口属性，可以让笔记本电脑可插拔鼠标、键盘、显示器、打印机等。

    //电脑上的一个接口
    public void port(InsertDrawable i){
        i.slot();
    }

    public Computer() {
    }

    public Computer(InsertDrawable i) {
        this.i = i;
        i.slot();
    }

    public InsertDrawable getI() {
        return i;
    }

    public void setI(InsertDrawable i) {
        this.i = i;
    }

}
