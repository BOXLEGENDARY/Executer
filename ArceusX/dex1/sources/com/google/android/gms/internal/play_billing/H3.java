package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

final class H3 {

    private static final S3 f15815a;

    public static final int f15816b = 0;

    static {
        int i7 = C3.f15781d;
        f15815a = new U3();
    }

    public static void A(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.D(i7, list, z7);
    }

    public static void B(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.n(i7, list, z7);
    }

    public static void C(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.y(i7, list, z7);
    }

    public static void D(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.f(i7, list, z7);
    }

    public static void E(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.m(i7, list, z7);
    }

    public static void a(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.s(i7, list, z7);
    }

    public static void b(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.B(i7, list, z7);
    }

    public static void c(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.k(i7, list, z7);
    }

    public static void d(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.v(i7, list, z7);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(s22.e(i7));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iA;
    }

    static int g(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2172x2.B(i7 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2172x2.B(i7 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(s22.e(i7));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iA;
    }

    static int l(List list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2090j3) {
            C2090j3 c2090j3 = (C2090j3) list;
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(c2090j3.e(i7));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iA;
    }

    static int m(int i7, Object obj, F3 f32) {
        int i8 = i7 << 3;
        if (!(obj instanceof C2060e3)) {
            return AbstractC2172x2.B(i8) + AbstractC2172x2.z((InterfaceC2155u3) obj, f32);
        }
        int iB = AbstractC2172x2.B(i8);
        int iA = ((C2060e3) obj).a();
        return iB + AbstractC2172x2.B(iA) + iA;
    }

    static int n(List list) {
        int iB;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            iB = 0;
            while (i7 < size) {
                int iE = s22.e(i7);
                iB += AbstractC2172x2.B((iE >> 31) ^ (iE + iE));
                i7++;
            }
        } else {
            iB = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iB += AbstractC2172x2.B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
        }
        return iB;
    }

    static int o(List list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2090j3) {
            C2090j3 c2090j3 = (C2090j3) list;
            iA = 0;
            while (i7 < size) {
                long jE = c2090j3.e(i7);
                iA += AbstractC2172x2.a((jE >> 63) ^ (jE + jE));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iA += AbstractC2172x2.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
        }
        return iA;
    }

    static int p(List list) {
        int iB;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            iB = 0;
            while (i7 < size) {
                iB += AbstractC2172x2.B(s22.e(i7));
                i7++;
            }
        } else {
            iB = 0;
            while (i7 < size) {
                iB += AbstractC2172x2.B(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iB;
    }

    static int q(List list) {
        int iA;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2090j3) {
            C2090j3 c2090j3 = (C2090j3) list;
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(c2090j3.e(i7));
                i7++;
            }
        } else {
            iA = 0;
            while (i7 < size) {
                iA += AbstractC2172x2.a(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iA;
    }

    public static S3 r() {
        return f15815a;
    }

    static Object s(Object obj, int i7, int i8, Object obj2, S3 s32) {
        Object obj3 = obj2;
        if (obj2 == null) {
            R2 r22 = (R2) obj;
            T3 t32 = r22.zzc;
            obj3 = t32;
            if (t32 == T3.c()) {
                T3 t3F = T3.f();
                r22.zzc = t3F;
                obj3 = t3F;
            }
        }
        ((T3) obj3).j(i7 << 3, Long.valueOf(i8));
        return obj3;
    }

    static void t(D2 d22, Object obj, Object obj2) {
        if (((O2) obj2).zzb.f15820a.isEmpty()) {
            return;
        }
        throw null;
    }

    static void u(S3 s32, Object obj, Object obj2) {
        R2 r22 = (R2) obj;
        T3 t3E = r22.zzc;
        T3 t32 = ((R2) obj2).zzc;
        if (!T3.c().equals(t32)) {
            if (T3.c().equals(t3E)) {
                t3E = T3.e(t3E, t32);
            } else {
                t3E.d(t32);
            }
        }
        r22.zzc = t3E;
    }

    public static void v(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.j(i7, list, z7);
    }

    public static void w(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.C(i7, list, z7);
    }

    public static void x(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.q(i7, list, z7);
    }

    public static void y(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.l(i7, list, z7);
    }

    public static void z(int i7, List list, InterfaceC2067f4 interfaceC2067f4, boolean z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2067f4.w(i7, list, z7);
    }
}
