package K3;

import java.util.Arrays;

public final class O0 extends T0 {

    private final long f1800d;

    O0(long j7) {
        this.f1800d = j7;
    }

    @Override
    public final int compareTo(Object obj) {
        T0 t02 = (T0) obj;
        if (zza() != t02.zza()) {
            return zza() - t02.zza();
        }
        long jAbs = Math.abs(this.f1800d);
        long jAbs2 = Math.abs(((O0) t02).f1800d);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && O0.class == obj.getClass() && this.f1800d == ((O0) obj).f1800d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f1800d)});
    }

    public final long n() {
        return this.f1800d;
    }

    public final String toString() {
        return Long.toString(this.f1800d);
    }

    @Override
    protected final int zza() {
        return T0.f(this.f1800d >= 0 ? (byte) 0 : (byte) 32);
    }
}
