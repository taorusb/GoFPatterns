package com.gofpatterns.behavioral.interpreter;

public class AndExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public AndExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean test(String s) {
        return leftExpression.test(s) && rightExpression.test(s);
    }
}
