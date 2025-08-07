package K3;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class B0 implements Iterable, Serializable {

    public static final B0 f1765e = new C0501y0(G0.f1782d);

    private static final Comparator f1766i;

    private static final A0 f1767v;

    private int f1768d = 0;

    static {
        int i7 = C0487r0.f1892a;
        f1767v = new A0(null);
        f1766i = new C0491t0();
    }

    B0() {
    }

    static int o(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static B0 q(byte[] bArr, int i7, int i8) {
        o(0, i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return new C0501y0(bArr2);
    }

    public abstract byte d(int i7);

    abstract byte e(int i7);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public final int hashCode() {
        int iK = this.f1768d;
        if (iK == 0) {
            int iG = g();
            iK = k(iG, 0, iG);
            if (iK == 0) {
                iK = 1;
            }
            this.f1768d = iK;
        }
        return iK;
    }

    @Override
    public final Iterator iterator() {
        return new C0489s0(this);
    }

    protected abstract void j(byte[] bArr, int i7, int i8, int i9);

    protected abstract int k(int i7, int i8, int i9);

    public abstract B0 l(int i7, int i8);

    public abstract InputStream m();

    public abstract ByteBuffer n();

    protected final int p() {
        return this.f1768d;
    }

    public final byte[] r() {
        int iG = g();
        if (iG == 0) {
            return G0.f1782d;
        }
        byte[] bArr = new byte[iG];
        j(bArr, 0, 0, iG);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? I0.a(this) : I0.a(l(0, 47)).concat("..."));
    }
}
