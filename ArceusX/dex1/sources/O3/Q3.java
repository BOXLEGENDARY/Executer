package O3;

import U4.c;
import java.io.IOException;

final class Q3 implements U4.d {

    static final Q3 f3256a = new Q3();

    private static final U4.c f3257b;

    private static final U4.c f3258c;

    private static final U4.c f3259d;

    private static final U4.c f3260e;

    private static final U4.c f3261f;

    static {
        c.b bVarA = U4.c.a("inferenceCommonLogEvent");
        K0 k02 = new K0();
        k02.a(1);
        f3257b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("options");
        K0 k03 = new K0();
        k03.a(2);
        f3258c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("detectedBarcodeFormats");
        K0 k04 = new K0();
        k04.a(3);
        f3259d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("detectedBarcodeValueTypes");
        K0 k05 = new K0();
        k05.a(4);
        f3260e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("imageInfo");
        K0 k06 = new K0();
        k06.a(5);
        f3261f = bVarA5.b(k06.b()).a();
    }

    private Q3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C0585c7 c0585c7 = (C0585c7) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3257b, c0585c7.d());
        eVar.b(f3258c, c0585c7.e());
        eVar.b(f3259d, c0585c7.a());
        eVar.b(f3260e, c0585c7.b());
        eVar.b(f3261f, c0585c7.c());
    }
}
