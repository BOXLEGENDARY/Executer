package com.google.android.gms.measurement.internal;

import K0.wJ.BtcVLuo;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.android.gms.internal.measurement.C1828a2;
import com.google.android.gms.internal.measurement.C1836b2;
import com.google.android.gms.internal.measurement.C1920l6;
import com.google.android.gms.internal.measurement.C1959q5;
import com.google.android.gms.internal.measurement.C1994v1;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.N6;
import f6.ck.ZJZXBWla;
import g0.C2457a;
import j0.tkB.pkcpMQSgx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n3.C2651i;
import x3.C2989c;
import y0.xyyu.hkVlaTTCDY;
import z3.AdxZ.bpTQi;

public final class c4 implements InterfaceC2235j2 {

    private static volatile c4 f16730C;

    private final Map<String, W3.a> f16731A;

    private final H1 f16733a;

    private final C2259o1 f16734b;

    private C2227i f16735c;

    private C2269q1 f16736d;

    private R3 f16737e;

    private u4 f16738f;

    private final e4 f16739g;

    private R2 f16740h;

    private A3 f16741i;

    private final U3 f16742j;

    private A1 f16743k;

    private final N1 f16744l;

    private boolean f16746n;

    long f16747o;

    private List<Runnable> f16748p;

    private int f16749q;

    private int f16750r;

    private boolean f16751s;

    private boolean f16752t;

    private boolean f16753u;

    private FileLock f16754v;

    private FileChannel f16755w;

    private List<Long> f16756x;

    private List<Long> f16757y;

    private long f16758z;

    private boolean f16745m = false;

    private final h4 f16732B = new a4(this);

    c4(d4 d4Var, N1 n1) throws IllegalStateException {
        C2651i.l(d4Var);
        this.f16744l = N1.H(d4Var.f16768a, null, null);
        this.f16758z = -1L;
        this.f16742j = new U3(this);
        e4 e4Var = new e4(this);
        e4Var.j();
        this.f16739g = e4Var;
        C2259o1 c2259o1 = new C2259o1(this);
        c2259o1.j();
        this.f16734b = c2259o1;
        H1 h12 = new H1(this);
        h12.j();
        this.f16733a = h12;
        this.f16731A = new HashMap();
        a().z(new V3(this, d4Var));
    }

