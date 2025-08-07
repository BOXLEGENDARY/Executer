package E3;

import a4.C1574k;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.google.android.gms.tasks.Task;
import d3.C2384c;
import d3.InterfaceC2383b;
import j0.tkB.pkcpMQSgx;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n3.C2651i;

public final class l implements InterfaceC2383b {

    private static InterfaceC2383b f1082e;

    private final Context f1083a;

    private boolean f1084b;

    private final ScheduledExecutorService f1085c;

    private final ExecutorService f1086d;

    l(Context context) {
        this.f1084b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f1085c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f1086d = Executors.newSingleThreadExecutor();
        this.f1083a = context;
        if (this.f1084b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f1084b = true;
    }

    static synchronized InterfaceC2383b d(Context context) {
        try {
            C2651i.m(context, "Context must not be null");
            if (f1082e == null) {
                f1082e = new l(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1082e;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            int length = strValueOf.length();
            String str = pkcpMQSgx.jiugluoAiMf;
            Log.e("AppSet", length != 0 ? str.concat(strValueOf) : new String(str));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        int length2 = strValueOf2.length();
        String str2 = jUbDmI.axTde;
        Log.e("AppSet", length2 != 0 ? str2.concat(strValueOf2) : new String(str2));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) throws k {
        if (g(context).edit().putLong("app_set_id_last_used_time", v3.h.c().a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    protected final long a() {
        long j7 = g(this.f1083a).getLong("app_set_id_last_used_time", -1L);
        if (j7 != -1) {
            return j7 + 33696000000L;
        }
        return -1L;
    }

    @Override
    public final Task<C2384c> b() {
        final C1574k c1574k = new C1574k();
        this.f1086d.execute(new Runnable() {
            @Override
            public final void run() throws k {
                this.f1079d.e(c1574k);
            }
        });
        return c1574k.a();
    }

    final void e(C1574k c1574k) throws k {
        String string = g(this.f1083a).getString("app_set_id", null);
        long jA = a();
        if (string == null || v3.h.c().a() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f1083a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f1083a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", v3.h.c().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e7) {
                c1574k.b(e7);
                return;
            }
        } else {
            try {
                h(this.f1083a);
            } catch (k e8) {
                c1574k.b(e8);
                return;
            }
        }
        c1574k.c(new C2384c(string, 1));
    }
}
