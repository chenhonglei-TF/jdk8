package com.chenhl.jdk8;

import java.util.Optional;

/**
 * @description: OptionalTest
 * @author: TF019387 chenhonglei
 * @date: 2017/11/14 21:57
 */
public class OptionalTest {

    public static void main(String[] args) {

//        Optional<String> optional = Optional.of("hello");
//        Optional<String> optional = Optional.empty();
        Optional<String> optional = Optional.ofNullable("hello");

        // 强烈不推荐这么写
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        // 墙裂推荐
        optional.ifPresent(System.out::println);

        System.out.println("------");

        System.out.println(optional.orElse("world"));

        System.out.println("------");

        System.out.println(optional.orElseGet(() -> "你好"));

        System.out.println("------");













    }
}
