package com.mohammedsebaa;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static Configuration instance;
    private Map<String, String> configMap;

    private Configuration() {
        configMap = new HashMap<>();
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        configMap.put(key, value);
    }

    public String getConfig(String key) {
        return configMap.get(key);
    }
}