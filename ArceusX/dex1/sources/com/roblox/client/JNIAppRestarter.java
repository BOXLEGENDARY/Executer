package com.roblox.client;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.roblox.client.startup.StartedForEnum;
import java.io.Serializable;

public class JNIAppRestarter {

    private static final String f19553a = "JNIAppRestarter";

    public static native void init(Context context);

    static void restartApp(Context context, String str) {
        Log.d(f19553a, "restartApp(" + str + ")");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.putExtra("STARTED_FOR_INTENT_KEY", (Serializable) StartedForEnum.APP_RESTART);
        intent.setFlags(268468224);
        context.startActivity(intent);
        Runtime.getRuntime().exit(0);
    }
}
