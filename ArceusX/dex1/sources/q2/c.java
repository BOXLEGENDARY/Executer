package q2;

public abstract class c<T> {
    public static <T> c<T> d(T t7) {
        return new a(null, t7, d.DEFAULT);
    }

    public static <T> c<T> e(T t7) {
        return new a(null, t7, d.VERY_LOW);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}
