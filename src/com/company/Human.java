package com.company;



/**
 * Created by 张连芳 on 2016/10/19.
 */
public class Human {
    private String sex;//初始化性别，不能外部修改 姓名年龄用set get方法 introduce方法介绍自己 打印姓名年龄性别
    private String name;
    private int age;

    public Human(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("你好，我的名字是:" + name + " ,我的性别是:" + sex + " 我的年龄是:" + age);
    }

}
