package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g extends t {

    private static TimeInterpolator f11864s;

    private ArrayList<RecyclerView.D> f11865h = new ArrayList<>();

    private ArrayList<RecyclerView.D> f11866i = new ArrayList<>();

    private ArrayList<j> f11867j = new ArrayList<>();

    private ArrayList<i> f11868k = new ArrayList<>();

    ArrayList<ArrayList<RecyclerView.D>> f11869l = new ArrayList<>();

    ArrayList<ArrayList<j>> f11870m = new ArrayList<>();

    ArrayList<ArrayList<i>> f11871n = new ArrayList<>();

    ArrayList<RecyclerView.D> f11872o = new ArrayList<>();

    ArrayList<RecyclerView.D> f11873p = new ArrayList<>();

    ArrayList<RecyclerView.D> f11874q = new ArrayList<>();

    ArrayList<RecyclerView.D> f11875r = new ArrayList<>();

    class a implements Runnable {

        final ArrayList f11876d;

        a(ArrayList arrayList) {
            this.f11876d = arrayList;
        }

        @Override
        public void run() {
            Iterator it = this.f11876d.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.S(jVar.f11910a, jVar.f11911b, jVar.f11912c, jVar.f11913d, jVar.f11914e);
            }
            this.f11876d.clear();
            g.this.f11870m.remove(this.f11876d);
        }
    }

    class b implements Runnable {

        final ArrayList f11878d;

        b(ArrayList arrayList) {
            this.f11878d = arrayList;
        }

        @Override
        public void run() {
            Iterator it = this.f11878d.iterator();
            while (it.hasNext()) {
                g.this.R((i) it.next());
            }
            this.f11878d.clear();
            g.this.f11871n.remove(this.f11878d);
        }
    }

    class c implements Runnable {

        final ArrayList f11880d;

        c(ArrayList arrayList) {
            this.f11880d = arrayList;
        }

        @Override
        public void run() {
            Iterator it = this.f11880d.iterator();
            while (it.hasNext()) {
                g.this.Q((RecyclerView.D) it.next());
            }
            this.f11880d.clear();
            g.this.f11869l.remove(this.f11880d);
        }
    }

    class d extends AnimatorListenerAdapter {

        final RecyclerView.D f11882a;

        final ViewPropertyAnimator f11883b;

        final View f11884c;

        d(RecyclerView.D d7, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11882a = d7;
            this.f11883b = viewPropertyAnimator;
            this.f11884c = view;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11883b.setListener(null);
            this.f11884c.setAlpha(1.0f);
            g.this.G(this.f11882a);
            g.this.f11874q.remove(this.f11882a);
            g.this.V();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            g.this.H(this.f11882a);
        }
    }

    class e extends AnimatorListenerAdapter {

        final RecyclerView.D f11886a;

        final View f11887b;

        final ViewPropertyAnimator f11888c;

        e(RecyclerView.D d7, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11886a = d7;
            this.f11887b = view;
            this.f11888c = viewPropertyAnimator;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f11887b.setAlpha(1.0f);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11888c.setListener(null);
            g.this.A(this.f11886a);
            g.this.f11872o.remove(this.f11886a);
            g.this.V();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            g.this.B(this.f11886a);
        }
    }

    class f extends AnimatorListenerAdapter {

        final RecyclerView.D f11890a;

        final int f11891b;

        final View f11892c;

        final int f11893d;

        final ViewPropertyAnimator f11894e;

        f(RecyclerView.D d7, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
            this.f11890a = d7;
            this.f11891b = i7;
            this.f11892c = view;
            this.f11893d = i8;
            this.f11894e = viewPropertyAnimator;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            if (this.f11891b != 0) {
                this.f11892c.setTranslationX(0.0f);
            }
            if (this.f11893d != 0) {
                this.f11892c.setTranslationY(0.0f);
            }
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11894e.setListener(null);
            g.this.E(this.f11890a);
            g.this.f11873p.remove(this.f11890a);
            g.this.V();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            g.this.F(this.f11890a);
        }
    }

    class C0112g extends AnimatorListenerAdapter {

        final i f11896a;

        final ViewPropertyAnimator f11897b;

        final View f11898c;

        C0112g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11896a = iVar;
            this.f11897b = viewPropertyAnimator;
            this.f11898c = view;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11897b.setListener(null);
            this.f11898c.setAlpha(1.0f);
            this.f11898c.setTranslationX(0.0f);
            this.f11898c.setTranslationY(0.0f);
            g.this.C(this.f11896a.f11904a, true);
            g.this.f11875r.remove(this.f11896a.f11904a);
            g.this.V();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f11896a.f11904a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        final i f11900a;

        final ViewPropertyAnimator f11901b;

        final View f11902c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f11900a = iVar;
            this.f11901b = viewPropertyAnimator;
            this.f11902c = view;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11901b.setListener(null);
            this.f11902c.setAlpha(1.0f);
            this.f11902c.setTranslationX(0.0f);
            this.f11902c.setTranslationY(0.0f);
            g.this.C(this.f11900a.f11905b, false);
            g.this.f11875r.remove(this.f11900a.f11905b);
            g.this.V();
        }

        @Override
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f11900a.f11905b, false);
        }
    }

    private static class j {

        public RecyclerView.D f11910a;

        public int f11911b;

        public int f11912c;

        public int f11913d;

        public int f11914e;

        j(RecyclerView.D d7, int i7, int i8, int i9, int i10) {
            this.f11910a = d7;
            this.f11911b = i7;
            this.f11912c = i8;
            this.f11913d = i9;
            this.f11914e = i10;
        }
    }

    private void T(RecyclerView.D d7) {
        View view = d7.f11658a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f11874q.add(d7);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(d7, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List<i> list, RecyclerView.D d7) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d7) && iVar.f11904a == null && iVar.f11905b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.D d7 = iVar.f11904a;
        if (d7 != null) {
            Y(iVar, d7);
        }
        RecyclerView.D d8 = iVar.f11905b;
        if (d8 != null) {
            Y(iVar, d8);
        }
    }

    private boolean Y(i iVar, RecyclerView.D d7) {
        boolean z7 = false;
        if (iVar.f11905b == d7) {
            iVar.f11905b = null;
        } else {
            if (iVar.f11904a != d7) {
                return false;
            }
            iVar.f11904a = null;
            z7 = true;
        }
        d7.f11658a.setAlpha(1.0f);
        d7.f11658a.setTranslationX(0.0f);
        d7.f11658a.setTranslationY(0.0f);
        C(d7, z7);
        return true;
    }

    private void Z(RecyclerView.D d7) {
        if (f11864s == null) {
            f11864s = new ValueAnimator().getInterpolator();
        }
        d7.f11658a.animate().setInterpolator(f11864s);
        j(d7);
    }

    void Q(RecyclerView.D d7) {
        View view = d7.f11658a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f11872o.add(d7);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(d7, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.D d7 = iVar.f11904a;
        View view = d7 == null ? null : d7.f11658a;
        RecyclerView.D d8 = iVar.f11905b;
        View view2 = d8 != null ? d8.f11658a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f11875r.add(iVar.f11904a);
            duration.translationX(iVar.f11908e - iVar.f11906c);
            duration.translationY(iVar.f11909f - iVar.f11907d);
            duration.alpha(0.0f).setListener(new C0112g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f11875r.add(iVar.f11905b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.D d7, int i7, int i8, int i9, int i10) {
        View view = d7.f11658a;
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        if (i11 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i12 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f11873p.add(d7);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d7, i11, view, i12, viewPropertyAnimatorAnimate)).start();
    }

    void U(List<RecyclerView.D> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f11658a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override
    public boolean g(RecyclerView.D d7, List<Object> list) {
        return !list.isEmpty() || super.g(d7, list);
    }

    @Override
    public void j(RecyclerView.D d7) {
        View view = d7.f11658a;
        view.animate().cancel();
        int size = this.f11867j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f11867j.get(size).f11910a == d7) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d7);
                this.f11867j.remove(size);
            }
        }
        W(this.f11868k, d7);
        if (this.f11865h.remove(d7)) {
            view.setAlpha(1.0f);
            G(d7);
        }
        if (this.f11866i.remove(d7)) {
            view.setAlpha(1.0f);
            A(d7);
        }
        for (int size2 = this.f11871n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f11871n.get(size2);
            W(arrayList, d7);
            if (arrayList.isEmpty()) {
                this.f11871n.remove(size2);
            }
        }
        for (int size3 = this.f11870m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f11870m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f11910a == d7) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d7);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f11870m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f11869l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.D> arrayList3 = this.f11869l.get(size5);
            if (arrayList3.remove(d7)) {
                view.setAlpha(1.0f);
                A(d7);
                if (arrayList3.isEmpty()) {
                    this.f11869l.remove(size5);
                }
            }
        }
        this.f11874q.remove(d7);
        this.f11872o.remove(d7);
        this.f11875r.remove(d7);
        this.f11873p.remove(d7);
        V();
    }

    @Override
    public void k() {
        int size = this.f11867j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f11867j.get(size);
            View view = jVar.f11910a.f11658a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f11910a);
            this.f11867j.remove(size);
        }
        for (int size2 = this.f11865h.size() - 1; size2 >= 0; size2--) {
            G(this.f11865h.get(size2));
            this.f11865h.remove(size2);
        }
        int size3 = this.f11866i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.D d7 = this.f11866i.get(size3);
            d7.f11658a.setAlpha(1.0f);
            A(d7);
            this.f11866i.remove(size3);
        }
        for (int size4 = this.f11868k.size() - 1; size4 >= 0; size4--) {
            X(this.f11868k.get(size4));
        }
        this.f11868k.clear();
        if (p()) {
            for (int size5 = this.f11870m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f11870m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f11910a.f11658a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f11910a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f11870m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f11869l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.D> arrayList2 = this.f11869l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.D d8 = arrayList2.get(size8);
                    d8.f11658a.setAlpha(1.0f);
                    A(d8);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f11869l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f11871n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f11871n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f11871n.remove(arrayList3);
                    }
                }
            }
            U(this.f11874q);
            U(this.f11873p);
            U(this.f11872o);
            U(this.f11875r);
            i();
        }
    }

    @Override
    public boolean p() {
        return (this.f11866i.isEmpty() && this.f11868k.isEmpty() && this.f11867j.isEmpty() && this.f11865h.isEmpty() && this.f11873p.isEmpty() && this.f11874q.isEmpty() && this.f11872o.isEmpty() && this.f11875r.isEmpty() && this.f11870m.isEmpty() && this.f11869l.isEmpty() && this.f11871n.isEmpty()) ? false : true;
    }

    @Override
    public void u() {
        boolean zIsEmpty = this.f11865h.isEmpty();
        boolean zIsEmpty2 = this.f11867j.isEmpty();
        boolean zIsEmpty3 = this.f11868k.isEmpty();
        boolean zIsEmpty4 = this.f11866i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.D> it = this.f11865h.iterator();
        while (it.hasNext()) {
            T(it.next());
        }
        this.f11865h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f11867j);
            this.f11870m.add(arrayList);
            this.f11867j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                Z.g0(arrayList.get(0).f11910a.f11658a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f11868k);
            this.f11871n.add(arrayList2);
            this.f11868k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                Z.g0(arrayList2.get(0).f11904a.f11658a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.D> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f11866i);
        this.f11869l.add(arrayList3);
        this.f11866i.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            Z.g0(arrayList3.get(0).f11658a, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override
    public boolean w(RecyclerView.D d7) {
        Z(d7);
        d7.f11658a.setAlpha(0.0f);
        this.f11866i.add(d7);
        return true;
    }

    @Override
    public boolean x(RecyclerView.D d7, RecyclerView.D d8, int i7, int i8, int i9, int i10) {
        if (d7 == d8) {
            return y(d7, i7, i8, i9, i10);
        }
        float translationX = d7.f11658a.getTranslationX();
        float translationY = d7.f11658a.getTranslationY();
        float alpha = d7.f11658a.getAlpha();
        Z(d7);
        int i11 = (int) ((i9 - i7) - translationX);
        int i12 = (int) ((i10 - i8) - translationY);
        d7.f11658a.setTranslationX(translationX);
        d7.f11658a.setTranslationY(translationY);
        d7.f11658a.setAlpha(alpha);
        if (d8 != null) {
            Z(d8);
            d8.f11658a.setTranslationX(-i11);
            d8.f11658a.setTranslationY(-i12);
            d8.f11658a.setAlpha(0.0f);
        }
        this.f11868k.add(new i(d7, d8, i7, i8, i9, i10));
        return true;
    }

    @Override
    public boolean y(RecyclerView.D d7, int i7, int i8, int i9, int i10) {
        View view = d7.f11658a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) d7.f11658a.getTranslationY());
        Z(d7);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            E(d7);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        this.f11867j.add(new j(d7, translationX, translationY, i9, i10));
        return true;
    }

    @Override
    public boolean z(RecyclerView.D d7) {
        Z(d7);
        this.f11865h.add(d7);
        return true;
    }

    private static class i {

        public RecyclerView.D f11904a;

        public RecyclerView.D f11905b;

        public int f11906c;

        public int f11907d;

        public int f11908e;

        public int f11909f;

        private i(RecyclerView.D d7, RecyclerView.D d8) {
            this.f11904a = d7;
            this.f11905b = d8;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f11904a + ", newHolder=" + this.f11905b + ", fromX=" + this.f11906c + ", fromY=" + this.f11907d + ", toX=" + this.f11908e + ", toY=" + this.f11909f + '}';
        }

        i(RecyclerView.D d7, RecyclerView.D d8, int i7, int i8, int i9, int i10) {
            this(d7, d8);
            this.f11906c = i7;
            this.f11907d = i8;
            this.f11908e = i9;
            this.f11909f = i10;
        }
    }
}
