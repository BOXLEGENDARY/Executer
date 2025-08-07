package J2;

import D3.e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.common.C1820e;
import com.google.android.gms.common.C1821f;
import com.google.android.gms.common.ServiceConnectionC1800a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import n3.C2651i;
import u3.C2928b;
import ya.HnSi.PLHvHoayk;

public class a {

    private ServiceConnectionC1800a f1701a;

    private D3.d f1702b;

    private boolean f1703c;

    private final Object f1704d;

    private b f1705e;

    private final Context f1706f;

    private final boolean f1707g;

    private final long f1708h;

    public static final class C0027a {

        private final String f1709a;

        private final boolean f1710b;

        public C0027a(String str, boolean z7) {
            this.f1709a = str;
            this.f1710b = z7;
        }

        public final String a() {
            return this.f1709a;
        }

        public final boolean b() {
            return this.f1710b;
        }

        public final String toString() {
            String str = this.f1709a;
            boolean z7 = this.f1710b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z7);
            return sb.toString();
        }
    }

    static class b extends Thread {

        private WeakReference<a> f1711d;

        private long f1712e;

        CountDownLatch f1713i = new CountDownLatch(1);

        boolean f1714v = false;

        public b(a aVar, long j7) {
            this.f1711d = new WeakReference<>(aVar);
            this.f1712e = j7;
            start();
        }

        private final void a() {
            a aVar = this.f1711d.get();
            if (aVar != null) {
                aVar.a();
                this.f1714v = true;
            }
        }

        @Override
        public final void run() {
            try {
                if (this.f1713i.await(this.f1712e, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public static C0027a b(Context context) throws IllegalStateException, C1820e, C1821f, IOException {
        c cVar = new c(context);
        boolean zA = cVar.a("gads:ad_id_app_context:enabled", false);
        float fB = cVar.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String strC = cVar.c("gads:ad_id_use_shared_preference:experiment_id", BuildConfig.FLAVOR);
        a aVar = new a(context, -1L, zA, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.j(false);
            C0027a c0027aC = aVar.c();
            aVar.k(c0027aC, zA, fB, SystemClock.elapsedRealtime() - jElapsedRealtime, strC, null);
            return c0027aC;
        } finally {
        }
    }

    public static boolean d(Context context) throws C1820e, C1821f, IOException {
        c cVar = new c(context);
        a aVar = new a(context, -1L, cVar.a("gads:ad_id_app_context:enabled", false), cVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.j(false);
            return aVar.l();
        } finally {
            aVar.a();
        }
    }

    public static void e(boolean z7) {
    }

    private static D3.d g(Context context, ServiceConnectionC1800a serviceConnectionC1800a) throws IOException {
        try {
            return e.E0(serviceConnectionC1800a.a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private static ServiceConnectionC1800a h(Context context, boolean z7) throws PackageManager.NameNotFoundException, C1820e, C1821f, IOException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iH = C1819d.f().h(context, 12451000);
            if (iH != 0 && iH != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z7 ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            ServiceConnectionC1800a serviceConnectionC1800a = new ServiceConnectionC1800a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (C2928b.b().a(context, intent, serviceConnectionC1800a, 1)) {
                    return serviceConnectionC1800a;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C1820e(9);
        }
    }

    private final void i() {
        synchronized (this.f1704d) {
            b bVar = this.f1705e;
            if (bVar != null) {
                bVar.f1713i.countDown();
                try {
                    this.f1705e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f1708h > 0) {
                this.f1705e = new b(this, this.f1708h);
            }
        }
    }

    private final void j(boolean z7) throws IllegalStateException, C1820e, C1821f, IOException {
        C2651i.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f1703c) {
                    a();
                }
                ServiceConnectionC1800a serviceConnectionC1800aH = h(this.f1706f, this.f1707g);
                this.f1701a = serviceConnectionC1800aH;
                this.f1702b = g(this.f1706f, serviceConnectionC1800aH);
                this.f1703c = true;
                if (z7) {
                    i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean k(C0027a c0027a, boolean z7, float f7, long j7, String str, Throwable th) {
        if (Math.random() > f7) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z7 ? "1" : "0");
        if (c0027a != null) {
            map.put("limit_ad_tracking", c0027a.b() ? "1" : "0");
        }
        if (c0027a != null && c0027a.a() != null) {
            map.put("ad_id_size", Integer.toString(c0027a.a().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j7));
        new J2.b(this, map).start();
        return true;
    }

    private final boolean l() throws IOException {
        boolean zA;
        C2651i.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f1703c) {
                    synchronized (this.f1704d) {
                        b bVar = this.f1705e;
                        if (bVar == null || !bVar.f1714v) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        j(false);
                        if (!this.f1703c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                C2651i.l(this.f1701a);
                C2651i.l(this.f1702b);
                try {
                    zA = this.f1702b.a();
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
        return zA;
    }

    public final void a() {
        C2651i.k(PLHvHoayk.GXUaaf);
        synchronized (this) {
            try {
                if (this.f1706f == null || this.f1701a == null) {
                    return;
                }
                try {
                    if (this.f1703c) {
                        C2928b.b().c(this.f1706f, this.f1701a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f1703c = false;
                this.f1702b = null;
                this.f1701a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C0027a c() throws IOException {
        C0027a c0027a;
        C2651i.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f1703c) {
                    synchronized (this.f1704d) {
                        b bVar = this.f1705e;
                        if (bVar == null || !bVar.f1714v) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        j(false);
                        if (!this.f1703c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                C2651i.l(this.f1701a);
                C2651i.l(this.f1702b);
                try {
                    c0027a = new C0027a(this.f1702b.Z(), this.f1702b.c0(true));
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
        return c0027a;
    }

    public void f() throws IllegalStateException, C1820e, C1821f, IOException {
        j(true);
    }

    protected void finalize() throws Throwable {
        a();
        super.finalize();
    }

    private a(Context context, long j7, boolean z7, boolean z8) {
        Context applicationContext;
        this.f1704d = new Object();
        C2651i.l(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f1706f = context;
        this.f1703c = false;
        this.f1708h = j7;
        this.f1707g = z8;
    }
}
