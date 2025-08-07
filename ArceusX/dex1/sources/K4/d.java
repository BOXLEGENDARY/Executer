package K4;

import java.io.Serializable;

public abstract class d<T> implements Serializable {
    d() {
    }

    public static <T> d<T> a() {
        return a.f();
    }

    public static <T> d<T> d(T t7) {
        return new h(g.g(t7));
    }

    public abstract T b();

    public abstract boolean c();

    public abstract T e(T t7);
}
