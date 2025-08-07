package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

public final class R1 extends T3<R1, Q1> implements InterfaceC2029z4 {
    public static final int zza = 0;
    private static final R1 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private V1 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private N1 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private InterfaceC1830a4<H1> zzi = T3.k();
    private InterfaceC1830a4<C1836b2> zzj = T3.k();
    private String zzp = BuildConfig.FLAVOR;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;
    private String zzs = BuildConfig.FLAVOR;
    private String zzu = BuildConfig.FLAVOR;
    private String zzv = BuildConfig.FLAVOR;
    private String zzw = BuildConfig.FLAVOR;
    private String zzz = BuildConfig.FLAVOR;
    private String zzB = BuildConfig.FLAVOR;
    private String zzE = BuildConfig.FLAVOR;
    private String zzF = BuildConfig.FLAVOR;
    private InterfaceC1830a4<D1> zzH = T3.k();
    private String zzI = BuildConfig.FLAVOR;
    private String zzM = BuildConfig.FLAVOR;
    private String zzP = BuildConfig.FLAVOR;
    private String zzQ = BuildConfig.FLAVOR;
    private String zzS = BuildConfig.FLAVOR;
    private Y3 zzU = T3.s();
    private String zzX = BuildConfig.FLAVOR;
    private String zzY = BuildConfig.FLAVOR;
    private String zzab = BuildConfig.FLAVOR;

    static {
        R1 r1 = new R1();
        zze = r1;
        T3.o(R1.class, r1);
    }

    private R1() {
    }

    static void B0(R1 r1, String str) {
        str.getClass();
        r1.zzg |= 64;
        r1.zzX = str;
    }

    static void C0(R1 r1, String str) {
        r1.zzg |= 128;
        r1.zzY = str;
    }

    static void D0(R1 r1, Iterable iterable) {
        r1.c1();
        AbstractC1853d3.h(iterable, r1.zzi);
    }

    static void F0(R1 r1, int i7) {
        r1.c1();
        r1.zzi.remove(i7);
    }

    static void G0(R1 r1, int i7, C1836b2 c1836b2) {
        c1836b2.getClass();
        r1.d1();
        r1.zzj.set(i7, c1836b2);
    }

    static void H0(R1 r1, C1836b2 c1836b2) {
        c1836b2.getClass();
        r1.d1();
        r1.zzj.add(c1836b2);
    }

    static void I0(R1 r1, Iterable iterable) {
        r1.d1();
        AbstractC1853d3.h(iterable, r1.zzj);
    }

    static void J0(R1 r1, int i7) {
        r1.d1();
        r1.zzj.remove(i7);
    }

    public static Q1 J1() {
        return zze.p();
    }

    static void K0(R1 r1, long j7) {
        r1.zzf |= 2;
        r1.zzk = j7;
    }

    static void L0(R1 r1, long j7) {
        r1.zzf |= 4;
        r1.zzl = j7;
    }

    static void M0(R1 r1, long j7) {
        r1.zzf |= 8;
        r1.zzm = j7;
    }

    static void N0(R1 r1, long j7) {
        r1.zzf |= 16;
        r1.zzn = j7;
    }

    static void O0(R1 r1) {
        r1.zzf &= -17;
        r1.zzn = 0L;
    }

    static void P(R1 r1, long j7) {
        r1.zzf |= 1073741824;
        r1.zzO = j7;
    }

    static void P0(R1 r1, long j7) {
        r1.zzf |= 32;
        r1.zzo = j7;
    }

    static void Q(R1 r1) {
        r1.zzf &= Integer.MAX_VALUE;
        r1.zzP = zze.zzP;
    }

    static void Q0(R1 r1) {
        r1.zzf &= -33;
        r1.zzo = 0L;
    }

    static void R(R1 r1, int i7) {
        r1.zzg |= 2;
        r1.zzR = i7;
    }

    static void R0(R1 r1, String str) {
        r1.zzf |= 64;
        r1.zzp = "android";
    }

