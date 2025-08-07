package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Z;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.BAKp.xAQOwX;
import t2.Dbl.hgESaf;
import u0.e;

abstract class I {

    private final ViewGroup f11110a;

    final ArrayList<e> f11111b = new ArrayList<>();

    final ArrayList<e> f11112c = new ArrayList<>();

    boolean f11113d = false;

    boolean f11114e = false;

    class a implements Runnable {

        final d f11115d;

        a(d dVar) {
            this.f11115d = dVar;
        }

        @Override
        public void run() {
            if (I.this.f11111b.contains(this.f11115d)) {
                this.f11115d.e().c(this.f11115d.f().mView);
            }
        }
    }

    class b implements Runnable {

        final d f11117d;

        b(d dVar) {
            this.f11117d = dVar;
        }

        @Override
        public void run() {
            I.this.f11111b.remove(this.f11117d);
            I.this.f11112c.remove(this.f11117d);
        }
    }

    static class c {

        static final int[] f11119a;

        static final int[] f11120b;

        static {
            int[] iArr = new int[e.b.values().length];
            f11120b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11120b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11120b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f11119a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11119a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11119a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11119a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        private final z f11121h;

        d(e.c cVar, e.b bVar, z zVar, u0.e eVar) {
            super(cVar, bVar, zVar.k(), eVar);
            this.f11121h = zVar;
        }

        @Override
        public void c() {
            super.c();
            this.f11121h.m();
        }

        @Override
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment fragmentK = this.f11121h.k();
                    View viewRequireView = fragmentK.requireView();
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f11121h.k();
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = f().requireView();
            if (viewRequireView2.getParent() == null) {
                this.f11121h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    static class e {

        private c f11122a;

        private b f11123b;

        private final Fragment f11124c;

        private final List<Runnable> f11125d = new ArrayList();

        private final HashSet<u0.e> f11126e = new HashSet<>();

        private boolean f11127f = false;

        private boolean f11128g = false;

        class a implements e.a {
            a() {
            }

            @Override
            public void onCancel() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c e(int i7) {
                if (i7 == 0) {
                    return VISIBLE;
                }
                if (i7 == 4) {
                    return INVISIBLE;
                }
                if (i7 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i7);
            }

            static c f(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : e(view.getVisibility());
            }

            void c(View view) {
                int i7 = c.f11119a[ordinal()];
                if (i7 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i7 == 3) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i7 != 4) {
                    return;
                }
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, u0.e eVar) {
            this.f11122a = cVar;
            this.f11123b = bVar;
            this.f11124c = fragment;
            eVar.b(new a());
        }

        final void a(Runnable runnable) {
            this.f11125d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f11127f = true;
            if (this.f11126e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f11126e).iterator();
            while (it.hasNext()) {
                ((u0.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f11128g) {
                return;
            }
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f11128g = true;
            Iterator<Runnable> it = this.f11125d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(u0.e eVar) {
            if (this.f11126e.remove(eVar) && this.f11126e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f11122a;
        }

        public final Fragment f() {
            return this.f11124c;
        }

        b g() {
            return this.f11123b;
        }

        final boolean h() {
            return this.f11127f;
        }

        final boolean i() {
            return this.f11128g;
        }

        public final void j(u0.e eVar) {
            l();
            this.f11126e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            int i7 = c.f11120b[bVar.ordinal()];
            if (i7 == 1) {
                if (this.f11122a == c.REMOVED) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f11124c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f11123b + " to ADDING.");
                    }
                    this.f11122a = c.VISIBLE;
                    this.f11123b = b.ADDING;
                    return;
                }
                return;
            }
            if (i7 == 2) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f11124c + " mFinalState = " + this.f11122a + " -> REMOVED. mLifecycleImpact  = " + this.f11123b + " to REMOVING.");
                }
                this.f11122a = c.REMOVED;
                this.f11123b = b.REMOVING;
                return;
            }
            if (i7 == 3 && this.f11122a != c.REMOVED) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f11124c + " mFinalState = " + this.f11122a + " -> " + cVar + ". ");
                }
                this.f11122a = cVar;
            }
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f11122a + "} {mLifecycleImpact = " + this.f11123b + "} {mFragment = " + this.f11124c + "}";
        }
    }

    I(ViewGroup viewGroup) {
        this.f11110a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, z zVar) {
        synchronized (this.f11111b) {
            try {
                u0.e eVar = new u0.e();
                e eVarH = h(zVar.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, zVar, eVar);
                this.f11111b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f11111b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f11112c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    static I n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.B0());
    }

    static I o(ViewGroup viewGroup, J j7) {
        int i7 = M0.b.f2345b;
        Object tag = viewGroup.getTag(i7);
        if (tag instanceof I) {
            return (I) tag;
        }
        I iA = j7.a(viewGroup);
        viewGroup.setTag(i7, iA);
        return iA;
    }

    private void q() {
        Iterator<e> it = this.f11111b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.e(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, z zVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + zVar.k());
        }
        a(cVar, e.b.ADDING, zVar);
    }

    void c(z zVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + zVar.k());
        }
        a(e.c.GONE, e.b.NONE, zVar);
    }

    void d(z zVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + zVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, zVar);
    }

    void e(z zVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + zVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, zVar);
    }

    abstract void f(List<e> list, boolean z7);

    void g() {
        if (this.f11114e) {
            return;
        }
        if (!Z.Q(this.f11110a)) {
            j();
            this.f11113d = false;
            return;
        }
        synchronized (this.f11111b) {
            try {
                if (!this.f11111b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f11112c);
                    this.f11112c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (FragmentManager.J0(2)) {
                            Log.v(xAQOwX.axL, "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f11112c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f11111b);
                    this.f11111b.clear();
                    this.f11112c.addAll(arrayList2);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f11113d);
                    this.f11113d = false;
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        String str;
        String str2;
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zQ = Z.Q(this.f11110a);
        synchronized (this.f11111b) {
            try {
                q();
                Iterator<e> it = this.f11111b.iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
                Iterator it2 = new ArrayList(this.f11112c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (FragmentManager.J0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zQ) {
                            str2 = BuildConfig.FLAVOR;
                        } else {
                            str2 = "Container " + this.f11110a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f11111b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (FragmentManager.J0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zQ) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = hgESaf.Vssnmglk + this.f11110a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f11114e) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f11114e = false;
            g();
        }
    }

    e.b l(z zVar) {
        e eVarH = h(zVar.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(zVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f11110a;
    }

    void p() {
        synchronized (this.f11111b) {
            try {
                q();
                this.f11114e = false;
                int size = this.f11111b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = this.f11111b.get(size);
                    e.c cVarF = e.c.f(eVar.f().mView);
                    e.c cVarE = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarE == cVar && cVarF != cVar) {
                        this.f11114e = eVar.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z7) {
        this.f11113d = z7;
    }
}
