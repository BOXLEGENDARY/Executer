package W;

import C.h1;
import X.i0;
import android.util.Range;
import android.util.Size;
import f6.ck.ZJZXBWla;
import java.util.Objects;
import x0.h;
import z.C3043d0;
import z.C3070z;
import z.F0;

public class d implements h<i0> {

    private static final Size f7620g = new Size(1280, 720);

    private static final Range<Integer> f7621h = new Range<>(1, 60);

    private final String f7622a;

    private final h1 f7623b;

    private final S.i0 f7624c;

    private final Size f7625d;

    private final C3070z f7626e;

    private final Range<Integer> f7627f;

    public d(String str, h1 h1Var, S.i0 i0Var, Size size, C3070z c3070z, Range<Integer> range) {
        this.f7622a = str;
        this.f7623b = h1Var;
        this.f7624c = i0Var;
        this.f7625d = size;
        this.f7626e = c3070z;
        this.f7627f = range;
    }

    private int b() {
        Range<Integer> range = this.f7627f;
        Range<Integer> range2 = F0.f24495p;
        int iIntValue = !Objects.equals(range, range2) ? ((Integer) f7621h.clamp((Integer) this.f7627f.getUpper())).intValue() : 30;
        C3043d0.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", Integer.valueOf(iIntValue), Objects.equals(this.f7627f, range2) ? this.f7627f : "<UNSPECIFIED>"));
        return iIntValue;
    }

    @Override
    public i0 get() {
        int iB = b();
        C3043d0.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + iB + ZJZXBWla.RWUlXgupWRWZL);
        Range<Integer> rangeC = this.f7624c.c();
        C3043d0.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int iA = this.f7626e.a();
        int width = this.f7625d.getWidth();
        Size size = f7620g;
        int iE = c.e(14000000, iA, 8, iB, 30, width, size.getWidth(), this.f7625d.getHeight(), size.getHeight(), rangeC);
        int iA2 = Y.b.a(this.f7622a, this.f7626e);
        return i0.d().h(this.f7622a).g(this.f7623b).j(this.f7625d).b(iE).e(iB).i(iA2).d(c.b(this.f7622a, iA2)).a();
    }
}
