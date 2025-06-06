package com.mohammedsebaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WhereExpression implements SQLExpression {
    private SQLExpression condition;
    private SQLExpression source;

    public WhereExpression(SQLExpression source, SQLExpression condition) {
        this.source = source;
        this.condition = condition;
    }

    @Override
    public List<Map<String, Object>> execute(DatabaseContext context) {
        List<Map<String, Object>> rows = source.execute(context);
        List<Map<String, Object>> result = new ArrayList<>();
        if (condition instanceof ComparisonExpression) {
            ComparisonExpression comp = (ComparisonExpression) condition;
            for (Map<String, Object> row : rows) {
                if (comp.evaluate(row)) {
                    result.add(row);
                }
            }
        }
        return result;
    }
}
