package B;

import B.A;
import B.C0273i;
import B.C0286w;
import B.O;
import C.R0;
import M.C0524u;
import M.C0528y;
import android.graphics.Bitmap;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.T;

public class O {

    final Executor f138a;

    final C0528y f139b;

    private a f140c;

    private M.A<b, M.B<androidx.camera.core.n>> f141d;

    private M.A<C0286w.a, M.B<byte[]>> f142e;

    private M.A<C0273i.b, M.B<byte[]>> f143f;

    private M.A<A.a, T.h> f144g;

    private M.A<M.B<byte[]>, M.B<Bitmap>> f145h;

    private M.A<M.B<androidx.camera.core.n>, androidx.camera.core.n> f146i;

    private M.A<M.B<byte[]>, M.B<androidx.camera.core.n>> f147j;

    private M.A<M.B<androidx.camera.core.n>, Bitmap> f148k;

    private M.A<M.B<Bitmap>, M.B<Bitmap>> f149l;

    private final R0 f150m;

    private final boolean f151n;

    static abstract class a {
        a() {
        }

        static a e(int i7, int i8) {
            return new C0269e(new C0524u(), new C0524u(), i7, i8);
        }

        abstract C0524u<b> a();

        abstract int b();

        abstract int c();

        abstract C0524u<b> d();
    }

    static abstract class b {
        b() {
        }

        static b c(P p7, androidx.camera.core.n nVar) {
            return new C0270f(p7, nVar);
        }

        abstract androidx.camera.core.n a();

        abstract P b();
    }

    O(Executor executor, C0528y c0528y) {
        this(executor, c0528y, androidx.camera.core.internal.compat.quirk.a.c());
    }

    private M.B<byte[]> i(M.B<byte[]> b2, int i7) throws z.U {
        x0.g.i(L.b.j(b2.e()));
        M.B<Bitmap> bApply = this.f145h.apply(b2);
        M.A<M.B<Bitmap>, M.B<Bitmap>> a2 = this.f149l;
        if (a2 != null) {
            bApply = a2.apply(bApply);
        }
        return this.f143f.apply(C0273i.b.c(bApply, i7));
    }

    public void o(final b bVar) {
        if (bVar.b().j()) {
            bVar.a().close();
        } else {
            this.f138a.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f128d.n(bVar);
                }
            });
        }
    }

    public void q(final b bVar) {
        if (!bVar.b().j()) {
            this.f138a.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f126d.p(bVar);
                }
            });
        } else {
            C3043d0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    private static void w(final P p7, final z.U u7) {
        F.a.d().execute(new Runnable() {
            @Override
            public final void run() {
                p7.s(u7);
            }
        });
    }

    androidx.camera.core.n r(b bVar) throws z.U {
        P pB = bVar.b();
        M.B<androidx.camera.core.n> bApply = this.f141d.apply(bVar);
        if ((bApply.e() == 35 || this.f149l != null || this.f151n) && this.f140c.c() == 256) {
            M.B<byte[]> bApply2 = this.f142e.apply(C0286w.a.c(bApply, pB.c()));
            if (this.f149l != null) {
                bApply2 = i(bApply2, pB.c());
            }
            bApply = this.f147j.apply(bApply2);
        }
        return this.f146i.apply(bApply);
    }

    public void n(b bVar) {
        final P pB = bVar.b();
        try {
            if (bVar.b().k()) {
                final androidx.camera.core.n nVarR = r(bVar);
                F.a.d().execute(new Runnable() {
                    @Override
                    public final void run() {
                        pB.o(nVarR);
                    }
                });
            } else {
                final T.h hVarT = t(bVar);
                F.a.d().execute(new Runnable() {
                    @Override
                    public final void run() {
                        pB.p(hVarT);
                    }
                });
            }
        } catch (OutOfMemoryError e7) {
            w(pB, new z.U(0, "Processing failed due to low memory.", e7));
        } catch (RuntimeException e8) {
            w(pB, new z.U(0, "Processing failed.", e8));
        } catch (z.U e9) {
            w(pB, e9);
        }
    }

    T.h t(b bVar) throws z.U {
        int iC = this.f140c.c();
        x0.g.b(L.b.j(iC), String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", Integer.valueOf(iC)));
        P pB = bVar.b();
        M.B<byte[]> bApply = this.f142e.apply(C0286w.a.c(this.f141d.apply(bVar), pB.c()));
        if (bApply.i() || this.f149l != null) {
            bApply = i(bApply, pB.c());
        }
        M.A<A.a, T.h> a2 = this.f144g;
        T.g gVarD = pB.d();
        Objects.requireNonNull(gVarD);
        return a2.apply(A.a.c(bApply, gVarD));
    }

    public void p(b bVar) {
        int iC = this.f140c.c();
        x0.g.b(iC == 35 || iC == 256, String.format("Postview only support YUV and JPEG output formats. Output format: %s", Integer.valueOf(iC)));
        final P pB = bVar.b();
        try {
            final Bitmap bitmapApply = this.f148k.apply(this.f141d.apply(bVar));
            F.a.d().execute(new Runnable() {
                @Override
                public final void run() {
                    pB.r(bitmapApply);
                }
            });
        } catch (Exception e7) {
            bVar.a().close();
            C3043d0.d("ProcessingNode", "process postview input packet failed.", e7);
        }
    }

    public void v() {
    }

    public Void x(a aVar) {
        this.f140c = aVar;
        aVar.a().a(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f124a.o((O.b) obj);
            }
        });
        aVar.d().a(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f125a.q((O.b) obj);
            }
        });
        this.f141d = new F();
        this.f142e = new C0286w(this.f150m);
        this.f145h = new C0289z();
        this.f143f = new C0273i();
        this.f144g = new A();
        this.f146i = new C();
        this.f148k = new C0285v();
        if (aVar.b() == 35 || this.f139b != null || this.f151n) {
            this.f147j = new B();
        }
        C0528y c0528y = this.f139b;
        if (c0528y == null) {
            return null;
        }
        this.f149l = new C0274j(c0528y);
        return null;
    }

    O(Executor executor, C0528y c0528y, R0 r02) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f138a = F.a.f(executor);
        } else {
            this.f138a = executor;
        }
        this.f139b = c0528y;
        this.f150m = r02;
        this.f151n = r02.a(IncorrectJpegMetadataQuirk.class);
    }
}
