package com.mohammedsebaa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseContext {
    private Map<String, List<Map<String, Object>>> tables = new HashMap<>();

    public List<Map<String, Object>> getTable(String tableName) {
        return tables.get(tableName);
    }

    public void addTable(String name, List<Map<String, Object>> data) {
        tables.put(name, data);
    }
}
