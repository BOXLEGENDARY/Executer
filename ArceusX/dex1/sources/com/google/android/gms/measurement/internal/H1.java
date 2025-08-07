package com.google.android.gms.measurement.internal;

import H3.QdLC.QcdySgfdST;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1854d4;
import com.google.android.gms.internal.measurement.C1858e0;
import com.google.android.gms.internal.measurement.C1876g2;
import com.google.android.gms.internal.measurement.C1892i2;
import com.google.android.gms.internal.measurement.C1962r1;
import com.google.android.gms.internal.measurement.C1986u1;
import com.google.android.gms.internal.measurement.C1994v1;
import com.google.android.gms.internal.measurement.C2010x1;
import com.google.android.gms.internal.measurement.C2014x5;
import com.google.android.gms.internal.measurement.C2015x6;
import com.google.android.gms.internal.measurement.C2017y0;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.J5;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.measurement.internal.H1;
import e2.vb.oyfFwvPUKctyaG;
import g0.C2457a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import n3.C2651i;

public final class H1 extends T3 implements InterfaceC2207e {

    private final Map<String, Map<String, String>> f16311d;

    final Map<String, Map<String, Boolean>> f16312e;

    final Map<String, Map<String, Boolean>> f16313f;

    private final Map<String, C1994v1> f16314g;

    private final Map<String, Map<String, Integer>> f16315h;

    final g0.j<String, C1858e0> f16316i;

    final d7 f16317j;

    private final Map<String, String> f16318k;

    H1(c4 c4Var) {
        super(c4Var);
        this.f16311d = new C2457a();
        this.f16312e = new C2457a();
        this.f16313f = new C2457a();
        this.f16314g = new C2457a();
        this.f16318k = new C2457a();
        this.f16315h = new C2457a();
        this.f16316i = new E1(this, 20);
        this.f16317j = new F1(this);
    }

    private final C1994v1 A(String str, byte[] bArr) {
        if (bArr == null) {
            return C1994v1.D();
        }
        try {
            C1994v1 c1994v1L = ((C1986u1) e4.D(C1994v1.B(), bArr)).l();
            this.f16818a.b().v().c("Parsed config. version, gmp_app_id", c1994v1L.O() ? Long.valueOf(c1994v1L.y()) : null, c1994v1L.M() ? c1994v1L.E() : null);
            return c1994v1L;
        } catch (C1854d4 e7) {
            this.f16818a.b().w().c("Unable to merge remote config. appId", C2234j1.z(str), e7);
            return C1994v1.D();
        } catch (RuntimeException e8) {
            this.f16818a.b().w().c("Unable to merge remote config. appId", C2234j1.z(str), e8);
            return C1994v1.D();
        }
    }

    private final void B(String str, C1986u1 c1986u1) {
        C2457a c2457a = new C2457a();
        C2457a c2457a2 = new C2457a();
        C2457a c2457a3 = new C2457a();
        if (c1986u1 != null) {
            for (int i7 = 0; i7 < c1986u1.s(); i7++) {
                C1962r1 c1962r1Q = c1986u1.t(i7).q();
                if (TextUtils.isEmpty(c1962r1Q.v())) {
                    this.f16818a.b().w().a("EventConfig contained null event name");
                } else {
                    String strV = c1962r1Q.v();
                    String strB = W3.n.b(c1962r1Q.v());
                    if (!TextUtils.isEmpty(strB)) {
                        c1962r1Q.t(strB);
                        c1986u1.w(i7, c1962r1Q);
                    }
                    J5.b();
                    C2212f c2212fZ = this.f16818a.z();
                    X0<Boolean> x02 = Y0.f16584E0;
                    if (!c2212fZ.B(null, x02)) {
                        c2457a.put(strV, Boolean.valueOf(c1962r1Q.w()));
                    } else if (c1962r1Q.y() && c1962r1Q.w()) {
                        c2457a.put(strV, Boolean.TRUE);
                    }
                    J5.b();
                    if (!this.f16818a.z().B(null, x02)) {
                        c2457a2.put(c1962r1Q.v(), Boolean.valueOf(c1962r1Q.x()));
                    } else if (c1962r1Q.z() && c1962r1Q.x()) {
                        c2457a2.put(c1962r1Q.v(), Boolean.TRUE);
                    }
                    if (c1962r1Q.B()) {
                        if (c1962r1Q.s() < 2 || c1962r1Q.s() > 65535) {
                            this.f16818a.b().w().c("Invalid sampling rate. Event name, sample rate", c1962r1Q.v(), Integer.valueOf(c1962r1Q.s()));
                        } else {
                            c2457a3.put(c1962r1Q.v(), Integer.valueOf(c1962r1Q.s()));
                        }
                    }
                }
            }
        }
        this.f16312e.put(str, c2457a);
        this.f16313f.put(str, c2457a2);
        this.f16315h.put(str, c2457a3);
    }

    private final void C(java.lang.String r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.H1.C(java.lang.String):void");
    }

