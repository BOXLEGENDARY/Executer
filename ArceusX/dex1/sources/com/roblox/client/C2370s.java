package com.roblox.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;

public class C2370s {

    private static String f20249a;

    public static String a(Context context) {
        if (f20249a == null) {
            d(context);
        }
        return f20249a;
    }

    public static String b(Context context) {
        c(context);
        return NativeSettingsInterface.nativeGetDevRpcConfiguration();
    }

    public static void c(Context context) {
        String str;
        if (NativeSettingsInterface.nativeIsDevRpcEnabled()) {
            String strH = k7.h.h();
            if (TextUtils.isEmpty(strH)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = strH + "/bundles/ip.txt";
            }
            NativeSettingsInterface.nativeConfigureDevRpc(str, a(context));
        }
    }

    public static void d(Context context) {
        f20249a = a0.Q(context).getString("dev_rpc_ip_port_override", BuildConfig.FLAVOR);
    }

    public static void e(Context context, String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        f20249a = str;
        SharedPreferences.Editor editorEdit = a0.Q(context).edit();
        editorEdit.putString("dev_rpc_ip_port_override", str);
        editorEdit.apply();
        c(context);
    }
}
