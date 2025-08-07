package Q;

import B.InterfaceC0275k;
import C.C0340m0;
import C.F;
import C.V;
import Q.h;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class q extends C0340m0 {

    private final h.a f3786c;

    q(F f7, h.a aVar) {
        super(f7);
        this.f3786c = aVar;
    }

    private int s(V v7) {
        Integer num = (Integer) v7.g().a(V.f442j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int t(V v7) {
        Integer num = (Integer) v7.g().a(V.f441i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static com.google.common.util.concurrent.p u(com.google.common.util.concurrent.p pVar, InterfaceC0275k interfaceC0275k) throws Exception {
        return ((InterfaceC0275k) pVar.get()).a();
    }

    public com.google.common.util.concurrent.p v(List list, Void r42) throws Exception {
        return this.f3786c.a(s((V) list.get(0)), t((V) list.get(0)));
    }

    public static com.google.common.util.concurrent.p w(com.google.common.util.concurrent.p pVar, Void r1) throws Exception {
        return ((InterfaceC0275k) pVar.get()).b();
    }

    @Override
    public com.google.common.util.concurrent.p<List<Void>> f(final List<V> list, int i7, int i8) {
        x0.g.b(list.size() == 1, "Only support one capture config.");
        final com.google.common.util.concurrent.p<InterfaceC0275k> pVarJ = j(i7, i8);
        return G.n.k(Collections.singletonList(G.d.a(pVarJ).g(new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return q.u(pVarJ, (InterfaceC0275k) obj);
            }
        }, F.a.a()).g(new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return this.f3783a.v(list, (Void) obj);
            }
        }, F.a.a()).g(new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return q.w(pVarJ, (Void) obj);
            }
        }, F.a.a())));
    }
}
