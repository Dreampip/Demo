package com.text;

public class test6{

    // 私有方法
    private void doSome(){
        System.out.println("OverrideTest06's private method doSome execute!");
    }

    // 入口
    public static void main(String[] args){
        // 多态
        test6 ot = new T();
        ot.doSome(); //OverrideTest06's private method doSome execute!
    }
}

// 子类
class T extends test6{
    // 尝试重写父类中的doSome()方法
    // 访问权限不能更低，可以更高。
    public void doSome(){
        System.out.println("T's public doSome method execute!");
    }
}