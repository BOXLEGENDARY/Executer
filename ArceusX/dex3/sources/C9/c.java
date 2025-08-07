package C9;

public final class c<T> implements h<T>, B9.a<T> {
    private static final Object c = new Object();
    private volatile h<T> a;
    private volatile Object b = c;

    private c(h<T> hVar) {
        this.a = hVar;
    }

    private synchronized Object a() {
        Object obj;
        obj = this.b;
        if (obj == c) {
            obj = this.a.get();
            this.b = d(this.b, obj);
            this.a = null;
        }
        return obj;
    }

    public static <T> B9.a<T> b(h<T> hVar) {
        return hVar instanceof B9.a ? (B9.a) hVar : new c((h) g.b(hVar));
    }

    public static <T> h<T> c(h<T> hVar) {
        g.b(hVar);
        return hVar instanceof c ? hVar : new c(hVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override
    public T get() {
        T t = (T) this.b;
        return t == c ? (T) a() : t;
    }
}
