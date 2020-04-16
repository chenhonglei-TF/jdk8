package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 流的分组和分区
 * @author: TF019387 chenhonglei
 * @date: 2017/11/26 19:15
 */
public class StreamTest12 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hi", "Hello", "你好");

        List<String> list2 = Arrays.asList("张三", "李四", "王五", "赵六");

        // 实现交叉打招呼

        list.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2))
                .collect(Collectors.toList()).forEach(System.out::println);
    }


}
