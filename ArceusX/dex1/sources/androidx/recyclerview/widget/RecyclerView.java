package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.C1605a;
import androidx.core.view.C1610c0;
import androidx.core.view.E;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import com.github.luben.zstd.BuildConfig;
import f6.ck.ZJZXBWla;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y0.C3001b;
import y0.C3019t;
import y0.xyyu.hkVlaTTCDY;

public class RecyclerView extends ViewGroup implements androidx.core.view.D {
    private static final int[] U0 = {R.attr.nestedScrollingEnabled};
    static final boolean V0 = false;

    static final boolean f11551W0 = true;

    static final boolean f11552X0 = true;

    static final boolean f11553Y0 = true;

    private static final boolean f11554Z0 = false;

    private static final boolean f11555a1 = false;

    private static final Class<?>[] f11556b1;

    static final Interpolator f11557c1;

    final Runnable f11558A;

    k.b f11559A0;

    final Rect f11560B;

    final A f11561B0;

    private final Rect f11562C;

    private u f11563C0;

    final RectF f11564D;

    private List<u> f11565D0;

    h f11566E;

    boolean f11567E0;

    p f11568F;

    boolean f11569F0;

    x f11570G;

    private m.b f11571G0;

    final List<x> f11572H;

    boolean f11573H0;

    final ArrayList<o> f11574I;

    androidx.recyclerview.widget.r f11575I0;

    private final ArrayList<t> f11576J;

    private final int[] f11577J0;

    private t f11578K;

    private E f11579K0;

    boolean f11580L;

    private final int[] f11581L0;

    boolean f11582M;

    private final int[] f11583M0;

    boolean f11584N;

    final int[] f11585N0;

    boolean f11586O;

    final List<D> f11587O0;

    private int f11588P;

    private Runnable f11589P0;

    boolean f11590Q;

    private boolean f11591Q0;

    boolean f11592R;

    private int f11593R0;

    private boolean f11594S;

    private int f11595S0;

    private int f11596T;
    private final w.b T0;

    boolean f11597U;

    private final AccessibilityManager f11598V;

    private List<r> f11599W;

    boolean f11600a0;

    boolean f11601b0;

    private int f11602c0;

    private final y f11603d;

    private int f11604d0;

    final w f11605e;

    private l f11606e0;

    private EdgeEffect f11607f0;

    private EdgeEffect f11608g0;

    private EdgeEffect f11609h0;

    SavedState f11610i;

    private EdgeEffect f11611i0;

    m f11612j0;

    private int f11613k0;

    private int f11614l0;

    private VelocityTracker f11615m0;

    private int f11616n0;

    private int f11617o0;

    private int f11618p0;

    private int f11619q0;

    private int f11620r0;

    private s f11621s0;

    private final int f11622t0;

    private final int f11623u0;

    a f11624v;

    private float f11625v0;

    androidx.recyclerview.widget.f f11626w;

    private float f11627w0;

    private boolean f11628x0;

    final androidx.recyclerview.widget.w f11629y;

    final C f11630y0;

    boolean f11631z;

    androidx.recyclerview.widget.k f11632z0;

    public static class A {

        private SparseArray<Object> f11634b;

        int f11645m;

        long f11646n;

        int f11647o;

        int f11648p;

        int f11649q;

        int f11633a = -1;

        int f11635c = 0;

        int f11636d = 0;

        int f11637e = 1;

        int f11638f = 0;

        boolean f11639g = false;

        boolean f11640h = false;

        boolean f11641i = false;

        boolean f11642j = false;

        boolean f11643k = false;

        boolean f11644l = false;

        void a(int i7) {
            if ((this.f11637e & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f11637e));
        }

        public int b() {
            return this.f11640h ? this.f11635c - this.f11636d : this.f11638f;
        }

        public int c() {
            return this.f11633a;
        }

        public boolean d() {
            return this.f11633a != -1;
        }

        public boolean e() {
            return this.f11640h;
        }

        void f(h hVar) {
            this.f11637e = 1;
            this.f11638f = hVar.e();
            this.f11640h = false;
            this.f11641i = false;
            this.f11642j = false;
        }

        public boolean g() {
            return this.f11644l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f11633a + ", mData=" + this.f11634b + ", mItemCount=" + this.f11638f + ", mIsMeasuring=" + this.f11642j + ", mPreviousLayoutItemCount=" + this.f11635c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f11636d + ", mStructureChanged=" + this.f11639g + ", mInPreLayout=" + this.f11640h + ", mRunSimpleAnimations=" + this.f11643k + ", mRunPredictiveAnimations=" + this.f11644l + '}';
        }
    }

    public static abstract class B {
    }

    class C implements Runnable {

        private int f11650d;

        private int f11651e;

        OverScroller f11652i;

        Interpolator f11653v;

        private boolean f11654w;

        private boolean f11655y;

        C() {
            Interpolator interpolator = RecyclerView.f11557c1;
            this.f11653v = interpolator;
            this.f11654w = false;
            this.f11655y = false;
            this.f11652i = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i7, int i8) {
            int iAbs = Math.abs(i7);
            int iAbs2 = Math.abs(i8);
            boolean z7 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z7 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z7) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            Z.f0(RecyclerView.this, this);
        }

        public void b(int i7, int i8) {
            RecyclerView.this.setScrollState(2);
            this.f11651e = 0;
            this.f11650d = 0;
            Interpolator interpolator = this.f11653v;
            Interpolator interpolator2 = RecyclerView.f11557c1;
            if (interpolator != interpolator2) {
                this.f11653v = interpolator2;
                this.f11652i = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f11652i.fling(0, 0, i7, i8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f11654w) {
                this.f11655y = true;
            } else {
                c();
            }
        }

        public void e(int i7, int i8, int i9, Interpolator interpolator) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = a(i7, i8);
            }
            int i10 = i9;
            if (interpolator == null) {
                interpolator = RecyclerView.f11557c1;
            }
            if (this.f11653v != interpolator) {
                this.f11653v = interpolator;
                this.f11652i = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f11651e = 0;
            this.f11650d = 0;
            RecyclerView.this.setScrollState(2);
            this.f11652i.startScroll(0, 0, i7, i8, i10);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f11652i.abortAnimation();
        }

