package com.gitdetective;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

public class Tester2 {
    static Logger LOGGER = LoggerFactory.getLogger(Tester2.class);

    static {
        Iterator itr = null;
        while (itr.hasNext()) {
            Object ext = null;
            if (ext == null) {
                LOGGER.error("failed to load extension " + ext);
            } else {
                LOGGER.debug("adding ModelConverter: " + ext);
            }
        }
    }

    private static class outer1 {
        private void node1() {
            new MyClass().myMethod2("what");
        }

        private static class inner2 {
            private void node2() {
                new MyClass().myMethod();
            }
        }
    }
}
