package z2;

import S9.Gvmm.CAqKeu;
import java.util.Map;
import z2.f;

final class b extends f {

    private final C2.a f24784a;

    private final Map<q2.d, f.b> f24785b;

    b(C2.a aVar, Map<q2.d, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f24784a = aVar;
        if (map == null) {
            throw new NullPointerException(CAqKeu.FksNsZfjgQlunxO);
        }
        this.f24785b = map;
    }

    @Override
    C2.a e() {
        return this.f24784a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f24784a.equals(fVar.e()) && this.f24785b.equals(fVar.h());
    }

    @Override
    Map<q2.d, f.b> h() {
        return this.f24785b;
    }

    public int hashCode() {
        return ((this.f24784a.hashCode() ^ 1000003) * 1000003) ^ this.f24785b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f24784a + ", values=" + this.f24785b + "}";
    }
}
