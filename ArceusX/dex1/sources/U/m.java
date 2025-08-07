package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

class m extends l {

    private static final class a {

        final OutputConfiguration f23856a;

        String f23857b;

        long f23858c = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f23856a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f23856a, aVar.f23856a) && this.f23858c == aVar.f23858c && Objects.equals(this.f23857b, aVar.f23857b);
        }

        public int hashCode() {
            int iHashCode = this.f23856a.hashCode() ^ 31;
            int i7 = (iHashCode << 5) - iHashCode;
            String str = this.f23857b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i7;
            return Long.hashCode(this.f23858c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    m(int i7, Surface surface) {
        this(new a(new OutputConfiguration(i7, surface)));
    }

    static m k(OutputConfiguration outputConfiguration) {
        return new m(new a(outputConfiguration));
    }

    @Override
    public void c(Surface surface) {
        ((OutputConfiguration) i()).addSurface(surface);
    }

    @Override
    public void d(long j7) {
        ((a) this.f23861a).f23858c = j7;
    }

    @Override
    public String e() {
        return ((a) this.f23861a).f23857b;
    }

    @Override
    public void f() {
        ((OutputConfiguration) i()).enableSurfaceSharing();
    }

    @Override
    public void g(String str) {
        ((a) this.f23861a).f23857b = str;
    }

    @Override
    public Object i() {
        x0.g.a(this.f23861a instanceof a);
        return ((a) this.f23861a).f23856a;
    }

    @Override
    final boolean j() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    m(Object obj) {
        super(obj);
    }
}
