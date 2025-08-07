package R3;

import U4.c;
import java.io.IOException;

final class E1 implements U4.d {

    static final E1 f5179a = new E1();

    private static final U4.c f5180b;

    private static final U4.c f5181c;

    private static final U4.c f5182d;

    static {
        c.b bVarA = U4.c.a("logEventKey");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5180b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("eventCount");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5181c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("inferenceDurationStats");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5182d = bVarA3.b(c1171t03.b()).a();
    }

    private E1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
