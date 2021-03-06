package com.gofpatterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void notifyReceipt(List<String> tickets);
}
