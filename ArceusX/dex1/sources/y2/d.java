package y2;

import A2.InterfaceC0247d;
import java.util.concurrent.Executor;
import z2.x;

public final class d implements u2.b<c> {

    private final O9.a<Executor> f24436a;

    private final O9.a<t2.e> f24437b;

    private final O9.a<x> f24438c;

    private final O9.a<InterfaceC0247d> f24439d;

    private final O9.a<B2.b> f24440e;

    public d(O9.a<Executor> aVar, O9.a<t2.e> aVar2, O9.a<x> aVar3, O9.a<InterfaceC0247d> aVar4, O9.a<B2.b> aVar5) {
        this.f24436a = aVar;
        this.f24437b = aVar2;
        this.f24438c = aVar3;
        this.f24439d = aVar4;
        this.f24440e = aVar5;
    }

    public static d a(O9.a<Executor> aVar, O9.a<t2.e> aVar2, O9.a<x> aVar3, O9.a<InterfaceC0247d> aVar4, O9.a<B2.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, t2.e eVar, x xVar, InterfaceC0247d interfaceC0247d, B2.b bVar) {
        return new c(executor, eVar, xVar, interfaceC0247d, bVar);
    }

    public c get() {
        return c((Executor) this.f24436a.get(), (t2.e) this.f24437b.get(), (x) this.f24438c.get(), (InterfaceC0247d) this.f24439d.get(), (B2.b) this.f24440e.get());
    }
}
