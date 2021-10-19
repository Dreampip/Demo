package com.Hotel;
//第二题：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
//        为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
//        1、该系统的用户是：酒店前台。
//        2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
//        3、酒店中的每一个房间应该是一个java对象：Room
//        4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
//        5、系统应该对外提供的功能：
//        可以预定房间：用户输入房间编号，订房。
//        可以退房：用户输入房间编号，退房。
//        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
public class Room {
//    房间编号、房间类型、房间是否空闲.
    private Integer id;
    private String type;
    private Boolean free;//true是空闲，false是被使用



    public Room(Integer id, String type, Boolean free) {
        this.id = id;
        this.type = type;
        this.free = free;
    }

    public Room() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "房间号："+(getId()+1)+"  房间类型："+getType()+"  房间状态："+(getFree()?"空闲":"占用");
    }
}
