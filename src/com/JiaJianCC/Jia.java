package com.JiaJianCC;
//        （2）设计四个类分别实现此接口，完成加、减、乘、除运算。
public class Jia implements Compute{
    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}
