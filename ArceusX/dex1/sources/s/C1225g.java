package S;

import S.H;
import androidx.appcompat.app.FN.krlBPZZeK;
import z.F0;

final class C1225g extends H {

    private final int f6293d;

    private final H.a f6294e;

    private final F0.h f6295f;

    C1225g(int i7, H.a aVar, F0.h hVar) {
        this.f6293d = i7;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f6294e = aVar;
        this.f6295f = hVar;
    }

    @Override
    public int a() {
        return this.f6293d;
    }

    @Override
    public F0.h b() {
        return this.f6295f;
    }

    @Override
    public H.a c() {
        return this.f6294e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h7 = (H) obj;
        if (this.f6293d == h7.a() && this.f6294e.equals(h7.c())) {
            F0.h hVar = this.f6295f;
            if (hVar == null) {
                if (h7.b() == null) {
                    return true;
                }
            } else if (hVar.equals(h7.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f6293d ^ 1000003) * 1000003) ^ this.f6294e.hashCode()) * 1000003;
        F0.h hVar = this.f6295f;
        return iHashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return krlBPZZeK.RVWue + this.f6293d + ", streamState=" + this.f6294e + ", inProgressTransformationInfo=" + this.f6295f + "}";
    }
}
