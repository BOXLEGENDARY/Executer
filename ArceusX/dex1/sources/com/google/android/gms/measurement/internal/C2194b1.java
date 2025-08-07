package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.internal.measurement.C1920l6;
import com.google.android.gms.internal.measurement.T6;
import com.google.android.gms.internal.measurement.V5;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import n3.C2651i;
import x3.C2989c;

public final class C2194b1 extends AbstractC2298w1 {

    private String f16699c;

    private String f16700d;

    private int f16701e;

    private String f16702f;

    private String f16703g;

    private long f16704h;

    private final long f16705i;

    private List<String> f16706j;

    private int f16707k;

    private String f16708l;

    private String f16709m;

    private String f16710n;

    C2194b1(N1 n1, long j7) {
        super(n1);
        this.f16705i = j7;
    }

    @Override
    protected final void l() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2194b1.l():void");
    }

    @Override
    protected final boolean n() {
        return true;
    }

    final int o() {
        i();
        return this.f16707k;
    }

    final int p() {
        i();
        return this.f16701e;
    }

    final zzp q(String str) throws IllegalAccessException, NoSuchAlgorithmException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str2;
        long j7;
        long jMin;
        h();
        String strS = s();
        String strU = u();
        i();
        String str3 = this.f16700d;
        i();
        long j8 = this.f16701e;
        i();
        C2651i.l(this.f16702f);
        String str4 = this.f16702f;
        this.f16818a.z().q();
        i();
        h();
        long j9 = this.f16704h;
        if (j9 == 0) {
            i4 i4VarN = this.f16818a.N();
            Context contextF = this.f16818a.f();
            String packageName = this.f16818a.f().getPackageName();
            i4VarN.h();
            C2651i.l(contextF);
            C2651i.f(packageName);
            PackageManager packageManager = contextF.getPackageManager();
            MessageDigest messageDigestS = i4.s();
            long jQ0 = -1;
            if (messageDigestS == null) {
                i4VarN.f16818a.b().r().a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (i4VarN.U(contextF, packageName)) {
                            jQ0 = 0;
                        } else {
                            Signature[] signatureArr = C2989c.a(contextF).f(i4VarN.f16818a.f().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                i4VarN.f16818a.b().w().a("Could not get signatures");
                            } else {
                                jQ0 = i4.q0(messageDigestS.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e7) {
                        i4VarN.f16818a.b().r().b("Package name not found", e7);
                    }
                }
                j9 = 0;
                this.f16704h = j9;
            }
            j9 = jQ0;
            this.f16704h = j9;
        }
        long j10 = j9;
        boolean zO = this.f16818a.o();
        boolean z7 = !this.f16818a.F().f17094p;
        h();
        if (this.f16818a.o()) {
            T6.b();
            if (this.f16818a.z().B(null, Y0.f16619g0)) {
                this.f16818a.b().v().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.f16818a.f().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f16818a.f());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.f16818a.b().x().a("Failed to retrieve Firebase Instance Id");
                                }
                            }
                        } catch (Exception unused2) {
                            this.f16818a.b().y().a("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        N1 n1 = this.f16818a;
        long jA = n1.F().f17083e.a();
        if (jA == 0) {
            jMin = n1.f16399G;
            j7 = j10;
        } else {
            j7 = j10;
            jMin = Math.min(n1.f16399G, jA);
        }
        i();
        int i7 = this.f16707k;
        boolean zA = this.f16818a.z().A();
        C2303x1 c2303x1F = this.f16818a.F();
        c2303x1F.h();
        boolean z8 = c2303x1F.o().getBoolean("deferred_analytics_collection", false);
        i();
        String str5 = this.f16709m;
        Boolean boolValueOf = this.f16818a.z().t("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r2.booleanValue());
        long j11 = this.f16705i;
        List<String> list = this.f16706j;
        C1920l6.b();
        return new zzp(strS, strU, str3, j8, str4, 46000L, j7, str, zO, z7, str2, 0L, jMin, i7, zA, z8, str5, boolValueOf, j11, list, this.f16818a.z().B(null, Y0.f16615e0) ? t() : null, this.f16818a.F().q().i());
    }

    final String r() {
        i();
        return this.f16709m;
    }

    final String s() {
        i();
        C2651i.l(this.f16699c);
        return this.f16699c;
    }

    final String t() {
        i();
        C2651i.l(this.f16710n);
        return this.f16710n;
    }

    final String u() {
        V5.b();
        if (this.f16818a.z().B(null, Y0.f16647u0)) {
            h();
        }
        i();
        C2651i.l(this.f16708l);
        return this.f16708l;
    }

    final List<String> v() {
        return this.f16706j;
    }
}
