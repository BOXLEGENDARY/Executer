package z;

import C.O0;
import C.P0;
import C.Q0;
import C.p1;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import n.InterfaceC2621a;
import t2.Dbl.hgESaf;
import z.C3067w;
import z.r0;

public final class C3066v {

    private static final Object f24727o = new Object();

    private static final SparseArray<Integer> f24728p = new SparseArray<>();

    final C.N f24729a;

    private final Object f24730b;

    private final C3067w f24731c;

    private final Executor f24732d;

    private final Handler f24733e;

    private final HandlerThread f24734f;

    private C.H f24735g;

    private C.G f24736h;

    private p1 f24737i;

    private final r0 f24738j;

    private final com.google.common.util.concurrent.p<Void> f24739k;

    private a f24740l;

    private com.google.common.util.concurrent.p<Void> f24741m;

    private final Integer f24742n;

    private enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C3066v(Context context, C3067w.b bVar) {
        this(context, bVar, new Q0());
    }

    private static C3067w.b g(Context context) {
        ComponentCallbacks2 componentCallbacks2B = E.e.b(context);
        if (componentCallbacks2B instanceof C3067w.b) {
            return (C3067w.b) componentCallbacks2B;
        }
        try {
            Context contextA = E.e.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C3067w.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            C3043d0.c("CameraX", hgESaf.GxuMwDnk);
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            e = e7;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e8) {
            e = e8;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e9) {
            e = e9;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e10) {
            e = e10;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e11) {
            e = e11;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            C3043d0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void j(Integer num) {
        synchronized (f24727o) {
            try {
                if (num == null) {
                    return;
                }
                x0.g.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f24728p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k(final Executor executor, final long j7, final int i7, final Context context, final c.a<Void> aVar) {
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24714d.n(context, executor, i7, aVar, j7);
            }
        });
    }

    private com.google.common.util.concurrent.p<Void> l(final Context context) {
        com.google.common.util.concurrent.p<Void> pVarA;
        synchronized (this.f24730b) {
            x0.g.j(this.f24740l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f24740l = a.INITIALIZING;
            pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f24710a.o(context, aVar);
                }
            });
        }
        return pVarA;
    }

    public void m(Executor executor, long j7, int i7, Context context, c.a aVar) {
        k(executor, j7, i7 + 1, context, aVar);
    }

    public void n(android.content.Context r17, final java.util.concurrent.Executor r18, final int r19, final androidx.concurrent.futures.c.a r20, final long r21) {
        throw new UnsupportedOperationException("Method not decompiled: z.C3066v.n(android.content.Context, java.util.concurrent.Executor, int, androidx.concurrent.futures.c$a, long):void");
    }

    public Object o(Context context, c.a aVar) throws Exception {
        k(this.f24732d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    private void p() {
        synchronized (this.f24730b) {
            this.f24740l = a.INITIALIZED;
        }
    }

    private void q(r0.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (h1.a.d()) {
            h1.a.f("CX:CameraProvider-RetryStatus", bVar != null ? bVar.d() : -1);
        }
    }

    private static void r() {
        SparseArray<Integer> sparseArray = f24728p;
        if (sparseArray.size() == 0) {
            C3043d0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            C3043d0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            C3043d0.j(4);
        } else if (sparseArray.get(5) != null) {
            C3043d0.j(5);
        } else if (sparseArray.get(6) != null) {
            C3043d0.j(6);
        }
    }

    private static void s(Context context, O0 o02, InterfaceC2621a<Context, O0> interfaceC2621a) {
        if (o02 != null) {
            C3043d0.a("CameraX", "QuirkSettings from CameraXConfig: " + o02);
        } else {
            o02 = interfaceC2621a.apply(context);
            C3043d0.a("CameraX", "QuirkSettings from app metadata: " + o02);
        }
        if (o02 == null) {
            o02 = P0.f422b;
            C3043d0.a("CameraX", "QuirkSettings by default: " + o02);
        }
        P0.b().d(o02);
    }

    public C.G d() {
        C.G g7 = this.f24736h;
        if (g7 != null) {
            return g7;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public C.H e() {
        C.H h7 = this.f24735g;
        if (h7 != null) {
            return h7;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public C.N f() {
        return this.f24729a;
    }

    public p1 h() {
        p1 p1Var = this.f24737i;
        if (p1Var != null) {
            return p1Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public com.google.common.util.concurrent.p<Void> i() {
        return this.f24739k;
    }

    C3066v(Context context, C3067w.b bVar, InterfaceC2621a<Context, O0> interfaceC2621a) {
        this.f24729a = new C.N();
        this.f24730b = new Object();
        this.f24740l = a.UNINITIALIZED;
        this.f24741m = G.n.p(null);
        if (bVar != null) {
            this.f24731c = bVar.getCameraXConfig();
        } else {
            C3067w.b bVarG = g(context);
            if (bVarG == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f24731c = bVarG.getCameraXConfig();
        }
        s(context, this.f24731c.f0(), interfaceC2621a);
        Executor executorA0 = this.f24731c.a0(null);
        Handler handlerG0 = this.f24731c.g0(null);
        this.f24732d = executorA0 == null ? new ExecutorC3058m() : executorA0;
        if (handlerG0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f24734f = handlerThread;
            handlerThread.start();
            this.f24733e = u0.h.a(handlerThread.getLooper());
        } else {
            this.f24734f = null;
            this.f24733e = handlerG0;
        }
        Integer num = (Integer) this.f24731c.a(C3067w.f24754O, null);
        this.f24742n = num;
        j(num);
        this.f24738j = new r0.a(this.f24731c.d0()).a();
        this.f24739k = l(context);
    }
}
