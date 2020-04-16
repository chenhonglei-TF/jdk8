package com.chenhl.jdk8.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2017/12/1 19:55
 */
public class MyComparatorTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");

        // 对集合中的元素按照升序排序
//        list.sort((str1, str2) -> str1.compareTo(str2));
//        list.sort(String::compareTo);

        // 按照字符串的长度升序排序
//        list.sort((str1, str2) -> str1.length() -str2.length());
//        list.sort(Comparator.comparingInt(String::length));

        // 按照字符串的长度降序排序
//        list.sort(Comparator.comparingInt(String::length).reversed());
        // 使用lambda表达式时类型无法推断,那么必须显示声明类型
//        list.sort(Comparator.comparingInt(item -> item.length()).reversed());
//        list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());

        // 根据字符串长度升序排序，如果字符串长度相同，再根据字母的自然顺序排序
//        list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
        /*
         * thenComparing是在前面的比较器返回的结果为0的情况下才会调用
         */
//        list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

        // 根据字符串长度升序排序，如果字符串长度相同，再根据字母的自然顺序排序,然后再逆序
//        list.sort(Comparator.comparingInt(String::length).thenComparing(String::toLowerCase, Comparator.reverseOrder()));

        // 按照字符串长度降序排序，然后按照字符自然顺序排序，会排序的结果再逆序
//        list.sort(Comparator.comparingInt(String::length).reversed()
//                .thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));

        // 多级排序，最后一个比较器不起作用， 因为前面两个已经排出顺序了
        list.sort(Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder()))
                .thenComparing(Comparator.reverseOrder()));
        System.out.println(list);
    }
}
