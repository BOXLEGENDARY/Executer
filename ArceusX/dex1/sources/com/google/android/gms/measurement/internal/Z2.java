package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import e2.vb.oyfFwvPUKctyaG;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n3.C2651i;

public final class Z2 extends AbstractC2298w1 {

    private volatile S2 f16668c;

    private volatile S2 f16669d;

    protected S2 f16670e;

    private final Map<Activity, S2> f16671f;

    private Activity f16672g;

    private volatile boolean f16673h;

    private volatile S2 f16674i;

    private S2 f16675j;

    private boolean f16676k;

    private final Object f16677l;

    private S2 f16678m;

    private String f16679n;

    public Z2(N1 n1) {
        super(n1);
        this.f16677l = new Object();
        this.f16671f = new ConcurrentHashMap();
    }

    private final S2 H(Activity activity) {
        C2651i.l(activity);
        S2 s22 = this.f16671f.get(activity);
        if (s22 == null) {
            S2 s23 = new S2(null, u(activity.getClass(), "Activity"), this.f16818a.N().r0());
            this.f16671f.put(activity, s23);
            s22 = s23;
        }
        return this.f16674i != null ? this.f16674i : s22;
    }

    private final void o(Activity activity, S2 s22, boolean z7) throws IllegalStateException {
        S2 s23;
        S2 s24 = this.f16668c == null ? this.f16669d : this.f16668c;
        if (s22.f16514b == null) {
            s23 = new S2(s22.f16513a, activity != null ? u(activity.getClass(), "Activity") : null, s22.f16515c, s22.f16517e, s22.f16518f);
        } else {
            s23 = s22;
        }
        this.f16669d = this.f16668c;
        this.f16668c = s23;
        this.f16818a.a().z(new U2(this, s23, s24, this.f16818a.c().b(), z7));
    }

    public final void p(S2 s22, S2 s23, long j7, boolean z7, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long j8;
        long j9;
        h();
        boolean z8 = false;
        boolean z9 = (s23 != null && s23.f16515c == s22.f16515c && i4.Z(s23.f16514b, s22.f16514b) && i4.Z(s23.f16513a, s22.f16513a)) ? false : true;
        if (z7 && this.f16670e != null) {
            z8 = true;
        }
        if (z9) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            i4.x(s22, bundle2, true);
            if (s23 != null) {
                String str = s23.f16513a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = s23.f16514b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", s23.f16515c);
            }
            if (z8) {
                M3 m32 = this.f16818a.M().f16453e;
                long j10 = j7 - m32.f16387b;
                m32.f16387b = j7;
                if (j10 > 0) {
                    this.f16818a.N().v(bundle2, j10);
                }
            }
            if (!this.f16818a.z().D()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != s22.f16517e ? "auto" : "app";
            long jA = this.f16818a.c().a();
            if (s22.f16517e) {
                j8 = jA;
                long j11 = s22.f16518f;
                if (j11 != 0) {
                    j9 = j11;
                }
                this.f16818a.I().v(str3, "_vs", j9, bundle2);
            } else {
                j8 = jA;
            }
            j9 = j8;
            this.f16818a.I().v(str3, "_vs", j9, bundle2);
        }
        if (z8) {
            q(this.f16670e, true, j7);
        }
        this.f16670e = s22;
        if (s22.f16517e) {
            this.f16675j = s22;
        }
        this.f16818a.L().u(s22);
    }

    public final void q(S2 s22, boolean z7, long j7) {
        this.f16818a.y().n(this.f16818a.c().b());
        if (!this.f16818a.M().f16453e.d(s22 != null && s22.f16516d, z7, j7) || s22 == null) {
            return;
        }
        s22.f16516d = false;
    }

    static void x(Z2 z22, Bundle bundle, S2 s22, S2 s23, long j7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        z22.p(s22, s23, j7, true, z22.f16818a.N().v0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f16677l) {
            try {
                if (activity == this.f16672g) {
                    this.f16672g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f16818a.z().D()) {
            this.f16671f.remove(activity);
        }
    }

    public final void B(Activity activity) throws IllegalStateException {
        synchronized (this.f16677l) {
            this.f16676k = false;
            this.f16673h = true;
        }
        long jB = this.f16818a.c().b();
        if (!this.f16818a.z().D()) {
            this.f16668c = null;
            this.f16818a.a().z(new W2(this, jB));
        } else {
            S2 s2H = H(activity);
            this.f16669d = this.f16668c;
            this.f16668c = null;
            this.f16818a.a().z(new X2(this, s2H, jB));
        }
    }

    public final void C(Activity activity) throws IllegalStateException {
        synchronized (this.f16677l) {
            this.f16676k = true;
            if (activity != this.f16672g) {
                synchronized (this.f16677l) {
                    this.f16672g = activity;
                    this.f16673h = false;
                }
                if (this.f16818a.z().D()) {
                    this.f16674i = null;
                    this.f16818a.a().z(new Y2(this));
                }
            }
        }
        if (!this.f16818a.z().D()) {
            this.f16668c = this.f16674i;
            this.f16818a.a().z(new V2(this));
        } else {
            o(activity, H(activity), false);
            A0 a0Y = this.f16818a.y();
            a0Y.f16818a.a().z(new Z(a0Y, a0Y.f16818a.c().b()));
        }
    }

    public final void D(Activity activity, Bundle bundle) {
        S2 s22;
        if (!this.f16818a.z().D() || bundle == null || (s22 = this.f16671f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(oyfFwvPUKctyaG.jkdaARBkoKYZHvO, s22.f16515c);
        bundle2.putString("name", s22.f16513a);
        bundle2.putString("referrer_name", s22.f16514b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @java.lang.Deprecated
    public final void E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Z2.E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    public final void F(android.os.Bundle r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Z2.F(android.os.Bundle, long):void");
    }

    public final void G(String str, S2 s22) {
        h();
        synchronized (this) {
            try {
                String str2 = this.f16679n;
                if (str2 == null || str2.equals(str) || s22 != null) {
                    this.f16679n = str;
                    this.f16678m = s22;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    protected final boolean n() {
        return false;
    }

    public final S2 s() {
        return this.f16668c;
    }

    public final S2 t(boolean z7) {
        i();
        h();
        if (!z7) {
            return this.f16670e;
        }
        S2 s22 = this.f16670e;
        return s22 != null ? s22 : this.f16675j;
    }

    final String u(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : BuildConfig.FLAVOR;
        int length2 = str2.length();
        this.f16818a.z();
        if (length2 <= 100) {
            return str2;
        }
        this.f16818a.z();
        return str2.substring(0, 100);
    }

    public final void z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f16818a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f16671f.put(activity, new S2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
