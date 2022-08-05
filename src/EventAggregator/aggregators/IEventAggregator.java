package EventAggregator.aggregators;

import EventAggregator.events.*;
import EventAggregator.subscribers.Subscriber;

public interface IEventAggregator {
    <T extends Event<?>> void publish(String topic, T e);
    void subscribe(String topic, Subscriber<?> subscriber);
}
