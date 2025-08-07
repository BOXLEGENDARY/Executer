package R3;

import U4.c;
import java.io.IOException;

final class C1 implements U4.d {

    static final C1 f5132a = new C1();

    private static final U4.c f5133b;

    private static final U4.c f5134c;

    private static final U4.c f5135d;

    static {
        c.b bVarA = U4.c.a("logEventKey");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5133b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("eventCount");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5134c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("inferenceDurationStats");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5135d = bVarA3.b(c1171t03.b()).a();
    }

    private C1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
