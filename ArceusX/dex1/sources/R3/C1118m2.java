package R3;

import U4.c;
import java.io.IOException;

final class C1118m2 implements U4.d {

    static final C1118m2 f5675a = new C1118m2();

    private static final U4.c f5676b;

    private static final U4.c f5677c;

    private static final U4.c f5678d;

    private static final U4.c f5679e;

    static {
        c.b bVarA = U4.c.a("imageFormat");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5676b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("originalImageSize");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5677c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("compressedImageSize");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5678d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("isOdmlImage");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5679e = bVarA4.b(c1171t04.b()).a();
    }

    private C1118m2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1144p4 c1144p4 = (C1144p4) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f5676b, c1144p4.a());
        eVar.b(f5677c, c1144p4.b());
        eVar.b(f5678d, null);
        eVar.b(f5679e, null);
    }
}
