package Q4;

import S4.C1529d;
import S4.n;
import S4.w;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1801a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import g0.C2457a;
import i5.C2488a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2649g;
import n3.C2651i;
import v3.m;
import v3.p;

public class c {

    private static final Object f4847j = new Object();

    private static final Executor f4848k = new d();

    static final Map<String, c> f4849l = new C2457a();

    private final Context f4850a;

    private final String f4851b;

    private final i f4852c;

    private final n f4853d;

    private final w<C2488a> f4856g;

    private final AtomicBoolean f4854e = new AtomicBoolean(false);

    private final AtomicBoolean f4855f = new AtomicBoolean();

    private final List<b> f4857h = new CopyOnWriteArrayList();

    private final List<Object> f4858i = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z7);
    }

    private static class C0044c implements ComponentCallbacks2C1801a.InterfaceC0151a {

        private static AtomicReference<C0044c> f4859a = new AtomicReference<>();

        private C0044c() {
        }

        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4859a.get() == null) {
                    C0044c c0044c = new C0044c();
                    if (a0.g.a(f4859a, null, c0044c)) {
                        ComponentCallbacks2C1801a.c(application);
                        ComponentCallbacks2C1801a.b().a(c0044c);
                    }
                }
            }
        }

        @Override
        public void a(boolean z7) {
            synchronized (c.f4847j) {
                try {
                    Iterator it = new ArrayList(c.f4849l.values()).iterator();
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        if (cVar.f4854e.get()) {
                            cVar.u(z7);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class d implements Executor {

        private static final Handler f4860d = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override
        public void execute(Runnable runnable) {
            f4860d.post(runnable);
        }
    }

    private static class e extends BroadcastReceiver {

        private static AtomicReference<e> f4861b = new AtomicReference<>();

        private final Context f4862a;

        public e(Context context) {
            this.f4862a = context;
        }

        public static void b(Context context) {
            if (f4861b.get() == null) {
                e eVar = new e(context);
                if (a0.g.a(f4861b, null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f4862a.unregisterReceiver(this);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            synchronized (c.f4847j) {
                try {
                    Iterator<c> it = c.f4849l.values().iterator();
                    while (it.hasNext()) {
                        it.next().m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected c(final Context context, String str, i iVar) {
        this.f4850a = (Context) C2651i.l(context);
        this.f4851b = C2651i.f(str);
        this.f4852c = (i) C2651i.l(iVar);
        this.f4853d = n.h(f4848k).d(S4.g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(C1529d.p(context, Context.class, new Class[0])).b(C1529d.p(this, c.class, new Class[0])).b(C1529d.p(iVar, i.class, new Class[0])).e();
        this.f4856g = new w<>(new c5.b() {
            @Override
            public final Object get() {
                return this.f4845a.s(context);
            }
        });
    }

    private void f() {
        C2651i.q(!this.f4855f.get(), "FirebaseApp was deleted");
    }

    public static c i() {
        c cVar;
        synchronized (f4847j) {
            try {
                cVar = f4849l.get("[DEFAULT]");
                if (cVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public void m() {
        if (u0.n.a(this.f4850a)) {
            Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + j());
            this.f4853d.k(r());
            return;
        }
        Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + j());
        e.b(this.f4850a);
    }

    public static c n(Context context) {
        synchronized (f4847j) {
            try {
                if (f4849l.containsKey("[DEFAULT]")) {
                    return i();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return o(context, iVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static c o(Context context, i iVar) {
        return p(context, iVar, "[DEFAULT]");
    }

    public static c p(Context context, i iVar, String str) {
        c cVar;
        C0044c.c(context);
        String strT = t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4847j) {
            Map<String, c> map = f4849l;
            C2651i.q(!map.containsKey(strT), "FirebaseApp name " + strT + " already exists!");
            C2651i.m(context, "Application context cannot be null.");
            cVar = new c(context, strT, iVar);
            map.put(strT, cVar);
        }
        cVar.m();
        return cVar;
    }

    public C2488a s(Context context) {
        return new C2488a(context, l(), (Y4.c) this.f4853d.a(Y4.c.class));
    }

    private static String t(String str) {
        return str.trim();
    }

    public void u(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f4857h.iterator();
        while (it.hasNext()) {
            it.next().a(z7);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f4851b.equals(((c) obj).j());
        }
        return false;
    }

    public <T> T g(Class<T> cls) {
        f();
        return (T) this.f4853d.a(cls);
    }

    public Context h() {
        f();
        return this.f4850a;
    }

    public int hashCode() {
        return this.f4851b.hashCode();
    }

    public String j() {
        f();
        return this.f4851b;
    }

    public i k() {
        f();
        return this.f4852c;
    }

    public String l() {
        return v3.c.b(j().getBytes(Charset.defaultCharset())) + "+" + v3.c.b(k().c().getBytes(Charset.defaultCharset()));
    }

    public boolean q() {
        f();
        return this.f4856g.get().b();
    }

    public boolean r() {
        return "[DEFAULT]".equals(j());
    }

    public String toString() {
        return C2649g.d(this).a("name", this.f4851b).a("options", this.f4852c).toString();
    }
}
