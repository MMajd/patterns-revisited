package EventAggregator.aggregators;

import EventAggregator.events.*;
import EventAggregator.subscribers.ISubscriber;

import java.util.List;

public interface IEventAggregator {
    <T extends Event<?>> void publish(String topic, T e);
    void subscribe(List<String> topics, ISubscriber<? extends Event<?>> ISubscriber);
}
