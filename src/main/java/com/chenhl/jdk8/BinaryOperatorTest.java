package com.chenhl.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @description: 接收两个类型相同的参数，返回一个与参数类型相同的结果
 * @author: TF019387 chenhonglei
 * @date: 2017/11/13 21:44
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a + b));
        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a - b));
        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a * b));
        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a / b));

        System.out.println("-----");

        System.out.println(binaryOperatorTest.minBy(3, 4, (a, b) -> a.compareTo(b)));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public int minBy(int a, int b, Comparator<Integer> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
