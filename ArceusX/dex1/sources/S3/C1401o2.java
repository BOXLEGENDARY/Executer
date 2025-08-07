package S3;

import U4.c;
import java.io.IOException;

final class C1401o2 implements U4.d {

    static final C1401o2 f7045a = new C1401o2();

    private static final U4.c f7046b;

    private static final U4.c f7047c;

    private static final U4.c f7048d;

    static {
        c.b bVarA = U4.c.a("logEventKey");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f7046b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("eventCount");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f7047c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("inferenceDurationStats");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f7048d = bVarA3.b(c1486w03.b()).a();
    }

    private C1401o2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1508y1 c1508y1 = (C1508y1) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f7046b, c1508y1.a());
        eVar.b(f7047c, c1508y1.c());
        eVar.b(f7048d, c1508y1.b());
    }
}
