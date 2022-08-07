package EventAggregator.events;

public abstract class Event<T> {
    private final String type;
    private final T data;

    public Event(String type, T data)  {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type; // no need to be cloned, string is already immutable
    }

    public T getData() {
        return data; // should be cloned not real reference to data, to prevent contimenation
    }

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
