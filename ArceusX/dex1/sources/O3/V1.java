package O3;

import U4.c;
import java.io.IOException;

final class V1 implements U4.d {

    static final V1 f3307a = new V1();

    private static final U4.c f3308b;

    private static final U4.c f3309c;

    private static final U4.c f3310d;

    static {
        c.b bVarA = U4.c.a("logEventKey");
        K0 k02 = new K0();
        k02.a(1);
        f3308b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("eventCount");
        K0 k03 = new K0();
        k03.a(2);
        f3309c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("inferenceDurationStats");
        K0 k04 = new K0();
        k04.a(3);
        f3310d = bVarA3.b(k04.b()).a();
    }

    private V1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C0612f1 c0612f1 = (C0612f1) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3308b, c0612f1.a());
        eVar.b(f3309c, c0612f1.c());
        eVar.b(f3310d, c0612f1.b());
    }
}
