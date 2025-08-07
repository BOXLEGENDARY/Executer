package S3;

import U4.c;
import java.io.IOException;

final class C1303f3 implements U4.d {

    static final C1303f3 f6932a = new C1303f3();

    private static final U4.c f6933b;

    private static final U4.c f6934c;

    private static final U4.c f6935d;

    private static final U4.c f6936e;

    static {
        c.b bVarA = U4.c.a("imageFormat");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f6933b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("originalImageSize");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f6934c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("compressedImageSize");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f6935d = bVarA3.b(c1486w03.b()).a();
        c.b bVarA4 = U4.c.a("isOdmlImage");
        C1486w0 c1486w04 = new C1486w0();
        c1486w04.a(4);
        f6936e = bVarA4.b(c1486w04.b()).a();
    }

    private C1303f3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1405o6 c1405o6 = (C1405o6) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f6933b, c1405o6.a());
        eVar.b(f6934c, c1405o6.b());
        eVar.b(f6935d, null);
        eVar.b(f6936e, null);
    }
}
