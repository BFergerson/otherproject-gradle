package com.gitdetective;

import com.google.common.collect.Lists;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StateNode;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App2 {
    static {
        new MyClass().myMethod();
        System.out.println(String.valueOf(10));
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List arrayList = Lists.newArrayList();
        MyClass yay = new MyClass();
        arrayList.add(yay);

        yay.myMethod();
        System.out.println(arrayList.size());
    }

    public static void anotherOne() {
        MyClass yay = new MyClass();
        yay.myMethod();
    }

    static {
        registerFeature(App2.class, null);
    }

    private static <T extends App2> void registerFeature(Class<T> type,
                                                         Map<StateNode, T> factory) {
        System.out.println("test");
    }
}
