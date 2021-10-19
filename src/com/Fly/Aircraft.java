package com.Fly;

public class Aircraft implements CanFly{
    @Override
    public void fly() {
        System.out.println("飞机会飞");
    }
    @Override
    public void makeFly(){
        System.out.println("飞机飞了起来！");
    }
}
