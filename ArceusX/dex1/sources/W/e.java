package W;

import C.InterfaceC0336k0;
import C.h1;
import X.i0;
import android.util.Range;
import android.util.Size;
import java.util.Objects;
import x0.h;
import z.C3043d0;
import z.C3070z;
import z.F0;

public class e implements h<i0> {

    private final String f7628a;

    private final h1 f7629b;

    private final S.i0 f7630c;

    private final Size f7631d;

    private final InterfaceC0336k0.c f7632e;

    private final C3070z f7633f;

    private final Range<Integer> f7634g;

    public e(String str, h1 h1Var, S.i0 i0Var, Size size, InterfaceC0336k0.c cVar, C3070z c3070z, Range<Integer> range) {
        this.f7628a = str;
        this.f7629b = h1Var;
        this.f7630c = i0Var;
        this.f7631d = size;
        this.f7632e = cVar;
        this.f7633f = c3070z;
        this.f7634g = range;
    }

    private int b() {
        int iF = this.f7632e.f();
        Range<Integer> range = this.f7634g;
        Range<Integer> range2 = F0.f24495p;
        int iIntValue = !Objects.equals(range, range2) ? ((Integer) this.f7634g.clamp(Integer.valueOf(iF))).intValue() : iF;
        C3043d0.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", Integer.valueOf(iIntValue), Integer.valueOf(iF), Objects.equals(this.f7634g, range2) ? this.f7634g : "<UNSPECIFIED>"));
        return iIntValue;
    }

    @Override
    public i0 get() {
        int iB = b();
        C3043d0.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + iB + "fps");
        Range<Integer> rangeC = this.f7630c.c();
        C3043d0.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iE = c.e(this.f7632e.c(), this.f7633f.a(), this.f7632e.b(), iB, this.f7632e.f(), this.f7631d.getWidth(), this.f7632e.k(), this.f7631d.getHeight(), this.f7632e.h(), rangeC);
        int iJ = this.f7632e.j();
        return i0.d().h(this.f7628a).g(this.f7629b).j(this.f7631d).b(iE).e(iB).i(iJ).d(c.b(this.f7628a, iJ)).a();
    }
}
