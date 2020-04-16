package com.chenhl.jdk8;

/**
 * @description: 员工实体类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/14 22:14
 */
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
