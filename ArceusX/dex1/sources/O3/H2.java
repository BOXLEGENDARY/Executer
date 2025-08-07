package O3;

import U4.c;
import java.io.IOException;

final class H2 implements U4.d {

    static final H2 f2883a = new H2();

    private static final U4.c f2884b;

    static {
        c.b bVarA = U4.c.a("format");
        K0 k02 = new K0();
        k02.a(1);
        f2884b = bVarA.b(k02.b()).a();
    }

    private H2() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        ((U4.e) obj2).b(f2884b, ((C0642h9) obj).a());
    }
}
