package com.text;

import java.util.Scanner;

public class test1 {

    public static void v1() {
        boolean bo = true;
        if (bo) {
            System.out.println("yes");
//            double dd = 10/3;
//            System.out.println(dd);
//            dd = 10.0/3;
//            System.out.println(dd);
            short i = 10;
            byte j = 5;
            short k = (short) (i + j);
            System.out.println(k);
        } else {
            System.out.println("no");
        }
    }

    public static void v2() {
/*        1、根据指定月份，打印该月份所属的季节。
        3,4,5 春季
        6,7,8 夏季
        9,10,11 秋季
        12, 1, 2 冬季*/
//        if和switch各写一版

//        while (true){
//            System.out.println("请输入一个月份：");
//            Scanner ip = new Scanner(System.in);
//            int i =  ip.nextInt();
//            if(2<i&&i<6){
//                System.out.println("春天");
//            }else if (i==6||i==7||i==8){
//                System.out.println("夏天");
//            }else if (i==9||i==10||i==11){
//                System.out.println("秋天");
//            }else {
//                System.out.println("冬天");
//            }
//        }
        while (true) {
            Scanner ip = new Scanner(System.in);
            int i = ip.nextInt();
            String str ="xx";
            switch (i) {
                case 3: case 4: case 5:
                    str="春天";
                    break;
                case 6: case 7: case 8:
                    str="夏天";
                    break;
                case 9: case 10: case 11:
                    str="秋天";
                    break;
                case 12: case 1: case 2:
                    str="冬天";
            }
            System.out.println(str);
        }
    }

    public static void v3() {
//  5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，使用if-else结构，并按从小到大的顺序输出
//        System.out.println("输入三个整数分别存入变量num1,num2,num3");
//        Scanner ip = new Scanner(System.in);
//        int num1 = ip.nextInt();
//        int num2 = ip.nextInt();
//        int num3 = ip.nextInt();
//        if (num1>num2 && num2>num3 && num1>num3){
//                System.out.println(num1);
//                System.out.println(num2);
//                System.out.println(num3);
//            } else if(num1<num2 && num2>num3 &&num1>num3){
//                System.out.println(num2);
//                System.out.println(num1);
//                System.out.println(num3);
//        }

//        冒泡排序
        int[] i = new int[3];
        System.out.print("输入三个整数分别存入变量num1,num2,num3");
        Scanner ip1 = new Scanner(System.in);

        //往数组中添加值
        for (int j = 0; j < i.length; j++) {
            i[j] = ip1.nextInt();
        }

        //打印数组
        for (int value : i) {
            System.out.println(value);
        }

        //冒泡排序
        for (int j = 0; j < i.length; j++) {
            for (int k = j + 1; k < i.length; k++) {
                int s;
                if (i[j] > i[k]) {
                    s = i[j];
                    i[j] = i[k];
                    i[k] = s;
                }
            }

            //再次打印数组
        }
        for (int k : i) {
            System.out.println(k);
        }
    }

