package O3;

import U4.c;
import java.io.IOException;

final class C0824y5 implements U4.d {

    static final C0824y5 f3648a = new C0824y5();

    private static final U4.c f3649b;

    private static final U4.c f3650c;

    private static final U4.c f3651d;

    private static final U4.c f3652e;

    private static final U4.c f3653f;

    private static final U4.c f3654g;

    private static final U4.c f3655h;

    private static final U4.c f3656i;

    private static final U4.c f3657j;

    private static final U4.c f3658k;

    private static final U4.c f3659l;

    private static final U4.c f3660m;

    private static final U4.c f3661n;

    private static final U4.c f3662o;

    static {
        c.b bVarA = U4.c.a("appId");
        K0 k02 = new K0();
        k02.a(1);
        f3649b = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("appVersion");
        K0 k03 = new K0();
        k03.a(2);
        f3650c = bVarA2.b(k03.b()).a();
        c.b bVarA3 = U4.c.a("firebaseProjectId");
        K0 k04 = new K0();
        k04.a(3);
        f3651d = bVarA3.b(k04.b()).a();
        c.b bVarA4 = U4.c.a("mlSdkVersion");
        K0 k05 = new K0();
        k05.a(4);
        f3652e = bVarA4.b(k05.b()).a();
        c.b bVarA5 = U4.c.a("tfliteSchemaVersion");
        K0 k06 = new K0();
        k06.a(5);
        f3653f = bVarA5.b(k06.b()).a();
        c.b bVarA6 = U4.c.a("gcmSenderId");
        K0 k07 = new K0();
        k07.a(6);
        f3654g = bVarA6.b(k07.b()).a();
        c.b bVarA7 = U4.c.a("apiKey");
        K0 k08 = new K0();
        k08.a(7);
        f3655h = bVarA7.b(k08.b()).a();
        c.b bVarA8 = U4.c.a("languages");
        K0 k09 = new K0();
        k09.a(8);
        f3656i = bVarA8.b(k09.b()).a();
        c.b bVarA9 = U4.c.a("mlSdkInstanceId");
        K0 k010 = new K0();
        k010.a(9);
        f3657j = bVarA9.b(k010.b()).a();
        c.b bVarA10 = U4.c.a("isClearcutClient");
        K0 k011 = new K0();
        k011.a(10);
        f3658k = bVarA10.b(k011.b()).a();
        c.b bVarA11 = U4.c.a("isStandaloneMlkit");
        K0 k012 = new K0();
        k012.a(11);
        f3659l = bVarA11.b(k012.b()).a();
        c.b bVarA12 = U4.c.a("isJsonLogging");
        K0 k013 = new K0();
        k013.a(12);
        f3660m = bVarA12.b(k013.b()).a();
        c.b bVarA13 = U4.c.a("buildLevel");
        K0 k014 = new K0();
        k014.a(13);
        f3661n = bVarA13.b(k014.b()).a();
        c.b bVarA14 = U4.c.a("optionalModuleVersion");
        K0 k015 = new K0();
        k015.a(14);
        f3662o = bVarA14.b(k015.b()).a();
    }

    private C0824y5() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        L8 l8 = (L8) obj;
        U4.e eVar = (U4.e) obj2;
        eVar.b(f3649b, l8.g());
        eVar.b(f3650c, l8.h());
        eVar.b(f3651d, null);
        eVar.b(f3652e, l8.j());
        eVar.b(f3653f, l8.k());
        eVar.b(f3654g, null);
        eVar.b(f3655h, null);
        eVar.b(f3656i, l8.a());
        eVar.b(f3657j, l8.i());
        eVar.b(f3658k, l8.b());
        eVar.b(f3659l, l8.d());
        eVar.b(f3660m, l8.c());
        eVar.b(f3661n, l8.e());
        eVar.b(f3662o, l8.f());
    }
}
