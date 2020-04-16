package com.chenhl.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description: 字符串排序
 * @author: TF019387 chenhonglei
 * @date: 2017/11/5 11:33
 *
 *
 * 注意：
 * 1. 一个Lambda表达式可以有零个或多个参数
 * 2. 参数的类型既可以明确声明，也可以根据上下文推断。比如(String str1, String str2)和(str1, str2)效果相同
 * 3. 所有参数需包含在圆括号内，参数之间用逗号相隔。
 * 4. 空的圆括号代表参数集为空。
 * 5. 当只有一个参数时，并且类型可以推导，括号可以省略。
 * 6. Lambda表达式可以包含0个或多条语句
 * 7. 如果lambda表达式的主体只有一条语句，花括号{}也是可以省略的，匿名函数的返回值类型与该主体表达式一致
 * 8. 如果lambda表达式的主体包含一条以上语句，则表达式必须包含在花括号内，匿名函数的返回值类型与代码块的返回值类型一致，若没有返回则为空。
 */
public class StringComparator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println(names);

        // statement lambda
//        Collections.sort(names, (String str1, String str2) -> {
//            return str2.compareTo(str1);
//        });
//
//        System.out.println(names);

        // expression lambda
//        Collections.sort(names, (str1, str2) -> str2.compareTo(str1));
//
//        System.out.println(names);

        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);


    }
}
