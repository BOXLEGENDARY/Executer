package M;

import M.W;
import java.util.List;

final class C0507c extends W.b {

    private final N f2269a;

    private final List<O.f> f2270b;

    C0507c(N n7, List<O.f> list) {
        if (n7 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f2269a = n7;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f2270b = list;
    }

    @Override
    public List<O.f> a() {
        return this.f2270b;
    }

    @Override
    public N b() {
        return this.f2269a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W.b)) {
            return false;
        }
        W.b bVar = (W.b) obj;
        return this.f2269a.equals(bVar.b()) && this.f2270b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f2269a.hashCode() ^ 1000003) * 1000003) ^ this.f2270b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f2269a + ", outConfigs=" + this.f2270b + "}";
    }
}
