package com.mmajd.bridge.implementation;


import com.mmajd.bridge.abstraction.*;
import com.mmajd.bridge.bridge.*;

public class ResearchPaper extends Manuscript {
    /**
     * @param formatter
     * @param title
     * @param content
     */
    public ResearchPaper(final IFormatter formatter, String title, String content) {
        super(formatter);
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        formatter.format(title, content);
    }
}
