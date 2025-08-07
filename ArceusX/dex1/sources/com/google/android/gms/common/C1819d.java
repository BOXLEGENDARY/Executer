package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import x3.C2989c;

public class C1819d {

    public static final int f14213a = C1823h.f14217a;

    private static final C1819d f14214b = new C1819d();

    C1819d() {
    }

    public static C1819d f() {
        return f14214b;
    }

    public int a(Context context) {
        return C1823h.a(context);
    }

    public Intent b(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && v3.i.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f14213a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C2989c.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i7, int i8) {
        return d(context, i7, i8, null);
    }

    public PendingIntent d(Context context, int i7, int i8, String str) {
        Intent intentB = b(context, i7, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i8, intentB, J3.d.f1720a | 134217728);
    }

    public String e(int i7) {
        return C1823h.b(i7);
    }

    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return h(context, f14213a);
    }

    public int h(Context context, int i7) throws PackageManager.NameNotFoundException {
        int iF = C1823h.f(context, i7);
        if (C1823h.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(Context context, String str) {
        return C1823h.k(context, str);
    }

    public boolean j(int i7) {
        return C1823h.i(i7);
    }
}
