package com.mohammedsebaa;

public class Main {
    public static void main(String[] args) {
        String expression = "3 5 9 + 2 * +";
        ExpressionTree tree = new ExpressionTree(expression);

        System.out.println("Expression en notation infixe: " + tree);
        System.out.println("Résultat de l'évaluation: " + tree.evaluate());

        String expression2 = "1 2 3 * 4 / +";
        ExpressionTree tree2 = new ExpressionTree(expression2);

        System.out.println("\nExpression en notation infixe: " + tree2);
        System.out.println("Résultat de l'évaluation: " + tree2.evaluate());
    }
}