package M;

import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import x0.InterfaceC2984a;
import z.AbstractC3056k;
import z.Y;

public class C0528y {

    private final Executor f2322a;

    private final z.Y f2323b;

    private final InterfaceC2984a<Throwable> f2324c;

    public C0528y(AbstractC3056k abstractC3056k) {
        x0.g.a(abstractC3056k.g() == 4);
        this.f2322a = abstractC3056k.c();
        z.Y yD = abstractC3056k.d();
        Objects.requireNonNull(yD);
        this.f2323b = yD;
        this.f2324c = abstractC3056k.b();
    }

    public void c(Y.a aVar, c.a aVar2) {
        aVar2.c(this.f2323b.a(aVar));
    }

    public Object d(final Y.a aVar, final c.a aVar2) throws Exception {
        this.f2322a.execute(new Runnable() {
            @Override
            public final void run() {
                this.f2319d.c(aVar, aVar2);
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public Y.b e(final Y.a aVar) throws z.U {
        try {
            return (Y.b) androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar2) {
                    return this.f2317a.d(aVar, aVar2);
                }
            }).get();
        } catch (Exception e7) {
            e = e7;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new z.U(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
