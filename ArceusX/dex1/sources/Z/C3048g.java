package z;

import android.view.Surface;
import z.F0;

final class C3048g extends F0.g {

    private final int f24639a;

    private final Surface f24640b;

    C3048g(int i7, Surface surface) {
        this.f24639a = i7;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f24640b = surface;
    }

    @Override
    public int a() {
        return this.f24639a;
    }

    @Override
    public Surface b() {
        return this.f24640b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0.g)) {
            return false;
        }
        F0.g gVar = (F0.g) obj;
        return this.f24639a == gVar.a() && this.f24640b.equals(gVar.b());
    }

    public int hashCode() {
        return ((this.f24639a ^ 1000003) * 1000003) ^ this.f24640b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f24639a + ", surface=" + this.f24640b + "}";
    }
}
