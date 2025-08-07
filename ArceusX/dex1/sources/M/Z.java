package M;

import java.util.Objects;
import java.util.concurrent.Executor;
import x0.InterfaceC2984a;
import z.AbstractC3056k;
import z.F0;
import z.p0;
import z.u0;
import z.v0;

public class Z implements S {

    private final v0 f2255d;

    private final Executor f2256e;

    private final InterfaceC2984a<Throwable> f2257i;

    public Z(AbstractC3056k abstractC3056k) {
        v0 v0VarF = abstractC3056k.f();
        Objects.requireNonNull(v0VarF);
        this.f2255d = v0VarF;
        this.f2256e = abstractC3056k.c();
        this.f2257i = abstractC3056k.b();
    }

    public void g(F0 f02) throws p0 {
        this.f2255d.b(f02);
    }

    public void h(u0 u0Var) throws p0 {
        this.f2255d.c(u0Var);
    }

    @Override
    public void a() {
    }

    @Override
    public void b(final F0 f02) {
        this.f2256e.execute(new Runnable() {
            @Override
            public final void run() throws p0 {
                this.f2251d.g(f02);
            }
        });
    }

    @Override
    public void c(final u0 u0Var) {
        this.f2256e.execute(new Runnable() {
            @Override
            public final void run() throws p0 {
                this.f2253d.h(u0Var);
            }
        });
    }

    @Override
    public com.google.common.util.concurrent.p<Void> d(int i7, int i8) {
        return G.n.n(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }
}
