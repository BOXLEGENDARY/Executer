package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.q;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.F0;

final class F extends q {

    TextureView f9572e;

    SurfaceTexture f9573f;

    com.google.common.util.concurrent.p<F0.g> f9574g;

    F0 f9575h;

    boolean f9576i;

    SurfaceTexture f9577j;

    AtomicReference<c.a<Void>> f9578k;

    q.a f9579l;

    Executor f9580m;

    class a implements TextureView.SurfaceTextureListener {

        class C0074a implements G.c<F0.g> {

            final SurfaceTexture f9582a;

            C0074a(SurfaceTexture surfaceTexture) {
                this.f9582a = surfaceTexture;
            }

            @Override
            public void onSuccess(F0.g gVar) {
                x0.g.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C3043d0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f9582a.release();
                F f7 = F.this;
                if (f7.f9577j != null) {
                    f7.f9577j = null;
                }
            }

            @Override
            public void onFailure(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }
        }

        a() {
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            C3043d0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i7 + "x" + i8);
            F f7 = F.this;
            f7.f9573f = surfaceTexture;
            if (f7.f9574g == null) {
                f7.u();
                return;
            }
            x0.g.g(f7.f9575h);
            C3043d0.a("TextureViewImpl", "Surface invalidated " + F.this.f9575h);
            F.this.f9575h.m().d();
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            F f7 = F.this;
            f7.f9573f = null;
            com.google.common.util.concurrent.p<F0.g> pVar = f7.f9574g;
            if (pVar == null) {
                C3043d0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            G.n.j(pVar, new C0074a(surfaceTexture), androidx.core.content.a.h(F.this.f9572e.getContext()));
            F.this.f9577j = surfaceTexture;
            return false;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            C3043d0.a("TextureViewImpl", "SurfaceTexture size changed: " + i7 + "x" + i8);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a<Void> andSet = F.this.f9578k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            F.this.getClass();
            Executor executor = F.this.f9580m;
        }
    }

    F(FrameLayout frameLayout, m mVar) {
        super(frameLayout, mVar);
        this.f9576i = false;
        this.f9578k = new AtomicReference<>();
    }

    public void o(F0 f02) {
        F0 f03 = this.f9575h;
        if (f03 != null && f03 == f02) {
            this.f9575h = null;
            this.f9574g = null;
        }
        s();
    }

    public Object p(Surface surface, final c.a aVar) throws Exception {
        C3043d0.a("TextureViewImpl", "Surface set on Preview.");
        F0 f02 = this.f9575h;
        Executor executorA = F.a.a();
        Objects.requireNonNull(aVar);
        f02.D(surface, executorA, new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                aVar.c((F0.g) obj);
            }
        });
        return "provideSurface[request=" + this.f9575h + " surface=" + surface + "]";
    }

    public void q(Surface surface, com.google.common.util.concurrent.p pVar, F0 f02) {
        C3043d0.a("TextureViewImpl", "Safe to release surface.");
        s();
        surface.release();
        if (this.f9574g == pVar) {
            this.f9574g = null;
        }
        if (this.f9575h == f02) {
            this.f9575h = null;
        }
    }

    public Object r(c.a aVar) throws Exception {
        this.f9578k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void s() {
        q.a aVar = this.f9579l;
        if (aVar != null) {
            aVar.a();
            this.f9579l = null;
        }
    }

    private void t() {
        if (!this.f9576i || this.f9577j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f9572e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f9577j;
        if (surfaceTexture != surfaceTexture2) {
            this.f9572e.setSurfaceTexture(surfaceTexture2);
            this.f9577j = null;
            this.f9576i = false;
        }
    }

    @Override
    View b() {
        return this.f9572e;
    }

    @Override
    Bitmap c() {
        TextureView textureView = this.f9572e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f9572e.getBitmap();
    }

    @Override
    void d() {
        t();
    }

    @Override
    void e() {
        this.f9576i = true;
    }

    @Override
    void g(final F0 f02, q.a aVar) {
        this.f9699a = f02.p();
        this.f9579l = aVar;
        n();
        F0 f03 = this.f9575h;
        if (f03 != null) {
            f03.G();
        }
        this.f9575h = f02;
        f02.j(androidx.core.content.a.h(this.f9572e.getContext()), new Runnable() {
            @Override
            public final void run() {
                this.f9563d.o(f02);
            }
        });
        u();
    }

    @Override
    com.google.common.util.concurrent.p<Void> i() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f9565a.r(aVar);
            }
        });
    }

    public void n() {
        x0.g.g(this.f9700b);
        x0.g.g(this.f9699a);
        TextureView textureView = new TextureView(this.f9700b.getContext());
        this.f9572e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f9699a.getWidth(), this.f9699a.getHeight()));
        this.f9572e.setSurfaceTextureListener(new a());
        this.f9700b.removeAllViews();
        this.f9700b.addView(this.f9572e);
    }

    void u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f9699a;
        if (size == null || (surfaceTexture = this.f9573f) == null || this.f9575h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f9699a.getHeight());
        final Surface surface = new Surface(this.f9573f);
        final F0 f02 = this.f9575h;
        final com.google.common.util.concurrent.p<F0.g> pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f9566a.p(surface, aVar);
            }
        });
        this.f9574g = pVarA;
        pVarA.c(new Runnable() {
            @Override
            public final void run() {
                this.f9568d.q(surface, pVarA, f02);
            }
        }, androidx.core.content.a.h(this.f9572e.getContext()));
        f();
    }
}
