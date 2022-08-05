package EventAggregator.domain;

public enum OrderStatus {
    CREATED("CREATED"),
    SHIPPED("SHIPPED"),
    CANCELLED("CANCELLED");
    private final String value;

    private OrderStatus(final String value) { this.value = value; }

    public String getValue() {
        return value;
    }
}
