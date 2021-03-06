package com.gofpatterns.behavioral.cor;

public class YandexMoney implements PaySystem {

    private PaySystem nextPaySystem;
    private int balance;

    public YandexMoney() {
        balance = 2000;
    }

    public void setNextPaySystem(PaySystem paySystem) {
        nextPaySystem = paySystem;
    }

    @Override
    public void makePayment(int invoice) {
        if (balance < invoice) {
            nextPaySystem.makePayment(invoice);
        } else {
            balance -= invoice;
            payInvoice();
        }
    }
}
