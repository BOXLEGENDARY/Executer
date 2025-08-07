package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.AbstractC1733q;
import java.util.ArrayList;
import java.util.List;
import u0.e;

public class C1723g extends androidx.fragment.app.E {

    class a extends AbstractC1733q.e {

        final Rect f12306a;

        a(Rect rect) {
            this.f12306a = rect;
        }

        @Override
        public Rect a(AbstractC1733q abstractC1733q) {
            return this.f12306a;
        }
    }

    class b implements AbstractC1733q.f {

        final View f12308a;

        final ArrayList f12309b;

        b(View view, ArrayList arrayList) {
            this.f12308a = view;
            this.f12309b = arrayList;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
            abstractC1733q.a0(this);
            abstractC1733q.a(this);
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            abstractC1733q.a0(this);
            this.f12308a.setVisibility(8);
            int size = this.f12309b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f12309b.get(i7)).setVisibility(0);
            }
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
        }
    }

    class c extends w {

        final Object f12311a;

        final ArrayList f12312b;

        final Object f12313c;

        final ArrayList f12314d;

        final Object f12315e;

        final ArrayList f12316f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f12311a = obj;
            this.f12312b = arrayList;
            this.f12313c = obj2;
            this.f12314d = arrayList2;
            this.f12315e = obj3;
            this.f12316f = arrayList3;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
            Object obj = this.f12311a;
            if (obj != null) {
                C1723g.this.y(obj, this.f12312b, null);
            }
            Object obj2 = this.f12313c;
            if (obj2 != null) {
                C1723g.this.y(obj2, this.f12314d, null);
            }
            Object obj3 = this.f12315e;
            if (obj3 != null) {
                C1723g.this.y(obj3, this.f12316f, null);
            }
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            abstractC1733q.a0(this);
        }
    }

    class d implements AbstractC1733q.f {

        final Runnable f12318a;

        d(Runnable runnable) {
            this.f12318a = runnable;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            this.f12318a.run();
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
        }
    }

    class e extends AbstractC1733q.e {

        final Rect f12320a;

        e(Rect rect) {
            this.f12320a = rect;
        }

        @Override
        public Rect a(AbstractC1733q abstractC1733q) {
            Rect rect = this.f12320a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f12320a;
        }
    }

    private static boolean w(AbstractC1733q abstractC1733q) {
        return (androidx.fragment.app.E.i(abstractC1733q.F()) && androidx.fragment.app.E.i(abstractC1733q.G()) && androidx.fragment.app.E.i(abstractC1733q.H())) ? false : true;
    }

    public static void x(Runnable runnable, AbstractC1733q abstractC1733q, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC1733q.cancel();
            runnable2.run();
        }
    }

    @Override
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1733q) obj).b(view);
        }
    }

    @Override
    public void b(Object obj, ArrayList<View> arrayList) {
        AbstractC1733q abstractC1733q = (AbstractC1733q) obj;
        if (abstractC1733q == null) {
            return;
        }
        int i7 = 0;
        if (abstractC1733q instanceof z) {
            z zVar = (z) abstractC1733q;
            int iT0 = zVar.t0();
            while (i7 < iT0) {
                b(zVar.s0(i7), arrayList);
                i7++;
            }
            return;
        }
        if (w(abstractC1733q) || !androidx.fragment.app.E.i(abstractC1733q.I())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            abstractC1733q.b(arrayList.get(i7));
            i7++;
        }
    }

    @Override
    public void c(ViewGroup viewGroup, Object obj) {
        x.a(viewGroup, (AbstractC1733q) obj);
    }

    @Override
    public boolean e(Object obj) {
        return obj instanceof AbstractC1733q;
    }

    @Override
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC1733q) obj).clone();
        }
        return null;
    }

    @Override
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC1733q abstractC1733qY0 = (AbstractC1733q) obj;
        AbstractC1733q abstractC1733q = (AbstractC1733q) obj2;
        AbstractC1733q abstractC1733q2 = (AbstractC1733q) obj3;
        if (abstractC1733qY0 != null && abstractC1733q != null) {
            abstractC1733qY0 = new z().q0(abstractC1733qY0).q0(abstractC1733q).y0(1);
        } else if (abstractC1733qY0 == null) {
            abstractC1733qY0 = abstractC1733q != null ? abstractC1733q : null;
        }
        if (abstractC1733q2 == null) {
            return abstractC1733qY0;
        }
        z zVar = new z();
        if (abstractC1733qY0 != null) {
            zVar.q0(abstractC1733qY0);
        }
        zVar.q0(abstractC1733q2);
        return zVar;
    }

    @Override
    public Object k(Object obj, Object obj2, Object obj3) {
        z zVar = new z();
        if (obj != null) {
            zVar.q0((AbstractC1733q) obj);
        }
        if (obj2 != null) {
            zVar.q0((AbstractC1733q) obj2);
        }
        if (obj3 != null) {
            zVar.q0((AbstractC1733q) obj3);
        }
        return zVar;
    }

    @Override
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC1733q) obj).a(new b(view, arrayList));
    }

    @Override
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC1733q) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1733q) obj).h0(new e(rect));
        }
    }

    @Override
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC1733q) obj).h0(new a(rect));
        }
    }

    @Override
    public void q(Fragment fragment, Object obj, u0.e eVar, Runnable runnable) {
        z(fragment, obj, eVar, null, runnable);
    }

    @Override
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        z zVar = (z) obj;
        List<View> listI = zVar.I();
        listI.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            androidx.fragment.app.E.d(listI, arrayList.get(i7));
        }
        listI.add(view);
        arrayList.add(view);
        b(zVar, arrayList);
    }

    @Override
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        z zVar = (z) obj;
        if (zVar != null) {
            zVar.I().clear();
            zVar.I().addAll(arrayList2);
            y(zVar, arrayList, arrayList2);
        }
    }

    @Override
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = new z();
        zVar.q0((AbstractC1733q) obj);
        return zVar;
    }

    public void y(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1733q abstractC1733q = (AbstractC1733q) obj;
        int i7 = 0;
        if (abstractC1733q instanceof z) {
            z zVar = (z) abstractC1733q;
            int iT0 = zVar.t0();
            while (i7 < iT0) {
                y(zVar.s0(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (w(abstractC1733q)) {
            return;
        }
        List<View> listI = abstractC1733q.I();
        if (listI.size() == arrayList.size() && listI.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i7 < size) {
                abstractC1733q.b(arrayList2.get(i7));
                i7++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1733q.b0(arrayList.get(size2));
            }
        }
    }

    public void z(Fragment fragment, Object obj, u0.e eVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC1733q abstractC1733q = (AbstractC1733q) obj;
        eVar.b(new e.a() {
            @Override
            public final void onCancel() {
                C1723g.x(runnable, abstractC1733q, runnable2);
            }
        });
        abstractC1733q.a(new d(runnable2));
    }
}
