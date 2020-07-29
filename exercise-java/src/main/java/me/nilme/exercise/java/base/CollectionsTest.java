package me.nilme.exercise.java.base;

import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nilme on 2020/4/15.
 */
public class CollectionsTest {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        List<String> strings = Collections.synchronizedList(arr);

        strings.add("xxx");

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<String> xxx = integers.stream().map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(xxx);

    }
}
