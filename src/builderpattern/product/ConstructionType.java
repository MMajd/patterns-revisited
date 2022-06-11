package builderpattern.product;

public enum ConstructionType {
    WOODEN("WOODEN"),
    STEEL("STEEL"),
    HYPERED("HYPERED");

    private final String value;

    private ConstructionType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
