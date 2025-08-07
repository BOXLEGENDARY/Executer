package R3;

import U4.c;
import java.io.IOException;

final class C1078h2 implements U4.d {

    static final C1078h2 f5558a = new C1078h2();

    private static final U4.c f5559b;

    private static final U4.c f5560c;

    private static final U4.c f5561d;

    private static final U4.c f5562e;

    private static final U4.c f5563f;

    private static final U4.c f5564g;

    static {
        c.b bVarA = U4.c.a("maxMs");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5559b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("minMs");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5560c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("avgMs");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5561d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("firstQuartileMs");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5562e = bVarA4.b(c1171t04.b()).a();
        c.b bVarA5 = U4.c.a("medianMs");
        C1171t0 c1171t05 = new C1171t0();
        c1171t05.a(5);
        f5563f = bVarA5.b(c1171t05.b()).a();
        c.b bVarA6 = U4.c.a("thirdQuartileMs");
        C1171t0 c1171t06 = new C1171t0();
        c1171t06.a(6);
        f5564g = bVarA6.b(c1171t06.b()).a();
    }

    private C1078h2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1040c4 c1040c4 = (C1040c4) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5559b, c1040c4.c());
        eVar.b(f5560c, c1040c4.e());
        eVar.b(f5561d, c1040c4.a());
        eVar.b(f5562e, c1040c4.b());
        eVar.b(f5563f, c1040c4.d());
        eVar.b(f5564g, c1040c4.f());
    }
}
