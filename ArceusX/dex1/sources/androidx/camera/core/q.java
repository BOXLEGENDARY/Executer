package androidx.camera.core;

import C.InterfaceC0353t0;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.concurrent.Executor;

public class q implements InterfaceC0353t0 {

    private final InterfaceC0353t0 f9512d;

    private final Surface f9513e;

    private e.a f9514f;

    private final Object f9509a = new Object();

    private int f9510b = 0;

    private boolean f9511c = false;

    private final e.a f9515g = new e.a() {
        @Override
        public final void b(androidx.camera.core.n nVar) {
            this.f24720a.k(nVar);
        }
    };

    public q(InterfaceC0353t0 interfaceC0353t0) {
        this.f9512d = interfaceC0353t0;
        this.f9513e = interfaceC0353t0.a();
    }

    public void k(n nVar) {
        e.a aVar;
        synchronized (this.f9509a) {
            try {
                int i7 = this.f9510b - 1;
                this.f9510b = i7;
                if (this.f9511c && i7 == 0) {
                    close();
                }
                aVar = this.f9514f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(nVar);
        }
    }

    public void l(InterfaceC0353t0.a aVar, InterfaceC0353t0 interfaceC0353t0) {
        aVar.a(this);
    }

    private n o(n nVar) {
        if (nVar == null) {
            return null;
        }
        this.f9510b++;
        s sVar = new s(nVar);
        sVar.b(this.f9515g);
        return sVar;
    }

    @Override
    public Surface a() {
        Surface surfaceA;
        synchronized (this.f9509a) {
            surfaceA = this.f9512d.a();
        }
        return surfaceA;
    }

    @Override
    public n c() {
        n nVarO;
        synchronized (this.f9509a) {
            nVarO = o(this.f9512d.c());
        }
        return nVarO;
    }

    @Override
    public void close() {
        synchronized (this.f9509a) {
            try {
                Surface surface = this.f9513e;
                if (surface != null) {
                    surface.release();
                }
                this.f9512d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public int d() {
        int iD;
        synchronized (this.f9509a) {
            iD = this.f9512d.d();
        }
        return iD;
    }

    @Override
    public void e(final InterfaceC0353t0.a aVar, Executor executor) {
        synchronized (this.f9509a) {
            this.f9512d.e(new InterfaceC0353t0.a() {
                @Override
                public final void a(InterfaceC0353t0 interfaceC0353t0) {
                    this.f24712a.l(aVar, interfaceC0353t0);
                }
            }, executor);
        }
    }

    @Override
    public void f() {
        synchronized (this.f9509a) {
            this.f9512d.f();
        }
    }

    @Override
    public int g() {
        int iG;
        synchronized (this.f9509a) {
            iG = this.f9512d.g();
        }
        return iG;
    }

    @Override
    public int getHeight() {
        int height;
        synchronized (this.f9509a) {
            height = this.f9512d.getHeight();
        }
        return height;
    }

    @Override
    public int getWidth() {
        int width;
        synchronized (this.f9509a) {
            width = this.f9512d.getWidth();
        }
        return width;
    }

    @Override
    public n h() {
        n nVarO;
        synchronized (this.f9509a) {
            nVarO = o(this.f9512d.h());
        }
        return nVarO;
    }

    public int j() {
        int iG;
        synchronized (this.f9509a) {
            iG = this.f9512d.g() - this.f9510b;
        }
        return iG;
    }

    public void m() {
        synchronized (this.f9509a) {
            try {
                this.f9511c = true;
                this.f9512d.f();
                if (this.f9510b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(e.a aVar) {
        synchronized (this.f9509a) {
            this.f9514f = aVar;
        }
    }
}
