package S3;

import U4.c;
import java.io.IOException;

final class V4 implements U4.d {

    static final V4 f6850a = new V4();

    private static final U4.c f6851b;

    static {
        c.b bVarA = U4.c.a("errorCode");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f6851b = bVarA.b(c1486w0.b()).a();
    }

    private V4() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        ((U4.e) obj2).b(f6851b, ((C1341i8) obj).a());
    }
}
