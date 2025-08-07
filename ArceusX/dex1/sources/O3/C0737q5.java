package O3;

import U4.c;
import java.io.IOException;

final class C0737q5 implements U4.d {

    static final C0737q5 f3547a = new C0737q5();

    private static final U4.c f3548b;

    private static final U4.c f3549c;

    private static final U4.c f3550d;

    private static final U4.c f3551e;

    private static final U4.c f3552f;

    static {
        c.b bVarA = U4.c.a("xMin");
        K0 k02 = new K0();
        k02.a(1);
        f3548b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("yMin");
        K0 k03 = new K0();
        k03.a(2);
        f3549c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("xMax");
        K0 k04 = new K0();
        k04.a(3);
        f3550d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("yMax");
        K0 k05 = new K0();
        k05.a(4);
        f3551e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("confidenceScore");
        K0 k06 = new K0();
        k06.a(5);
        f3552f = bVarA5.b(k06.b()).a();
    }

    private C0737q5() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C0838z8 c0838z8 = (C0838z8) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3548b, c0838z8.c());
        eVar.b(f3549c, c0838z8.e());
        eVar.b(f3550d, c0838z8.b());
        eVar.b(f3551e, c0838z8.d());
        eVar.b(f3552f, c0838z8.a());
    }
}