    public static void v4() {
//            6、打车起步价8元（3KM以内）
//            超过3KM，超出的每公里1.2元
//            超过5KM，超出的每公里1.5元
//            请在键盘上接收公里数，得出总价。
//            while (true){
//                Scanner ip = new Scanner(System.in);
//                System.out.println("请输入公里数");
//                Double i = ip.nextDouble();
//                if(i<3){
//                    System.out.println("一共八元");
//                }else if(3<=i & i <=5) {
//                    i = (i-3)*1.2+8;
//                    System.out.println(i+"元");
//                }else {
//                    i = 8+1.2*2+(i-5)*1.5;
//                    System.out.println(i+"元");
//                }
//            }

//            2、计算 1+2-3+4-5+6-7....+100的结果
//            int sum = 1;
//            for (int i = 2;i<=100;i++){
//                if(i%2==0){
//                    sum+=i;
//                }else {
//                    sum-=i;
//                }
//            }
//            System.out.println(sum);

//            6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
//            或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
        double day = 0;
        Double money = 0.0;
        while (true) {
            day++;
            money+=2.5;
            if (day%5==0){
                money-=6;
            }
            if (money > 100) {
                break;
            }
        }
        System.out.println(day);

/*            8、给一个不多于5位的正整数，
            要求：
            一、求它是几位数
            二、逆序打印出各位数字*/
//            int i = (int)(Math.random()*99999+1);
//            int s = i;
//            int num = 0;
//            int i = 49;
//            int s = i;
//            while (s>0){
//                s /=10;
//                num++;
//            }
//            System.out.println(num);
//
//            if(0<i&i<=9){
//                System.out.println(i);
//            }else if(9<i&i<100){
//                //49 ==>94
//                int a,b;
//                a = i%10;//9
//                b = i/10;//4
//                System.out.println(a*10+b);
//            }

    }
public static void v5(){
    int x = 10;
    int a = x + x++;//10+10=20,x=11
    System.out.println("a =" + a);//20
    System.out.println("x =" + x);//11
    int b = x + ++x;//11+12
    System.out.println("b =" + b);//23
    System.out.println("x =" + x);//12
    int c = x + x--;//12+12
    System.out.println("c =" + c);//24
    System.out.println("x =" + x);//11
    int d = x + --x;//11+10
    System.out.println("d =" + d);//21
    System.out.println("x =" + x);//10

}
public static void v6(){
/*    业务要求：
    1、从键盘上接收一个人的年龄。
    2、年龄要求为[0-150]，其它值表示非法，需要提示非法信息。
    3、根据人的年龄来动态的判断这个人属于生命的哪个阶段？
            [0-5] 婴幼儿
            [6-10] 少儿
            [11-18] 少年
            [19-35] 青年
            [36-55] 中年
            [56-150] 老年
    4、请使用if语句完成以上的业务逻辑。*/
    Scanner ip = new Scanner(System.in);
    while (true) {
        System.out.print("请输入年龄：");
        int i = ip.nextInt();
        String str = "老年";
        if (i < 0 || i > 150) {
            str = "年龄不合法";
        } else {
            if (i < 6) {
                str = "婴幼儿";
            } else if (i < 11) {
                str = "少儿";
            } else if (i < 19) {
                str = "少年";
            } else if (i < 36) {
                str = "青年";
            } else if (i < 56) {
                str = "中年";
            }
        }
        System.out.println(str);
    }
}
public static void v7(){
        //n是行数
    Scanner ip = new Scanner(System.in);
    int n = ip.nextInt();
        for (int i = 1;i<=n;i++){

            //控制空格数
            for (int j = 1; j <=n-i; j++) {
                System.out.print("=");
            }

            //控制星星数
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
}
public static void v8(){
//        Scanner ip = new Scanner(System.in);
//        int num = ip.nextInt();
//        int sum = 1;
//    for (int i = num; i >0 ; i--) {
//        sum *=i;
//    }
//    System.out.println(sum);

    int sum = 0;
    for (int i = 1; i <=10; i++) {
        int sum1 = 1;
        for (int j = i; j >0 ; j--) {
            sum1 *=j;
        }
        sum+=sum1;
    }
    System.out.println(sum);
}
    public static void v9(){
        //是不是质数
        while (true){
            Scanner ip = new Scanner(System.in);
            int num = ip.nextInt();
            boolean b = false;
            for (int i = num-1; i >1 ; i--) {
                if(num%i==0){
                    b = true;
                    break;
                }
            }

//            if(b){
//                System.out.println("不是质数");
//            }else {
//                System.out.println("是质数");
//            }
            System.out.println(num+(b?"不是":"是")+"质数");
        }

    }
    public static void main(String[] args) {
//        byte b = 15;
////        b+=5;
//        b = (byte) (b + 5);
//        System.out.println(b);
        v8();
    }
}
