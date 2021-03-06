package com.gofpatterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {

        Expression expression1 = new TerminalExpression("car");
        Expression expression2 = new TerminalExpression("bicycle");
        Expression andExp = new AndExpression(expression1, expression2);

        System.out.println(andExp.test("airplane"));
    }
}
