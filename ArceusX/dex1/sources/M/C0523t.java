package M;

import O.d;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.BAKp.xAQOwX;
import n.InterfaceC2621a;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.C3070z;
import z.F0;
import z.u0;

public class C0523t implements S, SurfaceTexture.OnFrameAvailableListener {

    final Map<u0, Surface> f2302A;

    private int f2303B;

    private boolean f2304C;

    private final List<b> f2305D;

    private final C0529z f2306d;

    final HandlerThread f2307e;

    private final Executor f2308i;

    final Handler f2309v;

    private final AtomicBoolean f2310w;

    private final float[] f2311y;

    private final float[] f2312z;

    public static class a {

        private static InterfaceC2621a<C3070z, S> f2313a = new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return new C0523t((C3070z) obj);
            }
        };

        public static S a(C3070z c3070z) {
            return f2313a.apply(c3070z);
        }
    }

    static abstract class b {
        b() {
        }

        static C0505a d(int i7, int i8, c.a<Void> aVar) {
            return new C0505a(i7, i8, aVar);
        }

        abstract c.a<Void> a();

        abstract int b();

        abstract int c();
    }

    C0523t(C3070z c3070z) {
        this(c3070z, Collections.emptyMap());
    }

    public void A(C3070z c3070z, Map map, c.a aVar) throws Throwable {
        try {
            this.f2306d.h(c3070z, map);
            aVar.c(null);
        } catch (RuntimeException e7) {
            aVar.f(e7);
        }
    }

    public void B(F0 f02, F0.h hVar) {
        d.e eVar = d.e.DEFAULT;
        if (f02.n().d() && hVar.e()) {
            eVar = d.e.YUV;
        }
        this.f2306d.o(eVar);
    }

    public void C(F0 f02, SurfaceTexture surfaceTexture, Surface surface, F0.g gVar) {
        f02.k();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f2303B--;
        r();
    }

    public void D(final F0 f02) throws ExecutionException, InterruptedException {
        this.f2303B++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2306d.g());
        surfaceTexture.setDefaultBufferSize(f02.p().getWidth(), f02.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        f02.E(this.f2308i, new F0.i() {
            @Override
            public final void a(F0.h hVar) {
                this.f2292a.B(f02, hVar);
            }
        });
        f02.D(surface, this.f2308i, new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f2294a.C(f02, surfaceTexture, surface, (F0.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f2309v);
    }

    public void E(u0 u0Var, u0.b bVar) {
        u0Var.close();
        Surface surfaceRemove = this.f2302A.remove(u0Var);
        if (surfaceRemove != null) {
            this.f2306d.r(surfaceRemove);
        }
    }

    public void F(final u0 u0Var) {
        Surface surfaceO = u0Var.o(this.f2308i, new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f2290a.E(u0Var, (u0.b) obj);
            }
        });
        this.f2306d.j(surfaceO);
        this.f2302A.put(u0Var, surfaceO);
    }

    public void G() {
        this.f2304C = true;
        r();
    }

    public void H(b bVar) {
        this.f2305D.add(bVar);
    }

    public static void I(c.a aVar) {
        aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    public Object J(int i7, int i8, final c.a aVar) throws Exception {
        final C0505a c0505aD = b.d(i7, i8, aVar);
        t(new Runnable() {
            @Override
            public final void run() {
                this.f2280d.H(c0505aD);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                C0523t.I(aVar);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void K(P9.s<Surface, Size, float[]> sVar) throws IOException {
        if (this.f2305D.isEmpty()) {
            return;
        }
        if (sVar == null) {
            u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f2305D.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapV = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (iC != next.c() || bitmapV == null) {
                        iC = next.c();
                        if (bitmapV != null) {
                            bitmapV.recycle();
                        }
                        bitmapV = v((Size) sVar.e(), (float[]) sVar.f(), iC);
                        iB = -1;
                    }
                    if (iB != next.b()) {
                        byteArrayOutputStream.reset();
                        iB = next.b();
                        bitmapV.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surface = (Surface) sVar.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.q(surface, byteArray);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e7) {
            u(e7);
        }
    }

    private void r() {
        if (this.f2304C && this.f2303B == 0) {
            Iterator<u0> it = this.f2302A.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f2305D.iterator();
            while (it2.hasNext()) {
                it2.next().a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f2302A.clear();
            this.f2306d.k();
            this.f2307e.quit();
        }
    }

    private void s(Runnable runnable) {
        t(runnable, new Runnable() {
            @Override
            public final void run() {
                C0523t.x();
            }
        });
    }

    private void t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f2308i.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f2274d.y(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e7) {
            C3043d0.m(xAQOwX.FcnquoHvhFGXVKE, "Unable to executor runnable", e7);
            runnable2.run();
        }
    }

    private void u(Throwable th) {
        Iterator<b> it = this.f2305D.iterator();
        while (it.hasNext()) {
            it.next().a().f(th);
        }
        this.f2305D.clear();
    }

    private Bitmap v(Size size, float[] fArr, int i7) {
        float[] fArr2 = (float[]) fArr.clone();
        E.m.c(fArr2, i7, 0.5f, 0.5f);
        E.m.d(fArr2, 0.5f);
        return this.f2306d.p(E.q.q(size, i7), fArr2);
    }

    private void w(final C3070z c3070z, final Map<d.e, C> map) throws ExecutionException, InterruptedException {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f2271a.z(c3070z, map, aVar);
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

    public static void x() {
    }

    public void y(Runnable runnable, Runnable runnable2) {
        if (this.f2304C) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public Object z(final C3070z c3070z, final Map map, final c.a aVar) throws Exception {
        s(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f2298d.A(c3070z, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    @Override
    public void a() {
        if (this.f2310w.getAndSet(true)) {
            return;
        }
        s(new Runnable() {
            @Override
            public final void run() {
                this.f2289d.G();
            }
        });
    }

    @Override
    public void b(final F0 f02) {
        if (this.f2310w.get()) {
            f02.G();
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() throws ExecutionException, InterruptedException {
                this.f2286d.D(f02);
            }
        };
        Objects.requireNonNull(f02);
        t(runnable, new RunnableC0517m(f02));
    }

    @Override
    public void c(final u0 u0Var) {
        if (this.f2310w.get()) {
            u0Var.close();
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f2283d.F(u0Var);
            }
        };
        Objects.requireNonNull(u0Var);
        t(runnable, new RunnableC0515k(u0Var));
    }

    @Override
    public com.google.common.util.concurrent.p<Void> d(final int i7, final int i8) {
        return G.n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f2277a.J(i7, i8, aVar);
            }
        }));
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.f2310w.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f2311y);
        P9.s<Surface, Size, float[]> sVar = null;
        for (Map.Entry<u0, Surface> entry : this.f2302A.entrySet()) {
            Surface value = entry.getValue();
            u0 key = entry.getKey();
            key.D(this.f2312z, this.f2311y);
            if (key.i() == 34) {
                try {
                    this.f2306d.n(surfaceTexture.getTimestamp(), this.f2312z, value);
                } catch (RuntimeException e7) {
                    C3043d0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e7);
                }
            } else {
                x0.g.j(key.i() == 256, "Unsupported format: " + key.i());
                x0.g.j(sVar == null, "Only one JPEG output is supported.");
                sVar = new P9.s<>(value, key.h(), (float[]) this.f2312z.clone());
            }
        }
        try {
            K(sVar);
        } catch (RuntimeException e8) {
            u(e8);
        }
    }

    C0523t(C3070z c3070z, Map<d.e, C> map) throws ExecutionException, InterruptedException {
        this.f2310w = new AtomicBoolean(false);
        this.f2311y = new float[16];
        this.f2312z = new float[16];
        this.f2302A = new LinkedHashMap();
        this.f2303B = 0;
        this.f2304C = false;
        this.f2305D = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f2307e = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f2309v = handler;
        this.f2308i = F.a.e(handler);
        this.f2306d = new C0529z();
        try {
            w(c3070z, map);
        } catch (RuntimeException e7) {
            a();
            throw e7;
        }
    }
}
