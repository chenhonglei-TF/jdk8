package com.chenhl.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @description: StreamTest6
 * @author: TF019387 chenhonglei
 * @date: 2017/11/20 22:33
 */
public class StreamTest6 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        stream.findFirst().ifPresent(System.out::println);

        System.out.println("---------------");

//        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
        Stream<Integer> integerStream = Stream.iterate(1, item -> item + 2).limit(6);

        //1, 3, 5, 7, 9, 11
        // 找出大于2的，然后再乘以2， 然后忽略前两个，然后取前两个，求总和
//        System.out.println(integerStream.filter(integer -> integer > 2).mapToInt(integer -> integer * 2).skip(2).limit(2).sum());
        // 求最小值
//        integerStream.filter(integer -> integer > 2).mapToInt(integer -> integer * 2).skip(2).limit(2).min().ifPresent(System.out::println);
        // 求最大值
//        integerStream.filter(integer -> integer > 2).mapToInt(integer -> integer * 2).skip(2).limit(2).max().ifPresent(System.out::println);

        System.out.println("---------------");
        // 求概述
        IntSummaryStatistics intSummaryStatistics = integerStream.filter(integer -> integer > 2).mapToInt(integer -> integer * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getSum());
    }
}
