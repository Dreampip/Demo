package com.text;

public abstract class test7 {
    {
        System.out.println("实例代码块");
    }
    static {
        System.out.println("父类的静态方法");
    }
//    public test7(){
//        System.out.println("父类的无参构造");
//    }
    public abstract void s(int i);
    public abstract void b();

}
 class b extends test7{
    public b(){
    }
    public static void main(String[] args) {
        new b().d();
        test7 b = new b();
        b.b();

    }

     public void s(int i) {
         System.out.println("s");
     }
     public void b(){
        s(5);
         System.out.println("b");
     }
     public void d(){
         System.out.println("d");
     }
 }
