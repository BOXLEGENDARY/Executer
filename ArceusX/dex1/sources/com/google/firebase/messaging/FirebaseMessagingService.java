package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.C2350h;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends f {

    public static final int f19122d = 0;
    private static final Queue<String> zza = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override
    protected final Intent zza(Intent intent) {
        return C2350h.b().e();
    }

    @Override
    public final boolean zzb(Intent intent) throws PendingIntent.CanceledException {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!b.e(intent)) {
            return true;
        }
        b.c(intent);
        return true;
    }

    @Override
    public final void zzc(android.content.Intent r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzc(android.content.Intent):void");
    }
}
