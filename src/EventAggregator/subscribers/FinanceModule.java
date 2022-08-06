package EventAggregator.subscribers;

import EventAggregator.domain.Order;
import EventAggregator.events.Event;

public class FinanceModule implements ISubscriber<Event<Order>> {
    public FinanceModule() {}

    @Override
    public <T extends Event<?>> void onEvent(T e) {
        System.out.printf("Finance: Got event  %s\n", e);
    }
}
