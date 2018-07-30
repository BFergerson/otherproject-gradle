package com.gitdetective;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Tester2 {
    private static int nextNodeFeatureId = 0;

    // Non-private for testing purposes
    static final Map<Class<? extends Object>, NodeFeatureData> nodeFeatures = new HashMap<>();
    private static final Map<Integer, Class<? extends Object>> idToFeature = new HashMap<>();

    private static class NodeFeatureData implements Serializable {
        private final Map<Object, ? extends Object> factory;
        private final int id;

        private <T extends Object> NodeFeatureData(
                Map<Object, T> factory) {
            this.factory = factory;
            id = nextNodeFeatureId++;
        }
    }

    static {
        registerFeature(Object.class, null);
    }

    private Tester2() {
        // Static only
    }

    private static <T extends Object> void registerFeature(Class<T> type,
                                                           Map<Object, T> factory) {
        NodeFeatureData featureData = new NodeFeatureData(factory);
        nodeFeatures.put(type, featureData);
        idToFeature.put(featureData.id, type);
    }
}
