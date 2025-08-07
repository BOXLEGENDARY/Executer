package O3;

import U4.c;
import java.io.IOException;

final class C0680l3 implements U4.d {

    static final C0680l3 f3496a = new C0680l3();

    private static final U4.c f3497b;

    private static final U4.c f3498c;

    private static final U4.c f3499d;

    private static final U4.c f3500e;

    private static final U4.c f3501f;

    private static final U4.c f3502g;

    static {
        c.b bVarA = U4.c.a("maxMs");
        K0 k02 = new K0();
        k02.a(1);
        f3497b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("minMs");
        K0 k03 = new K0();
        k03.a(2);
        f3498c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("avgMs");
        K0 k04 = new K0();
        k04.a(3);
        f3499d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("firstQuartileMs");
        K0 k05 = new K0();
        k05.a(4);
        f3500e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("medianMs");
        K0 k06 = new K0();
        k06.a(5);
        f3501f = bVarA5.b(k06.b()).a();
        c.b bVarA6 = U4.c.a("thirdQuartileMs");
        K0 k07 = new K0();
        k07.a(6);
        f3502g = bVarA6.b(k07.b()).a();
    }

    private C0680l3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C0716o6 c0716o6 = (C0716o6) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3497b, c0716o6.c());
        eVar.b(f3498c, c0716o6.e());
        eVar.b(f3499d, c0716o6.a());
        eVar.b(f3500e, c0716o6.b());
        eVar.b(f3501f, c0716o6.d());
        eVar.b(f3502g, c0716o6.f());
    }
}
