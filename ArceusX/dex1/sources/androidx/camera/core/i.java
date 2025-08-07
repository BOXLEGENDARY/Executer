package androidx.camera.core;

import C.InterfaceC0353t0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.f;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import z.AbstractC3037a0;
import z.C3043d0;

abstract class i implements InterfaceC0353t0.a {

    private f.a f9456a;

    private volatile int f9457b;

    private volatile int f9458c;

    private volatile boolean f9460e;

    private volatile boolean f9461f;

    private Executor f9462g;

    private q f9463h;

    private ImageWriter f9464i;

    ByteBuffer f9469n;

    ByteBuffer f9470o;

    ByteBuffer f9471p;

    ByteBuffer f9472q;

    private volatile int f9459d = 1;

    private Rect f9465j = new Rect();

    private Rect f9466k = new Rect();

    private Matrix f9467l = new Matrix();

    private Matrix f9468m = new Matrix();

    private final Object f9473r = new Object();

    protected boolean f9474s = true;

    i() {
    }

    private void h(n nVar) {
        if (this.f9459d != 1) {
            if (this.f9459d == 2 && this.f9469n == null) {
                this.f9469n = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f9470o == null) {
            this.f9470o = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight());
        }
        this.f9470o.position(0);
        if (this.f9471p == null) {
            this.f9471p = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f9471p.position(0);
        if (this.f9472q == null) {
            this.f9472q = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
        }
        this.f9472q.position(0);
    }

    private static q i(int i7, int i8, int i9, int i10, int i11) {
        boolean z7 = i9 == 90 || i9 == 270;
        int i12 = z7 ? i8 : i7;
        if (!z7) {
            i7 = i8;
        }
        return new q(o.a(i12, i7, i10, i11));
    }

    static Matrix k(int i7, int i8, int i9, int i10, int i11) {
        Matrix matrix = new Matrix();
        if (i11 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i7, i8), E.q.f1066a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i11);
            matrix.postConcat(E.q.c(new RectF(0.0f, 0.0f, i9, i10)));
        }
        return matrix;
    }

    static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public void m(n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, c.a aVar2) {
        if (!this.f9474s) {
            aVar2.f(new u0.l("ImageAnalysis is detached"));
            return;
        }
        r rVar = new r(nVar2, AbstractC3037a0.f(nVar.D0().b(), nVar.D0().d(), this.f9460e ? 0 : this.f9457b, matrix));
        if (!rect.isEmpty()) {
            rVar.B0(rect);
        }
        aVar.k(rVar);
        aVar2.c(null);
    }

    public Object n(Executor executor, final n nVar, final Matrix matrix, final n nVar2, final Rect rect, final f.a aVar, final c.a aVar2) throws Exception {
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                this.f9449d.m(nVar, matrix, nVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void p(int i7, int i8, int i9, int i10) {
        Matrix matrixK = k(i7, i8, i9, i10, this.f9457b);
        this.f9466k = l(this.f9465j, matrixK);
        this.f9468m.setConcat(this.f9467l, matrixK);
    }

    private void q(n nVar, int i7) {
        q qVar = this.f9463h;
        if (qVar == null) {
            return;
        }
        qVar.m();
        this.f9463h = i(nVar.getWidth(), nVar.getHeight(), i7, this.f9463h.d(), this.f9463h.g());
        if (this.f9459d == 1) {
            ImageWriter imageWriter = this.f9464i;
            if (imageWriter != null) {
                I.a.a(imageWriter);
            }
            this.f9464i = I.a.c(this.f9463h.a(), this.f9463h.g());
        }
    }

    @Override
    public void a(InterfaceC0353t0 interfaceC0353t0) {
        try {
            n nVarD = d(interfaceC0353t0);
            if (nVarD != null) {
                o(nVarD);
            }
        } catch (IllegalStateException e7) {
            C3043d0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e7);
        }
    }

    abstract n d(InterfaceC0353t0 interfaceC0353t0);

    com.google.common.util.concurrent.p<java.lang.Void> e(final androidx.camera.core.n r15) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.i.e(androidx.camera.core.n):com.google.common.util.concurrent.p");
    }

    void f() {
        this.f9474s = true;
    }

    abstract void g();

    void j() {
        this.f9474s = false;
        g();
    }

    abstract void o(n nVar);

    void r(Executor executor, f.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f9473r) {
            this.f9456a = aVar;
            this.f9462g = executor;
        }
    }

    void s(boolean z7) {
        this.f9461f = z7;
    }

    void t(int i7) {
        this.f9459d = i7;
    }

    void u(boolean z7) {
        this.f9460e = z7;
    }

    void v(q qVar) {
        synchronized (this.f9473r) {
            this.f9463h = qVar;
        }
    }

    void w(int i7) {
        this.f9457b = i7;
    }

    void x(Matrix matrix) {
        synchronized (this.f9473r) {
            this.f9467l = matrix;
            this.f9468m = new Matrix(this.f9467l);
        }
    }

    void y(Rect rect) {
        synchronized (this.f9473r) {
            this.f9465j = rect;
            this.f9466k = new Rect(this.f9465j);
        }
    }
}
