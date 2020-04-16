package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 在将函数作为一等公民的语言中，Lambda表达式的类型时函数。
 * 但在Java中，Lambda表达式是对象，它们必须依附于一类特定的对象类型--函数式接口。
 *
 *
 * @author: TF019387 chenhonglei
 * @date: 2017/11/4 22:10
 */
public class Test3 {

    public static void main(String[] args) {

        // 对于一个Lambda表达式，到底是什么类型，必须要由上下文来决定。

//        FunctionalInterface1 functionalInterface1 = () -> System.out.println("1");
//
//        System.out.println(functionalInterface1.getClass().getInterfaces()[0]);
//
//        FunctionalInterface2 functionalInterface2 = () -> System.out.println("2");
//
//        System.out.println(functionalInterface2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("hello", "world", "welcome");
//        list.forEach(item -> System.out.println(item.toUpperCase()));

        list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
    }

}

interface FunctionalInterface1 {

    void test1();
}

interface FunctionalInterface2 {

    void test2();
}