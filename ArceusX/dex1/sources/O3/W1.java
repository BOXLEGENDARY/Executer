package O3;

import U4.c;
import java.io.IOException;

final class W1 implements U4.d {

    static final W1 f3315a = new W1();

    private static final U4.c f3316b;

    private static final U4.c f3317c;

    private static final U4.c f3318d;

    private static final U4.c f3319e;

    private static final U4.c f3320f;

    private static final U4.c f3321g;

    private static final U4.c f3322h;

    static {
        c.b bVarA = U4.c.a("errorCode");
        K0 k02 = new K0();
        k02.a(1);
        f3316b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("hasResult");
        K0 k03 = new K0();
        k03.a(2);
        f3317c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("isColdCall");
        K0 k04 = new K0();
        k04.a(3);
        f3318d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("imageInfo");
        K0 k05 = new K0();
        k05.a(4);
        f3319e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("options");
        K0 k06 = new K0();
        k06.a(5);
        f3320f = bVarA5.b(k06.b()).a();
        c.b bVarA6 = U4.c.a("detectedBarcodeFormats");
        K0 k07 = new K0();
        k07.a(6);
        f3321g = bVarA6.b(k07.b()).a();
        c.b bVarA7 = U4.c.a("detectedBarcodeValueTypes");
        K0 k08 = new K0();
        k08.a(7);
        f3322h = bVarA7.b(k08.b()).a();
    }

    private W1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C0590d1 c0590d1 = (C0590d1) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3316b, c0590d1.c());
        eVar.b(f3317c, null);
        eVar.b(f3318d, c0590d1.e());
        eVar.b(f3319e, null);
        eVar.b(f3320f, c0590d1.d());
        eVar.b(f3321g, c0590d1.a());
        eVar.b(f3322h, c0590d1.b());
    }
}
