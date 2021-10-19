package com.Master;

/*编写程序模拟“主人”喂养“宠物”的场景：
        提示1：
        主人类：Master
        宠物类：Pet
        宠物类子类：Dog、Cat、YingWu
        提示2：
        主人应该有喂养的方法：feed()
        宠物应该有吃的方法：eat()
        只要主人喂宠物，宠物就吃。

        要求：主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。

        编写测试程序：
        创建主人对象
        创建各种宠物对象
        调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。

        通过该案例，理解多态在开发中的作用。
        重要提示：feed方法是否需要一个参数，参数选什么类型！！！*/
public class Master {
//    要求：主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。
//向上转型
    private String name;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Pet p){
        System.out.println(this.name+"在喂宠物");
        p.eat();
    }
    //向下转型
//    public void feed(Pet p){
//        if (p instanceof Cat){
//            System.out.println("Master在喂猫");
//            p.eat();
//        }else if (p instanceof YingWu){
//            System.out.println("Master在喂鹦鹉");
//            p.eat();
//        }else {
//            System.out.println("Master在喂狗");
//            p.eat();
//        }
//    }
}
