package Q3;

import android.content.Context;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;

public final class D5 implements InterfaceC0958q5 {

    private c5.b f3858a;

    private final c5.b f3859b;

    private final AbstractC0971s5 f3860c;

    public D5(Context context, AbstractC0971s5 abstractC0971s5) {
        this.f3860c = abstractC0971s5;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13872g;
        s2.t.f(context);
        final q2.g gVarG = s2.t.c().g(aVar);
        if (aVar.a().contains(q2.b.b("json"))) {
            this.f3858a = new S4.w(new c5.b() {
                @Override
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, q2.b.b(vxbbqXNtzfMxs.mDhHL), new q2.e() {
                        @Override
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f3859b = new S4.w(new c5.b() {
            @Override
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, q2.b.b("proto"), new q2.e() {
                    @Override
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static q2.c b(AbstractC0971s5 abstractC0971s5, InterfaceC0951p5 interfaceC0951p5) {
        return q2.c.e(interfaceC0951p5.d(abstractC0971s5.a(), false));
    }

    @Override
    public final void a(InterfaceC0951p5 interfaceC0951p5) {
        if (this.f3860c.a() != 0) {
            ((q2.f) this.f3859b.get()).a(b(this.f3860c, interfaceC0951p5));
            return;
        }
        c5.b bVar = this.f3858a;
        if (bVar != null) {
            ((q2.f) bVar.get()).a(b(this.f3860c, interfaceC0951p5));
        }
    }
}
