package com.office;
//        HourlyEmployee：
//        Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
//        属性：每小时的工资、每月工作的小时数
public class HourlyEmployee extends Employee{
    private double hourlyWage;//每小时的工资
    private int hour;//每月工作的小时数

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int month, double hourlyWage, int hour) {
        super(name, month);
        this.hourlyWage = hourlyWage;
        this.hour = hour;
    }

    public HourlyEmployee(double hourlyWage, int hour) {
        this.hour = hour;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", hour=" + hour +
                '}';
    }
    //        Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。

    @Override
    public void getSalary(int month) {
        double salary = 0;
        if(hour>160){
            salary = ((hour-160)*1.5+hour)*hourlyWage;
        }else {
            salary = hour*hourlyWage;
        }
        if(this.getMonth() == month){
            salary += 100;
        }
        System.out.println(salary);
    }
}
