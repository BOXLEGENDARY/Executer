package L;

import C.A;
import C.EnumC0352t;
import C.EnumC0356v;
import C.EnumC0360x;
import C.InterfaceC0364z;
import L.c;
import androidx.camera.core.n;
import z.V;

public final class f extends a<n> {
    public f(int i7, c.a<n> aVar) {
        super(i7, aVar);
    }

    private boolean d(V v7) {
        InterfaceC0364z interfaceC0364zA = A.a(v7);
        return (interfaceC0364zA.l() == EnumC0356v.LOCKED_FOCUSED || interfaceC0364zA.l() == EnumC0356v.PASSIVE_FOCUSED) && interfaceC0364zA.i() == EnumC0352t.CONVERGED && interfaceC0364zA.e() == EnumC0360x.f765v;
    }

    public void c(n nVar) {
        if (d(nVar.D0())) {
            super.b(nVar);
        } else {
            this.f1931d.a(nVar);
        }
    }
}
