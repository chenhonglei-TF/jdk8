package com.chenhl.jdk8.methodreference;

/**
 * @description: 方法引用测试用实体类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/17 20:50
 */
public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /* 这两个方法是用来测试类名::静态方法名而存在的
    public static int compareByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public static int comparaByScore(Student student, Student student2) {
        return student.getScore() -student2.getScore();
    }
    */

    // 下面这两个方法是用来测试类名::实例方法名来设计的
    public int compareByName(Student student2) {
        return getName().compareTo(student2.getName());
    }

    public int comparaByScore(Student student2) {
        return getScore() -student2.getScore();
    }

}
