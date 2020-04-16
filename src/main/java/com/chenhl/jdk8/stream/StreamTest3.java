package com.chenhl.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @description: StreamTest3
 * @author: TF019387 chenhonglei
 * @date: 2017/11/19 14:00
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // 将一个整形集合中的元素乘以2，然后求和
        System.out.println(list.stream().map(integer -> integer * 2).reduce(0, Integer::sum));
    }
}
