package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D2.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import s2.o;
import s2.t;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static void b() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        t.f(context);
        o.a aVarD = o.a().b(queryParameter).d(a.b(iIntValue));
        if (queryParameter2 != null) {
            aVarD.c(Base64.decode(queryParameter2, 0));
        }
        t.c().e().v(aVarD.a(), i7, new s2.a());
    }
}
