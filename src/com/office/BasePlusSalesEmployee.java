package com.office;

//        BasePlusSalesEmployee：
//        SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
//        属性：底薪。
public class BasePlusSalesEmployee extends SalesEmployee {
    private double salary;

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(double salary) {
        this.salary = salary;
    }

    public BasePlusSalesEmployee(String name, int month, double sales, double commission, double salary) {
        super(name, month, sales, commission);
        this.salary = salary;
    }

    public BasePlusSalesEmployee(double sales, double commission, double salary) {
        super(sales, commission);
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
        return "BasePlusSalesEmployee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void getSalary(int month) {
        double s = getSales() * getCommission()+salary;
        if (this.getMonth() == month) {
            s += 100;
        }
        System.out.println(s);
    }
}

