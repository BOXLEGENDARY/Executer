package S4;

public class w<T> implements c5.b<T> {

    private static final Object f7381c = new Object();

    private volatile Object f7382a = f7381c;

    private volatile c5.b<T> f7383b;

    public w(c5.b<T> bVar) {
        this.f7383b = bVar;
    }

    @Override
    public T get() {
        T t7 = (T) this.f7382a;
        Object obj = f7381c;
        if (t7 == obj) {
            synchronized (this) {
                try {
                    t7 = (T) this.f7382a;
                    if (t7 == obj) {
                        t7 = this.f7383b.get();
                        this.f7382a = t7;
                        this.f7383b = null;
                    }
                } finally {
                }
            }
        }
        return t7;
    }
}
