package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import u3.C2928b;
import w3.ThreadFactoryC2969b;

public final class q implements ServiceConnection {

    private final Context f19066d;

    private final Intent f19067e;

    private final ScheduledExecutorService f19068i;

    private final Queue<s> f19069v;

    private p f19070w;

    private boolean f19071y;

    public q(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC2969b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "flush queue called");
            }
            while (!this.f19069v.isEmpty()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "found intent to be delivered");
                }
                p pVar = this.f19070w;
                if (pVar == null || !pVar.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        boolean z7 = !this.f19071y;
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("binder is dead. start connection? ");
                        sb.append(z7);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    if (!this.f19071y) {
                        this.f19071y = true;
                        try {
                        } catch (SecurityException e7) {
                            Log.e("FirebaseInstanceId", "Exception while binding the service", e7);
                        }
                        if (C2928b.b().a(this.f19066d, this.f19067e, this, 65)) {
                            return;
                        }
                        Log.e("FirebaseInstanceId", "binding to the service failed");
                        this.f19071y = false;
                        c();
                    }
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                }
                this.f19070w.a(this.f19069v.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void c() {
        while (!this.f19069v.isEmpty()) {
            this.f19069v.poll().a();
        }
    }

    public final synchronized void b(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            this.f19069v.add(new s(intent, pendingResult, this.f19068i));
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            this.f19071y = false;
            if (iBinder instanceof p) {
                this.f19070w = (p) iBinder;
                a();
                return;
            }
            String strValueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(strValueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            c();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        a();
    }

    private q(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f19069v = new ArrayDeque();
        this.f19071y = false;
        Context applicationContext = context.getApplicationContext();
        this.f19066d = applicationContext;
        this.f19067e = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f19068i = scheduledExecutorService;
    }
}
