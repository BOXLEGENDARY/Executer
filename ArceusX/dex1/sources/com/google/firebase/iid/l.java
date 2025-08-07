package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

final class l extends BroadcastReceiver {

    private m f19056a;

    public l(m mVar) {
        this.f19056a = mVar;
    }

    public final void a() {
        if (FirebaseInstanceId.v()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f19056a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        m mVar = this.f19056a;
        if (mVar != null && mVar.b()) {
            if (FirebaseInstanceId.v()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.l(this.f19056a, 0L);
            this.f19056a.a().unregisterReceiver(this);
            this.f19056a = null;
        }
    }
}
