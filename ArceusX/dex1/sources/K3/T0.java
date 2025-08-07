package K3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public abstract class T0 implements Comparable {
    private final T0 e(Class cls) throws S0 {
        if (cls.isInstance(this)) {
            return (T0) cls.cast(this);
        }
        throw new S0("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    static int f(byte b2) {
        return (b2 >> 5) & 7;
    }

    public static O0 i(long j7) {
        return new O0(j7);
    }

    public static R0 k(String str) {
        return new R0(str);
    }

    public static T0 l(byte... bArr) throws N0 {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return U0.a(byteArrayInputStream, new W0(byteArrayInputStream));
    }

    public static T0 m(InputStream inputStream) throws N0 {
        return U0.a(inputStream, new W0(inputStream));
    }

    protected int c() {
        return 0;
    }

    public final M0 g() throws S0 {
        return (M0) e(M0.class);
    }

    public final O0 h() throws S0 {
        return (O0) e(O0.class);
    }

    public final Q0 j() throws S0 {
        return (Q0) e(Q0.class);
    }

    protected abstract int zza();
}
