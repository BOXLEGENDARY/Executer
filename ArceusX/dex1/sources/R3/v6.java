package R3;

import android.content.Context;

public final class v6 implements InterfaceC1122m6 {

    private c5.b f5976a;

    private final c5.b f5977b;

    private final AbstractC1050d6 f5978c;

    public v6(Context context, AbstractC1050d6 abstractC1050d6) {
        this.f5978c = abstractC1050d6;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13872g;
        s2.t.f(context);
        final q2.g gVarG = s2.t.c().g(aVar);
        if (aVar.a().contains(q2.b.b("json"))) {
            this.f5976a = new S4.w(new c5.b() {
                @Override
                public final Object get() {
                    return gVarG.a("FIREBASE_ML_SDK", byte[].class, q2.b.b("json"), new q2.e() {
                        @Override
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f5977b = new S4.w(new c5.b() {
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

    static q2.c b(AbstractC1050d6 abstractC1050d6, InterfaceC1034b6 interfaceC1034b6) {
        int iA = abstractC1050d6.a();
        return interfaceC1034b6.zza() != 0 ? q2.c.d(interfaceC1034b6.a(iA, false)) : q2.c.e(interfaceC1034b6.a(iA, false));
    }

    @Override
    public final void a(InterfaceC1034b6 interfaceC1034b6) {
        if (this.f5978c.a() != 0) {
            ((q2.f) this.f5977b.get()).a(b(this.f5978c, interfaceC1034b6));
            return;
        }
        c5.b bVar = this.f5976a;
        if (bVar != null) {
            ((q2.f) bVar.get()).a(b(this.f5978c, interfaceC1034b6));
        }
    }
}
