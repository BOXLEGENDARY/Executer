package S3;

import U4.c;
import java.io.IOException;

final class W4 implements U4.d {

    static final W4 f6857a = new W4();

    private static final U4.c f6858b;

    private static final U4.c f6859c;

    private static final U4.c f6860d;

    static {
        c.b bVarA = U4.c.a("inferenceCommonLogEvent");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f6858b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("imageInfo");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f6859c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("recognizerOptions");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f6860d = bVarA3.b(c1486w03.b()).a();
    }

    private W4() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C1374l8 c1374l8 = (C1374l8) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f6858b, c1374l8.b());
        eVar.b(f6859c, c1374l8.a());
        eVar.b(f6860d, c1374l8.c());
    }
}
