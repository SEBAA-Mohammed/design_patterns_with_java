package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectExpression implements SQLExpression {
    private ColumnExpression columns;
    private SQLExpression source;
    private SQLExpression where;

    public SelectExpression(ColumnExpression columns, SQLExpression source) {
        this(columns, source, null);
    }

    public SelectExpression(ColumnExpression columns, SQLExpression source, SQLExpression where) {
        this.columns = columns;
        this.source = source;
        this.where = where;
    }

    @Override
    public List<Map<String, Object>> execute(DatabaseContext context) {
        List<Map<String, Object>> rows = (where != null) ? where.execute(context) : source.execute(context);
        List<String> cols = columns.getColumns();
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            if (cols.size() == 1 && cols.get(0).equals("*")) {
                result.add(new HashMap<>(row));
            } else {
                Map<String, Object> filtered = new HashMap<>();
                for (String col : cols) {
                    filtered.put(col, row.get(col));
                }
                result.add(filtered);
            }
        }
        return result;
    }
}
