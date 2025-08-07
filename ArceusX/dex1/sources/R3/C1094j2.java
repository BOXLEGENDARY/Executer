package R3;

import U4.c;
import java.io.IOException;

final class C1094j2 implements U4.d {

    static final C1094j2 f5609a = new C1094j2();

    private static final U4.c f5610b;

    private static final U4.c f5611c;

    private static final U4.c f5612d;

    private static final U4.c f5613e;

    private static final U4.c f5614f;

    private static final U4.c f5615g;

    static {
        c.b bVarA = U4.c.a("landmarkMode");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5610b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("classificationMode");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5611c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("performanceMode");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5612d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("contourMode");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5613e = bVarA4.b(c1171t04.b()).a();
        c.b bVarA5 = U4.c.a("isTrackingEnabled");
        C1171t0 c1171t05 = new C1171t0();
        c1171t05.a(5);
        f5614f = bVarA5.b(c1171t05.b()).a();
        c.b bVarA6 = U4.c.a("minFaceSize");
        C1171t0 c1171t06 = new C1171t0();
        c1171t06.a(6);
        f5615g = bVarA6.b(c1171t06.b()).a();
    }

    private C1094j2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1112l4 c1112l4 = (C1112l4) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5610b, c1112l4.c());
        eVar.b(f5611c, c1112l4.a());
        eVar.b(f5612d, c1112l4.d());
        eVar.b(f5613e, c1112l4.b());
        eVar.b(f5614f, c1112l4.e());
        eVar.b(f5615g, c1112l4.f());
    }
}
