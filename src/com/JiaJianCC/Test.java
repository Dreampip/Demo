package com.JiaJianCC;

public class Test {
    public static void main(String[] args) {
        UseCompute u = new UseCompute();
        u.useCom(new Jia(),5,5);//加法
        u.useCom(new Jian(),5,5);//减法
        u.useCom(new Cheng(),5,5);//乘法
        u.useCom(new Chu(),5,5);//除法
    }
}
