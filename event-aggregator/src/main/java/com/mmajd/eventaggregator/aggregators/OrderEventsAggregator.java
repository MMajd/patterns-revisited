package com.mmajd.eventaggregator.aggregators;

import com.mmajd.eventaggregator.events.Event;
import com.mmajd.eventaggregator.subscribers.ISubscriber;

import java.lang.ref.WeakReference;
import java.util.*;

public class OrderEventsAggregator implements IEventAggregator {
    private final Map<String, List<WeakReference<ISubscriber<? extends Event<?>>>>> eventSubscribersList = new WeakHashMap<>();

    @Override
    public <T extends Event<?>> void publish(String topic, T e) {
        List<WeakReference<ISubscriber<? extends Event<?>>>> subs = eventSubscribersList.get(topic);
        List<WeakReference<ISubscriber<? extends Event<?>>>> toBeRemoved = new ArrayList<>();

        for (WeakReference<ISubscriber<? extends Event<?>>> subRef: subs) {
            if (Objects.nonNull(subRef.get()))  {
                Objects.requireNonNull(subRef.get()).onEvent(e);
            }
            else {
                toBeRemoved.add(subRef);
            }
        }

        for (WeakReference<ISubscriber<? extends Event<?>>> r: toBeRemoved) {
            subs.remove(r);
        }
    }

    @Override
    public void subscribe(List<String> topics, ISubscriber<? extends Event<?>> ISubscriber) {
        for (String t : topics) {
            if (eventSubscribersList.containsKey(t)) {
                eventSubscribersList.computeIfPresent(t, (k, v) -> {
                    v.add(new WeakReference<>(ISubscriber));
                    return v;
                });
            }  else {
                eventSubscribersList.computeIfAbsent(t, k -> new LinkedList<>(){{ add(new WeakReference<>(ISubscriber)); }});
            }
        }
    }
}
