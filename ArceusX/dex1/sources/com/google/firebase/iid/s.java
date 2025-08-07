package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class s {

    final Intent f19074a;

    private final BroadcastReceiver.PendingResult f19075b;

    private boolean f19076c = false;

    private final ScheduledFuture<?> f19077d;

    s(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f19074a = intent;
        this.f19075b = pendingResult;
        this.f19077d = scheduledExecutorService.schedule(new Runnable(this, intent) {

            private final s f19072d;

            private final Intent f19073e;

            {
                this.f19072d = this;
                this.f19073e = intent;
            }

            @Override
            public final void run() {
                s sVar = this.f19072d;
                String action = this.f19073e.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseInstanceId", sb.toString());
                sVar.a();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    final synchronized void a() {
        if (!this.f19076c) {
            this.f19075b.finish();
            this.f19077d.cancel(false);
            this.f19076c = true;
        }
    }
}
