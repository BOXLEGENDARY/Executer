package N;

import M.N;
import N.r;
import java.util.List;

final class b extends r.b {

    private final N f2496a;

    private final N f2497b;

    private final List<d> f2498c;

    b(N n7, N n8, List<d> list) {
        if (n7 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f2496a = n7;
        if (n8 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f2497b = n8;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f2498c = list;
    }

    @Override
    public List<d> a() {
        return this.f2498c;
    }

    @Override
    public N b() {
        return this.f2496a;
    }

    @Override
    public N c() {
        return this.f2497b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.b)) {
            return false;
        }
        r.b bVar = (r.b) obj;
        return this.f2496a.equals(bVar.b()) && this.f2497b.equals(bVar.c()) && this.f2498c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f2496a.hashCode() ^ 1000003) * 1000003) ^ this.f2497b.hashCode()) * 1000003) ^ this.f2498c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f2496a + ", secondarySurfaceEdge=" + this.f2497b + ", outConfigs=" + this.f2498c + "}";
    }
}
