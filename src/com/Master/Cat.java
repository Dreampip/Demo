package com.Master;

public class Cat extends Pet{
    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("猫再吃");
    }
}
