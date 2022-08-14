package com.mmajd.eventaggregator.domain;

import java.util.*;

public class Order {
    final private Client client;
    private List<OrderItem> orderItems;
    private OrderStatus status;

    public Order(Client client, List<OrderItem> items) {
        this.client = client;
        this.orderItems= items;
        status = OrderStatus.CREATED;
    }

    public Order(Client client, List<OrderItem> items, OrderStatus status) {
        this(client, items);
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", orderItems=" + orderItems +
                ", status=" + status +
                '}';
    }
}
