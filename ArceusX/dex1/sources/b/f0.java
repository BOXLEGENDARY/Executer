package B;

import C.AbstractC0345p;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import z.T;

public abstract class f0 {

    private int f229a = new K.a().a();

    interface a {
        void a(f0 f0Var);
    }

    public void q(int i7) {
        if (l() != null) {
            l().a(i7);
        } else {
            j();
        }
    }

    public void r(z.U u7) {
        j();
        if (!(l() != null)) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        T.f fVarL = l();
        Objects.requireNonNull(fVarL);
        fVarL.d(u7);
    }

    public void s(Bitmap bitmap) {
        if (l() != null) {
            l().b(bitmap);
        } else {
            j();
        }
    }

    public void t(T.h hVar) {
        T.f fVarL = l();
        Objects.requireNonNull(fVarL);
        Objects.requireNonNull(hVar);
        fVarL.e(hVar);
    }

    public void u(androidx.camera.core.n nVar) {
        T.e eVarJ = j();
        Objects.requireNonNull(eVarJ);
        Objects.requireNonNull(nVar);
        eVarJ.c(nVar);
    }

    public static f0 v(Executor executor, T.e eVar, T.f fVar, T.g gVar, Rect rect, Matrix matrix, int i7, int i8, int i9, List<AbstractC0345p> list) {
        x0.g.b((fVar == null) == (gVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        x0.g.b(!(fVar == null), "One and only one on-disk or in-memory callback should be present.");
        return new C0272h(executor, eVar, fVar, gVar, rect, matrix, i7, i8, i9, list);
    }

    void A(final T.h hVar) {
        g().execute(new Runnable() {
            @Override
            public final void run() {
                this.f219d.t(hVar);
            }
        });
    }

    boolean f() {
        E.p.a();
        int i7 = this.f229a;
        if (i7 <= 0) {
            return false;
        }
        this.f229a = i7 - 1;
        return true;
    }

    abstract Executor g();

    abstract int h();

    abstract Rect i();

    public abstract T.e j();

    abstract int k();

    public abstract T.f l();

    abstract T.g m();

    abstract int n();

    abstract Matrix o();

    abstract List<AbstractC0345p> p();

    void w(final int i7) {
        g().execute(new Runnable() {
            @Override
            public final void run() {
                this.f225d.q(i7);
            }
        });
    }

    void x(final z.U u7) {
        g().execute(new Runnable() {
            @Override
            public final void run() {
                this.f200d.r(u7);
            }
        });
    }

    void y(final Bitmap bitmap) {
        g().execute(new Runnable() {
            @Override
            public final void run() {
                this.f215d.s(bitmap);
            }
        });
    }

    void z(final androidx.camera.core.n nVar) {
        g().execute(new Runnable() {
            @Override
            public final void run() {
                this.f211d.u(nVar);
            }
        });
    }
}
