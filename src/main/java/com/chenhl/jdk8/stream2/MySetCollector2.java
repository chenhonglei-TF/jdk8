package com.chenhl.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2017/12/16 20:39
 */
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>> {

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return () -> new HashSet<>();
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return (set, item) -> {
            System.out.println("当前线程: " + Thread.currentThread().getName() + ", item: " + item);
            set.add(item);
        };
    }

    // 只有在并行流的时候才会被调用
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
            System.out.println("combiner当前线程：" + Thread.currentThread().getName() + ", =======1==================" + set1);
            set1.addAll(set2);
            System.out.println("combiner当前线程：" + Thread.currentThread().getName() + ", =======2==================" + set1);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked!");
        return set -> {
//            Map<T, T> map = new HashMap<>();
            Map<T, T> map = new TreeMap<>();
            set.forEach(t -> map.put(t, t));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
//        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
        // 当中间结果类型和返回结果类型不一致时，指定IDENTITY_FINISH属性，会抛异常
//        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH));
        // CONCURRENT属性：表示结果容器只有一个，只有一个结果容器的时候，就不需要合并了，所以conbiner不会被执行
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "a", "b", "c", "d", "e", "f", "g");

        Set<String> set = new HashSet<>();
        set.addAll(list);

        System.out.println("set: " + set);

//        Map<String, String> map = set.stream().collect(new MySetCollector2<>());
        Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());

        System.out.println(map);
    }
}
