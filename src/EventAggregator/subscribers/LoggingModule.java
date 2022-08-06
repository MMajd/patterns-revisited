package EventAggregator.subscribers;

import EventAggregator.aggregators.IEventAggregator;
import EventAggregator.domain.Order;
import EventAggregator.events.Event;

import java.util.ArrayList;
import java.util.Arrays;

public class LoggingModule implements ISubscriber<Event<Order>> {
    @Override
    public <T extends Event<?>> void onEvent(T e) {
        System.out.printf("Logging: Got event %s\n", e);
    }
}
