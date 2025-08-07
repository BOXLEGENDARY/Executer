package E4;

import a4.C1574k;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class C0401g {

    private static final Map f1120o = new HashMap();

    private final Context f1121a;

    private final r0 f1122b;

    private boolean f1127g;

    private final Intent f1128h;

    private ServiceConnection f1132l;

    private IInterface f1133m;

    private final D4.r f1134n;

    private final List f1124d = new ArrayList();

    private final Set f1125e = new HashSet();

    private final Object f1126f = new Object();

    private final IBinder.DeathRecipient f1130j = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            C0401g.j(this.f1168a);
        }
    };

    private final AtomicInteger f1131k = new AtomicInteger(0);

    private final String f1123c = "SplitInstallService";

    private final WeakReference f1129i = new WeakReference(null);

    public C0401g(Context context, r0 r0Var, String str, Intent intent, D4.r rVar, InterfaceC0396b interfaceC0396b) {
        this.f1121a = context;
        this.f1122b = r0Var;
        this.f1128h = intent;
        this.f1134n = rVar;
    }

    public static void j(C0401g c0401g) {
        c0401g.f1122b.d("reportBinderDeath", new Object[0]);
        InterfaceC0396b interfaceC0396b = (InterfaceC0396b) c0401g.f1129i.get();
        if (interfaceC0396b != null) {
            c0401g.f1122b.d("calling onBinderDied", new Object[0]);
            interfaceC0396b.zza();
        } else {
            c0401g.f1122b.d("%s : Binder has died.", c0401g.f1123c);
            Iterator it = c0401g.f1124d.iterator();
            while (it.hasNext()) {
                ((s0) it.next()).b(c0401g.v());
            }
            c0401g.f1124d.clear();
        }
        synchronized (c0401g.f1126f) {
            c0401g.w();
        }
    }

    static void n(final C0401g c0401g, final C1574k c1574k) {
        c0401g.f1125e.add(c1574k);
        c1574k.a().addOnCompleteListener(new OnCompleteListener() {
            @Override
            public final void onComplete(Task task) {
                this.f1166a.t(c1574k, task);
            }
        });
    }

    static void p(C0401g c0401g, s0 s0Var) {
        if (c0401g.f1133m != null || c0401g.f1127g) {
            if (!c0401g.f1127g) {
                s0Var.run();
                return;
            } else {
                c0401g.f1122b.d("Waiting to bind to the service.", new Object[0]);
                c0401g.f1124d.add(s0Var);
                return;
            }
        }
        c0401g.f1122b.d("Initiate binding to the service.", new Object[0]);
        c0401g.f1124d.add(s0Var);
        ServiceConnectionC0400f serviceConnectionC0400f = new ServiceConnectionC0400f(c0401g, null);
        c0401g.f1132l = serviceConnectionC0400f;
        c0401g.f1127g = true;
        if (c0401g.f1121a.bindService(c0401g.f1128h, serviceConnectionC0400f, 1)) {
            return;
        }
        c0401g.f1122b.d("Failed to bind to the service.", new Object[0]);
        c0401g.f1127g = false;
        Iterator it = c0401g.f1124d.iterator();
        while (it.hasNext()) {
            ((s0) it.next()).b(new C0402h());
        }
        c0401g.f1124d.clear();
    }

    static void q(C0401g c0401g) throws RemoteException {
        c0401g.f1122b.d("linkToDeath", new Object[0]);
        try {
            c0401g.f1133m.asBinder().linkToDeath(c0401g.f1130j, 0);
        } catch (RemoteException e7) {
            c0401g.f1122b.c(e7, "linkToDeath failed", new Object[0]);
        }
    }

    static void r(C0401g c0401g) {
        c0401g.f1122b.d("unlinkToDeath", new Object[0]);
        c0401g.f1133m.asBinder().unlinkToDeath(c0401g.f1130j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f1123c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f1125e.iterator();
        while (it.hasNext()) {
            ((C1574k) it.next()).d(v());
        }
        this.f1125e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f1120o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f1123c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1123c, 10);
                    handlerThread.start();
                    map.put(this.f1123c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f1123c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f1133m;
    }

    public final void s(s0 s0Var, C1574k c1574k) {
        c().post(new v0(this, s0Var.a(), c1574k, s0Var));
    }

    final void t(C1574k c1574k, Task task) {
        synchronized (this.f1126f) {
            this.f1125e.remove(c1574k);
        }
    }

    public final void u(C1574k c1574k) {
        synchronized (this.f1126f) {
            this.f1125e.remove(c1574k);
        }
        c().post(new w0(this));
    }
}
