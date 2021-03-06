package me.nilme.exercise.java.reflect.jksj;

import java.lang.reflect.Method;

/**
 * @author weizhuang
 * Created on 2019-05-14.
 */
public class TestV1 {

    public static void target(int i) {
        // 空方法
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("me.nilme.exercise.reflect.jksj.TestV1");
        Method method = klass.getMethod("target", int.class);

        long current = System.currentTimeMillis();
        for (int i = 1; i <= 2_000_000_000; i++) {
            if (i % 100_000_000 == 0) {
                long temp = System.currentTimeMillis();
                System.out.println(temp - current);
                current = temp;
            }

            method.invoke(null, 128);
        }
    }
}
