package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import n3.C2651i;

public final class W0 {

    private static volatile W0 f15057j;

    private final String f15058a;

    protected final v3.e f15059b;

    protected final ExecutorService f15060c;

    private final V3.a f15061d;

    private final List<Pair<W3.r, Object>> f15062e;

    private int f15063f;

    private boolean f15064g;

    private final String f15065h;

    private volatile InterfaceC1882h0 f15066i;

    protected W0(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m(str2, str3)) {
            this.f15058a = "FA";
        } else {
            this.f15058a = str;
        }
        this.f15059b = v3.h.c();
        this.f15060c = C1834b0.a().a(new H0(this), 1);
        this.f15061d = new V3.a(this);
        this.f15062e = new ArrayList();
        try {
            if (W3.u.b(context, "google_app_id", W3.k.a(context)) != null && !i()) {
                this.f15065h = null;
                this.f15064g = true;
                Log.w(this.f15058a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (m(str2, str3)) {
            this.f15065h = str2;
        } else {
            this.f15065h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f15058a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f15058a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        l(new C1993v0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f15058a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new V0(this));
        }
    }

    protected static final boolean i() {
        return true;
    }

    public final void j(Exception exc, boolean z7, boolean z8) {
        this.f15064g |= z7;
        if (z7) {
            Log.w(this.f15058a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z8) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f15058a, "Error with data collection. Data lost.", exc);
    }

    private final void k(String str, String str2, Bundle bundle, boolean z7, boolean z8, Long l7) {
        l(new K0(this, l7, str, str2, bundle, z7, z8));
    }

    public final void l(M0 m02) {
        this.f15060c.execute(m02);
    }

    public static final boolean m(String str, String str2) {
        return (str2 == null || str == null || i()) ? false : true;
    }

    public static W0 t(Context context, String str, String str2, String str3, Bundle bundle) {
        C2651i.l(context);
        if (f15057j == null) {
            synchronized (W0.class) {
                try {
                    if (f15057j == null) {
                        f15057j = new W0(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f15057j;
    }

    public final List<Bundle> A(String str, String str2) {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new C1969s0(this, str, str2, binderC1850d0));
        List<Bundle> list = (List) BinderC1850d0.h3(binderC1850d0.O0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> B(String str, String str2, boolean z7) {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new E0(this, str, str2, z7, binderC1850d0));
        Bundle bundleO0 = binderC1850d0.O0(5000L);
        if (bundleO0 == null || bundleO0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleO0.size());
        for (String str3 : bundleO0.keySet()) {
            Object obj = bundleO0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void F(String str) {
        l(new C2001w0(this, str));
    }

    public final void G(String str, String str2, Bundle bundle) {
        l(new C1961r0(this, str, str2, bundle));
    }

    public final void H(String str) {
        l(new C2009x0(this, str));
    }

    public final void I(String str, String str2, Bundle bundle) {
        k(str, str2, bundle, true, true, null);
    }

    public final void a(int i7, String str, Object obj, Object obj2, Object obj3) {
        l(new F0(this, false, 5, str, obj, null, null));
    }

    public final void b(Bundle bundle) {
        l(new C1954q0(this, bundle));
    }

    public final void c(Bundle bundle) {
        l(new C1985u0(this, bundle));
    }

    public final void d(Activity activity, String str, String str2) {
        l(new C1977t0(this, activity, str, str2));
    }

    public final void e(boolean z7) {
        l(new J0(this, z7));
    }

    public final void f(String str, String str2, Object obj, boolean z7) {
        l(new L0(this, str, str2, obj, z7));
    }

    public final int n(String str) {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new I0(this, str, binderC1850d0));
        Integer num = (Integer) BinderC1850d0.h3(binderC1850d0.O0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long o() {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new B0(this, binderC1850d0));
        Long l7 = (Long) BinderC1850d0.h3(binderC1850d0.O0(500L), Long.class);
        if (l7 != null) {
            return l7.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f15059b.a()).nextLong();
        int i7 = this.f15063f + 1;
        this.f15063f = i7;
        return jNextLong + i7;
    }

    public final Bundle p(Bundle bundle, boolean z7) {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new G0(this, bundle, binderC1850d0));
        if (z7) {
            return binderC1850d0.O0(5000L);
        }
        return null;
    }

    public final V3.a q() {
        return this.f15061d;
    }

    protected final InterfaceC1882h0 s(Context context, boolean z7) {
        try {
            return AbstractBinderC1874g0.asInterface(DynamiteModule.e(context, DynamiteModule.f14422e, ModuleDescriptor.MODULE_ID).d(wtzgsqRsIZB.QPnnylNgkx));
        } catch (DynamiteModule.a e7) {
            j(e7, true, false);
            return null;
        }
    }

    public final String v() {
        return this.f15065h;
    }

    public final String w() {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new A0(this, binderC1850d0));
        return binderC1850d0.V0(50L);
    }

    public final String x() {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new D0(this, binderC1850d0));
        return binderC1850d0.V0(500L);
    }

    public final String y() {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new C0(this, binderC1850d0));
        return binderC1850d0.V0(500L);
    }

    public final String z() {
        BinderC1850d0 binderC1850d0 = new BinderC1850d0();
        l(new C2025z0(this, binderC1850d0));
        return binderC1850d0.V0(500L);
    }
}
