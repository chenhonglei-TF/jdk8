package com.chenhl.jdk8.stream;

import java.util.stream.IntStream;

/**
 * @description: Stream
 * @author: TF019387 chenhonglei
 * @date: 2017/11/19 13:54
 */
public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{5, 6, 7, 8}).forEach(System.out::println);
        System.out.println("------");
        // 包含开始，不包含后面
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("------");
        // 包含开始，包含结束
        IntStream.rangeClosed(3, 8).forEach(System.out::println);
    }
}
