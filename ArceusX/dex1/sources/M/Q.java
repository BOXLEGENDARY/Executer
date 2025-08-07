package M;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.u0;

final class Q implements u0 {

    private final float[] f2222A;

    private final float[] f2223B;

    private final float[] f2224C;

    private final float[] f2225D;

    private InterfaceC2984a<u0.b> f2226E;

    private Executor f2227F;

    private final com.google.common.util.concurrent.p<Void> f2230I;

    private c.a<Void> f2231J;

    private Matrix f2232K;

    private final Surface f2234e;

    private final int f2235i;

    private final int f2236v;

    private final Size f2237w;

    private final u0.a f2238y;

    private final u0.a f2239z;

    private final Object f2233d = new Object();

    private boolean f2228G = false;

    private boolean f2229H = false;

    Q(Surface surface, int i7, int i8, Size size, u0.a aVar, u0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f2222A = fArr;
        float[] fArr2 = new float[16];
        this.f2223B = fArr2;
        float[] fArr3 = new float[16];
        this.f2224C = fArr3;
        float[] fArr4 = new float[16];
        this.f2225D = fArr4;
        this.f2234e = surface;
        this.f2235i = i7;
        this.f2236v = i8;
        this.f2237w = size;
        this.f2238y = aVar;
        this.f2239z = aVar2;
        this.f2232K = matrix;
        f(fArr, fArr3, aVar);
        f(fArr2, fArr4, aVar2);
        this.f2230I = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar3) {
                return this.f2219a.u(aVar3);
            }
        });
    }

    private static void f(float[] fArr, float[] fArr2, u0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        E.m.d(fArr, 0.5f);
        E.m.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix matrixE = E.q.e(E.q.t(aVar.c()), E.q.t(E.q.q(aVar.c(), aVar.e())), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float fWidth = rectF.width() / r1.getWidth();
        float fHeight = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        j(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void j(float[] fArr, C.J j7) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        E.m.d(fArr, 0.5f);
        if (j7 != null) {
            x0.g.j(j7.o(), "Camera has no transform.");
            E.m.c(fArr, j7.c().a(), 0.5f, 0.5f);
            if (j7.g()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    public Object u(c.a aVar) throws Exception {
        this.f2231J = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public void y(AtomicReference atomicReference) {
        ((InterfaceC2984a) atomicReference.get()).accept(u0.b.c(0, this));
    }

    public void A() {
        Executor executor;
        InterfaceC2984a<u0.b> interfaceC2984a;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f2233d) {
            try {
                if (this.f2227F == null || (interfaceC2984a = this.f2226E) == null) {
                    this.f2228G = true;
                } else if (!this.f2229H) {
                    atomicReference.set(interfaceC2984a);
                    executor = this.f2227F;
                    this.f2228G = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        this.f2220d.y(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e7) {
                C3043d0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e7);
            }
        }
    }

    @Override
    public void C(float[] fArr, float[] fArr2, boolean z7) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z7 ? this.f2222A : this.f2223B, 0);
    }

    @Override
    public void D(float[] fArr, float[] fArr2) {
        C(fArr, fArr2, true);
    }

    @Override
    public void close() {
        synchronized (this.f2233d) {
            try {
                if (!this.f2229H) {
                    this.f2229H = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2231J.c(null);
    }

    @Override
    public Size h() {
        return this.f2237w;
    }

    @Override
    public int i() {
        return this.f2236v;
    }

    public com.google.common.util.concurrent.p<Void> m() {
        return this.f2230I;
    }

    @Override
    public Surface o(Executor executor, InterfaceC2984a<u0.b> interfaceC2984a) {
        boolean z7;
        synchronized (this.f2233d) {
            this.f2227F = executor;
            this.f2226E = interfaceC2984a;
            z7 = this.f2228G;
        }
        if (z7) {
            A();
        }
        return this.f2234e;
    }
}
