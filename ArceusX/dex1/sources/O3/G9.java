package O3;

import Q6.QtA.QXojhh;
import android.content.Context;

public final class G9 implements InterfaceC0719o9 {

    private c5.b f2880a;

    private final c5.b f2881b;

    private final AbstractC0741q9 f2882c;

    public G9(Context context, AbstractC0741q9 abstractC0741q9) {
        this.f2882c = abstractC0741q9;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13872g;
        s2.t.f(context);
        final q2.g gVarG = s2.t.c().g(aVar);
        if (aVar.a().contains(q2.b.b("json"))) {
            this.f2880a = new S4.w(new c5.b() {
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
        this.f2881b = new S4.w(new c5.b() {
            @Override
            public final Object get() {
                return gVarG.a("FIREBASE_ML_SDK", byte[].class, q2.b.b(QXojhh.HJodJZhRyT), new q2.e() {
                    @Override
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static q2.c b(AbstractC0741q9 abstractC0741q9, InterfaceC0708n9 interfaceC0708n9) {
        int iA = abstractC0741q9.a();
        return interfaceC0708n9.zza() != 0 ? q2.c.d(interfaceC0708n9.a(iA, false)) : q2.c.e(interfaceC0708n9.a(iA, false));
    }

    @Override
    public final void a(InterfaceC0708n9 interfaceC0708n9) {
        if (this.f2882c.a() != 0) {
            ((q2.f) this.f2881b.get()).a(b(this.f2882c, interfaceC0708n9));
            return;
        }
        c5.b bVar = this.f2880a;
        if (bVar != null) {
            ((q2.f) bVar.get()).a(b(this.f2882c, interfaceC0708n9));
        }
    }
}
