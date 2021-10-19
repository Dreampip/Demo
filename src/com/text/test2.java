package com.text;

public class test2 {
    public static void main(String[] args) {

       int s = jiecheng1(5);
        System.out.println(s);
    }
    public static int c1(int a,int b){
        System.out.println(a/b);
        return a/b;
    }
    public static void p(int data){
        System.out.println(data);
    }

    /*1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
    思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。*/
    //循环的方法
    public static int jiecheng(int i){
        int s = 1;
        for (int j = i; j >0 ; j--) {
            s *= j;
        }
        return s;
    }
    //递归的方法
    public static int jiecheng1(int n){
        if(n==1){
            return 1;
        }
        return n*jiecheng1(n-1);
    }
}




