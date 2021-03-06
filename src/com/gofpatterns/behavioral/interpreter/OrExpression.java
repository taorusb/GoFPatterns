package com.gofpatterns.behavioral.interpreter;

public class OrExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public OrExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean test(String s) {
        return leftExpression.test(s) || rightExpression.test(s);
    }
}
