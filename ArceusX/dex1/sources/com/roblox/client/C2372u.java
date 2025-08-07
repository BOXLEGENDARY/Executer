package com.roblox.client;

import S5.Cg.XjqcfAbdbc;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.room.kU.HguUe;
import com.github.luben.zstd.BuildConfig;

public class C2372u {

    private static final String[] f20259a = new String[0];

    private static String f20260b;

    private static final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        String str2 = BuildConfig.FLAVOR;
        boolean z7 = true;
        for (char c2 : charArray) {
            if (z7 && Character.isLetter(c2)) {
                str2 = str2 + Character.toUpperCase(c2);
                z7 = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z7 = true;
                }
                str2 = str2 + c2;
            }
        }
        return str2;
    }

    public static String b() {
        String str = f20260b;
        if (str != null) {
            return str;
        }
        String str2 = Build.DEVICE + "|" + Build.MODEL;
        String[] strArr = f20259a;
        int length = strArr.length;
        int i7 = 0;
        while (true) {
            String str3 = XjqcfAbdbc.wOdweZ;
            if (i7 >= length) {
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (a0.k0()) {
                    f20260b = a(str4) + str3 + str5 + Build.DEVICE;
                } else if (str5.startsWith(str4)) {
                    f20260b = a(str5);
                } else if (str4.equalsIgnoreCase("HTC")) {
                    f20260b = "HTC " + str5;
                } else {
                    f20260b = a(str4) + str3 + str5;
                }
                return f20260b;
            }
            String str6 = strArr[i7];
            if (str6.endsWith(str2)) {
                String[] strArrSplit = str6.split("\\|");
                String str7 = strArrSplit[0];
                String str8 = strArrSplit[1];
                if (str8.startsWith(str7)) {
                    f20260b = str8;
                } else {
                    f20260b = str7 + str3 + str8;
                }
                return f20260b;
            }
            i7++;
        }
    }

    public static String c(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "device_name");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return HguUe.cUI + Build.MANUFACTURER + Build.MODEL;
    }
}
