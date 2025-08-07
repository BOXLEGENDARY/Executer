package y2;

import A2.InterfaceC0247d;
import B2.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import s2.o;
import s2.t;
import t2.m;
import z2.x;

public class c implements e {

    private static final Logger f24430f = Logger.getLogger(t.class.getName());

    private final x f24431a;

    private final Executor f24432b;

    private final t2.e f24433c;

    private final InterfaceC0247d f24434d;

    private final B2.b f24435e;

    public c(Executor executor, t2.e eVar, x xVar, InterfaceC0247d interfaceC0247d, B2.b bVar) {
        this.f24432b = executor;
        this.f24433c = eVar;
        this.f24431a = xVar;
        this.f24434d = interfaceC0247d;
        this.f24435e = bVar;
    }

    public Object d(o oVar, s2.i iVar) {
        this.f24434d.j1(oVar, iVar);
        this.f24431a.a(oVar, 1);
        return null;
    }

    public void e(final o oVar, q2.h hVar, s2.i iVar) {
        try {
            m mVarA = this.f24433c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f24430f.warning(str);
                hVar.a(new IllegalArgumentException(str));
            } else {
                final s2.i iVarA = mVarA.a(iVar);
                this.f24435e.j(new b.a() {
                    @Override
                    public final Object execute() {
                        return this.f24427a.d(oVar, iVarA);
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e7) {
            f24430f.warning("Error scheduling event " + e7.getMessage());
            hVar.a(e7);
        }
    }

    @Override
    public void a(final o oVar, final s2.i iVar, final q2.h hVar) {
        this.f24432b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24423d.e(oVar, hVar, iVar);
            }
        });
    }
}
