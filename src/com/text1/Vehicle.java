package com.text1;
/*2、请定义一个交通工具(Vehicle)的类
        其中有属性：
        速度(speed)
        体积(size)等等
        方法移动(move())
        设置速度(setSpeed(int speed))
        加速speedUp(),
        减速speedDown()等等.

        最后在测试类Vehicle中的main()中实例化一个交通工具对象
        并通过方法给它初始化speed,size的值并且打印出来。
        另外调用加速减速的方法对速度进行改变。*/
public class Vehicle {
    private int speed;//速度
    private int size;//体积

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
//    方法移动(move())
//    public void move(){
//
//    }
//    设置速度(setSpeed(int speed))
//    加速speedUp(),
    public void speedUp(int i){
        setSpeed(getSpeed()+i);
    }
    public void speedDown(int i){
        setSpeed(getSpeed()-i);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }

    //    减速speedDown()等等.
public static void main(String[] args) {
//    最后在测试类Vehicle中的main()中实例化一个交通工具对象
//    并通过方法给它初始化speed,size的值并且打印出来。
//    另外调用加速减速的方法对速度进行改变。*/
    Vehicle v = new Vehicle();
    v.setSpeed(100);
    v.setSize(20);
    v.speedUp(20);
    System.out.println(v);
    v.speedDown(50);
    System.out.println(v);
}
}
