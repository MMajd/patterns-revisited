package bridge.implementation;

import bridge.abstraction.Manuscript;
import bridge.bridge.IFormatter;

import javax.swing.*;

public class ResearchPaper extends Manuscript {
    private final IFormatter formatter;
    private String title;
    private String content;

    public ResearchPaper(final IFormatter formatter) {
        this.formatter = formatter;
    }

    public ResearchPaper(final IFormatter formatter, String title, String content) {
        this(formatter);
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        formatter.format(title, content);
    }
}
