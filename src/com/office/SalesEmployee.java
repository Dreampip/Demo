package com.office;
//        SalesEmployee：
//        Employee 的子类，销售人员，工资由月销售额和提成率决定。
//        属性：月销售额、提成率
public class SalesEmployee extends Employee{
    private double sales;//月销售额
    private double commission;//提成率

    public SalesEmployee(){
    }

    public SalesEmployee(String name, int month, double sales, double commission) {
        super(name, month);
        this.sales = sales;
        this.commission = commission;
    }

    public SalesEmployee(double sales, double commission) {
        this.sales = sales;
        this.commission = commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "sales=" + sales +
                ", commission=" + commission +
                '}';
    }

    @Override
    public void getSalary(int month) {
        double salary = sales*commission;
        if(this.getMonth() == month){
            salary += 100;
        }
        System.out.println(salary);
    }
}
