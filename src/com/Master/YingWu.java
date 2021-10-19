package com.Master;

public class YingWu extends Pet {
    public YingWu() {
        super();
    }

    public YingWu(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("鹦鹉"+this.getName()+"再吃");
        System.out.println("鹦鹉"+super.getName()+"再吃");
        super.eat();
        Pet.eat1();
        Pet p = new Pet();
    }
}
