package S4;

class B<T> implements c5.b<T> {

    private static final c5.a<Object> f7319c = new c5.a() {
        @Override
        public final void a(c5.b bVar) {
            B.d(bVar);
        }
    };

    private static final c5.b<Object> f7320d = new c5.b() {
        @Override
        public final Object get() {
            return B.e();
        }
    };

    private c5.a<T> f7321a;

    private volatile c5.b<T> f7322b;

    private B(c5.a<T> aVar, c5.b<T> bVar) {
        this.f7321a = aVar;
        this.f7322b = bVar;
    }

    static <T> B<T> c() {
        return new B<>(f7319c, f7320d);
    }

    public static void d(c5.b bVar) {
    }

    public static Object e() {
        return null;
    }

    void f(c5.b<T> bVar) {
        c5.a<T> aVar;
        if (this.f7322b != f7320d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f7321a;
            this.f7321a = null;
            this.f7322b = bVar;
        }
        aVar.a(bVar);
    }

    @Override
    public T get() {
        return this.f7322b.get();
    }
}
