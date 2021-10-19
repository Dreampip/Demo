package com.text;
/*第二题：编写程序，模拟用户登录功能，程序开始运行时先在 DOS 命令窗口中初始化登录页
        面，提醒用户输入用户名和密码，当用户输入用户名为 admin，密码为 123 的时候登录成功，
        打印欢迎信息，当用户输入的用户名和密码不正确打印错误提示信息并退出系统。对于以上的
        程序大家尽可能定义相关方法来完成，不要将所有代码都放到 main 方法当中。*/

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        minNum(500);
    }
    public static void UI(){
        System.out.println("欢迎您的到来，请输入用户名和密码：");
        Scanner ip = new Scanner(System.in);
        System.out.print("用户名：");
        String username = ip.next();
        System.out.print("密码：");
        String password = ip.next();
        login(username,password);

    }
    public static void login(String username,String password){
        if(username.equals("admin")&&password.equals("123")){
            System.out.println("欢迎您"+username);
        }else {
            System.out.println("对不起，用户名或者密码错误！");
        }
    }

    /*2、编写一个方法，输出大于某个正整数n的最小的质数。
    思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。*/
    public static void minNum(int n){
        //判断n是否符合规范
        if(n<0){
            System.out.println("请输入正确的数:");
        }else {
//            定义一个数大于n
//            int num = n;
//            while (true){//此处循环代表每次循环下来num+1
//                num++;
//                if (iszhishu(num)){//如果是质数则return这个数，如果不是质数则继续进行while循环，将b重新赋值为true；
//                    System.out.println("大于"+n+"的最小质数为："+num);
//                    break;
//                }
//            }

            while (!iszhishu(++n)){
            }
            System.out.println(n);
        }
    }
    public static boolean iszhishu(int i ){
        for (int j = 2 ; j < i ; j++) {//判断这个数是否为质数
            if(i%j==0){//如果不是质数返回一个false
                return false;
            }
        }
        return true;
    }
}
