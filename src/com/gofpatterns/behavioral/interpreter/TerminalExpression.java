package com.gofpatterns.behavioral.interpreter;

public class TerminalExpression implements Expression {

    private String value;

    public TerminalExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean test(String s) {
        return value.contains(s);
    }
}
