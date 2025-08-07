package com.roblox.client.analytics;

import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.roblox.client.C2368p;
import com.roblox.engine.jni.NativeSettingsInterface;
import h7.l;

public class CrashpadHandler {
    private static final String TAG = "CrashpadHandler";

    public static void main(String[] strArr) {
        String str = System.getenv("LIBRARYPATH");
        for (String str2 : C2368p.f20150g) {
            if (!str2.equals("libtrampoline.so")) {
                System.load(str + "/" + str2);
            }
        }
        StringBuilder sb = new StringBuilder(JmBUOGMwkkxg.DuVcmQgWEOgBUU);
        int iNativeRunCrashpadHandler = NativeSettingsInterface.nativeRunCrashpadHandler(strArr);
        if (iNativeRunCrashpadHandler == 0) {
            sb.append("succeed");
            l.g(TAG, sb.toString());
        } else {
            sb.append("failed with result ");
            sb.append(iNativeRunCrashpadHandler);
            l.d(TAG, sb.toString());
        }
    }
}
