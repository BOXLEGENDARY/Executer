package com.roblox.client.sms;

import Wa.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.roblox.client.W;
import g6.o;
import h7.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMSBroadcastReceiver extends W {

    final Pattern f20250a = Pattern.compile("(\\d{6})");

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            l.g("SMSBroadcastReceiver", "Status: " + status);
            int iO = status.o();
            if (iO != 0) {
                if (iO != 15) {
                    return;
                }
                l.g("SMSBroadcastReceiver", "Timeout");
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            l.g("SMSBroadcastReceiver", "Message: " + str);
            if (TextUtils.isEmpty(str)) {
                l.g("SMSBroadcastReceiver", "Wrong format. Message: " + str);
                return;
            }
            Matcher matcher = this.f20250a.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(0);
                if (TextUtils.isEmpty(strGroup) || strGroup.length() != 6) {
                    return;
                }
                l.g("SMSBroadcastReceiver", "code: " + strGroup);
                c.d().j(new o(strGroup));
            }
        }
    }
}
