package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

public final class T3 {

    private static final T3 f15941f = new T3(0, new int[0], new Object[0], false);

    private int f15942a;

    private int[] f15943b;

    private Object[] f15944c;

    private int f15945d;

    private boolean f15946e;

    private T3(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f15945d = -1;
        this.f15942a = i7;
        this.f15943b = iArr;
        this.f15944c = objArr;
        this.f15946e = z7;
    }

    public static T3 c() {
        return f15941f;
    }

    static T3 e(T3 t32, T3 t33) {
        int i7 = t32.f15942a + t33.f15942a;
        int[] iArrCopyOf = Arrays.copyOf(t32.f15943b, i7);
        System.arraycopy(t33.f15943b, 0, iArrCopyOf, t32.f15942a, t33.f15942a);
        Object[] objArrCopyOf = Arrays.copyOf(t32.f15944c, i7);
        System.arraycopy(t33.f15944c, 0, objArrCopyOf, t32.f15942a, t33.f15942a);
        return new T3(i7, iArrCopyOf, objArrCopyOf, true);
    }

    static T3 f() {
        return new T3(0, new int[8], new Object[8], true);
    }

    private final void m(int i7) {
        int[] iArr = this.f15943b;
        if (i7 > iArr.length) {
            int i8 = this.f15942a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f15943b = Arrays.copyOf(iArr, i7);
            this.f15944c = Arrays.copyOf(this.f15944c, i7);
        }
    }

    public final int a() {
        int iB;
        int iA;
        int iB2;
        int i7 = this.f15945d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f15942a; i9++) {
            int i10 = this.f15943b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f15944c[i9]).longValue();
                    iB2 = AbstractC2172x2.B(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    AbstractC2131q2 abstractC2131q2 = (AbstractC2131q2) this.f15944c[i9];
                    int iB3 = AbstractC2172x2.B(i13);
                    int iG = abstractC2131q2.g();
                    iB2 = iB3 + AbstractC2172x2.B(iG) + iG;
                } else if (i12 == 3) {
                    int iB4 = AbstractC2172x2.B(i11 << 3);
                    iB = iB4 + iB4;
                    iA = ((T3) this.f15944c[i9]).a();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(new X2("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f15944c[i9]).intValue();
                    iB2 = AbstractC2172x2.B(i11 << 3) + 4;
                }
                i8 += iB2;
            } else {
                int i14 = i11 << 3;
                long jLongValue = ((Long) this.f15944c[i9]).longValue();
                iB = AbstractC2172x2.B(i14);
                iA = AbstractC2172x2.a(jLongValue);
            }
            iB2 = iB + iA;
            i8 += iB2;
        }
        this.f15945d = i8;
        return i8;
    }

    public final int b() {
        int i7 = this.f15945d;
        if (i7 != -1) {
            return i7;
        }
        int iB = 0;
        for (int i8 = 0; i8 < this.f15942a; i8++) {
            int i9 = this.f15943b[i8] >>> 3;
            AbstractC2131q2 abstractC2131q2 = (AbstractC2131q2) this.f15944c[i8];
            int iB2 = AbstractC2172x2.B(8);
            int iB3 = AbstractC2172x2.B(16) + AbstractC2172x2.B(i9);
            int iB4 = AbstractC2172x2.B(24);
            int iG = abstractC2131q2.g();
            iB += iB2 + iB2 + iB3 + iB4 + AbstractC2172x2.B(iG) + iG;
        }
        this.f15945d = iB;
        return iB;
    }

    final T3 d(T3 t32) {
        if (t32.equals(f15941f)) {
            return this;
        }
        g();
        int i7 = this.f15942a + t32.f15942a;
        m(i7);
        System.arraycopy(t32.f15943b, 0, this.f15943b, this.f15942a, t32.f15942a);
        System.arraycopy(t32.f15944c, 0, this.f15944c, this.f15942a, t32.f15942a);
        this.f15942a = i7;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof T3)) {
            return false;
        }
        T3 t32 = (T3) obj;
        int i7 = this.f15942a;
        if (i7 == t32.f15942a) {
            int[] iArr = this.f15943b;
            int[] iArr2 = t32.f15943b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f15944c;
                    Object[] objArr2 = t32.f15944c;
                    int i9 = this.f15942a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f15946e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f15946e) {
            this.f15946e = false;
        }
    }

    public final int hashCode() {
        int i7 = this.f15942a;
        int i8 = i7 + 527;
        int[] iArr = this.f15943b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = ((i8 * 31) + i9) * 31;
        Object[] objArr = this.f15944c;
        int i12 = this.f15942a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    final void i(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f15942a; i8++) {
            C2167w3.b(sb, i7, String.valueOf(this.f15943b[i8] >>> 3), this.f15944c[i8]);
        }
    }

    final void j(int i7, Object obj) {
        g();
        m(this.f15942a + 1);
        int[] iArr = this.f15943b;
        int i8 = this.f15942a;
        iArr[i8] = i7;
        this.f15944c[i8] = obj;
        this.f15942a = i8 + 1;
    }

    final void k(InterfaceC2067f4 interfaceC2067f4) throws IOException {
        for (int i7 = 0; i7 < this.f15942a; i7++) {
            interfaceC2067f4.z(this.f15943b[i7] >>> 3, this.f15944c[i7]);
        }
    }

    public final void l(InterfaceC2067f4 interfaceC2067f4) throws IOException {
        if (this.f15942a != 0) {
            for (int i7 = 0; i7 < this.f15942a; i7++) {
                int i8 = this.f15943b[i7];
                Object obj = this.f15944c[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    interfaceC2067f4.i(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    interfaceC2067f4.b(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    interfaceC2067f4.I(i10, (AbstractC2131q2) obj);
                } else if (i9 == 3) {
                    interfaceC2067f4.K(i10);
                    ((T3) obj).l(interfaceC2067f4);
                    interfaceC2067f4.J(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new X2("Protocol message tag had invalid wire type."));
                    }
                    interfaceC2067f4.g(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private T3() {
        this(0, new int[8], new Object[8], true);
    }
}
