package EventAggregator.subscribers;

import EventAggregator.aggregators.IEventAggregator;
import EventAggregator.domain.Order;
import EventAggregator.events.Event;

import java.util.ArrayList;
import java.util.Arrays;

public class FinanceModule extends Subscriber<Event<Order>> {
    public FinanceModule(IEventAggregator aggregator) {
        super(new ArrayList<String>(Arrays.asList("ch1", "ch3")), aggregator);
    }

    @Override
    public <T extends Event<?>> void onEvent(T e) {
        System.out.printf("Finance: Got event  %s\n", e);
    }
}
