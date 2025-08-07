package Q3;

import U4.c;
import java.io.IOException;

final class C0947p1 implements U4.d {

    static final C0947p1 f4547a = new C0947p1();

    private static final U4.c f4548b;

    private static final U4.c f4549c;

    private static final U4.c f4550d;

    private static final U4.c f4551e;

    private static final U4.c f4552f;

    private static final U4.c f4553g;

    private static final U4.c f4554h;

    static {
        c.b bVarA = U4.c.a("durationMs");
        C0875f c0875f = new C0875f();
        c0875f.a(1);
        f4548b = bVarA.b(c0875f.b()).a();
        c.b bVarA2 = U4.c.a("imageSource");
        C0875f c0875f2 = new C0875f();
        c0875f2.a(2);
        f4549c = bVarA2.b(c0875f2.b()).a();
        c.b bVarA3 = U4.c.a("imageFormat");
        C0875f c0875f3 = new C0875f();
        c0875f3.a(3);
        f4550d = bVarA3.b(c0875f3.b()).a();
        c.b bVarA4 = U4.c.a("imageByteSize");
        C0875f c0875f4 = new C0875f();
        c0875f4.a(4);
        f4551e = bVarA4.b(c0875f4.b()).a();
        c.b bVarA5 = U4.c.a("imageWidth");
        C0875f c0875f5 = new C0875f();
        c0875f5.a(5);
        f4552f = bVarA5.b(c0875f5.b()).a();
        c.b bVarA6 = U4.c.a("imageHeight");
        C0875f c0875f6 = new C0875f();
        c0875f6.a(6);
        f4553g = bVarA6.b(c0875f6.b()).a();
        c.b bVarA7 = U4.c.a("rotationDegrees");
        C0875f c0875f7 = new C0875f();
        c0875f7.a(7);
        f4554h = bVarA7.b(c0875f7.b()).a();
    }

    private C0947p1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        A3 a3 = (A3) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f4548b, a3.g());
        eVar.b(f4549c, a3.b());
        eVar.b(f4550d, a3.a());
        eVar.b(f4551e, a3.c());
        eVar.b(f4552f, a3.e());
        eVar.b(f4553g, a3.d());
        eVar.b(f4554h, a3.f());
    }
}
