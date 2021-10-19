package com.text;

public class test8 {
    public static void main(String[] args) {
        Weapon w = new Tank();
        w.attack();
        w.move();
        Weapon s = new Flighter();
        s.move();
        s.attack();
        Weapon b = new WarShip();
        b.move();
        b.attack();
    }
}
/*
第一题：
        （1）定义一个抽象类Weapon,该抽象类有两个抽象方法attack()，move()
        这两个方法分别表示武器的攻击方式和移动方式。

        （2）定义3个类：Tank,Flighter,WarShip都继承自Weapon,
        分别用不同的方式实现Weapon类中的抽象方法。

        编写测试程序main方法，创建多个不同武器的实例。并分别调用attack()和move()方法。
        能用多态尽量使用多态。*/
abstract class Weapon{
    public abstract void attack();
    public abstract void move();
}
class Tank extends Weapon{
    public void attack(){
        System.out.println("炮轰");
    }
    public void move(){
        System.out.println("用履带走");
    }
}
class Flighter extends Weapon{
    public void attack(){
        System.out.println("射击");
    }
    public void move(){
        System.out.println("在天上飞");
    }
}
class WarShip extends Weapon{
    public void attack(){
        System.out.println("用鱼蛋射击");
    }
    public void move(){
        System.out.println("在海里游");
    }
}