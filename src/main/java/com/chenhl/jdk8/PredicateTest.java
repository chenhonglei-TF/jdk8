package com.chenhl.jdk8;

import java.util.function.Predicate;

/**
 * @description: Predicate:接收一个参数，返回一个boolean值
 * @author: TF019387 chenhonglei
 * @date: 2017/11/11 22:25
 */
public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> predicate = item -> item.length() > 5;

        System.out.println(predicate.test("hello1"));
    }
}
