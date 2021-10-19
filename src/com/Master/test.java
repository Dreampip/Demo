package com.Master;
//        编写测试程序：
//                创建主人对象
//                创建各种宠物对象
//                调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
public class test {
    public static void main(String[] args) {
        //向上转型
        Master m = new Master("张三");
//        Pet mm = new YingWu("张三");

        m.feed(new YingWu("李四"));
        m.feed(new Cat());
        m.feed(new Dog());

        //向下转型
//        Master m = new Master();
//        Pet yw = new YingWu();
//        Pet cat = new Cat();
//        Pet dog = new Dog();
//        YingWu y = (YingWu)yw;
//        Cat c =(Cat)cat;
//        Dog d = (Dog)dog;
//        m.feed(y);
//        m.feed(c);
//        m.feed(d);
    }
}
