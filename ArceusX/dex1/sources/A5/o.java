package a5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import w3.ThreadFactoryC2969b;

public final class o {

    private static o f8367e;

    private final Context f8368a;

    private final ScheduledExecutorService f8369b;

    private p f8370c = new p(this);

    private int f8371d = 1;

    private o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8369b = scheduledExecutorService;
        this.f8368a = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i7;
        i7 = this.f8371d;
        this.f8371d = i7 + 1;
        return i7;
    }

    public static synchronized o b(Context context) {
        try {
            if (f8367e == null) {
                f8367e = new o(context, L3.a.a().a(1, new ThreadFactoryC2969b("MessengerIpcClient"), L3.f.f2043a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8367e;
    }

    private final synchronized <T> Task<T> e(i<T> iVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.f8370c.d(iVar)) {
                p pVar = new p(this);
                this.f8370c = pVar;
                pVar.d(iVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iVar.f8356b.a();
    }

    public final Task<Void> d(int i7, Bundle bundle) {
        return e(new C1583f(a(), 2, bundle));
    }

    public final Task<Bundle> f(int i7, Bundle bundle) {
        return e(new k(a(), 1, bundle));
    }
}
