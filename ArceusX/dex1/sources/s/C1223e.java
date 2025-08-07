package S;

import S.C1232n;
import ka.oik.UJEa;

final class C1223e extends C1232n.a {

    private final C1230l f6280a;

    private final int f6281b;

    C1223e(C1230l c1230l, int i7) {
        if (c1230l == null) {
            throw new NullPointerException("Null quality");
        }
        this.f6280a = c1230l;
        this.f6281b = i7;
    }

    @Override
    int a() {
        return this.f6281b;
    }

    @Override
    C1230l b() {
        return this.f6280a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1232n.a)) {
            return false;
        }
        C1232n.a aVar = (C1232n.a) obj;
        return this.f6280a.equals(aVar.b()) && this.f6281b == aVar.a();
    }

    public int hashCode() {
        return ((this.f6280a.hashCode() ^ 1000003) * 1000003) ^ this.f6281b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f6280a + ", aspectRatio=" + this.f6281b + UJEa.GELEChZY;
    }
}
