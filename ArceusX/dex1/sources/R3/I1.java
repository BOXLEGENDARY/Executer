package R3;

import U4.c;
import java.io.IOException;

final class I1 implements U4.d {

    static final I1 f5242a = new I1();

    private static final U4.c f5243b;

    private static final U4.c f5244c;

    private static final U4.c f5245d;

    private static final U4.c f5246e;

    static {
        c.b bVarA = U4.c.a("remoteModelOptions");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5243b = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("localModelOptions");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f5244c = bVarA2.b(c1171t02.b()).a();
        c.b bVarA3 = U4.c.a("errorCodes");
        C1171t0 c1171t03 = new C1171t0();
        c1171t03.a(3);
        f5245d = bVarA3.b(c1171t03.b()).a();
        c.b bVarA4 = U4.c.a("modelInitializationMs");
        C1171t0 c1171t04 = new C1171t0();
        c1171t04.a(4);
        f5246e = bVarA4.b(c1171t04.b()).a();
    }

    private I1() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
