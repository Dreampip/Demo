package com.Master;

public class Pet {
    private String name;

    public Pet() {

    }
    public Pet(String name) {

        this.name = name;
        eat2();
    }

    public void eat(){
        System.out.println("吃");
    }
    public static void eat1(){
        System.out.println("静态吃");
    }
    private void eat2(){
        System.out.println(this.name);
        System.out.println(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
