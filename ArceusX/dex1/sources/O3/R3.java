package O3;

import U4.c;
import java.io.IOException;

final class R3 implements U4.d {

    static final R3 f3272a = new R3();

    private static final U4.c f3273b;

    static {
        c.b bVarA = U4.c.a("errorCode");
        K0 k02 = new K0();
        k02.a(1);
        f3273b = bVarA.b(k02.b()).a();
    }

    private R3() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        ((U4.e) obj2).b(f3273b, ((C0618f7) obj).a());
    }
}
