package BridgePattern.abstraction;

import BridgePattern.bridge.IFormatter;

public abstract class Manuscript {
    protected final IFormatter formatter;
    protected String title;
    protected String content;

    public abstract void print();

    protected Manuscript(final IFormatter formatter) {
        this.formatter = formatter;
    }
}
