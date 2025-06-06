package com.mohammedsebaa;

public class OperatorNode extends ExpressionNode {
    private final char operator;
    private final ExpressionNode left;
    private final ExpressionNode right;

    public OperatorNode(char operator, ExpressionNode left, ExpressionNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        double leftValue = left.evaluate();
        double rightValue = right.evaluate();

        return switch (operator) {
            case '+' -> leftValue + rightValue;
            case '-' -> leftValue - rightValue;
            case '*' -> leftValue * rightValue;
            case '/' -> leftValue / rightValue;
            default -> throw new IllegalStateException("Opérateur non supporté: " + operator);
        };
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
    }
}