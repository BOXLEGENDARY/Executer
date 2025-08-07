package R3;

import U4.c;
import java.io.IOException;

final class C1134o2 implements U4.d {

    static final C1134o2 f5739a = new C1134o2();

    private static final U4.c f5740b;

    private static final U4.c f5741c;

    private static final U4.c f5742d;

    private static final U4.c f5743e;

    private static final U4.c f5744f;

    private static final U4.c f5745g;

    private static final U4.c f5746h;

    private static final U4.c f5747i;

    private static final U4.c f5748j;

    private static final U4.c f5749k;

    static {
        c.b bVarA = U4.c.a("durationMs");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5740b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("errorCode");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5741c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("isColdCall");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5742d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("autoManageModelOnBackground");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5743e = bVarA4.b(c1171t04.b()).a();
        c.b bVarA5 = U4.c.a("autoManageModelOnLowMemory");
        C1171t0 c1171t05 = new C1171t0();
        c1171t05.a(5);
        f5744f = bVarA5.b(c1171t05.b()).a();
        c.b bVarA6 = U4.c.a("isNnApiEnabled");
        C1171t0 c1171t06 = new C1171t0();
        c1171t06.a(6);
        f5745g = bVarA6.b(c1171t06.b()).a();
        c.b bVarA7 = U4.c.a("eventsCount");
        C1171t0 c1171t07 = new C1171t0();
        c1171t07.a(7);
        f5746h = bVarA7.b(c1171t07.b()).a();
        c.b bVarA8 = U4.c.a("otherErrors");
        C1171t0 c1171t08 = new C1171t0();
        c1171t08.a(8);
        f5747i = bVarA8.b(c1171t08.b()).a();
        c.b bVarA9 = U4.c.a("remoteConfigValueForAcceleration");
        C1171t0 c1171t09 = new C1171t0();
        c1171t09.a(9);
        f5748j = bVarA9.b(c1171t09.b()).a();
        c.b bVarA10 = U4.c.a("isAccelerated");
        C1171t0 c1171t010 = new C1171t0();
        c1171t010.a(10);
        f5749k = bVarA10.b(c1171t010.b()).a();
    }

    private C1134o2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1175t4 c1175t4 = (C1175t4) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5740b, c1175t4.e());
        eVar.b(f5741c, c1175t4.a());
        eVar.b(f5742d, c1175t4.d());
        eVar.b(f5743e, c1175t4.b());
        eVar.b(f5744f, c1175t4.c());
        eVar.b(f5745g, null);
        eVar.b(f5746h, null);
        eVar.b(f5747i, null);
        eVar.b(f5748j, null);
        eVar.b(f5749k, null);
    }
}
