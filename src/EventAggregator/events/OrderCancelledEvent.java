package EventAggregator.events;

import EventAggregator.domain.Order;


public class OrderCancelledEvent extends Event<Order>{
    public OrderCancelledEvent(Order data) {
        super("OrderCancelled", data);
    }
}
