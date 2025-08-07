package com.google.firebase;

import S4.C1529d;
import S4.i;
import Z4.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import com.google.firebase.FirebaseCommonRegistrar;
import j5.c;
import j5.e;
import j5.h;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements i {
    public static String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.FLAVOR;
    }

    public static String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : BuildConfig.FLAVOR;
    }

    public static String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : BuildConfig.FLAVOR;
    }

    public static String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : BuildConfig.FLAVOR;
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override
    public List<C1529d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c());
        arrayList.add(d.e());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.0.0"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() {
            @Override
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.e((Context) obj);
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() {
            @Override
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.f((Context) obj);
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() {
            @Override
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.g((Context) obj);
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() {
            @Override
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.h((Context) obj);
            }
        }));
        String strA = e.a();
        if (strA != null) {
            arrayList.add(h.b("kotlin", strA));
        }
        return arrayList;
    }
}
