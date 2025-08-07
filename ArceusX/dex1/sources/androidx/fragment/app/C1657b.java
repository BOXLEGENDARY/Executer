package androidx.fragment.app;

import U.Gw.oeVkjmfPcLbWm;
import Y3.qE.KpBmp;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.C1612d0;
import androidx.core.view.L;
import androidx.core.view.Z;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.fragment.app.C1664i;
import androidx.fragment.app.I;
import g0.C2457a;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.BAKp.xAQOwX;
import u0.e;
import z3.AdxZ.bpTQi;

class C1657b extends I {

    static class a {

        static final int[] f11143a;

        static {
            int[] iArr = new int[I.e.c.values().length];
            f11143a = iArr;
            try {
                iArr[I.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11143a[I.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11143a[I.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11143a[I.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class RunnableC0096b implements Runnable {

        final List f11144d;

        final I.e f11145e;

        RunnableC0096b(List list, I.e eVar) {
            this.f11144d = list;
            this.f11145e = eVar;
        }

        @Override
        public void run() {
            if (this.f11144d.contains(this.f11145e)) {
                this.f11144d.remove(this.f11145e);
                C1657b.this.s(this.f11145e);
            }
        }
    }

    class c extends AnimatorListenerAdapter {

        final ViewGroup f11147a;

        final View f11148b;

        final boolean f11149c;

        final I.e f11150d;

        final k f11151e;

        c(ViewGroup viewGroup, View view, boolean z7, I.e eVar, k kVar) {
            this.f11147a = viewGroup;
            this.f11148b = view;
            this.f11149c = z7;
            this.f11150d = eVar;
            this.f11151e = kVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11147a.endViewTransition(this.f11148b);
            if (this.f11149c) {
                this.f11150d.e().c(this.f11148b);
            }
            this.f11151e.a();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f11150d + xAQOwX.WtOJfKDqnMn);
            }
        }
    }

    class d implements e.a {

        final Animator f11153a;

        final I.e f11154b;

        d(Animator animator, I.e eVar) {
            this.f11153a = animator;
            this.f11154b = eVar;
        }

        @Override
        public void onCancel() {
            this.f11153a.end();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f11154b + " has been canceled.");
            }
        }
    }

    class e implements Animation.AnimationListener {

        final I.e f11156a;

        final ViewGroup f11157b;

        final View f11158c;

        final k f11159d;

        class a implements Runnable {
            a() {
            }

            @Override
            public void run() {
                e eVar = e.this;
                eVar.f11157b.endViewTransition(eVar.f11158c);
                e.this.f11159d.a();
            }
        }

        e(I.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f11156a = eVar;
            this.f11157b = viewGroup;
            this.f11158c = view;
            this.f11159d = kVar;
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            this.f11157b.post(new a());
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f11156a + " has ended.");
            }
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f11156a + " has reached onAnimationStart.");
            }
        }
    }

    class f implements e.a {

        final View f11162a;

        final ViewGroup f11163b;

        final k f11164c;

        final I.e f11165d;

        f(View view, ViewGroup viewGroup, k kVar, I.e eVar) {
            this.f11162a = view;
            this.f11163b = viewGroup;
            this.f11164c = kVar;
            this.f11165d = eVar;
        }

        @Override
        public void onCancel() {
            this.f11162a.clearAnimation();
            this.f11163b.endViewTransition(this.f11162a);
            this.f11164c.a();
            if (FragmentManager.J0(2)) {
                Log.v(bpTQi.LgFiGmmtdnaq, "Animation from operation " + this.f11165d + " has been cancelled.");
            }
        }
    }

    class g implements Runnable {

        final I.e f11167d;

        final I.e f11168e;

        final boolean f11169i;

        final C2457a f11170v;

        g(I.e eVar, I.e eVar2, boolean z7, C2457a c2457a) {
            this.f11167d = eVar;
            this.f11168e = eVar2;
            this.f11169i = z7;
            this.f11170v = c2457a;
        }

        @Override
        public void run() {
            C.a(this.f11167d.f(), this.f11168e.f(), this.f11169i, this.f11170v, false);
        }
    }

    class h implements Runnable {

        final E f11172d;

        final View f11173e;

        final Rect f11174i;

        h(E e7, View view, Rect rect) {
            this.f11172d = e7;
            this.f11173e = view;
            this.f11174i = rect;
        }

        @Override
        public void run() {
            this.f11172d.h(this.f11173e, this.f11174i);
        }
    }

    class i implements Runnable {

        final ArrayList f11176d;

        i(ArrayList arrayList) {
            this.f11176d = arrayList;
        }

        @Override
        public void run() {
            C.d(this.f11176d, 4);
        }
    }

    class j implements Runnable {

        final m f11178d;

        final I.e f11179e;

        j(m mVar, I.e eVar) {
            this.f11178d = mVar;
            this.f11179e = eVar;
        }

        @Override
        public void run() {
            this.f11178d.a();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f11179e + "has completed");
            }
        }
    }

    private static class k extends l {

        private boolean f11181c;

        private boolean f11182d;

        private C1664i.a f11183e;

        k(I.e eVar, u0.e eVar2, boolean z7) {
            super(eVar, eVar2);
            this.f11182d = false;
            this.f11181c = z7;
        }

        C1664i.a e(Context context) throws Resources.NotFoundException {
            if (this.f11182d) {
                return this.f11183e;
            }
            C1664i.a aVarB = C1664i.b(context, b().f(), b().e() == I.e.c.VISIBLE, this.f11181c);
            this.f11183e = aVarB;
            this.f11182d = true;
            return aVarB;
        }
    }

    private static class l {

        private final I.e f11184a;

        private final u0.e f11185b;

        l(I.e eVar, u0.e eVar2) {
            this.f11184a = eVar;
            this.f11185b = eVar2;
        }

        void a() {
            this.f11184a.d(this.f11185b);
        }

        I.e b() {
            return this.f11184a;
        }

        u0.e c() {
            return this.f11185b;
        }

        boolean d() {
            I.e.c cVar;
            I.e.c cVarF = I.e.c.f(this.f11184a.f().mView);
            I.e.c cVarE = this.f11184a.e();
            return cVarF == cVarE || !(cVarF == (cVar = I.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    private static class m extends l {

        private final Object f11186c;

        private final boolean f11187d;

        private final Object f11188e;

        m(I.e eVar, u0.e eVar2, boolean z7, boolean z8) {
            super(eVar, eVar2);
            if (eVar.e() == I.e.c.VISIBLE) {
                this.f11186c = z7 ? eVar.f().getReenterTransition() : eVar.f().getEnterTransition();
                this.f11187d = z7 ? eVar.f().getAllowReturnTransitionOverlap() : eVar.f().getAllowEnterTransitionOverlap();
            } else {
                this.f11186c = z7 ? eVar.f().getReturnTransition() : eVar.f().getExitTransition();
                this.f11187d = true;
            }
            if (!z8) {
                this.f11188e = null;
            } else if (z7) {
                this.f11188e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f11188e = eVar.f().getSharedElementEnterTransition();
            }
        }

        private E f(Object obj) {
            if (obj == null) {
                return null;
            }
            E e7 = C.f10945a;
            if (e7 != null && e7.e(obj)) {
                return e7;
            }
            E e8 = C.f10946b;
            if (e8 != null && e8.e(obj)) {
                return e8;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        E e() {
            E eF = f(this.f11186c);
            E eF2 = f(this.f11188e);
            if (eF == null || eF2 == null || eF == eF2) {
                return eF != null ? eF : eF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f11186c + " which uses a different Transition  type than its shared element transition " + this.f11188e);
        }

        public Object g() {
            return this.f11188e;
        }

        Object h() {
            return this.f11186c;
        }

        public boolean i() {
            return this.f11188e != null;
        }

        boolean j() {
            return this.f11187d;
        }
    }

    C1657b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<I.e> list2, boolean z7, Map<I.e, Boolean> map) throws Resources.NotFoundException {
        String str;
        int i7;
        boolean z8;
        Context context;
        View view;
        int i8;
        I.e eVar;
        ViewGroup viewGroupM = m();
        Context context2 = viewGroupM.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z9 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            str = oeVkjmfPcLbWm.kxAed;
            i7 = 2;
            if (!zHasNext) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                C1664i.a aVarE = next.e(context2);
                if (aVarE == null) {
                    next.a();
                } else {
                    Animator animator = aVarE.f11201b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        I.e eVarB = next.b();
                        Fragment fragmentF = eVarB.f();
                        if (Boolean.TRUE.equals(map.get(eVarB))) {
                            if (FragmentManager.J0(2)) {
                                Log.v(str, "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z10 = eVarB.e() == I.e.c.GONE;
                            if (z10) {
                                list2.remove(eVarB);
                            }
                            View view2 = fragmentF.mView;
                            viewGroupM.startViewTransition(view2);
                            animator.addListener(new c(viewGroupM, view2, z10, eVarB, next));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.J0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                eVar = eVarB;
                                sb.append(eVar);
                                sb.append(" has started.");
                                Log.v(str, sb.toString());
                            } else {
                                eVar = eVarB;
                            }
                            next.c().b(new d(animator, eVar));
                            z9 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            I.e eVarB2 = kVar.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z7) {
                if (FragmentManager.J0(i7)) {
                    Log.v(str, "Ignoring Animation set on " + fragmentF2 + KpBmp.uLjlOJSzMPSo);
                }
                kVar.a();
            } else if (z9) {
                if (FragmentManager.J0(i7)) {
                    Log.v(str, "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view3 = fragmentF2.mView;
                Animation animation = (Animation) x0.g.g(((C1664i.a) x0.g.g(kVar.e(context2))).f11200a);
                if (eVarB2.e() != I.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.a();
                    z8 = z9;
                    context = context2;
                    i8 = i7;
                    view = view3;
                } else {
                    viewGroupM.startViewTransition(view3);
                    C1664i.b bVar = new C1664i.b(animation, viewGroupM, view3);
                    z8 = z9;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(eVarB2, viewGroupM, view3, kVar));
                    view.startAnimation(bVar);
                    i8 = 2;
                    if (FragmentManager.J0(2)) {
                        Log.v(str, "Animation from operation " + eVarB2 + " has started.");
                    }
                }
                kVar.c().b(new f(view, viewGroupM, kVar, eVarB2));
                i7 = i8;
                z9 = z8;
                context2 = context;
            }
        }
    }

    private Map<I.e, Boolean> x(List<m> list, List<I.e> list2, boolean z7, I.e eVar, I.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        HashMap map;
        View view2;
        Object objK;
        C2457a c2457a;
        ArrayList<View> arrayList3;
        I.e eVar3;
        ArrayList<View> arrayList4;
        Rect rect;
        E e7;
        HashMap map2;
        I.e eVar4;
        View view3;
        View view4;
        View view5;
        String str4;
        boolean z8 = z7;
        I.e eVar5 = eVar;
        I.e eVar6 = eVar2;
        HashMap map3 = new HashMap();
        E e8 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                E e9 = mVar.e();
                if (e8 == null) {
                    e8 = e9;
                } else if (e9 != null && e8 != e9) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (e8 == null) {
            for (m mVar2 : list) {
                map3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C2457a c2457a2 = new C2457a();
        Iterator<m> it = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z9 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (!next.i() || eVar5 == null || eVar6 == null) {
                c2457a = c2457a2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                e7 = e8;
                map2 = map3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object objU = e8.u(e8.f(next.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view9 = view7;
                int i7 = 0;
                while (i7 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i7));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i7));
                    }
                    i7++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (z8) {
                    eVar.f().getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                } else {
                    eVar.f().getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                }
                int i8 = 0;
                for (int size = sharedElementSourceNames.size(); i8 < size; size = size) {
                    c2457a2.put(sharedElementSourceNames.get(i8), sharedElementTargetNames2.get(i8));
                    i8++;
                }
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", KwdswzaUHE.WfryIokJAC);
                    Iterator<String> it2 = sharedElementTargetNames2.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        str4 = YGBtcyQ.eHJ;
                        if (!zHasNext) {
                            break;
                        }
                        Log.v("FragmentManager", str4 + it2.next());
                        it2 = it2;
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", str4 + it3.next());
                    }
                }
                C2457a<String, View> c2457a3 = new C2457a<>();
                u(c2457a3, eVar.f().mView);
                c2457a3.o(sharedElementSourceNames);
                c2457a2.o(c2457a3.keySet());
                C2457a<String, View> c2457a4 = new C2457a<>();
                u(c2457a4, eVar2.f().mView);
                c2457a4.o(sharedElementTargetNames2);
                c2457a4.o(c2457a2.values());
                C.c(c2457a2, c2457a4);
                v(c2457a3, c2457a2.keySet());
                v(c2457a4, c2457a2.values());
                if (c2457a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c2457a = c2457a2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    e7 = e8;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    map2 = map3;
                } else {
                    C.a(eVar2.f(), eVar.f(), z8, c2457a3, true);
                    HashMap map4 = map3;
                    View view10 = view6;
                    c2457a = c2457a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    L.a(m(), new g(eVar2, eVar, z7, c2457a4));
                    arrayList5.addAll(c2457a3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view7 = view9;
                    } else {
                        view7 = c2457a3.get(sharedElementSourceNames.get(0));
                        e8.p(objU, view7);
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c2457a4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = c2457a4.get(sharedElementTargetNames2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        L.a(m(), new h(e8, view5, rect2));
                        view4 = view10;
                        z9 = true;
                    }
                    e8.s(objU, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    e7 = e8;
                    e8.n(objU, null, null, null, null, objU, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    map2 = map4;
                    map2.put(eVar3, bool);
                    eVar4 = eVar2;
                    map2.put(eVar4, bool);
                    obj3 = objU;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            map3 = map2;
            c2457a2 = c2457a;
            z8 = z7;
            arrayList6 = arrayList3;
            e8 = e7;
            I.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view11 = view7;
        C2457a c2457a5 = c2457a2;
        ArrayList<View> arrayList9 = arrayList6;
        I.e eVar8 = eVar5;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        E e10 = e8;
        HashMap map5 = map3;
        View view12 = view6;
        I.e eVar9 = eVar6;
        View view13 = view12;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object objK2 = null;
        for (m mVar3 : list) {
            if (mVar3.d()) {
                map5.put(mVar3.b(), Boolean.FALSE);
                mVar3.a();
            } else {
                Object objF = e10.f(mVar3.h());
                I.e eVarB = mVar3.b();
                boolean z10 = obj3 != null && (eVarB == eVar8 || eVarB == eVar9);
                if (objF == null) {
                    if (!z10) {
                        map5.put(eVarB, Boolean.FALSE);
                        mVar3.a();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view13;
                    objK = obj4;
                    map = map5;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj5 = obj4;
                    t(arrayList12, eVarB.f().mView);
                    if (z10) {
                        if (eVarB == eVar8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        e10.a(objF, view13);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view13;
                        obj2 = objK2;
                        map = map5;
                        obj = obj5;
                    } else {
                        e10.b(objF, arrayList12);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objK2;
                        arrayList2 = arrayList9;
                        map = map5;
                        e10.n(objF, objF, arrayList12, null, null, null, null);
                        if (eVarB.e() == I.e.c.GONE) {
                            list2.remove(eVarB);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVarB.f().mView);
                            e10.m(objF, eVarB.f().mView, arrayList13);
                            L.a(m(), new i(arrayList12));
                        }
                    }
                    if (eVarB.e() == I.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z9) {
                            e10.o(objF, rect3);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        e10.p(objF, view2);
                    }
                    map.put(eVarB, Boolean.TRUE);
                    if (mVar3.j()) {
                        objK2 = e10.k(obj2, objF, null);
                        objK = obj;
                    } else {
                        objK = e10.k(obj, objF, null);
                        objK2 = obj2;
                    }
                }
                eVar9 = eVar2;
                map5 = map;
                obj4 = objK;
                view11 = view2;
                str = str3;
                view13 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        String str5 = str;
        ArrayList<View> arrayList15 = arrayList10;
        HashMap map6 = map5;
        Object objJ = e10.j(objK2, obj4, obj3);
        if (objJ == null) {
            return map6;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object objH = mVar4.h();
                I.e eVarB2 = mVar4.b();
                HashMap map7 = map6;
                boolean z11 = obj3 != null && (eVarB2 == eVar8 || eVarB2 == eVar2);
                if (objH == null && !z11) {
                    str2 = str5;
                } else if (Z.R(m())) {
                    str2 = str5;
                    e10.q(mVar4.b().f(), objJ, mVar4.c(), new j(mVar4, eVarB2));
                } else {
                    if (FragmentManager.J0(2)) {
                        str2 = str5;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                    } else {
                        str2 = str5;
                    }
                    mVar4.a();
                }
                map6 = map7;
                str5 = str2;
            }
        }
        HashMap map8 = map6;
        String str6 = str5;
        if (!Z.R(m())) {
            return map8;
        }
        C.d(arrayList11, 4);
        ArrayList<String> arrayListL = e10.l(arrayList14);
        if (FragmentManager.J0(2)) {
            Log.v(str6, ">>>>> Beginning transition <<<<<");
            Log.v(str6, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it4 = arrayList15.iterator();
            while (it4.hasNext()) {
                View next2 = it4.next();
                Log.v(str6, "View: " + next2 + " Name: " + Z.H(next2));
            }
            Log.v(str6, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it5 = arrayList14.iterator();
            while (it5.hasNext()) {
                View next3 = it5.next();
                Log.v(str6, "View: " + next3 + " Name: " + Z.H(next3));
            }
        }
        e10.c(m(), objJ);
        e10.r(m(), arrayList15, arrayList14, arrayListL, c2457a5);
        C.d(arrayList11, 0);
        e10.t(obj3, arrayList15, arrayList14);
        return map8;
    }

    private void y(List<I.e> list) {
        Fragment fragmentF = list.get(list.size() - 1).f();
        for (I.e eVar : list) {
            eVar.f().mAnimationInfo.f10995c = fragmentF.mAnimationInfo.f10995c;
            eVar.f().mAnimationInfo.f10996d = fragmentF.mAnimationInfo.f10996d;
            eVar.f().mAnimationInfo.f10997e = fragmentF.mAnimationInfo.f10997e;
            eVar.f().mAnimationInfo.f10998f = fragmentF.mAnimationInfo.f10998f;
        }
    }

    @Override
    void f(java.util.List<androidx.fragment.app.I.e> r14, boolean r15) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1657b.f(java.util.List, boolean):void");
    }

    void s(I.e eVar) {
        eVar.e().c(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C1612d0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String strH = Z.H(view);
        if (strH != null) {
            map.put(strH, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(C2457a<String, View> c2457a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c2457a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(Z.H(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
