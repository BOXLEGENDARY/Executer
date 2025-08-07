package androidx.camera.lifecycle;

import H.f;
import android.view.AbstractC1694h;
import android.view.InterfaceC1700n;
import android.view.InterfaceC1701o;
import android.view.InterfaceC1711y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import z.G0;
import z.InterfaceC3052i;
import z.InterfaceC3054j;
import z.InterfaceC3060o;

public final class LifecycleCamera implements InterfaceC1700n, InterfaceC3052i {

    private final InterfaceC1701o f9523e;

    private final f f9524i;

    private final Object f9522d = new Object();

    private volatile boolean f9525v = false;

    private boolean f9526w = false;

    private boolean f9527y = false;

    LifecycleCamera(InterfaceC1701o interfaceC1701o, f fVar) {
        this.f9523e = interfaceC1701o;
        this.f9524i = fVar;
        if (interfaceC1701o.getLifecycle().getState().e(AbstractC1694h.b.STARTED)) {
            fVar.m();
        } else {
            fVar.A();
        }
        interfaceC1701o.getLifecycle().a(this);
    }

    public void A() {
        synchronized (this.f9522d) {
            try {
                if (this.f9526w) {
                    this.f9526w = false;
                    if (this.f9523e.getLifecycle().getState().e(AbstractC1694h.b.STARTED)) {
                        onStart(this.f9523e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public InterfaceC3054j a() {
        return this.f9524i.a();
    }

    @Override
    public InterfaceC3060o c() {
        return this.f9524i.c();
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
    public void onDestroy(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9522d) {
            f fVar = this.f9524i;
            fVar.Z(fVar.J());
        }
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_PAUSE)
    public void onPause(InterfaceC1701o interfaceC1701o) {
        this.f9524i.k(false);
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_RESUME)
    public void onResume(InterfaceC1701o interfaceC1701o) {
        this.f9524i.k(true);
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_START)
    public void onStart(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9522d) {
            try {
                if (!this.f9526w && !this.f9527y) {
                    this.f9524i.m();
                    this.f9525v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_STOP)
    public void onStop(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9522d) {
            try {
                if (!this.f9526w && !this.f9527y) {
                    this.f9524i.A();
                    this.f9525v = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(Collection<G0> collection) throws f.a {
        synchronized (this.f9522d) {
            this.f9524i.j(collection);
        }
    }

    public f s() {
        return this.f9524i;
    }

    public InterfaceC1701o t() {
        InterfaceC1701o interfaceC1701o;
        synchronized (this.f9522d) {
            interfaceC1701o = this.f9523e;
        }
        return interfaceC1701o;
    }

    InterfaceC3060o u() {
        return this.f9524i.G();
    }

    public List<G0> v() {
        List<G0> listUnmodifiableList;
        synchronized (this.f9522d) {
            listUnmodifiableList = Collections.unmodifiableList(this.f9524i.J());
        }
        return listUnmodifiableList;
    }

    public boolean w(G0 g02) {
        boolean zContains;
        synchronized (this.f9522d) {
            zContains = this.f9524i.J().contains(g02);
        }
        return zContains;
    }

    public void x() {
        synchronized (this.f9522d) {
            try {
                if (this.f9526w) {
                    return;
                }
                onStop(this.f9523e);
                this.f9526w = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void y(Collection<G0> collection) {
        synchronized (this.f9522d) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f9524i.J());
            this.f9524i.Z(arrayList);
        }
    }

    void z() {
        synchronized (this.f9522d) {
            f fVar = this.f9524i;
            fVar.Z(fVar.J());
        }
    }
}
