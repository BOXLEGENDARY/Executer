package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

final class C2173x3<T> implements F3<T> {

    private static final int[] f16168l = new int[0];

    private static final Unsafe f16169m = Z3.l();

    private final int[] f16170a;

    private final Object[] f16171b;

    private final int f16172c;

    private final int f16173d;

    private final InterfaceC2155u3 f16174e;

    private final boolean f16175f;

    private final int[] f16176g;

    private final int f16177h;

    private final int f16178i;

    private final S3 f16179j;

    private final D2 f16180k;

    private C2173x3(int[] iArr, Object[] objArr, int i7, int i8, InterfaceC2155u3 interfaceC2155u3, boolean z7, int[] iArr2, int i9, int i10, C2185z3 c2185z3, C2072g3 c2072g3, S3 s32, D2 d22, C2126p3 c2126p3) {
        this.f16170a = iArr;
        this.f16171b = objArr;
        this.f16172c = i7;
        this.f16173d = i8;
        boolean z8 = false;
        if (d22 != null && (interfaceC2155u3 instanceof O2)) {
            z8 = true;
        }
        this.f16175f = z8;
        this.f16176g = iArr2;
        this.f16177h = i9;
        this.f16178i = i10;
        this.f16179j = s32;
        this.f16180k = d22;
        this.f16174e = interfaceC2155u3;
    }

