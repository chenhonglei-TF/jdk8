package com.chenhl.jdk8.stream2;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2017/11/27 21:12
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",80);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",100);
        Student student4 = new Student("zhaoliu",90);
        Student student5 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        List<Student> list = students.stream().collect(toList());
        list.forEach(System.out::println);

        // 使用流的方式求出集合中元素的个数
        System.out.println("count: " + students.stream().collect(counting()));
        System.out.println("count: " + students.stream().count());

        // 找出考试分数最少的学生
        students.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        // 找出考试分数最多的学生
        students.stream().collect(maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        // 求平均值
        Double result = students.stream().collect(averagingInt(Student::getScore));
        System.out.println(result);
        // 求总和
        Integer integer = students.stream().collect(summingInt(Student::getScore));
        System.out.println(integer);
        // 求出摘要信息
        IntSummaryStatistics summaryStatistics = students.stream().collect(summarizingInt(Student::getScore));
        System.out.println(summaryStatistics);

        System.out.println("--------");

        // 将学生的名字拼接起来
        System.out.println(students.stream().map(Student::getName).collect(joining()));
        System.out.println(students.stream().map(Student::getName).collect(joining(",")));
        System.out.println(students.stream().map(Student::getName).collect(joining(",","<begin>", "<end>")));

        System.out.println("--------");
        // 二级分组
        // 根据学生的分数分组，然后根据学生的名字再分组
        Map<Integer, Map<String, List<Student>>> map = students.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(map);

        System.out.println("--------");
        // 分区
        Map<Boolean, List<Student>> map1 = students.stream().collect(partitioningBy(student -> student.getScore() > 80));
        System.out.println(map1);

        System.out.println("--------");
        // 二级分区
        Map<Boolean, Map<Boolean, List<Student>>> map2 = students.stream().collect(partitioningBy(student -> student.getScore() > 80, partitioningBy(student -> student.getScore() > 90)));
        System.out.println(map2);

        System.out.println("--------");
        // 找出分数大于80的，然后统计每个分区里的个数
        Map<Boolean, Long> map3 = students.stream().collect(partitioningBy(student -> student.getScore() > 80, counting()));
        System.out.println(map3);

        System.out.println("--------");
        // 按照学生的名字分组，然后找出每个分组中分数最小的
        Map<String, Student> map4 = students.stream().collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println(map4);

    }
}
