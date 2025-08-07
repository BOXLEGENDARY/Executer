package K3;

import java.util.Arrays;

public final class R0 extends T0 {

    private final String f1806d;

    R0(String str) {
        this.f1806d = str;
    }

    @Override
    public final int compareTo(Object obj) {
        int length;
        int length2;
        T0 t02 = (T0) obj;
        if (T0.f((byte) 96) != t02.zza()) {
            length2 = t02.zza();
            length = T0.f((byte) 96);
        } else {
            String str = this.f1806d;
            int length3 = str.length();
            String str2 = ((R0) t02).f1806d;
            if (length3 == str2.length()) {
                return str.compareTo(str2);
            }
            length = str.length();
            length2 = str2.length();
        }
        return length - length2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R0.class == obj.getClass()) {
            return this.f1806d.equals(((R0) obj).f1806d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(T0.f((byte) 96)), this.f1806d});
    }

    public final String toString() {
        return "\"" + this.f1806d + "\"";
    }

    @Override
    protected final int zza() {
        return T0.f((byte) 96);
    }
}
