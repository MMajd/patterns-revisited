package com.mmajd.eventaggregator.subscribers;

import com.mmajd.eventaggregator.domain.Order;
import com.mmajd.eventaggregator.events.Event;

public interface ISubscriber<E extends Event<? extends Order>> {
    <T extends Event<?>> void onEvent(T e);
}
