package com.text;

public class Test10 {
    public static void main(String[] args) {

        int[] ar = {9, 8, 10, 7, 6, 0, 11};
        int n = 0;
        int n1 = 0;

        for (int i = 0; i < ar.length-1 ; i++) {

            int min = i;
            for (int j = i+1; j < ar.length ; j++) {
                n++;
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            if (min!= i){
                int s;
                s = ar[min];
                ar[min] = ar[i];
                ar[i] = s;
                n1++;
            }
        }
        System.out.println("比较次数："+n);
        System.out.println("交换次数："+n1);
        for (int i : ar){
            System.out.print(i+" ");
        }
        System.out.println();

        int n2 = 0;
        int n3 = 0;
        int[] a = {9, 8, 10, 7, 6, 0, 11};
        for (int i = a.length-1;i>0 ;i--){

            for (int j = 0;j<i;j++){
                int s;
                n2++;
                if (a[j]>a[j+1]){
                    s = a[j];
                    a[j] = a[j+1];
                    a[j+1] = s;
                    n3++;
                }
            }
        }
        System.out.println("比较次数："+n2);
        System.out.println("交换次数："+n3);
        for (int i : a){
            System.out.print(i+" ");
        }
    }
}
