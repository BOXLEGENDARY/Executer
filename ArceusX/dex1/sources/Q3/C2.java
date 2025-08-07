package Q3;

import U4.c;
import java.io.IOException;

final class C2 implements U4.d {

    static final C2 f3827a = new C2();

    private static final U4.c f3828b;

    private static final U4.c f3829c;

    private static final U4.c f3830d;

    private static final U4.c f3831e;

    private static final U4.c f3832f;

    private static final U4.c f3833g;

    private static final U4.c f3834h;

    private static final U4.c f3835i;

    private static final U4.c f3836j;

    private static final U4.c f3837k;

    private static final U4.c f3838l;

    private static final U4.c f3839m;

    private static final U4.c f3840n;

    private static final U4.c f3841o;

    static {
        c.b bVarA = U4.c.a("appId");
        C0875f c0875f = new C0875f();
        c0875f.a(1);
        f3828b = bVarA.b(c0875f.b()).a();
        c.b bVarA2 = U4.c.a("appVersion");
        C0875f c0875f2 = new C0875f();
        c0875f2.a(2);
        f3829c = bVarA2.b(c0875f2.b()).a();
        c.b bVarA3 = U4.c.a("firebaseProjectId");
        C0875f c0875f3 = new C0875f();
        c0875f3.a(3);
        f3830d = bVarA3.b(c0875f3.b()).a();
        c.b bVarA4 = U4.c.a("mlSdkVersion");
        C0875f c0875f4 = new C0875f();
        c0875f4.a(4);
        f3831e = bVarA4.b(c0875f4.b()).a();
        c.b bVarA5 = U4.c.a("tfliteSchemaVersion");
        C0875f c0875f5 = new C0875f();
        c0875f5.a(5);
        f3832f = bVarA5.b(c0875f5.b()).a();
        c.b bVarA6 = U4.c.a("gcmSenderId");
        C0875f c0875f6 = new C0875f();
        c0875f6.a(6);
        f3833g = bVarA6.b(c0875f6.b()).a();
        c.b bVarA7 = U4.c.a("apiKey");
        C0875f c0875f7 = new C0875f();
        c0875f7.a(7);
        f3834h = bVarA7.b(c0875f7.b()).a();
        c.b bVarA8 = U4.c.a("languages");
        C0875f c0875f8 = new C0875f();
        c0875f8.a(8);
        f3835i = bVarA8.b(c0875f8.b()).a();
        c.b bVarA9 = U4.c.a("mlSdkInstanceId");
        C0875f c0875f9 = new C0875f();
        c0875f9.a(9);
        f3836j = bVarA9.b(c0875f9.b()).a();
        c.b bVarA10 = U4.c.a("isClearcutClient");
        C0875f c0875f10 = new C0875f();
        c0875f10.a(10);
        f3837k = bVarA10.b(c0875f10.b()).a();
        c.b bVarA11 = U4.c.a("isStandaloneMlkit");
        C0875f c0875f11 = new C0875f();
        c0875f11.a(11);
        f3838l = bVarA11.b(c0875f11.b()).a();
        c.b bVarA12 = U4.c.a("isJsonLogging");
        C0875f c0875f12 = new C0875f();
        c0875f12.a(12);
        f3839m = bVarA12.b(c0875f12.b()).a();
        c.b bVarA13 = U4.c.a("buildLevel");
        C0875f c0875f13 = new C0875f();
        c0875f13.a(13);
        f3840n = bVarA13.b(c0875f13.b()).a();
        c.b bVarA14 = U4.c.a("optionalModuleVersion");
        C0875f c0875f14 = new C0875f();
        c0875f14.a(14);
        f3841o = bVarA14.b(c0875f14.b()).a();
    }

    private C2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        N4 n42 = (N4) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3828b, n42.g());
        eVar.b(f3829c, n42.h());
        eVar.b(f3830d, null);
        eVar.b(f3831e, n42.j());
        eVar.b(f3832f, n42.k());
        eVar.b(f3833g, null);
        eVar.b(f3834h, null);
        eVar.b(f3835i, n42.a());
        eVar.b(f3836j, n42.i());
        eVar.b(f3837k, n42.b());
        eVar.b(f3838l, n42.d());
        eVar.b(f3839m, n42.c());
        eVar.b(f3840n, n42.e());
        eVar.b(f3841o, n42.f());
    }
}
