package com.chenhl.jdk8.methodreference;

/**
 * @description: 学生排序测试类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/17 21:08
 */
public class StudentComparator {

    public int compareByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public int comparaByScore(Student student, Student student2) {
        return student.getScore() -student2.getScore();
    }
}
