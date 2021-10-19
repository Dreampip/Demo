package com.office;
//        根据要求创建 SalariedEmployee拿固定工资的员工。
//        HourlyEmployees 按小时拿工资的员工、
//        SaleEmployee 销售人员
//        BasePlusSalesEmployee有固定底薪的销售人员
//        四个类的对象各一个，
//        并计算某个月这四个对象的工资。
//
//        注意：要求把每个类都做成完全封装，不允许非私有化属性。
public class test {
    public static void main(String[] args) {
        SalariedEmployee s1 = new SalariedEmployee();
        s1.setSalary(1000);
        s1.setMonth(5);
        System.out.println(s1);
        s1.getSalary(5);
        s1.getSalary(12);
        HourlyEmployee s2 = new HourlyEmployee("2",5,10.0,10);
        System.out.println(s2);
        s2.getSalary(5);
        s2.getSalary(12);
        SalesEmployee s3 = new SalesEmployee("3",5,1000.0,0.2);
        System.out.println(s3);
        s3.getSalary(5);
        s3.getSalary(12);
        BasePlusSalesEmployee s4 = new BasePlusSalesEmployee("3",5,1000.0,0.1,1000);
        System.out.println(s4);
        s4.getSalary(5);
        s4.getSalary(12);
    }


}
