package S3;

import android.content.Context;
import z3.AdxZ.bpTQi;

public final class z9 implements InterfaceC1320g9 {

    private c5.b f7316a;

    private final c5.b f7317b;

    private final AbstractC1342i9 f7318c;

    public z9(Context context, AbstractC1342i9 abstractC1342i9) {
        this.f7318c = abstractC1342i9;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13872g;
        s2.t.f(context);
        final q2.g gVarG = s2.t.c().g(aVar);
        if (aVar.a().contains(q2.b.b("json"))) {
            this.f7316a = new S4.w(new c5.b() {
                @Override
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, q2.b.b(bpTQi.ObCaShsooMTARGu), new q2.e() {
                        @Override
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f7317b = new S4.w(new c5.b() {
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

    static q2.c b(AbstractC1342i9 abstractC1342i9, InterfaceC1309f9 interfaceC1309f9) {
        int iA = abstractC1342i9.a();
        return interfaceC1309f9.zza() != 0 ? q2.c.d(interfaceC1309f9.a(iA, false)) : q2.c.e(interfaceC1309f9.a(iA, false));
    }

    @Override
    public final void a(InterfaceC1309f9 interfaceC1309f9) {
        if (this.f7318c.a() != 0) {
            ((q2.f) this.f7317b.get()).a(b(this.f7318c, interfaceC1309f9));
            return;
        }
        c5.b bVar = this.f7316a;
        if (bVar != null) {
            ((q2.f) bVar.get()).a(b(this.f7318c, interfaceC1309f9));
        }
    }
}
