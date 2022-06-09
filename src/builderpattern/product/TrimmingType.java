package builderpatter.product;

public enum TrimmingType {
    EXPENSIVE("EXPENSIVE"),
    MODERATE("MODERATE"),
    CHEEP("CHEEP");

    private final String value;

    private TrimmingType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
