package com.chenhl.jdk8;

public class Test2 {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
//        test2.myTest(new MyInteface() {
//            @Override
//            public void test() {
//                System.out.println("mytest");
//            }
//        });

//        test2.myTest(() -> {
//            System.out.println("mytest");
//        });

        MyInteface myInteface = () -> System.out.println("hello world");

        /*
        com.chenhl.jdk8.Test2$$Lambda$1/990368553@6d311334
         */
        System.out.println(myInteface);
        System.out.println(myInteface.getClass().getSuperclass());
        System.out.println(myInteface.getClass().getInterfaces()[0]);
    }

    public void myTest(MyInteface myInteface) {
        System.out.println(1);
        myInteface.test();
        System.out.println(2);
    }
}

@FunctionalInterface
interface MyInteface {

    void test();

    String toString();
}
