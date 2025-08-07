package O3;

import S9.Gvmm.CAqKeu;
import U4.c;
import java.io.IOException;

final class C0789v3 implements U4.d {

    static final C0789v3 f3601a = new C0789v3();

    private static final U4.c f3602b;

    private static final U4.c f3603c;

    private static final U4.c f3604d;

    private static final U4.c f3605e;

    private static final U4.c f3606f;

    private static final U4.c f3607g;

    private static final U4.c f3608h;

    private static final U4.c f3609i;

    private static final U4.c f3610j;

    private static final U4.c f3611k;

    static {
        c.b bVarA = U4.c.a("durationMs");
        K0 k02 = new K0();
        k02.a(1);
        f3602b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("errorCode");
        K0 k03 = new K0();
        k03.a(2);
        f3603c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("isColdCall");
        K0 k04 = new K0();
        k04.a(3);
        f3604d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a(CAqKeu.CzC);
        K0 k05 = new K0();
        k05.a(4);
        f3605e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("autoManageModelOnLowMemory");
        K0 k06 = new K0();
        k06.a(5);
        f3606f = bVarA5.b(k06.b()).a();
        c.b bVarA6 = U4.c.a("isNnApiEnabled");
        K0 k07 = new K0();
        k07.a(6);
        f3607g = bVarA6.b(k07.b()).a();
        c.b bVarA7 = U4.c.a("eventsCount");
        K0 k08 = new K0();
        k08.a(7);
        f3608h = bVarA7.b(k08.b()).a();
        c.b bVarA8 = U4.c.a("otherErrors");
        K0 k09 = new K0();
        k09.a(8);
        f3609i = bVarA8.b(k09.b()).a();
        c.b bVarA9 = U4.c.a("remoteConfigValueForAcceleration");
        K0 k010 = new K0();
        k010.a(9);
        f3610j = bVarA9.b(k010.b()).a();
        c.b bVarA10 = U4.c.a("isAccelerated");
        K0 k011 = new K0();
        k011.a(10);
        f3611k = bVarA10.b(k011.b()).a();
    }

    private C0789v3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        B6 b62 = (B6) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3602b, b62.e());
        eVar.b(f3603c, b62.a());
        eVar.b(f3604d, b62.d());
        eVar.b(f3605e, b62.b());
        eVar.b(f3606f, b62.c());
        eVar.b(f3607g, null);
        eVar.b(f3608h, null);
        eVar.b(f3609i, null);
        eVar.b(f3610j, null);
        eVar.b(f3611k, null);
    }
}
