package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

final class m implements Runnable {

    private final long f19057d;

    private final PowerManager.WakeLock f19058e;

    private final FirebaseInstanceId f19059i;

    private final n f19060v;

    m(FirebaseInstanceId firebaseInstanceId, a5.j jVar, n nVar, long j7) {
        this.f19059i = firebaseInstanceId;
        this.f19060v = nVar;
        this.f19057d = j7;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f19058e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    private final boolean c() throws IOException {
        j jVarO = this.f19059i.o();
        if (!this.f19059i.n(jVarO)) {
            return true;
        }
        try {
            String strS = this.f19059i.s();
            if (strS == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((jVarO == null || !strS.equals(jVarO.f19049a)) && "[DEFAULT]".equals(this.f19059i.d().j())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf = String.valueOf(this.f19059i.d().j());
                    Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", strS);
                Context contextA = a();
                Intent intent2 = new Intent(contextA, (Class<?>) FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                contextA.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e7) {
            if ("SERVICE_NOT_AVAILABLE".equals(e7.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e7.getMessage())) {
                Log.e("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            if (e7.getMessage() != null) {
                throw e7;
            }
            String message = e7.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            Log.e("FirebaseInstanceId", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.e("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public final Context a() {
        return this.f19059i.d().h();
    }

    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public final void run() {
        if (C2350h.b().c(a())) {
            this.f19058e.acquire();
        }
        try {
            try {
                this.f19059i.m(true);
                if (!this.f19059i.x()) {
                    this.f19059i.m(false);
                    if (C2350h.b().c(a())) {
                        this.f19058e.release();
                        return;
                    }
                    return;
                }
                if (C2350h.b().f(a()) && !b()) {
                    new l(this).a();
                    if (C2350h.b().c(a())) {
                        this.f19058e.release();
                        return;
                    }
                    return;
                }
                if (c() && this.f19060v.b(this.f19059i)) {
                    this.f19059i.m(false);
                } else {
                    this.f19059i.k(this.f19057d);
                }
                if (C2350h.b().c(a())) {
                    this.f19058e.release();
                }
            } catch (IOException e7) {
                String message = e7.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f19059i.m(false);
                if (C2350h.b().c(a())) {
                    this.f19058e.release();
                }
            }
        } catch (Throwable th) {
            if (C2350h.b().c(a())) {
                this.f19058e.release();
            }
            throw th;
        }
    }
}
