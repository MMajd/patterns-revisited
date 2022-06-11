package BridgePattern.implementation;

import BridgePattern.abstraction.Manuscript;
import BridgePattern.bridge.IFormatter;

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
