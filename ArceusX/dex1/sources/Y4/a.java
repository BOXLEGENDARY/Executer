package Y4;

public class a<T> {

    private final Class<T> f8170a;

    private final T f8171b;

    public T a() {
        return this.f8171b;
    }

    public Class<T> b() {
        return this.f8170a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f8170a, this.f8171b);
    }
}
