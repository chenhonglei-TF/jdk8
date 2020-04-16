package com.chenhl.jdk8;

import java.util.List;

/**
 * @description: 公司实体类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/14 22:15
 */
public class Company {

    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
