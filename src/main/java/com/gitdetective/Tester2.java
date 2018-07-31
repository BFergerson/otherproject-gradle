package com.gitdetective;

public class Tester2 {
    private static class outer1 {
        private void node1() {
            new MyClass().myMethod();
        }

        private static class inner2 {
            private void node2() {
                new MyClass().myMethod();
            }
        }
    }
}
