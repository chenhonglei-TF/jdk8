package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2017/11/26 18:36
 */
public class StreamTest10 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello1", "world", "hello world");

//        list.stream().mapToInt(item -> item.length())
//                .filter(length -> length == 5).findFirst().ifPresent(System.out::println);


        /*
         * 流的执行本质最好的一个例子：
         * 流关注于操作本身，流框架会将所有的操作串行化的应用到每个元素上
         * 而不是先将第一个操作应用于流中的每个元素，然后将第二个操作应用于每个元素。
         *
         */
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(len -> len == 5).findFirst().ifPresent(System.out::println);


    }
}
