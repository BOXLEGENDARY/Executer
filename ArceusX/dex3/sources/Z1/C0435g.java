package Z1;

import a2.c;
import android.graphics.Color;
import java.io.IOException;

public class C0435g implements M<Integer> {
    public static final C0435g a = new C0435g();

    private C0435g() {
    }

    @Override
    public Integer a(a2.c cVar, float f) throws IOException {
        boolean z = cVar.h0() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.e();
        }
        double dA = cVar.A();
        double dA2 = cVar.A();
        double dA3 = cVar.A();
        double dA4 = cVar.h0() == c.b.NUMBER ? cVar.A() : 1.0d;
        if (z) {
            cVar.j();
        }
        if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
            dA *= 255.0d;
            dA2 *= 255.0d;
            dA3 *= 255.0d;
            if (dA4 <= 1.0d) {
                dA4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
    }
}
