package C;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public interface X {

    public static abstract class a<T> {
        a() {
        }

        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new C0321d(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static boolean A(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static X Q(X x7, X x8) {
        if (x7 == null && x8 == null) {
            return J0.a0();
        }
        E0 e02 = x8 != null ? E0.e0(x8) : E0.d0();
        if (x7 != null) {
            Iterator<a<?>> it = x7.c().iterator();
            while (it.hasNext()) {
                m(e02, x8, x7, it.next());
            }
        }
        return J0.b0(e02);
    }

    static void m(E0 e02, X x7, X x8, a<?> aVar) {
        if (!Objects.equals(aVar, InterfaceC0351s0.f724r)) {
            e02.T(aVar, x8.g(aVar), x8.f(aVar));
            return;
        }
        P.c cVar = (P.c) x8.a(aVar, null);
        e02.T(aVar, x8.g(aVar), E.n.a((P.c) x7.a(aVar, null), cVar));
    }

    <ValueT> ValueT a(a<ValueT> aVar, ValueT valuet);

    boolean b(a<?> aVar);

    Set<a<?>> c();

    Set<c> d(a<?> aVar);

    <ValueT> ValueT f(a<ValueT> aVar);

    c g(a<?> aVar);

    <ValueT> ValueT h(a<ValueT> aVar, c cVar);

    void i(String str, b bVar);
}
