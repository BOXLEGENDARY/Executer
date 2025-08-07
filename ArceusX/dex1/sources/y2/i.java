package y2;

import A2.InterfaceC0247d;
import android.content.Context;
import z2.x;

public final class i implements u2.b<x> {

    private final O9.a<Context> f24442a;

    private final O9.a<InterfaceC0247d> f24443b;

    private final O9.a<z2.f> f24444c;

    private final O9.a<C2.a> f24445d;

    public i(O9.a<Context> aVar, O9.a<InterfaceC0247d> aVar2, O9.a<z2.f> aVar3, O9.a<C2.a> aVar4) {
        this.f24442a = aVar;
        this.f24443b = aVar2;
        this.f24444c = aVar3;
        this.f24445d = aVar4;
    }

    public static i a(O9.a<Context> aVar, O9.a<InterfaceC0247d> aVar2, O9.a<z2.f> aVar3, O9.a<C2.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC0247d interfaceC0247d, z2.f fVar, C2.a aVar) {
        return (x) u2.d.c(h.a(context, interfaceC0247d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public x get() {
        return c((Context) this.f24442a.get(), (InterfaceC0247d) this.f24443b.get(), (z2.f) this.f24444c.get(), (C2.a) this.f24445d.get());
    }
}
