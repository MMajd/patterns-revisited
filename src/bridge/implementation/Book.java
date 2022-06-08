package bridge.implementation;

import bridge.abstraction.Manuscript;
import bridge.bridge.IFormatter;

public class Book extends Manuscript {
    private final IFormatter formatter;
    public Book(final IFormatter formatter) {
        this.formatter = formatter;
    }

    public Book(final IFormatter formatter, String title, String content) {
        this(formatter);
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        formatter.format(title, content);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
