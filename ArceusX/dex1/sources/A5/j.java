package a5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;

public final class j {

    private final Context f8359a;

    private String f8360b;

    private String f8361c;

    private int f8362d;

    private int f8363e = 0;

    public j(Context context) {
        this.f8359a = context;
    }

    private final PackageInfo b(String str) {
        try {
            return this.f8359a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            String strValueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String c(Q4.c cVar) {
        String strD = cVar.k().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVar.k().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String d(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private final synchronized void h() {
        PackageInfo packageInfoB = b(this.f8359a.getPackageName());
        if (packageInfoB != null) {
            this.f8360b = Integer.toString(packageInfoB.versionCode);
            this.f8361c = packageInfoB.versionName;
        }
    }

    public final synchronized int a() {
        int i7 = this.f8363e;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f8359a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!v3.m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f8363e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f8363e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (v3.m.i()) {
            this.f8363e = 2;
        } else {
            this.f8363e = 1;
        }
        return this.f8363e;
    }

    public final synchronized String e() {
        try {
            if (this.f8360b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8360b;
    }

    public final synchronized String f() {
        try {
            if (this.f8361c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8361c;
    }

    public final synchronized int g() {
        PackageInfo packageInfoB;
        try {
            if (this.f8362d == 0 && (packageInfoB = b("com.google.android.gms")) != null) {
                this.f8362d = packageInfoB.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8362d;
    }
}
