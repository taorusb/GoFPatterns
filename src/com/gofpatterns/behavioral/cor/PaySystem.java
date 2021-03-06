package com.gofpatterns.behavioral.cor;

public interface PaySystem {
    void makePayment(int invoice);

    default void payInvoice() {
        System.out.println("Invoice has been paid.");
    }
}
