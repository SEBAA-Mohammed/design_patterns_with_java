package com.mohammedsebaa;

import java.util.Stack;

public class ExpressionTreeBuilder {
    private final Stack<ExpressionNode> stack;

    public ExpressionTreeBuilder() {
        this.stack = new Stack<>();
    }

    public void buildNumber(double value) {
        stack.push(new NumberNode(value));
    }

    public void buildOperator(char operator) {
        if (stack.size() < 2) {
            throw new IllegalStateException("Pas assez d'opérandes pour l'opérateur: " + operator);
        }

        ExpressionNode right = stack.pop();
        ExpressionNode left = stack.pop();
        stack.push(new OperatorNode(operator, left, right));
    }

    public ExpressionNode getResult() {
        if (stack.size() != 1) {
            throw new IllegalStateException("Expression invalide: il reste " + stack.size() + " éléments dans la pile");
        }
        return stack.peek();
    }
}