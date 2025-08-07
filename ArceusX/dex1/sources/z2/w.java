package z2;

import A2.InterfaceC0247d;
import java.util.concurrent.Executor;

public final class w implements u2.b<v> {

    private final O9.a<Executor> f24852a;

    private final O9.a<InterfaceC0247d> f24853b;

    private final O9.a<x> f24854c;

    private final O9.a<B2.b> f24855d;

    public w(O9.a<Executor> aVar, O9.a<InterfaceC0247d> aVar2, O9.a<x> aVar3, O9.a<B2.b> aVar4) {
        this.f24852a = aVar;
        this.f24853b = aVar2;
        this.f24854c = aVar3;
        this.f24855d = aVar4;
    }

    public static w a(O9.a<Executor> aVar, O9.a<InterfaceC0247d> aVar2, O9.a<x> aVar3, O9.a<B2.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC0247d interfaceC0247d, x xVar, B2.b bVar) {
        return new v(executor, interfaceC0247d, xVar, bVar);
    }

    public v get() {
        return c((Executor) this.f24852a.get(), (InterfaceC0247d) this.f24853b.get(), (x) this.f24854c.get(), (B2.b) this.f24855d.get());
    }
}
