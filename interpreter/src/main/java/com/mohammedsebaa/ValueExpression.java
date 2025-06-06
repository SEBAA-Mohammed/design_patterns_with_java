package com.mohammedsebaa;

public class ValueExpression implements SQLExpression {
    private Object value;

    public ValueExpression(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public java.util.List<java.util.Map<String, Object>> execute(DatabaseContext context) {
        // Not used directly, used in ComparisonExpression
        return null;
    }
}
