package com.office;
//        SalariedEmployee：
//        Employee 的子类，拿固定工资的员工。
//        属性：月薪
public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary = salary;
    }

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", month=" + getMonth() +", salary=" + salary +
                '}';
    }
    /*
        方法：getSalary(int month)
        根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
*/
    @Override
    public void getSalary(int month) {
        double s = salary;
        if(this.getMonth() == month){
            s += 100;
        }
        System.out.println(s);
    }
}