    static com.google.android.gms.internal.play_billing.C2173x3 A(java.lang.Class r34, com.google.android.gms.internal.play_billing.InterfaceC2137r3 r35, com.google.android.gms.internal.play_billing.C2185z3 r36, com.google.android.gms.internal.play_billing.C2072g3 r37, com.google.android.gms.internal.play_billing.S3 r38, com.google.android.gms.internal.play_billing.D2 r39, com.google.android.gms.internal.play_billing.C2126p3 r40) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2173x3.A(java.lang.Class, com.google.android.gms.internal.play_billing.r3, com.google.android.gms.internal.play_billing.z3, com.google.android.gms.internal.play_billing.g3, com.google.android.gms.internal.play_billing.S3, com.google.android.gms.internal.play_billing.D2, com.google.android.gms.internal.play_billing.p3):com.google.android.gms.internal.play_billing.x3");
    }

    private static double B(Object obj, long j7) {
        return ((Double) Z3.k(obj, j7)).doubleValue();
    }

    private static float C(Object obj, long j7) {
        return ((Float) Z3.k(obj, j7)).floatValue();
    }

    private static int D(Object obj, long j7) {
        return ((Integer) Z3.k(obj, j7)).intValue();
    }

    private final int E(int i7) {
        return this.f16170a[i7 + 2];
    }

    private final int F(int i7, int i8) {
        int length = (this.f16170a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f16170a[i10];
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

    private static int G(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int H(int i7) {
        return this.f16170a[i7 + 1];
    }

    private static long I(Object obj, long j7) {
        return ((Long) Z3.k(obj, j7)).longValue();
    }

    private final T2 J(int i7) {
        int i8 = i7 / 3;
        return (T2) this.f16171b[i8 + i8 + 1];
    }

    private final F3 K(int i7) {
        Object[] objArr = this.f16171b;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        F3 f32 = (F3) objArr[i9];
        if (f32 != null) {
            return f32;
        }
        F3 f3B = C3.a().b((Class) objArr[i9 + 1]);
        this.f16171b[i9] = f3B;
        return f3B;
    }

    private final Object L(int i7) {
        int i8 = i7 / 3;
        return this.f16171b[i8 + i8];
    }

    private final Object M(Object obj, int i7) {
        F3 f3K = K(i7);
        int iH = H(i7) & 1048575;
        if (!r(obj, i7)) {
            return f3K.b();
        }
        Object object = f16169m.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objB = f3K.b();
        if (object != null) {
            f3K.e(objB, object);
        }
        return objB;
    }

    private final Object N(Object obj, int i7, int i8) {
        F3 f3K = K(i8);
        if (!v(obj, i7, i8)) {
            return f3K.b();
        }
        Object object = f16169m.getObject(obj, H(i8) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objB = f3K.b();
        if (object != null) {
            f3K.e(objB, object);
        }
        return objB;
    }

    private static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void j(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void k(Object obj, Object obj2, int i7) {
        if (r(obj2, i7)) {
            int iH = H(i7) & 1048575;
            Unsafe unsafe = f16169m;
            long j7 = iH;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f16170a[i7] + " is present but null: " + obj2.toString());
            }
            F3 f3K = K(i7);
            if (!r(obj, i7)) {
                if (u(object)) {
                    Object objB = f3K.b();
                    f3K.e(objB, object);
                    unsafe.putObject(obj, j7, objB);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                m(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!u(object2)) {
                Object objB2 = f3K.b();
                f3K.e(objB2, object2);
                unsafe.putObject(obj, j7, objB2);
                object2 = objB2;
            }
            f3K.e(object2, object);
        }
    }

    private final void l(Object obj, Object obj2, int i7) {
        int i8 = this.f16170a[i7];
        if (v(obj2, i8, i7)) {
            int iH = H(i7) & 1048575;
            Unsafe unsafe = f16169m;
            long j7 = iH;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f16170a[i7] + " is present but null: " + obj2.toString());
            }
            F3 f3K = K(i7);
            if (!v(obj, i8, i7)) {
                if (u(object)) {
                    Object objB = f3K.b();
                    f3K.e(objB, object);
                    unsafe.putObject(obj, j7, objB);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                n(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!u(object2)) {
                Object objB2 = f3K.b();
                f3K.e(objB2, object2);
                unsafe.putObject(obj, j7, objB2);
                object2 = objB2;
            }
            f3K.e(object2, object);
        }
    }

    private final void m(Object obj, int i7) {
        int iE = E(i7);
        long j7 = 1048575 & iE;
        if (j7 == 1048575) {
            return;
        }
        Z3.v(obj, j7, (1 << (iE >>> 20)) | Z3.h(obj, j7));
    }

    private final void n(Object obj, int i7, int i8) {
        Z3.v(obj, E(i8) & 1048575, i7);
    }

    private final void o(Object obj, int i7, Object obj2) {
        f16169m.putObject(obj, H(i7) & 1048575, obj2);
        m(obj, i7);
    }

    private final void p(Object obj, int i7, int i8, Object obj2) {
        f16169m.putObject(obj, H(i8) & 1048575, obj2);
        n(obj, i7, i8);
    }

    private final boolean q(Object obj, Object obj2, int i7) {
        return r(obj, i7) == r(obj2, i7);
    }

    private final boolean r(Object obj, int i7) {
        int iE = E(i7);
        long j7 = iE & 1048575;
        if (j7 != 1048575) {
            return (Z3.h(obj, j7) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i7);
        long j8 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(Z3.f(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(Z3.g(obj, j8)) != 0;
            case 2:
                return Z3.i(obj, j8) != 0;
            case 3:
                return Z3.i(obj, j8) != 0;
            case 4:
                return Z3.h(obj, j8) != 0;
            case 5:
                return Z3.i(obj, j8) != 0;
            case 6:
                return Z3.h(obj, j8) != 0;
            case 7:
                return Z3.B(obj, j8);
            case 8:
                Object objK = Z3.k(obj, j8);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof AbstractC2131q2) {
                    return !AbstractC2131q2.f16138e.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return Z3.k(obj, j8) != null;
            case 10:
                return !AbstractC2131q2.f16138e.equals(Z3.k(obj, j8));
            case 11:
                return Z3.h(obj, j8) != 0;
            case 12:
                return Z3.h(obj, j8) != 0;
            case 13:
                return Z3.h(obj, j8) != 0;
            case 14:
                return Z3.i(obj, j8) != 0;
            case 15:
                return Z3.h(obj, j8) != 0;
            case 16:
                return Z3.i(obj, j8) != 0;
            case 17:
                return Z3.k(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? r(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean t(Object obj, int i7, F3 f32) {
        return f32.g(Z3.k(obj, i7 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof R2) {
            return ((R2) obj).i();
        }
        return true;
    }

    private final boolean v(Object obj, int i7, int i8) {
        return Z3.h(obj, (long) (E(i8) & 1048575)) == i7;
    }

    private static boolean w(Object obj, long j7) {
        return ((Boolean) Z3.k(obj, j7)).booleanValue();
    }

    private static final void x(int i7, Object obj, InterfaceC2067f4 interfaceC2067f4) throws IOException {
        if (obj instanceof String) {
            interfaceC2067f4.d(i7, (String) obj);
        } else {
            interfaceC2067f4.I(i7, (AbstractC2131q2) obj);
        }
    }

    static T3 z(Object obj) {
        R2 r22 = (R2) obj;
        T3 t32 = r22.zzc;
        if (t32 != T3.c()) {
            return t32;
        }
        T3 t3F = T3.f();
        r22.zzc = t3F;
        return t3F;
    }

    @Override
    public final int a(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2173x3.a(java.lang.Object):int");
    }

    @Override
    public final Object b() {
        return ((R2) this.f16174e).r();
    }

    @Override
    public final int c(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i8;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16170a.length; i10 += 3) {
            int iH = H(i10);
            int[] iArr = this.f16170a;
            int i11 = 1048575 & iH;
            int iG = G(iH);
            int i12 = iArr[i10];
            long j7 = i11;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(Z3.f(obj, j7));
                    byte[] bArr = W2.f15951b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iFloatToIntBits = Float.floatToIntBits(Z3.g(obj, j7));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 2:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Z3.i(obj, j7);
                    byte[] bArr2 = W2.f15951b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 3:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Z3.i(obj, j7);
                    byte[] bArr3 = W2.f15951b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 4:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.h(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 5:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Z3.i(obj, j7);
                    byte[] bArr4 = W2.f15951b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 6:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.h(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 7:
                    i7 = i9 * 53;
                    iFloatToIntBits = W2.a(Z3.B(obj, j7));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iFloatToIntBits = ((String) Z3.k(obj, j7)).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 9:
                    i8 = i9 * 53;
                    Object objK = Z3.k(obj, j7);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i9 = i8 + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.k(obj, j7).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 11:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.h(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 12:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.h(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 13:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.h(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 14:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Z3.i(obj, j7);
                    byte[] bArr5 = W2.f15951b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 15:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.h(obj, j7);
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 16:
                    i7 = i9 * 53;
                    jDoubleToLongBits = Z3.i(obj, j7);
                    byte[] bArr6 = W2.f15951b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 17:
                    i8 = i9 * 53;
                    Object objK2 = Z3.k(obj, j7);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i9 = i8 + iHashCode;
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
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.k(obj, j7).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iFloatToIntBits = Z3.k(obj, j7).hashCode();
                    i9 = i7 + iFloatToIntBits;
                    break;
                case 51:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(B(obj, j7));
                        byte[] bArr7 = W2.f15951b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = Float.floatToIntBits(C(obj, j7));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = I(obj, j7);
                        byte[] bArr8 = W2.f15951b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = I(obj, j7);
                        byte[] bArr9 = W2.f15951b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = D(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = I(obj, j7);
                        byte[] bArr10 = W2.f15951b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = D(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = W2.a(w(obj, j7));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = ((String) Z3.k(obj, j7)).hashCode();
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = Z3.k(obj, j7).hashCode();
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = Z3.k(obj, j7).hashCode();
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = D(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = D(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = D(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = I(obj, j7);
                        byte[] bArr11 = W2.f15951b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = D(obj, j7);
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        jDoubleToLongBits = I(obj, j7);
                        byte[] bArr12 = W2.f15951b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        iFloatToIntBits = Z3.k(obj, j7).hashCode();
                        i9 = i7 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i9 * 53) + ((R2) obj).zzc.hashCode();
        return this.f16175f ? (iHashCode2 * 53) + ((O2) obj).zzb.f15820a.hashCode() : iHashCode2;
    }

    @Override
    public final void d(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2173x3.d(java.lang.Object):void");
    }

    @Override
    public final void e(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f16170a.length; i7 += 3) {
            int iH = H(i7);
            int i8 = 1048575 & iH;
            int[] iArr = this.f16170a;
            int iG = G(iH);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (iG) {
                case 0:
                    if (r(obj2, i7)) {
                        Z3.t(obj, j7, Z3.f(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(obj2, i7)) {
                        Z3.u(obj, j7, Z3.g(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(obj2, i7)) {
                        Z3.w(obj, j7, Z3.i(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(obj2, i7)) {
                        Z3.w(obj, j7, Z3.i(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(obj2, i7)) {
                        Z3.v(obj, j7, Z3.h(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(obj2, i7)) {
                        Z3.w(obj, j7, Z3.i(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(obj2, i7)) {
                        Z3.v(obj, j7, Z3.h(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(obj2, i7)) {
                        Z3.r(obj, j7, Z3.B(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(obj2, i7)) {
                        Z3.x(obj, j7, Z3.k(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    k(obj, obj2, i7);
                    break;
                case 10:
                    if (r(obj2, i7)) {
                        Z3.x(obj, j7, Z3.k(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(obj2, i7)) {
                        Z3.v(obj, j7, Z3.h(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(obj2, i7)) {
                        Z3.v(obj, j7, Z3.h(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(obj2, i7)) {
                        Z3.v(obj, j7, Z3.h(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(obj2, i7)) {
                        Z3.w(obj, j7, Z3.i(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(obj2, i7)) {
                        Z3.v(obj, j7, Z3.h(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(obj2, i7)) {
                        Z3.w(obj, j7, Z3.i(obj2, j7));
                        m(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    k(obj, obj2, i7);
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
                    V2 v2H = (V2) Z3.k(obj, j7);
                    V2 v22 = (V2) Z3.k(obj2, j7);
                    int size = v2H.size();
                    int size2 = v22.size();
                    if (size > 0 && size2 > 0) {
                        if (!v2H.a()) {
                            v2H = v2H.h(size2 + size);
                        }
                        v2H.addAll(v22);
                    }
                    if (size > 0) {
                        v22 = v2H;
                    }
                    Z3.x(obj, j7, v22);
                    break;
                case 50:
                    int i10 = H3.f15816b;
                    Z3.x(obj, j7, C2126p3.a(Z3.k(obj, j7), Z3.k(obj2, j7)));
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
                    if (v(obj2, i9, i7)) {
                        Z3.x(obj, j7, Z3.k(obj2, j7));
                        n(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    l(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(obj2, i9, i7)) {
                        Z3.x(obj, j7, Z3.k(obj2, j7));
                        n(obj, i9, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    l(obj, obj2, i7);
                    break;
            }
        }
        H3.u(this.f16179j, obj, obj2);
        if (this.f16175f) {
            H3.t(this.f16180k, obj, obj2);
        }
    }

    @Override
    public final void f(Object obj, byte[] bArr, int i7, int i8, C2059e2 c2059e2) throws IOException {
        y(obj, bArr, i7, i8, 0, c2059e2);
    }

    @Override
    public final boolean g(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2173x3.g(java.lang.Object):boolean");
    }

    @Override
    public final void h(java.lang.Object r21, com.google.android.gms.internal.play_billing.InterfaceC2067f4 r22) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2173x3.h(java.lang.Object, com.google.android.gms.internal.play_billing.f4):void");
    }

    @Override
    public final boolean i(Object obj, Object obj2) {
        boolean zE;
        for (int i7 = 0; i7 < this.f16170a.length; i7 += 3) {
            int iH = H(i7);
            long j7 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i7) || Double.doubleToLongBits(Z3.f(obj, j7)) != Double.doubleToLongBits(Z3.f(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!q(obj, obj2, i7) || Float.floatToIntBits(Z3.g(obj, j7)) != Float.floatToIntBits(Z3.g(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!q(obj, obj2, i7) || Z3.i(obj, j7) != Z3.i(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!q(obj, obj2, i7) || Z3.i(obj, j7) != Z3.i(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!q(obj, obj2, i7) || Z3.h(obj, j7) != Z3.h(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!q(obj, obj2, i7) || Z3.i(obj, j7) != Z3.i(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!q(obj, obj2, i7) || Z3.h(obj, j7) != Z3.h(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!q(obj, obj2, i7) || Z3.B(obj, j7) != Z3.B(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!q(obj, obj2, i7) || !H3.e(Z3.k(obj, j7), Z3.k(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!q(obj, obj2, i7) || !H3.e(Z3.k(obj, j7), Z3.k(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!q(obj, obj2, i7) || !H3.e(Z3.k(obj, j7), Z3.k(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!q(obj, obj2, i7) || Z3.h(obj, j7) != Z3.h(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!q(obj, obj2, i7) || Z3.h(obj, j7) != Z3.h(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!q(obj, obj2, i7) || Z3.h(obj, j7) != Z3.h(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!q(obj, obj2, i7) || Z3.i(obj, j7) != Z3.i(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!q(obj, obj2, i7) || Z3.h(obj, j7) != Z3.h(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!q(obj, obj2, i7) || Z3.i(obj, j7) != Z3.i(obj2, j7)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!q(obj, obj2, i7) || !H3.e(Z3.k(obj, j7), Z3.k(obj2, j7))) {
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
                    zE = H3.e(Z3.k(obj, j7), Z3.k(obj2, j7));
                    break;
                case 50:
                    zE = H3.e(Z3.k(obj, j7), Z3.k(obj2, j7));
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
                    long jE = E(i7) & 1048575;
                    if (Z3.h(obj, jE) != Z3.h(obj2, jE) || !H3.e(Z3.k(obj, j7), Z3.k(obj2, j7))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zE) {
                return false;
            }
        }
        if (!((R2) obj).zzc.equals(((R2) obj2).zzc)) {
            return false;
        }
        if (this.f16175f) {
            return ((O2) obj).zzb.equals(((O2) obj2).zzb);
        }
        return true;
    }

    final int y(java.lang.Object r46, byte[] r47, int r48, int r49, int r50, com.google.android.gms.internal.play_billing.C2059e2 r51) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2173x3.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.e2):int");
    }
}
