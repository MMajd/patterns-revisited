package com.mmajd.eventaggregator.events;

import com.mmajd.eventaggregator.domain.Order;

public class OrderShippedEvent extends Event<Order>{
    public OrderShippedEvent(String id, Order data) {
        super("OrderShippedEvent", data);
    }
}
