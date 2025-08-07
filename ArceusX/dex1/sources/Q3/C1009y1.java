package Q3;

import U4.c;
import java.io.IOException;

final class C1009y1 implements U4.d {

    static final C1009y1 f4810a = new C1009y1();

    private static final U4.c f4811b;

    private static final U4.c f4812c;

    private static final U4.c f4813d;

    private static final U4.c f4814e;

    static {
        c.b bVarA = U4.c.a("isChargingRequired");
        C0875f c0875f = new C0875f();
        c0875f.a(1);
        f4811b = bVarA.b(c0875f.b()).a();
        c.b bVarA2 = U4.c.a("isWifiRequired");
        C0875f c0875f2 = new C0875f();
        c0875f2.a(2);
        f4812c = bVarA2.b(c0875f2.b()).a();
        c.b bVarA3 = U4.c.a("isDeviceIdleRequired");
        C0875f c0875f3 = new C0875f();
        c0875f3.a(3);
        f4813d = bVarA3.b(c0875f3.b()).a();
        c.b bVarA4 = U4.c.a("canDownloadInBackground");
        C0875f c0875f4 = new C0875f();
        c0875f4.a(4);
        f4814e = bVarA4.b(c0875f4.b()).a();
    }

    private C1009y1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
