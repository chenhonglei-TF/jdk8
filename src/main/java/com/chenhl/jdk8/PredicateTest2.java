package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @description: PredicateTest2
 * @author: TF019387 chenhonglei
 * @date: 2017/11/12 22:22
 */
public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest2 test = new PredicateTest2();

        // 找出所有的奇数
        test.conditionFilter(list, i -> i % 2 != 0);

        System.out.println("---------");

        // 找出所有的偶数
        test.conditionFilter(list, integer -> integer % 2 == 0);

        System.out.println("---------");

        test.conditionFilter(list, integer -> integer > 5);

        System.out.println("---------");
        // 打印出所有的元素
        test.conditionFilter(list, integer -> true);

        System.out.println("---------");
        // 找出所有大于5，并且是偶数的数字
        test.conditionFilter2(list, integer -> integer > 5, integer -> integer % 2 == 0);

        System.out.println("---------");
        System.out.println(Predicate.isEqual("hello").test("hello world"));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate1.and(predicate2).negate().test(integer)) {
                System.out.println(integer);
            }
        }
    }
}