        @Override
        public void run() {
            int i7;
            int i8;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f11568F == null) {
                f();
                return;
            }
            this.f11655y = false;
            this.f11654w = true;
            recyclerView.t();
            OverScroller overScroller = this.f11652i;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i9 = currX - this.f11650d;
                int i10 = currY - this.f11651e;
                this.f11650d = currX;
                this.f11651e = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f11585N0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.E(i9, i10, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f11585N0;
                    i9 -= iArr2[0];
                    i10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.s(i9, i10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f11566E != null) {
                    int[] iArr3 = recyclerView3.f11585N0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.g1(i9, i10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f11585N0;
                    i8 = iArr4[0];
                    i7 = iArr4[1];
                    i9 -= i8;
                    i10 -= i7;
                    z zVar = recyclerView4.f11568F.f11708g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = RecyclerView.this.f11561B0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else if (zVar.f() >= iB) {
                            zVar.p(iB - 1);
                            zVar.j(i8, i7);
                        } else {
                            zVar.j(i8, i7);
                        }
                    }
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (!RecyclerView.this.f11574I.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f11585N0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.F(i8, i7, i9, i10, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f11585N0;
                int i11 = i9 - iArr6[0];
                int i12 = i10 - iArr6[1];
                if (i8 != 0 || i7 != 0) {
                    recyclerView6.H(i8, i7);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z7 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                z zVar2 = RecyclerView.this.f11568F.f11708g;
                if ((zVar2 == null || !zVar2.g()) && z7) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i13, currVelocity);
                    }
                    if (RecyclerView.f11553Y0) {
                        RecyclerView.this.f11559A0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.k kVar = recyclerView7.f11632z0;
                    if (kVar != null) {
                        kVar.f(recyclerView7, i8, i7);
                    }
                }
            }
            z zVar3 = RecyclerView.this.f11568F.f11708g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f11654w = false;
            if (this.f11655y) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.t1(1);
            }
        }
    }

    public static abstract class D {

        private static final List<Object> f11657t = Collections.emptyList();

        public final View f11658a;

        WeakReference<RecyclerView> f11659b;

        int f11667j;

        RecyclerView f11675r;

        h<? extends D> f11676s;

        int f11660c = -1;

        int f11661d = -1;

        long f11662e = -1;

        int f11663f = -1;

        int f11664g = -1;

        D f11665h = null;

        D f11666i = null;

        List<Object> f11668k = null;

        List<Object> f11669l = null;

        private int f11670m = 0;

        w f11671n = null;

        boolean f11672o = false;

        private int f11673p = 0;

        int f11674q = -1;

        public D(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f11658a = view;
        }

        private void g() {
            if (this.f11668k == null) {
                ArrayList arrayList = new ArrayList();
                this.f11668k = arrayList;
                this.f11669l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.f11667j & 2) != 0;
        }

        boolean B() {
            return (this.f11667j & 2) != 0;
        }

        void C(int i7, boolean z7) {
            if (this.f11661d == -1) {
                this.f11661d = this.f11660c;
            }
            if (this.f11664g == -1) {
                this.f11664g = this.f11660c;
            }
            if (z7) {
                this.f11664g += i7;
            }
            this.f11660c += i7;
            if (this.f11658a.getLayoutParams() != null) {
                ((q) this.f11658a.getLayoutParams()).f11728c = true;
            }
        }

        void D(RecyclerView recyclerView) {
            int i7 = this.f11674q;
            if (i7 != -1) {
                this.f11673p = i7;
            } else {
                this.f11673p = Z.x(this.f11658a);
            }
            recyclerView.j1(this, 4);
        }

        void E(RecyclerView recyclerView) {
            recyclerView.j1(this, this.f11673p);
            this.f11673p = 0;
        }

        void F() {
            this.f11667j = 0;
            this.f11660c = -1;
            this.f11661d = -1;
            this.f11662e = -1L;
            this.f11664g = -1;
            this.f11670m = 0;
            this.f11665h = null;
            this.f11666i = null;
            d();
            this.f11673p = 0;
            this.f11674q = -1;
            RecyclerView.q(this);
        }

        void G() {
            if (this.f11661d == -1) {
                this.f11661d = this.f11660c;
            }
        }

        void H(int i7, int i8) {
            this.f11667j = (i7 & i8) | (this.f11667j & (~i8));
        }

        public final void I(boolean z7) {
            int i7 = this.f11670m;
            int i8 = z7 ? i7 - 1 : i7 + 1;
            this.f11670m = i8;
            if (i8 < 0) {
                this.f11670m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z7 && i8 == 1) {
                this.f11667j |= 16;
            } else if (z7 && i8 == 0) {
                this.f11667j &= -17;
            }
        }

        void J(w wVar, boolean z7) {
            this.f11671n = wVar;
            this.f11672o = z7;
        }

        boolean K() {
            return (this.f11667j & 16) != 0;
        }

        boolean L() {
            return (this.f11667j & 128) != 0;
        }

        void M() {
            this.f11671n.J(this);
        }

        boolean N() {
            return (this.f11667j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f11667j) == 0) {
                g();
                this.f11668k.add(obj);
            }
        }

        void b(int i7) {
            this.f11667j = i7 | this.f11667j;
        }

        void c() {
            this.f11661d = -1;
            this.f11664g = -1;
        }

        void d() {
            List<Object> list = this.f11668k;
            if (list != null) {
                list.clear();
            }
            this.f11667j &= -1025;
        }

        void e() {
            this.f11667j &= -33;
        }

        void f() {
            this.f11667j &= -257;
        }

        boolean h() {
            return (this.f11667j & 16) == 0 && Z.O(this.f11658a);
        }

        void i(int i7, int i8, boolean z7) {
            b(8);
            C(i8, z7);
            this.f11660c = i7;
        }

        public final int j() {
            RecyclerView recyclerView = this.f11675r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.a0(this);
        }

        @Deprecated
        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int iA0;
            if (this.f11676s == null || (recyclerView = this.f11675r) == null || (adapter = recyclerView.getAdapter()) == null || (iA0 = this.f11675r.a0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f11676s, this, iA0);
        }

        public final long m() {
            return this.f11662e;
        }

        public final int n() {
            return this.f11663f;
        }

        public final int o() {
            int i7 = this.f11664g;
            return i7 == -1 ? this.f11660c : i7;
        }

        public final int p() {
            return this.f11661d;
        }

        List<Object> q() {
            if ((this.f11667j & 1024) != 0) {
                return f11657t;
            }
            List<Object> list = this.f11668k;
            return (list == null || list.size() == 0) ? f11657t : this.f11669l;
        }

        boolean r(int i7) {
            return (i7 & this.f11667j) != 0;
        }

        boolean s() {
            return (this.f11667j & 512) != 0 || v();
        }

        boolean t() {
            return (this.f11658a.getParent() == null || this.f11658a.getParent() == this.f11675r) ? false : true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f11660c + " id=" + this.f11662e + ", oldPos=" + this.f11661d + ", pLpos:" + this.f11664g);
            if (y()) {
                sb.append(" scrap ");
                sb.append(this.f11672o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb.append(" invalid");
            }
            if (!u()) {
                sb.append(" unbound");
            }
            if (B()) {
                sb.append(" update");
            }
            if (x()) {
                sb.append(" removed");
            }
            if (L()) {
                sb.append(" ignored");
            }
            if (z()) {
                sb.append(" tmpDetached");
            }
            if (!w()) {
                sb.append(" not recyclable(" + this.f11670m + ")");
            }
            if (s()) {
                sb.append(" undefined adapter position");
            }
            if (this.f11658a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            return (this.f11667j & 1) != 0;
        }

        boolean v() {
            return (this.f11667j & 4) != 0;
        }

        public final boolean w() {
            return (this.f11667j & 16) == 0 && !Z.O(this.f11658a);
        }

        boolean x() {
            return (this.f11667j & 8) != 0;
        }

        boolean y() {
            return this.f11671n != null;
        }

        boolean z() {
            return (this.f11667j & 256) != 0;
        }
    }

    class RunnableC1713a implements Runnable {
        RunnableC1713a() {
        }

        @Override
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f11586O || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f11580L) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f11592R) {
                recyclerView2.f11590Q = true;
            } else {
                recyclerView2.t();
            }
        }
    }

    class RunnableC1714b implements Runnable {
        RunnableC1714b() {
        }

        @Override
        public void run() {
            m mVar = RecyclerView.this.f11612j0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f11573H0 = false;
        }
    }

    class InterpolatorC1715c implements Interpolator {
        InterpolatorC1715c() {
        }

        @Override
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    class C1716d implements w.b {
        C1716d() {
        }

        @Override
        public void a(D d7) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11568F.q1(d7.f11658a, recyclerView.f11605e);
        }

        @Override
        public void b(D d7, m.c cVar, m.c cVar2) {
            RecyclerView.this.k(d7, cVar, cVar2);
        }

        @Override
        public void c(D d7, m.c cVar, m.c cVar2) {
            RecyclerView.this.f11605e.J(d7);
            RecyclerView.this.m(d7, cVar, cVar2);
        }

        @Override
        public void d(D d7, m.c cVar, m.c cVar2) {
            d7.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f11600a0) {
                if (recyclerView.f11612j0.b(d7, d7, cVar, cVar2)) {
                    RecyclerView.this.M0();
                }
            } else if (recyclerView.f11612j0.d(d7, cVar, cVar2)) {
                RecyclerView.this.M0();
            }
        }
    }

    class e implements f.b {
        e() {
        }

        @Override
        public View a(int i7) {
            return RecyclerView.this.getChildAt(i7);
        }

        @Override
        public void b(View view) {
            D dE0 = RecyclerView.e0(view);
            if (dE0 != null) {
                dE0.D(RecyclerView.this);
            }
        }

        @Override
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override
        public void d() {
            int iC = c();
            for (int i7 = 0; i7 < iC; i7++) {
                View viewA = a(i7);
                RecyclerView.this.y(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override
        public D f(View view) {
            return RecyclerView.e0(view);
        }

        @Override
        public void g(int i7) {
            D dE0;
            View viewA = a(i7);
            if (viewA != null && (dE0 = RecyclerView.e0(viewA)) != null) {
                if (dE0.z() && !dE0.L()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + dE0 + RecyclerView.this.O());
                }
                dE0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i7);
        }

        @Override
        public void h(View view) {
            D dE0 = RecyclerView.e0(view);
            if (dE0 != null) {
                dE0.E(RecyclerView.this);
            }
        }

        @Override
        public void i(View view, int i7) {
            RecyclerView.this.addView(view, i7);
            RecyclerView.this.x(view);
        }

        @Override
        public void j(int i7) {
            View childAt = RecyclerView.this.getChildAt(i7);
            if (childAt != null) {
                RecyclerView.this.y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i7);
        }

        @Override
        public void k(View view, int i7, ViewGroup.LayoutParams layoutParams) {
            D dE0 = RecyclerView.e0(view);
            if (dE0 != null) {
                if (!dE0.z() && !dE0.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + dE0 + RecyclerView.this.O());
                }
                dE0.f();
            }
            RecyclerView.this.attachViewToParent(view, i7, layoutParams);
        }
    }

    class f implements a.InterfaceC0110a {
        f() {
        }

        @Override
        public void a(int i7, int i8) {
            RecyclerView.this.C0(i7, i8);
            RecyclerView.this.f11567E0 = true;
        }

        @Override
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override
        public void c(int i7, int i8, Object obj) {
            RecyclerView.this.w1(i7, i8, obj);
            RecyclerView.this.f11569F0 = true;
        }

        @Override
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override
        public D e(int i7) {
            D dY = RecyclerView.this.Y(i7, true);
            if (dY == null || RecyclerView.this.f11626w.n(dY.f11658a)) {
                return null;
            }
            return dY;
        }

        @Override
        public void f(int i7, int i8) {
            RecyclerView.this.D0(i7, i8, false);
            RecyclerView.this.f11567E0 = true;
        }

        @Override
        public void g(int i7, int i8) {
            RecyclerView.this.B0(i7, i8);
            RecyclerView.this.f11567E0 = true;
        }

        @Override
        public void h(int i7, int i8) {
            RecyclerView.this.D0(i7, i8, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11567E0 = true;
            recyclerView.f11561B0.f11636d += i8;
        }

        void i(a.b bVar) {
            int i7 = bVar.f11824a;
            if (i7 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f11568F.V0(recyclerView, bVar.f11825b, bVar.f11827d);
                return;
            }
            if (i7 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f11568F.Y0(recyclerView2, bVar.f11825b, bVar.f11827d);
            } else if (i7 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f11568F.a1(recyclerView3, bVar.f11825b, bVar.f11827d, bVar.f11826c);
            } else {
                if (i7 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f11568F.X0(recyclerView4, bVar.f11825b, bVar.f11827d, 1);
            }
        }
    }

    static class g {

        static final int[] f11683a;

        static {
            int[] iArr = new int[h.a.values().length];
            f11683a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11683a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h<VH extends D> {

        private final i f11684a = new i();

        private boolean f11685b = false;

        private a f11686c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(boolean z7) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f11685b = z7;
        }

        public void B(j jVar) {
            this.f11684a.unregisterObserver(jVar);
        }

        public final void a(VH vh, int i7) {
            boolean z7 = vh.f11676s == null;
            if (z7) {
                vh.f11660c = i7;
                if (i()) {
                    vh.f11662e = f(i7);
                }
                vh.H(1, 519);
                u0.m.a("RV OnBindView");
            }
            vh.f11676s = this;
            s(vh, i7, vh.q());
            if (z7) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.f11658a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f11728c = true;
                }
                u0.m.b();
            }
        }

        boolean b() {
            int i7 = g.f11683a[this.f11686c.ordinal()];
            if (i7 != 1) {
                return i7 != 2 || e() > 0;
            }
            return false;
        }

        public final VH c(ViewGroup viewGroup, int i7) {
            try {
                u0.m.a("RV CreateView");
                VH vh = (VH) t(viewGroup, i7);
                if (vh.f11658a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.f11663f = i7;
                return vh;
            } finally {
                u0.m.b();
            }
        }

        public int d(h<? extends D> hVar, D d7, int i7) {
            if (hVar == this) {
                return i7;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i7) {
            return -1L;
        }

        public int g(int i7) {
            return 0;
        }

        public final boolean h() {
            return this.f11684a.a();
        }

        public final boolean i() {
            return this.f11685b;
        }

        public final void j() {
            this.f11684a.b();
        }

        public final void k(int i7) {
            this.f11684a.d(i7, 1);
        }

        public final void l(int i7, Object obj) {
            this.f11684a.e(i7, 1, obj);
        }

        public final void m(int i7, int i8) {
            this.f11684a.c(i7, i8);
        }

        public final void n(int i7, int i8, Object obj) {
            this.f11684a.e(i7, i8, obj);
        }

        public final void o(int i7, int i8) {
            this.f11684a.f(i7, i8);
        }

        public final void p(int i7, int i8) {
            this.f11684a.g(i7, i8);
        }

        public void q(RecyclerView recyclerView) {
        }

        public abstract void r(VH vh, int i7);

        public void s(VH vh, int i7, List<Object> list) {
            r(vh, i7);
        }

        public abstract VH t(ViewGroup viewGroup, int i7);

        public void u(RecyclerView recyclerView) {
        }

        public boolean v(VH vh) {
            return false;
        }

        public void w(VH vh) {
        }

        public void x(VH vh) {
        }

        public void y(VH vh) {
        }

        public void z(j jVar) {
            this.f11684a.registerObserver(jVar);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i7, i8, 1);
            }
        }

        public void d(int i7, int i8) {
            e(i7, i8, null);
        }

        public void e(int i7, int i8, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i7, i8, obj);
            }
        }

        public void f(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i7, i8);
            }
        }

        public void g(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i7, i8);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i7, int i8) {
        }

        public void c(int i7, int i8, Object obj) {
            b(i7, i8);
        }

        public void d(int i7, int i8) {
        }

        public void e(int i7, int i8, int i9) {
        }

        public void f(int i7, int i8) {
        }
    }

    public interface k {
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        private b f11691a = null;

        private ArrayList<a> f11692b = new ArrayList<>();

        private long f11693c = 120;

        private long f11694d = 120;

        private long f11695e = 250;

        private long f11696f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(D d7);
        }

        public static class c {

            public int f11697a;

            public int f11698b;

            public int f11699c;

            public int f11700d;

            public c a(D d7) {
                return b(d7, 0);
            }

            public c b(D d7, int i7) {
                View view = d7.f11658a;
                this.f11697a = view.getLeft();
                this.f11698b = view.getTop();
                this.f11699c = view.getRight();
                this.f11700d = view.getBottom();
                return this;
            }
        }

        static int e(D d7) {
            int i7 = d7.f11667j;
            int i8 = i7 & 14;
            if (d7.v()) {
                return 4;
            }
            if ((i7 & 4) != 0) {
                return i8;
            }
            int iP = d7.p();
            int iJ = d7.j();
            return (iP == -1 || iJ == -1 || iP == iJ) ? i8 : i8 | 2048;
        }

        public abstract boolean a(D d7, c cVar, c cVar2);

        public abstract boolean b(D d7, D d8, c cVar, c cVar2);

        public abstract boolean c(D d7, c cVar, c cVar2);

        public abstract boolean d(D d7, c cVar, c cVar2);

        public abstract boolean f(D d7);

        public boolean g(D d7, List<Object> list) {
            return f(d7);
        }

        public final void h(D d7) {
            r(d7);
            b bVar = this.f11691a;
            if (bVar != null) {
                bVar.a(d7);
            }
        }

        public final void i() {
            int size = this.f11692b.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f11692b.get(i7).a();
            }
            this.f11692b.clear();
        }

        public abstract void j(D d7);

        public abstract void k();

        public long l() {
            return this.f11693c;
        }

        public long m() {
            return this.f11696f;
        }

        public long n() {
            return this.f11695e;
        }

        public long o() {
            return this.f11694d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(D d7) {
        }

        public c s(A a2, D d7) {
            return q().a(d7);
        }

        public c t(A a2, D d7, int i7, List<Object> list) {
            return q().a(d7);
        }

        public abstract void u();

        void v(b bVar) {
            this.f11691a = bVar;
        }
    }

    private class n implements m.b {
        n() {
        }

        @Override
        public void a(D d7) {
            d7.I(true);
            if (d7.f11665h != null && d7.f11666i == null) {
                d7.f11665h = null;
            }
            d7.f11666i = null;
            if (d7.K() || RecyclerView.this.V0(d7.f11658a) || !d7.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d7.f11658a, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void d(Rect rect, int i7, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, A a2) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, A a2) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, A a2) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class p {

        androidx.recyclerview.widget.f f11702a;

        RecyclerView f11703b;

        private final v.b f11704c;

        private final v.b f11705d;

        androidx.recyclerview.widget.v f11706e;

        androidx.recyclerview.widget.v f11707f;

        z f11708g;

        boolean f11709h;

        boolean f11710i;

        boolean f11711j;

        private boolean f11712k;

        private boolean f11713l;

        int f11714m;

        boolean f11715n;

        private int f11716o;

        private int f11717p;

        private int f11718q;

        private int f11719r;

        class a implements v.b {
            a() {
            }

            @Override
            public View a(int i7) {
                return p.this.N(i7);
            }

            @Override
            public int b(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override
            public int c() {
                return p.this.i0();
            }

            @Override
            public int d() {
                return p.this.s0() - p.this.j0();
            }

            @Override
            public int e(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements v.b {
            b() {
            }

            @Override
            public View a(int i7) {
                return p.this.N(i7);
            }

            @Override
            public int b(View view) {
                return p.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override
            public int c() {
                return p.this.k0();
            }

            @Override
            public int d() {
                return p.this.b0() - p.this.h0();
            }

            @Override
            public int e(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i7, int i8);
        }

        public static class d {

            public int f11722a;

            public int f11723b;

            public boolean f11724c;

            public boolean f11725d;
        }

        public p() {
            a aVar = new a();
            this.f11704c = aVar;
            b bVar = new b();
            this.f11705d = bVar;
            this.f11706e = new androidx.recyclerview.widget.v(aVar);
            this.f11707f = new androidx.recyclerview.widget.v(bVar);
            this.f11709h = false;
            this.f11710i = false;
            this.f11711j = false;
            this.f11712k = true;
            this.f11713l = true;
        }

        private static boolean A0(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (i9 > 0 && i7 != i9) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i7;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i7;
            }
            return true;
        }

        private void D(int i7, View view) {
            this.f11702a.d(i7);
        }

        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.P(int, int, int, int, boolean):int");
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i7 = left - iI0;
            int iMin = Math.min(0, i7);
            int i8 = top - iK0;
            int iMin2 = Math.min(0, i8);
            int i9 = iWidth - iS0;
            int iMax = Math.max(0, i9);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i7, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i9);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i8, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i7, boolean z7) {
            D dE0 = RecyclerView.e0(view);
            if (z7 || dE0.x()) {
                this.f11703b.f11629y.b(dE0);
            } else {
                this.f11703b.f11629y.p(dE0);
            }
            q qVar = (q) view.getLayoutParams();
            if (dE0.N() || dE0.y()) {
                if (dE0.y()) {
                    dE0.M();
                } else {
                    dE0.e();
                }
                this.f11702a.c(view, i7, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f11703b) {
                int iM = this.f11702a.m(view);
                if (i7 == -1) {
                    i7 = this.f11702a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f11703b.indexOfChild(view) + this.f11703b.O());
                }
                if (iM != i7) {
                    this.f11703b.f11568F.F0(iM, i7);
                }
            } else {
                this.f11702a.a(view, i7, false);
                qVar.f11728c = true;
                z zVar = this.f11708g;
                if (zVar != null && zVar.h()) {
                    this.f11708g.k(view);
                }
            }
            if (qVar.f11729d) {
                dE0.f11658a.invalidate();
                qVar.f11729d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i7, int i8) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X0.c.f7894f, i7, i8);
            dVar.f11722a = typedArrayObtainStyledAttributes.getInt(X0.c.f7895g, 1);
            dVar.f11723b = typedArrayObtainStyledAttributes.getInt(X0.c.f7905q, 1);
            dVar.f11724c = typedArrayObtainStyledAttributes.getBoolean(X0.c.f7904p, false);
            dVar.f11725d = typedArrayObtainStyledAttributes.getBoolean(X0.c.f7906r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
        }

        private boolean x0(RecyclerView recyclerView, int i7, int i8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f11703b.f11560B;
            U(focusedChild, rect);
            return rect.left - i7 < iS0 && rect.right - i7 > iI0 && rect.top - i8 < iB0 && rect.bottom - i8 > iK0;
        }

        private void z1(w wVar, int i7, View view) {
            D dE0 = RecyclerView.e0(view);
            if (dE0.L()) {
                return;
            }
            if (dE0.v() && !dE0.x() && !this.f11703b.f11566E.i()) {
                u1(i7);
                wVar.C(dE0);
            } else {
                C(i7);
                wVar.D(view);
                this.f11703b.f11629y.k(dE0);
            }
        }

        public int A(A a2) {
            return 0;
        }

        public int A1(int i7, w wVar, A a2) {
            return 0;
        }

        public void B(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(wVar, iO, N(iO));
            }
        }

        public boolean B0() {
            z zVar = this.f11708g;
            return zVar != null && zVar.h();
        }

        public void B1(int i7) {
        }

        public void C(int i7) {
            D(i7, N(i7));
        }

        public boolean C0(View view, boolean z7, boolean z8) {
            boolean z9 = this.f11706e.b(view, 24579) && this.f11707f.b(view, 24579);
            return z7 ? z9 : !z9;
        }

        public int C1(int i7, w wVar, A a2) {
            return 0;
        }

        public void D0(View view, int i7, int i8, int i9, int i10) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f11727b;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f11710i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i7, int i8) {
            q qVar = (q) view.getLayoutParams();
            Rect rectJ0 = this.f11703b.j0(view);
            int i9 = i7 + rectJ0.left + rectJ0.right;
            int i10 = i8 + rectJ0.top + rectJ0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i9, ((ViewGroup.MarginLayoutParams) qVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) qVar).height, q());
            if (J1(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i7, int i8) {
            this.f11718q = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.f11716o = mode;
            if (mode == 0 && !RecyclerView.f11551W0) {
                this.f11718q = 0;
            }
            this.f11719r = View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f11717p = mode2;
            if (mode2 != 0 || RecyclerView.f11551W0) {
                return;
            }
            this.f11719r = 0;
        }

        void F(RecyclerView recyclerView, w wVar) {
            this.f11710i = false;
            M0(recyclerView, wVar);
        }

        public void F0(int i7, int i8) {
            View viewN = N(i7);
            if (viewN != null) {
                C(i7);
                m(viewN, i8);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i7 + this.f11703b.toString());
            }
        }

        public void F1(int i7, int i8) {
            this.f11703b.setMeasuredDimension(i7, i8);
        }

        public View G(View view) {
            View viewQ;
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView == null || (viewQ = recyclerView.Q(view)) == null || this.f11702a.n(viewQ)) {
                return null;
            }
            return viewQ;
        }

        public void G0(int i7) {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                recyclerView.z0(i7);
            }
        }

        public void G1(Rect rect, int i7, int i8) {
            F1(s(i7, rect.width() + i0() + j0(), g0()), s(i8, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i7) {
            int iO = O();
            for (int i8 = 0; i8 < iO; i8++) {
                View viewN = N(i8);
                D dE0 = RecyclerView.e0(viewN);
                if (dE0 != null && dE0.o() == i7 && !dE0.L() && (this.f11703b.f11561B0.e() || !dE0.x())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i7) {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                recyclerView.A0(i7);
            }
        }

        void H1(int i7, int i8) {
            int iO = O();
            if (iO == 0) {
                this.f11703b.v(i7, i8);
                return;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                Rect rect = this.f11703b.f11560B;
                U(viewN, rect);
                int i14 = rect.left;
                if (i14 < i12) {
                    i12 = i14;
                }
                int i15 = rect.right;
                if (i15 > i9) {
                    i9 = i15;
                }
                int i16 = rect.top;
                if (i16 < i10) {
                    i10 = i16;
                }
                int i17 = rect.bottom;
                if (i17 > i11) {
                    i11 = i17;
                }
            }
            this.f11703b.f11560B.set(i12, i10, i9, i11);
            G1(this.f11703b.f11560B, i7, i8);
        }

        public abstract q I();

        public void I0(h hVar, h hVar2) {
        }

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f11703b = null;
                this.f11702a = null;
                this.f11718q = 0;
                this.f11719r = 0;
            } else {
                this.f11703b = recyclerView;
                this.f11702a = recyclerView.f11626w;
                this.f11718q = recyclerView.getWidth();
                this.f11719r = recyclerView.getHeight();
            }
            this.f11716o = 1073741824;
            this.f11717p = 1073741824;
        }

        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList<View> arrayList, int i7, int i8) {
            return false;
        }

        boolean J1(View view, int i7, int i8, q qVar) {
            return (!view.isLayoutRequested() && this.f11712k && A0(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public void K0(RecyclerView recyclerView) {
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        @Deprecated
        public void L0(RecyclerView recyclerView) {
        }

        boolean L1(View view, int i7, int i8, q qVar) {
            return (this.f11712k && A0(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).f11727b.bottom;
        }

        public void M0(RecyclerView recyclerView, w wVar) {
            L0(recyclerView);
        }

        public void M1(RecyclerView recyclerView, A a2, int i7) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View N(int i7) {
            androidx.recyclerview.widget.f fVar = this.f11702a;
            if (fVar != null) {
                return fVar.f(i7);
            }
            return null;
        }

        public View N0(View view, int i7, w wVar, A a2) {
            return null;
        }

        public void N1(z zVar) {
            z zVar2 = this.f11708g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f11708g.r();
            }
            this.f11708g = zVar;
            zVar.q(this.f11703b, this);
        }

        public int O() {
            androidx.recyclerview.widget.f fVar = this.f11702a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f11703b;
            P0(recyclerView.f11605e, recyclerView.f11561B0, accessibilityEvent);
        }

        void O1() {
            z zVar = this.f11708g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void P0(w wVar, A a2, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z7 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f11703b.canScrollVertically(-1) && !this.f11703b.canScrollHorizontally(-1) && !this.f11703b.canScrollHorizontally(1)) {
                z7 = false;
            }
            accessibilityEvent.setScrollable(z7);
            h hVar = this.f11703b.f11566E;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public boolean P1() {
            return false;
        }

        public void Q0(w wVar, A a2, C3019t c3019t) {
            if (this.f11703b.canScrollVertically(-1) || this.f11703b.canScrollHorizontally(-1)) {
                c3019t.a(8192);
                c3019t.x0(true);
            }
            if (this.f11703b.canScrollVertically(1) || this.f11703b.canScrollHorizontally(1)) {
                c3019t.a(4096);
                c3019t.x0(true);
            }
            c3019t.g0(C3019t.e.a(o0(wVar, a2), S(wVar, a2), z0(wVar, a2), p0(wVar, a2)));
        }

        public boolean R() {
            RecyclerView recyclerView = this.f11703b;
            return recyclerView != null && recyclerView.f11631z;
        }

        void R0(C3019t c3019t) {
            RecyclerView recyclerView = this.f11703b;
            Q0(recyclerView.f11605e, recyclerView.f11561B0, c3019t);
        }

        public int S(w wVar, A a2) {
            return -1;
        }

        void S0(View view, C3019t c3019t) {
            D dE0 = RecyclerView.e0(view);
            if (dE0 == null || dE0.x() || this.f11702a.n(dE0.f11658a)) {
                return;
            }
            RecyclerView recyclerView = this.f11703b;
            T0(recyclerView.f11605e, recyclerView.f11561B0, view, c3019t);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(w wVar, A a2, View view, C3019t c3019t) {
        }

        public void U(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public View U0(View view, int i7) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(RecyclerView recyclerView, int i7, int i8) {
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).f11727b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView) {
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).f11727b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i7, int i8, int i9) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i7, int i8) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i7, int i8) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f11702a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i7, int i8, Object obj) {
            Z0(recyclerView, i7, i8);
        }

        public int b0() {
            return this.f11719r;
        }

        public void b1(w wVar, A a2) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int c0() {
            return this.f11717p;
        }

        public void c1(A a2) {
        }

        public int d0() {
            return Z.z(this.f11703b);
        }

        public void d1(w wVar, A a2, int i7, int i8) {
            this.f11703b.v(i7, i8);
        }

        public int e() {
            RecyclerView recyclerView = this.f11703b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).f11727b.left;
        }

        @Deprecated
        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.t0();
        }

        public int f0() {
            return Z.A(this.f11703b);
        }

        public boolean f1(RecyclerView recyclerView, A a2, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return Z.B(this.f11703b);
        }

        public void g1(Parcelable parcelable) {
        }

        public void h(View view, int i7) {
            k(view, i7, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i7) {
        }

        public void j(View view, int i7) {
            k(view, i7, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(z zVar) {
            if (this.f11708g == zVar) {
                this.f11708g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f11703b;
            return l1(recyclerView.f11605e, recyclerView.f11561B0, i7, bundle);
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                recyclerView.n(str);
            }
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean l1(w wVar, A a2, int i7, Bundle bundle) {
            int iB0;
            int iS0;
            int i8;
            int i9;
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView == null) {
                return false;
            }
            if (i7 == 4096) {
                iB0 = recyclerView.canScrollVertically(1) ? (b0() - k0()) - h0() : 0;
                if (this.f11703b.canScrollHorizontally(1)) {
                    iS0 = (s0() - i0()) - j0();
                    i8 = iB0;
                    i9 = iS0;
                }
                i8 = iB0;
                i9 = 0;
            } else if (i7 != 8192) {
                i9 = 0;
                i8 = 0;
            } else {
                iB0 = recyclerView.canScrollVertically(-1) ? -((b0() - k0()) - h0()) : 0;
                if (this.f11703b.canScrollHorizontally(-1)) {
                    iS0 = -((s0() - i0()) - j0());
                    i8 = iB0;
                    i9 = iS0;
                }
                i8 = iB0;
                i9 = 0;
            }
            if (i8 == 0 && i9 == 0) {
                return false;
            }
            this.f11703b.o1(i9, i8, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void m(View view, int i7) {
            n(view, i7, (q) view.getLayoutParams());
        }

        boolean m1(View view, int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f11703b;
            return n1(recyclerView.f11605e, recyclerView.f11561B0, view, i7, bundle);
        }

        public void n(View view, int i7, q qVar) {
            D dE0 = RecyclerView.e0(view);
            if (dE0.x()) {
                this.f11703b.f11629y.b(dE0);
            } else {
                this.f11703b.f11629y.p(dE0);
            }
            this.f11702a.c(view, i7, qVar, dE0.x());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).f11727b.right;
        }

        public boolean n1(w wVar, A a2, View view, int i7, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int o0(w wVar, A a2) {
            return -1;
        }

        public void o1(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.e0(N(iO)).L()) {
                    r1(iO, wVar);
                }
            }
        }

        public boolean p() {
            return false;
        }

        public int p0(w wVar, A a2) {
            return 0;
        }

        void p1(w wVar) {
            int iJ = wVar.j();
            for (int i7 = iJ - 1; i7 >= 0; i7--) {
                View viewN = wVar.n(i7);
                D dE0 = RecyclerView.e0(viewN);
                if (!dE0.L()) {
                    dE0.I(false);
                    if (dE0.z()) {
                        this.f11703b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f11703b.f11612j0;
                    if (mVar != null) {
                        mVar.j(dE0);
                    }
                    dE0.I(true);
                    wVar.y(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f11703b.invalidate();
            }
        }

        public boolean q() {
            return false;
        }

        public int q0(View view) {
            return ((q) view.getLayoutParams()).f11727b.top;
        }

        public void q1(View view, w wVar) {
            t1(view);
            wVar.B(view);
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public void r0(View view, boolean z7, Rect rect) {
            Matrix matrix;
            if (z7) {
                Rect rect2 = ((q) view.getLayoutParams()).f11727b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f11703b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f11703b.f11564D;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i7, w wVar) {
            View viewN = N(i7);
            u1(i7);
            wVar.B(viewN);
        }

        public int s0() {
            return this.f11718q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void t(int i7, int i8, A a2, c cVar) {
        }

        public int t0() {
            return this.f11716o;
        }

        public void t1(View view) {
            this.f11702a.p(view);
        }

        public void u(int i7, c cVar) {
        }

        boolean u0() {
            int iO = O();
            for (int i7 = 0; i7 < iO; i7++) {
                ViewGroup.LayoutParams layoutParams = N(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i7) {
            if (N(i7) != null) {
                this.f11702a.q(i7);
            }
        }

        public int v(A a2) {
            return 0;
        }

        public boolean v0() {
            return this.f11710i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z7) {
            return w1(recyclerView, view, rect, z7, false);
        }

        public int w(A a2) {
            return 0;
        }

        public boolean w0() {
            return this.f11711j;
        }

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
            int[] iArrQ = Q(view, rect);
            int i7 = iArrQ[0];
            int i8 = iArrQ[1];
            if ((z8 && !x0(recyclerView, i7, i8)) || (i7 == 0 && i8 == 0)) {
                return false;
            }
            if (z7) {
                recyclerView.scrollBy(i7, i8);
            } else {
                recyclerView.l1(i7, i8);
            }
            return true;
        }

        public int x(A a2) {
            return 0;
        }

        public void x1() {
            RecyclerView recyclerView = this.f11703b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int y(A a2) {
            return 0;
        }

        public final boolean y0() {
            return this.f11713l;
        }

        public void y1() {
            this.f11709h = true;
        }

        public int z(A a2) {
            return 0;
        }

        public boolean z0(w wVar, A a2) {
            return false;
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i7, int i8);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z7);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i7) {
        }

        public void b(RecyclerView recyclerView, int i7, int i8) {
        }
    }

    public static class v {

        SparseArray<a> f11730a = new SparseArray<>();

        private int f11731b = 0;

        static class a {

            final ArrayList<D> f11732a = new ArrayList<>();

            int f11733b = 5;

            long f11734c = 0;

            long f11735d = 0;

            a() {
            }
        }

        private a g(int i7) {
            a aVar = this.f11730a.get(i7);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f11730a.put(i7, aVar2);
            return aVar2;
        }

        void a() {
            this.f11731b++;
        }

        public void b() {
            for (int i7 = 0; i7 < this.f11730a.size(); i7++) {
                this.f11730a.valueAt(i7).f11732a.clear();
            }
        }

        void c() {
            this.f11731b--;
        }

        void d(int i7, long j7) {
            a aVarG = g(i7);
            aVarG.f11735d = j(aVarG.f11735d, j7);
        }

        void e(int i7, long j7) {
            a aVarG = g(i7);
            aVarG.f11734c = j(aVarG.f11734c, j7);
        }

        public D f(int i7) {
            a aVar = this.f11730a.get(i7);
            if (aVar == null || aVar.f11732a.isEmpty()) {
                return null;
            }
            ArrayList<D> arrayList = aVar.f11732a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).t()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(h hVar, h hVar2, boolean z7) {
            if (hVar != null) {
                c();
            }
            if (!z7 && this.f11731b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(D d7) {
            int iN = d7.n();
            ArrayList<D> arrayList = g(iN).f11732a;
            if (this.f11730a.get(iN).f11733b <= arrayList.size()) {
                return;
            }
            d7.F();
            arrayList.add(d7);
        }

        long j(long j7, long j8) {
            return j7 == 0 ? j8 : ((j7 / 4) * 3) + (j8 / 4);
        }

        boolean k(int i7, long j7, long j8) {
            long j9 = g(i7).f11735d;
            return j9 == 0 || j7 + j9 < j8;
        }

        boolean l(int i7, long j7, long j8) {
            long j9 = g(i7).f11734c;
            return j9 == 0 || j7 + j9 < j8;
        }
    }

    public final class w {

        final ArrayList<D> f11736a;

        ArrayList<D> f11737b;

        final ArrayList<D> f11738c;

        private final List<D> f11739d;

        private int f11740e;

        int f11741f;

        v f11742g;

        public w() {
            ArrayList<D> arrayList = new ArrayList<>();
            this.f11736a = arrayList;
            this.f11737b = null;
            this.f11738c = new ArrayList<>();
            this.f11739d = Collections.unmodifiableList(arrayList);
            this.f11740e = 2;
            this.f11741f = 2;
        }

        private boolean H(D d7, int i7, int i8, long j7) {
            d7.f11676s = null;
            d7.f11675r = RecyclerView.this;
            int iN = d7.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j7 != Long.MAX_VALUE && !this.f11742g.k(iN, nanoTime, j7)) {
                return false;
            }
            RecyclerView.this.f11566E.a(d7, i7);
            this.f11742g.d(d7.n(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d7);
            if (!RecyclerView.this.f11561B0.e()) {
                return true;
            }
            d7.f11664g = i8;
            return true;
        }

        private void b(D d7) {
            if (RecyclerView.this.s0()) {
                View view = d7.f11658a;
                if (Z.x(view) == 0) {
                    Z.x0(view, 1);
                }
                androidx.recyclerview.widget.r rVar = RecyclerView.this.f11575I0;
                if (rVar == null) {
                    return;
                }
                C1605a c1605aN = rVar.n();
                if (c1605aN instanceof r.a) {
                    ((r.a) c1605aN).o(view);
                }
                Z.n0(view, c1605aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z7) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z7) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(D d7) {
            View view = d7.f11658a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i7) {
            a(this.f11738c.get(i7), true);
            this.f11738c.remove(i7);
        }

        public void B(View view) {
            D dE0 = RecyclerView.e0(view);
            if (dE0.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (dE0.y()) {
                dE0.M();
            } else if (dE0.N()) {
                dE0.e();
            }
            C(dE0);
            if (RecyclerView.this.f11612j0 == null || dE0.w()) {
                return;
            }
            RecyclerView.this.f11612j0.j(dE0);
        }

        void C(D d7) {
            boolean z7;
            boolean z8 = true;
            if (d7.y() || d7.f11658a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d7.y());
                sb.append(" isAttached:");
                sb.append(d7.f11658a.getParent() != null);
                sb.append(RecyclerView.this.O());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d7.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d7 + RecyclerView.this.O());
            }
            if (d7.L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.O());
            }
            boolean zH = d7.h();
            h hVar = RecyclerView.this.f11566E;
            if ((hVar != null && zH && hVar.v(d7)) || d7.w()) {
                if (this.f11741f <= 0 || d7.r(526)) {
                    z7 = false;
                } else {
                    int size = this.f11738c.size();
                    if (size >= this.f11741f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f11553Y0 && size > 0 && !RecyclerView.this.f11559A0.d(d7.f11660c)) {
                        int i7 = size - 1;
                        while (i7 >= 0) {
                            if (!RecyclerView.this.f11559A0.d(this.f11738c.get(i7).f11660c)) {
                                break;
                            } else {
                                i7--;
                            }
                        }
                        size = i7 + 1;
                    }
                    this.f11738c.add(size, d7);
                    z7 = true;
                }
                if (z7) {
                    z8 = false;
                } else {
                    a(d7, true);
                }
                z = z7;
            } else {
                z8 = false;
            }
            RecyclerView.this.f11629y.q(d7);
            if (z || z8 || !zH) {
                return;
            }
            d7.f11676s = null;
            d7.f11675r = null;
        }

        void D(View view) {
            D dE0 = RecyclerView.e0(view);
            if (!dE0.r(12) && dE0.A() && !RecyclerView.this.o(dE0)) {
                if (this.f11737b == null) {
                    this.f11737b = new ArrayList<>();
                }
                dE0.J(this, true);
                this.f11737b.add(dE0);
                return;
            }
            if (!dE0.v() || dE0.x() || RecyclerView.this.f11566E.i()) {
                dE0.J(this, false);
                this.f11736a.add(dE0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.O());
            }
        }

        void E(v vVar) {
            v vVar2 = this.f11742g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f11742g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f11742g.a();
        }

        void F(B b2) {
        }

        public void G(int i7) {
            this.f11740e = i7;
            K();
        }

        androidx.recyclerview.widget.RecyclerView.D I(int r17, boolean r18, long r19) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$D");
        }

        void J(D d7) {
            if (d7.f11672o) {
                this.f11737b.remove(d7);
            } else {
                this.f11736a.remove(d7);
            }
            d7.f11671n = null;
            d7.f11672o = false;
            d7.e();
        }

        void K() {
            p pVar = RecyclerView.this.f11568F;
            this.f11741f = this.f11740e + (pVar != null ? pVar.f11714m : 0);
            for (int size = this.f11738c.size() - 1; size >= 0 && this.f11738c.size() > this.f11741f; size--) {
                A(size);
            }
        }

        boolean L(D d7) {
            if (d7.x()) {
                return RecyclerView.this.f11561B0.e();
            }
            int i7 = d7.f11660c;
            if (i7 >= 0 && i7 < RecyclerView.this.f11566E.e()) {
                if (RecyclerView.this.f11561B0.e() || RecyclerView.this.f11566E.g(d7.f11660c) == d7.n()) {
                    return !RecyclerView.this.f11566E.i() || d7.m() == RecyclerView.this.f11566E.f(d7.f11660c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d7 + RecyclerView.this.O());
        }

        void M(int i7, int i8) {
            int i9;
            int i10 = i8 + i7;
            for (int size = this.f11738c.size() - 1; size >= 0; size--) {
                D d7 = this.f11738c.get(size);
                if (d7 != null && (i9 = d7.f11660c) >= i7 && i9 < i10) {
                    d7.b(2);
                    A(size);
                }
            }
        }

        void a(D d7, boolean z7) {
            RecyclerView.q(d7);
            View view = d7.f11658a;
            androidx.recyclerview.widget.r rVar = RecyclerView.this.f11575I0;
            if (rVar != null) {
                C1605a c1605aN = rVar.n();
                Z.n0(view, c1605aN instanceof r.a ? ((r.a) c1605aN).n(view) : null);
            }
            if (z7) {
                g(d7);
            }
            d7.f11676s = null;
            d7.f11675r = null;
            i().i(d7);
        }

        public void c() {
            this.f11736a.clear();
            z();
        }

        void d() {
            int size = this.f11738c.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f11738c.get(i7).c();
            }
            int size2 = this.f11736a.size();
            for (int i8 = 0; i8 < size2; i8++) {
                this.f11736a.get(i8).c();
            }
            ArrayList<D> arrayList = this.f11737b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    this.f11737b.get(i9).c();
                }
            }
        }

        void e() {
            this.f11736a.clear();
            ArrayList<D> arrayList = this.f11737b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i7) {
            if (i7 >= 0 && i7 < RecyclerView.this.f11561B0.b()) {
                return !RecyclerView.this.f11561B0.e() ? i7 : RecyclerView.this.f11624v.m(i7);
            }
            throw new IndexOutOfBoundsException("invalid position " + i7 + ". State item count is " + RecyclerView.this.f11561B0.b() + RecyclerView.this.O());
        }

        void g(D d7) {
            x xVar = RecyclerView.this.f11570G;
            if (xVar != null) {
                xVar.a(d7);
            }
            int size = RecyclerView.this.f11572H.size();
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView.this.f11572H.get(i7).a(d7);
            }
            h hVar = RecyclerView.this.f11566E;
            if (hVar != null) {
                hVar.y(d7);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f11561B0 != null) {
                recyclerView.f11629y.q(d7);
            }
        }

        D h(int i7) {
            int size;
            int iM;
            ArrayList<D> arrayList = this.f11737b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    D d7 = this.f11737b.get(i8);
                    if (!d7.N() && d7.o() == i7) {
                        d7.b(32);
                        return d7;
                    }
                }
                if (RecyclerView.this.f11566E.i() && (iM = RecyclerView.this.f11624v.m(i7)) > 0 && iM < RecyclerView.this.f11566E.e()) {
                    long jF = RecyclerView.this.f11566E.f(iM);
                    for (int i9 = 0; i9 < size; i9++) {
                        D d8 = this.f11737b.get(i9);
                        if (!d8.N() && d8.m() == jF) {
                            d8.b(32);
                            return d8;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f11742g == null) {
                this.f11742g = new v();
            }
            return this.f11742g;
        }

        int j() {
            return this.f11736a.size();
        }

        public List<D> k() {
            return this.f11739d;
        }

        D l(long j7, int i7, boolean z7) {
            for (int size = this.f11736a.size() - 1; size >= 0; size--) {
                D d7 = this.f11736a.get(size);
                if (d7.m() == j7 && !d7.N()) {
                    if (i7 == d7.n()) {
                        d7.b(32);
                        if (d7.x() && !RecyclerView.this.f11561B0.e()) {
                            d7.H(2, 14);
                        }
                        return d7;
                    }
                    if (!z7) {
                        this.f11736a.remove(size);
                        RecyclerView.this.removeDetachedView(d7.f11658a, false);
                        y(d7.f11658a);
                    }
                }
            }
            int size2 = this.f11738c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                D d8 = this.f11738c.get(size2);
                if (d8.m() == j7 && !d8.t()) {
                    if (i7 == d8.n()) {
                        if (!z7) {
                            this.f11738c.remove(size2);
                        }
                        return d8;
                    }
                    if (!z7) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        D m(int i7, boolean z7) {
            View viewE;
            int size = this.f11736a.size();
            for (int i8 = 0; i8 < size; i8++) {
                D d7 = this.f11736a.get(i8);
                if (!d7.N() && d7.o() == i7 && !d7.v() && (RecyclerView.this.f11561B0.f11640h || !d7.x())) {
                    d7.b(32);
                    return d7;
                }
            }
            if (z7 || (viewE = RecyclerView.this.f11626w.e(i7)) == null) {
                int size2 = this.f11738c.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    D d8 = this.f11738c.get(i9);
                    if (!d8.v() && d8.o() == i7 && !d8.t()) {
                        if (!z7) {
                            this.f11738c.remove(i9);
                        }
                        return d8;
                    }
                }
                return null;
            }
            D dE0 = RecyclerView.e0(viewE);
            RecyclerView.this.f11626w.s(viewE);
            int iM = RecyclerView.this.f11626w.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f11626w.d(iM);
                D(viewE);
                dE0.b(8224);
                return dE0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + dE0 + RecyclerView.this.O());
        }

        View n(int i7) {
            return this.f11736a.get(i7).f11658a;
        }

        public View o(int i7) {
            return p(i7, false);
        }

        View p(int i7, boolean z7) {
            return I(i7, z7, Long.MAX_VALUE).f11658a;
        }

        void s() {
            int size = this.f11738c.size();
            for (int i7 = 0; i7 < size; i7++) {
                q qVar = (q) this.f11738c.get(i7).f11658a.getLayoutParams();
                if (qVar != null) {
                    qVar.f11728c = true;
                }
            }
        }

        void t() {
            int size = this.f11738c.size();
            for (int i7 = 0; i7 < size; i7++) {
                D d7 = this.f11738c.get(i7);
                if (d7 != null) {
                    d7.b(6);
                    d7.a(null);
                }
            }
            h hVar = RecyclerView.this.f11566E;
            if (hVar == null || !hVar.i()) {
                z();
            }
        }

        void u(int i7, int i8) {
            int size = this.f11738c.size();
            for (int i9 = 0; i9 < size; i9++) {
                D d7 = this.f11738c.get(i9);
                if (d7 != null && d7.f11660c >= i7) {
                    d7.C(i8, false);
                }
            }
        }

        void v(int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            if (i7 < i8) {
                i9 = -1;
                i11 = i7;
                i10 = i8;
            } else {
                i9 = 1;
                i10 = i7;
                i11 = i8;
            }
            int size = this.f11738c.size();
            for (int i13 = 0; i13 < size; i13++) {
                D d7 = this.f11738c.get(i13);
                if (d7 != null && (i12 = d7.f11660c) >= i11 && i12 <= i10) {
                    if (i12 == i7) {
                        d7.C(i8 - i7, false);
                    } else {
                        d7.C(i9, false);
                    }
                }
            }
        }

        void w(int i7, int i8, boolean z7) {
            int i9 = i7 + i8;
            for (int size = this.f11738c.size() - 1; size >= 0; size--) {
                D d7 = this.f11738c.get(size);
                if (d7 != null) {
                    int i10 = d7.f11660c;
                    if (i10 >= i9) {
                        d7.C(-i8, z7);
                    } else if (i10 >= i7) {
                        d7.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(h hVar, h hVar2, boolean z7) {
            c();
            i().h(hVar, hVar2, z7);
        }

        void y(View view) {
            D dE0 = RecyclerView.e0(view);
            dE0.f11671n = null;
            dE0.f11672o = false;
            dE0.e();
            C(dE0);
        }

        void z() {
            for (int size = this.f11738c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f11738c.clear();
            if (RecyclerView.f11553Y0) {
                RecyclerView.this.f11559A0.b();
            }
        }
    }

    public interface x {
        void a(D d7);
    }

    private class y extends j {
        y() {
        }

        @Override
        public void a() {
            RecyclerView.this.n(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11561B0.f11639g = true;
            recyclerView.P0(true);
            if (RecyclerView.this.f11624v.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override
        public void c(int i7, int i8, Object obj) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.f11624v.r(i7, i8, obj)) {
                g();
            }
        }

        @Override
        public void d(int i7, int i8) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.f11624v.s(i7, i8)) {
                g();
            }
        }

        @Override
        public void e(int i7, int i8, int i9) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.f11624v.t(i7, i8, i9)) {
                g();
            }
        }

        @Override
        public void f(int i7, int i8) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.f11624v.u(i7, i8)) {
                g();
            }
        }

        void g() {
            if (RecyclerView.f11552X0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f11582M && recyclerView.f11580L) {
                    Z.f0(recyclerView, recyclerView.f11558A);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f11597U = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class z {

        private RecyclerView f11746b;

        private p f11747c;

        private boolean f11748d;

        private boolean f11749e;

        private View f11750f;

        private boolean f11752h;

        private int f11745a = -1;

        private final a f11751g = new a(0, 0);

        public static class a {

            private int f11753a;

            private int f11754b;

            private int f11755c;

            private int f11756d;

            private Interpolator f11757e;

            private boolean f11758f;

            private int f11759g;

            public a(int i7, int i8) {
                this(i7, i8, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f11757e != null && this.f11755c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f11755c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f11756d >= 0;
            }

            public void b(int i7) {
                this.f11756d = i7;
            }

            void c(RecyclerView recyclerView) {
                int i7 = this.f11756d;
                if (i7 >= 0) {
                    this.f11756d = -1;
                    recyclerView.v0(i7);
                    this.f11758f = false;
                } else {
                    if (!this.f11758f) {
                        this.f11759g = 0;
                        return;
                    }
                    e();
                    recyclerView.f11630y0.e(this.f11753a, this.f11754b, this.f11755c, this.f11757e);
                    int i8 = this.f11759g + 1;
                    this.f11759g = i8;
                    if (i8 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f11758f = false;
                }
            }

            public void d(int i7, int i8, int i9, Interpolator interpolator) {
                this.f11753a = i7;
                this.f11754b = i8;
                this.f11755c = i9;
                this.f11757e = interpolator;
                this.f11758f = true;
            }

            public a(int i7, int i8, int i9, Interpolator interpolator) {
                this.f11756d = -1;
                this.f11758f = false;
                this.f11759g = 0;
                this.f11753a = i7;
                this.f11754b = i8;
                this.f11755c = i9;
                this.f11757e = interpolator;
            }
        }

        public interface b {
            PointF c(int i7);
        }

        public PointF a(int i7) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i7);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i7) {
            return this.f11746b.f11568F.H(i7);
        }

        public int c() {
            return this.f11746b.f11568F.O();
        }

        public int d(View view) {
            return this.f11746b.c0(view);
        }

        public p e() {
            return this.f11747c;
        }

        public int f() {
            return this.f11745a;
        }

        public boolean g() {
            return this.f11748d;
        }

        public boolean h() {
            return this.f11749e;
        }

        protected void i(PointF pointF) {
            float f7 = pointF.x;
            float f8 = pointF.y;
            float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i7, int i8) {
            PointF pointFA;
            RecyclerView recyclerView = this.f11746b;
            if (this.f11745a == -1 || recyclerView == null) {
                r();
            }
            if (this.f11748d && this.f11750f == null && this.f11747c != null && (pointFA = a(this.f11745a)) != null) {
                float f7 = pointFA.x;
                if (f7 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.g1((int) Math.signum(f7), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f11748d = false;
            View view = this.f11750f;
            if (view != null) {
                if (d(view) == this.f11745a) {
                    o(this.f11750f, recyclerView.f11561B0, this.f11751g);
                    this.f11751g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f11750f = null;
                }
            }
            if (this.f11749e) {
                l(i7, i8, recyclerView.f11561B0, this.f11751g);
                boolean zA = this.f11751g.a();
                this.f11751g.c(recyclerView);
                if (zA && this.f11749e) {
                    this.f11748d = true;
                    recyclerView.f11630y0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f11750f = view;
            }
        }

        protected abstract void l(int i7, int i8, A a2, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, A a2, a aVar);

        public void p(int i7) {
            this.f11745a = i7;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f11630y0.f();
            if (this.f11752h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f11746b = recyclerView;
            this.f11747c = pVar;
            int i7 = this.f11745a;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f11561B0.f11633a = i7;
            this.f11749e = true;
            this.f11748d = true;
            this.f11750f = b(f());
            m();
            this.f11746b.f11630y0.d();
            this.f11752h = true;
        }

        protected final void r() {
            if (this.f11749e) {
                this.f11749e = false;
                n();
                this.f11746b.f11561B0.f11633a = -1;
                this.f11750f = null;
                this.f11745a = -1;
                this.f11748d = false;
                this.f11747c.j1(this);
                this.f11747c = null;
                this.f11746b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f11556b1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f11557c1 = new InterpolatorC1715c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, X0.a.f7885a);
    }

    private void B() {
        this.f11561B0.a(1);
        P(this.f11561B0);
        this.f11561B0.f11642j = false;
        q1();
        this.f11629y.f();
        G0();
        O0();
        d1();
        A a2 = this.f11561B0;
        a2.f11641i = a2.f11643k && this.f11569F0;
        this.f11569F0 = false;
        this.f11567E0 = false;
        a2.f11640h = a2.f11644l;
        a2.f11638f = this.f11566E.e();
        T(this.f11577J0);
        if (this.f11561B0.f11643k) {
            int iG = this.f11626w.g();
            for (int i7 = 0; i7 < iG; i7++) {
                D dE0 = e0(this.f11626w.f(i7));
                if (!dE0.L() && (!dE0.v() || this.f11566E.i())) {
                    this.f11629y.e(dE0, this.f11612j0.t(this.f11561B0, dE0, m.e(dE0), dE0.q()));
                    if (this.f11561B0.f11641i && dE0.A() && !dE0.x() && !dE0.L() && !dE0.v()) {
                        this.f11629y.c(b0(dE0), dE0);
                    }
                }
            }
        }
        if (this.f11561B0.f11644l) {
            e1();
            A a3 = this.f11561B0;
            boolean z7 = a3.f11639g;
            a3.f11639g = false;
            this.f11568F.b1(this.f11605e, a3);
            this.f11561B0.f11639g = z7;
            for (int i8 = 0; i8 < this.f11626w.g(); i8++) {
                D dE02 = e0(this.f11626w.f(i8));
                if (!dE02.L() && !this.f11629y.i(dE02)) {
                    int iE = m.e(dE02);
                    boolean zR = dE02.r(8192);
                    if (!zR) {
                        iE |= 4096;
                    }
                    m.c cVarT = this.f11612j0.t(this.f11561B0, dE02, iE, dE02.q());
                    if (zR) {
                        R0(dE02, cVarT);
                    } else {
                        this.f11629y.a(dE02, cVarT);
                    }
                }
            }
            r();
        } else {
            r();
        }
        H0();
        s1(false);
        this.f11561B0.f11637e = 2;
    }

    private void C() {
        q1();
        G0();
        this.f11561B0.a(6);
        this.f11624v.j();
        this.f11561B0.f11638f = this.f11566E.e();
        this.f11561B0.f11636d = 0;
        if (this.f11610i != null && this.f11566E.b()) {
            Parcelable parcelable = this.f11610i.f11677d;
            if (parcelable != null) {
                this.f11568F.g1(parcelable);
            }
            this.f11610i = null;
        }
        A a2 = this.f11561B0;
        a2.f11640h = false;
        this.f11568F.b1(this.f11605e, a2);
        A a3 = this.f11561B0;
        a3.f11639g = false;
        a3.f11643k = a3.f11643k && this.f11612j0 != null;
        a3.f11637e = 4;
        H0();
        s1(false);
    }

    private void D() {
        this.f11561B0.a(4);
        q1();
        G0();
        A a2 = this.f11561B0;
        a2.f11637e = 1;
        if (a2.f11643k) {
            for (int iG = this.f11626w.g() - 1; iG >= 0; iG--) {
                D dE0 = e0(this.f11626w.f(iG));
                if (!dE0.L()) {
                    long jB0 = b0(dE0);
                    m.c cVarS = this.f11612j0.s(this.f11561B0, dE0);
                    D dG = this.f11629y.g(jB0);
                    if (dG == null || dG.L()) {
                        this.f11629y.d(dE0, cVarS);
                    } else {
                        boolean zH = this.f11629y.h(dG);
                        boolean zH2 = this.f11629y.h(dE0);
                        if (zH && dG == dE0) {
                            this.f11629y.d(dE0, cVarS);
                        } else {
                            m.c cVarN = this.f11629y.n(dG);
                            this.f11629y.d(dE0, cVarS);
                            m.c cVarM = this.f11629y.m(dE0);
                            if (cVarN == null) {
                                k0(jB0, dE0, dG);
                            } else {
                                l(dG, dE0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f11629y.o(this.T0);
        }
        this.f11568F.p1(this.f11605e);
        A a3 = this.f11561B0;
        a3.f11635c = a3.f11638f;
        this.f11600a0 = false;
        this.f11601b0 = false;
        a3.f11643k = false;
        a3.f11644l = false;
        this.f11568F.f11709h = false;
        ArrayList<D> arrayList = this.f11605e.f11737b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.f11568F;
        if (pVar.f11715n) {
            pVar.f11714m = 0;
            pVar.f11715n = false;
            this.f11605e.K();
        }
        this.f11568F.c1(this.f11561B0);
        H0();
        s1(false);
        this.f11629y.f();
        int[] iArr = this.f11577J0;
        if (w(iArr[0], iArr[1])) {
            H(0, 0);
        }
        S0();
        b1();
    }

    private boolean J(MotionEvent motionEvent) {
        t tVar = this.f11578K;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return S(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f11578K = null;
        }
        return true;
    }

    private void J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11614l0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f11614l0 = motionEvent.getPointerId(i7);
            int x7 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f11618p0 = x7;
            this.f11616n0 = x7;
            int y7 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f11619q0 = y7;
            this.f11617o0 = y7;
        }
    }

    private boolean N0() {
        return this.f11612j0 != null && this.f11568F.P1();
    }

    private void O0() {
        boolean z7;
        if (this.f11600a0) {
            this.f11624v.y();
            if (this.f11601b0) {
                this.f11568F.W0(this);
            }
        }
        if (N0()) {
            this.f11624v.w();
        } else {
            this.f11624v.j();
        }
        boolean z8 = this.f11567E0 || this.f11569F0;
        this.f11561B0.f11643k = this.f11586O && this.f11612j0 != null && ((z7 = this.f11600a0) || z8 || this.f11568F.f11709h) && (!z7 || this.f11566E.i());
        A a2 = this.f11561B0;
        a2.f11644l = a2.f11643k && z8 && !this.f11600a0 && N0();
    }

    private void Q0(float r7, float r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q0(float, float, float, float):void");
    }

    private boolean S(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f11576J.size();
        for (int i7 = 0; i7 < size; i7++) {
            t tVar = this.f11576J.get(i7);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.f11578K = tVar;
                return true;
            }
        }
        return false;
    }

    private void S0() {
        View viewFindViewById;
        if (!this.f11628x0 || this.f11566E == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f11555a1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f11626w.n(focusedChild)) {
                    return;
                }
            } else if (this.f11626w.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewV = null;
        D dX = (this.f11561B0.f11646n == -1 || !this.f11566E.i()) ? null : X(this.f11561B0.f11646n);
        if (dX != null && !this.f11626w.n(dX.f11658a) && dX.f11658a.hasFocusable()) {
            viewV = dX.f11658a;
        } else if (this.f11626w.g() > 0) {
            viewV = V();
        }
        if (viewV != null) {
            int i7 = this.f11561B0.f11647o;
            if (i7 != -1 && (viewFindViewById = viewV.findViewById(i7)) != null && viewFindViewById.isFocusable()) {
                viewV = viewFindViewById;
            }
            viewV.requestFocus();
        }
    }

    private void T(int[] iArr) {
        int iG = this.f11626w.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < iG; i9++) {
            D dE0 = e0(this.f11626w.f(i9));
            if (!dE0.L()) {
                int iO = dE0.o();
                if (iO < i7) {
                    i7 = iO;
                }
                if (iO > i8) {
                    i8 = iO;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    private void T0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f11607f0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f11607f0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f11608g0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f11608g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f11609h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f11609h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f11611i0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f11611i0.isFinished();
        }
        if (zIsFinished) {
            Z.e0(this);
        }
    }

    static RecyclerView U(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewU = U(viewGroup.getChildAt(i7));
            if (recyclerViewU != null) {
                return recyclerViewU;
            }
        }
        return null;
    }

    private View V() {
        D dW;
        A a2 = this.f11561B0;
        int i7 = a2.f11645m;
        if (i7 == -1) {
            i7 = 0;
        }
        int iB = a2.b();
        for (int i8 = i7; i8 < iB; i8++) {
            D dW2 = W(i8);
            if (dW2 == null) {
                break;
            }
            if (dW2.f11658a.hasFocusable()) {
                return dW2.f11658a;
            }
        }
        int iMin = Math.min(iB, i7);
        do {
            iMin--;
            if (iMin < 0 || (dW = W(iMin)) == null) {
                return null;
            }
        } while (!dW.f11658a.hasFocusable());
        return dW.f11658a;
    }

    private void a1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f11560B.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f11728c) {
                Rect rect = qVar.f11727b;
                Rect rect2 = this.f11560B;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f11560B);
            offsetRectIntoDescendantCoords(view, this.f11560B);
        }
        this.f11568F.w1(this, view, this.f11560B, !this.f11586O, view2 == null);
    }

    private void b1() {
        A a2 = this.f11561B0;
        a2.f11646n = -1L;
        a2.f11645m = -1;
        a2.f11647o = -1;
    }

    private void c1() {
        VelocityTracker velocityTracker = this.f11615m0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        t1(0);
        T0();
    }

    private void d1() {
        View focusedChild = (this.f11628x0 && hasFocus() && this.f11566E != null) ? getFocusedChild() : null;
        D dR = focusedChild != null ? R(focusedChild) : null;
        if (dR == null) {
            b1();
            return;
        }
        this.f11561B0.f11646n = this.f11566E.i() ? dR.m() : -1L;
        this.f11561B0.f11645m = this.f11600a0 ? -1 : dR.x() ? dR.f11661d : dR.j();
        this.f11561B0.f11647o = h0(dR.f11658a);
    }

    static D e0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f11726a;
    }

    private void f(D d7) {
        View view = d7.f11658a;
        boolean z7 = view.getParent() == this;
        this.f11605e.J(d0(view));
        if (d7.z()) {
            this.f11626w.c(view, -1, view.getLayoutParams(), true);
        } else if (z7) {
            this.f11626w.k(view);
        } else {
            this.f11626w.b(view, true);
        }
    }

    static void g0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f11727b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private E getScrollingChildHelper() {
        if (this.f11579K0 == null) {
            this.f11579K0 = new E(this);
        }
        return this.f11579K0;
    }

    private int h0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void i1(h hVar, boolean z7, boolean z8) {
        h hVar2 = this.f11566E;
        if (hVar2 != null) {
            hVar2.B(this.f11603d);
            this.f11566E.u(this);
        }
        if (!z7 || z8) {
            U0();
        }
        this.f11624v.y();
        h hVar3 = this.f11566E;
        this.f11566E = hVar;
        if (hVar != null) {
            hVar.z(this.f11603d);
            hVar.q(this);
        }
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.I0(hVar3, this.f11566E);
        }
        this.f11605e.x(hVar3, this.f11566E, z7);
        this.f11561B0.f11639g = true;
    }

    private void k0(long j7, D d7, D d8) {
        int iG = this.f11626w.g();
        for (int i7 = 0; i7 < iG; i7++) {
            D dE0 = e0(this.f11626w.f(i7));
            if (dE0 != d7 && b0(dE0) == j7) {
                h hVar = this.f11566E;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + dE0 + " \n View Holder 2:" + d7 + O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + dE0 + " \n View Holder 2:" + d7 + O());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d8 + " cannot be found but it is necessary for " + d7 + O());
    }

    private void l(D d7, D d8, m.c cVar, m.c cVar2, boolean z7, boolean z8) {
        d7.I(false);
        if (z7) {
            f(d7);
        }
        if (d7 != d8) {
            if (z8) {
                f(d8);
            }
            d7.f11665h = d8;
            f(d7);
            this.f11605e.J(d7);
            d8.I(false);
            d8.f11666i = d7;
        }
        if (this.f11612j0.b(d7, d8, cVar, cVar2)) {
            M0();
        }
    }

    private boolean m0() {
        int iG = this.f11626w.g();
        for (int i7 = 0; i7 < iG; i7++) {
            D dE0 = e0(this.f11626w.f(i7));
            if (dE0 != null && !dE0.L() && dE0.A()) {
                return true;
            }
        }
        return false;
    }

    private void o0() {
        if (Z.y(this) == 0) {
            Z.z0(this, 8);
        }
    }

    private void p() {
        c1();
        setScrollState(0);
    }

    private void p0() {
        this.f11626w = new androidx.recyclerview.widget.f(new e());
    }

    static void q(D d7) {
        WeakReference<RecyclerView> weakReference = d7.f11659b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d7.f11658a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d7.f11659b = null;
        }
    }

    private void u(Context context, String str, AttributeSet attributeSet, int i7, int i8) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strI0 = i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f11556b1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), Integer.valueOf(i8)};
                } catch (NoSuchMethodException e7) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e8) {
                        e8.initCause(e7);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e8);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e9);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e13);
            }
        }
    }

    private boolean u0(View view, View view2, int i7) {
        int i8;
        if (view2 == null || view2 == this || view2 == view || Q(view2) == null) {
            return false;
        }
        if (view == null || Q(view) == null) {
            return true;
        }
        this.f11560B.set(0, 0, view.getWidth(), view.getHeight());
        this.f11562C.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f11560B);
        offsetDescendantRectToMyCoords(view2, this.f11562C);
        char c2 = 65535;
        int i9 = this.f11568F.d0() == 1 ? -1 : 1;
        Rect rect = this.f11560B;
        int i10 = rect.left;
        Rect rect2 = this.f11562C;
        int i11 = rect2.left;
        if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
            i8 = 1;
        } else {
            int i12 = rect.right;
            int i13 = rect2.right;
            i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if ((i16 <= i17 && i14 < i17) || i14 <= i15) {
                c2 = 0;
            }
        }
        if (i7 == 1) {
            return c2 < 0 || (c2 == 0 && i8 * i9 < 0);
        }
        if (i7 == 2) {
            return c2 > 0 || (c2 == 0 && i8 * i9 > 0);
        }
        if (i7 == 17) {
            return i8 < 0;
        }
        if (i7 == 33) {
            return c2 < 0;
        }
        if (i7 == 66) {
            return i8 > 0;
        }
        if (i7 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i7 + O());
    }

    private void v1() {
        this.f11630y0.f();
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.O1();
        }
    }

    private boolean w(int i7, int i8) {
        T(this.f11577J0);
        int[] iArr = this.f11577J0;
        return (iArr[0] == i7 && iArr[1] == i8) ? false : true;
    }

    private void y0(int i7, int i8, MotionEvent motionEvent, int i9) {
        p pVar = this.f11568F;
        if (pVar == null) {
            Log.e("RecyclerView", ZJZXBWla.VkRgfqP);
            return;
        }
        if (this.f11592R) {
            return;
        }
        int[] iArr = this.f11585N0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = pVar.p();
        boolean zQ = this.f11568F.q();
        r1(zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0, i9);
        if (E(zP ? i7 : 0, zQ ? i8 : 0, this.f11585N0, this.f11581L0, i9)) {
            int[] iArr2 = this.f11585N0;
            i7 -= iArr2[0];
            i8 -= iArr2[1];
        }
        f1(zP ? i7 : 0, zQ ? i8 : 0, motionEvent, i9);
        androidx.recyclerview.widget.k kVar = this.f11632z0;
        if (kVar != null && (i7 != 0 || i8 != 0)) {
            kVar.f(this, i7, i8);
        }
        t1(i9);
    }

    private void z() {
        int i7 = this.f11596T;
        this.f11596T = 0;
        if (i7 == 0 || !s0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C3001b.b(accessibilityEventObtain, i7);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    void A() {
        if (this.f11566E == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f11568F == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f11561B0.f11642j = false;
        boolean z7 = this.f11591Q0 && !(this.f11593R0 == getWidth() && this.f11595S0 == getHeight());
        this.f11593R0 = 0;
        this.f11595S0 = 0;
        this.f11591Q0 = false;
        if (this.f11561B0.f11637e == 1) {
            B();
            this.f11568F.D1(this);
            C();
        } else if (this.f11624v.q() || z7 || this.f11568F.s0() != getWidth() || this.f11568F.b0() != getHeight()) {
            this.f11568F.D1(this);
            C();
        } else {
            this.f11568F.D1(this);
        }
        D();
    }

    public void A0(int i7) {
        int iG = this.f11626w.g();
        for (int i8 = 0; i8 < iG; i8++) {
            this.f11626w.f(i8).offsetTopAndBottom(i7);
        }
    }

    void B0(int i7, int i8) {
        int iJ = this.f11626w.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            D dE0 = e0(this.f11626w.i(i9));
            if (dE0 != null && !dE0.L() && dE0.f11660c >= i7) {
                dE0.C(i8, false);
                this.f11561B0.f11639g = true;
            }
        }
        this.f11605e.u(i7, i8);
        requestLayout();
    }

    void C0(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int iJ = this.f11626w.j();
        if (i7 < i8) {
            i11 = -1;
            i10 = i7;
            i9 = i8;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        for (int i13 = 0; i13 < iJ; i13++) {
            D dE0 = e0(this.f11626w.i(i13));
            if (dE0 != null && (i12 = dE0.f11660c) >= i10 && i12 <= i9) {
                if (i12 == i7) {
                    dE0.C(i8 - i7, false);
                } else {
                    dE0.C(i11, false);
                }
                this.f11561B0.f11639g = true;
            }
        }
        this.f11605e.v(i7, i8);
        requestLayout();
    }

    void D0(int i7, int i8, boolean z7) {
        int i9 = i7 + i8;
        int iJ = this.f11626w.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            D dE0 = e0(this.f11626w.i(i10));
            if (dE0 != null && !dE0.L()) {
                int i11 = dE0.f11660c;
                if (i11 >= i9) {
                    dE0.C(-i8, z7);
                    this.f11561B0.f11639g = true;
                } else if (i11 >= i7) {
                    dE0.i(i7 - 1, -i8, z7);
                    this.f11561B0.f11639g = true;
                }
            }
        }
        this.f11605e.w(i7, i8, z7);
        requestLayout();
    }

    public boolean E(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().d(i7, i8, iArr, iArr2, i9);
    }

    public void E0(View view) {
    }

    public final void F(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public void F0(View view) {
    }

    void G(int i7) {
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.i1(i7);
        }
        K0(i7);
        u uVar = this.f11563C0;
        if (uVar != null) {
            uVar.a(this, i7);
        }
        List<u> list = this.f11565D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11565D0.get(size).a(this, i7);
            }
        }
    }

    void G0() {
        this.f11602c0++;
    }

    void H(int i7, int i8) {
        this.f11604d0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        L0(i7, i8);
        u uVar = this.f11563C0;
        if (uVar != null) {
            uVar.b(this, i7, i8);
        }
        List<u> list = this.f11565D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11565D0.get(size).b(this, i7, i8);
            }
        }
        this.f11604d0--;
    }

    void H0() {
        I0(true);
    }

    void I() {
        int i7;
        for (int size = this.f11587O0.size() - 1; size >= 0; size--) {
            D d7 = this.f11587O0.get(size);
            if (d7.f11658a.getParent() == this && !d7.L() && (i7 = d7.f11674q) != -1) {
                Z.x0(d7.f11658a, i7);
                d7.f11674q = -1;
            }
        }
        this.f11587O0.clear();
    }

    void I0(boolean z7) {
        int i7 = this.f11602c0 - 1;
        this.f11602c0 = i7;
        if (i7 < 1) {
            this.f11602c0 = 0;
            if (z7) {
                z();
                I();
            }
        }
    }

    void K() {
        if (this.f11611i0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f11606e0.a(this, 3);
        this.f11611i0 = edgeEffectA;
        if (this.f11631z) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void K0(int i7) {
    }

    void L() {
        if (this.f11607f0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f11606e0.a(this, 0);
        this.f11607f0 = edgeEffectA;
        if (this.f11631z) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void L0(int i7, int i8) {
    }

    void M() {
        if (this.f11609h0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f11606e0.a(this, 2);
        this.f11609h0 = edgeEffectA;
        if (this.f11631z) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void M0() {
        if (this.f11573H0 || !this.f11580L) {
            return;
        }
        Z.f0(this, this.f11589P0);
        this.f11573H0 = true;
    }

    void N() {
        if (this.f11608g0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f11606e0.a(this, 1);
        this.f11608g0 = edgeEffectA;
        if (this.f11631z) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String O() {
        return " " + super.toString() + ", adapter:" + this.f11566E + ", layout:" + this.f11568F + ", context:" + getContext();
    }

    final void P(A a2) {
        if (getScrollState() != 2) {
            a2.f11648p = 0;
            a2.f11649q = 0;
        } else {
            OverScroller overScroller = this.f11630y0.f11652i;
            a2.f11648p = overScroller.getFinalX() - overScroller.getCurrX();
            a2.f11649q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void P0(boolean z7) {
        this.f11601b0 = z7 | this.f11601b0;
        this.f11600a0 = true;
        x0();
    }

    public View Q(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public D R(View view) {
        View viewQ = Q(view);
        if (viewQ == null) {
            return null;
        }
        return d0(viewQ);
    }

    void R0(D d7, m.c cVar) {
        d7.H(0, 8192);
        if (this.f11561B0.f11641i && d7.A() && !d7.x() && !d7.L()) {
            this.f11629y.c(b0(d7), d7);
        }
        this.f11629y.e(d7, cVar);
    }

    void U0() {
        m mVar = this.f11612j0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.o1(this.f11605e);
            this.f11568F.p1(this.f11605e);
        }
        this.f11605e.c();
    }

    boolean V0(View view) {
        q1();
        boolean zR = this.f11626w.r(view);
        if (zR) {
            D dE0 = e0(view);
            this.f11605e.J(dE0);
            this.f11605e.C(dE0);
        }
        s1(!zR);
        return zR;
    }

    public D W(int i7) {
        D d7 = null;
        if (this.f11600a0) {
            return null;
        }
        int iJ = this.f11626w.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            D dE0 = e0(this.f11626w.i(i8));
            if (dE0 != null && !dE0.x() && a0(dE0) == i7) {
                if (!this.f11626w.n(dE0.f11658a)) {
                    return dE0;
                }
                d7 = dE0;
            }
        }
        return d7;
    }

    public void W0(o oVar) {
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f11574I.remove(oVar);
        if (this.f11574I.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public D X(long j7) {
        h hVar = this.f11566E;
        D d7 = null;
        if (hVar != null && hVar.i()) {
            int iJ = this.f11626w.j();
            for (int i7 = 0; i7 < iJ; i7++) {
                D dE0 = e0(this.f11626w.i(i7));
                if (dE0 != null && !dE0.x() && dE0.m() == j7) {
                    if (!this.f11626w.n(dE0.f11658a)) {
                        return dE0;
                    }
                    d7 = dE0;
                }
            }
        }
        return d7;
    }

    public void X0(t tVar) {
        this.f11576J.remove(tVar);
        if (this.f11578K == tVar) {
            this.f11578K = null;
        }
    }

    androidx.recyclerview.widget.RecyclerView.D Y(int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, boolean):androidx.recyclerview.widget.RecyclerView$D");
    }

    public void Y0(u uVar) {
        List<u> list = this.f11565D0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public boolean Z(int i7, int i8) {
        p pVar = this.f11568F;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f11592R) {
            return false;
        }
        int iP = pVar.p();
        boolean zQ = this.f11568F.q();
        if (iP == 0 || Math.abs(i7) < this.f11622t0) {
            i7 = 0;
        }
        if (!zQ || Math.abs(i8) < this.f11622t0) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        float f7 = i7;
        float f8 = i8;
        if (!dispatchNestedPreFling(f7, f8)) {
            boolean z7 = iP != 0 || zQ;
            dispatchNestedFling(f7, f8, z7);
            s sVar = this.f11621s0;
            if (sVar != null && sVar.a(i7, i8)) {
                return true;
            }
            if (z7) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                r1(iP, 1);
                int i9 = this.f11623u0;
                int iMax = Math.max(-i9, Math.min(i7, i9));
                int i10 = this.f11623u0;
                this.f11630y0.b(iMax, Math.max(-i10, Math.min(i8, i10)));
                return true;
            }
        }
        return false;
    }

    void Z0() {
        D d7;
        int iG = this.f11626w.g();
        for (int i7 = 0; i7 < iG; i7++) {
            View viewF = this.f11626w.f(i7);
            D dD0 = d0(viewF);
            if (dD0 != null && (d7 = dD0.f11666i) != null) {
                View view = d7.f11658a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void a(int i7, int i8) {
        if (i7 < 0) {
            L();
            if (this.f11607f0.isFinished()) {
                this.f11607f0.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            M();
            if (this.f11609h0.isFinished()) {
                this.f11609h0.onAbsorb(i7);
            }
        }
        if (i8 < 0) {
            N();
            if (this.f11608g0.isFinished()) {
                this.f11608g0.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            K();
            if (this.f11611i0.isFinished()) {
                this.f11611i0.onAbsorb(i8);
            }
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        Z.e0(this);
    }

    int a0(D d7) {
        if (d7.r(524) || !d7.u()) {
            return -1;
        }
        return this.f11624v.e(d7.f11660c);
    }

    @Override
    public void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        p pVar = this.f11568F;
        if (pVar == null || !pVar.J0(this, arrayList, i7, i8)) {
            super.addFocusables(arrayList, i7, i8);
        }
    }

    long b0(D d7) {
        return this.f11566E.i() ? d7.m() : d7.f11660c;
    }

    public int c0(View view) {
        D dE0 = e0(view);
        if (dE0 != null) {
            return dE0.o();
        }
        return -1;
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f11568F.r((q) layoutParams);
    }

    @Override
    public int computeHorizontalScrollExtent() {
        p pVar = this.f11568F;
        if (pVar != null && pVar.p()) {
            return this.f11568F.v(this.f11561B0);
        }
        return 0;
    }

    @Override
    public int computeHorizontalScrollOffset() {
        p pVar = this.f11568F;
        if (pVar != null && pVar.p()) {
            return this.f11568F.w(this.f11561B0);
        }
        return 0;
    }

    @Override
    public int computeHorizontalScrollRange() {
        p pVar = this.f11568F;
        if (pVar != null && pVar.p()) {
            return this.f11568F.x(this.f11561B0);
        }
        return 0;
    }

    @Override
    public int computeVerticalScrollExtent() {
        p pVar = this.f11568F;
        if (pVar != null && pVar.q()) {
            return this.f11568F.y(this.f11561B0);
        }
        return 0;
    }

    @Override
    public int computeVerticalScrollOffset() {
        p pVar = this.f11568F;
        if (pVar != null && pVar.q()) {
            return this.f11568F.z(this.f11561B0);
        }
        return 0;
    }

    @Override
    public int computeVerticalScrollRange() {
        p pVar = this.f11568F;
        if (pVar != null && pVar.q()) {
            return this.f11568F.A(this.f11561B0);
        }
        return 0;
    }

    public D d0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return e0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return getScrollingChildHelper().a(f7, f8, z7);
    }

    @Override
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().b(f7, f8);
    }

    @Override
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, iArr, iArr2);
    }

    @Override
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().f(i7, i8, i9, i10, iArr);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z7;
        super.draw(canvas);
        int size = this.f11574I.size();
        boolean z8 = false;
        for (int i7 = 0; i7 < size; i7++) {
            this.f11574I.get(i7).i(canvas, this, this.f11561B0);
        }
        EdgeEffect edgeEffect = this.f11607f0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z7 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f11631z ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f11607f0;
            z7 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f11608g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f11631z) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f11608g0;
            z7 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f11609h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f11631z ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f11609h0;
            z7 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f11611i0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f11631z) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f11611i0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z7 |= z8;
            canvas.restoreToCount(iSave4);
        }
        if ((z7 || this.f11612j0 == null || this.f11574I.size() <= 0 || !this.f11612j0.p()) ? z7 : true) {
            Z.e0(this);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    void e1() {
        int iJ = this.f11626w.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            D dE0 = e0(this.f11626w.i(i7));
            if (!dE0.L()) {
                dE0.G();
            }
        }
    }

    public void f0(View view, Rect rect) {
        g0(view, rect);
    }

    boolean f1(int i7, int i8, MotionEvent motionEvent, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        t();
        if (this.f11566E != null) {
            int[] iArr = this.f11585N0;
            iArr[0] = 0;
            iArr[1] = 0;
            g1(i7, i8, iArr);
            int[] iArr2 = this.f11585N0;
            int i14 = iArr2[0];
            int i15 = iArr2[1];
            i10 = i15;
            i11 = i14;
            i12 = i7 - i14;
            i13 = i8 - i15;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (!this.f11574I.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f11585N0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        F(i11, i10, i12, i13, this.f11581L0, i9, iArr3);
        int[] iArr4 = this.f11585N0;
        int i16 = iArr4[0];
        int i17 = i12 - i16;
        int i18 = iArr4[1];
        int i19 = i13 - i18;
        boolean z7 = (i16 == 0 && i18 == 0) ? false : true;
        int i20 = this.f11618p0;
        int[] iArr5 = this.f11581L0;
        int i21 = iArr5[0];
        this.f11618p0 = i20 - i21;
        int i22 = this.f11619q0;
        int i23 = iArr5[1];
        this.f11619q0 = i22 - i23;
        int[] iArr6 = this.f11583M0;
        iArr6[0] = iArr6[0] + i21;
        iArr6[1] = iArr6[1] + i23;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.C.a(motionEvent, 8194)) {
                Q0(motionEvent.getX(), i17, motionEvent.getY(), i19);
            }
            s(i7, i8);
        }
        if (i11 != 0 || i10 != 0) {
            H(i11, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z7 && i11 == 0 && i10 == 0) ? false : true;
    }

    @Override
    public View focusSearch(View view, int i7) {
        View viewN0;
        boolean z7;
        View viewU0 = this.f11568F.U0(view, i7);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z8 = (this.f11566E == null || this.f11568F == null || t0() || this.f11592R) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z8 && (i7 == 2 || i7 == 1)) {
            if (this.f11568F.q()) {
                int i8 = i7 == 2 ? 130 : 33;
                z7 = focusFinder.findNextFocus(this, view, i8) == null;
                if (f11554Z0) {
                    i7 = i8;
                }
            } else {
                z7 = false;
            }
            if (!z7 && this.f11568F.p()) {
                int i9 = (this.f11568F.d0() == 1) ^ (i7 == 2) ? 66 : 17;
                boolean z9 = focusFinder.findNextFocus(this, view, i9) == null;
                if (f11554Z0) {
                    i7 = i9;
                }
                z7 = z9;
            }
            if (z7) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                q1();
                this.f11568F.N0(view, i7, this.f11605e, this.f11561B0);
                s1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i7);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (viewFindNextFocus == null && z8) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                q1();
                viewN0 = this.f11568F.N0(view, i7, this.f11605e, this.f11561B0);
                s1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return u0(view, viewN0, i7) ? viewN0 : super.focusSearch(view, i7);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i7);
        }
        a1(viewN0, null);
        return view;
    }

    public void g(o oVar) {
        h(oVar, -1);
    }

    void g1(int i7, int i8, int[] iArr) {
        q1();
        G0();
        u0.m.a("RV Scroll");
        P(this.f11561B0);
        int iA1 = i7 != 0 ? this.f11568F.A1(i7, this.f11605e, this.f11561B0) : 0;
        int iC1 = i8 != 0 ? this.f11568F.C1(i8, this.f11605e, this.f11561B0) : 0;
        u0.m.b();
        Z0();
        H0();
        s1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f11568F;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f11568F;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f11566E;
    }

    @Override
    public int getBaseline() {
        p pVar = this.f11568F;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override
    protected int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override
    public boolean getClipToPadding() {
        return this.f11631z;
    }

    public androidx.recyclerview.widget.r getCompatAccessibilityDelegate() {
        return this.f11575I0;
    }

    public l getEdgeEffectFactory() {
        return this.f11606e0;
    }

    public m getItemAnimator() {
        return this.f11612j0;
    }

    public int getItemDecorationCount() {
        return this.f11574I.size();
    }

    public p getLayoutManager() {
        return this.f11568F;
    }

    public int getMaxFlingVelocity() {
        return this.f11623u0;
    }

    public int getMinFlingVelocity() {
        return this.f11622t0;
    }

    long getNanoTime() {
        if (f11553Y0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f11621s0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f11628x0;
    }

    public v getRecycledViewPool() {
        return this.f11605e.i();
    }

    public int getScrollState() {
        return this.f11613k0;
    }

    public void h(o oVar, int i7) {
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f11574I.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.f11574I.add(oVar);
        } else {
            this.f11574I.add(i7, oVar);
        }
        w0();
        requestLayout();
    }

    public void h1(int i7) {
        if (this.f11592R) {
            return;
        }
        u1();
        p pVar = this.f11568F;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.B1(i7);
            awakenScrollBars();
        }
    }

    @Override
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(t tVar) {
        this.f11576J.add(tVar);
    }

    @Override
    public boolean isAttachedToWindow() {
        return this.f11580L;
    }

    @Override
    public final boolean isLayoutSuppressed() {
        return this.f11592R;
    }

    @Override
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(u uVar) {
        if (this.f11565D0 == null) {
            this.f11565D0 = new ArrayList();
        }
        this.f11565D0.add(uVar);
    }

    Rect j0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f11728c) {
            return qVar.f11727b;
        }
        if (this.f11561B0.e() && (qVar.b() || qVar.d())) {
            return qVar.f11727b;
        }
        Rect rect = qVar.f11727b;
        rect.set(0, 0, 0, 0);
        int size = this.f11574I.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f11560B.set(0, 0, 0, 0);
            this.f11574I.get(i7).e(this.f11560B, view, this, this.f11561B0);
            int i8 = rect.left;
            Rect rect2 = this.f11560B;
            rect.left = i8 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f11728c = false;
        return rect;
    }

    boolean j1(D d7, int i7) {
        if (!t0()) {
            Z.x0(d7.f11658a, i7);
            return true;
        }
        d7.f11674q = i7;
        this.f11587O0.add(d7);
        return false;
    }

    void k(D d7, m.c cVar, m.c cVar2) {
        d7.I(false);
        if (this.f11612j0.a(d7, cVar, cVar2)) {
            M0();
        }
    }

    boolean k1(AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? C3001b.a(accessibilityEvent) : 0;
        this.f11596T |= iA != 0 ? iA : 0;
        return true;
    }

    public boolean l0() {
        return !this.f11586O || this.f11600a0 || this.f11624v.p();
    }

    public void l1(int i7, int i8) {
        m1(i7, i8, null);
    }

    void m(D d7, m.c cVar, m.c cVar2) {
        f(d7);
        d7.I(false);
        if (this.f11612j0.c(d7, cVar, cVar2)) {
            M0();
        }
    }

    public void m1(int i7, int i8, Interpolator interpolator) {
        n1(i7, i8, interpolator, Integer.MIN_VALUE);
    }

    void n(String str) {
        if (t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + O());
        }
        if (this.f11604d0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + O()));
        }
    }

    void n0() {
        this.f11624v = new a(new f());
    }

    public void n1(int i7, int i8, Interpolator interpolator, int i9) {
        o1(i7, i8, interpolator, i9, false);
    }

    boolean o(D d7) {
        m mVar = this.f11612j0;
        return mVar == null || mVar.g(d7, d7.q());
    }

    void o1(int i7, int i8, Interpolator interpolator, int i9, boolean z7) {
        p pVar = this.f11568F;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f11592R) {
            return;
        }
        if (!pVar.p()) {
            i7 = 0;
        }
        if (!this.f11568F.q()) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        if (i9 != Integer.MIN_VALUE && i9 <= 0) {
            scrollBy(i7, i8);
            return;
        }
        if (z7) {
            int i10 = i7 != 0 ? 1 : 0;
            if (i8 != 0) {
                i10 |= 2;
            }
            r1(i10, 1);
        }
        this.f11630y0.e(i7, i8, i9, interpolator);
    }

    @Override
    protected void onAttachedToWindow() {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.k kVar;
        super.onDetachedFromWindow();
        m mVar = this.f11612j0;
        if (mVar != null) {
            mVar.k();
        }
        u1();
        this.f11580L = false;
        p pVar = this.f11568F;
        if (pVar != null) {
            pVar.F(this, this.f11605e);
        }
        this.f11587O0.clear();
        removeCallbacks(this.f11589P0);
        this.f11629y.j();
        if (!f11553Y0 || (kVar = this.f11632z0) == null) {
            return;
        }
        kVar.j(this);
        this.f11632z0 = null;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f11574I.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f11574I.get(i7).g(canvas, this, this.f11561B0);
        }
    }

    @Override
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (this.f11592R) {
            return false;
        }
        this.f11578K = null;
        if (S(motionEvent)) {
            p();
            return true;
        }
        p pVar = this.f11568F;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f11568F.q();
        if (this.f11615m0 == null) {
            this.f11615m0 = VelocityTracker.obtain();
        }
        this.f11615m0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f11594S) {
                this.f11594S = false;
            }
            this.f11614l0 = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f11618p0 = x7;
            this.f11616n0 = x7;
            int y7 = (int) (motionEvent.getY() + 0.5f);
            this.f11619q0 = y7;
            this.f11617o0 = y7;
            if (this.f11613k0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t1(1);
            }
            int[] iArr = this.f11583M0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = zP;
            if (zQ) {
                i7 = (zP ? 1 : 0) | 2;
            }
            r1(i7, 0);
        } else if (actionMasked == 1) {
            this.f11615m0.clear();
            t1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f11614l0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f11614l0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x8 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f11613k0 != 1) {
                int i8 = x8 - this.f11616n0;
                int i9 = y8 - this.f11617o0;
                if (zP == 0 || Math.abs(i8) <= this.f11620r0) {
                    z7 = false;
                } else {
                    this.f11618p0 = x8;
                    z7 = true;
                }
                if (zQ && Math.abs(i9) > this.f11620r0) {
                    this.f11619q0 = y8;
                    z7 = true;
                }
                if (z7) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
        } else if (actionMasked == 5) {
            this.f11614l0 = motionEvent.getPointerId(actionIndex);
            int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f11618p0 = x9;
            this.f11616n0 = x9;
            int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f11619q0 = y9;
            this.f11617o0 = y9;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        return this.f11613k0 == 1;
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        u0.m.a("RV OnLayout");
        A();
        u0.m.b();
        this.f11586O = true;
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        p pVar = this.f11568F;
        if (pVar == null) {
            v(i7, i8);
            return;
        }
        boolean z7 = false;
        if (pVar.w0()) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f11568F.d1(this.f11605e, this.f11561B0, i7, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z7 = true;
            }
            this.f11591Q0 = z7;
            if (z7 || this.f11566E == null) {
                return;
            }
            if (this.f11561B0.f11637e == 1) {
                B();
            }
            this.f11568F.E1(i7, i8);
            this.f11561B0.f11642j = true;
            C();
            this.f11568F.H1(i7, i8);
            if (this.f11568F.K1()) {
                this.f11568F.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f11561B0.f11642j = true;
                C();
                this.f11568F.H1(i7, i8);
            }
            this.f11593R0 = getMeasuredWidth();
            this.f11595S0 = getMeasuredHeight();
            return;
        }
        if (this.f11582M) {
            this.f11568F.d1(this.f11605e, this.f11561B0, i7, i8);
            return;
        }
        if (this.f11597U) {
            q1();
            G0();
            O0();
            H0();
            A a2 = this.f11561B0;
            if (a2.f11644l) {
                a2.f11640h = true;
            } else {
                this.f11624v.j();
                this.f11561B0.f11640h = false;
            }
            this.f11597U = false;
            s1(false);
        } else if (this.f11561B0.f11644l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f11566E;
        if (hVar != null) {
            this.f11561B0.f11638f = hVar.e();
        } else {
            this.f11561B0.f11638f = 0;
        }
        q1();
        this.f11568F.d1(this.f11605e, this.f11561B0, i7, i8);
        s1(false);
        this.f11561B0.f11640h = false;
    }

    @Override
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f11610i = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f11610i;
        if (savedState2 != null) {
            savedState.a(savedState2);
        } else {
            p pVar = this.f11568F;
            if (pVar != null) {
                savedState.f11677d = pVar.h1();
            } else {
                savedState.f11677d = null;
            }
        }
        return savedState;
    }

    @Override
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        r0();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p1(int i7) {
        if (this.f11592R) {
            return;
        }
        p pVar = this.f11568F;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.M1(this, this.f11561B0, i7);
        }
    }

    void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(X0.b.f7886a), resources.getDimensionPixelSize(X0.b.f7888c), resources.getDimensionPixelOffset(X0.b.f7887b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + O());
        }
    }

    void q1() {
        int i7 = this.f11588P + 1;
        this.f11588P = i7;
        if (i7 != 1 || this.f11592R) {
            return;
        }
        this.f11590Q = false;
    }

    void r() {
        int iJ = this.f11626w.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            D dE0 = e0(this.f11626w.i(i7));
            if (!dE0.L()) {
                dE0.c();
            }
        }
        this.f11605e.d();
    }

    void r0() {
        this.f11611i0 = null;
        this.f11608g0 = null;
        this.f11609h0 = null;
        this.f11607f0 = null;
    }

    public boolean r1(int i7, int i8) {
        return getScrollingChildHelper().p(i7, i8);
    }

    @Override
    protected void removeDetachedView(View view, boolean z7) {
        D dE0 = e0(view);
        if (dE0 != null) {
            if (dE0.z()) {
                dE0.f();
            } else if (!dE0.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + dE0 + O());
            }
        }
        view.clearAnimation();
        y(view);
        super.removeDetachedView(view, z7);
    }

    @Override
    public void requestChildFocus(View view, View view2) {
        if (!this.f11568F.f1(this, this.f11561B0, view, view2) && view2 != null) {
            a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f11568F.v1(this, view, rect, z7);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        int size = this.f11576J.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f11576J.get(i7).c(z7);
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override
    public void requestLayout() {
        if (this.f11588P != 0 || this.f11592R) {
            this.f11590Q = true;
        } else {
            super.requestLayout();
        }
    }

    void s(int i7, int i8) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f11607f0;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            zIsFinished = false;
        } else {
            this.f11607f0.onRelease();
            zIsFinished = this.f11607f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f11609h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f11609h0.onRelease();
            zIsFinished |= this.f11609h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f11608g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f11608g0.onRelease();
            zIsFinished |= this.f11608g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f11611i0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f11611i0.onRelease();
            zIsFinished |= this.f11611i0.isFinished();
        }
        if (zIsFinished) {
            Z.e0(this);
        }
    }

    boolean s0() {
        AccessibilityManager accessibilityManager = this.f11598V;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void s1(boolean z7) {
        if (this.f11588P < 1) {
            this.f11588P = 1;
        }
        if (!z7 && !this.f11592R) {
            this.f11590Q = false;
        }
        if (this.f11588P == 1) {
            if (z7 && this.f11590Q && !this.f11592R && this.f11568F != null && this.f11566E != null) {
                A();
            }
            if (!this.f11592R) {
                this.f11590Q = false;
            }
        }
        this.f11588P--;
    }

    @Override
    public void scrollBy(int i7, int i8) {
        p pVar = this.f11568F;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f11592R) {
            return;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f11568F.q();
        if (zP || zQ) {
            if (!zP) {
                i7 = 0;
            }
            if (!zQ) {
                i8 = 0;
            }
            f1(i7, i8, null, 0);
        }
    }

    @Override
    public void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (k1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.r rVar) {
        this.f11575I0 = rVar;
        Z.n0(this, rVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        i1(hVar, false, true);
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f11631z) {
            r0();
        }
        this.f11631z = z7;
        super.setClipToPadding(z7);
        if (this.f11586O) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        x0.g.g(lVar);
        this.f11606e0 = lVar;
        r0();
    }

    public void setHasFixedSize(boolean z7) {
        this.f11582M = z7;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f11612j0;
        if (mVar2 != null) {
            mVar2.k();
            this.f11612j0.v(null);
        }
        this.f11612j0 = mVar;
        if (mVar != null) {
            mVar.v(this.f11571G0);
        }
    }

    public void setItemViewCacheSize(int i7) {
        this.f11605e.G(i7);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z7) {
        suppressLayout(z7);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f11568F) {
            return;
        }
        u1();
        if (this.f11568F != null) {
            m mVar = this.f11612j0;
            if (mVar != null) {
                mVar.k();
            }
            this.f11568F.o1(this.f11605e);
            this.f11568F.p1(this.f11605e);
            this.f11605e.c();
            if (this.f11580L) {
                this.f11568F.F(this, this.f11605e);
            }
            this.f11568F.I1(null);
            this.f11568F = null;
        } else {
            this.f11605e.c();
        }
        this.f11626w.o();
        this.f11568F = pVar;
        if (pVar != null) {
            if (pVar.f11703b != null) {
                throw new IllegalArgumentException(hkVlaTTCDY.LiQdJ + pVar + " is already attached to a RecyclerView:" + pVar.f11703b.O());
            }
            pVar.I1(this);
            if (this.f11580L) {
                this.f11568F.E(this);
            }
        }
        this.f11605e.K();
        requestLayout();
    }

    @Override
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override
    public void setNestedScrollingEnabled(boolean z7) {
        getScrollingChildHelper().m(z7);
    }

    public void setOnFlingListener(s sVar) {
        this.f11621s0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f11563C0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f11628x0 = z7;
    }

    public void setRecycledViewPool(v vVar) {
        this.f11605e.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.f11570G = xVar;
    }

    void setScrollState(int i7) {
        if (i7 == this.f11613k0) {
            return;
        }
        this.f11613k0 = i7;
        if (i7 != 2) {
            v1();
        }
        G(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.f11620r0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.f11620r0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(B b2) {
        this.f11605e.F(b2);
    }

    @Override
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().o(i7);
    }

    @Override
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override
    public final void suppressLayout(boolean z7) {
        if (z7 != this.f11592R) {
            n("Do not suppressLayout in layout or scroll");
            if (z7) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f11592R = true;
                this.f11594S = true;
                u1();
                return;
            }
            this.f11592R = false;
            if (this.f11590Q && this.f11568F != null && this.f11566E != null) {
                requestLayout();
            }
            this.f11590Q = false;
        }
    }

    void t() {
        if (!this.f11586O || this.f11600a0) {
            u0.m.a("RV FullInvalidate");
            A();
            u0.m.b();
            return;
        }
        if (this.f11624v.p()) {
            if (!this.f11624v.o(4) || this.f11624v.o(11)) {
                if (this.f11624v.p()) {
                    u0.m.a("RV FullInvalidate");
                    A();
                    u0.m.b();
                    return;
                }
                return;
            }
            u0.m.a("RV PartialInvalidate");
            q1();
            G0();
            this.f11624v.w();
            if (!this.f11590Q) {
                if (m0()) {
                    A();
                } else {
                    this.f11624v.i();
                }
            }
            s1(true);
            H0();
            u0.m.b();
        }
    }

    public boolean t0() {
        return this.f11602c0 > 0;
    }

    public void t1(int i7) {
        getScrollingChildHelper().r(i7);
    }

    public void u1() {
        setScrollState(0);
        v1();
    }

    void v(int i7, int i8) {
        setMeasuredDimension(p.s(i7, getPaddingLeft() + getPaddingRight(), Z.B(this)), p.s(i8, getPaddingTop() + getPaddingBottom(), Z.A(this)));
    }

    void v0(int i7) {
        if (this.f11568F == null) {
            return;
        }
        setScrollState(2);
        this.f11568F.B1(i7);
        awakenScrollBars();
    }

    void w0() {
        int iJ = this.f11626w.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            ((q) this.f11626w.i(i7).getLayoutParams()).f11728c = true;
        }
        this.f11605e.s();
    }

    void w1(int i7, int i8, Object obj) {
        int i9;
        int iJ = this.f11626w.j();
        int i10 = i7 + i8;
        for (int i11 = 0; i11 < iJ; i11++) {
            View viewI = this.f11626w.i(i11);
            D dE0 = e0(viewI);
            if (dE0 != null && !dE0.L() && (i9 = dE0.f11660c) >= i7 && i9 < i10) {
                dE0.b(2);
                dE0.a(obj);
                ((q) viewI.getLayoutParams()).f11728c = true;
            }
        }
        this.f11605e.M(i7, i8);
    }

    void x(View view) {
        D dE0 = e0(view);
        E0(view);
        h hVar = this.f11566E;
        if (hVar != null && dE0 != null) {
            hVar.w(dE0);
        }
        List<r> list = this.f11599W;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11599W.get(size).b(view);
            }
        }
    }

    void x0() {
        int iJ = this.f11626w.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            D dE0 = e0(this.f11626w.i(i7));
            if (dE0 != null && !dE0.L()) {
                dE0.b(6);
            }
        }
        w0();
        this.f11605e.t();
    }

    void y(View view) {
        D dE0 = e0(view);
        F0(view);
        h hVar = this.f11566E;
        if (hVar != null && dE0 != null) {
            hVar.x(dE0);
        }
        List<r> list = this.f11599W;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11599W.get(size).a(view);
            }
        }
    }

    public void z0(int i7) {
        int iG = this.f11626w.g();
        for (int i8 = 0; i8 < iG; i8++) {
            this.f11626w.f(i8).offsetLeftAndRight(i7);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i7);
        this.f11603d = new y();
        this.f11605e = new w();
        this.f11629y = new androidx.recyclerview.widget.w();
        this.f11558A = new RunnableC1713a();
        this.f11560B = new Rect();
        this.f11562C = new Rect();
        this.f11564D = new RectF();
        this.f11572H = new ArrayList();
        this.f11574I = new ArrayList<>();
        this.f11576J = new ArrayList<>();
        this.f11588P = 0;
        this.f11600a0 = false;
        this.f11601b0 = false;
        this.f11602c0 = 0;
        this.f11604d0 = 0;
        this.f11606e0 = new l();
        this.f11612j0 = new androidx.recyclerview.widget.g();
        this.f11613k0 = 0;
        this.f11614l0 = -1;
        this.f11625v0 = Float.MIN_VALUE;
        this.f11627w0 = Float.MIN_VALUE;
        this.f11628x0 = true;
        this.f11630y0 = new C();
        this.f11559A0 = f11553Y0 ? new k.b() : null;
        this.f11561B0 = new A();
        this.f11567E0 = false;
        this.f11569F0 = false;
        this.f11571G0 = new n();
        this.f11573H0 = false;
        this.f11577J0 = new int[2];
        this.f11581L0 = new int[2];
        this.f11583M0 = new int[2];
        this.f11585N0 = new int[2];
        this.f11587O0 = new ArrayList();
        this.f11589P0 = new RunnableC1714b();
        this.f11593R0 = 0;
        this.f11595S0 = 0;
        this.T0 = new C1716d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11620r0 = viewConfiguration.getScaledTouchSlop();
        this.f11625v0 = C1610c0.e(viewConfiguration, context);
        this.f11627w0 = C1610c0.h(viewConfiguration, context);
        this.f11622t0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11623u0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f11612j0.v(this.f11571G0);
        n0();
        p0();
        o0();
        if (Z.x(this) == 0) {
            Z.x0(this, 1);
        }
        this.f11598V = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.r(this));
        int[] iArr = X0.c.f7894f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        Z.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        String string = typedArrayObtainStyledAttributes.getString(X0.c.f7903o);
        if (typedArrayObtainStyledAttributes.getInt(X0.c.f7897i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f11631z = typedArrayObtainStyledAttributes.getBoolean(X0.c.f7896h, true);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(X0.c.f7898j, false);
        this.f11584N = z7;
        if (z7) {
            q0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(X0.c.f7901m), typedArrayObtainStyledAttributes.getDrawable(X0.c.f7902n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(X0.c.f7899k), typedArrayObtainStyledAttributes.getDrawable(X0.c.f7900l));
        }
        typedArrayObtainStyledAttributes.recycle();
        u(context, string, attributeSet, i7, 0);
        int[] iArr2 = U0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        Z.l0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i7, 0);
        boolean z8 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z8);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        Parcelable f11677d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11677d = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void a(SavedState savedState) {
            this.f11677d = savedState.f11677d;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f11677d, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        D f11726a;

        final Rect f11727b;

        boolean f11728c;

        boolean f11729d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11727b = new Rect();
            this.f11728c = true;
            this.f11729d = false;
        }

        public int a() {
            return this.f11726a.o();
        }

        public boolean b() {
            return this.f11726a.A();
        }

        public boolean c() {
            return this.f11726a.x();
        }

        public boolean d() {
            return this.f11726a.v();
        }

        public q(int i7, int i8) {
            super(i7, i8);
            this.f11727b = new Rect();
            this.f11728c = true;
            this.f11729d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11727b = new Rect();
            this.f11728c = true;
            this.f11729d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11727b = new Rect();
            this.f11728c = true;
            this.f11729d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f11727b = new Rect();
            this.f11728c = true;
            this.f11729d = false;
        }
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f11568F;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }
}
