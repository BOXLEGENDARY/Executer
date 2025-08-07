package com.appsflyer.internal;

import U.Gw.oeVkjmfPcLbWm;
import W0.JWp.kNUgEaOjcPdX;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.C1818c;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import d3.C2382a;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public final class AFj1nSDK {
    public static boolean AFAdRevenueData(Context context) {
        if (context == null) {
            return false;
        }
        try {
            C2382a.a(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean J_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static java.util.Map<java.lang.String, java.lang.String> K_(android.content.Context r11, java.util.Map<java.lang.String, java.lang.String> r12, android.net.Uri r13) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1nSDK.K_(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static String L_(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(kNUgEaOjcPdX.hQaSVLUxcPc).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format(oeVkjmfPcLbWm.fDrAkEKCqDFLCj, new BigInteger(1, messageDigest.digest()));
    }

    public static Application M_(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getMediationNetwork(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return C1799u.a(context.getApplicationContext().getSystemService(C1798t.a())) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1zSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : BuildConfig.FLAVOR, th, false, false);
            }
        }
        return false;
    }

    public static boolean getRevenue(Context context) {
        if (context != null) {
            try {
                if (C1818c.n().g(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean AFAdRevenueData() {
        return Build.BRAND.equals("OPPO");
    }

    public static String getCurrencyIso4217Code(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
            return BuildConfig.FLAVOR;
        }
    }

    public static long AFAdRevenueData(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
            return 0L;
        }
    }

    public static boolean getMediationNetwork(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(iCheckPermission);
        AFLogger.afRDLog(sb.toString());
        return iCheckPermission == 0;
    }
}
