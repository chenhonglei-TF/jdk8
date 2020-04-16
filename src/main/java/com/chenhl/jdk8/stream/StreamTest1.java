package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @description: Stream的创建方式
 * @author: TF019387 chenhonglei
 * @date: 2017/11/19 13:49
 */
public class StreamTest1 {

    public static void main(String[] args) {

        // 通过Stream的静态方法of来创建一个流
        Stream<String> stream1 = Stream.of("hello", "world", "welcome");

        // 通过数组来创建
        String[] arr = new String[]{"hello", "world", "welcome"};
        Stream<String> stream2 = Stream.of(arr);
        Stream<String> stream3 = Arrays.stream(arr);

        // 通过集合来创建
        List<String> list = Arrays.asList(arr);
        Stream<String> stream = list.stream();
    }
}
