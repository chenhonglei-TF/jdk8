package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2017/11/26 18:53
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome", "world hello", "hello world hello", "hello welcome");

        // 找出所有的单词，去重
        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
