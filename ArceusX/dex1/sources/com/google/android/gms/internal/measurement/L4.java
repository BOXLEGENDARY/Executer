package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class L4 {

    private static final Class<?> f14823a;

    private static final Y4<?, ?> f14824b;

    private static final Y4<?, ?> f14825c;

    private static final Y4<?, ?> f14826d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f14823a = cls;
        f14824b = C(false);
        f14825c = C(true);
        f14826d = new C1831a5();
    }

    static int A(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (B3.a(i7 << 3) + 1);
    }

    public static void B(int i7, List<Long> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.k(i7, list, z7);
    }

    private static Y4<?, ?> C(boolean z7) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (Y4) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List<?> list) {
        return list.size();
    }

    static int E(int i7, List<AbstractC1980t3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = size * B3.D(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            iD += B3.x(list.get(i8));
        }
        return iD;
    }

    static int F(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * B3.D(i7));
    }

    static int G(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U3) {
            U3 u32 = (U3) list;
            iZ = 0;
            while (i7 < size) {
                iZ += B3.z(u32.e(i7));
                i7++;
            }
        } else {
            iZ = 0;
            while (i7 < size) {
                iZ += B3.z(list.get(i7).intValue());
                i7++;
            }
        }
        return iZ;
    }

    static int H(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (B3.a(i7 << 3) + 4);
    }

    static int I(List<?> list) {
        return list.size() * 4;
    }

    static int J(int i7, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (B3.a(i7 << 3) + 8);
    }

    static int K(List<?> list) {
        return list.size() * 8;
    }

    static int L(int i7, List<InterfaceC2021y4> list, J4 j42) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iY += B3.y(i7, list.get(i8), j42);
        }
        return iY;
    }

    static int M(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * B3.D(i7));
    }

    static int N(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U3) {
            U3 u32 = (U3) list;
            iZ = 0;
            while (i7 < size) {
                iZ += B3.z(u32.e(i7));
                i7++;
            }
        } else {
            iZ = 0;
            while (i7 < size) {
                iZ += B3.z(list.get(i7).intValue());
                i7++;
            }
        }
        return iZ;
    }

    static int O(int i7, List<Long> list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * B3.D(i7));
    }

    static int P(List<Long> list) {
        int iB;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1926m4) {
            C1926m4 c1926m4 = (C1926m4) list;
            iB = 0;
            while (i7 < size) {
                iB += B3.b(c1926m4.y(i7));
                i7++;
            }
        } else {
            iB = 0;
            while (i7 < size) {
                iB += B3.b(list.get(i7).longValue());
                i7++;
            }
        }
        return iB;
    }

    static int Q(int i7, Object obj, J4 j42) {
        if (!(obj instanceof C1870f4)) {
            return B3.a(i7 << 3) + B3.B((InterfaceC2021y4) obj, j42);
        }
        int iA = B3.a(i7 << 3);
        int iA2 = ((C1870f4) obj).a();
        return iA + B3.a(iA2) + iA2;
    }

    static int R(int i7, List<?> list, J4 j42) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = B3.D(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            iD += obj instanceof C1870f4 ? B3.A((C1870f4) obj) : B3.B((InterfaceC2021y4) obj, j42);
        }
        return iD;
    }

    static int S(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * B3.D(i7));
    }

    static int T(List<Integer> list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U3) {
            U3 u32 = (U3) list;
            iA = 0;
            while (i7 < size) {
                int iE = u32.e(i7);
                iA += B3.a((iE >> 31) ^ (iE + iE));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                int iIntValue = list.get(i7).intValue();
                iA += B3.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
        }
        return iA;
    }

    static int U(int i7, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * B3.D(i7));
    }

    static int V(List<Long> list) {
        int iB;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1926m4) {
            C1926m4 c1926m4 = (C1926m4) list;
            iB = 0;
            while (i7 < size) {
                long jY = c1926m4.y(i7);
                iB += B3.b((jY >> 63) ^ (jY + jY));
                i7++;
            }
        } else {
            iB = 0;
            while (i7 < size) {
                long jLongValue = list.get(i7).longValue();
                iB += B3.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
        }
        return iB;
    }

    static int W(int i7, List<?> list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iD = B3.D(i7) * size;
        if (list instanceof InterfaceC1886h4) {
            InterfaceC1886h4 interfaceC1886h4 = (InterfaceC1886h4) list;
            while (i8 < size) {
                Object objC = interfaceC1886h4.c(i8);
                iD += objC instanceof AbstractC1980t3 ? B3.x((AbstractC1980t3) objC) : B3.C((String) objC);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                iD += obj instanceof AbstractC1980t3 ? B3.x((AbstractC1980t3) obj) : B3.C((String) obj);
                i8++;
            }
        }
        return iD;
    }

    static int X(int i7, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * B3.D(i7));
    }

    static int Y(List<Integer> list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U3) {
            U3 u32 = (U3) list;
            iA = 0;
            while (i7 < size) {
                iA += B3.a(u32.e(i7));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                iA += B3.a(list.get(i7).intValue());
                i7++;
            }
        }
        return iA;
    }

    static int Z(int i7, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * B3.D(i7));
    }

    public static Y4<?, ?> a() {
        return f14825c;
    }

    static int a0(List<Long> list) {
        int iB;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1926m4) {
            C1926m4 c1926m4 = (C1926m4) list;
            iB = 0;
            while (i7 < size) {
                iB += B3.b(c1926m4.y(i7));
                i7++;
            }
        } else {
            iB = 0;
            while (i7 < size) {
                iB += B3.b(list.get(i7).longValue());
                i7++;
            }
        }
        return iB;
    }

    public static Y4<?, ?> b() {
        return f14826d;
    }

    public static Y4<?, ?> b0() {
        return f14824b;
    }

    static <UT, UB> UB c(int i7, List<Integer> list, X3 x32, UB ub, Y4<UT, UB> y42) {
        if (x32 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = list.get(i9);
                int iIntValue = num.intValue();
                if (x32.y(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    ub = (UB) d(i7, iIntValue, ub, y42);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!x32.y(iIntValue2)) {
                    ub = (UB) d(i7, iIntValue2, ub, y42);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB d(int i7, int i8, UB ub, Y4<UT, UB> y42) {
        if (ub == null) {
            ub = y42.e();
        }
        y42.f(ub, i7, i8);
        return ub;
    }

    static <T, FT extends K3<FT>> void e(H3<FT> h32, T t7, T t8) {
        h32.a(t8);
        throw null;
    }

    static <T, UT, UB> void f(Y4<UT, UB> y42, T t7, T t8) {
        y42.h(t7, y42.d(y42.c(t7), y42.c(t8)));
    }

    public static void g(Class<?> cls) {
        Class<?> cls2;
        if (!T3.class.isAssignableFrom(cls) && (cls2 = f14823a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void i(C1973s4 c1973s4, T t7, T t8, long j7) {
        C1895i5.x(t7, j7, C1973s4.b(C1895i5.k(t7, j7), C1895i5.k(t8, j7)));
    }

    public static void j(int i7, List<Boolean> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.n(i7, list, z7);
    }

    public static void k(int i7, List<AbstractC1980t3> list, C3 c3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.p(i7, list);
    }

    public static void l(int i7, List<Double> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.r(i7, list, z7);
    }

    public static void m(int i7, List<Integer> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.u(i7, list, z7);
    }

    public static void n(int i7, List<Integer> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.w(i7, list, z7);
    }

    public static void o(int i7, List<Long> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.y(i7, list, z7);
    }

    public static void p(int i7, List<Float> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.A(i7, list, z7);
    }

    public static void q(int i7, List<?> list, C3 c3, J4 j42) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            c3.B(i7, list.get(i8), j42);
        }
    }

    public static void r(int i7, List<Integer> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.D(i7, list, z7);
    }

    public static void s(int i7, List<Long> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.F(i7, list, z7);
    }

    public static void t(int i7, List<?> list, C3 c3, J4 j42) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            c3.G(i7, list.get(i8), j42);
        }
    }

    public static void u(int i7, List<Integer> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.I(i7, list, z7);
    }

    public static void v(int i7, List<Long> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.K(i7, list, z7);
    }

    public static void w(int i7, List<Integer> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.b(i7, list, z7);
    }

    public static void x(int i7, List<Long> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.d(i7, list, z7);
    }

    public static void y(int i7, List<String> list, C3 c3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.g(i7, list);
    }

    public static void z(int i7, List<Integer> list, C3 c3, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3.i(i7, list, z7);
    }
}
