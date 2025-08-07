package androidx.core.widget;

import Y3.qE.KpBmp;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C;
import androidx.core.view.C1605a;
import androidx.core.view.C1633o;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1635p;
import androidx.core.view.Z;
import o0.C2674a;
import y0.C3019t;
import y0.C3021v;

public class NestedScrollView extends FrameLayout implements G, D {

    private static final float f10731W = (float) (Math.log(0.78d) / Math.log(0.9d));

    private static final a f10732a0 = new a();

    private static final int[] f10733b0 = {R.attr.fillViewport};

    private boolean f10734A;

    private boolean f10735B;

    private View f10736C;

    private boolean f10737D;

    private VelocityTracker f10738E;

    private boolean f10739F;

    private boolean f10740G;

    private int f10741H;

    private int f10742I;

    private int f10743J;

    private int f10744K;

    private final int[] f10745L;

    private final int[] f10746M;

    private int f10747N;

    private int f10748O;

    private SavedState f10749P;

    private final H f10750Q;

    private final E f10751R;

    private float f10752S;

    private e f10753T;

    final d f10754U;

    C1633o f10755V;

    private final float f10756d;

    private long f10757e;

    private final Rect f10758i;

    private OverScroller f10759v;

    public EdgeEffect f10760w;

    public EdgeEffect f10761y;

