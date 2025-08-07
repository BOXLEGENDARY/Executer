package H4;

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
import y0.xyyu.hkVlaTTCDY;

public final class C0433f {

    private static final Map f1597o = new HashMap();

    private final Context f1598a;

    private final U f1599b;

    private final String f1600c;

    private boolean f1604g;

    private final Intent f1605h;

    private final b0 f1606i;

    private ServiceConnection f1610m;

    private IInterface f1611n;

    private final List f1601d = new ArrayList();

    private final Set f1602e = new HashSet();

    private final Object f1603f = new Object();

    private final IBinder.DeathRecipient f1608k = new IBinder.DeathRecipient() {
        @Override
        public final void binderDied() {
            C0433f.k(this.f1584a);
        }
    };

    private final AtomicInteger f1609l = new AtomicInteger(0);

    private final WeakReference f1607j = new WeakReference(null);

    public C0433f(Context context, U u7, String str, Intent intent, b0 b0Var, a0 a0Var) {
        this.f1598a = context;
        this.f1599b = u7;
        this.f1600c = str;
        this.f1605h = intent;
        this.f1606i = b0Var;
    }

    public static void k(C0433f c0433f) {
        c0433f.f1599b.c("reportBinderDeath", new Object[0]);
        a0 a0Var = (a0) c0433f.f1607j.get();
        if (a0Var != null) {
            c0433f.f1599b.c("calling onBinderDied", new Object[0]);
            a0Var.a();
        } else {
            c0433f.f1599b.c("%s : Binder has died.", c0433f.f1600c);
            Iterator it = c0433f.f1601d.iterator();
            while (it.hasNext()) {
                ((V) it.next()).a(c0433f.w());
            }
            c0433f.f1601d.clear();
        }
        synchronized (c0433f.f1603f) {
            c0433f.x();
        }
    }

    static void o(final C0433f c0433f, final C1574k c1574k) {
        c0433f.f1602e.add(c1574k);
        c1574k.a().addOnCompleteListener(new OnCompleteListener() {
            @Override
            public final void onComplete(Task task) {
                this.f1585a.u(c1574k, task);
            }
        });
    }

    static void q(C0433f c0433f, V v7) {
        if (c0433f.f1611n != null || c0433f.f1604g) {
            if (!c0433f.f1604g) {
                v7.run();
                return;
            } else {
                c0433f.f1599b.c("Waiting to bind to the service.", new Object[0]);
                c0433f.f1601d.add(v7);
                return;
            }
        }
        c0433f.f1599b.c(hkVlaTTCDY.XAeeCMdyRZR, new Object[0]);
        c0433f.f1601d.add(v7);
        ServiceConnectionC0432e serviceConnectionC0432e = new ServiceConnectionC0432e(c0433f, null);
        c0433f.f1610m = serviceConnectionC0432e;
        c0433f.f1604g = true;
        if (c0433f.f1598a.bindService(c0433f.f1605h, serviceConnectionC0432e, 1)) {
            return;
        }
        c0433f.f1599b.c("Failed to bind to the service.", new Object[0]);
        c0433f.f1604g = false;
        Iterator it = c0433f.f1601d.iterator();
        while (it.hasNext()) {
            ((V) it.next()).a(new C0434g());
        }
        c0433f.f1601d.clear();
    }

    static void r(C0433f c0433f) throws RemoteException {
        c0433f.f1599b.c("linkToDeath", new Object[0]);
        try {
            c0433f.f1611n.asBinder().linkToDeath(c0433f.f1608k, 0);
        } catch (RemoteException e7) {
            c0433f.f1599b.b(e7, "linkToDeath failed", new Object[0]);
        }
    }

    static void s(C0433f c0433f) {
        c0433f.f1599b.c("unlinkToDeath", new Object[0]);
        c0433f.f1611n.asBinder().unlinkToDeath(c0433f.f1608k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f1600c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f1602e.iterator();
        while (it.hasNext()) {
            ((C1574k) it.next()).d(w());
        }
        this.f1602e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f1597o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f1600c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1600c, 10);
                    handlerThread.start();
                    map.put(this.f1600c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f1600c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f1611n;
    }

    public final void t(V v7, C1574k c1574k) {
        c().post(new Y(this, v7.c(), c1574k, v7));
    }

    final void u(C1574k c1574k, Task task) {
        synchronized (this.f1603f) {
            this.f1602e.remove(c1574k);
        }
    }

    public final void v(C1574k c1574k) {
        synchronized (this.f1603f) {
            this.f1602e.remove(c1574k);
        }
        c().post(new Z(this));
    }
}
