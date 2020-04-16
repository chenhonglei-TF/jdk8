package com.chenhl.jdk8;

/**
 * @description: Person实体类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/11 21:52
 */
public class Person {

    private String username;

    private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
