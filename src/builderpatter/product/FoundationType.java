package builderpatter.product;

public enum FoundationType {
    WOODEN_FOUNDATION("WOODEN FOUNDATION"),
    CEMENT_FOUNDATION("CEMENT FOUNDATION");

    private final String value;

    private FoundationType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
