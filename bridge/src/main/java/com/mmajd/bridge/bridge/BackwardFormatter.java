package com.mmajd.bridge.bridge;

public class BackwardFormatter implements IFormatter {

    @Override
    public void format(String title, String content) {
        System.out.format("%s : %s\n", title, new StringBuffer(content).reverse().toString());
    }
}
