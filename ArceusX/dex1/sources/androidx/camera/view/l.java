package androidx.camera.view;

import C.AbstractC0345p;
import C.H0;
import C.I;
import C.InterfaceC0364z;
import C.J;
import android.view.C1709w;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.InterfaceC2621a;
import z.C3043d0;
import z.InterfaceC3060o;

final class l implements H0.a<J.a> {

    private final I f9669a;

    private final C1709w<PreviewView.e> f9670b;

    private PreviewView.e f9671c;

    private final q f9672d;

    com.google.common.util.concurrent.p<Void> f9673e;

    private boolean f9674f = false;

    class a implements G.c<Void> {

        final List f9675a;

        final InterfaceC3060o f9676b;

        a(List list, InterfaceC3060o interfaceC3060o) {
            this.f9675a = list;
            this.f9676b = interfaceC3060o;
        }

        @Override
        public void onSuccess(Void r22) {
            l.this.f9673e = null;
        }

        @Override
        public void onFailure(Throwable th) {
            l.this.f9673e = null;
            if (this.f9675a.isEmpty()) {
                return;
            }
            Iterator it = this.f9675a.iterator();
            while (it.hasNext()) {
                ((I) this.f9676b).m((AbstractC0345p) it.next());
            }
            this.f9675a.clear();
        }
    }

    class b extends AbstractC0345p {

        final c.a f9678a;

        final InterfaceC3060o f9679b;

        b(c.a aVar, InterfaceC3060o interfaceC3060o) {
            this.f9678a = aVar;
            this.f9679b = interfaceC3060o;
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            this.f9678a.c(null);
            ((I) this.f9679b).m(this);
        }
    }

    l(I i7, C1709w<PreviewView.e> c1709w, q qVar) {
        this.f9669a = i7;
        this.f9670b = c1709w;
        this.f9672d = qVar;
        synchronized (this) {
            this.f9671c = c1709w.f();
        }
    }

    private void e() {
        com.google.common.util.concurrent.p<Void> pVar = this.f9673e;
        if (pVar != null) {
            pVar.cancel(false);
            this.f9673e = null;
        }
    }

    public com.google.common.util.concurrent.p g(Void r1) throws Exception {
        return this.f9672d.i();
    }

    public Void h(Void r1) {
        l(PreviewView.e.STREAMING);
        return null;
    }

    public Object i(InterfaceC3060o interfaceC3060o, List list, c.a aVar) throws Exception {
        b bVar = new b(aVar, interfaceC3060o);
        list.add(bVar);
        ((I) interfaceC3060o).g(F.a.a(), bVar);
        return "waitForCaptureResult";
    }

    private void k(InterfaceC3060o interfaceC3060o) {
        l(PreviewView.e.IDLE);
        ArrayList arrayList = new ArrayList();
        G.d dVarE = G.d.a(m(interfaceC3060o, arrayList)).g(new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return this.f9663a.g((Void) obj);
            }
        }, F.a.a()).e(new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return this.f9665a.h((Void) obj);
            }
        }, F.a.a());
        this.f9673e = dVarE;
        G.n.j(dVarE, new a(arrayList, interfaceC3060o), F.a.a());
    }

    private com.google.common.util.concurrent.p<Void> m(final InterfaceC3060o interfaceC3060o, final List<AbstractC0345p> list) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f9666a.i(interfaceC3060o, list, aVar);
            }
        });
    }

    void f() {
        e();
    }

    @Override
    public void a(J.a aVar) {
        if (aVar == J.a.CLOSING || aVar == J.a.CLOSED || aVar == J.a.RELEASING || aVar == J.a.RELEASED) {
            l(PreviewView.e.IDLE);
            if (this.f9674f) {
                this.f9674f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == J.a.OPENING || aVar == J.a.OPEN || aVar == J.a.PENDING_OPEN) && !this.f9674f) {
            k(this.f9669a);
            this.f9674f = true;
        }
    }

    void l(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f9671c.equals(eVar)) {
                    return;
                }
                this.f9671c = eVar;
                C3043d0.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f9670b.m(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void onError(Throwable th) {
        f();
        l(PreviewView.e.IDLE);
    }
}
