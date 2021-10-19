package com.text1;
//        编写测试程序，创建病毒对象，创建人对象，模拟病毒攻击人。
public class Demo1 {
    public static void main(String[] args) {
        Virus v = new Virus("新冠病毒",5.0,"肺炎");
        v.attack(new People("张三",18,1));
        v.attack(new People("李四",16,0));
    }
}

//3、定义一个人类
//        属性包括：姓名、年龄、性别
//        属性私有化，对外提供公开的set和get方法
//        提供无参数构造和有参数构造
//        提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了
class People{
    private String name;
    private Integer age;//年龄
    private Integer sex;//1是男 0是女

    public People() {
    }

    public People(String name,int age,int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    //        提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了
    public void ill() {
        System.out.println(getName()+","+getSex()+","+getAge()+"岁生病了");
    }
}
//        定义一个病毒类
//        属性包括：病毒名称name、病毒体积size、病毒类型type
//        属性私有化，对外提供公开的set和get方法
//        提供无参数构造和有参数构造
//        提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
//        在attack()方法中调用人对象的生病方法。
class Virus{
    private String name;//属性包括：病毒名称name、病毒体积size、病毒类型type
    private Double size;
    private String type;

    public Virus() {
    }

    public Virus(String name, Double size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //        提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
    public void attack(People p) {
        p.ill();
        System.out.println("感染："+getName()+"，体积："+getSize()+"，类型："+getType());
    }
}