package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import n3.C2651i;
import x3.C2989c;

public final class C2212f extends C2225h2 {

    private Boolean f16779b;

    private InterfaceC2207e f16780c;

    private Boolean f16781d;

    C2212f(N1 n1) {
        super(n1);
        this.f16780c = new InterfaceC2207e() {
            @Override
            public final String e(String str, String str2) {
                return null;
            }
        };
    }

    public static final long I() {
        return Y0.f16614e.a(null).longValue();
    }

    public static final long i() {
        return Y0.f16583E.a(null).longValue();
    }

    private final String j(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            C2651i.l(str3);
            return str3;
        } catch (ClassNotFoundException e7) {
            this.f16818a.b().r().b("Could not find SystemProperties class", e7);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e8) {
            this.f16818a.b().r().b("Could not access SystemProperties.get()", e8);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e9) {
            this.f16818a.b().r().b("Could not find SystemProperties.get() method", e9);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e10) {
            this.f16818a.b().r().b("SystemProperties.get() threw an exception", e10);
            return BuildConfig.FLAVOR;
        }
    }

    public final boolean A() {
        Boolean boolT = t("google_analytics_adid_collection_enabled");
        return boolT == null || boolT.booleanValue();
    }

    public final boolean B(String str, X0<Boolean> x02) {
        if (str == null) {
            return x02.a(null).booleanValue();
        }
        String strE = this.f16780c.e(str, x02.b());
        if (TextUtils.isEmpty(strE)) {
            return x02.a(null).booleanValue();
        }
        return x02.a(Boolean.valueOf(this.f16818a.z().B(null, Y0.f16582D0) ? "1".equals(strE) : Boolean.parseBoolean(strE))).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.f16780c.e(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean boolT = t("google_analytics_automatic_screen_reporting_enabled");
        return boolT == null || boolT.booleanValue();
    }

    public final boolean E() {
        this.f16818a.d();
        Boolean boolT = t("firebase_analytics_collection_deactivated");
        return boolT != null && boolT.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.f16780c.e(str, "measurement.event_sampling_enabled"));
    }

    final boolean G() {
        if (this.f16779b == null) {
            Boolean boolT = t("app_measurement_lite");
            this.f16779b = boolT;
            if (boolT == null) {
                this.f16779b = Boolean.FALSE;
            }
        }
        return this.f16779b.booleanValue() || !this.f16818a.s();
    }

    public final boolean H() {
        if (this.f16781d == null) {
            synchronized (this) {
                try {
                    if (this.f16781d == null) {
                        ApplicationInfo applicationInfo = this.f16818a.f().getApplicationInfo();
                        String strA = v3.p.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z7 = false;
                            if (str != null && str.equals(strA)) {
                                z7 = true;
                            }
                            this.f16781d = Boolean.valueOf(z7);
                        }
                        if (this.f16781d == null) {
                            this.f16781d = Boolean.TRUE;
                            this.f16818a.b().r().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f16781d.booleanValue();
    }

    public final double k(String str, X0<Double> x02) {
        if (str == null) {
            return x02.a(null).doubleValue();
        }
        String strE = this.f16780c.e(str, x02.b());
        if (TextUtils.isEmpty(strE)) {
            return x02.a(null).doubleValue();
        }
        try {
            return x02.a(Double.valueOf(Double.parseDouble(strE))).doubleValue();
        } catch (NumberFormatException unused) {
            return x02.a(null).doubleValue();
        }
    }

    final int l(String str) {
        return p(str, Y0.f16588I, 500, 2000);
    }

    public final int m() {
        i4 i4VarN = this.f16818a.N();
        Boolean boolJ = i4VarN.f16818a.L().J();
        if (i4VarN.o0() < 201500) {
            return (boolJ == null || boolJ.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int n(String str) {
        return p(str, Y0.f16589J, 25, 100);
    }

    public final int o(String str, X0<Integer> x02) {
        if (str == null) {
            return x02.a(null).intValue();
        }
        String strE = this.f16780c.e(str, x02.b());
        if (TextUtils.isEmpty(strE)) {
            return x02.a(null).intValue();
        }
        try {
            return x02.a(Integer.valueOf(Integer.parseInt(strE))).intValue();
        } catch (NumberFormatException unused) {
            return x02.a(null).intValue();
        }
    }

    public final int p(String str, X0<Integer> x02, int i7, int i8) {
        return Math.max(Math.min(o(str, x02), i8), i7);
    }

    public final long q() {
        this.f16818a.d();
        return 46000L;
    }

    public final long r(String str, X0<Long> x02) {
        if (str == null) {
            return x02.a(null).longValue();
        }
        String strE = this.f16780c.e(str, x02.b());
        if (TextUtils.isEmpty(strE)) {
            return x02.a(null).longValue();
        }
        try {
            return x02.a(Long.valueOf(Long.parseLong(strE))).longValue();
        } catch (NumberFormatException unused) {
            return x02.a(null).longValue();
        }
    }

    final Bundle s() {
        try {
            if (this.f16818a.f().getPackageManager() == null) {
                this.f16818a.b().r().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = C2989c.a(this.f16818a.f()).c(this.f16818a.f().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            this.f16818a.b().r().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            this.f16818a.b().r().b("Failed to load metadata: Package name not found", e7);
            return null;
        }
    }

    final Boolean t(String str) {
        C2651i.f(str);
        Bundle bundleS = s();
        if (bundleS == null) {
            this.f16818a.b().r().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleS.containsKey(str)) {
            return Boolean.valueOf(bundleS.getBoolean(str));
        }
        return null;
    }

    public final String u() {
        return j("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String v() {
        return j("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    final String w() {
        this.f16818a.d();
        return "FA";
    }

    public final String x(String str, X0<String> x02) {
        return str == null ? x02.a(null) : x02.a(this.f16780c.e(str, x02.b()));
    }

    final java.util.List<java.lang.String> y(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2212f.y(java.lang.String):java.util.List");
    }

    final void z(InterfaceC2207e interfaceC2207e) {
        this.f16780c = interfaceC2207e;
    }
}
