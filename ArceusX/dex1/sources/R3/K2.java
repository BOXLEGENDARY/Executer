package R3;

import U4.c;
import java.io.IOException;

final class K2 implements U4.d {

    static final K2 f5261a = new K2();

    private static final U4.c f5262b;

    private static final U4.c f5263c;

    private static final U4.c f5264d;

    private static final U4.c f5265e;

    private static final U4.c f5266f;

    private static final U4.c f5267g;

    static {
        c.b bVarA = U4.c.a("inferenceCommonLogEvent");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5262b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("options");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5263c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("imageInfo");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5264d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("detectorOptions");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5265e = bVarA4.b(c1171t04.b()).a();
        c.b bVarA5 = U4.c.a("contourDetectedFaces");
        C1171t0 c1171t05 = new C1171t0();
        c1171t05.a(5);
        f5266f = bVarA5.b(c1171t05.b()).a();
        c.b bVarA6 = U4.c.a("nonContourDetectedFaces");
        C1171t0 c1171t06 = new C1171t0();
        c1171t06.a(6);
        f5267g = bVarA6.b(c1171t06.b()).a();
    }

    private K2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        U4 u42 = (U4) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5262b, u42.c());
        eVar.b(f5263c, null);
        eVar.b(f5264d, u42.b());
        eVar.b(f5265e, u42.a());
        eVar.b(f5266f, u42.d());
        eVar.b(f5267g, u42.e());
    }
}
