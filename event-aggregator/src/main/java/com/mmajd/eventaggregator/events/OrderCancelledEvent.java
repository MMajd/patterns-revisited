package com.mmajd.eventaggregator.events;

import com.mmajd.eventaggregator.domain.Order;


public class OrderCancelledEvent extends Event<Order>{
    public OrderCancelledEvent(Order data) {
        super("OrderCancelled", data);
    }
}
