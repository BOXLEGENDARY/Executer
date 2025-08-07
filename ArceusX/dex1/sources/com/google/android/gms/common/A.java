package com.google.android.gms.common;

import K0.wJ.BtcVLuo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import n3.AbstractBinderC2631G;
import n3.C2651i;
import n3.InterfaceC2632H;
import v3.C2943a;
import y3.BinderC3024b;

final class A {

    private static volatile InterfaceC2632H f14031e;

    private static Context f14033g;

    static final y f14027a = new s(w.V0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    static final y f14028b = new t(w.V0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    static final y f14029c = new u(w.V0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    static final y f14030d = new v(w.V0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    private static final Object f14032f = new Object();

    static H a(String str, w wVar, boolean z7, boolean z8) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, wVar, z7, z8);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static H b(String str, boolean z7, boolean z8, boolean z9) {
        return g(str, z7, false, false, true);
    }

    static String c(boolean z7, String str, w wVar) throws Exception {
        String str2 = (z7 || !f(str, wVar, true, false).f14045a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = C2943a.b("SHA-256");
        C2651i.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, v3.j.a(messageDigestB.digest(wVar.h3())), Boolean.valueOf(z7), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f14033g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f14033g = context.getApplicationContext();
        }
    }

    static boolean e() {
        boolean zE;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zE = f14031e.e();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            zE = false;
        }
        return zE;
    }

    private static H f(final String str, final w wVar, final boolean z7, boolean z8) {
        try {
            h();
            C2651i.l(f14033g);
            try {
                return f14031e.v6(new zzs(str, wVar, z7, z8), BinderC3024b.h3(f14033g.getPackageManager())) ? H.b() : new F(new Callable() {
                    @Override
                    public final Object call() {
                        return A.c(z7, str, wVar);
                    }
                }, null);
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return H.d("module call", e7);
            }
        } catch (DynamiteModule.a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return H.d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    private static H g(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        H hD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C2651i.l(f14033g);
            try {
                h();
                zzo zzoVar = new zzo(str, z7, false, BinderC3024b.h3(f14033g), false, true);
                try {
                    zzq zzqVarQ3 = z10 ? f14031e.q3(zzoVar) : f14031e.k4(zzoVar);
                    if (zzqVarQ3.n()) {
                        hD = H.f(zzqVarQ3.o());
                    } else {
                        String strL = zzqVarQ3.l();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarQ3.p() == 4 ? new PackageManager.NameNotFoundException() : null;
                        String str2 = BtcVLuo.tVHsFJmjq;
                        if (strL == null) {
                            strL = str2;
                        }
                        hD = H.g(zzqVarQ3.o(), zzqVarQ3.p(), strL, nameNotFoundException);
                    }
                } catch (RemoteException e7) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                    hD = H.d("module call", e7);
                }
            } catch (DynamiteModule.a e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                hD = H.d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return hD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void h() throws DynamiteModule.a {
        if (f14031e != null) {
            return;
        }
        C2651i.l(f14033g);
        synchronized (f14032f) {
            try {
                if (f14031e == null) {
                    f14031e = AbstractBinderC2631G.O0(DynamiteModule.e(f14033g, DynamiteModule.f14423f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
