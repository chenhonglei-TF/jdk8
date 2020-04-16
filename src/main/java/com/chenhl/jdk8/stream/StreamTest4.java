package com.chenhl.jdk8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description: StreamTest4
 * @author: TF019387 chenhonglei
 * @date: 2017/11/19 14:15
 */
public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

        // 将一个流转换成一个数组
//        String[] strings = stream.toArray(length -> new String[length]);
//        String[] strings = stream.toArray(String[]::new);

//        for (String string : strings) {
//            System.out.println(string);
//        }


        // 将一个流转换成一个List集合
//        List<String> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);

//        List<String> list = stream.collect(() -> new ArrayList<>(),
//                (theList, item) -> theList.add(item),
//                (left, right) -> left.addAll(right));
//        list.forEach(System.out::println);

//        List<String> list = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        list.forEach(System.out::println);

        // 将一个流转换成一个集合
//        ArrayList<String> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));
//        LinkedList<String> linkedList = stream.collect(Collectors.toCollection(LinkedList::new));
//        TreeSet<String> treeSet = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(treeSet.getClass());
//        System.out.println(treeSet);

        // 将元素拼接起来
        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
