package M;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.F0;
import z.p0;
import z.u0;

public class W {

    final S f2245a;

    final C.J f2246b;

    private c f2247c;

    private b f2248d;

    class a implements G.c<u0> {

        final N f2249a;

        a(N n7) {
            this.f2249a = n7;
        }

        @Override
        public void onSuccess(u0 u0Var) throws p0 {
            x0.g.g(u0Var);
            W.this.f2245a.c(u0Var);
        }

        @Override
        public void onFailure(Throwable th) {
            if (this.f2249a.t() == 2 && (th instanceof CancellationException)) {
                C3043d0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            C3043d0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f2249a.t()), th);
        }
    }

    public static abstract class b {
        public static b c(N n7, List<O.f> list) {
            return new C0507c(n7, list);
        }

        public abstract List<O.f> a();

        public abstract N b();
    }

    public static class c extends HashMap<O.f, N> {
    }

    public W(C.J j7, S s7) {
        this.f2246b = j7;
        this.f2245a = s7;
    }

    public void g(N n7, Map.Entry<O.f, N> entry) {
        N value = entry.getValue();
        G.n.j(value.j(entry.getKey().b(), u0.a.f(n7.s().e(), entry.getKey().a(), n7.u() ? this.f2246b : null, entry.getKey().c(), entry.getKey().g()), null), new a(value), F.a.d());
    }

    public void f() {
        c cVar = this.f2247c;
        if (cVar != null) {
            Iterator<N> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    public static void h(Map map, F0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((O.f) entry.getKey()).c();
            if (((O.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((N) entry.getValue()).D(E.q.w(iB), -1);
        }
    }

    private void j(final N n7, Map<O.f, N> map) {
        for (final Map.Entry<O.f, N> entry : map.entrySet()) {
            g(n7, entry);
            entry.getValue().e(new Runnable() {
                @Override
                public final void run() {
                    this.f2240d.g(n7, entry);
                }
            });
        }
    }

    private void k(N n7) throws p0 {
        this.f2245a.b(n7.k(this.f2246b));
    }

    private N n(N n7, O.f fVar) {
        Rect rectR;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n7.r());
        Matrix matrixE = E.q.e(new RectF(rectA), E.q.t(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        x0.g.a(E.q.j(E.q.f(rectA, iC), fVar.d()));
        if (fVar.k()) {
            x0.g.b(fVar.a().contains(n7.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), n7.n()));
            rectR = new Rect();
            RectF rectF = new RectF(n7.n());
            matrixE.mapRect(rectF);
            rectF.round(rectR);
        } else {
            rectR = E.q.r(fVar.d());
        }
        Rect rect = rectR;
        return new N(fVar.e(), fVar.b(), n7.s().g().e(fVar.d()).a(), matrix, false, rect, n7.q() - iC, -1, n7.w() != zG);
    }

    public S e() {
        return this.f2245a;
    }

    public void i() {
        this.f2245a.a();
        E.p.d(new Runnable() {
            @Override
            public final void run() {
                this.f2244d.f();
            }
        });
    }

    void l(N n7, final Map<O.f, N> map) {
        n7.f(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                W.h(map, (F0.h) obj);
            }
        });
    }

    public c m(b bVar) {
        E.p.a();
        this.f2248d = bVar;
        this.f2247c = new c();
        N nB = bVar.b();
        for (O.f fVar : bVar.a()) {
            this.f2247c.put(fVar, n(nB, fVar));
        }
        k(nB);
        j(nB, this.f2247c);
        l(nB, this.f2247c);
        return this.f2247c;
    }
}
