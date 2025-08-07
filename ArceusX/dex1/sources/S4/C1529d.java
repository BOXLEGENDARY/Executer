package S4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C1529d<T> {

    private final Set<Class<? super T>> f7334a;

    private final Set<q> f7335b;

    private final int f7336c;

    private final int f7337d;

    private final h<T> f7338e;

    private final Set<Class<?>> f7339f;

    public static class b<T> {

        private final Set<Class<? super T>> f7340a;

        private final Set<q> f7341b;

        private int f7342c;

        private int f7343d;

        private h<T> f7344e;

        private Set<Class<?>> f7345f;

        public b<T> g() {
            this.f7343d = 1;
            return this;
        }

        private b<T> h(int i7) {
            C.d(this.f7342c == 0, "Instantiation type has already been set.");
            this.f7342c = i7;
            return this;
        }

        private void i(Class<?> cls) {
            C.a(!this.f7340a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            C.c(qVar, "Null dependency");
            i(qVar.b());
            this.f7341b.add(qVar);
            return this;
        }

        public b<T> c() {
            return h(1);
        }

        public C1529d<T> d() {
            C.d(this.f7344e != null, "Missing required property: factory.");
            return new C1529d<>(new HashSet(this.f7340a), new HashSet(this.f7341b), this.f7342c, this.f7343d, this.f7344e, this.f7345f);
        }

        public b<T> e() {
            return h(2);
        }

        public b<T> f(h<T> hVar) {
            this.f7344e = (h) C.c(hVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f7340a = hashSet;
            this.f7341b = new HashSet();
            this.f7342c = 0;
            this.f7343d = 0;
            this.f7345f = new HashSet();
            C.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C.c(cls2, "Null interface");
            }
            Collections.addAll(this.f7340a, clsArr);
        }
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> C1529d<T> i(final T t7, Class<T> cls) {
        return j(cls).f(new h() {
            @Override
            public final Object a(e eVar) {
                return C1529d.n(t7, eVar);
            }
        }).d();
    }

    public static <T> b<T> j(Class<T> cls) {
        return c(cls).g();
    }

    public static Object n(Object obj, e eVar) {
        return obj;
    }

    public static Object o(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> C1529d<T> p(final T t7, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new h() {
            @Override
            public final Object a(e eVar) {
                return C1529d.o(t7, eVar);
            }
        }).d();
    }

    public Set<q> e() {
        return this.f7335b;
    }

    public h<T> f() {
        return this.f7338e;
    }

    public Set<Class<? super T>> g() {
        return this.f7334a;
    }

    public Set<Class<?>> h() {
        return this.f7339f;
    }

    public boolean k() {
        return this.f7336c == 1;
    }

    public boolean l() {
        return this.f7336c == 2;
    }

    public boolean m() {
        return this.f7337d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f7334a.toArray()) + ">{" + this.f7336c + ", type=" + this.f7337d + ", deps=" + Arrays.toString(this.f7335b.toArray()) + "}";
    }

    private C1529d(Set<Class<? super T>> set, Set<q> set2, int i7, int i8, h<T> hVar, Set<Class<?>> set3) {
        this.f7334a = Collections.unmodifiableSet(set);
        this.f7335b = Collections.unmodifiableSet(set2);
        this.f7336c = i7;
        this.f7337d = i8;
        this.f7338e = hVar;
        this.f7339f = Collections.unmodifiableSet(set3);
    }
}
