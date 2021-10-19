package com.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
//        int a = 100;
//        String s = String.valueOf(a);
//        String s1 = a + "";
//        System.out.println(s);
//        System.out.println(s1);
//        String s2 = "123";
//        int a1 = Integer.parseInt(s2);
//        System.out.println(a1);
       Date nowTime = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
       String time = sdf.format(nowTime);
       System.out.println(time);


       String Ti = "2001-06-19 14:55:55";
       SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date date = sdf2.parse(Ti);
        System.out.println(date);
        Date d = new Date(System.currentTimeMillis()- 1000L *60*60*24*365);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf3.format(d));

    }
}

