package androidx.core.view;

import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class C1654z {

    private final Runnable f10726a;

    private final CopyOnWriteArrayList<B> f10727b = new CopyOnWriteArrayList<>();

    private final Map<B, a> f10728c = new HashMap();

    private static class a {

        final AbstractC1694h f10729a;

        private InterfaceC1698l f10730b;

        a(AbstractC1694h abstractC1694h, InterfaceC1698l interfaceC1698l) {
            this.f10729a = abstractC1694h;
            this.f10730b = interfaceC1698l;
            abstractC1694h.a(interfaceC1698l);
        }

        void a() {
            this.f10729a.d(this.f10730b);
            this.f10730b = null;
        }
    }

    public C1654z(Runnable runnable) {
        this.f10726a = runnable;
    }

    public void f(B b2, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        if (aVar == AbstractC1694h.a.ON_DESTROY) {
            l(b2);
        }
    }

    public void g(AbstractC1694h.b bVar, B b2, InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
        if (aVar == AbstractC1694h.a.g(bVar)) {
            c(b2);
            return;
        }
        if (aVar == AbstractC1694h.a.ON_DESTROY) {
            l(b2);
        } else if (aVar == AbstractC1694h.a.e(bVar)) {
            this.f10727b.remove(b2);
            this.f10726a.run();
        }
    }

    public void c(B b2) {
        this.f10727b.add(b2);
        this.f10726a.run();
    }

    public void d(final B b2, InterfaceC1701o interfaceC1701o) {
        c(b2);
        AbstractC1694h lifecycle = interfaceC1701o.getLifecycle();
        a aVarRemove = this.f10728c.remove(b2);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f10728c.put(b2, new a(lifecycle, new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o2, AbstractC1694h.a aVar) {
                this.f10724d.f(b2, interfaceC1701o2, aVar);
            }
        }));
    }

    public void e(final B b2, InterfaceC1701o interfaceC1701o, final AbstractC1694h.b bVar) {
        AbstractC1694h lifecycle = interfaceC1701o.getLifecycle();
        a aVarRemove = this.f10728c.remove(b2);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f10728c.put(b2, new a(lifecycle, new InterfaceC1698l() {
            @Override
            public final void j(InterfaceC1701o interfaceC1701o2, AbstractC1694h.a aVar) {
                this.f10721d.g(bVar, b2, interfaceC1701o2, aVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<B> it = this.f10727b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<B> it = this.f10727b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<B> it = this.f10727b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<B> it = this.f10727b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(B b2) {
        this.f10727b.remove(b2);
        a aVarRemove = this.f10728c.remove(b2);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f10726a.run();
    }
}
