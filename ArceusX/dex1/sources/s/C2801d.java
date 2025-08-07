package s;

import C.p1;
import android.util.Size;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.List;
import s.C2779M;

final class C2801d extends C2779M.k {

    private final String f23310a;

    private final Class<?> f23311b;

    private final C.X0 f23312c;

    private final C.o1<?> f23313d;

    private final Size f23314e;

    private final C.c1 f23315f;

    private final List<p1.b> f23316g;

    C2801d(String str, Class<?> cls, C.X0 x02, C.o1<?> o1Var, Size size, C.c1 c1Var, List<p1.b> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f23310a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f23311b = cls;
        if (x02 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f23312c = x02;
        if (o1Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f23313d = o1Var;
        this.f23314e = size;
        this.f23315f = c1Var;
        this.f23316g = list;
    }

    @Override
    List<p1.b> c() {
        return this.f23316g;
    }

    @Override
    C.X0 d() {
        return this.f23312c;
    }

    @Override
    C.c1 e() {
        return this.f23315f;
    }

    public boolean equals(Object obj) {
        Size size;
        C.c1 c1Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2779M.k)) {
            return false;
        }
        C2779M.k kVar = (C2779M.k) obj;
        if (this.f23310a.equals(kVar.h()) && this.f23311b.equals(kVar.i()) && this.f23312c.equals(kVar.d()) && this.f23313d.equals(kVar.g()) && ((size = this.f23314e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((c1Var = this.f23315f) != null ? c1Var.equals(kVar.e()) : kVar.e() == null)) {
            List<p1.b> list = this.f23316g;
            if (list == null) {
                if (kVar.c() == null) {
                    return true;
                }
            } else if (list.equals(kVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override
    Size f() {
        return this.f23314e;
    }

    @Override
    C.o1<?> g() {
        return this.f23313d;
    }

    @Override
    String h() {
        return this.f23310a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f23310a.hashCode() ^ 1000003) * 1000003) ^ this.f23311b.hashCode()) * 1000003) ^ this.f23312c.hashCode()) * 1000003) ^ this.f23313d.hashCode()) * 1000003;
        Size size = this.f23314e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        C.c1 c1Var = this.f23315f;
        int iHashCode3 = (iHashCode2 ^ (c1Var == null ? 0 : c1Var.hashCode())) * 1000003;
        List<p1.b> list = this.f23316g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override
    Class<?> i() {
        return this.f23311b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f23310a + ", useCaseType=" + this.f23311b + ", sessionConfig=" + this.f23312c + ", useCaseConfig=" + this.f23313d + ", surfaceResolution=" + this.f23314e + JmBUOGMwkkxg.tSbbIF + this.f23315f + ", captureTypes=" + this.f23316g + "}";
    }
}
