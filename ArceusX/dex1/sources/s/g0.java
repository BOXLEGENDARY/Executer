package S;

import C.h1;
import X.InterfaceC1538i;
import X.InterfaceC1541l;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.C3070z;
import z.F0;

final class g0 {

    private final Executor f6296a;

    private final Executor f6297b;

    private final InterfaceC1541l f6298c;

    private InterfaceC1538i f6299d = null;

    private Surface f6300e = null;

    private F0 f6301f = null;

    private Executor f6302g = null;

    private InterfaceC1538i.b.a f6303h = null;

    private b f6304i = b.NOT_INITIALIZED;

    private com.google.common.util.concurrent.p<Void> f6305j = G.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    private c.a<Void> f6306k = null;

    private com.google.common.util.concurrent.p<InterfaceC1538i> f6307l = G.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    private c.a<InterfaceC1538i> f6308m = null;

    class a implements G.c<InterfaceC1538i> {
        a() {
        }

        @Override
        public void onSuccess(InterfaceC1538i interfaceC1538i) {
        }

        @Override
        public void onFailure(Throwable th) {
            C3043d0.m("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            g0.this.x();
        }
    }

    private enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        f6313v,
        RELEASED
    }

    g0(InterfaceC1541l interfaceC1541l, Executor executor, Executor executor2) {
        this.f6296a = executor2;
        this.f6297b = executor;
        this.f6298c = interfaceC1541l;
    }

    private void h() {
        int iOrdinal = this.f6304i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            x();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            C3043d0.a("VideoEncoderSession", "closeInternal in " + this.f6304i + " state");
            this.f6304i = b.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            C3043d0.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f6304i + " is not handled");
    }

    private void j(final F0 f02, h1 h1Var, U.g gVar, AbstractC1229k abstractC1229k, final c.a<InterfaceC1538i> aVar) {
        C3070z c3070zN = f02.n();
        try {
            InterfaceC1538i interfaceC1538iA = this.f6298c.a(this.f6296a, W.c.c(W.c.d(abstractC1229k, c3070zN, gVar), h1Var, abstractC1229k.d(), f02.p(), c3070zN, f02.o()));
            this.f6299d = interfaceC1538iA;
            InterfaceC1538i.a aVarC = interfaceC1538iA.c();
            if (aVarC instanceof InterfaceC1538i.b) {
                ((InterfaceC1538i.b) aVarC).c(this.f6297b, new InterfaceC1538i.b.a() {
                    @Override
                    public final void a(Surface surface) throws ExecutionException, InterruptedException {
                        this.f6290a.s(aVar, f02, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (X.d0 e7) {
            C3043d0.d("VideoEncoderSession", "Unable to initialize video encoder.", e7);
            aVar.f(e7);
        }
    }

    public Object o(c.a aVar) throws Exception {
        this.f6306k = aVar;
        return "ReleasedFuture " + this;
    }

    public Object p(c.a aVar) throws Exception {
        this.f6308m = aVar;
        return "ReadyToReleaseFuture " + this;
    }

    public Object q(F0 f02, h1 h1Var, U.g gVar, AbstractC1229k abstractC1229k, c.a aVar) throws Exception {
        j(f02, h1Var, gVar, abstractC1229k, aVar);
        return "ConfigureVideoEncoderFuture " + this;
    }

    public void r(Surface surface) {
        this.f6303h.a(surface);
    }

    public void s(c.a aVar, F0 f02, final Surface surface) throws ExecutionException, InterruptedException {
        Executor executor;
        int iOrdinal = this.f6304i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (f02.t()) {
                    C3043d0.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(f02, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    h();
                    return;
                }
                this.f6300e = surface;
                C3043d0.a("VideoEncoderSession", "provide surface: " + surface);
                f02.D(surface, this.f6297b, new InterfaceC2984a() {
                    @Override
                    public final void accept(Object obj) {
                        this.f6253a.u((F0.g) obj);
                    }
                });
                this.f6304i = b.f6313v;
                aVar.c(this.f6299d);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (this.f6303h != null && (executor = this.f6302g) != null) {
                        executor.execute(new Runnable() {
                            @Override
                            public final void run() {
                                this.f6257d.r(surface);
                            }
                        });
                    }
                    C3043d0.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + this.f6304i + " is not handled");
                }
            }
        }
        C3043d0.a("VideoEncoderSession", "Not provide surface in " + this.f6304i);
        aVar.c(null);
    }

    public void t() {
        this.f6306k.c(null);
    }

    public void u(F0.g gVar) {
        C3043d0.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface surfaceB = gVar.b();
        if (surfaceB != this.f6300e) {
            surfaceB.release();
            return;
        }
        this.f6300e = null;
        this.f6308m.c(this.f6299d);
        h();
    }

    com.google.common.util.concurrent.p<InterfaceC1538i> i(final F0 f02, final h1 h1Var, final AbstractC1229k abstractC1229k, final U.g gVar) {
        if (this.f6304i.ordinal() != 0) {
            return G.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f6304i));
        }
        this.f6304i = b.INITIALIZING;
        this.f6301f = f02;
        C3043d0.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f6305j = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f6272a.o(aVar);
            }
        });
        this.f6307l = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f6279a.p(aVar);
            }
        });
        com.google.common.util.concurrent.p pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f6282a.q(f02, h1Var, gVar, abstractC1229k, aVar);
            }
        });
        G.n.j(pVarA, new a(), this.f6297b);
        return G.n.B(pVarA);
    }

    Surface k() {
        if (this.f6304i != b.f6313v) {
            return null;
        }
        return this.f6300e;
    }

    com.google.common.util.concurrent.p<InterfaceC1538i> l() {
        return G.n.B(this.f6307l);
    }

    InterfaceC1538i m() {
        return this.f6299d;
    }

    boolean n(F0 f02) {
        int iOrdinal = this.f6304i.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return false;
                }
                throw new IllegalStateException("State " + this.f6304i + " is not handled");
            }
        }
        return this.f6301f == f02;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f6301f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    void v(Executor executor, InterfaceC1538i.b.a aVar) {
        this.f6302g = executor;
        this.f6303h = aVar;
    }

    com.google.common.util.concurrent.p<Void> w() {
        h();
        return G.n.B(this.f6305j);
    }

    void x() {
        int iOrdinal = this.f6304i.ordinal();
        if (iOrdinal == 0) {
            this.f6304i = b.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.f6304i + " is not handled");
            }
            C3043d0.a("VideoEncoderSession", "terminateNow in " + this.f6304i + ", No-op");
            return;
        }
        this.f6304i = b.RELEASED;
        this.f6308m.c(this.f6299d);
        this.f6301f = null;
        if (this.f6299d == null) {
            C3043d0.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f6306k.c(null);
            return;
        }
        C3043d0.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f6299d);
        this.f6299d.a();
        this.f6299d.g().c(new Runnable() {
            @Override
            public final void run() {
                this.f6269d.t();
            }
        }, this.f6297b);
        this.f6299d = null;
    }
}
