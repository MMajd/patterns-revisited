package com.mmajd.eventaggregator.subscribers;

import com.mmajd.eventaggregator.domain.Order;
import com.mmajd.eventaggregator.events.Event;

public class LoggingModule implements ISubscriber<Event<Order>> {
    @Override
    public <T extends Event<?>> void onEvent(T e) {
        System.out.printf("Logging: Got event %s\n", e);
    }
}
