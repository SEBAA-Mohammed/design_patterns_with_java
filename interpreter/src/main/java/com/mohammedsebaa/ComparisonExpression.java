package com.mohammedsebaa;

import java.util.List;
import java.util.Map;

public class ComparisonExpression implements SQLExpression {
    private String column;
    private String operator;
    private Object value;

    public ComparisonExpression(String column, String operator, Object value) {
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public List<Map<String, Object>> execute(DatabaseContext context) {
        return null;
    }

    public boolean evaluate(Map<String, Object> row) {
        Object colValue = row.get(column);
        if (colValue instanceof Comparable && value instanceof Comparable) {
            Comparable c1 = (Comparable) colValue;
            Comparable c2 = (Comparable) value;
            switch (operator) {
                case "=":
                    return c1.compareTo(c2) == 0;
                case ">":
                    return c1.compareTo(c2) > 0;
                case "<":
                    return c1.compareTo(c2) < 0;
                case ">=":
                    return c1.compareTo(c2) >= 0;
                case "<=":
                    return c1.compareTo(c2) <= 0;
                case "!=":
                    return c1.compareTo(c2) != 0;
            }
        }
        return false;
    }
}
