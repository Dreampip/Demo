package com.text;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {

        int[] s = new int[5];
        int index = 0;
        while (index<s.length) {
            int num = num();
            for (int i = 0; i < s.length; i++) {
                if (num!=s[i]) {
                    s[i] = num;
                    index++;
                    break;
                }
            }
        }
        for (int j = 0;j< s.length;j++){
            System.out.println(s[j]);
        }
    }
    public static int num(){
        Random r = new Random();
        return r.nextInt(5) + 1;
    }
}
