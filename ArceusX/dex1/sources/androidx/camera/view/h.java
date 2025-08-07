package androidx.camera.view;

import androidx.concurrent.futures.c;
import java.util.Objects;
import n.InterfaceC2621a;
import x0.C2986c;

class h<T> {

    private C2986c<c.a<Void>, T> f9662a;

    h() {
    }

    public Object b(Object obj, c.a aVar) throws Exception {
        C2986c<c.a<Void>, T> c2986c = this.f9662a;
        if (c2986c != null) {
            c.a<Void> aVar2 = c2986c.f24317a;
            Objects.requireNonNull(aVar2);
            aVar2.d();
        }
        this.f9662a = new C2986c<>(aVar, obj);
        return "PendingValue " + obj;
    }

    void c(InterfaceC2621a<T, com.google.common.util.concurrent.p<Void>> interfaceC2621a) {
        E.p.a();
        C2986c<c.a<Void>, T> c2986c = this.f9662a;
        if (c2986c != null) {
            com.google.common.util.concurrent.p<Void> pVarApply = interfaceC2621a.apply(c2986c.f24318b);
            c.a<Void> aVar = this.f9662a.f24317a;
            Objects.requireNonNull(aVar);
            G.n.C(pVarApply, aVar);
            this.f9662a = null;
        }
    }

    com.google.common.util.concurrent.p<Void> d(final T t7) {
        E.p.a();
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f9660a.b(t7, aVar);
            }
        });
    }
}
