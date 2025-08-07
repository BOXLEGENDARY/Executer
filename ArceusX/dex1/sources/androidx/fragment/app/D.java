package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class D extends E {

    class a extends Transition.EpicenterCallback {

        final Rect f10947a;

        a(Rect rect) {
            this.f10947a = rect;
        }

        @Override
        public Rect onGetEpicenter(Transition transition) {
            return this.f10947a;
        }
    }

    class b implements Transition.TransitionListener {

        final View f10949a;

        final ArrayList f10950b;

        b(View view, ArrayList arrayList) {
            this.f10949a = view;
            this.f10950b = arrayList;
        }

        @Override
        public void onTransitionCancel(Transition transition) {
        }

        @Override
        public void onTransitionEnd(Transition transition) {
            f.b(transition, this);
            this.f10949a.setVisibility(8);
            int size = this.f10950b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f10950b.get(i7)).setVisibility(0);
            }
        }

        @Override
        public void onTransitionPause(Transition transition) {
        }

        @Override
        public void onTransitionResume(Transition transition) {
        }

        @Override
        public void onTransitionStart(Transition transition) {
            f.b(transition, this);
            f.a(transition, this);
        }
    }

    class c implements Transition.TransitionListener {

        final Object f10952a;

        final ArrayList f10953b;

        final Object f10954c;

        final ArrayList f10955d;

        final Object f10956e;

        final ArrayList f10957f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10952a = obj;
            this.f10953b = arrayList;
            this.f10954c = obj2;
            this.f10955d = arrayList2;
            this.f10956e = obj3;
            this.f10957f = arrayList3;
        }

        @Override
        public void onTransitionCancel(Transition transition) {
        }

        @Override
        public void onTransitionEnd(Transition transition) {
            f.b(transition, this);
        }

        @Override
        public void onTransitionPause(Transition transition) {
        }

        @Override
        public void onTransitionResume(Transition transition) {
        }

        @Override
        public void onTransitionStart(Transition transition) {
            Object obj = this.f10952a;
            if (obj != null) {
                D.this.w(obj, this.f10953b, null);
            }
            Object obj2 = this.f10954c;
            if (obj2 != null) {
                D.this.w(obj2, this.f10955d, null);
            }
            Object obj3 = this.f10956e;
            if (obj3 != null) {
                D.this.w(obj3, this.f10957f, null);
            }
        }
    }

    class d implements Transition.TransitionListener {

        final Runnable f10959a;

        d(Runnable runnable) {
            this.f10959a = runnable;
        }

        @Override
        public void onTransitionCancel(Transition transition) {
        }

        @Override
        public void onTransitionEnd(Transition transition) {
            this.f10959a.run();
        }

        @Override
        public void onTransitionPause(Transition transition) {
        }

        @Override
        public void onTransitionResume(Transition transition) {
        }

        @Override
        public void onTransitionStart(Transition transition) {
        }
    }

    class e extends Transition.EpicenterCallback {

        final Rect f10961a;

        e(Rect rect) {
            this.f10961a = rect;
        }

        @Override
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f10961a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f10961a;
        }
    }

    static class f {
        static void a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        static void b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    D() {
    }

    private static boolean v(Transition transition) {
        return (E.i(transition.getTargetIds()) && E.i(transition.getTargetNames()) && E.i(transition.getTargetTypes())) ? false : true;
    }

    @Override
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                b(transitionSet.getTransitionAt(i7), arrayList);
                i7++;
            }
            return;
        }
        if (v(transition) || !E.i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            transition.addTarget(arrayList.get(i7));
            i7++;
        }
    }

    @Override
    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override
    public void q(Fragment fragment, Object obj, u0.e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            E.d(targets, arrayList.get(i7));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                w(transitionSet.getTransitionAt(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (v(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i7 < size) {
            transition.addTarget(arrayList2.get(i7));
            i7++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }
}
