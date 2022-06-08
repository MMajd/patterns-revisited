package bridgepattern.implementation;

import bridgepattern.abstraction.Manuscript;
import bridgepattern.bridge.IFormatter;

public class Book extends Manuscript {
    /**
     * 
     * @param formatter
     * @param title
     * @param content
     */
    public Book(final IFormatter formatter, String title, String content) {
        super(formatter);
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
