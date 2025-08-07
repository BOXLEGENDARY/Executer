package N;

import M.C;
import M.RunnableC0515k;
import M.RunnableC0517m;
import M.S;
import O.d;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.InterfaceC2984a;
import z.C3041c0;
import z.C3043d0;
import z.C3070z;
import z.F0;
import z.p0;
import z.u0;

public class o implements S, SurfaceTexture.OnFrameAvailableListener {

    final Map<u0, Surface> f2523A;

    private SurfaceTexture f2524B;

    private SurfaceTexture f2525C;

    private final c f2526d;

    final HandlerThread f2527e;

    private final Executor f2528i;

    final Handler f2529v;

    private int f2530w;

    private boolean f2531y;

    private final AtomicBoolean f2532z;

    public static class a {

        private static aa.n<C3070z, C3041c0, C3041c0, S> f2533a = new aa.n() {
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((C3070z) obj, (C3041c0) obj2, (C3041c0) obj3);
            }
        };

        public static S a(C3070z c3070z, C3041c0 c3041c0, C3041c0 c3041c02) {
            return (S) f2533a.invoke(c3070z, c3041c0, c3041c02);
        }
    }

    o(C3070z c3070z, C3041c0 c3041c0, C3041c0 c3041c02) {
        this(c3070z, Collections.emptyMap(), c3041c0, c3041c02);
    }

    private void n() {
        if (this.f2531y && this.f2530w == 0) {
            Iterator<u0> it = this.f2523A.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f2523A.clear();
            this.f2526d.k();
            this.f2527e.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() {
            @Override
            public final void run() {
                o.r();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f2528i.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f2517d.s(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e7) {
            C3043d0.m("DualSurfaceProcessor", "Unable to executor runnable", e7);
            runnable2.run();
        }
    }

    private void q(final C3070z c3070z, final Map<d.e, C> map) throws ExecutionException, InterruptedException {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f2506a.u(c3070z, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e7) {
            e = e7;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    public static void r() {
    }

    public void s(Runnable runnable, Runnable runnable2) {
        if (this.f2531y) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public void t(C3070z c3070z, Map map, c.a aVar) throws Throwable {
        try {
            this.f2526d.h(c3070z, map);
            aVar.c(null);
        } catch (RuntimeException e7) {
            aVar.f(e7);
        }
    }

    public Object u(final C3070z c3070z, final Map map, final c.a aVar) throws Exception {
        o(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f2511d.t(c3070z, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public void v(SurfaceTexture surfaceTexture, Surface surface, F0.g gVar) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f2530w--;
        n();
    }

    public void w(F0 f02) throws ExecutionException, InterruptedException {
        this.f2530w++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2526d.t(f02.s()));
        surfaceTexture.setDefaultBufferSize(f02.p().getWidth(), f02.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        f02.D(surface, this.f2528i, new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f2520a.v(surfaceTexture, surface, (F0.g) obj);
            }
        });
        if (f02.s()) {
            this.f2524B = surfaceTexture;
        } else {
            this.f2525C = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this, this.f2529v);
        }
    }

    public void x(u0 u0Var, u0.b bVar) {
        u0Var.close();
        Surface surfaceRemove = this.f2523A.remove(u0Var);
        if (surfaceRemove != null) {
            this.f2526d.r(surfaceRemove);
        }
    }

    public void y(final u0 u0Var) {
        Surface surfaceO = u0Var.o(this.f2528i, new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f2515a.x(u0Var, (u0.b) obj);
            }
        });
        this.f2526d.j(surfaceO);
        this.f2523A.put(u0Var, surfaceO);
    }

    public void z() {
        this.f2531y = true;
        n();
    }

    @Override
    public void a() {
        if (this.f2532z.getAndSet(true)) {
            return;
        }
        o(new Runnable() {
            @Override
            public final void run() {
                this.f2503d.z();
            }
        });
    }

    @Override
    public void b(final F0 f02) throws p0 {
        if (this.f2532z.get()) {
            f02.G();
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() throws ExecutionException, InterruptedException {
                this.f2504d.w(f02);
            }
        };
        Objects.requireNonNull(f02);
        p(runnable, new RunnableC0517m(f02));
    }

    @Override
    public void c(final u0 u0Var) throws p0 {
        if (this.f2532z.get()) {
            u0Var.close();
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f2509d.y(u0Var);
            }
        };
        Objects.requireNonNull(u0Var);
        p(runnable, new RunnableC0515k(u0Var));
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f2532z.get() || (surfaceTexture2 = this.f2524B) == null || this.f2525C == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f2525C.updateTexImage();
        for (Map.Entry<u0, Surface> entry : this.f2523A.entrySet()) {
            Surface value = entry.getValue();
            u0 key = entry.getKey();
            if (key.i() == 34) {
                try {
                    this.f2526d.v(surfaceTexture.getTimestamp(), value, key, this.f2524B, this.f2525C);
                } catch (RuntimeException e7) {
                    C3043d0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e7);
                }
            }
        }
    }

    o(C3070z c3070z, Map<d.e, C> map, C3041c0 c3041c0, C3041c0 c3041c02) throws ExecutionException, InterruptedException {
        this.f2530w = 0;
        this.f2531y = false;
        this.f2532z = new AtomicBoolean(false);
        this.f2523A = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f2527e = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f2529v = handler;
        this.f2528i = F.a.e(handler);
        this.f2526d = new c(c3041c0, c3041c02);
        try {
            q(c3070z, map);
        } catch (RuntimeException e7) {
            a();
            throw e7;
        }
    }
}
