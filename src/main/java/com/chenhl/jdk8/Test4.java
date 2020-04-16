package com.chenhl.jdk8;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2018/1/25 18:47
 */
public class Test4 {

    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("1", 100);
        map.put("2", 200);
        map.forEach((k, v) ->
            System.out.println(k +": " + v)
        );



    }
}
