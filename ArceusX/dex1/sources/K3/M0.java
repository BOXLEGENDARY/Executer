package K3;

import java.util.Arrays;

public final class M0 extends T0 {

    private final B0 f1799d;

    M0(B0 b02) {
        this.f1799d = b02;
    }

    @Override
    public final int compareTo(Object obj) {
        T0 t02 = (T0) obj;
        if (T0.f((byte) 64) != t02.zza()) {
            return T0.f((byte) 64) - t02.zza();
        }
        M0 m02 = (M0) t02;
        B0 b02 = this.f1799d;
        int iG = b02.g();
        B0 b03 = m02.f1799d;
        if (iG != b03.g()) {
            return b02.g() - b03.g();
        }
        return C0486q0.a().compare(b02.r(), m02.f1799d.r());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M0.class == obj.getClass()) {
            return this.f1799d.equals(((M0) obj).f1799d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(T0.f((byte) 64)), this.f1799d});
    }

    public final B0 n() {
        return this.f1799d;
    }

    public final String toString() {
        AbstractC0472j0 abstractC0472j0C = AbstractC0472j0.d().c();
        byte[] bArrR = this.f1799d.r();
        return "h'" + abstractC0472j0C.e(bArrR, 0, bArrR.length) + "'";
    }

    @Override
    protected final int zza() {
        return T0.f((byte) 64);
    }
}