    static final void D(com.google.android.gms.internal.measurement.G1 g12, int i7, String str) {
        List<com.google.android.gms.internal.measurement.L1> listJ = g12.J();
        for (int i8 = 0; i8 < listJ.size(); i8++) {
            if ("_err".equals(listJ.get(i8).D())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.K1 k1B = com.google.android.gms.internal.measurement.L1.B();
        k1B.D("_err");
        k1B.C(i7);
        com.google.android.gms.internal.measurement.L1 l1L = k1B.l();
        com.google.android.gms.internal.measurement.K1 k1B2 = com.google.android.gms.internal.measurement.L1.B();
        k1B2.D("_ev");
        k1B2.E(str);
        com.google.android.gms.internal.measurement.L1 l1L2 = k1B2.l();
        g12.y(l1L);
        g12.y(l1L2);
    }

    static final void E(com.google.android.gms.internal.measurement.G1 g12, String str) {
        List<com.google.android.gms.internal.measurement.L1> listJ = g12.J();
        for (int i7 = 0; i7 < listJ.size(); i7++) {
            if (str.equals(listJ.get(i7).D())) {
                g12.B(i7);
                return;
            }
        }
    }

    private final zzp G(String str) {
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        S1 s1T = c2227i.T(str);
        if (s1T == null || TextUtils.isEmpty(s1T.h0())) {
            b().q().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolH = H(s1T);
        if (boolH != null && !boolH.booleanValue()) {
            b().r().b("App version does not match; dropping. appId", C2234j1.z(str));
            return null;
        }
        String strK0 = s1T.k0();
        String strH0 = s1T.h0();
        long jM = s1T.M();
        String strG0 = s1T.g0();
        long jX = s1T.X();
        long jU = s1T.U();
        boolean zK = s1T.K();
        String strI0 = s1T.i0();
        long jA = s1T.A();
        boolean zJ = s1T.J();
        String strC0 = s1T.c0();
        Boolean boolB0 = s1T.b0();
        long jV = s1T.V();
        List<String> listC = s1T.c();
        C1920l6.b();
        return new zzp(str, strK0, strH0, jM, strG0, jX, jU, (String) null, zK, false, strI0, jA, 0L, 0, zJ, false, strC0, boolB0, jV, listC, T().B(str, Y0.f16615e0) ? s1T.j0() : null, U(str).i());
    }

    private final Boolean H(S1 s1) {
        try {
            if (s1.M() != -2147483648L) {
                if (s1.M() == C2989c.a(this.f16744l.f()).f(s1.e0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C2989c.a(this.f16744l.f()).f(s1.e0(), 0).versionName;
                String strH0 = s1.h0();
                if (strH0 != null && strH0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void I() {
        a().h();
        if (this.f16751s || this.f16752t || this.f16753u) {
            b().v().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f16751s), Boolean.valueOf(this.f16752t), Boolean.valueOf(this.f16753u));
            return;
        }
        b().v().a("Stopping uploading service(s)");
        List<Runnable> list = this.f16748p;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        ((List) C2651i.l(this.f16748p)).clear();
    }

    private final void J(com.google.android.gms.internal.measurement.Q1 q1, long j7, boolean z7) {
        String str = true != z7 ? "_lte" : pkcpMQSgx.KFmWknYXW;
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        g4 g4VarZ = c2227i.Z(q1.j0(), str);
        g4 g4Var = (g4VarZ == null || g4VarZ.f16811e == null) ? new g4(q1.j0(), JmBUOGMwkkxg.VQhQabGJGqk, str, c().a(), Long.valueOf(j7)) : new g4(q1.j0(), "auto", str, c().a(), Long.valueOf(((Long) g4VarZ.f16811e).longValue() + j7));
        C1828a2 c1828a2Z = C1836b2.z();
        c1828a2Z.y(str);
        c1828a2Z.z(c().a());
        c1828a2Z.x(((Long) g4Var.f16811e).longValue());
        C1836b2 c1836b2L = c1828a2Z.l();
        int iX = e4.x(q1, str);
        if (iX >= 0) {
            q1.g0(iX, c1836b2L);
        } else {
            q1.y0(c1836b2L);
        }
        if (j7 > 0) {
            C2227i c2227i2 = this.f16735c;
            Q(c2227i2);
            c2227i2.z(g4Var);
            b().v().c("Updated engagement user property. scope, value", true != z7 ? "lifetime" : "session-scoped", g4Var.f16811e);
        }
    }

    private final void K(com.google.android.gms.internal.measurement.G1 g12, com.google.android.gms.internal.measurement.G1 g13) {
        C2651i.a("_e".equals(g12.I()));
        Q(this.f16739g);
        com.google.android.gms.internal.measurement.L1 l1O = e4.o(g12.l(), "_et");
        if (l1O == null || !l1O.V() || l1O.z() <= 0) {
            return;
        }
        long jZ = l1O.z();
        Q(this.f16739g);
        com.google.android.gms.internal.measurement.L1 l1O2 = e4.o(g13.l(), "_et");
        if (l1O2 != null && l1O2.z() > 0) {
            jZ += l1O2.z();
        }
        Q(this.f16739g);
        e4.m(g13, "_et", Long.valueOf(jZ));
        Q(this.f16739g);
        e4.m(g12, "_fr", 1L);
    }

    private final void L() {
        long jMax;
        long jMax2;
        a().h();
        g();
        if (this.f16747o > 0) {
            long jAbs = 3600000 - Math.abs(c().b() - this.f16747o);
            if (jAbs > 0) {
                b().v().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                Y().c();
                R3 r32 = this.f16737e;
                Q(r32);
                r32.m();
                return;
            }
            this.f16747o = 0L;
        }
        if (!this.f16744l.r() || !O()) {
            b().v().a("Nothing to upload or uploading impossible");
            Y().c();
            R3 r33 = this.f16737e;
            Q(r33);
            r33.m();
            return;
        }
        long jA = c().a();
        T();
        long jMax3 = Math.max(0L, Y0.f16577B.a(null).longValue());
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        boolean z7 = true;
        if (!c2227i.v()) {
            C2227i c2227i2 = this.f16735c;
            Q(c2227i2);
            if (!c2227i2.u()) {
                z7 = false;
            }
        }
        if (z7) {
            String strU = T().u();
            if (TextUtils.isEmpty(strU) || ".none.".equals(strU)) {
                T();
                jMax = Math.max(0L, Y0.f16648v.a(null).longValue());
            } else {
                T();
                jMax = Math.max(0L, Y0.f16650w.a(null).longValue());
            }
        } else {
            T();
            jMax = Math.max(0L, Y0.f16646u.a(null).longValue());
        }
        long jA2 = this.f16741i.f16258i.a();
        long jA3 = this.f16741i.f16259j.a();
        C2227i c2227i3 = this.f16735c;
        Q(c2227i3);
        boolean z8 = z7;
        long jO = c2227i3.O();
        C2227i c2227i4 = this.f16735c;
        Q(c2227i4);
        long jMax4 = Math.max(jO, c2227i4.P());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jA - jAbs3, jAbs4);
            jMax2 = jAbs2 + jMax3;
            if (z8 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            e4 e4Var = this.f16739g;
            Q(e4Var);
            if (!e4Var.O(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i7 = 0;
                while (true) {
                    T();
                    if (i7 >= Math.min(20, Math.max(0, Y0.f16581D.a(null).intValue()))) {
                        break;
                    }
                    T();
                    jMax2 += Math.max(0L, Y0.f16579C.a(null).longValue()) * (1 << i7);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        if (jMax2 == 0) {
            b().v().a("Next upload time is 0");
            Y().c();
            R3 r34 = this.f16737e;
            Q(r34);
            r34.m();
            return;
        }
        C2259o1 c2259o1 = this.f16734b;
        Q(c2259o1);
        if (!c2259o1.m()) {
            b().v().a("No network");
            Y().b();
            R3 r35 = this.f16737e;
            Q(r35);
            r35.m();
            return;
        }
        long jA4 = this.f16741i.f16257h.a();
        T();
        long jMax6 = Math.max(0L, Y0.f16642s.a(null).longValue());
        e4 e4Var2 = this.f16739g;
        Q(e4Var2);
        if (!e4Var2.O(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        Y().c();
        long jA5 = jMax2 - c().a();
        if (jA5 <= 0) {
            T();
            jA5 = Math.max(0L, Y0.f16652x.a(null).longValue());
            this.f16741i.f16258i.b(c().a());
        }
        b().v().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        R3 r36 = this.f16737e;
        Q(r36);
        r36.n(jA5);
    }

    private final boolean M(zzp zzpVar) {
        C1920l6.b();
        return T().B(zzpVar.f17168d, Y0.f16615e0) ? (TextUtils.isEmpty(zzpVar.f17169e) && TextUtils.isEmpty(zzpVar.f17166N) && TextUtils.isEmpty(zzpVar.f17162J)) ? false : true : (TextUtils.isEmpty(zzpVar.f17169e) && TextUtils.isEmpty(zzpVar.f17162J)) ? false : true;
    }

    private final boolean N(java.lang.String r42, long r43) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.N(java.lang.String, long):boolean");
    }

    private final boolean O() {
        a().h();
        g();
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        if (c2227i.t()) {
            return true;
        }
        C2227i c2227i2 = this.f16735c;
        Q(c2227i2);
        return !TextUtils.isEmpty(c2227i2.b0());
    }

    private final boolean P(com.google.android.gms.internal.measurement.G1 g12, com.google.android.gms.internal.measurement.G1 g13) {
        C2651i.a("_e".equals(g12.I()));
        Q(this.f16739g);
        com.google.android.gms.internal.measurement.L1 l1O = e4.o(g12.l(), vxbbqXNtzfMxs.eUVfrnymg);
        String strE = l1O == null ? null : l1O.E();
        Q(this.f16739g);
        com.google.android.gms.internal.measurement.L1 l1O2 = e4.o(g13.l(), "_pc");
        String strE2 = l1O2 != null ? l1O2.E() : null;
        if (strE2 == null || !strE2.equals(strE)) {
            return false;
        }
        K(g12, g13);
        return true;
    }

    private static final T3 Q(T3 t32) {
        if (t32 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (t32.k()) {
            return t32;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(t32.getClass())));
    }

    public static c4 e0(Context context) {
        C2651i.l(context);
        C2651i.l(context.getApplicationContext());
        if (f16730C == null) {
            synchronized (c4.class) {
                try {
                    if (f16730C == null) {
                        f16730C = new c4((d4) C2651i.l(new d4(context)), null);
                    }
                } finally {
                }
            }
        }
        return f16730C;
    }

    static void j0(c4 c4Var, d4 d4Var) {
        c4Var.a().h();
        c4Var.f16743k = new A1(c4Var);
        C2227i c2227i = new C2227i(c4Var);
        c2227i.j();
        c4Var.f16735c = c2227i;
        c4Var.T().z((InterfaceC2207e) C2651i.l(c4Var.f16733a));
        A3 a3 = new A3(c4Var);
        a3.j();
        c4Var.f16741i = a3;
        u4 u4Var = new u4(c4Var);
        u4Var.j();
        c4Var.f16738f = u4Var;
        R2 r22 = new R2(c4Var);
        r22.j();
        c4Var.f16740h = r22;
        R3 r32 = new R3(c4Var);
        r32.j();
        c4Var.f16737e = r32;
        c4Var.f16736d = new C2269q1(c4Var);
        if (c4Var.f16749q != c4Var.f16750r) {
            c4Var.b().r().c("Not all upload components initialized", Integer.valueOf(c4Var.f16749q), Integer.valueOf(c4Var.f16750r));
        }
        c4Var.f16745m = true;
    }

    final void A() {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.A():void");
    }

    final void B(com.google.android.gms.measurement.internal.zzat r34, com.google.android.gms.measurement.internal.zzp r35) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.B(com.google.android.gms.measurement.internal.zzat, com.google.android.gms.measurement.internal.zzp):void");
    }

    final boolean C() throws IOException {
        a().h();
        FileLock fileLock = this.f16754v;
        if (fileLock != null && fileLock.isValid()) {
            b().v().a("Storage concurrent access okay");
            return true;
        }
        this.f16735c.f16818a.z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f16744l.f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f16755w = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f16754v = fileLockTryLock;
            if (fileLockTryLock != null) {
                b().v().a("Storage concurrent access okay");
                return true;
            }
            b().r().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e7) {
            b().r().b("Failed to acquire storage lock", e7);
            return false;
        } catch (IOException e8) {
            b().r().b("Failed to access storage lock file", e8);
            return false;
        } catch (OverlappingFileLockException e9) {
            b().w().b("Storage lock already acquired", e9);
            return false;
        }
    }

    final long F() {
        long jA = c().a();
        A3 a3 = this.f16741i;
        a3.i();
        a3.h();
        long jA2 = a3.f16260k.a();
        if (jA2 == 0) {
            jA2 = a3.f16818a.N().t().nextInt(86400000) + 1;
            a3.f16260k.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    final S1 R(zzp zzpVar) {
        a().h();
        g();
        C2651i.l(zzpVar);
        C2651i.f(zzpVar.f17168d);
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        S1 s1T = c2227i.T(zzpVar.f17168d);
        W3.a aVarC = U(zzpVar.f17168d).c(W3.a.b(zzpVar.f17167O));
        String strO = aVarC.j() ? this.f16741i.o(zzpVar.f17168d) : BuildConfig.FLAVOR;
        if (s1T == null) {
            s1T = new S1(this.f16744l, zzpVar.f17168d);
            if (aVarC.k()) {
                s1T.i(h0(aVarC));
            }
            if (aVarC.j()) {
                s1T.H(strO);
            }
        } else if (aVarC.j() && strO != null && !strO.equals(s1T.b())) {
            s1T.H(strO);
            C1959q5.b();
            C2212f c2212fT = T();
            X0<Boolean> x02 = Y0.f16653x0;
            if (!c2212fT.B(null, x02) || !T().B(null, Y0.f16578B0) || !"00000000-0000-0000-0000-000000000000".equals(this.f16741i.n(zzpVar.f17168d, aVarC).first)) {
                s1T.i(h0(aVarC));
            }
            C1959q5.b();
            if (T().B(null, x02) && !"00000000-0000-0000-0000-000000000000".equals(this.f16741i.n(zzpVar.f17168d, aVarC).first)) {
                C2227i c2227i2 = this.f16735c;
                Q(c2227i2);
                if (c2227i2.Z(zzpVar.f17168d, "_id") != null) {
                    C2227i c2227i3 = this.f16735c;
                    Q(c2227i3);
                    if (c2227i3.Z(zzpVar.f17168d, "_lair") == null) {
                        g4 g4Var = new g4(zzpVar.f17168d, "auto", "_lair", c().a(), 1L);
                        C2227i c2227i4 = this.f16735c;
                        Q(c2227i4);
                        c2227i4.z(g4Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(s1T.f0()) && aVarC.k()) {
            s1T.i(h0(aVarC));
        }
        s1T.y(zzpVar.f17169e);
        s1T.f(zzpVar.f17162J);
        C1920l6.b();
        if (T().B(s1T.e0(), Y0.f16615e0)) {
            s1T.x(zzpVar.f17166N);
        }
        if (!TextUtils.isEmpty(zzpVar.f17156D)) {
            s1T.w(zzpVar.f17156D);
        }
        long j7 = zzpVar.f17172w;
        if (j7 != 0) {
            s1T.z(j7);
        }
        if (!TextUtils.isEmpty(zzpVar.f17170i)) {
            s1T.k(zzpVar.f17170i);
        }
        s1T.l(zzpVar.f17155C);
        String str = zzpVar.f17171v;
        if (str != null) {
            s1T.j(str);
        }
        s1T.t(zzpVar.f17173y);
        s1T.F(zzpVar.f17153A);
        if (!TextUtils.isEmpty(zzpVar.f17174z)) {
            s1T.B(zzpVar.f17174z);
        }
        if (!T().B(null, Y0.f16635o0)) {
            s1T.h(zzpVar.f17157E);
        }
        s1T.g(zzpVar.f17160H);
        s1T.G(zzpVar.f17163K);
        s1T.u(zzpVar.f17164L);
        if (s1T.L()) {
            C2227i c2227i5 = this.f16735c;
            Q(c2227i5);
            c2227i5.q(s1T);
        }
        return s1T;
    }

    public final u4 S() {
        u4 u4Var = this.f16738f;
        Q(u4Var);
        return u4Var;
    }

    public final C2212f T() {
        return ((N1) C2651i.l(this.f16744l)).z();
    }

    final W3.a U(String str) {
        String string;
        a().h();
        g();
        W3.a aVar = this.f16731A.get(str);
        if (aVar != null) {
            return aVar;
        }
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        C2651i.l(str);
        c2227i.h();
        c2227i.i();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c2227i.R().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                W3.a aVarB = W3.a.b(string);
                y(str, aVarB);
                return aVarB;
            } catch (SQLiteException e7) {
                c2227i.f16818a.b().r().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final C2227i V() {
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        return c2227i;
    }

    public final C2209e1 W() {
        return this.f16744l.D();
    }

    public final C2259o1 X() {
        C2259o1 c2259o1 = this.f16734b;
        Q(c2259o1);
        return c2259o1;
    }

    public final C2269q1 Y() {
        C2269q1 c2269q1 = this.f16736d;
        if (c2269q1 != null) {
            return c2269q1;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final H1 Z() {
        H1 h12 = this.f16733a;
        Q(h12);
        return h12;
    }

    @Override
    public final L1 a() {
        return ((N1) C2651i.l(this.f16744l)).a();
    }

    @Override
    public final C2234j1 b() {
        return ((N1) C2651i.l(this.f16744l)).b();
    }

    final N1 b0() {
        return this.f16744l;
    }

    @Override
    public final v3.e c() {
        return ((N1) C2651i.l(this.f16744l)).c();
    }

    public final R2 c0() {
        R2 r22 = this.f16740h;
        Q(r22);
        return r22;
    }

    @Override
    public final C2192b d() {
        throw null;
    }

    public final A3 d0() {
        return this.f16741i;
    }

    final void e() {
        a().h();
        g();
        if (this.f16746n) {
            return;
        }
        this.f16746n = true;
        if (C()) {
            FileChannel fileChannel = this.f16755w;
            a().h();
            int i7 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                b().r().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i8 = fileChannel.read(byteBufferAllocate);
                    if (i8 == 4) {
                        byteBufferAllocate.flip();
                        i7 = byteBufferAllocate.getInt();
                    } else if (i8 != -1) {
                        b().w().b("Unexpected data length. Bytes read", Integer.valueOf(i8));
                    }
                } catch (IOException e7) {
                    b().r().b("Failed to read from channel", e7);
                }
            }
            int iP = this.f16744l.B().p();
            a().h();
            if (i7 > iP) {
                b().r().c(hkVlaTTCDY.esuObFFOaytV, Integer.valueOf(i7), Integer.valueOf(iP));
                return;
            }
            if (i7 < iP) {
                FileChannel fileChannel2 = this.f16755w;
                a().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    b().r().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iP);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        T().B(null, Y0.f16631m0);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            b().r().b(bpTQi.AnttV, Long.valueOf(fileChannel2.size()));
                        }
                        b().v().c("Storage version upgraded. Previous, current version", Integer.valueOf(i7), Integer.valueOf(iP));
                        return;
                    } catch (IOException e8) {
                        b().r().b("Failed to write to channel", e8);
                    }
                }
                b().r().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i7), Integer.valueOf(iP));
            }
        }
    }

    @Override
    public final Context f() {
        return this.f16744l.f();
    }

    public final e4 f0() {
        e4 e4Var = this.f16739g;
        Q(e4Var);
        return e4Var;
    }

    public final void g() {
        if (!this.f16745m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final i4 g0() {
        return ((N1) C2651i.l(this.f16744l)).N();
    }

    final void h(S1 s1) throws IllegalStateException {
        a().h();
        C1920l6.b();
        C2212f c2212fT = T();
        String strE0 = s1.e0();
        X0<Boolean> x02 = Y0.f16615e0;
        if (c2212fT.B(strE0, x02)) {
            if (TextUtils.isEmpty(s1.k0()) && TextUtils.isEmpty(s1.j0()) && TextUtils.isEmpty(s1.c0())) {
                m((String) C2651i.l(s1.e0()), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(s1.k0()) && TextUtils.isEmpty(s1.c0())) {
            m((String) C2651i.l(s1.e0()), 204, null, null, null);
            return;
        }
        U3 u32 = this.f16742j;
        Uri.Builder builder = new Uri.Builder();
        String strK0 = s1.k0();
        if (TextUtils.isEmpty(strK0)) {
            C1920l6.b();
            if (u32.f16818a.z().B(s1.e0(), x02)) {
                strK0 = s1.j0();
                if (TextUtils.isEmpty(strK0)) {
                    strK0 = s1.c0();
                }
            } else {
                strK0 = s1.c0();
            }
        }
        C2457a c2457a = null;
        Uri.Builder builderEncodedAuthority = builder.scheme(Y0.f16616f.a(null)).encodedAuthority(Y0.f16618g.a(null));
        String strValueOf = String.valueOf(strK0);
        Uri.Builder builderAppendQueryParameter = builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", s1.f0()).appendQueryParameter("platform", "android");
        u32.f16818a.z().q();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(46000L));
        E6.b();
        if (u32.f16818a.z().B(s1.e0(), Y0.f16649v0)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String string = builder.build().toString();
        try {
            String str = (String) C2651i.l(s1.e0());
            URL url = new URL(string);
            b().v().b("Fetching remote configuration", str);
            H1 h12 = this.f16733a;
            Q(h12);
            C1994v1 c1994v1O = h12.o(str);
            H1 h13 = this.f16733a;
            Q(h13);
            String strP = h13.p(str);
            if (c1994v1O != null && !TextUtils.isEmpty(strP)) {
                c2457a = new C2457a();
                c2457a.put("If-Modified-Since", strP);
            }
            this.f16751s = true;
            C2259o1 c2259o1 = this.f16734b;
            Q(c2259o1);
            X3 x32 = new X3(this);
            c2259o1.h();
            c2259o1.i();
            C2651i.l(url);
            C2651i.l(x32);
            c2259o1.f16818a.a().y(new RunnableC2254n1(c2259o1, str, url, null, c2457a, x32));
        } catch (MalformedURLException unused) {
            b().r().c("Failed to parse config URL. Not fetching. appId", C2234j1.z(s1.e0()), string);
        }
    }

    final String h0(W3.a aVar) {
        if (!aVar.k()) {
            return null;
        }
        byte[] bArr = new byte[16];
        g0().t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final void i(zzat zzatVar, zzp zzpVar) {
        zzat zzatVar2;
        List<zzab> listD0;
        List<zzab> listD02;
        List<zzab> listD03;
        C2651i.l(zzpVar);
        C2651i.f(zzpVar.f17168d);
        a().h();
        g();
        String str = zzpVar.f17168d;
        zzat zzatVarA = zzatVar;
        long j7 = zzatVarA.f17145v;
        N6.b();
        if (T().B(null, Y0.f16580C0)) {
            C2239k1 c2239k1B = C2239k1.b(zzatVar);
            a().h();
            i4.x(null, c2239k1B.f16870d, false);
            zzatVarA = c2239k1B.a();
        }
        Q(this.f16739g);
        if (e4.n(zzatVarA, zzpVar)) {
            if (!zzpVar.f17153A) {
                R(zzpVar);
                return;
            }
            List<String> list = zzpVar.f17165M;
            if (list == null) {
                zzatVar2 = zzatVarA;
            } else {
                if (!list.contains(zzatVarA.f17142d)) {
                    b().q().d(ZJZXBWla.aITu, str, zzatVarA.f17142d, zzatVarA.f17144i);
                    return;
                }
                Bundle bundleO = zzatVarA.f17143e.o();
                bundleO.putLong("ga_safelisted", 1L);
                zzatVar2 = new zzat(zzatVarA.f17142d, new zzar(bundleO), zzatVarA.f17144i, zzatVarA.f17145v);
            }
            C2227i c2227i = this.f16735c;
            Q(c2227i);
            c2227i.g0();
            try {
                C2227i c2227i2 = this.f16735c;
                Q(c2227i2);
                C2651i.f(str);
                c2227i2.h();
                c2227i2.i();
                if (j7 < 0) {
                    c2227i2.f16818a.b().w().c("Invalid time querying timed out conditional properties", C2234j1.z(str), Long.valueOf(j7));
                    listD0 = Collections.emptyList();
                } else {
                    listD0 = c2227i2.d0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j7)});
                }
                for (zzab zzabVar : listD0) {
                    if (zzabVar != null) {
                        b().v().d("User property timed out", zzabVar.f17134d, this.f16744l.D().f(zzabVar.f17136i.f17147e), zzabVar.f17136i.l());
                        zzat zzatVar3 = zzabVar.f17140z;
                        if (zzatVar3 != null) {
                            B(new zzat(zzatVar3, j7), zzpVar);
                        }
                        C2227i c2227i3 = this.f16735c;
                        Q(c2227i3);
                        c2227i3.K(str, zzabVar.f17136i.f17147e);
                    }
                }
                C2227i c2227i4 = this.f16735c;
                Q(c2227i4);
                C2651i.f(str);
                c2227i4.h();
                c2227i4.i();
                if (j7 < 0) {
                    c2227i4.f16818a.b().w().c("Invalid time querying expired conditional properties", C2234j1.z(str), Long.valueOf(j7));
                    listD02 = Collections.emptyList();
                } else {
                    listD02 = c2227i4.d0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j7)});
                }
                ArrayList arrayList = new ArrayList(listD02.size());
                for (zzab zzabVar2 : listD02) {
                    if (zzabVar2 != null) {
                        b().v().d("User property expired", zzabVar2.f17134d, this.f16744l.D().f(zzabVar2.f17136i.f17147e), zzabVar2.f17136i.l());
                        C2227i c2227i5 = this.f16735c;
                        Q(c2227i5);
                        c2227i5.n(str, zzabVar2.f17136i.f17147e);
                        zzat zzatVar4 = zzabVar2.f17133D;
                        if (zzatVar4 != null) {
                            arrayList.add(zzatVar4);
                        }
                        C2227i c2227i6 = this.f16735c;
                        Q(c2227i6);
                        c2227i6.K(str, zzabVar2.f17136i.f17147e);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    B(new zzat((zzat) it.next(), j7), zzpVar);
                }
                C2227i c2227i7 = this.f16735c;
                Q(c2227i7);
                String str2 = zzatVar2.f17142d;
                C2651i.f(str);
                C2651i.f(str2);
                c2227i7.h();
                c2227i7.i();
                if (j7 < 0) {
                    c2227i7.f16818a.b().w().d("Invalid time querying triggered conditional properties", C2234j1.z(str), c2227i7.f16818a.D().d(str2), Long.valueOf(j7));
                    listD03 = Collections.emptyList();
                } else {
                    listD03 = c2227i7.d0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j7)});
                }
                ArrayList arrayList2 = new ArrayList(listD03.size());
                for (zzab zzabVar3 : listD03) {
                    if (zzabVar3 != null) {
                        zzkv zzkvVar = zzabVar3.f17136i;
                        g4 g4Var = new g4((String) C2651i.l(zzabVar3.f17134d), zzabVar3.f17135e, zzkvVar.f17147e, j7, C2651i.l(zzkvVar.l()));
                        C2227i c2227i8 = this.f16735c;
                        Q(c2227i8);
                        if (c2227i8.z(g4Var)) {
                            b().v().d("User property triggered", zzabVar3.f17134d, this.f16744l.D().f(g4Var.f16809c), g4Var.f16811e);
                        } else {
                            b().r().d("Too many active user properties, ignoring", C2234j1.z(zzabVar3.f17134d), this.f16744l.D().f(g4Var.f16809c), g4Var.f16811e);
                        }
                        zzat zzatVar5 = zzabVar3.f17131B;
                        if (zzatVar5 != null) {
                            arrayList2.add(zzatVar5);
                        }
                        zzabVar3.f17136i = new zzkv(g4Var);
                        zzabVar3.f17138w = true;
                        C2227i c2227i9 = this.f16735c;
                        Q(c2227i9);
                        c2227i9.y(zzabVar3);
                    }
                }
                B(zzatVar2, zzpVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    B(new zzat((zzat) it2.next(), j7), zzpVar);
                }
                C2227i c2227i10 = this.f16735c;
                Q(c2227i10);
                c2227i10.p();
                C2227i c2227i11 = this.f16735c;
                Q(c2227i11);
                c2227i11.i0();
            } catch (Throwable th) {
                C2227i c2227i12 = this.f16735c;
                Q(c2227i12);
                c2227i12.i0();
                throw th;
            }
        }
    }

    final String i0(zzp zzpVar) throws IllegalStateException {
        try {
            return (String) a().s(new Y3(this, zzpVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            b().r().c("Failed to get app instance id. appId", C2234j1.z(zzpVar.f17168d), e7);
            return null;
        }
    }

    final void j(zzat zzatVar, String str) {
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        S1 s1T = c2227i.T(str);
        if (s1T == null || TextUtils.isEmpty(s1T.h0())) {
            b().q().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolH = H(s1T);
        if (boolH == null) {
            if (!"_ui".equals(zzatVar.f17142d)) {
                b().w().b("Could not find package. appId", C2234j1.z(str));
            }
        } else if (!boolH.booleanValue()) {
            b().r().b("App version does not match; dropping event. appId", C2234j1.z(str));
            return;
        }
        String strK0 = s1T.k0();
        String strH0 = s1T.h0();
        long jM = s1T.M();
        String strG0 = s1T.g0();
        long jX = s1T.X();
        long jU = s1T.U();
        boolean zK = s1T.K();
        String strI0 = s1T.i0();
        long jA = s1T.A();
        boolean zJ = s1T.J();
        String strC0 = s1T.c0();
        Boolean boolB0 = s1T.b0();
        long jV = s1T.V();
        List<String> listC = s1T.c();
        C1920l6.b();
        k(zzatVar, new zzp(str, strK0, strH0, jM, strG0, jX, jU, (String) null, zK, false, strI0, jA, 0L, 0, zJ, false, strC0, boolB0, jV, listC, T().B(s1T.e0(), Y0.f16615e0) ? s1T.j0() : null, U(str).i()));
    }

    final void k(zzat zzatVar, zzp zzpVar) {
        C2651i.f(zzpVar.f17168d);
        C2239k1 c2239k1B = C2239k1.b(zzatVar);
        i4 i4VarG0 = g0();
        Bundle bundle = c2239k1B.f16870d;
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        i4VarG0.y(bundle, c2227i.S(zzpVar.f17168d));
        g0().z(c2239k1B, T().n(zzpVar.f17168d));
        zzat zzatVarA = c2239k1B.a();
        if ("_cmp".equals(zzatVarA.f17142d) && "referrer API v2".equals(zzatVarA.f17143e.s("_cis"))) {
            String strS = zzatVarA.f17143e.s("gclid");
            if (!TextUtils.isEmpty(strS)) {
                z(new zzkv("_lgclid", zzatVarA.f17145v, strS, "auto"), zzpVar);
            }
        }
        i(zzatVarA, zzpVar);
    }

    final void k0(Runnable runnable) {
        a().h();
        if (this.f16748p == null) {
            this.f16748p = new ArrayList();
        }
        this.f16748p.add(runnable);
    }

    final void l() {
        this.f16750r++;
    }

    final void m(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void n(boolean z7) {
        L();
    }

    final void o(int r8, java.lang.Throwable r9, byte[] r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.o(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    final void p(com.google.android.gms.measurement.internal.zzp r24) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.p(com.google.android.gms.measurement.internal.zzp):void");
    }

    final void q() {
        this.f16749q++;
    }

    final void r(zzab zzabVar) {
        zzp zzpVarG = G((String) C2651i.l(zzabVar.f17134d));
        if (zzpVarG != null) {
            s(zzabVar, zzpVarG);
        }
    }

    final void s(zzab zzabVar, zzp zzpVar) {
        C2651i.l(zzabVar);
        C2651i.f(zzabVar.f17134d);
        C2651i.l(zzabVar.f17136i);
        C2651i.f(zzabVar.f17136i.f17147e);
        a().h();
        g();
        if (M(zzpVar)) {
            if (!zzpVar.f17153A) {
                R(zzpVar);
                return;
            }
            C2227i c2227i = this.f16735c;
            Q(c2227i);
            c2227i.g0();
            try {
                R(zzpVar);
                String str = (String) C2651i.l(zzabVar.f17134d);
                C2227i c2227i2 = this.f16735c;
                Q(c2227i2);
                zzab zzabVarU = c2227i2.U(str, zzabVar.f17136i.f17147e);
                if (zzabVarU != null) {
                    b().q().c("Removing conditional user property", zzabVar.f17134d, this.f16744l.D().f(zzabVar.f17136i.f17147e));
                    C2227i c2227i3 = this.f16735c;
                    Q(c2227i3);
                    c2227i3.K(str, zzabVar.f17136i.f17147e);
                    if (zzabVarU.f17138w) {
                        C2227i c2227i4 = this.f16735c;
                        Q(c2227i4);
                        c2227i4.n(str, zzabVar.f17136i.f17147e);
                    }
                    zzat zzatVar = zzabVar.f17133D;
                    if (zzatVar != null) {
                        zzar zzarVar = zzatVar.f17143e;
                        B((zzat) C2651i.l(g0().w0(str, ((zzat) C2651i.l(zzabVar.f17133D)).f17142d, zzarVar != null ? zzarVar.o() : null, zzabVarU.f17135e, zzabVar.f17133D.f17145v, true, true)), zzpVar);
                    }
                } else {
                    b().w().c("Conditional user property doesn't exist", C2234j1.z(zzabVar.f17134d), this.f16744l.D().f(zzabVar.f17136i.f17147e));
                }
                C2227i c2227i5 = this.f16735c;
                Q(c2227i5);
                c2227i5.p();
                C2227i c2227i6 = this.f16735c;
                Q(c2227i6);
                c2227i6.i0();
            } catch (Throwable th) {
                C2227i c2227i7 = this.f16735c;
                Q(c2227i7);
                c2227i7.i0();
                throw th;
            }
        }
    }

    final void t(zzkv zzkvVar, zzp zzpVar) {
        a().h();
        g();
        if (M(zzpVar)) {
            if (!zzpVar.f17153A) {
                R(zzpVar);
                return;
            }
            if ("_npa".equals(zzkvVar.f17147e) && zzpVar.f17163K != null) {
                b().q().a("Falling back to manifest metadata value for ad personalization");
                z(new zzkv("_npa", c().a(), Long.valueOf(true != zzpVar.f17163K.booleanValue() ? 0L : 1L), "auto"), zzpVar);
                return;
            }
            b().q().b("Removing user property", this.f16744l.D().f(zzkvVar.f17147e));
            C2227i c2227i = this.f16735c;
            Q(c2227i);
            c2227i.g0();
            try {
                R(zzpVar);
                C1959q5.b();
                if (this.f16744l.z().B(null, Y0.f16653x0) && this.f16744l.z().B(null, Y0.f16657z0) && "_id".equals(zzkvVar.f17147e)) {
                    C2227i c2227i2 = this.f16735c;
                    Q(c2227i2);
                    c2227i2.n((String) C2651i.l(zzpVar.f17168d), "_lair");
                }
                C2227i c2227i3 = this.f16735c;
                Q(c2227i3);
                c2227i3.n((String) C2651i.l(zzpVar.f17168d), zzkvVar.f17147e);
                C2227i c2227i4 = this.f16735c;
                Q(c2227i4);
                c2227i4.p();
                b().q().b("User property removed", this.f16744l.D().f(zzkvVar.f17147e));
                C2227i c2227i5 = this.f16735c;
                Q(c2227i5);
                c2227i5.i0();
            } catch (Throwable th) {
                C2227i c2227i6 = this.f16735c;
                Q(c2227i6);
                c2227i6.i0();
                throw th;
            }
        }
    }

    final void u(zzp zzpVar) {
        if (this.f16756x != null) {
            ArrayList arrayList = new ArrayList();
            this.f16757y = arrayList;
            arrayList.addAll(this.f16756x);
        }
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        String str = (String) C2651i.l(zzpVar.f17168d);
        C2651i.f(str);
        c2227i.h();
        c2227i.i();
        try {
            SQLiteDatabase sQLiteDatabaseR = c2227i.R();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseR.delete("apps", "app_id=?", strArr) + sQLiteDatabaseR.delete("events", "app_id=?", strArr) + sQLiteDatabaseR.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseR.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseR.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseR.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseR.delete("queue", "app_id=?", strArr) + sQLiteDatabaseR.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseR.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseR.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                c2227i.f16818a.b().v().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e7) {
            c2227i.f16818a.b().r().c("Error resetting analytics data. appId, error", C2234j1.z(str), e7);
        }
        if (zzpVar.f17153A) {
            p(zzpVar);
        }
    }

    protected final void v() {
        a().h();
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        c2227i.m();
        if (this.f16741i.f16258i.a() == 0) {
            this.f16741i.f16258i.b(c().a());
        }
        L();
    }

    final void w(zzab zzabVar) {
        zzp zzpVarG = G((String) C2651i.l(zzabVar.f17134d));
        if (zzpVarG != null) {
            x(zzabVar, zzpVarG);
        }
    }

    final void x(zzab zzabVar, zzp zzpVar) {
        zzat zzatVar;
        C2651i.l(zzabVar);
        C2651i.f(zzabVar.f17134d);
        C2651i.l(zzabVar.f17135e);
        C2651i.l(zzabVar.f17136i);
        C2651i.f(zzabVar.f17136i.f17147e);
        a().h();
        g();
        if (M(zzpVar)) {
            if (!zzpVar.f17153A) {
                R(zzpVar);
                return;
            }
            zzab zzabVar2 = new zzab(zzabVar);
            boolean z7 = false;
            zzabVar2.f17138w = false;
            C2227i c2227i = this.f16735c;
            Q(c2227i);
            c2227i.g0();
            try {
                C2227i c2227i2 = this.f16735c;
                Q(c2227i2);
                zzab zzabVarU = c2227i2.U((String) C2651i.l(zzabVar2.f17134d), zzabVar2.f17136i.f17147e);
                if (zzabVarU != null && !zzabVarU.f17135e.equals(zzabVar2.f17135e)) {
                    b().w().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f16744l.D().f(zzabVar2.f17136i.f17147e), zzabVar2.f17135e, zzabVarU.f17135e);
                }
                if (zzabVarU != null && zzabVarU.f17138w) {
                    zzabVar2.f17135e = zzabVarU.f17135e;
                    zzabVar2.f17137v = zzabVarU.f17137v;
                    zzabVar2.f17130A = zzabVarU.f17130A;
                    zzabVar2.f17139y = zzabVarU.f17139y;
                    zzabVar2.f17131B = zzabVarU.f17131B;
                    zzabVar2.f17138w = true;
                    zzkv zzkvVar = zzabVar2.f17136i;
                    zzabVar2.f17136i = new zzkv(zzkvVar.f17147e, zzabVarU.f17136i.f17148i, zzkvVar.l(), zzabVarU.f17136i.f17151y);
                } else if (TextUtils.isEmpty(zzabVar2.f17139y)) {
                    zzkv zzkvVar2 = zzabVar2.f17136i;
                    zzabVar2.f17136i = new zzkv(zzkvVar2.f17147e, zzabVar2.f17137v, zzkvVar2.l(), zzabVar2.f17136i.f17151y);
                    zzabVar2.f17138w = true;
                    z7 = true;
                }
                if (zzabVar2.f17138w) {
                    zzkv zzkvVar3 = zzabVar2.f17136i;
                    g4 g4Var = new g4((String) C2651i.l(zzabVar2.f17134d), zzabVar2.f17135e, zzkvVar3.f17147e, zzkvVar3.f17148i, C2651i.l(zzkvVar3.l()));
                    C2227i c2227i3 = this.f16735c;
                    Q(c2227i3);
                    if (c2227i3.z(g4Var)) {
                        b().q().d("User property updated immediately", zzabVar2.f17134d, this.f16744l.D().f(g4Var.f16809c), g4Var.f16811e);
                    } else {
                        b().r().d("(2)Too many active user properties, ignoring", C2234j1.z(zzabVar2.f17134d), this.f16744l.D().f(g4Var.f16809c), g4Var.f16811e);
                    }
                    if (z7 && (zzatVar = zzabVar2.f17131B) != null) {
                        B(new zzat(zzatVar, zzabVar2.f17137v), zzpVar);
                    }
                }
                C2227i c2227i4 = this.f16735c;
                Q(c2227i4);
                if (c2227i4.y(zzabVar2)) {
                    b().q().d("Conditional property added", zzabVar2.f17134d, this.f16744l.D().f(zzabVar2.f17136i.f17147e), zzabVar2.f17136i.l());
                } else {
                    b().r().d("Too many conditional properties, ignoring", C2234j1.z(zzabVar2.f17134d), this.f16744l.D().f(zzabVar2.f17136i.f17147e), zzabVar2.f17136i.l());
                }
                C2227i c2227i5 = this.f16735c;
                Q(c2227i5);
                c2227i5.p();
                C2227i c2227i6 = this.f16735c;
                Q(c2227i6);
                c2227i6.i0();
            } catch (Throwable th) {
                C2227i c2227i7 = this.f16735c;
                Q(c2227i7);
                c2227i7.i0();
                throw th;
            }
        }
    }

    final void y(String str, W3.a aVar) {
        a().h();
        g();
        this.f16731A.put(str, aVar);
        C2227i c2227i = this.f16735c;
        Q(c2227i);
        C2651i.l(str);
        C2651i.l(aVar);
        c2227i.h();
        c2227i.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", aVar.i());
        try {
            if (c2227i.R().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c2227i.f16818a.b().r().b(BtcVLuo.RtIp, C2234j1.z(str));
            }
        } catch (SQLiteException e7) {
            c2227i.f16818a.b().r().c("Error storing consent setting. appId, error", C2234j1.z(str), e7);
        }
    }

    final void z(com.google.android.gms.measurement.internal.zzkv r14, com.google.android.gms.measurement.internal.zzp r15) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c4.z(com.google.android.gms.measurement.internal.zzkv, com.google.android.gms.measurement.internal.zzp):void");
    }
}
