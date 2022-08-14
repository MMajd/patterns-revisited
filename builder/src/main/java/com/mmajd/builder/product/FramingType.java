package com.mmajd.builder.product;

public enum FramingType {
    WOODEN("HARD WOOD FRAMES"),
    CEMENT_COLUMNS("CEMENT COLUMNS");

    private final String value;

    private FramingType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
