package S3;

import U4.c;
import java.io.IOException;

final class C1426q5 implements U4.d {

    static final C1426q5 f7085a = new C1426q5();

    private static final U4.c f7086b;

    private static final U4.c f7087c;

    private static final U4.c f7088d;

    private static final U4.c f7089e;

    private static final U4.c f7090f;

    private static final U4.c f7091g;

    private static final U4.c f7092h;

    private static final U4.c f7093i;

    private static final U4.c f7094j;

    private static final U4.c f7095k;

    private static final U4.c f7096l;

    private static final U4.c f7097m;

    private static final U4.c f7098n;

    private static final U4.c f7099o;

    static {
        c.b bVarA = U4.c.a("appId");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f7086b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("appVersion");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f7087c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a("firebaseProjectId");
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(3);
        f7088d = bVarA3.b(c1486w03.b()).a();
        c.b bVarA4 = U4.c.a("mlSdkVersion");
        C1486w0 c1486w04 = new C1486w0();
        c1486w04.a(4);
        f7089e = bVarA4.b(c1486w04.b()).a();
        c.b bVarA5 = U4.c.a("tfliteSchemaVersion");
        C1486w0 c1486w05 = new C1486w0();
        c1486w05.a(5);
        f7090f = bVarA5.b(c1486w05.b()).a();
        c.b bVarA6 = U4.c.a("gcmSenderId");
        C1486w0 c1486w06 = new C1486w0();
        c1486w06.a(6);
        f7091g = bVarA6.b(c1486w06.b()).a();
        c.b bVarA7 = U4.c.a("apiKey");
        C1486w0 c1486w07 = new C1486w0();
        c1486w07.a(7);
        f7092h = bVarA7.b(c1486w07.b()).a();
        c.b bVarA8 = U4.c.a("languages");
        C1486w0 c1486w08 = new C1486w0();
        c1486w08.a(8);
        f7093i = bVarA8.b(c1486w08.b()).a();
        c.b bVarA9 = U4.c.a("mlSdkInstanceId");
        C1486w0 c1486w09 = new C1486w0();
        c1486w09.a(9);
        f7094j = bVarA9.b(c1486w09.b()).a();
        c.b bVarA10 = U4.c.a("isClearcutClient");
        C1486w0 c1486w010 = new C1486w0();
        c1486w010.a(10);
        f7095k = bVarA10.b(c1486w010.b()).a();
        c.b bVarA11 = U4.c.a("isStandaloneMlkit");
        C1486w0 c1486w011 = new C1486w0();
        c1486w011.a(11);
        f7096l = bVarA11.b(c1486w011.b()).a();
        c.b bVarA12 = U4.c.a("isJsonLogging");
        C1486w0 c1486w012 = new C1486w0();
        c1486w012.a(12);
        f7097m = bVarA12.b(c1486w012.b()).a();
        c.b bVarA13 = U4.c.a("buildLevel");
        C1486w0 c1486w013 = new C1486w0();
        c1486w013.a(13);
        f7098n = bVarA13.b(c1486w013.b()).a();
        c.b bVarA14 = U4.c.a("optionalModuleVersion");
        C1486w0 c1486w014 = new C1486w0();
        c1486w014.a(14);
        f7099o = bVarA14.b(c1486w014.b()).a();
    }

    private C1426q5() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        G8 g8 = (G8) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f7086b, g8.g());
        eVar.b(f7087c, g8.h());
        eVar.b(f7088d, null);
        eVar.b(f7089e, g8.j());
        eVar.b(f7090f, g8.k());
        eVar.b(f7091g, null);
        eVar.b(f7092h, null);
        eVar.b(f7093i, g8.a());
        eVar.b(f7094j, g8.i());
        eVar.b(f7095k, g8.b());
        eVar.b(f7096l, g8.d());
        eVar.b(f7097m, g8.c());
        eVar.b(f7098n, g8.e());
        eVar.b(f7099o, g8.f());
    }
}
