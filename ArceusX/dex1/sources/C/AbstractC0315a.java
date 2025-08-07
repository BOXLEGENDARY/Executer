package C;

import C.c1;
import C.p1;
import android.util.Range;
import android.util.Size;
import java.util.List;
import z.C3070z;

public abstract class AbstractC0315a {
    AbstractC0315a() {
    }

    public static AbstractC0315a a(e1 e1Var, int i7, Size size, C3070z c3070z, List<p1.b> list, X x7, Range<Integer> range) {
        return new C0317b(e1Var, i7, size, c3070z, list, x7, range);
    }

    public abstract List<p1.b> b();

    public abstract C3070z c();

    public abstract int d();

    public abstract X e();

    public abstract Size f();

    public abstract e1 g();

    public abstract Range<Integer> h();

    public c1 i(X x7) {
        c1.a aVarD = c1.a(f()).b(c()).d(x7);
        if (h() != null) {
            aVarD.c(h());
        }
        return aVarD.a();
    }
}
