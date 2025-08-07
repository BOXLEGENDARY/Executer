package com.roblox.client;

import K0.wJ.BtcVLuo;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.universalapp.logging.LoggingProtocol;
import m6.C2591H;
import org.json.JSONObject;

public class C2366n {
    public static Intent a(Activity activity, String str, String str2, boolean z7, boolean z8, boolean z9) {
        Intent intent = new Intent(activity, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", h7.f.c(str));
        intent.putExtra("TITLE_EXTRA", str2);
        intent.putExtra("USE_GENERIC_WEB_FRAG_EXTRA", z7);
        intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", z8);
        intent.putExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", z9);
        return intent;
    }

    public static void b(JSONObject jSONObject, Activity activity) {
        C2591H c2591hA;
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong("placeId");
            long jOptLong2 = jSONObject.optLong("userId");
            long jOptLong3 = jSONObject.optLong("conversationId");
            String strOptString = jSONObject.optString("gameInstanceId");
            String strOptString2 = jSONObject.optString("reservedServerAccessCode");
            String strOptString3 = jSONObject.optString("callId");
            String strOptString4 = jSONObject.optString("referralPage");
            String strOptString5 = jSONObject.optString("accessCode");
            String strOptString6 = jSONObject.optString("linkCode");
            String strOptString7 = jSONObject.optString("launchData");
            long jOptLong4 = j6.d.a().s0() ? jSONObject.optLong("referredByPlayerId") : 0L;
            String strOptString8 = jSONObject.optString("eventId");
            String strOptString9 = jSONObject.optString("gameJoinContext");
            String strOptString10 = jSONObject.optString("joinAttemptId");
            String strOptString11 = jSONObject.optString("joinAttemptOrigin");
            String strOptString12 = jSONObject.optString(BtcVLuo.yteksFQx);
            if (jOptLong <= 0 || jOptLong3 <= 0) {
                if (jOptLong > 0 || jOptLong2 > 0) {
                    Long lValueOf = jOptLong == 0 ? null : Long.valueOf(jOptLong);
                    Long lValueOf2 = jOptLong2 == 0 ? null : Long.valueOf(jOptLong2);
                    String str = TextUtils.isEmpty(strOptString5) ? null : strOptString5;
                    String str2 = TextUtils.isEmpty(strOptString6) ? null : strOptString6;
                    String str3 = TextUtils.isEmpty(strOptString) ? null : strOptString;
                    if (TextUtils.isEmpty(strOptString2)) {
                        strOptString2 = null;
                    }
                    c2591hA = C2591H.a(lValueOf, lValueOf2, str, str2, str3, strOptString2, TextUtils.isEmpty(strOptString3) ? null : strOptString3, null, strOptString4, strOptString7, strOptString9, strOptString8, strOptString10, strOptString11, strOptString12, Long.valueOf(jOptLong4));
                } else {
                    c2591hA = null;
                }
            } else {
                c2591hA = C2591H.b(Long.valueOf(jOptLong), Long.valueOf(jOptLong3), strOptString4, strOptString10, strOptString11);
            }
            if (c2591hA != null) {
                if (!j6.d.a().p0()) {
                    if (j6.d.a().v0()) {
                        LoggingProtocol.h().c("experience_launch_begin");
                    } else {
                        LoggingProtocol.h().c("gamejoin_begin");
                    }
                }
                j(c2591hA, activity);
                E6.h.b().j(activity);
            }
        }
    }

    private static void c(C2591H c2591h, Activity activity) {
        int iMyPid = Process.myPid();
        boolean zIsDebuggerConnected = Debug.isDebuggerConnected();
        if (c2591h != null) {
            long jO = c2591h.o();
            StringBuilder sb = new StringBuilder();
            sb.append("Launching PlaceId:");
            sb.append(jO);
            sb.append(" Pid:");
            sb.append(iMyPid);
            sb.append(" Debugger:");
            sb.append(zIsDebuggerConnected ? "attached" : "none");
            h7.l.g("ActivityUtils", sb.toString());
        }
        C2374w.h().f().q(activity, c2591h, 20104);
    }

    public static void d(Activity activity, String str, boolean z7) {
        activity.startActivity(a(activity, str, activity.getString(M.f19587D), true, z7, true));
        activity.overridePendingTransition(E.f19431b, R.anim.fade_out);
    }

    public static void e(Activity activity, String str, int i7, boolean z7, boolean z8) {
        h(activity, str, activity.getString(i7), z7, z8);
    }

    public static void f(Activity activity, String str, String str2) {
        i(activity, str, str2, false, false, false);
    }

    public static void g(Activity activity, String str, String str2, String str3) {
        Intent intentA = a(activity, str, str2, true, true, true);
        if (str3 != null) {
            intentA.putExtra("SEARCH_PARAMS", str3);
        }
        k(activity, intentA, true);
    }

    public static void h(Activity activity, String str, String str2, boolean z7, boolean z8) {
        i(activity, str, str2, z7, z8, false);
    }

    public static void i(Activity activity, String str, String str2, boolean z7, boolean z8, boolean z9) {
        k(activity, a(activity, str, str2, z7, z8, z9), z7);
    }

    public static void j(C2591H c2591h, Activity activity) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        a0.f19896q = true;
        h7.l.a("GameLaunch", "startLaunchGame: activity=" + activity);
        c(c2591h, activity);
    }

    public static void k(Activity activity, Intent intent, boolean z7) {
        activity.startActivityForResult(intent, 20110);
        if (z7 || NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overridePendingTransition(E.f19431b, R.anim.fade_out);
        }
    }
}
