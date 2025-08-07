package com.google.android.material.sidesheet;

import H0.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1640s;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import c4.C1753i;
import c4.C1754j;
import c4.C1755k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import r4.C2754c;
import s0.C2870a;
import t4.gYZ.uCYQMIHsy;
import u4.C2937g;
import u4.k;
import y0.C3019t;
import y0.InterfaceC3022w;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    private d f18333a;

    private float f18334b;

    private C2937g f18335c;

    private ColorStateList f18336d;

    private k f18337e;

    private final SideSheetBehavior<V>.b f18338f;

    private float f18339g;

    private boolean f18340h;

    private int f18341i;

    private int f18342j;

    private H0.c f18343k;

    private boolean f18344l;

    private float f18345m;

    private int f18346n;

    private int f18347o;

    private int f18348p;

    private int f18349q;

    private WeakReference<V> f18350r;

    private WeakReference<View> f18351s;

    private int f18352t;

    private VelocityTracker f18353u;

    private p4.d f18354v;

    private int f18355w;

    private final Set<g> f18356x;

    private final c.AbstractC0023c f18357y;

    private static final int f18332z = C1753i.f12944w;

    private static final int f18331A = C1754j.f12960m;

    class a extends c.AbstractC0023c {
        a() {
        }

        @Override
        public int a(View view, int i7, int i8) {
            return C2870a.c(i7, SideSheetBehavior.this.f18333a.f(), SideSheetBehavior.this.f18333a.e());
        }

        @Override
        public int b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override
        public int d(View view) {
            return SideSheetBehavior.this.f18346n + SideSheetBehavior.this.d0();
        }

        @Override
        public void j(int i7) {
            if (i7 == 1 && SideSheetBehavior.this.f18340h) {
                SideSheetBehavior.this.B0(1);
            }
        }

        @Override
        public void k(View view, int i7, int i8, int i9, int i10) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f18333a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i7);
        }

        @Override
        public void l(View view, float f7, float f8) {
            int iR = SideSheetBehavior.this.R(view, f7, f8);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.G0(view, iR, sideSheetBehavior.F0());
        }

        @Override
        public boolean m(View view, int i7) {
            return (SideSheetBehavior.this.f18341i == 1 || SideSheetBehavior.this.f18350r == null || SideSheetBehavior.this.f18350r.get() != view) ? false : true;
        }
    }

    class b {

        private int f18360a;

        private boolean f18361b;

        private final Runnable f18362c = new Runnable() {
            @Override
            public final void run() {
                this.f18366d.c();
            }
        };

        b() {
        }

        public void c() {
            this.f18361b = false;
            if (SideSheetBehavior.this.f18343k != null && SideSheetBehavior.this.f18343k.k(true)) {
                b(this.f18360a);
            } else if (SideSheetBehavior.this.f18341i == 2) {
                SideSheetBehavior.this.B0(this.f18360a);
            }
        }

        void b(int i7) {
            if (SideSheetBehavior.this.f18350r == null || SideSheetBehavior.this.f18350r.get() == null) {
                return;
            }
            this.f18360a = i7;
            if (this.f18361b) {
                return;
            }
            Z.f0((View) SideSheetBehavior.this.f18350r.get(), this.f18362c);
            this.f18361b = true;
        }
    }

    public SideSheetBehavior() {
        this.f18338f = new b();
        this.f18340h = true;
        this.f18341i = 5;
        this.f18342j = 5;
        this.f18345m = 0.1f;
        this.f18352t = -1;
        this.f18356x = new LinkedHashSet();
        this.f18357y = new a();
    }

    private boolean C0() {
        return this.f18343k != null && (this.f18340h || this.f18341i == 1);
    }

    private boolean E0(V v7) {
        return (v7.isShown() || Z.o(v7) != null) && this.f18340h;
    }

    public void G0(View view, int i7, boolean z7) {
        if (!p0(view, i7, z7)) {
            B0(i7);
        } else {
            B0(2);
            this.f18338f.b(i7);
        }
    }

    private void H0() {
        V v7;
        WeakReference<V> weakReference = this.f18350r;
        if (weakReference == null || (v7 = weakReference.get()) == null) {
            return;
        }
        Z.h0(v7, 262144);
        Z.h0(v7, 1048576);
        if (this.f18341i != 5) {
            t0(v7, C3019t.a.f24405y, 5);
        }
        if (this.f18341i != 3) {
            t0(v7, C3019t.a.f24403w, 3);
        }
    }

    private void I0(k kVar) {
        C2937g c2937g = this.f18335c;
        if (c2937g != null) {
            c2937g.setShapeAppearanceModel(kVar);
        }
    }

    private void J0(View view) {
        int i7 = this.f18341i == 5 ? 4 : 0;
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
    }

    private int P(int i7, V v7) {
        int i8 = this.f18341i;
        if (i8 == 1 || i8 == 2) {
            return i7 - this.f18333a.g(v7);
        }
        if (i8 == 3) {
            return 0;
        }
        if (i8 == 5) {
            return this.f18333a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f18341i);
    }

    private float Q(float f7, float f8) {
        return Math.abs(f7 - f8);
    }

    public int R(View view, float f7, float f8) {
        if (n0(f7)) {
            return 3;
        }
        if (D0(view, f7)) {
            if (!this.f18333a.l(f7, f8) && !this.f18333a.k(view)) {
                return 3;
            }
        } else if (f7 == 0.0f || !e.a(f7, f8)) {
            int left = view.getLeft();
            if (Math.abs(left - a0()) < Math.abs(left - this.f18333a.d())) {
                return 3;
            }
        }
        return 5;
    }

    private void S() {
        WeakReference<View> weakReference = this.f18351s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f18351s = null;
    }

    private InterfaceC3022w T(final int i7) {
        return new InterfaceC3022w() {
            @Override
            public final boolean a(View view, InterfaceC3022w.a aVar) {
                return this.f24161a.q0(i7, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f18337e == null) {
            return;
        }
        C2937g c2937g = new C2937g(this.f18337e);
        this.f18335c = c2937g;
        c2937g.Q(context);
        ColorStateList colorStateList = this.f18336d;
        if (colorStateList != null) {
            this.f18335c.a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f18335c.setTint(typedValue.data);
    }

    public void V(View view, int i7) {
        if (this.f18356x.isEmpty()) {
            return;
        }
        float fB = this.f18333a.b(i7);
        Iterator<g> it = this.f18356x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private void W(View view) {
        if (Z.o(view) == null) {
            Z.q0(view, view.getResources().getString(f18332z));
        }
    }

    private int X(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    private CoordinatorLayout.f j0() {
        V v7;
        WeakReference<V> weakReference = this.f18350r;
        if (weakReference == null || (v7 = weakReference.get()) == null || !(v7.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v7.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return C0() && Q((float) this.f18355w, motionEvent.getX()) > ((float) this.f18343k.u());
    }

    private boolean n0(float f7) {
        return this.f18333a.j(f7);
    }

    private boolean o0(V v7) {
        ViewParent parent = v7.getParent();
        return parent != null && parent.isLayoutRequested() && Z.Q(v7);
    }

    private boolean p0(View view, int i7, boolean z7) {
        int iE0 = e0(i7);
        H0.c cVarI0 = i0();
        return cVarI0 != null && (!z7 ? !cVarI0.H(view, iE0, view.getTop()) : !cVarI0.F(iE0, view.getTop()));
    }

    public boolean q0(int i7, View view, InterfaceC3022w.a aVar) {
        A0(i7);
        return true;
    }

    public void r0(int i7) {
        V v7 = this.f18350r.get();
        if (v7 != null) {
            G0(v7, i7, false);
        }
    }

    private void s0(CoordinatorLayout coordinatorLayout) {
        int i7;
        View viewFindViewById;
        if (this.f18351s != null || (i7 = this.f18352t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i7)) == null) {
            return;
        }
        this.f18351s = new WeakReference<>(viewFindViewById);
    }

    private void t0(V v7, C3019t.a aVar, int i7) {
        Z.j0(v7, aVar, null, T(i7));
    }

    private void u0() {
        VelocityTracker velocityTracker = this.f18353u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18353u = null;
        }
    }

    private void v0(V v7, Runnable runnable) {
        if (o0(v7)) {
            v7.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void y0(int i7) {
        d dVar = this.f18333a;
        if (dVar == null || dVar.i() != i7) {
            if (i7 == 0) {
                this.f18333a = new com.google.android.material.sidesheet.b(this);
                if (this.f18337e == null || l0()) {
                    return;
                }
                k.b bVarV = this.f18337e.v();
                bVarV.E(0.0f).w(0.0f);
                I0(bVarV.m());
                return;
            }
            if (i7 == 1) {
                this.f18333a = new com.google.android.material.sidesheet.a(this);
                if (this.f18337e == null || k0()) {
                    return;
                }
                k.b bVarV2 = this.f18337e.v();
                bVarV2.A(0.0f).s(0.0f);
                I0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i7 + ". Must be 0 or 1.");
        }
    }

    private void z0(V v7, int i7) {
        y0(C1640s.b(((CoordinatorLayout.f) v7.getLayoutParams()).f10332c, i7) == 3 ? 1 : 0);
    }

    public void A0(final int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(uCYQMIHsy.wHbVdh);
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference<V> weakReference = this.f18350r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i7);
        } else {
            v0(this.f18350r.get(), new Runnable() {
                @Override
                public final void run() {
                    this.f24163d.r0(i7);
                }
            });
        }
    }

    void B0(int i7) {
        V v7;
        if (this.f18341i == i7) {
            return;
        }
        this.f18341i = i7;
        if (i7 == 3 || i7 == 5) {
            this.f18342j = i7;
        }
        WeakReference<V> weakReference = this.f18350r;
        if (weakReference == null || (v7 = weakReference.get()) == null) {
            return;
        }
        J0(v7);
        Iterator<g> it = this.f18356x.iterator();
        while (it.hasNext()) {
            it.next().a(v7, i7);
        }
        H0();
    }

    @Override
    public boolean D(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        if (!v7.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18341i == 1 && actionMasked == 0) {
            return true;
        }
        if (C0()) {
            this.f18343k.z(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f18353u == null) {
            this.f18353u = VelocityTracker.obtain();
        }
        this.f18353u.addMovement(motionEvent);
        if (C0() && actionMasked == 2 && !this.f18344l && m0(motionEvent)) {
            this.f18343k.b(v7, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f18344l;
    }

    boolean D0(View view, float f7) {
        return this.f18333a.m(view, f7);
    }

    public boolean F0() {
        return true;
    }

    int Y() {
        return this.f18346n;
    }

    public View Z() {
        WeakReference<View> weakReference = this.f18351s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f18333a.c();
    }

    public float b0() {
        return this.f18345m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f18349q;
    }

    int e0(int i7) {
        if (i7 == 3) {
            return a0();
        }
        if (i7 == 5) {
            return this.f18333a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i7);
    }

    int f0() {
        return this.f18348p;
    }

    @Override
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f18350r = null;
        this.f18343k = null;
        this.f18354v = null;
    }

    int g0() {
        return this.f18347o;
    }

    int h0() {
        return 500;
    }

    H0.c i0() {
        return this.f18343k;
    }

    @Override
    public void j() {
        super.j();
        this.f18350r = null;
        this.f18343k = null;
        this.f18354v = null;
    }

    @Override
    public boolean k(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        H0.c cVar;
        if (!E0(v7)) {
            this.f18344l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f18353u == null) {
            this.f18353u = VelocityTracker.obtain();
        }
        this.f18353u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f18355w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f18344l) {
            this.f18344l = false;
            return false;
        }
        return (this.f18344l || (cVar = this.f18343k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    @Override
    public boolean l(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        if (Z.w(coordinatorLayout) && !Z.w(v7)) {
            v7.setFitsSystemWindows(true);
        }
        if (this.f18350r == null) {
            this.f18350r = new WeakReference<>(v7);
            this.f18354v = new p4.d(v7);
            C2937g c2937g = this.f18335c;
            if (c2937g != null) {
                Z.r0(v7, c2937g);
                C2937g c2937g2 = this.f18335c;
                float fU = this.f18339g;
                if (fU == -1.0f) {
                    fU = Z.u(v7);
                }
                c2937g2.Z(fU);
            } else {
                ColorStateList colorStateList = this.f18336d;
                if (colorStateList != null) {
                    Z.s0(v7, colorStateList);
                }
            }
            J0(v7);
            H0();
            if (Z.x(v7) == 0) {
                Z.x0(v7, 1);
            }
            W(v7);
        }
        z0(v7, i7);
        if (this.f18343k == null) {
            this.f18343k = H0.c.m(coordinatorLayout, this.f18357y);
        }
        int iG = this.f18333a.g(v7);
        coordinatorLayout.C(v7, i7);
        this.f18347o = coordinatorLayout.getWidth();
        this.f18348p = this.f18333a.h(coordinatorLayout);
        this.f18346n = v7.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v7.getLayoutParams();
        this.f18349q = marginLayoutParams != null ? this.f18333a.a(marginLayoutParams) : 0;
        Z.X(v7, P(iG, v7));
        s0(coordinatorLayout);
        for (g gVar : this.f18356x) {
            if (gVar instanceof g) {
                gVar.c(v7);
            }
        }
        return true;
    }

    @Override
    public boolean m(CoordinatorLayout coordinatorLayout, V v7, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v7.getLayoutParams();
        v7.measure(X(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, -1, marginLayoutParams.width), X(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, -1, marginLayoutParams.height));
        return true;
    }

    public void w0(int i7) {
        this.f18352t = i7;
        S();
        WeakReference<V> weakReference = this.f18350r;
        if (weakReference != null) {
            V v7 = weakReference.get();
            if (i7 == -1 || !Z.R(v7)) {
                return;
            }
            v7.requestLayout();
        }
    }

    @Override
    public void x(CoordinatorLayout coordinatorLayout, V v7, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.x(coordinatorLayout, v7, savedState.getSuperState());
        }
        int i7 = savedState.f18358d;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.f18341i = i7;
        this.f18342j = i7;
    }

    public void x0(boolean z7) {
        this.f18340h = z7;
    }

    @Override
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v7) {
        return new SavedState(super.y(coordinatorLayout, v7), (SideSheetBehavior<?>) this);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        final int f18358d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18358d = parcel.readInt();
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f18358d);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f18358d = ((SideSheetBehavior) sideSheetBehavior).f18341i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18338f = new b();
        this.f18340h = true;
        this.f18341i = 5;
        this.f18342j = 5;
        this.f18345m = 0.1f;
        this.f18352t = -1;
        this.f18356x = new LinkedHashSet();
        this.f18357y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.D5);
        int i7 = C1755k.F5;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.f18336d = C2754c.a(context, typedArrayObtainStyledAttributes, i7);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1755k.f13024I5)) {
            this.f18337e = k.e(context, attributeSet, 0, f18331A).m();
        }
        int i8 = C1755k.H5;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            w0(typedArrayObtainStyledAttributes.getResourceId(i8, -1));
        }
        U(context);
        this.f18339g = typedArrayObtainStyledAttributes.getDimension(C1755k.E5, -1.0f);
        x0(typedArrayObtainStyledAttributes.getBoolean(C1755k.G5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f18334b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
