package com.mohammedsebaa;

import java.util.List;
import java.util.Map;

public class TableExpression implements SQLExpression {
    private String tableName;

    public TableExpression(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public List<Map<String, Object>> execute(DatabaseContext context) {
        return context.getTable(tableName);
    }
}
