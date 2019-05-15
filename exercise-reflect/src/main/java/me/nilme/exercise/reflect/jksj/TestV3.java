package me.nilme.exercise.reflect.jksj;

import java.lang.reflect.Method;

/**
 * @author weizhuang
 * Created on 2019-05-14.
 */
public class TestV3 {

    // 在运行指令中添加如下两个虚拟机参数：
// -Djava.lang.Integer.IntegerCache.high=128
// -Dsun.reflect.noInflation=true
    public static void target(int i) {
        // 空方法
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("me.nilme.exercise.reflect.jksj.TestV3");
        Method method = klass.getMethod("target", int.class);
        method.setAccessible(true);  // 关闭权限检查

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