    static void S(R1 r1, int i7, H1 h12) {
        h12.getClass();
        r1.c1();
        r1.zzi.set(i7, h12);
    }

    static void S0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 128;
        r1.zzq = str;
    }

    static void T(R1 r1, String str) {
        str.getClass();
        r1.zzg |= 4;
        r1.zzS = str;
    }

    static void T0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 256;
        r1.zzr = str;
    }

    static void U0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 512;
        r1.zzs = str;
    }

    static void V(R1 r1, V1 v1) {
        v1.getClass();
        r1.zzT = v1;
        r1.zzg |= 8;
    }

    static void V0(R1 r1, int i7) {
        r1.zzf |= 1024;
        r1.zzt = i7;
    }

    static void W(R1 r1, Iterable iterable) {
        Y3 y32 = r1.zzU;
        if (!y32.a()) {
            int size = y32.size();
            r1.zzU = y32.h(size == 0 ? 10 : size + size);
        }
        AbstractC1853d3.h(iterable, r1.zzU);
    }

    static void W0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 2048;
        r1.zzu = str;
    }

    static void X(R1 r1, H1 h12) {
        h12.getClass();
        r1.c1();
        r1.zzi.add(h12);
    }

    static void X0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 4096;
        r1.zzv = str;
    }

    static void Y(R1 r1, long j7) {
        r1.zzg |= 16;
        r1.zzV = j7;
    }

    static void Y0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 8192;
        r1.zzw = str;
    }

    static void Z(R1 r1, long j7) {
        r1.zzg |= 32;
        r1.zzW = j7;
    }

    static void Z0(R1 r1, long j7) {
        r1.zzf |= 16384;
        r1.zzx = j7;
    }

    static void a1(R1 r1, long j7) {
        r1.zzf |= 32768;
        r1.zzy = 46000L;
    }

    static void b0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 65536;
        r1.zzz = str;
    }

    static void c0(R1 r1) {
        r1.zzf &= -65537;
        r1.zzz = zze.zzz;
    }

    private final void c1() {
        InterfaceC1830a4<H1> interfaceC1830a4 = this.zzi;
        if (interfaceC1830a4.a()) {
            return;
        }
        this.zzi = T3.l(interfaceC1830a4);
    }

    static void d0(R1 r1, boolean z7) {
        r1.zzf |= 131072;
        r1.zzA = z7;
    }

    private final void d1() {
        InterfaceC1830a4<C1836b2> interfaceC1830a4 = this.zzj;
        if (interfaceC1830a4.a()) {
            return;
        }
        this.zzj = T3.l(interfaceC1830a4);
    }

    static void e0(R1 r1) {
        r1.zzf &= -131073;
        r1.zzA = false;
    }

    static void f0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 262144;
        r1.zzB = str;
    }

    static void g0(R1 r1) {
        r1.zzf &= -262145;
        r1.zzB = zze.zzB;
    }

    static void h0(R1 r1, long j7) {
        r1.zzf |= 524288;
        r1.zzC = j7;
    }

    static void i0(R1 r1, int i7) {
        r1.zzf |= 1048576;
        r1.zzD = i7;
    }

    static void j0(R1 r1, String str) {
        r1.zzf |= 2097152;
        r1.zzE = str;
    }

    static void k0(R1 r1) {
        r1.zzf &= -2097153;
        r1.zzE = zze.zzE;
    }

    static void l0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 4194304;
        r1.zzF = str;
    }

    static void m0(R1 r1, boolean z7) {
        r1.zzf |= 8388608;
        r1.zzG = z7;
    }

    static void n0(R1 r1, Iterable iterable) {
        InterfaceC1830a4<D1> interfaceC1830a4 = r1.zzH;
        if (!interfaceC1830a4.a()) {
            r1.zzH = T3.l(interfaceC1830a4);
        }
        AbstractC1853d3.h(iterable, r1.zzH);
    }

    static void p0(R1 r1, String str) {
        str.getClass();
        r1.zzf |= 16777216;
        r1.zzI = str;
    }

    static void q0(R1 r1, int i7) {
        r1.zzf |= 33554432;
        r1.zzJ = i7;
    }

    static void r0(R1 r1, int i7) {
        r1.zzf |= 1;
        r1.zzh = 1;
    }

    static void s0(R1 r1) {
        r1.zzf &= -268435457;
        r1.zzM = zze.zzM;
    }

    static void t0(R1 r1, long j7) {
        r1.zzf |= 536870912;
        r1.zzN = j7;
    }

    public final boolean A0() {
        return (this.zzg & 128) != 0;
    }

    public final long A1() {
        return this.zzV;
    }

    public final String B() {
        return this.zzP;
    }

    public final long B1() {
        return this.zzm;
    }

    public final String C() {
        return this.zzI;
    }

    public final long C1() {
        return this.zzx;
    }

    public final String D() {
        return this.zzX;
    }

    public final long D1() {
        return this.zzo;
    }

    public final String E() {
        return this.zzF;
    }

    public final long E1() {
        return this.zzn;
    }

    public final String F() {
        return this.zzE;
    }

    public final long F1() {
        return this.zzl;
    }

    public final String G() {
        return this.zzq;
    }

    public final long G1() {
        return this.zzk;
    }

    public final String H() {
        return this.zzp;
    }

    public final long H1() {
        return this.zzy;
    }

    public final String I() {
        return this.zzz;
    }

    public final H1 I1(int i7) {
        return this.zzi.get(i7);
    }

    public final String J() {
        return this.zzs;
    }

    public final List<D1> L() {
        return this.zzH;
    }

    public final C1836b2 L1(int i7) {
        return this.zzj.get(i7);
    }

    public final List<H1> M() {
        return this.zzi;
    }

    public final String M1() {
        return this.zzS;
    }

    public final String N1() {
        return this.zzv;
    }

    public final List<C1836b2> O() {
        return this.zzj;
    }

    public final String O1() {
        return this.zzB;
    }

    public final int a0() {
        return this.zzJ;
    }

    public final int b1() {
        return this.zzD;
    }

    public final boolean e1() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean f1() {
        return (this.zzg & 16) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 8) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 32) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean m1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean n1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean o1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean p1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean q1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean r1() {
        return (this.zzf & 32768) != 0;
    }

    public final int s1() {
        return this.zzi.size();
    }

    public final int t1() {
        return this.zzh;
    }

    public final boolean u0() {
        return this.zzA;
    }

    public final int u1() {
        return this.zzR;
    }

    @Override
    protected final Object v(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return T3.n(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", H1.class, "zzj", C1836b2.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", D1.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C2026z1.f15383a, "zzaa", "zzab", "zzac", "zzad"});
        }
        if (i8 == 3) {
            return new R1();
        }
        C2018y1 c2018y1 = null;
        if (i8 == 4) {
            return new Q1(c2018y1);
        }
        if (i8 != 5) {
            return null;
        }
        return zze;
    }

    public final boolean v0() {
        return this.zzG;
    }

    public final int v1() {
        return this.zzt;
    }

    public final String w() {
        return this.zzu;
    }

    public final boolean w0() {
        return (this.zzf & 1073741824) != 0;
    }

    public final int w1() {
        return this.zzj.size();
    }

    public final String x() {
        return this.zzw;
    }

    public final boolean x0() {
        return (this.zzf & 33554432) != 0;
    }

    public final long x1() {
        return this.zzO;
    }

    public final String y() {
        return this.zzY;
    }

    public final boolean y0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long y1() {
        return this.zzN;
    }

    public final String z() {
        return this.zzr;
    }

    public final boolean z0() {
        return (this.zzf & 536870912) != 0;
    }

    public final long z1() {
        return this.zzC;
    }
}
