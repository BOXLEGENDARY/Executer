package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import n3.C2651i;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class C1824i {

    private static C1824i f14222c;

    private final Context f14223a;

    private volatile String f14224b;

    public C1824i(Context context) {
        this.f14223a = context.getApplicationContext();
    }

    public static C1824i a(Context context) {
        C2651i.l(context);
        synchronized (C1824i.class) {
            try {
                if (f14222c == null) {
                    A.d(context);
                    f14222c = new C1824i(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14222c;
    }

    static final w d(PackageInfo packageInfo, w... wVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            x xVar = new x(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < wVarArr.length; i7++) {
                if (wVarArr[i7].equals(xVar)) {
                    return wVarArr[i7];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z7) {
        PackageInfo packageInfo2;
        if (!z7) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z7 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z7 ? d(packageInfo2, z.f14404a) : d(packageInfo2, z.f14404a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final H f(String str, boolean z7, boolean z8) throws PackageManager.NameNotFoundException {
        H hC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return H.c("null pkg");
        }
        if (str.equals(this.f14224b)) {
            return H.b();
        }
        if (A.e()) {
            hC = A.b(str, C1823h.e(this.f14223a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f14223a.getPackageManager().getPackageInfo(str, 64);
                boolean zE = C1823h.e(this.f14223a);
                if (packageInfo == null) {
                    hC = H.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        hC = H.c("single cert required");
                    } else {
                        x xVar = new x(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        H hA = A.a(str2, xVar, zE, false);
                        hC = (!hA.f14045a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !A.a(str2, xVar, false, true).f14045a) ? hA : H.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e7) {
                return H.d("no pkg ".concat(str), e7);
            }
        }
        if (hC.f14045a) {
            this.f14224b = str;
        }
        return hC;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (C1823h.e(this.f14223a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i7) throws PackageManager.NameNotFoundException {
        H hC;
        int length;
        String[] packagesForUid = this.f14223a.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            hC = null;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    C2651i.l(hC);
                    break;
                }
                hC = f(packagesForUid[i8], false, false);
                if (hC.f14045a) {
                    break;
                }
                i8++;
            }
        } else {
            hC = H.c("no pkgs");
        }
        hC.e();
        return hC.f14045a;
    }
}
