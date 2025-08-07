package u3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n3.C2651i;
import n3.InterfaceC2640P;
import v3.m;
import x3.C2989c;

public class C2928b {

    private static final Object f23904b = new Object();

    private static volatile C2928b f23905c;

    public final ConcurrentHashMap f23906a = new ConcurrentHashMap();

    private C2928b() {
    }

    public static C2928b b() {
        if (f23905c == null) {
            synchronized (f23904b) {
                try {
                    if (f23905c == null) {
                        f23905c = new C2928b();
                    }
                } finally {
                }
            }
        }
        C2928b c2928b = f23905c;
        C2651i.l(c2928b);
        return c2928b;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z7, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2989c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i7, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f23906a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i7, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.f23906a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC2640P);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!m.k() || executor == null) ? context.bindService(intent, serviceConnection, i7) : context.bindService(intent, i7, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i7) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i7, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f23906a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f23906a.get(serviceConnection));
        } finally {
            this.f23906a.remove(serviceConnection);
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
