package com.gofpatterns.behavioral.cor;

public class WebMoney implements PaySystem {

    private int balance;

    public WebMoney() {
        balance = 3000;
    }

    @Override
    public void makePayment(int invoice) {
        if (balance < invoice) {
            System.out.println("The invoice cannot be paid. You don't enough money.");

        } else {
            balance -= invoice;
            payInvoice();
        }
    }
}
