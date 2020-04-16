package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: StreamTest5
 * @author: TF019387 chenhonglei
 * @date: 2017/11/20 22:14
 */
public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld", "test");

        // 将集合中的元素转换成大写，输出
//        list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-----------------");

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        list1.stream().map(integer -> integer * integer).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-----------------");

        // flatMap
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3), Arrays.asList(4, 5, 6));

        stream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);




    }
}
