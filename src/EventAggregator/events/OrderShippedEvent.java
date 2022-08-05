package EventAggregator.events;

import EventAggregator.domain.Order;
import EventAggregator.domain.OrderStatus;

public class OrderShippedEvent extends Event<Order>{
    public OrderShippedEvent(String id, Order data) {
        super("OrderShippedEvent", data);
    }
}
