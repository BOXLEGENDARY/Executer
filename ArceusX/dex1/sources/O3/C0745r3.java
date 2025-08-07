package O3;

import U4.c;
import java.io.IOException;

final class C0745r3 implements U4.d {

    static final C0745r3 f3556a = new C0745r3();

    private static final U4.c f3557b;

    private static final U4.c f3558c;

    private static final U4.c f3559d;

    private static final U4.c f3560e;

    static {
        c.b bVarA = U4.c.a("imageFormat");
        K0 k02 = new K0();
        k02.a(1);
        f3557b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("originalImageSize");
        K0 k03 = new K0();
        k03.a(2);
        f3558c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("compressedImageSize");
        K0 k04 = new K0();
        k04.a(3);
        f3559d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("isOdmlImage");
        K0 k05 = new K0();
        k05.a(4);
        f3560e = bVarA4.b(k05.b()).a();
    }

    private C0745r3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        C0792v6 c0792v6 = (C0792v6) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3557b, c0792v6.a());
        eVar.b(f3558c, c0792v6.b());
        eVar.b(f3559d, null);
        eVar.b(f3560e, null);
    }
}
