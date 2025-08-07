package R3;

import U4.c;
import java.io.IOException;

final class C1172t1 implements U4.d {

    static final C1172t1 f5849a = new C1172t1();

    private static final U4.c f5850b;

    private static final U4.c f5851c;

    private static final U4.c f5852d;

    private static final U4.c f5853e;

    private static final U4.c f5854f;

    private static final U4.c f5855g;

    static {
        c.b bVarA = U4.c.a("errorCode");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5850b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("isColdCall");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5851c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("imageInfo");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5852d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("detectorOptions");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5853e = bVarA4.b(c1171t04.b()).a();
        c.b bVarA5 = U4.c.a("contourDetectedFaces");
        C1171t0 c1171t05 = new C1171t0();
        c1171t05.a(5);
        f5854f = bVarA5.b(c1171t05.b()).a();
        c.b bVarA6 = U4.c.a("nonContourDetectedFaces");
        C1171t0 c1171t06 = new C1171t0();
        c1171t06.a(6);
        f5855g = bVarA6.b(c1171t06.b()).a();
    }

    private C1172t1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        Q0 q02 = (Q0) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5850b, q02.b());
        eVar.b(f5851c, q02.c());
        eVar.b(f5852d, null);
        eVar.b(f5853e, q02.a());
        eVar.b(f5854f, q02.d());
        eVar.b(f5855g, q02.e());
    }
}
