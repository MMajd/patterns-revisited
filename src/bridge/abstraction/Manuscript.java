package bridge.abstraction;

import bridge.bridge.IFormatter;

public abstract class  Manuscript {
    protected IFormatter formatter;
    protected String title;
    protected String content;
    public abstract void print();
}
