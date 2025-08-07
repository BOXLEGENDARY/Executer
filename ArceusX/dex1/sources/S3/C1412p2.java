package S3;

import U4.c;
import java.io.IOException;

final class C1412p2 implements U4.d {

    static final C1412p2 f7068a = new C1412p2();

    private static final U4.c f7069b;

    private static final U4.c f7070c;

    private static final U4.c f7071d;

    private static final U4.c f7072e;

    private static final U4.c f7073f;

    static {
        c.b bVarA = U4.c.a("errorCode");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f7069b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("hasResult");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f7070c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("isColdCall");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f7071d = bVarA3.b(c1486w03.b()).a();
        c.b bVarA4 = U4.c.a("imageInfo");
        C1486w0 c1486w04 = new C1486w0();
        c1486w04.a(4);
        f7072e = bVarA4.b(c1486w04.b()).a();
        c.b bVarA5 = U4.c.a("recognizerOptions");
        C1486w0 c1486w05 = new C1486w0();
        c1486w05.a(5);
        f7073f = bVarA5.b(c1486w05.b()).a();
    }

    private C1412p2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1487w1 c1487w1 = (C1487w1) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f7069b, c1487w1.a());
        eVar.b(f7070c, null);
        eVar.b(f7071d, c1487w1.c());
        eVar.b(f7072e, null);
        eVar.b(f7073f, c1487w1.b());
    }
}
