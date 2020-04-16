package com.chenhl.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @description: 方法引用测试
 * <p>
 * 方法引用：实际上是Lambda表达式的一种语法糖，我们可以将方法引用看做是一个“函数指针”， 指向一个已存在的方法的指针
 * <p>
 * 分类：
 * 1. 类名::静态方法名
 * 2. 对象名::实例方法名
 * 3. 类名::实例方法名
 * 4. 类名::new
 * @author: TF019387 chenhonglei
 * @date: 2017/11/17 20:56
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 40);
        Student student2 = new Student("lisi", 50);
        Student student3 = new Student("wangwu", 90);
        Student student4 = new Student("zhaoliu", 20);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        // 1. 类名::静态方法名

        //使用Lambda表达式来完成排序
//        Collections.sort(list, (s1, s2) -> s1.getScore() - s2.getScore());
//        System.out.println(list);

        //使用方法引用来完成排序
//        list.sort(Student::comparaByScore);
//        System.out.println(list);

        // 2. 对象名::实例方法名
//        StudentComparator studentComparator = new StudentComparator();

        // 使用Lambda表达式
//        Collections.sort(list, (s1, s2)-> studentComparator.compareByName(s1, s2));
//        System.out.println(list);

        //使用方法引用
//        list.sort(studentComparator::comparaByScore);
//        System.out.println(list);

        // 3. 类名::实例方法名
//        list.sort(Student::compareByName);
//        System.out.println(list);

        List<String> cities = Arrays.asList("qingdao", "chongqin", "tianjin", "beijing");
//        Collections.sort(cities, (c1, c2)->c1.compareTo(c2));
//        cities.forEach(System.out::println);

//        cities.sort(String::compareToIgnoreCase);


        // 4. 构造方法引用
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get() + "_test");

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        methodReferenceTest.getString("hello", String::new);

    }

    public String getString(String str, Function<String, String> function) {
        return function.apply(str);
    }

}
