package com.chenhl.jdk8;

import java.util.function.Supplier;

/**
 * @description: Supplier接口：不接收参数，返回一个结果
 * @author: TF019387 chenhonglei
 * @date: 2017/11/13 21:28
 */
public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hello world";

        System.out.println(supplier.get());
    }
}
