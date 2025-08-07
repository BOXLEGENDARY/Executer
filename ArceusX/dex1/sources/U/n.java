package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

class n extends m {

    private static final class a {

        final OutputConfiguration f23859a;

        long f23860b = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f23859a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f23859a, aVar.f23859a) && this.f23860b == aVar.f23860b;
        }

        public int hashCode() {
            int iHashCode = this.f23859a.hashCode() ^ 31;
            return Long.hashCode(this.f23860b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    n(int i7, Surface surface) {
        this(new a(new OutputConfiguration(i7, surface)));
    }

    static n l(OutputConfiguration outputConfiguration) {
        return new n(new a(outputConfiguration));
    }

    @Override
    public void d(long j7) {
        ((a) this.f23861a).f23860b = j7;
    }

    @Override
    public String e() {
        return null;
    }

    @Override
    public void g(String str) {
        ((OutputConfiguration) i()).setPhysicalCameraId(str);
    }

    @Override
    public Object i() {
        x0.g.a(this.f23861a instanceof a);
        return ((a) this.f23861a).f23859a;
    }

    n(Object obj) {
        super(obj);
    }
}
