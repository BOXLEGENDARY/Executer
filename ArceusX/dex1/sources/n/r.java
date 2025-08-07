package N;

import C.J;
import M.N;
import M.S;
import M.a0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import z.C3043d0;
import z.p0;
import z.u0;

public class r {

    final S f2541a;

    final J f2542b;

    final J f2543c;

    private c f2544d;

    private b f2545e;

    class a implements G.c<u0> {

        final N f2546a;

        a(N n7) {
            this.f2546a = n7;
        }

        @Override
        public void onSuccess(u0 u0Var) throws p0 {
            x0.g.g(u0Var);
            r.this.f2541a.c(u0Var);
        }

        @Override
        public void onFailure(Throwable th) {
            if (this.f2546a.t() == 2 && (th instanceof CancellationException)) {
                C3043d0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            C3043d0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + a0.b(this.f2546a.t()), th);
        }
    }

    public static abstract class b {
        public static b d(N n7, N n8, List<d> list) {
            return new N.b(n7, n8, list);
        }

        public abstract List<d> a();

        public abstract N b();

        public abstract N c();
    }

    public static class c extends HashMap<d, N> {
    }

    public r(J j7, J j8, S s7) {
        this.f2542b = j7;
        this.f2543c = j8;
        this.f2541a = s7;
    }

    public void e(J j7, J j8, N n7, N n8, Map.Entry<d, N> entry) {
        N value = entry.getValue();
        Size sizeE = n7.s().e();
        Rect rectA = entry.getKey().a().a();
        if (!n7.u()) {
            j7 = null;
        }
        u0.a aVarF = u0.a.f(sizeE, rectA, j7, entry.getKey().a().c(), entry.getKey().a().g());
        Size sizeE2 = n8.s().e();
        Rect rectA2 = entry.getKey().b().a();
        if (!n8.u()) {
            j8 = null;
        }
        G.n.j(value.j(entry.getKey().a().b(), aVarF, u0.a.f(sizeE2, rectA2, j8, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), F.a.d());
    }

    public void d() {
        c cVar = this.f2544d;
        if (cVar != null) {
            Iterator<N> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    private void g(final J j7, final J j8, final N n7, final N n8, Map<d, N> map) {
        for (final Map.Entry<d, N> entry : map.entrySet()) {
            e(j7, j8, n7, n8, entry);
            entry.getValue().e(new Runnable() {
                @Override
                public final void run() {
                    this.f2535d.e(j7, j8, n7, n8, entry);
                }
            });
        }
    }

    private void h(J j7, N n7, Map<d, N> map, boolean z7) throws p0 {
        this.f2541a.b(n7.l(j7, z7));
    }

    private N j(N n7, O.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix();
        x0.g.a(E.q.j(E.q.f(rectA, iC), fVar.d()));
        Rect rectR = E.q.r(fVar.d());
        return new N(fVar.e(), fVar.b(), n7.s().g().e(fVar.d()).a(), matrix, false, rectR, n7.q() - iC, -1, n7.w() != zG);
    }

    public void f() {
        this.f2541a.a();
        E.p.d(new Runnable() {
            @Override
            public final void run() {
                this.f2534d.d();
            }
        });
    }

    public c i(b bVar) {
        E.p.a();
        this.f2545e = bVar;
        this.f2544d = new c();
        N nB = this.f2545e.b();
        N nC = this.f2545e.c();
        for (d dVar : this.f2545e.a()) {
            this.f2544d.put(dVar, j(nB, dVar.a()));
        }
        h(this.f2542b, nB, this.f2544d, true);
        h(this.f2543c, nC, this.f2544d, false);
        g(this.f2542b, this.f2543c, nB, nC, this.f2544d);
        return this.f2544d;
    }
}
