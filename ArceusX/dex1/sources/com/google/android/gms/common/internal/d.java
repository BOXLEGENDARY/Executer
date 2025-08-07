package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import n3.C2637M;

public abstract class d {

    private static final Object f14300a = new Object();

    private static v f14301b;

    static HandlerThread f14302c;

    private static Executor f14303d;

    private static boolean f14304e;

    public static int a() {
        return 4225;
    }

    public static d b(Context context) {
        synchronized (f14300a) {
            try {
                if (f14301b == null) {
                    f14301b = new v(context.getApplicationContext(), f14304e ? c().getLooper() : context.getMainLooper(), f14303d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14301b;
    }

    public static HandlerThread c() {
        synchronized (f14300a) {
            try {
                HandlerThread handlerThread = f14302c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f14302c = handlerThread2;
                handlerThread2.start();
                return f14302c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void d(C2637M c2637m, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i7, ServiceConnection serviceConnection, String str3, boolean z7) {
        d(new C2637M(str, str2, 4225, z7), serviceConnection, str3);
    }

    protected abstract boolean f(C2637M c2637m, ServiceConnection serviceConnection, String str, Executor executor);
}
