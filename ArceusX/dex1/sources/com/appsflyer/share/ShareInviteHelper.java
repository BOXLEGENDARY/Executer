package com.appsflyer.share;

import S5.Cg.XjqcfAbdbc;
import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1zSDK;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.util.HashMap;
import java.util.Map;
import ka.oik.UJEa;

public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString(GObvYfBKohxpYX.PShypRU);
        String string2 = AppsFlyerProperties.getInstance().getString(UJEa.KRKMCdFuJqIi);
        LinkGenerator linkGeneratorAddParameter = new LinkGenerator("af_app_invites").setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId((String) AFa1zSDK.AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis())).addParameter("af_siteid", context.getPackageName());
        String string3 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_SCHEME);
        if (string3 != null && string3.length() > 3) {
            linkGeneratorAddParameter.setBaseDeeplink(string3);
        }
        return linkGeneratorAddParameter;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        LinkGenerator linkGeneratorGenerateInviteUrl = generateInviteUrl(context);
        linkGeneratorGenerateInviteUrl.addParameters(map);
        AFLogger.afDebugLog(XjqcfAbdbc.pSj.concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder("[Invite] Generated URL: ");
        sb.append(linkGeneratorGenerateInviteUrl.generateLink());
        AFLogger.afDebugLog(sb.toString());
        String mediaSource = linkGeneratorGenerateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = AFInAppEventType.INVITE;
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = AFInAppEventType.SHARE;
        }
        HashMap map2 = new HashMap();
        if (linkGeneratorGenerateInviteUrl.getUserParams() != null) {
            map2.putAll(linkGeneratorGenerateInviteUrl.getUserParams());
        }
        map2.put(AFInAppEventParameterName.AF_CHANNEL, str);
        AppsFlyerLib.getInstance().logEvent(context, mediaSource, map2);
    }
}
