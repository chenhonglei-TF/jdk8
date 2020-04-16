package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 分组与分区
 * @author: TF019387 chenhonglei
 * @date: 2017/11/26 19:29
 */
public class StreamTest13 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 40);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        // 分组 groupBy
        // 按照学生的姓名分组
//        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
//        System.out.println(map);

        // 按照学生的分数分组
//        Map<Integer, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getScore));
//        System.out.println(map);

        // 根据学生的名字来分组，求出分组中元素的个数
//        Map<String, Long> map = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        System.out.println(map);

        // 根据学生的名字来分组，求出分组中元素的平均值
//        Map<String, Double> map = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
//        System.out.println(map);


        // 分区 partitionBy
        Map<Boolean, List<Student>> map = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        System.out.println(map);



    }
}
