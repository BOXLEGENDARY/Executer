package u;

import Za.qhkq.dHkZSUxHu;
import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import u.k;

class p implements k.a {

    final Object f23861a;

    private static final class a {

        final List<Surface> f23862a;

        final Size f23863b;

        final int f23864c;

        final int f23865d;

        String f23866e;

        boolean f23867f;

        long f23868g;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f23863b.equals(aVar.f23863b) || this.f23864c != aVar.f23864c || this.f23865d != aVar.f23865d || this.f23867f != aVar.f23867f || this.f23868g != aVar.f23868g || !Objects.equals(this.f23866e, aVar.f23866e)) {
                return false;
            }
            int iMin = Math.min(this.f23862a.size(), aVar.f23862a.size());
            for (int i7 = 0; i7 < iMin; i7++) {
                if (this.f23862a.get(i7) != aVar.f23862a.get(i7)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = this.f23862a.hashCode() ^ 31;
            int i7 = this.f23865d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f23863b.hashCode() ^ ((i7 << 5) - i7);
            int i8 = this.f23864c ^ ((iHashCode2 << 5) - iHashCode2);
            int i9 = (this.f23867f ? 1 : 0) ^ ((i8 << 5) - i8);
            int i10 = (i9 << 5) - i9;
            String str = this.f23866e;
            int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f23868g) ^ ((iHashCode3 << 5) - iHashCode3);
        }
    }

    p(Object obj) {
        this.f23861a = obj;
    }

    @Override
    public Surface a() {
        List<Surface> list = ((a) this.f23861a).f23862a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void b(long j7) {
    }

    @Override
    public void c(Surface surface) {
        x0.g.h(surface, "Surface must not be null");
        if (a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!j()) {
            throw new IllegalStateException(dHkZSUxHu.aEKkaQN);
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override
    public void d(long j7) {
        ((a) this.f23861a).f23868g = j7;
    }

    @Override
    public String e() {
        return ((a) this.f23861a).f23866e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.f23861a, ((p) obj).f23861a);
        }
        return false;
    }

    @Override
    public void f() {
        ((a) this.f23861a).f23867f = true;
    }

    @Override
    public void g(String str) {
        ((a) this.f23861a).f23866e = str;
    }

    @Override
    public void h(int i7) {
    }

    public int hashCode() {
        return this.f23861a.hashCode();
    }

    @Override
    public Object i() {
        return null;
    }

    boolean j() {
        return ((a) this.f23861a).f23867f;
    }
}
