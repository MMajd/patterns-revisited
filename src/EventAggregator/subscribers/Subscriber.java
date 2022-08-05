package EventAggregator.subscribers;

import EventAggregator.aggregators.IEventAggregator;
import EventAggregator.events.Event;

import java.util.*;

public abstract class Subscriber<E extends Event<?>> {
    private final IEventAggregator aggregator;
    public Subscriber(List<String> topics, IEventAggregator aggregator) {
        this.aggregator = aggregator;

        for (String topic : topics) aggregator.subscribe(topic, this);
    }

    public IEventAggregator getAggregator() {
        return aggregator;
    }

    public abstract  <T extends Event<?>> void onEvent(T e);
}
