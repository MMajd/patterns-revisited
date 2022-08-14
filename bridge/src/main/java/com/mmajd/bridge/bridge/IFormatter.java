package com.mmajd.bridge.bridge;

public interface IFormatter {
    default void format(String title, String content) {
        System.out.format("%s: %s\n", title, content);
    }
}
