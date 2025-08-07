package K3;

import java.util.Arrays;

public final class L0 extends T0 {

    private final boolean f1796d;

    L0(boolean z7) {
        this.f1796d = z7;
    }

    @Override
    public final int compareTo(Object obj) {
        T0 t02 = (T0) obj;
        if (T0.f((byte) -32) != t02.zza()) {
            return T0.f((byte) -32) - t02.zza();
        }
        return (true != this.f1796d ? 20 : 21) - (true != ((L0) t02).f1796d ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && L0.class == obj.getClass() && this.f1796d == ((L0) obj).f1796d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(T0.f((byte) -32)), Boolean.valueOf(this.f1796d)});
    }

    public final String toString() {
        return Boolean.toString(this.f1796d);
    }

    @Override
    protected final int zza() {
        return T0.f((byte) -32);
    }
}
