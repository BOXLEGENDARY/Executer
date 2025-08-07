package s;

import C.AbstractC0324e0;
import C.C0355u0;
import C.InterfaceC0349r0;
import C.X0;
import C.p1;
import Za.qhkq.dHkZSUxHu;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import ka.oik.UJEa;
import z.C3043d0;

class E1 {

    private AbstractC0324e0 f22941a;

    private C.X0 f22942b;

    private final Size f22944d;

    private final c f22946f;

    private final w.w f22945e = new w.w();

    private X0.c f22947g = null;

    private final b f22943c = new b();

    class a implements G.c<Void> {

        final Surface f22948a;

        final SurfaceTexture f22949b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f22948a = surface;
            this.f22949b = surfaceTexture;
        }

        @Override
        public void onSuccess(Void r1) {
            this.f22948a.release();
            this.f22949b.release();
        }

        @Override
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    private static class b implements C.o1<z.G0> {

        private final C.X f22951I;

        b() {
            C.E0 e0D0 = C.E0.d0();
            e0D0.l(C.o1.f668v, new J0());
            e0D0.l(InterfaceC0349r0.f706h, 34);
            Z(e0D0);
            this.f22951I = e0D0;
        }

        private void Z(C.E0 e02) {
            e02.l(H.m.f1524G, E1.class);
            e02.l(H.m.f1523F, E1.class.getCanonicalName() + dHkZSUxHu.vvOmsuL + UUID.randomUUID());
        }

        @Override
        public p1.b F() {
            return p1.b.METERING_REPEATING;
        }

        @Override
        public C.X e() {
            return this.f22951I;
        }
    }

    interface c {
        void a();
    }

    E1(t.B b2, C2815h1 c2815h1, c cVar) {
        this.f22946f = cVar;
        Size sizeG = g(b2, c2815h1);
        this.f22944d = sizeG;
        C3043d0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.f22942b = d();
    }

    private Size g(t.B b2, C2815h1 c2815h1) {
        Size[] sizeArrC = b2.b().c(34);
        if (sizeArrC == null) {
            C3043d0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f22945e.a(sizeArrC);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return E1.k((Size) obj, (Size) obj2);
            }
        });
        Size sizeF = c2815h1.f();
        long jMin = Math.min(sizeF.getWidth() * sizeF.getHeight(), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Size size2 = sizeArrA[i7];
            long width = size2.getWidth() * size2.getHeight();
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i7++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) listAsList.get(0);
    }

    public void j(C.X0 x02, X0.g gVar) {
        this.f22942b = d();
        c cVar = this.f22946f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public static int k(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    void c() {
        C3043d0.a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC0324e0 abstractC0324e0 = this.f22941a;
        if (abstractC0324e0 != null) {
            abstractC0324e0.d();
        }
        this.f22941a = null;
    }

    C.X0 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f22944d.getWidth(), this.f22944d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        X0.b bVarQ = X0.b.q(this.f22943c, this.f22944d);
        bVarQ.z(1);
        C0355u0 c0355u0 = new C0355u0(surface);
        this.f22941a = c0355u0;
        G.n.j(c0355u0.k(), new a(surface, surfaceTexture), F.a.a());
        bVarQ.l(this.f22941a);
        X0.c cVar = this.f22947g;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new X0.d() {
            @Override
            public final void a(C.X0 x02, X0.g gVar) {
                this.f22936a.j(x02, gVar);
            }
        });
        this.f22947g = cVar2;
        bVarQ.t(cVar2);
        return bVarQ.o();
    }

    Size e() {
        return this.f22944d;
    }

    String f() {
        return UJEa.sWPfwavPpwsvnSn;
    }

    C.X0 h() {
        return this.f22942b;
    }

    C.o1<?> i() {
        return this.f22943c;
    }
}
