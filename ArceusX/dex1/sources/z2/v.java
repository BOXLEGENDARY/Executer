package z2;

import A2.InterfaceC0247d;
import B2.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

public class v {

    private final Executor f24848a;

    private final InterfaceC0247d f24849b;

    private final x f24850c;

    private final B2.b f24851d;

    v(Executor executor, InterfaceC0247d interfaceC0247d, x xVar, B2.b bVar) {
        this.f24848a = executor;
        this.f24849b = interfaceC0247d;
        this.f24850c = xVar;
        this.f24851d = bVar;
    }

    public Object d() {
        Iterator<s2.o> it = this.f24849b.S().iterator();
        while (it.hasNext()) {
            this.f24850c.a(it.next(), 1);
        }
        return null;
    }

    public void e() {
        this.f24851d.j(new b.a() {
            @Override
            public final Object execute() {
                return this.f24847a.d();
            }
        });
    }

    public void c() {
        this.f24848a.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24846d.e();
            }
        });
    }
}
