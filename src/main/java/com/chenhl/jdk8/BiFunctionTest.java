package com.chenhl.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @description: BiFunction:接收两个参数，返回一个结果
 * @author: TF019387 chenhonglei
 * @date: 2017/11/6 20:07
 */
public class BiFunctionTest {


    public static void main(String[] args) {

        BiFunctionTest test = new BiFunctionTest();
        System.out.println(test.compute(1, 2, (a, b) -> a + b));
        System.out.println(test.compute(1, 2, (a, b) -> a - b));
        System.out.println(test.compute(1, 2, (a, b) -> a * b));
        System.out.println(test.compute(1, 2, (a, b) -> a / b));

        System.out.println(test.compute(1, 2, (a, b) -> a + b, v -> v * v));

    }

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