    private int f10762z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        public int f10763d;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f10763d + KpBmp.JAKWnfLzns;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f10763d);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f10763d = parcel.readInt();
        }
    }

    static class a extends C1605a {
        a() {
        }

        @Override
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3021v.a(accessibilityEvent, nestedScrollView.getScrollX());
            C3021v.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override
        public void g(View view, C3019t c3019t) {
            int scrollRange;
            super.g(view, c3019t);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c3019t.e0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c3019t.x0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c3019t.b(C3019t.a.f24398r);
                c3019t.b(C3019t.a.f24365C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c3019t.b(C3019t.a.f24397q);
                c3019t.b(C3019t.a.f24367E);
            }
        }

        @Override
        public boolean j(View view, int i7, Bundle bundle) {
            if (super.j(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, iMax, true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f7) {
            try {
                view.setFrameContentVelocity(f7);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements InterfaceC1635p {
        d() {
        }

        @Override
        public boolean a(float f7) {
            if (f7 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.p((int) f7);
            return true;
        }

        @Override
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override
        public void c() {
            NestedScrollView.this.f10759v.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2674a.f22317c);
    }

    private boolean A(View view, int i7, int i8) {
        view.getDrawingRect(this.f10758i);
        offsetDescendantRectToMyCoords(view, this.f10758i);
        return this.f10758i.bottom + i7 >= getScrollY() && this.f10758i.top - i7 <= getScrollY() + i8;
    }

    private void B(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f10751R.e(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10744K) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f10762z = (int) motionEvent.getY(i7);
            this.f10744K = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f10738E;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f10738E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10738E = null;
        }
    }

    private int G(int r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.G(int, float):int");
    }

    private void H(boolean z7) {
        if (z7) {
            R(2, 1);
        } else {
            T(1);
        }
        this.f10748O = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean I(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = false;
        boolean z8 = i7 == 33;
        View viewO = o(z8, i8, i9);
        if (viewO == null) {
            viewO = this;
        }
        if (i8 < scrollY || i9 > i10) {
            J(z8 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z7 = true;
        }
        if (viewO != findFocus()) {
            viewO.requestFocus(i7);
        }
        return z7;
    }

    private int J(int i7, int i8, int i9, boolean z7) {
        int i10;
        int i11;
        VelocityTracker velocityTracker;
        if (i9 == 1) {
            R(2, i9);
        }
        boolean z8 = false;
        if (i(0, i7, this.f10746M, this.f10745L, i9)) {
            i10 = i7 - this.f10746M[1];
            i11 = this.f10745L[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z9 = d() && !z7;
        boolean z10 = D(0, i10, 0, scrollY, 0, scrollRange, 0, 0, true) && !s(i9);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f10746M;
        iArr[1] = 0;
        j(0, scrollY2, 0, i10 - scrollY2, this.f10745L, i9, iArr);
        int i12 = i11 + this.f10745L[1];
        int i13 = i10 - this.f10746M[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z9) {
                androidx.core.widget.e.d(this.f10760w, (-i13) / getHeight(), i8 / getWidth());
                if (!this.f10761y.isFinished()) {
                    this.f10761y.onRelease();
                }
            }
        } else if (i14 > scrollRange && z9) {
            androidx.core.widget.e.d(this.f10761y, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!this.f10760w.isFinished()) {
                this.f10760w.onRelease();
            }
        }
        if (this.f10760w.isFinished() && this.f10761y.isFinished()) {
            z8 = z10;
        } else {
            postInvalidateOnAnimation();
        }
        if (z8 && i9 == 0 && (velocityTracker = this.f10738E) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            T(i9);
            this.f10760w.onRelease();
            this.f10761y.onRelease();
        }
        return i12;
    }

    private void K(View view) {
        view.getDrawingRect(this.f10758i);
        offsetDescendantRectToMyCoords(view, this.f10758i);
        int iG = g(this.f10758i);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean L(Rect rect, boolean z7) {
        int iG = g(rect);
        boolean z8 = iG != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, iG);
            } else {
                N(0, iG);
            }
        }
        return z8;
    }

    private boolean M(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return r(-i7) < androidx.core.widget.e.b(edgeEffect) * ((float) getHeight());
    }

    private void O(int i7, int i8, int i9, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f10757e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f10759v.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            H(z7);
        } else {
            if (!this.f10759v.isFinished()) {
                a();
            }
            scrollBy(i7, i8);
        }
        this.f10757e = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean S(MotionEvent motionEvent) {
        boolean z7;
        if (androidx.core.widget.e.b(this.f10760w) != 0.0f) {
            androidx.core.widget.e.d(this.f10760w, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        if (androidx.core.widget.e.b(this.f10761y) == 0.0f) {
            return z7;
        }
        androidx.core.widget.e.d(this.f10761y, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f10759v.abortAnimation();
        T(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    private void k(int i7) {
        if (i7 != 0) {
            if (this.f10740G) {
                N(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    private boolean l(int i7) {
        if (androidx.core.widget.e.b(this.f10760w) != 0.0f) {
            if (M(this.f10760w, i7)) {
                this.f10760w.onAbsorb(i7);
            } else {
                p(-i7);
            }
        } else {
            if (androidx.core.widget.e.b(this.f10761y) == 0.0f) {
                return false;
            }
            int i8 = -i7;
            if (M(this.f10761y, i8)) {
                this.f10761y.onAbsorb(i8);
            } else {
                p(i8);
            }
        }
        return true;
    }

    private void m() {
        this.f10744K = -1;
        this.f10737D = false;
        F();
        T(0);
        this.f10760w.onRelease();
        this.f10761y.onRelease();
    }

    private android.view.View o(boolean r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.o(boolean, int, int):android.view.View");
    }

    private float r(int i7) {
        double dLog = Math.log((Math.abs(i7) * 0.35f) / (this.f10756d * 0.015f));
        float f7 = f10731W;
        return (float) (this.f10756d * 0.015f * Math.exp((f7 / (f7 - 1.0d)) * dLog));
    }

    private boolean t(int i7, int i8) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight();
    }

    private void u() {
        VelocityTracker velocityTracker = this.f10738E;
        if (velocityTracker == null) {
            this.f10738E = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.f10759v = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f10741H = viewConfiguration.getScaledTouchSlop();
        this.f10742I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10743J = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.f10738E == null) {
            this.f10738E = VelocityTracker.obtain();
        }
    }

    private void x(int i7, int i8) {
        this.f10762z = i7;
        this.f10744K = i8;
        R(2, 0);
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7) {
        boolean z8;
        boolean z9;
        int overScrollMode = getOverScrollMode();
        boolean z10 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z11 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        int i15 = i9 + i7;
        int i16 = !z12 ? 0 : i13;
        int i17 = i10 + i8;
        int i18 = !z13 ? 0 : i14;
        int i19 = -i16;
        int i20 = i16 + i11;
        int i21 = -i18;
        int i22 = i18 + i12;
        if (i15 > i20) {
            i15 = i20;
            z8 = true;
        } else if (i15 < i19) {
            z8 = true;
            i15 = i19;
        } else {
            z8 = false;
        }
        if (i17 > i22) {
            i17 = i22;
            z9 = true;
        } else if (i17 < i21) {
            z9 = true;
            i17 = i21;
        } else {
            z9 = false;
        }
        if (z9 && !s(1)) {
            this.f10759v.springBack(i15, i17, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i15, i17, z8, z9);
        return z8 || z9;
    }

    public boolean E(int i7) {
        boolean z7 = i7 == 130;
        int height = getHeight();
        if (z7) {
            this.f10758i.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f10758i;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f10758i.top = getScrollY() - height;
            Rect rect2 = this.f10758i;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f10758i;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return I(i7, i8, i9);
    }

    public final void N(int i7, int i8) {
        O(i7, i8, 250, false);
    }

    void P(int i7, int i8, int i9, boolean z7) {
        O(i7 - getScrollX(), i8 - getScrollY(), i9, z7);
    }

    void Q(int i7, int i8, boolean z7) {
        P(i7, i8, 250, z7);
    }

    public boolean R(int i7, int i8) {
        return this.f10751R.p(i7, i8);
    }

    public void T(int i7) {
        this.f10751R.r(i7);
    }

    @Override
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i7) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            J(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f10758i);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f10758i);
            J(g(this.f10758i), 0, 1, true);
            viewFindNextFocus.requestFocus(i7);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && y(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override
    public void computeScroll() {
        if (this.f10759v.isFinished()) {
            return;
        }
        this.f10759v.computeScrollOffset();
        int currY = this.f10759v.getCurrY();
        int iH = h(currY - this.f10748O);
        this.f10748O = currY;
        int[] iArr = this.f10746M;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i7 = iH - this.f10746M[1];
        int scrollRange = getScrollRange();
        if (u0.a.d()) {
            c.a(this, Math.abs(this.f10759v.getCurrVelocity()));
        }
        if (i7 != 0) {
            int scrollY = getScrollY();
            D(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f10746M;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i8, this.f10745L, 1, iArr2);
            i7 = i8 - this.f10746M[1];
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i7 < 0) {
                    if (this.f10760w.isFinished()) {
                        this.f10760w.onAbsorb((int) this.f10759v.getCurrVelocity());
                    }
                } else if (this.f10761y.isFinished()) {
                    this.f10761y.onAbsorb((int) this.f10759v.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f10759v.isFinished()) {
            T(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.f10751R.a(f7, f8, z7);
    }

    @Override
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f10751R.b(f7, f8);
    }

    @Override
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return i(i7, i8, iArr, iArr2, 0);
    }

    @Override
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f10751R.f(i7, i8, i9, i10, iArr);
    }

    @Override
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f10760w.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f10760w.setSize(width, height);
            if (this.f10760w.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f10761y.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f10761y.setSize(width2, height2);
        if (this.f10761y.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f10750Q.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f10752S == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f10752S = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f10752S;
    }

    int h(int i7) {
        int height = getHeight();
        if (i7 > 0 && androidx.core.widget.e.b(this.f10760w) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.e.d(this.f10760w, ((-i7) * 4.0f) / height, 0.5f));
            if (iRound != i7) {
                this.f10760w.finish();
            }
            return i7 - iRound;
        }
        if (i7 >= 0 || androidx.core.widget.e.b(this.f10761y) == 0.0f) {
            return i7;
        }
        float f7 = height;
        int iRound2 = Math.round((f7 / 4.0f) * androidx.core.widget.e.d(this.f10761y, (i7 * 4.0f) / f7, 0.5f));
        if (iRound2 != i7) {
            this.f10761y.finish();
        }
        return i7 - iRound2;
    }

    @Override
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    public boolean i(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f10751R.d(i7, i8, iArr, iArr2, i9);
    }

    @Override
    public boolean isNestedScrollingEnabled() {
        return this.f10751R.l();
    }

    public void j(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        this.f10751R.e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override
    protected void measureChild(View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    protected void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(KeyEvent keyEvent) {
        this.f10758i.setEmpty();
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? q(33) : c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? q(130) : c(130);
        }
        if (keyCode == 62) {
            E(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return q(33);
        }
        if (keyCode == 93) {
            return q(130);
        }
        if (keyCode == 122) {
            E(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        E(130);
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10735B = false;
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f10737D) {
            if (C.a(motionEvent, 2)) {
                i7 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (C.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i7 = 26;
                axisValue = axisValue2;
            } else {
                i7 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                J(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, C.a(motionEvent, 8194));
                if (i7 != 0) {
                    this.f10755V.g(motionEvent, i7);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        int measuredHeight = 0;
        this.f10734A = false;
        View view = this.f10736C;
        if (view != null && z(view, this)) {
            K(this.f10736C);
        }
        this.f10736C = null;
        if (!this.f10735B) {
            if (this.f10749P != null) {
                scrollTo(getScrollX(), this.f10749P.f10763d);
                this.f10749P = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f10735B = true;
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f10739F && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        p((int) f8);
        return true;
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        i(i7, i8, iArr, null, i9);
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        B(i10, i11, iArr);
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        this.f10750Q.c(view, view2, i7, i8);
        R(2, i8);
    }

    @Override
    protected void onOverScrolled(int i7, int i8, boolean z7, boolean z8) {
        super.scrollTo(i7, i8);
    }

    @Override
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (viewFindNextFocus == null || y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i7, rect);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10749P = savedState;
        requestLayout();
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10763d = getScrollY();
        return savedState;
    }

    @Override
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        e eVar = this.f10753T;
        if (eVar != null) {
            eVar.a(this, i7, i8, i9, i10);
        }
    }

    @Override
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i10)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f10758i);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f10758i);
        k(g(this.f10758i));
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override
    public void onStopNestedScroll(View view, int i7) {
        this.f10750Q.e(view, i7);
        T(i7);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10747N = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f10747N);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f10738E;
                velocityTracker.computeCurrentVelocity(1000, this.f10743J);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f10744K);
                if (Math.abs(yVelocity) >= this.f10742I) {
                    if (!l(yVelocity)) {
                        int i7 = -yVelocity;
                        float f7 = i7;
                        if (!dispatchNestedPreFling(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            p(i7);
                        }
                    }
                } else if (this.f10759v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f10744K);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f10744K + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(iFindPointerIndex);
                    int i8 = this.f10762z - y7;
                    int iG = i8 - G(i8, motionEvent.getX(iFindPointerIndex));
                    if (!this.f10737D && Math.abs(iG) > this.f10741H) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f10737D = true;
                        iG = iG > 0 ? iG - this.f10741H : iG + this.f10741H;
                    }
                    if (this.f10737D) {
                        int iJ = J(iG, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f10762z = y7 - iJ;
                        this.f10747N += iJ;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f10737D && getChildCount() > 0 && this.f10759v.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f10762z = (int) motionEvent.getY(actionIndex);
                this.f10744K = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.f10762z = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f10744K));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f10737D && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f10759v.isFinished()) {
                a();
            }
            x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f10738E;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i7) {
        if (getChildCount() > 0) {
            this.f10759v.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            H(true);
            if (u0.a.d()) {
                c.a(this, Math.abs(this.f10759v.getCurrVelocity()));
            }
        }
    }

    public boolean q(int i7) {
        int childCount;
        boolean z7 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f10758i;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f10758i.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f10758i;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f10758i;
        return I(i7, rect3.top, rect3.bottom);
    }

    @Override
    public void requestChildFocus(View view, View view2) {
        if (this.f10734A) {
            this.f10736C = view2;
        } else {
            K(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z7);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        if (z7) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override
    public void requestLayout() {
        this.f10734A = true;
        super.requestLayout();
    }

    public boolean s(int i7) {
        return this.f10751R.k(i7);
    }

    @Override
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i7, width, width2);
            int iF2 = f(i8, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f10739F) {
            this.f10739F = z7;
            requestLayout();
        }
    }

    @Override
    public void setNestedScrollingEnabled(boolean z7) {
        this.f10751R.m(z7);
    }

    public void setOnScrollChangeListener(e eVar) {
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f10740G = z7;
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override
    public boolean startNestedScroll(int i7) {
        return R(i7, 0);
    }

    @Override
    public void stopNestedScroll() {
        T(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10758i = new Rect();
        this.f10734A = true;
        this.f10735B = false;
        this.f10736C = null;
        this.f10737D = false;
        this.f10740G = true;
        this.f10744K = -1;
        this.f10745L = new int[2];
        this.f10746M = new int[2];
        d dVar = new d();
        this.f10754U = dVar;
        this.f10755V = new C1633o(getContext(), dVar);
        this.f10760w = androidx.core.widget.e.a(context, attributeSet);
        this.f10761y = androidx.core.widget.e.a(context, attributeSet);
        this.f10756d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10733b0, i7, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f10750Q = new H(this);
        this.f10751R = new E(this);
        setNestedScrollingEnabled(true);
        Z.n0(this, f10732a0);
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        B(i10, i11, null);
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        B(i10, 0, null);
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override
    public void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
