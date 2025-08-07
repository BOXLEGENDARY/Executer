package s2;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

public class t implements s {

    private static volatile u f23650e;

    private final C2.a f23651a;

    private final C2.a f23652b;

    private final y2.e f23653c;

    private final z2.r f23654d;

    t(C2.a aVar, C2.a aVar2, y2.e eVar, z2.r rVar, z2.v vVar) {
        this.f23651a = aVar;
        this.f23652b = aVar2;
        this.f23653c = eVar;
        this.f23654d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f23651a.a()).k(this.f23652b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f23650e;
        if (uVar != null) {
            return uVar.e();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<q2.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(q2.b.b("proto"));
    }

    public static void f(Context context) {
        if (f23650e == null) {
            synchronized (t.class) {
                try {
                    if (f23650e == null) {
                        f23650e = e.f().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override
    public void a(n nVar, q2.h hVar) {
        this.f23653c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public z2.r e() {
        return this.f23654d;
    }

    public q2.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
