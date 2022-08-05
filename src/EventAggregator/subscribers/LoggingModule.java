package EventAggregator.subscribers;

import EventAggregator.aggregators.IEventAggregator;
import EventAggregator.domain.Order;
import EventAggregator.events.Event;

import java.util.ArrayList;
import java.util.Arrays;

public class LoggingModule extends Subscriber<Event<Order>> {
    public LoggingModule(IEventAggregator aggregator) {
        super(new ArrayList<String>(Arrays.asList("ch1", "ch2")), aggregator);

    }
    @Override
    public <T extends Event<?>> void onEvent(T e) {
        System.out.printf("Logging: Got event %s\n", e);
    }
}
