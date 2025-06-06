package com.mohammedsebaa;

public class ExpressionTree {
    private final ExpressionNode root;

    public ExpressionTree(String expression) {
        ExpressionTreeBuilder builder = new ExpressionTreeBuilder();

        String[] tokens = expression.split("\\s+");
        for (String token : tokens) {
            if (isOperator(token.charAt(0))) {
                builder.buildOperator(token.charAt(0));
            } else {
                builder.buildNumber(Double.parseDouble(token));
            }
        }

        this.root = builder.getResult();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public double evaluate() {
        return root.evaluate();
    }

    @Override
    public String toString() {
        return root.toString();
    }
}