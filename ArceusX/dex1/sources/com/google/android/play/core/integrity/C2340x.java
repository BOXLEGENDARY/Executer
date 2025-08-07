package com.google.android.play.core.integrity;

import a4.C1576m;
import a4.InterfaceC1573j;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.InterfaceC2320c;

final class C2340x implements InterfaceC2320c {

    private final J f18882a;

    private final P f18883b;

    C2340x(J j7, P p7) {
        this.f18882a = j7;
        this.f18883b = p7;
    }

    @Override
    public final Task<InterfaceC2320c.InterfaceC0165c> a(final InterfaceC2320c.a aVar) {
        long jB = aVar.b();
        aVar.a();
        return this.f18882a.d(jB, 0).p(new InterfaceC1573j() {
            @Override
            public final Task a(Object obj) {
                return this.f18880a.b(aVar, (Long) obj);
            }
        });
    }

    final Task b(InterfaceC2320c.a aVar, Long l7) throws Exception {
        final long jB = aVar.b();
        final long jLongValue = l7.longValue();
        aVar.a();
        final P p7 = this.f18883b;
        final int i7 = 0;
        return C1576m.f(new InterfaceC2320c.InterfaceC0165c(jB, jLongValue, i7) {

            public final long f18810b;

            public final long f18811c;

            @Override
            public final Task a(InterfaceC2320c.d dVar) {
                return this.f18809a.a(this.f18810b, this.f18811c, 0, dVar);
            }
        });
    }
}
