package com.chenhl.jdk8;

import java.util.function.Supplier;

/**
 * @description: 测试Supplier
 * @author: TF019387 chenhonglei
 * @date: 2017/11/13 21:31
 */
public class StudentTest {

    public static void main(String[] args) {

//        Supplier<Student> supplier = () -> new Student();
//        System.out.println(supplier.get().getName());

        // 使用构造方法引用,如果不存在不带参数的构造方法的话，会编译失败
        Supplier<Student> supplier = Student::new;
        System.out.println(supplier.get().getName());



    }
}
