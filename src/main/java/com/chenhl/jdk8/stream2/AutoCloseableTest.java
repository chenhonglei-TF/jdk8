package com.chenhl.jdk8.stream2;

/**
 * @description:
 * @author: TF019387 chenhonglei
 * @date: 2017/12/29 15:53
 */
public class AutoCloseableTest implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close invoked!");
    }

    public void doSomething() {
        System.out.println("doSomething invoked!");
    }

    public static void main(String[] args) throws Exception{
        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            autoCloseableTest.doSomething();
        }
    }
}
