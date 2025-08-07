package u2;

public final class c<T> implements b<T> {

    private static final c<Object> f23902b = new c<>(null);

    private final T f23903a;

    private c(T t7) {
        this.f23903a = t7;
    }

    public static <T> b<T> a(T t7) {
        return new c(d.c(t7, "instance cannot be null"));
    }

    public T get() {
        return this.f23903a;
    }
}
