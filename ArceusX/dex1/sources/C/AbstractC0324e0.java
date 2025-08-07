package C;

import W0.JWp.kNUgEaOjcPdX;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k0.BAKp.xAQOwX;
import z.C3043d0;

public abstract class AbstractC0324e0 {

    public static final Size f547k = new Size(0, 0);

    private static final boolean f548l = C3043d0.f("DeferrableSurface");

    private static final AtomicInteger f549m = new AtomicInteger(0);

    private static final AtomicInteger f550n = new AtomicInteger(0);

    private final Object f551a;

    private int f552b;

    private boolean f553c;

    private c.a<Void> f554d;

    private final com.google.common.util.concurrent.p<Void> f555e;

    private c.a<Void> f556f;

    private final com.google.common.util.concurrent.p<Void> f557g;

    private final Size f558h;

    private final int f559i;

    Class<?> f560j;

    public static final class a extends Exception {

        AbstractC0324e0 f561d;

        public a(String str, AbstractC0324e0 abstractC0324e0) {
            super(str);
            this.f561d = abstractC0324e0;
        }

        public AbstractC0324e0 a() {
            return this.f561d;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC0324e0() {
        this(f547k, 0);
    }

    public Object n(c.a aVar) throws Exception {
        synchronized (this.f551a) {
            this.f554d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public Object o(c.a aVar) throws Exception {
        synchronized (this.f551a) {
            this.f556f = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    public void p(String str) throws ExecutionException, InterruptedException {
        try {
            this.f555e.get();
            q(kNUgEaOjcPdX.aQXEYXWksEoSiPY, f550n.decrementAndGet(), f549m.get());
        } catch (Exception e7) {
            C3043d0.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f551a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f553c), Integer.valueOf(this.f552b)), e7);
            }
        }
    }

    private void q(String str, int i7, int i8) {
        if (!f548l && C3043d0.f("DeferrableSurface")) {
            C3043d0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C3043d0.a("DeferrableSurface", str + "[total_surfaces=" + i7 + ", used_surfaces=" + i8 + "](" + this + "}");
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f551a) {
            try {
                if (this.f553c) {
                    aVar = null;
                } else {
                    this.f553c = true;
                    this.f556f.c(null);
                    if (this.f552b == 0) {
                        aVar = this.f554d;
                        this.f554d = null;
                    } else {
                        aVar = null;
                    }
                    if (C3043d0.f("DeferrableSurface")) {
                        C3043d0.a("DeferrableSurface", "surface closed,  useCount=" + this.f552b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a<Void> aVar;
        synchronized (this.f551a) {
            try {
                int i7 = this.f552b;
                if (i7 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i8 = i7 - 1;
                this.f552b = i8;
                if (i8 == 0 && this.f553c) {
                    aVar = this.f554d;
                    this.f554d = null;
                } else {
                    aVar = null;
                }
                if (C3043d0.f("DeferrableSurface")) {
                    C3043d0.a("DeferrableSurface", "use count-1,  useCount=" + this.f552b + " closed=" + this.f553c + " " + this);
                    if (this.f552b == 0) {
                        q("Surface no longer in use", f550n.get(), f549m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public com.google.common.util.concurrent.p<Void> f() {
        return G.n.B(this.f557g);
    }

    public Class<?> g() {
        return this.f560j;
    }

    public Size h() {
        return this.f558h;
    }

    public int i() {
        return this.f559i;
    }

    public final com.google.common.util.concurrent.p<Surface> j() {
        synchronized (this.f551a) {
            try {
                if (this.f553c) {
                    return G.n.n(new a("DeferrableSurface already closed.", this));
                }
                return r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.util.concurrent.p<Void> k() {
        return G.n.B(this.f555e);
    }

    public void l() throws a {
        synchronized (this.f551a) {
            try {
                int i7 = this.f552b;
                if (i7 == 0 && this.f553c) {
                    throw new a(xAQOwX.GDEkHPbl, this);
                }
                this.f552b = i7 + 1;
                if (C3043d0.f("DeferrableSurface")) {
                    if (this.f552b == 1) {
                        q("New surface in use", f550n.get(), f549m.incrementAndGet());
                    }
                    C3043d0.a("DeferrableSurface", "use count+1, useCount=" + this.f552b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m() {
        boolean z7;
        synchronized (this.f551a) {
            z7 = this.f553c;
        }
        return z7;
    }

    protected abstract com.google.common.util.concurrent.p<Surface> r();

    public void s(Class<?> cls) {
        this.f560j = cls;
    }

    public AbstractC0324e0(Size size, int i7) {
        this.f551a = new Object();
        this.f552b = 0;
        this.f553c = false;
        this.f558h = size;
        this.f559i = i7;
        com.google.common.util.concurrent.p<Void> pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f516a.n(aVar);
            }
        });
        this.f555e = pVarA;
        this.f557g = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f533a.o(aVar);
            }
        });
        if (C3043d0.f("DeferrableSurface")) {
            q("Surface created", f550n.incrementAndGet(), f549m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            pVarA.c(new Runnable() {
                @Override
                public final void run() throws ExecutionException, InterruptedException {
                    this.f538d.p(stackTraceString);
                }
            }, F.a.a());
        }
    }
}
