package EventAggregator.aggregators;

import EventAggregator.events.Event;
import EventAggregator.subscribers.Subscriber;

import java.lang.ref.WeakReference;
import java.util.*;

public class OrderEventsAggregator implements IEventAggregator {
    private final Map<String, List<WeakReference<Subscriber<?>>>> eventSubscribersList = new WeakHashMap<>();

    @Override
    public <T extends Event<?>> void publish(String topic, T e) {
        List<WeakReference<Subscriber<?>>> subs = eventSubscribersList.get(topic);
        List<WeakReference<Subscriber<?>>> toBeRemoved = new ArrayList<>();

        for (WeakReference<Subscriber<?>> subRef: subs) {
            if (Objects.nonNull(subRef.get())) subRef.get().onEvent(e);
            else toBeRemoved.add(subRef);
        }

        for (WeakReference<Subscriber<?>> r: toBeRemoved) {
            subs.remove(r);
        }
    }

    @Override
    public void subscribe(String topic, Subscriber<?> subscriber) {
        if (eventSubscribersList.containsKey(topic)) {
            eventSubscribersList.computeIfPresent(topic, (k, v) -> {
                v.add(new WeakReference<Subscriber<?>>(subscriber));
                return v;
            });
        }  else {
            eventSubscribersList.computeIfAbsent(topic,
                    k -> new LinkedList<>(){{add(new WeakReference<Subscriber<?>>(subscriber));}});
        }
    }
}
