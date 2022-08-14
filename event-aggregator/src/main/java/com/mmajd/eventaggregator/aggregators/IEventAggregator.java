package com.mmajd.eventaggregator.aggregators;

import com.mmajd.eventaggregator.events.Event;
import com.mmajd.eventaggregator.subscribers.ISubscriber;

import java.util.List;

public interface IEventAggregator {
    <T extends Event<?>> void publish(String topic, T e);
    void subscribe(List<String> topics, ISubscriber<? extends Event<?>> ISubscriber);
}
