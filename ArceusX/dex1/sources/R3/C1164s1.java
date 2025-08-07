package R3;

import U4.c;
import java.io.IOException;

final class C1164s1 implements U4.d {

    static final C1164s1 f5832a = new C1164s1();

    private static final U4.c f5833b;

    private static final U4.c f5834c;

    private static final U4.c f5835d;

    static {
        c.b bVarA = U4.c.a("logEventKey");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5833b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("eventCount");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5834c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("inferenceDurationStats");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5835d = bVarA3.b(c1171t03.b()).a();
    }

    private C1164s1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        S0 s02 = (S0) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5833b, s02.a());
        eVar.b(f5834c, s02.c());
        eVar.b(f5835d, s02.b());
    }
}
