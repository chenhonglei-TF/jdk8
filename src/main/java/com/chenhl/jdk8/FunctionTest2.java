package com.chenhl.jdk8;

import java.util.function.Function;

/**
 * @description: compose方法和andThen方法举例
 * @author: TF019387 chenhonglei
 * @date: 2017/11/6 19:50
 */
public class FunctionTest2 {

    public static void main(String[] args) {

        FunctionTest2 test = new FunctionTest2();
        System.out.println(test.compose(2, v -> v * v, v -> v * 2));//16
        System.out.println(test.andThen(2, v -> v * v, v -> v * 2));//8


    }

    /**
     * 首先应用参数的apply方法，然后再应用当前函数的apply方法
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compose(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {

        return function1.compose(function2).apply(a);
    }

    /**
     * 与compose方法完全相反，先应用当前function的apply方法，再应用参数的apply方法
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int andThen(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {

        return function1.andThen(function2).apply(a);
    }
}
