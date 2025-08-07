package S3;

import U4.c;
import java.io.IOException;

final class Z2 implements U4.d {

    static final Z2 f6875a = new Z2();

    private static final U4.c f6876b;

    private static final U4.c f6877c;

    private static final U4.c f6878d;

    private static final U4.c f6879e;

    private static final U4.c f6880f;

    private static final U4.c f6881g;

    static {
        c.b bVarA = U4.c.a("maxMs");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f6876b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("minMs");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f6877c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("avgMs");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f6878d = bVarA3.b(c1486w03.b()).a();
        c.b bVarA4 = U4.c.a("firstQuartileMs");
        C1486w0 c1486w04 = new C1486w0();
        c1486w04.a(4);
        f6879e = bVarA4.b(c1486w04.b()).a();
        c.b bVarA5 = U4.c.a("medianMs");
        C1486w0 c1486w05 = new C1486w0();
        c1486w05.a(5);
        f6880f = bVarA5.b(c1486w05.b()).a();
        c.b bVarA6 = U4.c.a("thirdQuartileMs");
        C1486w0 c1486w06 = new C1486w0();
        c1486w06.a(6);
        f6881g = bVarA6.b(c1486w06.b()).a();
    }

    private Z2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1317g6 c1317g6 = (C1317g6) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f6876b, c1317g6.c());
        eVar.b(f6877c, c1317g6.e());
        eVar.b(f6878d, c1317g6.a());
        eVar.b(f6879e, c1317g6.b());
        eVar.b(f6880f, c1317g6.d());
        eVar.b(f6881g, c1317g6.f());
    }
}
