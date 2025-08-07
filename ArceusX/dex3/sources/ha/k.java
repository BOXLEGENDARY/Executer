package ha;

import C9.d;
import C9.g;
import C9.h;
import android.content.Context;
import ha.InterfaceC0883h;

public final class k implements d<InterfaceC0883h> {
    private final i a;
    private final h<Context> b;

    public k(i iVar, h<Context> hVar) {
        this.a = iVar;
        this.b = hVar;
    }

    public static k a(i iVar, h<Context> hVar) {
        return new k(iVar, hVar);
    }

    public static InterfaceC0883h c(i iVar, Context context) {
        return (InterfaceC0883h) g.d(iVar.b(context));
    }

    public InterfaceC0883h get() {
        return c(this.a, (Context) this.b.get());
    }
}
