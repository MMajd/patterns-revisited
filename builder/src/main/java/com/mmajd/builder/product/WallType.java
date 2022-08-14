package com.mmajd.builder.product;

public enum WallType {
    WOODEN_WALLS("WOODEN WALLS"),
    CEMENT_WALLS("CEMENT WALLS");

    private final String value;

    private WallType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
