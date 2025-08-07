package Z1;

import a2.c;
import android.graphics.PointF;
import java.io.IOException;

public class B implements M<PointF> {
    public static final B a = new B();

    private B() {
    }

    @Override
    public PointF a(a2.c cVar, float f) throws IOException {
        c.b bVarH0 = cVar.h0();
        if (bVarH0 != c.b.BEGIN_ARRAY && bVarH0 != c.b.BEGIN_OBJECT) {
            if (bVarH0 == c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.A()) * f, ((float) cVar.A()) * f);
                while (cVar.u()) {
                    cVar.H0();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarH0);
        }
        return s.e(cVar, f);
    }
}
