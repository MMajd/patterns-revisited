package EventAggregator.subscribers;

import EventAggregator.domain.Order;
import EventAggregator.events.Event;

public interface ISubscriber<E extends Event<? extends Order>> {
    <T extends Event<?>> void onEvent(T e);
}
