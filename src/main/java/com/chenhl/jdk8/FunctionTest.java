package com.chenhl.jdk8;

import java.util.function.Function;

/**
 * @description: Function:接收一个参数，返回一个结果
 * @author: TF019387 chenhonglei
 * @date: 2017/11/5 11:56
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        int result = test.compute(2, v -> v + 2);
        System.out.println(result);
        result = test.compute(2, param -> param * 2);
        System.out.println(result);
        result = test.compute(3, value -> value * value);
        System.out.println(result);

        System.out.println("--------");
        System.out.println(test.convert(5, item -> String.valueOf(item + "hello")));

        System.out.println("--------");
        Function<Integer, Integer> function = v -> v * 2;
        System.out.println(test.compute(4, function));
    }

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
