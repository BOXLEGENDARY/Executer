package z;

import C.G;
import C.H;
import C.O0;
import C.X;
import C.p1;
import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class C3067w implements H.m<C3066v> {

    static final X.a<H.a> f24749J = X.a.a("camerax.core.appConfig.cameraFactoryProvider", H.a.class);

    static final X.a<G.a> f24750K = X.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", G.a.class);

    static final X.a<p1.c> f24751L = X.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", p1.c.class);

    static final X.a<Executor> f24752M = X.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    static final X.a<Handler> f24753N = X.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    static final X.a<Integer> f24754O = X.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    static final X.a<C3061p> f24755P = X.a.a("camerax.core.appConfig.availableCamerasLimiter", C3061p.class);

    static final X.a<Long> f24756Q = X.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    static final X.a<r0> f24757R = X.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", r0.class);

    static final X.a<O0> f24758S = X.a.a("camerax.core.appConfig.quirksSettings", O0.class);

    private final C.J0 f24759I;

    public static final class a {

        private final C.E0 f24760a;

        public a() {
            this(C.E0.d0());
        }

        private C.D0 b() {
            return this.f24760a;
        }

        public C3067w a() {
            return new C3067w(C.J0.b0(this.f24760a));
        }

        public a c(H.a aVar) {
            b().l(C3067w.f24749J, aVar);
            return this;
        }

        public a d(G.a aVar) {
            b().l(C3067w.f24750K, aVar);
            return this;
        }

        public a e(Class<C3066v> cls) {
            b().l(H.m.f1524G, cls);
            if (b().a(H.m.f1523F, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().l(H.m.f1523F, str);
            return this;
        }

        public a g(p1.c cVar) {
            b().l(C3067w.f24751L, cVar);
            return this;
        }

        private a(C.E0 e02) {
            this.f24760a = e02;
            Class cls = (Class) e02.a(H.m.f1524G, null);
            if (cls == null || cls.equals(C3066v.class)) {
                e(C3066v.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public interface b {
        C3067w getCameraXConfig();
    }

    C3067w(C.J0 j02) {
        this.f24759I = j02;
    }

    public C3061p Z(C3061p c3061p) {
        return (C3061p) this.f24759I.a(f24755P, c3061p);
    }

    public Executor a0(Executor executor) {
        return (Executor) this.f24759I.a(f24752M, executor);
    }

    public H.a b0(H.a aVar) {
        return (H.a) this.f24759I.a(f24749J, aVar);
    }

    public long c0() {
        return ((Long) this.f24759I.a(f24756Q, -1L)).longValue();
    }

    public r0 d0() {
        r0 r0Var = (r0) this.f24759I.a(f24757R, r0.f24699b);
        Objects.requireNonNull(r0Var);
        return r0Var;
    }

    @Override
    public C.X e() {
        return this.f24759I;
    }

    public G.a e0(G.a aVar) {
        return (G.a) this.f24759I.a(f24750K, aVar);
    }

    public O0 f0() {
        return (O0) this.f24759I.a(f24758S, null);
    }

    public Handler g0(Handler handler) {
        return (Handler) this.f24759I.a(f24753N, handler);
    }

    public p1.c h0(p1.c cVar) {
        return (p1.c) this.f24759I.a(f24751L, cVar);
    }
}
