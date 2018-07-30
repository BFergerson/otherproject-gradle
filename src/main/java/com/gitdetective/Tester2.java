package com.gitdetective;

import java.io.Serializable;
import java.util.Map;

public class Tester2 {
    private static class NodeFeatureData implements Serializable {
        private <T extends Object> NodeFeatureData(Map<Object, T> factory) {
            new MyClass().myMethod();
            System.out.println(String.valueOf(10));
        }
    }
}
