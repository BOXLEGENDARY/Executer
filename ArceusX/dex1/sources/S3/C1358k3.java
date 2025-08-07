package S3;

import U4.c;
import java.io.IOException;

final class C1358k3 implements U4.d {

    static final C1358k3 f6984a = new C1358k3();

    private static final U4.c f6985b;

    private static final U4.c f6986c;

    private static final U4.c f6987d;

    private static final U4.c f6988e;

    private static final U4.c f6989f;

    private static final U4.c f6990g;

    private static final U4.c f6991h;

    private static final U4.c f6992i;

    private static final U4.c f6993j;

    private static final U4.c f6994k;

    static {
        c.b bVarA = U4.c.a("durationMs");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f6985b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("errorCode");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f6986c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("isColdCall");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f6987d = bVarA3.b(c1486w03.b()).a();
        c.b bVarA4 = U4.c.a("autoManageModelOnBackground");
        C1486w0 c1486w04 = new C1486w0();
        c1486w04.a(4);
        f6988e = bVarA4.b(c1486w04.b()).a();
        c.b bVarA5 = U4.c.a("autoManageModelOnLowMemory");
        C1486w0 c1486w05 = new C1486w0();
        c1486w05.a(5);
        f6989f = bVarA5.b(c1486w05.b()).a();
        c.b bVarA6 = U4.c.a("isNnApiEnabled");
        C1486w0 c1486w06 = new C1486w0();
        c1486w06.a(6);
        f6990g = bVarA6.b(c1486w06.b()).a();
        c.b bVarA7 = U4.c.a("eventsCount");
        C1486w0 c1486w07 = new C1486w0();
        c1486w07.a(7);
        f6991h = bVarA7.b(c1486w07.b()).a();
        c.b bVarA8 = U4.c.a("otherErrors");
        C1486w0 c1486w08 = new C1486w0();
        c1486w08.a(8);
        f6992i = bVarA8.b(c1486w08.b()).a();
        c.b bVarA9 = U4.c.a("remoteConfigValueForAcceleration");
        C1486w0 c1486w09 = new C1486w0();
        c1486w09.a(9);
        f6993j = bVarA9.b(c1486w09.b()).a();
        c.b bVarA10 = U4.c.a("isAccelerated");
        C1486w0 c1486w010 = new C1486w0();
        c1486w010.a(10);
        f6994k = bVarA10.b(c1486w010.b()).a();
    }

    private C1358k3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1470u6 c1470u6 = (C1470u6) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f6985b, c1470u6.e());
        eVar.b(f6986c, c1470u6.a());
        eVar.b(f6987d, c1470u6.d());
        eVar.b(f6988e, c1470u6.b());
        eVar.b(f6989f, c1470u6.c());
        eVar.b(f6990g, null);
        eVar.b(f6991h, null);
        eVar.b(f6992i, null);
        eVar.b(f6993j, null);
        eVar.b(f6994k, null);
    }
}
