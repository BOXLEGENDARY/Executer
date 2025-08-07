package u2;

public final class a<T> implements O9.a<T> {

    private static final Object f23899c = new Object();

    private volatile O9.a<T> f23900a;

    private volatile Object f23901b = f23899c;

    private a(O9.a<T> aVar) {
        this.f23900a = aVar;
    }

    public static <P extends O9.a<T>, T> O9.a<T> a(P p7) {
        d.b(p7);
        return p7 instanceof a ? p7 : new a(p7);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f23899c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        Object obj = (T) this.f23901b;
        Object obj2 = f23899c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f23901b;
                    if (obj == obj2) {
                        obj = (T) this.f23900a.get();
                        this.f23901b = b(this.f23901b, obj);
                        this.f23900a = null;
                    }
                } finally {
                }
            }
        }
        return (T) obj;
    }
}
