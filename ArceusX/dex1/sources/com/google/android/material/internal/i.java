package com.google.android.material.internal;

import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;

public class i {
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR;
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
