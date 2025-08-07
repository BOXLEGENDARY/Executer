package N3;

import android.content.Context;

public final class S implements F {

    private c5.b f2594a;

    private final c5.b f2595b;

    private final I f2596c;

    public S(Context context, I i7) {
        this.f2596c = i7;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13872g;
        s2.t.f(context);
        final q2.g gVarG = s2.t.c().g(aVar);
        if (aVar.a().contains(q2.b.b("json"))) {
            this.f2594a = new S4.w(new c5.b() {
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
        this.f2595b = new S4.w(new c5.b() {
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
}
