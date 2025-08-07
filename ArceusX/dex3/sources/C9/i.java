package C9;

public final class i {

    class a<T> implements h<T> {
        final O9.a a;

        a(O9.a aVar) {
            this.a = aVar;
        }

        public T get() {
            return (T) this.a.get();
        }
    }

    public static <T> h<T> a(O9.a<T> aVar) {
        g.b(aVar);
        return aVar instanceof h ? (h) aVar : new a(aVar);
    }
}
