package com.mmajd.eventaggregator.events;

import com.mmajd.eventaggregator.domain.Order;

public class OrderCreatedEvent extends Event<Order>{
    public OrderCreatedEvent(Order data) {
        super("OrderCreatedEvent", data);
    }
}
