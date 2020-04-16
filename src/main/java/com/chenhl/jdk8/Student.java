package com.chenhl.jdk8;

/**
 * @description: 学生类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/13 21:30
 */
public class Student {

    private String name = "zhangsan";

    private int age =20;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