    private final void D(final String str, C1994v1 c1994v1) {
        if (c1994v1.w() == 0) {
            this.f16316i.g(str);
            return;
        }
        this.f16818a.b().v().b(oyfFwvPUKctyaG.SkulfVgUSsbkhbS, Integer.valueOf(c1994v1.w()));
        C1892i2 c1892i2 = c1994v1.G().get(0);
        try {
            C1858e0 c1858e0 = new C1858e0();
            c1858e0.d("internal.remoteConfig", new Callable() {
                @Override
                public final Object call() {
                    return new C2014x5("internal.remoteConfig", new G1(this.f16273d, str));
                }
            });
            c1858e0.d("internal.appMetadata", new Callable() {
                @Override
                public final Object call() {
                    final H1 h12 = this.f7649d;
                    final String str2 = str;
                    return new g7("internal.appMetadata", new Callable() {
                        @Override
                        public final Object call() {
                            H1 h13 = h12;
                            String str3 = str2;
                            S1 s1T = h13.f16519b.V().T(str3);
                            HashMap map = new HashMap();
                            map.put("platform", QcdySgfdST.sRCTtsuexccqjfo);
                            map.put("package_name", str3);
                            h13.f16818a.z().q();
                            map.put("gmp_version", 46000L);
                            if (s1T != null) {
                                String strH0 = s1T.h0();
                                if (strH0 != null) {
                                    map.put("app_version", strH0);
                                }
                                map.put("app_version_int", Long.valueOf(s1T.M()));
                                map.put("dynamite_version", Long.valueOf(s1T.V()));
                            }
                            return map;
                        }
                    });
                }
            });
            c1858e0.d("internal.logger", new Callable() {
                @Override
                public final Object call() {
                    return new f7(this.f16265d.f16317j);
                }
            });
            c1858e0.c(c1892i2);
            this.f16316i.f(str, c1858e0);
            this.f16818a.b().v().c("EES program loaded for appId, activities", str, Integer.valueOf(c1892i2.w().w()));
            Iterator<C1876g2> it = c1892i2.w().z().iterator();
            while (it.hasNext()) {
                this.f16818a.b().v().b("EES program activity", it.next().x());
            }
        } catch (C2017y0 unused) {
            this.f16818a.b().r().b("Failed to load EES program. appId", str);
        }
    }

    private static final Map<String, String> E(C1994v1 c1994v1) {
        C2457a c2457a = new C2457a();
        if (c1994v1 != null) {
            for (C2010x1 c2010x1 : c1994v1.H()) {
                c2457a.put(c2010x1.x(), c2010x1.y());
            }
        }
        return c2457a;
    }

    static C1858e0 n(H1 h12, String str) throws Throwable {
        h12.i();
        C2651i.f(str);
        E6.b();
        if (!h12.f16818a.z().B(null, Y0.f16649v0) || !h12.u(str)) {
            return null;
        }
        if (!h12.f16314g.containsKey(str) || h12.f16314g.get(str) == null) {
            h12.C(str);
        } else {
            h12.D(str, h12.f16314g.get(str));
        }
        return h12.f16316i.k().get(str);
    }

    @Override
    public final String e(String str, String str2) throws Throwable {
        h();
        C(str);
        Map<String, String> map = this.f16311d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override
    protected final boolean l() {
        return false;
    }

    final int m(String str, String str2) throws Throwable {
        Integer num;
        h();
        C(str);
        Map<String, Integer> map = this.f16315h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    protected final C1994v1 o(String str) {
        i();
        h();
        C2651i.f(str);
        C(str);
        return this.f16314g.get(str);
    }

    protected final String p(String str) {
        h();
        return this.f16318k.get(str);
    }

    protected final void r(String str) {
        h();
        this.f16318k.put(str, null);
    }

    final void s(String str) {
        h();
        this.f16314g.remove(str);
    }

    final boolean t(String str) {
        h();
        C1994v1 c1994v1O = o(str);
        if (c1994v1O == null) {
            return false;
        }
        return c1994v1O.L();
    }

    public final boolean u(String str) {
        C1994v1 c1994v1;
        E6.b();
        return (!this.f16818a.z().B(null, Y0.f16649v0) || TextUtils.isEmpty(str) || (c1994v1 = this.f16314g.get(str)) == null || c1994v1.w() == 0) ? false : true;
    }

    final boolean v(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_internal"));
    }

    final boolean w(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        C(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f16313f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean x(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        C(str);
        if (v(str) && i4.V(str2)) {
            return true;
        }
        if (y(str) && i4.W(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f16312e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean y(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean z(String str, byte[] bArr, String str2) {
        i();
        h();
        C2651i.f(str);
        C1986u1 c1986u1Q = A(str, bArr).q();
        if (c1986u1Q == null) {
            return false;
        }
        B(str, c1986u1Q);
        E6.b();
        if (this.f16818a.z().B(null, Y0.f16649v0)) {
            D(str, c1986u1Q.l());
        }
        this.f16314g.put(str, c1986u1Q.l());
        this.f16318k.put(str, str2);
        this.f16311d.put(str, E(c1986u1Q.l()));
        this.f16519b.V().o(str, new ArrayList(c1986u1Q.x()));
        try {
            c1986u1Q.v();
            bArr = c1986u1Q.l().j();
        } catch (RuntimeException e7) {
            this.f16818a.b().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2234j1.z(str), e7);
        }
        C2015x6.b();
        if (this.f16818a.z().B(null, Y0.f16643s0)) {
            this.f16519b.V().s(str, bArr, str2);
        } else {
            this.f16519b.V().s(str, bArr, null);
        }
        this.f16314g.put(str, c1986u1Q.l());
        return true;
    }
}
