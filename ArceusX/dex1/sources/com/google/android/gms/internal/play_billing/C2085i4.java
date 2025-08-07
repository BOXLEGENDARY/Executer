package com.google.android.gms.internal.play_billing;

public final class C2085i4 extends R2 implements InterfaceC2161v3 {
    private static final C2085i4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C2144s4 zzh;

    static {
        C2085i4 c2085i4 = new C2085i4();
        zzb = c2085i4;
        R2.z(C2085i4.class, c2085i4);
    }

    private C2085i4() {
    }

    public static C2085i4 D(byte[] bArr, C2 c2) throws Y2 {
        return (C2085i4) R2.s(zzb, bArr, c2);
    }

    static void E(C2085i4 c2085i4, C2144s4 c2144s4) {
        c2144s4.getClass();
        c2085i4.zzh = c2144s4;
        c2085i4.zzd |= 2;
    }

    static void G(C2085i4 c2085i4, M4 m42) {
        m42.getClass();
        c2085i4.zzf = m42;
        c2085i4.zze = 4;
    }

    static void H(C2085i4 c2085i4, int i7) {
        c2085i4.zzg = i7 - 1;
        c2085i4.zzd |= 1;
    }

    public static C2073g4 I() {
        return (C2073g4) zzb.o();
    }

    @Override
    protected final Object m(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return R2.w(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C2097k4.f16081a, "zzh", M4.class});
        }
        if (i8 == 3) {
            return new C2085i4();
        }
        C2079h4 c2079h4 = null;
        if (i8 == 4) {
            return new C2073g4(c2079h4);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
