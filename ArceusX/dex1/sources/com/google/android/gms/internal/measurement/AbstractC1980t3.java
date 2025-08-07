package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class AbstractC1980t3 implements Iterable<Byte>, Serializable {

    public static final AbstractC1980t3 f15325e = new C1964r3(C1838b4.f15102d);

    private static final Comparator<AbstractC1980t3> f15326i;

    private static final C1972s3 f15327v;

    private int f15328d = 0;

    static {
        int i7 = C1869f3.f15154a;
        f15327v = new C1972s3(null);
        f15326i = new C1925m3();
    }

    AbstractC1980t3() {
    }

    static int o(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i7);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < i7) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i8);
        sb3.append(" >= ");
        sb3.append(i9);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static AbstractC1980t3 q(byte[] bArr, int i7, int i8) {
        o(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new C1964r3(bArr2);
    }

    public static AbstractC1980t3 r(String str) {
        return new C1964r3(str.getBytes(C1838b4.f15100b));
    }

    public abstract byte d(int i7);

    abstract byte e(int i7);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public final int hashCode() {
        int iJ = this.f15328d;
        if (iJ == 0) {
            int iG = g();
            iJ = j(iG, 0, iG);
            if (iJ == 0) {
                iJ = 1;
            }
            this.f15328d = iJ;
        }
        return iJ;
    }

    @Override
    public final Iterator<Byte> iterator() {
        return new C1909k3(this);
    }

    protected abstract int j(int i7, int i8, int i9);

    public abstract AbstractC1980t3 k(int i7, int i8);

    protected abstract String l(Charset charset);

    abstract void m(C1901j3 c1901j3) throws IOException;

    public abstract boolean n();

    protected final int p() {
        return this.f15328d;
    }

    public final String s(Charset charset) {
        return g() == 0 ? BuildConfig.FLAVOR : l(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? V4.a(this) : V4.a(k(0, 47)).concat("..."));
    }
}
