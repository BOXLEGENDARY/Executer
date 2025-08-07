package C;

import C.p1;
import android.util.Range;
import android.util.Size;
import java.util.List;
import z.C3070z;

final class C0317b extends AbstractC0315a {

    private final e1 f509a;

    private final int f510b;

    private final Size f511c;

    private final C3070z f512d;

    private final List<p1.b> f513e;

    private final X f514f;

    private final Range<Integer> f515g;

    C0317b(e1 e1Var, int i7, Size size, C3070z c3070z, List<p1.b> list, X x7, Range<Integer> range) {
        if (e1Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f509a = e1Var;
        this.f510b = i7;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f511c = size;
        if (c3070z == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f512d = c3070z;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f513e = list;
        this.f514f = x7;
        this.f515g = range;
    }

    @Override
    public List<p1.b> b() {
        return this.f513e;
    }

    @Override
    public C3070z c() {
        return this.f512d;
    }

    @Override
    public int d() {
        return this.f510b;
    }

    @Override
    public X e() {
        return this.f514f;
    }

    public boolean equals(Object obj) {
        X x7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0315a)) {
            return false;
        }
        AbstractC0315a abstractC0315a = (AbstractC0315a) obj;
        if (this.f509a.equals(abstractC0315a.g()) && this.f510b == abstractC0315a.d() && this.f511c.equals(abstractC0315a.f()) && this.f512d.equals(abstractC0315a.c()) && this.f513e.equals(abstractC0315a.b()) && ((x7 = this.f514f) != null ? x7.equals(abstractC0315a.e()) : abstractC0315a.e() == null)) {
            Range<Integer> range = this.f515g;
            if (range == null) {
                if (abstractC0315a.h() == null) {
                    return true;
                }
            } else if (range.equals(abstractC0315a.h())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Size f() {
        return this.f511c;
    }

    @Override
    public e1 g() {
        return this.f509a;
    }

    @Override
    public Range<Integer> h() {
        return this.f515g;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f509a.hashCode() ^ 1000003) * 1000003) ^ this.f510b) * 1000003) ^ this.f511c.hashCode()) * 1000003) ^ this.f512d.hashCode()) * 1000003) ^ this.f513e.hashCode()) * 1000003;
        X x7 = this.f514f;
        int iHashCode2 = (iHashCode ^ (x7 == null ? 0 : x7.hashCode())) * 1000003;
        Range<Integer> range = this.f515g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f509a + ", imageFormat=" + this.f510b + ", size=" + this.f511c + ", dynamicRange=" + this.f512d + ", captureTypes=" + this.f513e + ", implementationOptions=" + this.f514f + ", targetFrameRate=" + this.f515g + "}";
    }
}
