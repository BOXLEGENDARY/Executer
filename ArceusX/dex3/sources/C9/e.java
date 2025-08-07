package C9;

public final class e<T> implements d<T>, B9.a<T> {
    private static final e<Object> b = new e<>(null);
    private final T a;

    private e(T t) {
        this.a = t;
    }

    public static <T> d<T> a(T t) {
        return new e(g.c(t, "instance cannot be null"));
    }

    @Override
    public T get() {
        return this.a;
    }
}
