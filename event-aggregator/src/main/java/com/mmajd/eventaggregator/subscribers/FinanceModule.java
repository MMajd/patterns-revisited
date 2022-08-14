package com.mmajd.eventaggregator.subscribers;

import com.mmajd.eventaggregator.domain.Order;
import com.mmajd.eventaggregator.events.Event;

public class FinanceModule implements ISubscriber<Event<Order>> {
    public FinanceModule() {}

    @Override
    public <T extends Event<?>> void onEvent(T e) {
        System.out.printf("Finance: Got event  %s\n", e);
    }
}
