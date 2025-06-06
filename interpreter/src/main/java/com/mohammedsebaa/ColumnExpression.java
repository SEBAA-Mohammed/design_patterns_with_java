package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ColumnExpression implements SQLExpression {
    private List<String> columns;

    public ColumnExpression(List<String> columns) {
        this.columns = columns;
    }

    @Override
    public List<Map<String, Object>> execute(DatabaseContext context) {
        return new ArrayList<>();
    }

    public List<String> getColumns() {
        return columns;
    }
}
