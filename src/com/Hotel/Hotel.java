package com.Hotel;

import java.util.Scanner;

//        为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
//        1、该系统的用户是：酒店前台。
//        2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
//        3、酒店中的每一个房间应该是一个java对象：Room
//        4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
//        5、系统应该对外提供的功能：
//        可以预定房间：用户输入房间编号，订房。
//        可以退房：用户输入房间编号，退房。
//        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
public class Hotel {
    Scanner i = new Scanner(System.in);
    Room[] r = new Room[10];
    boolean b = true;


    public Hotel() {
        //初始化房间
        for (int k = 0; k <= 4; k++) {
            r[k] = new Room(k, "标间", true);
        }
        for (int k = 5; k < r.length; k++) {
            r[k] = new Room(k, "豪华间", true);
        }
        System.out.println("欢迎进入酒店管理系统！");
        verify();
        while (b) {
            System.out.println("请选择您需要的功能1.订房（使用订房功能最好查看一下是否有没有空房间）  " +
                    "2.退房  3.查看所有房间状态  4.退出");
            int num = i.nextInt();
            switch (num) {
//        可以预定房间：用户输入房间编号1-10，订房。
//        可以退房：用户输入房间编号1-10，退房。
//        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
                case 1: {
                    Inquire();
                    System.out.println("请输入房间编号1 - 10：");
                    order(i.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("请输入房间编号1 - 10：");
                    exit(i.nextInt());
                    break;
                }
                case 3: {
                    Inquire();
                }
                case 4: {
                    b = false;
                }
            }
        }
    }

    //一个登录功能
    public void verify() {
        System.out.println("--------------------");
        System.out.println("请输入您的用户名和密码：");
        User u = new User();
        System.out.print("用户名：");
        u.setName(i.next());
        System.out.print("密码：");
        u.setPassWord(i.next());
        if (u.getName().equals("admin") && u.getPassWord().equals("123456")) {
            System.out.println("欢迎您：" + u.getName());
        } else {
            System.out.println("用户名或密码输入有误！");
            b = false;
        }
    }

    //订房功能
    public void order(int roomNo) {
        if (r[roomNo - 1].getFree()) {
            r[roomNo - 1].setFree(false);
            System.out.println(r[roomNo - 1]);
            System.out.println("您的房间已定好！");
        } else {
            System.out.println("编号为" + roomNo + "的房间已被预定了！");
        }
    }

    //退房功能
    public void exit(int roomNo) {
        r[roomNo - 1].setFree(true);
        System.out.println(r[roomNo - 1]);
        System.out.println(roomNo + "号房以退订");
    }

    //查询所有房间信息
    public void Inquire() {
        for (Room room : r) {
            System.out.println(room);
        }
    }
}
