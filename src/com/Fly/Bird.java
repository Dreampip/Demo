package com.Fly;

public class Bird implements CanFly{
    @Override
    public void fly() {
        System.out.println("鸟会飞");
    }

    @Override
    public void makeFly(){
        System.out.println("鸟飞了起来！");
    }
}
