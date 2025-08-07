package K4;

final class a<T> extends d<T> {

    static final a<Object> f1908d = new a<>();

    private a() {
    }

    static <T> d<T> f() {
        return f1908d;
    }

    @Override
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public T e(T t7) {
        return (T) g.h(t7, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
