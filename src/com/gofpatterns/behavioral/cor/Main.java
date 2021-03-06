package com.gofpatterns.behavioral.cor;

public class Main {
    public static void main(String[] args) {

        Paypal paypal = new Paypal();
        YandexMoney yandexMoney = new YandexMoney();
        WebMoney webMoney = new WebMoney();

        paypal.setNextPaySystem(yandexMoney);
        yandexMoney.setNextPaySystem(webMoney);
        paypal.makePayment(3000);
    }
}
