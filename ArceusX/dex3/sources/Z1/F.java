package Z1;

import a2.c;
import java.io.IOException;

public class F implements M<c2.d> {
    public static final F a = new F();

    private F() {
    }

    @Override
    public c2.d a(a2.c cVar, float f) throws IOException {
        boolean z = cVar.h0() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.e();
        }
        float fA = (float) cVar.A();
        float fA2 = (float) cVar.A();
        while (cVar.u()) {
            cVar.H0();
        }
        if (z) {
            cVar.j();
        }
        return new c2.d((fA / 100.0f) * f, (fA2 / 100.0f) * f);
    }
}
