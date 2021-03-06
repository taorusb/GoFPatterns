package com.gofpatterns.behavioral.cor;

public class Paypal implements PaySystem {

    private int balance;
    private PaySystem paySystem;

    public Paypal() {
        balance = 1000;
    }

    public void setNextPaySystem(PaySystem paySystem) {
        this.paySystem = paySystem;
    }

    @Override
    public void makePayment(int invoice) {
        if (balance < invoice) {
            paySystem.makePayment(invoice);
        } else {
            balance -= invoice;
            payInvoice();
        }
    }
}
