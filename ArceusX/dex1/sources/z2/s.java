package z2;

import A2.InterfaceC0246c;
import A2.InterfaceC0247d;
import android.content.Context;
import java.util.concurrent.Executor;

public final class s implements u2.b<r> {

    private final O9.a<Context> f24837a;

    private final O9.a<t2.e> f24838b;

    private final O9.a<InterfaceC0247d> f24839c;

    private final O9.a<x> f24840d;

    private final O9.a<Executor> f24841e;

    private final O9.a<B2.b> f24842f;

    private final O9.a<C2.a> f24843g;

    private final O9.a<C2.a> f24844h;

    private final O9.a<InterfaceC0246c> f24845i;

    public s(O9.a<Context> aVar, O9.a<t2.e> aVar2, O9.a<InterfaceC0247d> aVar3, O9.a<x> aVar4, O9.a<Executor> aVar5, O9.a<B2.b> aVar6, O9.a<C2.a> aVar7, O9.a<C2.a> aVar8, O9.a<InterfaceC0246c> aVar9) {
        this.f24837a = aVar;
        this.f24838b = aVar2;
        this.f24839c = aVar3;
        this.f24840d = aVar4;
        this.f24841e = aVar5;
        this.f24842f = aVar6;
        this.f24843g = aVar7;
        this.f24844h = aVar8;
        this.f24845i = aVar9;
    }

    public static s a(O9.a<Context> aVar, O9.a<t2.e> aVar2, O9.a<InterfaceC0247d> aVar3, O9.a<x> aVar4, O9.a<Executor> aVar5, O9.a<B2.b> aVar6, O9.a<C2.a> aVar7, O9.a<C2.a> aVar8, O9.a<InterfaceC0246c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, t2.e eVar, InterfaceC0247d interfaceC0247d, x xVar, Executor executor, B2.b bVar, C2.a aVar, C2.a aVar2, InterfaceC0246c interfaceC0246c) {
        return new r(context, eVar, interfaceC0247d, xVar, executor, bVar, aVar, aVar2, interfaceC0246c);
    }

    public r get() {
        return c((Context) this.f24837a.get(), (t2.e) this.f24838b.get(), (InterfaceC0247d) this.f24839c.get(), (x) this.f24840d.get(), (Executor) this.f24841e.get(), (B2.b) this.f24842f.get(), (C2.a) this.f24843g.get(), (C2.a) this.f24844h.get(), (InterfaceC0246c) this.f24845i.get());
    }
}
