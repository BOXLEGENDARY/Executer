package O3;

import U4.c;
import java.io.IOException;

final class C0726p5 implements U4.d {

    static final C0726p5 f3536a = new C0726p5();

    private static final U4.c f3537b;

    private static final U4.c f3538c;

    private static final U4.c f3539d;

    private static final U4.c f3540e;

    private static final U4.c f3541f;

    private static final U4.c f3542g;

    static {
        c.b bVarA = U4.c.a("appName");
        K0 k02 = new K0();
        k02.a(1);
        f3537b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("sessionId");
        K0 k03 = new K0();
        k03.a(2);
        f3538c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("startZoomLevel");
        K0 k04 = new K0();
        k04.a(3);
        f3539d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("endZoomLevel");
        K0 k05 = new K0();
        k05.a(4);
        f3540e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("durationMs");
        K0 k06 = new K0();
        k06.a(5);
        f3541f = bVarA5.b(k06.b()).a();
        c.b bVarA6 = U4.c.a("predictedArea");
        K0 k07 = new K0();
        k07.a(6);
        f3542g = bVarA6.b(k07.b()).a();
    }

    private C0726p5() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        A8 a8 = (A8) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3537b, a8.e());
        eVar.b(f3538c, a8.f());
        eVar.b(f3539d, a8.c());
        eVar.b(f3540e, a8.b());
        eVar.b(f3541f, a8.d());
        eVar.b(f3542g, a8.a());
    }
}
