package R3;

import U4.c;
import java.io.IOException;

final class L2 implements U4.d {

    static final L2 f5277a = new L2();

    private static final U4.c f5278b;

    static {
        c.b bVarA = U4.c.a("errorCode");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f5278b = bVarA.b(c1171t0.b()).a();
    }

    private L2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        ((U4.e) obj2).b(f5278b, ((X4) obj).a());
    }
}
