public abstract class Event {
    protected String description;

    public Event(String description) {
        this.description = description;
    }

    public abstract void occur();
}