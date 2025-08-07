package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class B4<T> implements J4<T> {

    private static final int[] f14658p = new int[0];

    private static final Unsafe f14659q = C1895i5.l();

    private final int[] f14660a;

    private final Object[] f14661b;

    private final int f14662c;

    private final int f14663d;

    private final InterfaceC2021y4 f14664e;

    private final boolean f14665f;

    private final boolean f14666g;

    private final int[] f14667h;

    private final int f14668i;

    private final int f14669j;

    private final AbstractC1918l4 f14670k;

    private final Y4<?, ?> f14671l;

    private final H3<?> f14672m;

    private final D4 f14673n;

    private final C1973s4 f14674o;

    private B4(int[] iArr, int[] iArr2, Object[] objArr, int i7, int i8, InterfaceC2021y4 interfaceC2021y4, boolean z7, boolean z8, int[] iArr3, int i9, int i10, D4 d42, AbstractC1918l4 abstractC1918l4, Y4<?, ?> y42, H3<?> h32, C1973s4 c1973s4) {
        this.f14660a = iArr;
        this.f14661b = iArr2;
        this.f14662c = objArr;
        this.f14663d = i7;
        this.f14666g = interfaceC2021y4;
        boolean z9 = false;
        if (y42 != 0 && y42.c((InterfaceC2021y4) i8)) {
            z9 = true;
        }
        this.f14665f = z9;
        this.f14667h = z8;
        this.f14668i = iArr3;
        this.f14669j = i9;
        this.f14673n = i10;
        this.f14670k = d42;
        this.f14671l = abstractC1918l4;
        this.f14672m = y42;
        this.f14664e = i8;
        this.f14674o = h32;
    }

    private final void A(T t7, C3 c3) throws IOException {
        int i7;
        boolean z7;
        if (this.f14665f) {
            this.f14672m.a(t7);
            throw null;
        }
        int length = this.f14660a.length;
        Unsafe unsafe = f14659q;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int iK = k(i10);
            int i12 = this.f14660a[i10];
            int iJ = j(iK);
            if (iJ <= 17) {
                int i13 = this.f14660a[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = unsafe.getInt(t7, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            long j7 = iK & i8;
            switch (iJ) {
                case 0:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.q(i12, C1895i5.f(t7, j7));
                        break;
                    }
                case 1:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.z(i12, C1895i5.g(t7, j7));
                        break;
                    }
                case 2:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.E(i12, unsafe.getLong(t7, j7));
                        break;
                    }
                case 3:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.j(i12, unsafe.getLong(t7, j7));
                        break;
                    }
                case 4:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.C(i12, unsafe.getInt(t7, j7));
                        break;
                    }
                case 5:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.x(i12, unsafe.getLong(t7, j7));
                        break;
                    }
                case 6:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.v(i12, unsafe.getInt(t7, j7));
                        break;
                    }
                case 7:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.m(i12, C1895i5.B(t7, j7));
                        break;
                    }
                case 8:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        C(i12, unsafe.getObject(t7, j7), c3);
                        break;
                    }
                case 9:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.G(i12, unsafe.getObject(t7, j7), n(i10));
                        break;
                    }
                case 10:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.o(i12, (AbstractC1980t3) unsafe.getObject(t7, j7));
                        break;
                    }
                case 11:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.h(i12, unsafe.getInt(t7, j7));
                        break;
                    }
                case 12:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.t(i12, unsafe.getInt(t7, j7));
                        break;
                    }
                case 13:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.H(i12, unsafe.getInt(t7, j7));
                        break;
                    }
                case 14:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.J(i12, unsafe.getLong(t7, j7));
                        break;
                    }
                case 15:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.a(i12, unsafe.getInt(t7, j7));
                        break;
                    }
                case 16:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.c(i12, unsafe.getLong(t7, j7));
                        break;
                    }
                case 17:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        c3.B(i12, unsafe.getObject(t7, j7), n(i10));
                        break;
                    }
                case 18:
                    L4.l(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 19:
                    L4.p(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 20:
                    L4.s(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 21:
                    L4.B(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 22:
                    L4.r(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 23:
                    L4.o(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 24:
                    L4.n(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 25:
                    L4.j(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 26:
                    L4.y(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3);
                    break;
                case 27:
                    L4.t(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, n(i10));
                    break;
                case 28:
                    L4.k(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3);
                    break;
                case 29:
                    z7 = false;
                    L4.z(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 30:
                    z7 = false;
                    L4.m(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 31:
                    z7 = false;
                    L4.u(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 32:
                    z7 = false;
                    L4.v(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 33:
                    z7 = false;
                    L4.w(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 34:
                    z7 = false;
                    L4.x(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, false);
                    break;
                case 35:
                    L4.l(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 36:
                    L4.p(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 37:
                    L4.s(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 38:
                    L4.B(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 39:
                    L4.r(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 40:
                    L4.o(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 41:
                    L4.n(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 42:
                    L4.j(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 43:
                    L4.z(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 44:
                    L4.m(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 45:
                    L4.u(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 46:
                    L4.v(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 47:
                    L4.w(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 48:
                    L4.x(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, true);
                    break;
                case 49:
                    L4.q(this.f14660a[i10], (List) unsafe.getObject(t7, j7), c3, n(i10));
                    break;
                case 50:
                    B(c3, i12, unsafe.getObject(t7, j7), i10);
                    break;
                case 51:
                    if (y(t7, i12, i10)) {
                        c3.q(i12, H(t7, j7));
                    }
                    break;
                case 52:
                    if (y(t7, i12, i10)) {
                        c3.z(i12, I(t7, j7));
                    }
                    break;
                case 53:
                    if (y(t7, i12, i10)) {
                        c3.E(i12, l(t7, j7));
                    }
                    break;
                case 54:
                    if (y(t7, i12, i10)) {
                        c3.j(i12, l(t7, j7));
                    }
                    break;
                case 55:
                    if (y(t7, i12, i10)) {
                        c3.C(i12, L(t7, j7));
                    }
                    break;
                case 56:
                    if (y(t7, i12, i10)) {
                        c3.x(i12, l(t7, j7));
                    }
                    break;
                case 57:
                    if (y(t7, i12, i10)) {
                        c3.v(i12, L(t7, j7));
                    }
                    break;
                case 58:
                    if (y(t7, i12, i10)) {
                        c3.m(i12, z(t7, j7));
                    }
                    break;
                case 59:
                    if (y(t7, i12, i10)) {
                        C(i12, unsafe.getObject(t7, j7), c3);
                    }
                    break;
                case 60:
                    if (y(t7, i12, i10)) {
                        c3.G(i12, unsafe.getObject(t7, j7), n(i10));
                    }
                    break;
                case 61:
                    if (y(t7, i12, i10)) {
                        c3.o(i12, (AbstractC1980t3) unsafe.getObject(t7, j7));
                    }
                    break;
                case 62:
                    if (y(t7, i12, i10)) {
                        c3.h(i12, L(t7, j7));
                    }
                    break;
                case 63:
                    if (y(t7, i12, i10)) {
                        c3.t(i12, L(t7, j7));
                    }
                    break;
                case 64:
                    if (y(t7, i12, i10)) {
                        c3.H(i12, L(t7, j7));
                    }
                    break;
                case 65:
                    if (y(t7, i12, i10)) {
                        c3.J(i12, l(t7, j7));
                    }
                    break;
                case 66:
                    if (y(t7, i12, i10)) {
                        c3.a(i12, L(t7, j7));
                    }
                    break;
                case 67:
                    if (y(t7, i12, i10)) {
                        c3.c(i12, l(t7, j7));
                    }
                    break;
                case 68:
                    if (y(t7, i12, i10)) {
                        c3.B(i12, unsafe.getObject(t7, j7), n(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        Y4<?, ?> y42 = this.f14671l;
        y42.i(y42.c(t7), c3);
    }

    private final <K, V> void B(C3 c3, int i7, Object obj, int i8) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void C(int i7, Object obj, C3 c3) throws IOException {
        if (obj instanceof String) {
            c3.f(i7, (String) obj);
        } else {
            c3.o(i7, (AbstractC1980t3) obj);
        }
    }

    static Z4 E(Object obj) {
        T3 t32 = (T3) obj;
        Z4 z42 = t32.zzc;
        if (z42 != Z4.c()) {
            return z42;
        }
        Z4 z4E = Z4.e();
        t32.zzc = z4E;
        return z4E;
    }

    static <T> B4<T> F(Class<T> cls, InterfaceC1989u4 interfaceC1989u4, D4 d42, AbstractC1918l4 abstractC1918l4, Y4<?, ?> y42, H3<?> h32, C1973s4 c1973s4) {
        if (interfaceC1989u4 instanceof I4) {
            return G((I4) interfaceC1989u4, d42, abstractC1918l4, y42, h32, c1973s4);
        }
        throw null;
    }

    static <T> com.google.android.gms.internal.measurement.B4<T> G(com.google.android.gms.internal.measurement.I4 r34, com.google.android.gms.internal.measurement.D4 r35, com.google.android.gms.internal.measurement.AbstractC1918l4 r36, com.google.android.gms.internal.measurement.Y4<?, ?> r37, com.google.android.gms.internal.measurement.H3<?> r38, com.google.android.gms.internal.measurement.C1973s4 r39) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B4.G(com.google.android.gms.internal.measurement.I4, com.google.android.gms.internal.measurement.D4, com.google.android.gms.internal.measurement.l4, com.google.android.gms.internal.measurement.Y4, com.google.android.gms.internal.measurement.H3, com.google.android.gms.internal.measurement.s4):com.google.android.gms.internal.measurement.B4");
    }

    private static <T> double H(T t7, long j7) {
        return ((Double) C1895i5.k(t7, j7)).doubleValue();
    }

    private static <T> float I(T t7, long j7) {
        return ((Float) C1895i5.k(t7, j7)).floatValue();
    }

    private final int J(T t7) {
        int i7;
        int iA;
        int iA2;
        int iA3;
        int iB;
        int iA4;
        int iZ;
        int iA5;
        int iA6;
        int iG;
        int iA7;
        int iQ;
        int iD;
        int iA8;
        int i8;
        Unsafe unsafe = f14659q;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        for (int i12 = 0; i12 < this.f14660a.length; i12 += 3) {
            int iK = k(i12);
            int i13 = this.f14660a[i12];
            int iJ = j(iK);
            if (iJ <= 17) {
                int i14 = this.f14660a[i12 + 2];
                int i15 = i14 & 1048575;
                i7 = 1 << (i14 >>> 20);
                if (i15 != i11) {
                    i10 = unsafe.getInt(t7, i15);
                    i11 = i15;
                }
            } else {
                i7 = 0;
            }
            long j7 = iK & 1048575;
            switch (iJ) {
                case 0:
                    if ((i10 & i7) != 0) {
                        iA = B3.a(i13 << 3);
                        iQ = iA + 8;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i7) != 0) {
                        iA2 = B3.a(i13 << 3);
                        iQ = iA2 + 4;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i10 & i7) != 0) {
                        long j8 = unsafe.getLong(t7, j7);
                        iA3 = B3.a(i13 << 3);
                        iB = B3.b(j8);
                        iQ = iA3 + iB;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i10 & i7) != 0) {
                        long j9 = unsafe.getLong(t7, j7);
                        iA3 = B3.a(i13 << 3);
                        iB = B3.b(j9);
                        iQ = iA3 + iB;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i10 & i7) != 0) {
                        int i16 = unsafe.getInt(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.z(i16);
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i10 & i7) != 0) {
                        iA = B3.a(i13 << 3);
                        iQ = iA + 8;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i10 & i7) != 0) {
                        iA2 = B3.a(i13 << 3);
                        iQ = iA2 + 4;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i10 & i7) != 0) {
                        iA5 = B3.a(i13 << 3);
                        iQ = iA5 + 1;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i10 & i7) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t7, j7);
                        if (object instanceof AbstractC1980t3) {
                            iA6 = B3.a(i13 << 3);
                            iG = ((AbstractC1980t3) object).g();
                            iA7 = B3.a(iG);
                            i8 = iA6 + iA7 + iG;
                            i9 += i8;
                            break;
                        } else {
                            iA4 = B3.a(i13 << 3);
                            iZ = B3.C((String) object);
                            i8 = iA4 + iZ;
                            i9 += i8;
                        }
                    }
                case 9:
                    if ((i10 & i7) != 0) {
                        iQ = L4.Q(i13, unsafe.getObject(t7, j7), n(i12));
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i10 & i7) != 0) {
                        AbstractC1980t3 abstractC1980t3 = (AbstractC1980t3) unsafe.getObject(t7, j7);
                        iA6 = B3.a(i13 << 3);
                        iG = abstractC1980t3.g();
                        iA7 = B3.a(iG);
                        i8 = iA6 + iA7 + iG;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i10 & i7) != 0) {
                        int i17 = unsafe.getInt(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.a(i17);
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i10 & i7) != 0) {
                        int i18 = unsafe.getInt(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.z(i18);
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i7) != 0) {
                        iA2 = B3.a(i13 << 3);
                        iQ = iA2 + 4;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i7) != 0) {
                        iA = B3.a(i13 << 3);
                        iQ = iA + 8;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i10 & i7) != 0) {
                        int i19 = unsafe.getInt(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.a((i19 >> 31) ^ (i19 + i19));
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i7) != 0) {
                        long j10 = unsafe.getLong(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.b((j10 >> 63) ^ (j10 + j10));
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i10 & i7) != 0) {
                        iQ = B3.y(i13, (InterfaceC2021y4) unsafe.getObject(t7, j7), n(i12));
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iQ = L4.J(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 19:
                    iQ = L4.H(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 20:
                    iQ = L4.O(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 21:
                    iQ = L4.Z(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 22:
                    iQ = L4.M(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 23:
                    iQ = L4.J(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 24:
                    iQ = L4.H(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 25:
                    iQ = L4.A(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 26:
                    iQ = L4.W(i13, (List) unsafe.getObject(t7, j7));
                    i9 += iQ;
                    break;
                case 27:
                    iQ = L4.R(i13, (List) unsafe.getObject(t7, j7), n(i12));
                    i9 += iQ;
                    break;
                case 28:
                    iQ = L4.E(i13, (List) unsafe.getObject(t7, j7));
                    i9 += iQ;
                    break;
                case 29:
                    iQ = L4.X(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 30:
                    iQ = L4.F(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 31:
                    iQ = L4.H(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 32:
                    iQ = L4.J(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 33:
                    iQ = L4.S(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 34:
                    iQ = L4.U(i13, (List) unsafe.getObject(t7, j7), false);
                    i9 += iQ;
                    break;
                case 35:
                    iZ = L4.K((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = L4.I((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = L4.P((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = L4.a0((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = L4.N((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = L4.K((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = L4.I((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZ = L4.D((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = L4.Y((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = L4.G((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = L4.I((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = L4.K((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = L4.T((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZ = L4.V((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i13);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iQ = L4.L(i13, (List) unsafe.getObject(t7, j7), n(i12));
                    i9 += iQ;
                    break;
                case 50:
                    C1973s4.a(i13, unsafe.getObject(t7, j7), o(i12));
                    break;
                case 51:
                    if (y(t7, i13, i12)) {
                        iA = B3.a(i13 << 3);
                        iQ = iA + 8;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(t7, i13, i12)) {
                        iA2 = B3.a(i13 << 3);
                        iQ = iA2 + 4;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(t7, i13, i12)) {
                        long jL = l(t7, j7);
                        iA3 = B3.a(i13 << 3);
                        iB = B3.b(jL);
                        iQ = iA3 + iB;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(t7, i13, i12)) {
                        long jL2 = l(t7, j7);
                        iA3 = B3.a(i13 << 3);
                        iB = B3.b(jL2);
                        iQ = iA3 + iB;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(t7, i13, i12)) {
                        int iL = L(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.z(iL);
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(t7, i13, i12)) {
                        iA = B3.a(i13 << 3);
                        iQ = iA + 8;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(t7, i13, i12)) {
                        iA2 = B3.a(i13 << 3);
                        iQ = iA2 + 4;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(t7, i13, i12)) {
                        iA5 = B3.a(i13 << 3);
                        iQ = iA5 + 1;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(t7, i13, i12)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t7, j7);
                        if (object2 instanceof AbstractC1980t3) {
                            iA6 = B3.a(i13 << 3);
                            iG = ((AbstractC1980t3) object2).g();
                            iA7 = B3.a(iG);
                            i8 = iA6 + iA7 + iG;
                            i9 += i8;
                            break;
                        } else {
                            iA4 = B3.a(i13 << 3);
                            iZ = B3.C((String) object2);
                            i8 = iA4 + iZ;
                            i9 += i8;
                        }
                    }
                case 60:
                    if (y(t7, i13, i12)) {
                        iQ = L4.Q(i13, unsafe.getObject(t7, j7), n(i12));
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(t7, i13, i12)) {
                        AbstractC1980t3 abstractC1980t32 = (AbstractC1980t3) unsafe.getObject(t7, j7);
                        iA6 = B3.a(i13 << 3);
                        iG = abstractC1980t32.g();
                        iA7 = B3.a(iG);
                        i8 = iA6 + iA7 + iG;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(t7, i13, i12)) {
                        int iL2 = L(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.a(iL2);
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(t7, i13, i12)) {
                        int iL3 = L(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.z(iL3);
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(t7, i13, i12)) {
                        iA2 = B3.a(i13 << 3);
                        iQ = iA2 + 4;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(t7, i13, i12)) {
                        iA = B3.a(i13 << 3);
                        iQ = iA + 8;
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(t7, i13, i12)) {
                        int iL4 = L(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.a((iL4 >> 31) ^ (iL4 + iL4));
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(t7, i13, i12)) {
                        long jL3 = l(t7, j7);
                        iA4 = B3.a(i13 << 3);
                        iZ = B3.b((jL3 >> 63) ^ (jL3 + jL3));
                        i8 = iA4 + iZ;
                        i9 += i8;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(t7, i13, i12)) {
                        iQ = B3.y(i13, (InterfaceC2021y4) unsafe.getObject(t7, j7), n(i12));
                        i9 += iQ;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Y4<?, ?> y42 = this.f14671l;
        int iA9 = i9 + y42.a(y42.c(t7));
        if (!this.f14665f) {
            return iA9;
        }
        this.f14672m.a(t7);
        throw null;
    }

    private final int K(T t7) {
        int iA;
        int iA2;
        int iA3;
        int iB;
        int iA4;
        int iZ;
        int iA5;
        int iA6;
        int iG;
        int iA7;
        int iQ;
        int iD;
        int iA8;
        int i7;
        Unsafe unsafe = f14659q;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f14660a.length; i9 += 3) {
            int iK = k(i9);
            int iJ = j(iK);
            int i10 = this.f14660a[i9];
            long j7 = iK & 1048575;
            if (iJ >= M3.f14871f0.zza() && iJ <= M3.f14884s0.zza()) {
                int i11 = this.f14660a[i9 + 2];
            }
            switch (iJ) {
                case 0:
                    if (v(t7, i9)) {
                        iA = B3.a(i10 << 3);
                        iQ = iA + 8;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(t7, i9)) {
                        iA2 = B3.a(i10 << 3);
                        iQ = iA2 + 4;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(t7, i9)) {
                        long jI = C1895i5.i(t7, j7);
                        iA3 = B3.a(i10 << 3);
                        iB = B3.b(jI);
                        i8 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(t7, i9)) {
                        long jI2 = C1895i5.i(t7, j7);
                        iA3 = B3.a(i10 << 3);
                        iB = B3.b(jI2);
                        i8 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(t7, i9)) {
                        int iH = C1895i5.h(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.z(iH);
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(t7, i9)) {
                        iA = B3.a(i10 << 3);
                        iQ = iA + 8;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(t7, i9)) {
                        iA2 = B3.a(i10 << 3);
                        iQ = iA2 + 4;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(t7, i9)) {
                        iA5 = B3.a(i10 << 3);
                        iQ = iA5 + 1;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!v(t7, i9)) {
                        break;
                    } else {
                        Object objK = C1895i5.k(t7, j7);
                        if (objK instanceof AbstractC1980t3) {
                            iA6 = B3.a(i10 << 3);
                            iG = ((AbstractC1980t3) objK).g();
                            iA7 = B3.a(iG);
                            i7 = iA6 + iA7 + iG;
                            i8 += i7;
                            break;
                        } else {
                            iA4 = B3.a(i10 << 3);
                            iZ = B3.C((String) objK);
                            i7 = iA4 + iZ;
                            i8 += i7;
                        }
                    }
                case 9:
                    if (v(t7, i9)) {
                        iQ = L4.Q(i10, C1895i5.k(t7, j7), n(i9));
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(t7, i9)) {
                        AbstractC1980t3 abstractC1980t3 = (AbstractC1980t3) C1895i5.k(t7, j7);
                        iA6 = B3.a(i10 << 3);
                        iG = abstractC1980t3.g();
                        iA7 = B3.a(iG);
                        i7 = iA6 + iA7 + iG;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(t7, i9)) {
                        int iH2 = C1895i5.h(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.a(iH2);
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(t7, i9)) {
                        int iH3 = C1895i5.h(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.z(iH3);
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(t7, i9)) {
                        iA2 = B3.a(i10 << 3);
                        iQ = iA2 + 4;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(t7, i9)) {
                        iA = B3.a(i10 << 3);
                        iQ = iA + 8;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(t7, i9)) {
                        int iH4 = C1895i5.h(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.a((iH4 >> 31) ^ (iH4 + iH4));
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(t7, i9)) {
                        long jI3 = C1895i5.i(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.b((jI3 >> 63) ^ (jI3 + jI3));
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(t7, i9)) {
                        iQ = B3.y(i10, (InterfaceC2021y4) C1895i5.k(t7, j7), n(i9));
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iQ = L4.J(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 19:
                    iQ = L4.H(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 20:
                    iQ = L4.O(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 21:
                    iQ = L4.Z(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 22:
                    iQ = L4.M(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 23:
                    iQ = L4.J(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 24:
                    iQ = L4.H(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 25:
                    iQ = L4.A(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 26:
                    iQ = L4.W(i10, (List) C1895i5.k(t7, j7));
                    i8 += iQ;
                    break;
                case 27:
                    iQ = L4.R(i10, (List) C1895i5.k(t7, j7), n(i9));
                    i8 += iQ;
                    break;
                case 28:
                    iQ = L4.E(i10, (List) C1895i5.k(t7, j7));
                    i8 += iQ;
                    break;
                case 29:
                    iQ = L4.X(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 30:
                    iQ = L4.F(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 31:
                    iQ = L4.H(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 32:
                    iQ = L4.J(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 33:
                    iQ = L4.S(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 34:
                    iQ = L4.U(i10, (List) C1895i5.k(t7, j7), false);
                    i8 += iQ;
                    break;
                case 35:
                    iZ = L4.K((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = L4.I((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = L4.P((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = L4.a0((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = L4.N((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = L4.K((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = L4.I((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZ = L4.D((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = L4.Y((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = L4.G((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = L4.I((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = L4.K((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = L4.T((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZ = L4.V((List) unsafe.getObject(t7, j7));
                    if (iZ > 0) {
                        iD = B3.D(i10);
                        iA8 = B3.a(iZ);
                        iA4 = iD + iA8;
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iQ = L4.L(i10, (List) C1895i5.k(t7, j7), n(i9));
                    i8 += iQ;
                    break;
                case 50:
                    C1973s4.a(i10, C1895i5.k(t7, j7), o(i9));
                    break;
                case 51:
                    if (y(t7, i10, i9)) {
                        iA = B3.a(i10 << 3);
                        iQ = iA + 8;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(t7, i10, i9)) {
                        iA2 = B3.a(i10 << 3);
                        iQ = iA2 + 4;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(t7, i10, i9)) {
                        long jL = l(t7, j7);
                        iA3 = B3.a(i10 << 3);
                        iB = B3.b(jL);
                        i8 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(t7, i10, i9)) {
                        long jL2 = l(t7, j7);
                        iA3 = B3.a(i10 << 3);
                        iB = B3.b(jL2);
                        i8 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(t7, i10, i9)) {
                        int iL = L(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.z(iL);
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(t7, i10, i9)) {
                        iA = B3.a(i10 << 3);
                        iQ = iA + 8;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(t7, i10, i9)) {
                        iA2 = B3.a(i10 << 3);
                        iQ = iA2 + 4;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(t7, i10, i9)) {
                        iA5 = B3.a(i10 << 3);
                        iQ = iA5 + 1;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(t7, i10, i9)) {
                        break;
                    } else {
                        Object objK2 = C1895i5.k(t7, j7);
                        if (objK2 instanceof AbstractC1980t3) {
                            iA6 = B3.a(i10 << 3);
                            iG = ((AbstractC1980t3) objK2).g();
                            iA7 = B3.a(iG);
                            i7 = iA6 + iA7 + iG;
                            i8 += i7;
                            break;
                        } else {
                            iA4 = B3.a(i10 << 3);
                            iZ = B3.C((String) objK2);
                            i7 = iA4 + iZ;
                            i8 += i7;
                        }
                    }
                case 60:
                    if (y(t7, i10, i9)) {
                        iQ = L4.Q(i10, C1895i5.k(t7, j7), n(i9));
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(t7, i10, i9)) {
                        AbstractC1980t3 abstractC1980t32 = (AbstractC1980t3) C1895i5.k(t7, j7);
                        iA6 = B3.a(i10 << 3);
                        iG = abstractC1980t32.g();
                        iA7 = B3.a(iG);
                        i7 = iA6 + iA7 + iG;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(t7, i10, i9)) {
                        int iL2 = L(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.a(iL2);
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(t7, i10, i9)) {
                        int iL3 = L(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.z(iL3);
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(t7, i10, i9)) {
                        iA2 = B3.a(i10 << 3);
                        iQ = iA2 + 4;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(t7, i10, i9)) {
                        iA = B3.a(i10 << 3);
                        iQ = iA + 8;
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(t7, i10, i9)) {
                        int iL4 = L(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.a((iL4 >> 31) ^ (iL4 + iL4));
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(t7, i10, i9)) {
                        long jL3 = l(t7, j7);
                        iA4 = B3.a(i10 << 3);
                        iZ = B3.b((jL3 >> 63) ^ (jL3 + jL3));
                        i7 = iA4 + iZ;
                        i8 += i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(t7, i10, i9)) {
                        iQ = B3.y(i10, (InterfaceC2021y4) C1895i5.k(t7, j7), n(i9));
                        i8 += iQ;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Y4<?, ?> y42 = this.f14671l;
        return i8 + y42.a(y42.c(t7));
    }

    private static <T> int L(T t7, long j7) {
        return ((Integer) C1895i5.k(t7, j7)).intValue();
    }

    private final <K, V> int M(T t7, byte[] bArr, int i7, int i8, int i9, long j7, C1877g3 c1877g3) throws IOException {
        Unsafe unsafe = f14659q;
        Object objO = o(i9);
        Object object = unsafe.getObject(t7, j7);
        if (!((C1965r4) object).g()) {
            C1965r4<K, V> c1965r4B = C1965r4.a().b();
            C1973s4.b(c1965r4B, object);
            unsafe.putObject(t7, j7, c1965r4B);
        }
        throw null;
    }

    private final int N(T t7, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, C1877g3 c1877g3) throws IOException {
        Unsafe unsafe = f14659q;
        long j8 = this.f14660a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(t7, j7, Double.valueOf(Double.longBitsToDouble(C1885h3.n(bArr, i7))));
                    unsafe.putInt(t7, j8, i10);
                    return i7 + 8;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(t7, j7, Float.valueOf(Float.intBitsToFloat(C1885h3.b(bArr, i7))));
                    unsafe.putInt(t7, j8, i10);
                    return i7 + 4;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int iM = C1885h3.m(bArr, i7, c1877g3);
                    unsafe.putObject(t7, j7, Long.valueOf(c1877g3.f15164b));
                    unsafe.putInt(t7, j8, i10);
                    return iM;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int iJ = C1885h3.j(bArr, i7, c1877g3);
                    unsafe.putObject(t7, j7, Integer.valueOf(c1877g3.f15163a));
                    unsafe.putInt(t7, j8, i10);
                    return iJ;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(t7, j7, Long.valueOf(C1885h3.n(bArr, i7)));
                    unsafe.putInt(t7, j8, i10);
                    return i7 + 8;
                }
                break;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(t7, j7, Integer.valueOf(C1885h3.b(bArr, i7)));
                    unsafe.putInt(t7, j8, i10);
                    return i7 + 4;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int iM2 = C1885h3.m(bArr, i7, c1877g3);
                    unsafe.putObject(t7, j7, Boolean.valueOf(c1877g3.f15164b != 0));
                    unsafe.putInt(t7, j8, i10);
                    return iM2;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int iJ2 = C1885h3.j(bArr, i7, c1877g3);
                    int i15 = c1877g3.f15163a;
                    if (i15 == 0) {
                        unsafe.putObject(t7, j7, BuildConfig.FLAVOR);
                    } else {
                        if ((i12 & 536870912) != 0 && !C1935n5.f(bArr, iJ2, iJ2 + i15)) {
                            throw C1854d4.c();
                        }
                        unsafe.putObject(t7, j7, new String(bArr, iJ2, i15, C1838b4.f15100b));
                        iJ2 += i15;
                    }
                    unsafe.putInt(t7, j8, i10);
                    return iJ2;
                }
                break;
            case 60:
                if (i11 == 2) {
                    int iD = C1885h3.d(n(i14), bArr, i7, i8, c1877g3);
                    Object object = unsafe.getInt(t7, j8) == i10 ? unsafe.getObject(t7, j7) : null;
                    if (object == null) {
                        unsafe.putObject(t7, j7, c1877g3.f15165c);
                    } else {
                        unsafe.putObject(t7, j7, C1838b4.g(object, c1877g3.f15165c));
                    }
                    unsafe.putInt(t7, j8, i10);
                    return iD;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int iA = C1885h3.a(bArr, i7, c1877g3);
                    unsafe.putObject(t7, j7, c1877g3.f15165c);
                    unsafe.putInt(t7, j8, i10);
                    return iA;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int iJ3 = C1885h3.j(bArr, i7, c1877g3);
                    int i16 = c1877g3.f15163a;
                    X3 x3M = m(i14);
                    if (x3M == null || x3M.y(i16)) {
                        unsafe.putObject(t7, j7, Integer.valueOf(i16));
                        unsafe.putInt(t7, j8, i10);
                    } else {
                        E(t7).h(i9, Long.valueOf(i16));
                    }
                    return iJ3;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int iJ4 = C1885h3.j(bArr, i7, c1877g3);
                    unsafe.putObject(t7, j7, Integer.valueOf(C2012x3.a(c1877g3.f15163a)));
                    unsafe.putInt(t7, j8, i10);
                    return iJ4;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int iM3 = C1885h3.m(bArr, i7, c1877g3);
                    unsafe.putObject(t7, j7, Long.valueOf(C2012x3.b(c1877g3.f15164b)));
                    unsafe.putInt(t7, j8, i10);
                    return iM3;
                }
                break;
            case 68:
                if (i11 == 3) {
                    int iC = C1885h3.c(n(i14), bArr, i7, i8, (i9 & (-8)) | 4, c1877g3);
                    Object object2 = unsafe.getInt(t7, j8) == i10 ? unsafe.getObject(t7, j7) : null;
                    if (object2 == null) {
                        unsafe.putObject(t7, j7, c1877g3.f15165c);
                    } else {
                        unsafe.putObject(t7, j7, C1838b4.g(object2, c1877g3.f15165c));
                    }
                    unsafe.putInt(t7, j8, i10);
                    return iC;
                }
                break;
        }
        return i7;
    }

    private final int O(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.measurement.C1877g3 r34) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B4.O(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.g3):int");
    }

    private final int P(T t7, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j7, int i13, long j8, C1877g3 c1877g3) throws IOException {
        int i14;
        int i15;
        int i16;
        int i17;
        int iJ;
        int iJ2 = i7;
        Unsafe unsafe = f14659q;
        InterfaceC1830a4 interfaceC1830a4H = (InterfaceC1830a4) unsafe.getObject(t7, j8);
        if (!interfaceC1830a4H.a()) {
            int size = interfaceC1830a4H.size();
            interfaceC1830a4H = interfaceC1830a4H.h(size == 0 ? 10 : size + size);
            unsafe.putObject(t7, j8, interfaceC1830a4H);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    D3 d32 = (D3) interfaceC1830a4H;
                    int iJ3 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i18 = c1877g3.f15163a + iJ3;
                    while (iJ3 < i18) {
                        d32.e(Double.longBitsToDouble(C1885h3.n(bArr, iJ3)));
                        iJ3 += 8;
                    }
                    if (iJ3 == i18) {
                        return iJ3;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 1) {
                    D3 d33 = (D3) interfaceC1830a4H;
                    d33.e(Double.longBitsToDouble(C1885h3.n(bArr, i7)));
                    while (true) {
                        i14 = iJ2 + 8;
                        if (i14 < i8) {
                            iJ2 = C1885h3.j(bArr, i14, c1877g3);
                            if (i9 == c1877g3.f15163a) {
                                d33.e(Double.longBitsToDouble(C1885h3.n(bArr, iJ2)));
                            }
                        }
                    }
                    return i14;
                }
                return iJ2;
            case 19:
            case 36:
                if (i11 == 2) {
                    N3 n32 = (N3) interfaceC1830a4H;
                    int iJ4 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i19 = c1877g3.f15163a + iJ4;
                    while (iJ4 < i19) {
                        n32.e(Float.intBitsToFloat(C1885h3.b(bArr, iJ4)));
                        iJ4 += 4;
                    }
                    if (iJ4 == i19) {
                        return iJ4;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 5) {
                    N3 n33 = (N3) interfaceC1830a4H;
                    n33.e(Float.intBitsToFloat(C1885h3.b(bArr, i7)));
                    while (true) {
                        i15 = iJ2 + 4;
                        if (i15 < i8) {
                            iJ2 = C1885h3.j(bArr, i15, c1877g3);
                            if (i9 == c1877g3.f15163a) {
                                n33.e(Float.intBitsToFloat(C1885h3.b(bArr, iJ2)));
                            }
                        }
                    }
                    return i15;
                }
                return iJ2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    C1926m4 c1926m4 = (C1926m4) interfaceC1830a4H;
                    int iJ5 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i20 = c1877g3.f15163a + iJ5;
                    while (iJ5 < i20) {
                        iJ5 = C1885h3.m(bArr, iJ5, c1877g3);
                        c1926m4.g(c1877g3.f15164b);
                    }
                    if (iJ5 == i20) {
                        return iJ5;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 0) {
                    C1926m4 c1926m42 = (C1926m4) interfaceC1830a4H;
                    int iM = C1885h3.m(bArr, iJ2, c1877g3);
                    c1926m42.g(c1877g3.f15164b);
                    while (iM < i8) {
                        int iJ6 = C1885h3.j(bArr, iM, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iM;
                        }
                        iM = C1885h3.m(bArr, iJ6, c1877g3);
                        c1926m42.g(c1877g3.f15164b);
                    }
                    return iM;
                }
                return iJ2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return C1885h3.f(bArr, iJ2, interfaceC1830a4H, c1877g3);
                }
                if (i11 == 0) {
                    return C1885h3.l(i9, bArr, i7, i8, interfaceC1830a4H, c1877g3);
                }
                return iJ2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    C1926m4 c1926m43 = (C1926m4) interfaceC1830a4H;
                    int iJ7 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i21 = c1877g3.f15163a + iJ7;
                    while (iJ7 < i21) {
                        c1926m43.g(C1885h3.n(bArr, iJ7));
                        iJ7 += 8;
                    }
                    if (iJ7 == i21) {
                        return iJ7;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 1) {
                    C1926m4 c1926m44 = (C1926m4) interfaceC1830a4H;
                    c1926m44.g(C1885h3.n(bArr, i7));
                    while (true) {
                        i16 = iJ2 + 8;
                        if (i16 < i8) {
                            iJ2 = C1885h3.j(bArr, i16, c1877g3);
                            if (i9 == c1877g3.f15163a) {
                                c1926m44.g(C1885h3.n(bArr, iJ2));
                            }
                        }
                    }
                    return i16;
                }
                return iJ2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    U3 u32 = (U3) interfaceC1830a4H;
                    int iJ8 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i22 = c1877g3.f15163a + iJ8;
                    while (iJ8 < i22) {
                        u32.j(C1885h3.b(bArr, iJ8));
                        iJ8 += 4;
                    }
                    if (iJ8 == i22) {
                        return iJ8;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 5) {
                    U3 u33 = (U3) interfaceC1830a4H;
                    u33.j(C1885h3.b(bArr, i7));
                    while (true) {
                        i17 = iJ2 + 4;
                        if (i17 < i8) {
                            iJ2 = C1885h3.j(bArr, i17, c1877g3);
                            if (i9 == c1877g3.f15163a) {
                                u33.j(C1885h3.b(bArr, iJ2));
                            }
                        }
                    }
                    return i17;
                }
                return iJ2;
            case 25:
            case 42:
                if (i11 == 2) {
                    C1893i3 c1893i3 = (C1893i3) interfaceC1830a4H;
                    iJ = C1885h3.j(bArr, iJ2, c1877g3);
                    int i23 = c1877g3.f15163a + iJ;
                    while (iJ < i23) {
                        iJ = C1885h3.m(bArr, iJ, c1877g3);
                        c1893i3.e(c1877g3.f15164b != 0);
                    }
                    if (iJ != i23) {
                        throw C1854d4.f();
                    }
                    return iJ;
                }
                if (i11 == 0) {
                    C1893i3 c1893i32 = (C1893i3) interfaceC1830a4H;
                    int iM2 = C1885h3.m(bArr, iJ2, c1877g3);
                    c1893i32.e(c1877g3.f15164b != 0);
                    while (iM2 < i8) {
                        int iJ9 = C1885h3.j(bArr, iM2, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iM2;
                        }
                        iM2 = C1885h3.m(bArr, iJ9, c1877g3);
                        c1893i32.e(c1877g3.f15164b != 0);
                    }
                    return iM2;
                }
                return iJ2;
            case 26:
                if (i11 == 2) {
                    if ((j7 & 536870912) == 0) {
                        int iJ10 = C1885h3.j(bArr, iJ2, c1877g3);
                        int i24 = c1877g3.f15163a;
                        if (i24 < 0) {
                            throw C1854d4.d();
                        }
                        if (i24 == 0) {
                            interfaceC1830a4H.add(BuildConfig.FLAVOR);
                        } else {
                            interfaceC1830a4H.add(new String(bArr, iJ10, i24, C1838b4.f15100b));
                            iJ10 += i24;
                        }
                        while (iJ10 < i8) {
                            int iJ11 = C1885h3.j(bArr, iJ10, c1877g3);
                            if (i9 != c1877g3.f15163a) {
                                return iJ10;
                            }
                            iJ10 = C1885h3.j(bArr, iJ11, c1877g3);
                            int i25 = c1877g3.f15163a;
                            if (i25 < 0) {
                                throw C1854d4.d();
                            }
                            if (i25 == 0) {
                                interfaceC1830a4H.add(BuildConfig.FLAVOR);
                            } else {
                                interfaceC1830a4H.add(new String(bArr, iJ10, i25, C1838b4.f15100b));
                                iJ10 += i25;
                            }
                        }
                        return iJ10;
                    }
                    int iJ12 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i26 = c1877g3.f15163a;
                    if (i26 < 0) {
                        throw C1854d4.d();
                    }
                    if (i26 == 0) {
                        interfaceC1830a4H.add(BuildConfig.FLAVOR);
                    } else {
                        int i27 = iJ12 + i26;
                        if (!C1935n5.f(bArr, iJ12, i27)) {
                            throw C1854d4.c();
                        }
                        interfaceC1830a4H.add(new String(bArr, iJ12, i26, C1838b4.f15100b));
                        iJ12 = i27;
                    }
                    while (iJ12 < i8) {
                        int iJ13 = C1885h3.j(bArr, iJ12, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iJ12;
                        }
                        iJ12 = C1885h3.j(bArr, iJ13, c1877g3);
                        int i28 = c1877g3.f15163a;
                        if (i28 < 0) {
                            throw C1854d4.d();
                        }
                        if (i28 == 0) {
                            interfaceC1830a4H.add(BuildConfig.FLAVOR);
                        } else {
                            int i29 = iJ12 + i28;
                            if (!C1935n5.f(bArr, iJ12, i29)) {
                                throw C1854d4.c();
                            }
                            interfaceC1830a4H.add(new String(bArr, iJ12, i28, C1838b4.f15100b));
                            iJ12 = i29;
                        }
                    }
                    return iJ12;
                }
                return iJ2;
            case 27:
                if (i11 == 2) {
                    return C1885h3.e(n(i12), i9, bArr, i7, i8, interfaceC1830a4H, c1877g3);
                }
                return iJ2;
            case 28:
                if (i11 == 2) {
                    int iJ14 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i30 = c1877g3.f15163a;
                    if (i30 < 0) {
                        throw C1854d4.d();
                    }
                    if (i30 > bArr.length - iJ14) {
                        throw C1854d4.f();
                    }
                    if (i30 == 0) {
                        interfaceC1830a4H.add(AbstractC1980t3.f15325e);
                    } else {
                        interfaceC1830a4H.add(AbstractC1980t3.q(bArr, iJ14, i30));
                        iJ14 += i30;
                    }
                    while (iJ14 < i8) {
                        int iJ15 = C1885h3.j(bArr, iJ14, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iJ14;
                        }
                        iJ14 = C1885h3.j(bArr, iJ15, c1877g3);
                        int i31 = c1877g3.f15163a;
                        if (i31 < 0) {
                            throw C1854d4.d();
                        }
                        if (i31 > bArr.length - iJ14) {
                            throw C1854d4.f();
                        }
                        if (i31 == 0) {
                            interfaceC1830a4H.add(AbstractC1980t3.f15325e);
                        } else {
                            interfaceC1830a4H.add(AbstractC1980t3.q(bArr, iJ14, i31));
                            iJ14 += i31;
                        }
                    }
                    return iJ14;
                }
                return iJ2;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iJ = C1885h3.l(i9, bArr, i7, i8, interfaceC1830a4H, c1877g3);
                    }
                    return iJ2;
                }
                iJ = C1885h3.f(bArr, iJ2, interfaceC1830a4H, c1877g3);
                T3 t32 = (T3) t7;
                Z4 z42 = t32.zzc;
                if (z42 == Z4.c()) {
                    z42 = null;
                }
                Object objC = L4.c(i10, interfaceC1830a4H, m(i12), z42, this.f14671l);
                if (objC != null) {
                    t32.zzc = (Z4) objC;
                    return iJ;
                }
                return iJ;
            case 33:
            case 47:
                if (i11 == 2) {
                    U3 u34 = (U3) interfaceC1830a4H;
                    int iJ16 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i32 = c1877g3.f15163a + iJ16;
                    while (iJ16 < i32) {
                        iJ16 = C1885h3.j(bArr, iJ16, c1877g3);
                        u34.j(C2012x3.a(c1877g3.f15163a));
                    }
                    if (iJ16 == i32) {
                        return iJ16;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 0) {
                    U3 u35 = (U3) interfaceC1830a4H;
                    int iJ17 = C1885h3.j(bArr, iJ2, c1877g3);
                    u35.j(C2012x3.a(c1877g3.f15163a));
                    while (iJ17 < i8) {
                        int iJ18 = C1885h3.j(bArr, iJ17, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iJ17;
                        }
                        iJ17 = C1885h3.j(bArr, iJ18, c1877g3);
                        u35.j(C2012x3.a(c1877g3.f15163a));
                    }
                    return iJ17;
                }
                return iJ2;
            case 34:
            case 48:
                if (i11 == 2) {
                    C1926m4 c1926m45 = (C1926m4) interfaceC1830a4H;
                    int iJ19 = C1885h3.j(bArr, iJ2, c1877g3);
                    int i33 = c1877g3.f15163a + iJ19;
                    while (iJ19 < i33) {
                        iJ19 = C1885h3.m(bArr, iJ19, c1877g3);
                        c1926m45.g(C2012x3.b(c1877g3.f15164b));
                    }
                    if (iJ19 == i33) {
                        return iJ19;
                    }
                    throw C1854d4.f();
                }
                if (i11 == 0) {
                    C1926m4 c1926m46 = (C1926m4) interfaceC1830a4H;
                    int iM3 = C1885h3.m(bArr, iJ2, c1877g3);
                    c1926m46.g(C2012x3.b(c1877g3.f15164b));
                    while (iM3 < i8) {
                        int iJ20 = C1885h3.j(bArr, iM3, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iM3;
                        }
                        iM3 = C1885h3.m(bArr, iJ20, c1877g3);
                        c1926m46.g(C2012x3.b(c1877g3.f15164b));
                    }
                    return iM3;
                }
                return iJ2;
            default:
                if (i11 == 3) {
                    J4 j4N = n(i12);
                    int i34 = (i9 & (-8)) | 4;
                    int iC = C1885h3.c(j4N, bArr, i7, i8, i34, c1877g3);
                    interfaceC1830a4H.add(c1877g3.f15165c);
                    while (iC < i8) {
                        int iJ21 = C1885h3.j(bArr, iC, c1877g3);
                        if (i9 != c1877g3.f15163a) {
                            return iC;
                        }
                        iC = C1885h3.c(j4N, bArr, iJ21, i8, i34, c1877g3);
                        interfaceC1830a4H.add(c1877g3.f15165c);
                    }
                    return iC;
                }
                return iJ2;
        }
    }

    private final int Q(int i7) {
        if (i7 < this.f14662c || i7 > this.f14663d) {
            return -1;
        }
        return T(i7, 0);
    }

    private final int R(int i7, int i8) {
        if (i7 < this.f14662c || i7 > this.f14663d) {
            return -1;
        }
        return T(i7, i8);
    }

    private final int S(int i7) {
        return this.f14660a[i7 + 2];
    }

    private final int T(int i7, int i8) {
        int length = (this.f14660a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f14660a[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int j(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int k(int i7) {
        return this.f14660a[i7 + 1];
    }

    private static <T> long l(T t7, long j7) {
        return ((Long) C1895i5.k(t7, j7)).longValue();
    }

    private final X3 m(int i7) {
        int i8 = i7 / 3;
        return (X3) this.f14661b[i8 + i8 + 1];
    }

    private final J4 n(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        J4 j42 = (J4) this.f14661b[i9];
        if (j42 != null) {
            return j42;
        }
        J4<T> j4B = G4.a().b((Class) this.f14661b[i9 + 1]);
        this.f14661b[i9] = j4B;
        return j4B;
    }

    private final Object o(int i7) {
        int i8 = i7 / 3;
        return this.f14661b[i8 + i8];
    }

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void q(T t7, T t8, int i7) {
        long jK = k(i7) & 1048575;
        if (v(t8, i7)) {
            Object objK = C1895i5.k(t7, jK);
            Object objK2 = C1895i5.k(t8, jK);
            if (objK != null && objK2 != null) {
                C1895i5.x(t7, jK, C1838b4.g(objK, objK2));
                s(t7, i7);
            } else if (objK2 != null) {
                C1895i5.x(t7, jK, objK2);
                s(t7, i7);
            }
        }
    }

    private final void r(T t7, T t8, int i7) {
        int iK = k(i7);
        int i8 = this.f14660a[i7];
        long j7 = iK & 1048575;
        if (y(t8, i8, i7)) {
            Object objK = y(t7, i8, i7) ? C1895i5.k(t7, j7) : null;
            Object objK2 = C1895i5.k(t8, j7);
            if (objK != null && objK2 != null) {
                C1895i5.x(t7, j7, C1838b4.g(objK, objK2));
                t(t7, i8, i7);
            } else if (objK2 != null) {
                C1895i5.x(t7, j7, objK2);
                t(t7, i8, i7);
            }
        }
    }

    private final void s(T t7, int i7) {
        int iS = S(i7);
        long j7 = 1048575 & iS;
        if (j7 == 1048575) {
            return;
        }
        C1895i5.v(t7, j7, (1 << (iS >>> 20)) | C1895i5.h(t7, j7));
    }

    private final void t(T t7, int i7, int i8) {
        C1895i5.v(t7, S(i8) & 1048575, i7);
    }

    private final boolean u(T t7, T t8, int i7) {
        return v(t7, i7) == v(t8, i7);
    }

    private final boolean v(T t7, int i7) {
        int iS = S(i7);
        long j7 = iS & 1048575;
        if (j7 != 1048575) {
            return (C1895i5.h(t7, j7) & (1 << (iS >>> 20))) != 0;
        }
        int iK = k(i7);
        long j8 = iK & 1048575;
        switch (j(iK)) {
            case 0:
                return Double.doubleToRawLongBits(C1895i5.f(t7, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(C1895i5.g(t7, j8)) != 0;
            case 2:
                return C1895i5.i(t7, j8) != 0;
            case 3:
                return C1895i5.i(t7, j8) != 0;
            case 4:
                return C1895i5.h(t7, j8) != 0;
            case 5:
                return C1895i5.i(t7, j8) != 0;
            case 6:
                return C1895i5.h(t7, j8) != 0;
            case 7:
                return C1895i5.B(t7, j8);
            case 8:
                Object objK = C1895i5.k(t7, j8);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof AbstractC1980t3) {
                    return !AbstractC1980t3.f15325e.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return C1895i5.k(t7, j8) != null;
            case 10:
                return !AbstractC1980t3.f15325e.equals(C1895i5.k(t7, j8));
            case 11:
                return C1895i5.h(t7, j8) != 0;
            case 12:
                return C1895i5.h(t7, j8) != 0;
            case 13:
                return C1895i5.h(t7, j8) != 0;
            case 14:
                return C1895i5.i(t7, j8) != 0;
            case 15:
                return C1895i5.h(t7, j8) != 0;
            case 16:
                return C1895i5.i(t7, j8) != 0;
            case 17:
                return C1895i5.k(t7, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean w(T t7, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? v(t7, i7) : (i9 & i10) != 0;
    }

    private static boolean x(Object obj, int i7, J4 j42) {
        return j42.f(C1895i5.k(obj, i7 & 1048575));
    }

    private final boolean y(T t7, int i7, int i8) {
        return C1895i5.h(t7, (long) (S(i8) & 1048575)) == i7;
    }

    private static <T> boolean z(T t7, long j7) {
        return ((Boolean) C1895i5.k(t7, j7)).booleanValue();
    }

    final int D(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.C1877g3 r36) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B4.D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.g3):int");
    }

    @Override
    public final int a(T t7) {
        return this.f14666g ? K(t7) : J(t7);
    }

    @Override
    public final T b() {
        return (T) ((T3) this.f14664e).v(4, null, null);
    }

    @Override
    public final int c(T t7) {
        int i7;
        int iC;
        int length = this.f14660a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iK = k(i9);
            int i10 = this.f14660a[i9];
            long j7 = 1048575 & iK;
            int iHashCode = 37;
            switch (j(iK)) {
                case 0:
                    i7 = i8 * 53;
                    iC = C1838b4.c(Double.doubleToLongBits(C1895i5.f(t7, j7)));
                    i8 = i7 + iC;
                    break;
                case 1:
                    i7 = i8 * 53;
                    iC = Float.floatToIntBits(C1895i5.g(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 2:
                    i7 = i8 * 53;
                    iC = C1838b4.c(C1895i5.i(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 3:
                    i7 = i8 * 53;
                    iC = C1838b4.c(C1895i5.i(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 4:
                    i7 = i8 * 53;
                    iC = C1895i5.h(t7, j7);
                    i8 = i7 + iC;
                    break;
                case 5:
                    i7 = i8 * 53;
                    iC = C1838b4.c(C1895i5.i(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 6:
                    i7 = i8 * 53;
                    iC = C1895i5.h(t7, j7);
                    i8 = i7 + iC;
                    break;
                case 7:
                    i7 = i8 * 53;
                    iC = C1838b4.a(C1895i5.B(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iC = ((String) C1895i5.k(t7, j7)).hashCode();
                    i8 = i7 + iC;
                    break;
                case 9:
                    Object objK = C1895i5.k(t7, j7);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i8 * 53;
                    iC = C1895i5.k(t7, j7).hashCode();
                    i8 = i7 + iC;
                    break;
                case 11:
                    i7 = i8 * 53;
                    iC = C1895i5.h(t7, j7);
                    i8 = i7 + iC;
                    break;
                case 12:
                    i7 = i8 * 53;
                    iC = C1895i5.h(t7, j7);
                    i8 = i7 + iC;
                    break;
                case 13:
                    i7 = i8 * 53;
                    iC = C1895i5.h(t7, j7);
                    i8 = i7 + iC;
                    break;
                case 14:
                    i7 = i8 * 53;
                    iC = C1838b4.c(C1895i5.i(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 15:
                    i7 = i8 * 53;
                    iC = C1895i5.h(t7, j7);
                    i8 = i7 + iC;
                    break;
                case 16:
                    i7 = i8 * 53;
                    iC = C1838b4.c(C1895i5.i(t7, j7));
                    i8 = i7 + iC;
                    break;
                case 17:
                    Object objK2 = C1895i5.k(t7, j7);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i8 * 53;
                    iC = C1895i5.k(t7, j7).hashCode();
                    i8 = i7 + iC;
                    break;
                case 50:
                    i7 = i8 * 53;
                    iC = C1895i5.k(t7, j7).hashCode();
                    i8 = i7 + iC;
                    break;
                case 51:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.c(Double.doubleToLongBits(H(t7, j7)));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = Float.floatToIntBits(I(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.c(l(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.c(l(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = L(t7, j7);
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.c(l(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = L(t7, j7);
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.a(z(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = ((String) C1895i5.k(t7, j7)).hashCode();
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1895i5.k(t7, j7).hashCode();
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1895i5.k(t7, j7).hashCode();
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = L(t7, j7);
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = L(t7, j7);
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = L(t7, j7);
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.c(l(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = L(t7, j7);
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1838b4.c(l(t7, j7));
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(t7, i10, i9)) {
                        i7 = i8 * 53;
                        iC = C1895i5.k(t7, j7).hashCode();
                        i8 = i7 + iC;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i8 * 53) + this.f14671l.c(t7).hashCode();
        if (!this.f14665f) {
            return iHashCode2;
        }
        this.f14672m.a(t7);
        throw null;
    }

    @Override
    public final void d(T t7) {
        int i7;
        int i8 = this.f14668i;
        while (true) {
            i7 = this.f14669j;
            if (i8 >= i7) {
                break;
            }
            long jK = k(this.f14667h[i8]) & 1048575;
            Object objK = C1895i5.k(t7, jK);
            if (objK != null) {
                ((C1965r4) objK).c();
                C1895i5.x(t7, jK, objK);
            }
            i8++;
        }
        int length = this.f14667h.length;
        while (i7 < length) {
            this.f14670k.a(t7, this.f14667h[i7]);
            i7++;
        }
        this.f14671l.g(t7);
        if (this.f14665f) {
            this.f14672m.b(t7);
        }
    }

    @Override
    public final void e(T t7, T t8) {
        t8.getClass();
        for (int i7 = 0; i7 < this.f14660a.length; i7 += 3) {
            int iK = k(i7);
            long j7 = 1048575 & iK;
            int i8 = this.f14660a[i7];
            switch (j(iK)) {
                case 0:
                    if (v(t8, i7)) {
                        C1895i5.t(t7, j7, C1895i5.f(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(t8, i7)) {
                        C1895i5.u(t7, j7, C1895i5.g(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(t8, i7)) {
                        C1895i5.w(t7, j7, C1895i5.i(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(t8, i7)) {
                        C1895i5.w(t7, j7, C1895i5.i(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(t8, i7)) {
                        C1895i5.v(t7, j7, C1895i5.h(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(t8, i7)) {
                        C1895i5.w(t7, j7, C1895i5.i(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(t8, i7)) {
                        C1895i5.v(t7, j7, C1895i5.h(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(t8, i7)) {
                        C1895i5.r(t7, j7, C1895i5.B(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(t8, i7)) {
                        C1895i5.x(t7, j7, C1895i5.k(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    q(t7, t8, i7);
                    break;
                case 10:
                    if (v(t8, i7)) {
                        C1895i5.x(t7, j7, C1895i5.k(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(t8, i7)) {
                        C1895i5.v(t7, j7, C1895i5.h(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(t8, i7)) {
                        C1895i5.v(t7, j7, C1895i5.h(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(t8, i7)) {
                        C1895i5.v(t7, j7, C1895i5.h(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(t8, i7)) {
                        C1895i5.w(t7, j7, C1895i5.i(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(t8, i7)) {
                        C1895i5.v(t7, j7, C1895i5.h(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(t8, i7)) {
                        C1895i5.w(t7, j7, C1895i5.i(t8, j7));
                        s(t7, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    q(t7, t8, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f14670k.b(t7, t8, j7);
                    break;
                case 50:
                    L4.i(this.f14674o, t7, t8, j7);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (y(t8, i8, i7)) {
                        C1895i5.x(t7, j7, C1895i5.k(t8, j7));
                        t(t7, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    r(t7, t8, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (y(t8, i8, i7)) {
                        C1895i5.x(t7, j7, C1895i5.k(t8, j7));
                        t(t7, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    r(t7, t8, i7);
                    break;
            }
        }
        L4.f(this.f14671l, t7, t8);
        if (this.f14665f) {
            L4.e(this.f14672m, t7, t8);
        }
    }

    @Override
    public final boolean f(T r19) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B4.f(java.lang.Object):boolean");
    }

    @Override
    public final void g(T t7, byte[] bArr, int i7, int i8, C1877g3 c1877g3) throws IOException {
        if (this.f14666g) {
            O(t7, bArr, i7, i8, c1877g3);
        } else {
            D(t7, bArr, i7, i8, 0, c1877g3);
        }
    }

    @Override
    public final boolean h(T t7, T t8) {
        boolean zH;
        int length = this.f14660a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iK = k(i7);
            long j7 = iK & 1048575;
            switch (j(iK)) {
                case 0:
                    if (!u(t7, t8, i7) || Double.doubleToLongBits(C1895i5.f(t7, j7)) != Double.doubleToLongBits(C1895i5.f(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!u(t7, t8, i7) || Float.floatToIntBits(C1895i5.g(t7, j7)) != Float.floatToIntBits(C1895i5.g(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!u(t7, t8, i7) || C1895i5.i(t7, j7) != C1895i5.i(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!u(t7, t8, i7) || C1895i5.i(t7, j7) != C1895i5.i(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!u(t7, t8, i7) || C1895i5.h(t7, j7) != C1895i5.h(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!u(t7, t8, i7) || C1895i5.i(t7, j7) != C1895i5.i(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!u(t7, t8, i7) || C1895i5.h(t7, j7) != C1895i5.h(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!u(t7, t8, i7) || C1895i5.B(t7, j7) != C1895i5.B(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!u(t7, t8, i7) || !L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!u(t7, t8, i7) || !L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!u(t7, t8, i7) || !L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!u(t7, t8, i7) || C1895i5.h(t7, j7) != C1895i5.h(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!u(t7, t8, i7) || C1895i5.h(t7, j7) != C1895i5.h(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!u(t7, t8, i7) || C1895i5.h(t7, j7) != C1895i5.h(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!u(t7, t8, i7) || C1895i5.i(t7, j7) != C1895i5.i(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!u(t7, t8, i7) || C1895i5.h(t7, j7) != C1895i5.h(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!u(t7, t8, i7) || C1895i5.i(t7, j7) != C1895i5.i(t8, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!u(t7, t8, i7) || !L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zH = L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7));
                    break;
                case 50:
                    zH = L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jS = S(i7) & 1048575;
                    if (C1895i5.h(t7, jS) != C1895i5.h(t8, jS) || !L4.h(C1895i5.k(t7, j7), C1895i5.k(t8, j7))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zH) {
                return false;
            }
        }
        if (!this.f14671l.c(t7).equals(this.f14671l.c(t8))) {
            return false;
        }
        if (!this.f14665f) {
            return true;
        }
        this.f14672m.a(t7);
        this.f14672m.a(t8);
        throw null;
    }

    @Override
    public final void i(T t7, C3 c3) throws IOException {
        if (!this.f14666g) {
            A(t7, c3);
            return;
        }
        if (this.f14665f) {
            this.f14672m.a(t7);
            throw null;
        }
        int length = this.f14660a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iK = k(i7);
            int i8 = this.f14660a[i7];
            switch (j(iK)) {
                case 0:
                    if (v(t7, i7)) {
                        c3.q(i8, C1895i5.f(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(t7, i7)) {
                        c3.z(i8, C1895i5.g(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(t7, i7)) {
                        c3.E(i8, C1895i5.i(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(t7, i7)) {
                        c3.j(i8, C1895i5.i(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(t7, i7)) {
                        c3.C(i8, C1895i5.h(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(t7, i7)) {
                        c3.x(i8, C1895i5.i(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(t7, i7)) {
                        c3.v(i8, C1895i5.h(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(t7, i7)) {
                        c3.m(i8, C1895i5.B(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(t7, i7)) {
                        C(i8, C1895i5.k(t7, iK & 1048575), c3);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (v(t7, i7)) {
                        c3.G(i8, C1895i5.k(t7, iK & 1048575), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(t7, i7)) {
                        c3.o(i8, (AbstractC1980t3) C1895i5.k(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(t7, i7)) {
                        c3.h(i8, C1895i5.h(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(t7, i7)) {
                        c3.t(i8, C1895i5.h(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(t7, i7)) {
                        c3.H(i8, C1895i5.h(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(t7, i7)) {
                        c3.J(i8, C1895i5.i(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(t7, i7)) {
                        c3.a(i8, C1895i5.h(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(t7, i7)) {
                        c3.c(i8, C1895i5.i(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(t7, i7)) {
                        c3.B(i8, C1895i5.k(t7, iK & 1048575), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    L4.l(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 19:
                    L4.p(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 20:
                    L4.s(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 21:
                    L4.B(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 22:
                    L4.r(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 23:
                    L4.o(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 24:
                    L4.n(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 25:
                    L4.j(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 26:
                    L4.y(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3);
                    break;
                case 27:
                    L4.t(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, n(i7));
                    break;
                case 28:
                    L4.k(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3);
                    break;
                case 29:
                    L4.z(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 30:
                    L4.m(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 31:
                    L4.u(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 32:
                    L4.v(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 33:
                    L4.w(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 34:
                    L4.x(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, false);
                    break;
                case 35:
                    L4.l(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 36:
                    L4.p(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 37:
                    L4.s(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 38:
                    L4.B(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 39:
                    L4.r(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 40:
                    L4.o(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 41:
                    L4.n(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 42:
                    L4.j(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 43:
                    L4.z(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 44:
                    L4.m(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 45:
                    L4.u(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 46:
                    L4.v(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 47:
                    L4.w(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 48:
                    L4.x(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, true);
                    break;
                case 49:
                    L4.q(this.f14660a[i7], (List) C1895i5.k(t7, iK & 1048575), c3, n(i7));
                    break;
                case 50:
                    B(c3, i8, C1895i5.k(t7, iK & 1048575), i7);
                    break;
                case 51:
                    if (y(t7, i8, i7)) {
                        c3.q(i8, H(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(t7, i8, i7)) {
                        c3.z(i8, I(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(t7, i8, i7)) {
                        c3.E(i8, l(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(t7, i8, i7)) {
                        c3.j(i8, l(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(t7, i8, i7)) {
                        c3.C(i8, L(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(t7, i8, i7)) {
                        c3.x(i8, l(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(t7, i8, i7)) {
                        c3.v(i8, L(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(t7, i8, i7)) {
                        c3.m(i8, z(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(t7, i8, i7)) {
                        C(i8, C1895i5.k(t7, iK & 1048575), c3);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (y(t7, i8, i7)) {
                        c3.G(i8, C1895i5.k(t7, iK & 1048575), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(t7, i8, i7)) {
                        c3.o(i8, (AbstractC1980t3) C1895i5.k(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(t7, i8, i7)) {
                        c3.h(i8, L(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(t7, i8, i7)) {
                        c3.t(i8, L(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(t7, i8, i7)) {
                        c3.H(i8, L(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(t7, i8, i7)) {
                        c3.J(i8, l(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(t7, i8, i7)) {
                        c3.a(i8, L(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(t7, i8, i7)) {
                        c3.c(i8, l(t7, iK & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(t7, i8, i7)) {
                        c3.B(i8, C1895i5.k(t7, iK & 1048575), n(i7));
                        break;
                    } else {
                        break;
                    }
            }
        }
        Y4<?, ?> y42 = this.f14671l;
        y42.i(y42.c(t7), c3);
    }
}
