package EventAggregator;

import EventAggregator.domain.*;
import EventAggregator.events.Event;
import EventAggregator.events.OrderCancelledEvent;
import EventAggregator.events.OrderCreatedEvent;
import EventAggregator.subscribers.*;
import EventAggregator.aggregators.*;
import driver.PatternDriver;

import java.util.*;

public class EventAggregatorDriver implements PatternDriver {
    @Override
    public void run(Object... args) {
        /* Event Aggregator here plays the publisher role plus its primary goal */
        IEventAggregator eventAggregator = new OrderEventsAggregator();
        Subscriber<Event<Order>> loggingModule = new LoggingModule(eventAggregator);
        Subscriber<Event<Order>> financeModule = new FinanceModule(eventAggregator);

        Client c1 = new Client("C1", "C1 Address");
        Client c2 = new Client("C2", "C2 Address");

        List<OrderItem> c1Items = new ArrayList<>();
        c1Items.add(new OrderItem("Item1", 20, 2));
        c1Items.add(new OrderItem("Item2", 10, 5));

        List<OrderItem> c2Items = new ArrayList<>();
        c2Items.add(new OrderItem("Item3", 8, 4));
        c2Items.add(new OrderItem("Item4", 40, 1));

        Order o1 = new Order(c1, c1Items);
        Order o2 = new Order(c2, c2Items);
        Order o3 = new Order(c2, c1Items);

        eventAggregator.publish("ch1", new OrderCreatedEvent(o1));
        o1.setStatus(OrderStatus.CANCELLED);
        eventAggregator.publish("ch1", new OrderCancelledEvent(o1));

        eventAggregator.publish("ch2", new OrderCreatedEvent(o2));
        eventAggregator.publish("ch3", new OrderCreatedEvent(o3));
    }
}