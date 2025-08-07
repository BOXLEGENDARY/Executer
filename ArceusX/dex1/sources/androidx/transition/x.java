package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import g0.C2457a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class x {

    private static AbstractC1733q f12402a = new C1717a();

    private static ThreadLocal<WeakReference<C2457a<ViewGroup, ArrayList<AbstractC1733q>>>> f12403b = new ThreadLocal<>();

    static ArrayList<ViewGroup> f12404c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        AbstractC1733q f12405d;

        ViewGroup f12406e;

        class C0123a extends w {

            final C2457a f12407a;

            C0123a(C2457a c2457a) {
                this.f12407a = c2457a;
            }

            @Override
            public void d(AbstractC1733q abstractC1733q) {
                ((ArrayList) this.f12407a.get(a.this.f12406e)).remove(abstractC1733q);
                abstractC1733q.a0(this);
            }
        }

        a(AbstractC1733q abstractC1733q, ViewGroup viewGroup) {
            this.f12405d = abstractC1733q;
            this.f12406e = viewGroup;
        }

        private void a() {
            this.f12406e.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f12406e.removeOnAttachStateChangeListener(this);
        }

        @Override
        public boolean onPreDraw() {
            a();
            if (!x.f12404c.remove(this.f12406e)) {
                return true;
            }
            C2457a<ViewGroup, ArrayList<AbstractC1733q>> c2457aD = x.d();
            ArrayList<AbstractC1733q> arrayList = c2457aD.get(this.f12406e);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c2457aD.put(this.f12406e, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f12405d);
            this.f12405d.a(new C0123a(c2457aD));
            this.f12405d.k(this.f12406e, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1733q) it.next()).c0(this.f12406e);
                }
            }
            this.f12405d.Z(this.f12406e);
            return true;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            a();
            x.f12404c.remove(this.f12406e);
            ArrayList<AbstractC1733q> arrayList = x.d().get(this.f12406e);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC1733q> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().c0(this.f12406e);
                }
            }
            this.f12405d.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC1733q abstractC1733q) {
        if (f12404c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f12404c.add(viewGroup);
        if (abstractC1733q == null) {
            abstractC1733q = f12402a;
        }
        AbstractC1733q abstractC1733qClone = abstractC1733q.clone();
        g(viewGroup, abstractC1733qClone);
        C1730n.f(viewGroup, null);
        f(viewGroup, abstractC1733qClone);
    }

    private static void b(C1730n c1730n, AbstractC1733q abstractC1733q) {
        ViewGroup viewGroupD = c1730n.d();
        if (f12404c.contains(viewGroupD)) {
            return;
        }
        C1730n c1730nC = C1730n.c(viewGroupD);
        if (abstractC1733q == null) {
            if (c1730nC != null) {
                c1730nC.b();
            }
            c1730n.a();
            return;
        }
        f12404c.add(viewGroupD);
        AbstractC1733q abstractC1733qClone = abstractC1733q.clone();
        if (c1730nC != null && c1730nC.e()) {
            abstractC1733qClone.f0(true);
        }
        g(viewGroupD, abstractC1733qClone);
        c1730n.a();
        f(viewGroupD, abstractC1733qClone);
    }

    public static void c(ViewGroup viewGroup) {
        f12404c.remove(viewGroup);
        ArrayList<AbstractC1733q> arrayList = d().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((AbstractC1733q) arrayList2.get(size)).r(viewGroup);
        }
    }

    static C2457a<ViewGroup, ArrayList<AbstractC1733q>> d() {
        C2457a<ViewGroup, ArrayList<AbstractC1733q>> c2457a;
        WeakReference<C2457a<ViewGroup, ArrayList<AbstractC1733q>>> weakReference = f12403b.get();
        if (weakReference != null && (c2457a = weakReference.get()) != null) {
            return c2457a;
        }
        C2457a<ViewGroup, ArrayList<AbstractC1733q>> c2457a2 = new C2457a<>();
        f12403b.set(new WeakReference<>(c2457a2));
        return c2457a2;
    }

    public static void e(C1730n c1730n, AbstractC1733q abstractC1733q) {
        b(c1730n, abstractC1733q);
    }

    private static void f(ViewGroup viewGroup, AbstractC1733q abstractC1733q) {
        if (abstractC1733q == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1733q, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void g(ViewGroup viewGroup, AbstractC1733q abstractC1733q) {
        ArrayList<AbstractC1733q> arrayList = d().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1733q> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().Y(viewGroup);
            }
        }
        if (abstractC1733q != null) {
            abstractC1733q.k(viewGroup, true);
        }
        C1730n c1730nC = C1730n.c(viewGroup);
        if (c1730nC != null) {
            c1730nC.b();
        }
    }
}
