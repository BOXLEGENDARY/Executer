package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.core.view.Z;
import androidx.transition.AbstractC1733q;
import com.github.luben.zstd.BuildConfig;
import g0.C2457a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractC1733q implements Cloneable {

    private static final Animator[] f12349c0 = new Animator[0];

    private static final int[] f12350d0 = {2, 1, 3, 4};

    private static final AbstractC1727k f12351e0 = new a();

    private static ThreadLocal<C2457a<Animator, d>> f12352f0 = new ThreadLocal<>();

    private ArrayList<B> f12365M;

    private ArrayList<B> f12366N;

    private f[] f12367O;

    y f12377Y;

    private e f12378Z;

    private C2457a<String, String> f12379a0;

    private String f12381d = getClass().getName();

    private long f12382e = -1;

    long f12383i = -1;

    private TimeInterpolator f12384v = null;

    ArrayList<Integer> f12385w = new ArrayList<>();

    ArrayList<View> f12386y = new ArrayList<>();

    private ArrayList<String> f12387z = null;

    private ArrayList<Class<?>> f12353A = null;

    private ArrayList<Integer> f12354B = null;

    private ArrayList<View> f12355C = null;

    private ArrayList<Class<?>> f12356D = null;

    private ArrayList<String> f12357E = null;

    private ArrayList<Integer> f12358F = null;

    private ArrayList<View> f12359G = null;

    private ArrayList<Class<?>> f12360H = null;

    private C f12361I = new C();

    private C f12362J = new C();

    z f12363K = null;

    private int[] f12364L = f12350d0;

    boolean f12368P = false;

    ArrayList<Animator> f12369Q = new ArrayList<>();

    private Animator[] f12370R = f12349c0;

    int f12371S = 0;

    private boolean f12372T = false;

    boolean f12373U = false;

    private AbstractC1733q f12374V = null;

    private ArrayList<f> f12375W = null;

    ArrayList<Animator> f12376X = new ArrayList<>();

    private AbstractC1727k f12380b0 = f12351e0;

    class a extends AbstractC1727k {
        a() {
        }

        @Override
        public Path a(float f7, float f8, float f9, float f10) {
            Path path = new Path();
            path.moveTo(f7, f8);
            path.lineTo(f9, f10);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        final C2457a f12388a;

        b(C2457a c2457a) {
            this.f12388a = c2457a;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f12388a.remove(animator);
            AbstractC1733q.this.f12369Q.remove(animator);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            AbstractC1733q.this.f12369Q.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractC1733q.this.q();
            animator.removeListener(this);
        }
    }

    private static class d {

        View f12391a;

        String f12392b;

        B f12393c;

        WindowId f12394d;

        AbstractC1733q f12395e;

        Animator f12396f;

        d(View view, String str, AbstractC1733q abstractC1733q, WindowId windowId, B b2, Animator animator) {
            this.f12391a = view;
            this.f12392b = str;
            this.f12393c = b2;
            this.f12394d = windowId;
            this.f12395e = abstractC1733q;
            this.f12396f = animator;
        }
    }

    public static abstract class e {
        public abstract Rect a(AbstractC1733q abstractC1733q);
    }

    public interface f {
        void a(AbstractC1733q abstractC1733q);

        void b(AbstractC1733q abstractC1733q);

        default void c(AbstractC1733q abstractC1733q, boolean z7) {
            d(abstractC1733q);
        }

        void d(AbstractC1733q abstractC1733q);

        void e(AbstractC1733q abstractC1733q);

        default void f(AbstractC1733q abstractC1733q, boolean z7) {
            a(abstractC1733q);
        }

        void g(AbstractC1733q abstractC1733q);
    }

    interface g {

        public static final g f12397a = new g() {
            @Override
            public final void a(AbstractC1733q.f fVar, AbstractC1733q abstractC1733q, boolean z7) {
                fVar.f(abstractC1733q, z7);
            }
        };

        public static final g f12398b = new g() {
            @Override
            public final void a(AbstractC1733q.f fVar, AbstractC1733q abstractC1733q, boolean z7) {
                fVar.c(abstractC1733q, z7);
            }
        };

        public static final g f12399c = new g() {
            @Override
            public final void a(AbstractC1733q.f fVar, AbstractC1733q abstractC1733q, boolean z7) {
                fVar.e(abstractC1733q);
            }
        };

        public static final g f12400d = new g() {
            @Override
            public final void a(AbstractC1733q.f fVar, AbstractC1733q abstractC1733q, boolean z7) {
                fVar.b(abstractC1733q);
            }
        };

        public static final g f12401e = new g() {
            @Override
            public final void a(AbstractC1733q.f fVar, AbstractC1733q abstractC1733q, boolean z7) {
                fVar.g(abstractC1733q);
            }
        };

        void a(f fVar, AbstractC1733q abstractC1733q, boolean z7);
    }

    private static C2457a<Animator, d> D() {
        C2457a<Animator, d> c2457a = f12352f0.get();
        if (c2457a != null) {
            return c2457a;
        }
        C2457a<Animator, d> c2457a2 = new C2457a<>();
        f12352f0.set(c2457a2);
        return c2457a2;
    }

    private static boolean P(B b2, B b3, String str) {
        Object obj = b2.f12209a.get(str);
        Object obj2 = b3.f12209a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void Q(C2457a<View, B> c2457a, C2457a<View, B> c2457a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            View viewValueAt = sparseArray.valueAt(i7);
            if (viewValueAt != null && O(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i7))) != null && O(view)) {
                B b2 = c2457a.get(viewValueAt);
                B b3 = c2457a2.get(view);
                if (b2 != null && b3 != null) {
                    this.f12365M.add(b2);
                    this.f12366N.add(b3);
                    c2457a.remove(viewValueAt);
                    c2457a2.remove(view);
                }
            }
        }
    }

    private void R(C2457a<View, B> c2457a, C2457a<View, B> c2457a2) {
        B bRemove;
        for (int size = c2457a.getSize() - 1; size >= 0; size--) {
            View viewG = c2457a.g(size);
            if (viewG != null && O(viewG) && (bRemove = c2457a2.remove(viewG)) != null && O(bRemove.f12210b)) {
                this.f12365M.add(c2457a.i(size));
                this.f12366N.add(bRemove);
            }
        }
    }

    private void S(C2457a<View, B> c2457a, C2457a<View, B> c2457a2, g0.h<View> hVar, g0.h<View> hVar2) {
        View viewD;
        int iK = hVar.k();
        for (int i7 = 0; i7 < iK; i7++) {
            View viewL = hVar.l(i7);
            if (viewL != null && O(viewL) && (viewD = hVar2.d(hVar.g(i7))) != null && O(viewD)) {
                B b2 = c2457a.get(viewL);
                B b3 = c2457a2.get(viewD);
                if (b2 != null && b3 != null) {
                    this.f12365M.add(b2);
                    this.f12366N.add(b3);
                    c2457a.remove(viewL);
                    c2457a2.remove(viewD);
                }
            }
        }
    }

    private void T(C2457a<View, B> c2457a, C2457a<View, B> c2457a2, C2457a<String, View> c2457a3, C2457a<String, View> c2457a4) {
        View view;
        int size = c2457a3.getSize();
        for (int i7 = 0; i7 < size; i7++) {
            View viewK = c2457a3.k(i7);
            if (viewK != null && O(viewK) && (view = c2457a4.get(c2457a3.g(i7))) != null && O(view)) {
                B b2 = c2457a.get(viewK);
                B b3 = c2457a2.get(view);
                if (b2 != null && b3 != null) {
                    this.f12365M.add(b2);
                    this.f12366N.add(b3);
                    c2457a.remove(viewK);
                    c2457a2.remove(view);
                }
            }
        }
    }

    private void V(C c2, C c3) {
        C2457a<View, B> c2457a = new C2457a<>(c2.f12212a);
        C2457a<View, B> c2457a2 = new C2457a<>(c3.f12212a);
        int i7 = 0;
        while (true) {
            int[] iArr = this.f12364L;
            if (i7 >= iArr.length) {
                c(c2457a, c2457a2);
                return;
            }
            int i8 = iArr[i7];
            if (i8 == 1) {
                R(c2457a, c2457a2);
            } else if (i8 == 2) {
                T(c2457a, c2457a2, c2.f12215d, c3.f12215d);
            } else if (i8 == 3) {
                Q(c2457a, c2457a2, c2.f12213b, c3.f12213b);
            } else if (i8 == 4) {
                S(c2457a, c2457a2, c2.f12214c, c3.f12214c);
            }
            i7++;
        }
    }

    private void W(AbstractC1733q abstractC1733q, g gVar, boolean z7) {
        AbstractC1733q abstractC1733q2 = this.f12374V;
        if (abstractC1733q2 != null) {
            abstractC1733q2.W(abstractC1733q, gVar, z7);
        }
        ArrayList<f> arrayList = this.f12375W;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f12375W.size();
        f[] fVarArr = this.f12367O;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f12367O = null;
        f[] fVarArr2 = (f[]) this.f12375W.toArray(fVarArr);
        for (int i7 = 0; i7 < size; i7++) {
            gVar.a(fVarArr2[i7], abstractC1733q, z7);
            fVarArr2[i7] = null;
        }
        this.f12367O = fVarArr2;
    }

    private void c(C2457a<View, B> c2457a, C2457a<View, B> c2457a2) {
        for (int i7 = 0; i7 < c2457a.getSize(); i7++) {
            B bK = c2457a.k(i7);
            if (O(bK.f12210b)) {
                this.f12365M.add(bK);
                this.f12366N.add(null);
            }
        }
        for (int i8 = 0; i8 < c2457a2.getSize(); i8++) {
            B bK2 = c2457a2.k(i8);
            if (O(bK2.f12210b)) {
                this.f12366N.add(bK2);
                this.f12365M.add(null);
            }
        }
    }

    private static void d(C c2, View view, B b2) {
        c2.f12212a.put(view, b2);
        int id = view.getId();
        if (id >= 0) {
            if (c2.f12213b.indexOfKey(id) >= 0) {
                c2.f12213b.put(id, null);
            } else {
                c2.f12213b.put(id, view);
            }
        }
        String strH = Z.H(view);
        if (strH != null) {
            if (c2.f12215d.containsKey(strH)) {
                c2.f12215d.put(strH, null);
            } else {
                c2.f12215d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2.f12214c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2.f12214c.h(itemIdAtPosition, view);
                    return;
                }
                View viewD = c2.f12214c.d(itemIdAtPosition);
                if (viewD != null) {
                    viewD.setHasTransientState(false);
                    c2.f12214c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    private void d0(Animator animator, C2457a<Animator, d> c2457a) {
        if (animator != null) {
            animator.addListener(new b(c2457a));
            e(animator);
        }
    }

    private void h(View view, boolean z7) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f12354B;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f12355C;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f12356D;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f12356D.get(i7).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    B b2 = new B(view);
                    if (z7) {
                        j(b2);
                    } else {
                        g(b2);
                    }
                    b2.f12211c.add(this);
                    i(b2);
                    if (z7) {
                        d(this.f12361I, view, b2);
                    } else {
                        d(this.f12362J, view, b2);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f12358F;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f12359G;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f12360H;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    if (this.f12360H.get(i8).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                                h(viewGroup.getChildAt(i9), z7);
                            }
                        }
                    }
                }
            }
        }
    }

    public y B() {
        return this.f12377Y;
    }

    public final AbstractC1733q C() {
        z zVar = this.f12363K;
        return zVar != null ? zVar.C() : this;
    }

    public long E() {
        return this.f12382e;
    }

    public List<Integer> F() {
        return this.f12385w;
    }

    public List<String> G() {
        return this.f12387z;
    }

    public List<Class<?>> H() {
        return this.f12353A;
    }

    public List<View> I() {
        return this.f12386y;
    }

    public String[] J() {
        return null;
    }

    public B L(View view, boolean z7) {
        z zVar = this.f12363K;
        if (zVar != null) {
            return zVar.L(view, z7);
        }
        return (z7 ? this.f12361I : this.f12362J).f12212a.get(view);
    }

    public boolean M(B b2, B b3) {
        if (b2 == null || b3 == null) {
            return false;
        }
        String[] strArrJ = J();
        if (strArrJ == null) {
            Iterator<String> it = b2.f12209a.keySet().iterator();
            while (it.hasNext()) {
                if (P(b2, b3, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrJ) {
            if (!P(b2, b3, str)) {
            }
        }
        return false;
        return true;
    }

    boolean O(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f12354B;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f12355C;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f12356D;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f12356D.get(i7).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f12357E != null && Z.H(view) != null && this.f12357E.contains(Z.H(view))) {
            return false;
        }
        if ((this.f12385w.size() == 0 && this.f12386y.size() == 0 && (((arrayList = this.f12353A) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12387z) == null || arrayList2.isEmpty()))) || this.f12385w.contains(Integer.valueOf(id)) || this.f12386y.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f12387z;
        if (arrayList6 != null && arrayList6.contains(Z.H(view))) {
            return true;
        }
        if (this.f12353A != null) {
            for (int i8 = 0; i8 < this.f12353A.size(); i8++) {
                if (this.f12353A.get(i8).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void X(g gVar, boolean z7) {
        W(this, gVar, z7);
    }

    public void Y(View view) {
        if (this.f12373U) {
            return;
        }
        int size = this.f12369Q.size();
        Animator[] animatorArr = (Animator[]) this.f12369Q.toArray(this.f12370R);
        this.f12370R = f12349c0;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.pause();
        }
        this.f12370R = animatorArr;
        X(g.f12400d, false);
        this.f12372T = true;
    }

    void Z(ViewGroup viewGroup) {
        d dVar;
        this.f12365M = new ArrayList<>();
        this.f12366N = new ArrayList<>();
        V(this.f12361I, this.f12362J);
        C2457a<Animator, d> c2457aD = D();
        int size = c2457aD.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animatorG = c2457aD.g(i7);
            if (animatorG != null && (dVar = c2457aD.get(animatorG)) != null && dVar.f12391a != null && windowId.equals(dVar.f12394d)) {
                B b2 = dVar.f12393c;
                View view = dVar.f12391a;
                B bL = L(view, true);
                B bX = x(view, true);
                if (bL == null && bX == null) {
                    bX = this.f12362J.f12212a.get(view);
                }
                if ((bL != null || bX != null) && dVar.f12395e.M(b2, bX)) {
                    dVar.f12395e.C().getClass();
                    if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        c2457aD.remove(animatorG);
                    }
                }
            }
        }
        p(viewGroup, this.f12361I, this.f12362J, this.f12365M, this.f12366N);
        e0();
    }

    public AbstractC1733q a(f fVar) {
        if (this.f12375W == null) {
            this.f12375W = new ArrayList<>();
        }
        this.f12375W.add(fVar);
        return this;
    }

    public AbstractC1733q a0(f fVar) {
        AbstractC1733q abstractC1733q;
        ArrayList<f> arrayList = this.f12375W;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(fVar) && (abstractC1733q = this.f12374V) != null) {
            abstractC1733q.a0(fVar);
        }
        if (this.f12375W.size() == 0) {
            this.f12375W = null;
        }
        return this;
    }

    public AbstractC1733q b(View view) {
        this.f12386y.add(view);
        return this;
    }

    public AbstractC1733q b0(View view) {
        this.f12386y.remove(view);
        return this;
    }

    public void c0(View view) {
        if (this.f12372T) {
            if (!this.f12373U) {
                int size = this.f12369Q.size();
                Animator[] animatorArr = (Animator[]) this.f12369Q.toArray(this.f12370R);
                this.f12370R = f12349c0;
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    Animator animator = animatorArr[i7];
                    animatorArr[i7] = null;
                    animator.resume();
                }
                this.f12370R = animatorArr;
                X(g.f12401e, false);
            }
            this.f12372T = false;
        }
    }

    protected void cancel() {
        int size = this.f12369Q.size();
        Animator[] animatorArr = (Animator[]) this.f12369Q.toArray(this.f12370R);
        this.f12370R = f12349c0;
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = animatorArr[i7];
            animatorArr[i7] = null;
            animator.cancel();
        }
        this.f12370R = animatorArr;
        X(g.f12399c, false);
    }

    protected void e(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void e0() {
        m0();
        C2457a<Animator, d> c2457aD = D();
        Iterator<Animator> it = this.f12376X.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c2457aD.containsKey(next)) {
                m0();
                d0(next, c2457aD);
            }
        }
        this.f12376X.clear();
        q();
    }

    void f0(boolean z7) {
        this.f12368P = z7;
    }

    public abstract void g(B b2);

    public AbstractC1733q g0(long j7) {
        this.f12383i = j7;
        return this;
    }

    public void h0(e eVar) {
        this.f12378Z = eVar;
    }

    void i(B b2) {
        String[] strArrB;
        if (this.f12377Y == null || b2.f12209a.isEmpty() || (strArrB = this.f12377Y.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!b2.f12209a.containsKey(str)) {
                this.f12377Y.a(b2);
                return;
            }
        }
    }

    public AbstractC1733q i0(TimeInterpolator timeInterpolator) {
        this.f12384v = timeInterpolator;
        return this;
    }

    public abstract void j(B b2);

    public void j0(AbstractC1727k abstractC1727k) {
        if (abstractC1727k == null) {
            this.f12380b0 = f12351e0;
        } else {
            this.f12380b0 = abstractC1727k;
        }
    }

    void k(ViewGroup viewGroup, boolean z7) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C2457a<String, String> c2457a;
        l(z7);
        if ((this.f12385w.size() > 0 || this.f12386y.size() > 0) && (((arrayList = this.f12387z) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12353A) == null || arrayList2.isEmpty()))) {
            for (int i7 = 0; i7 < this.f12385w.size(); i7++) {
                View viewFindViewById = viewGroup.findViewById(this.f12385w.get(i7).intValue());
                if (viewFindViewById != null) {
                    B b2 = new B(viewFindViewById);
                    if (z7) {
                        j(b2);
                    } else {
                        g(b2);
                    }
                    b2.f12211c.add(this);
                    i(b2);
                    if (z7) {
                        d(this.f12361I, viewFindViewById, b2);
                    } else {
                        d(this.f12362J, viewFindViewById, b2);
                    }
                }
            }
            for (int i8 = 0; i8 < this.f12386y.size(); i8++) {
                View view = this.f12386y.get(i8);
                B b3 = new B(view);
                if (z7) {
                    j(b3);
                } else {
                    g(b3);
                }
                b3.f12211c.add(this);
                i(b3);
                if (z7) {
                    d(this.f12361I, view, b3);
                } else {
                    d(this.f12362J, view, b3);
                }
            }
        } else {
            h(viewGroup, z7);
        }
        if (z7 || (c2457a = this.f12379a0) == null) {
            return;
        }
        int size = c2457a.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList3.add(this.f12361I.f12215d.remove(this.f12379a0.g(i9)));
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.f12361I.f12215d.put(this.f12379a0.k(i10), view2);
            }
        }
    }

    public void k0(y yVar) {
        this.f12377Y = yVar;
    }

    void l(boolean z7) {
        if (z7) {
            this.f12361I.f12212a.clear();
            this.f12361I.f12213b.clear();
            this.f12361I.f12214c.a();
        } else {
            this.f12362J.f12212a.clear();
            this.f12362J.f12213b.clear();
            this.f12362J.f12214c.a();
        }
    }

    public AbstractC1733q l0(long j7) {
        this.f12382e = j7;
        return this;
    }

    protected void m0() {
        if (this.f12371S == 0) {
            X(g.f12397a, false);
            this.f12373U = false;
        }
        this.f12371S++;
    }

    @Override
    public AbstractC1733q clone() {
        try {
            AbstractC1733q abstractC1733q = (AbstractC1733q) super.clone();
            abstractC1733q.f12376X = new ArrayList<>();
            abstractC1733q.f12361I = new C();
            abstractC1733q.f12362J = new C();
            abstractC1733q.f12365M = null;
            abstractC1733q.f12366N = null;
            abstractC1733q.f12374V = this;
            abstractC1733q.f12375W = null;
            return abstractC1733q;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    String n0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f12383i != -1) {
            sb.append("dur(");
            sb.append(this.f12383i);
            sb.append(") ");
        }
        if (this.f12382e != -1) {
            sb.append("dly(");
            sb.append(this.f12382e);
            sb.append(") ");
        }
        if (this.f12384v != null) {
            sb.append("interp(");
            sb.append(this.f12384v);
            sb.append(") ");
        }
        if (this.f12385w.size() > 0 || this.f12386y.size() > 0) {
            sb.append("tgts(");
            if (this.f12385w.size() > 0) {
                for (int i7 = 0; i7 < this.f12385w.size(); i7++) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f12385w.get(i7));
                }
            }
            if (this.f12386y.size() > 0) {
                for (int i8 = 0; i8 < this.f12386y.size(); i8++) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f12386y.get(i8));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public Animator o(ViewGroup viewGroup, B b2, B b3) {
        return null;
    }

    void p(ViewGroup viewGroup, C c2, C c3, ArrayList<B> arrayList, ArrayList<B> arrayList2) {
        Animator animatorO;
        int i7;
        View view;
        Animator animator;
        B b2;
        Animator animator2;
        B b3;
        C2457a<Animator, d> c2457aD = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        C().getClass();
        long jMin = Long.MAX_VALUE;
        int i8 = 0;
        while (i8 < size) {
            B b8 = arrayList.get(i8);
            B b9 = arrayList2.get(i8);
            if (b8 != null && !b8.f12211c.contains(this)) {
                b8 = null;
            }
            if (b9 != null && !b9.f12211c.contains(this)) {
                b9 = null;
            }
            if (!(b8 == null && b9 == null) && ((b8 == null || b9 == null || M(b8, b9)) && (animatorO = o(viewGroup, b8, b9)) != null)) {
                if (b9 != null) {
                    View view2 = b9.f12210b;
                    String[] strArrJ = J();
                    if (strArrJ != null && strArrJ.length > 0) {
                        b3 = new B(view2);
                        i7 = size;
                        B b10 = c3.f12212a.get(view2);
                        if (b10 != null) {
                            int i9 = 0;
                            while (i9 < strArrJ.length) {
                                Map<String, Object> map = b3.f12209a;
                                String str = strArrJ[i9];
                                map.put(str, b10.f12209a.get(str));
                                i9++;
                                strArrJ = strArrJ;
                            }
                        }
                        int size2 = c2457aD.getSize();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size2) {
                                animator2 = animatorO;
                                break;
                            }
                            d dVar = c2457aD.get(c2457aD.g(i10));
                            if (dVar.f12393c != null && dVar.f12391a == view2 && dVar.f12392b.equals(y()) && dVar.f12393c.equals(b3)) {
                                animator2 = null;
                                break;
                            }
                            i10++;
                        }
                    } else {
                        i7 = size;
                        animator2 = animatorO;
                        b3 = null;
                    }
                    animator = animator2;
                    view = view2;
                    b2 = b3;
                } else {
                    i7 = size;
                    view = b8.f12210b;
                    animator = animatorO;
                    b2 = null;
                }
                if (animator != null) {
                    y yVar = this.f12377Y;
                    if (yVar != null) {
                        long jC = yVar.c(viewGroup, this, b8, b9);
                        sparseIntArray.put(this.f12376X.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    c2457aD.put(animator, new d(view, y(), this, viewGroup.getWindowId(), b2, animator));
                    this.f12376X.add(animator);
                    jMin = jMin;
                }
            } else {
                i7 = size;
            }
            i8++;
            size = i7;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                d dVar2 = c2457aD.get(this.f12376X.get(sparseIntArray.keyAt(i11)));
                dVar2.f12396f.setStartDelay((sparseIntArray.valueAt(i11) - jMin) + dVar2.f12396f.getStartDelay());
            }
        }
    }

    protected void q() {
        int i7 = this.f12371S - 1;
        this.f12371S = i7;
        if (i7 == 0) {
            X(g.f12398b, false);
            for (int i8 = 0; i8 < this.f12361I.f12214c.k(); i8++) {
                View viewL = this.f12361I.f12214c.l(i8);
                if (viewL != null) {
                    viewL.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < this.f12362J.f12214c.k(); i9++) {
                View viewL2 = this.f12362J.f12214c.l(i9);
                if (viewL2 != null) {
                    viewL2.setHasTransientState(false);
                }
            }
            this.f12373U = true;
        }
    }

    void r(ViewGroup viewGroup) {
        C2457a<Animator, d> c2457aD = D();
        int size = c2457aD.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C2457a c2457a = new C2457a(c2457aD);
        c2457aD.clear();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            d dVar = (d) c2457a.k(i7);
            if (dVar.f12391a != null && windowId.equals(dVar.f12394d)) {
                ((Animator) c2457a.g(i7)).end();
            }
        }
    }

    public long s() {
        return this.f12383i;
    }

    public Rect t() {
        e eVar = this.f12378Z;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public String toString() {
        return n0(BuildConfig.FLAVOR);
    }

    public e v() {
        return this.f12378Z;
    }

    public TimeInterpolator w() {
        return this.f12384v;
    }

    androidx.transition.B x(android.view.View r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC1733q.x(android.view.View, boolean):androidx.transition.B");
    }

    public String y() {
        return this.f12381d;
    }

    public AbstractC1727k z() {
        return this.f12380b0;
    }
}
