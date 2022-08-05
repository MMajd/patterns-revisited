package EventAggregator.events;

import EventAggregator.domain.Order;

public class OrderCreatedEvent extends Event<Order>{
    public OrderCreatedEvent(Order data) {
        super("OrderCreatedEvent", data);
    }
}
