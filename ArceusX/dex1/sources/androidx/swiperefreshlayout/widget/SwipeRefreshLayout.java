package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.Z;

public class SwipeRefreshLayout extends ViewGroup implements G, F, D {

    private static final String f12111l0 = "SwipeRefreshLayout";

    private static final int[] f12112m0 = {R.attr.enabled};

    private final E f12113A;

    private final int[] f12114B;

    private final int[] f12115C;

    private final int[] f12116D;

    private boolean f12117E;

    private int f12118F;

    int f12119G;

    private float f12120H;

    private float f12121I;

    private boolean f12122J;

    private int f12123K;

    boolean f12124L;

    private boolean f12125M;

    private final DecelerateInterpolator f12126N;

    androidx.swiperefreshlayout.widget.a f12127O;

    private int f12128P;

    protected int f12129Q;

    float f12130R;

    protected int f12131S;

    int f12132T;

    int f12133U;

    androidx.swiperefreshlayout.widget.b f12134V;

    private Animation f12135W;

    private Animation f12136a0;

    private Animation f12137b0;

    private Animation f12138c0;

    private View f12139d;

    private Animation f12140d0;

    j f12141e;

    boolean f12142e0;

    private int f12143f0;

    boolean f12144g0;

    private boolean f12145h0;

    boolean f12146i;

    private Animation.AnimationListener f12147i0;

    private final Animation f12148j0;

    private final Animation f12149k0;

    private int f12150v;

    private float f12151w;

    private float f12152y;

    private final H f12153z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f12146i) {
                swipeRefreshLayout.l();
                return;
            }
            swipeRefreshLayout.f12134V.setAlpha(255);
            SwipeRefreshLayout.this.f12134V.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f12142e0 && (jVar = swipeRefreshLayout2.f12141e) != null) {
                jVar.p();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f12119G = swipeRefreshLayout3.f12127O.getTop();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f7);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f7);
        }
    }

    class d extends Animation {

        final int f12158d;

        final int f12159e;

        d(int i7, int i8) {
            this.f12158d = i7;
            this.f12159e = i8;
        }

        @Override
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.f12134V.setAlpha((int) (this.f12158d + ((this.f12159e - r0) * f7)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f12124L) {
                return;
            }
            swipeRefreshLayout.r(null);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f12144g0 ? swipeRefreshLayout.f12132T - Math.abs(swipeRefreshLayout.f12131S) : swipeRefreshLayout.f12132T;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f12129Q + ((int) ((iAbs - r1) * f7))) - swipeRefreshLayout2.f12127O.getTop());
            SwipeRefreshLayout.this.f12134V.e(1.0f - f7);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout.this.j(f7);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override
        public void applyTransformation(float f7, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f8 = swipeRefreshLayout.f12130R;
            swipeRefreshLayout.setAnimationProgress(f8 + ((-f8) * f7));
            SwipeRefreshLayout.this.j(f7);
        }
    }

    public interface i {
    }

    public interface j {
        void p();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12146i = false;
        this.f12151w = -1.0f;
        this.f12114B = new int[2];
        this.f12115C = new int[2];
        this.f12116D = new int[2];
        this.f12123K = -1;
        this.f12128P = -1;
        this.f12147i0 = new a();
        this.f12148j0 = new f();
        this.f12149k0 = new g();
        this.f12150v = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f12118F = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f12126N = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f12143f0 = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i7 = (int) (displayMetrics.density * 64.0f);
        this.f12132T = i7;
        this.f12151w = i7;
        this.f12153z = new H(this);
        this.f12113A = new E(this);
        setNestedScrollingEnabled(true);
        int i8 = -this.f12143f0;
        this.f12119G = i8;
        this.f12131S = i8;
        j(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12112m0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(int i7, Animation.AnimationListener animationListener) {
        this.f12129Q = i7;
        this.f12148j0.reset();
        this.f12148j0.setDuration(200L);
        this.f12148j0.setInterpolator(this.f12126N);
        if (animationListener != null) {
            this.f12127O.b(animationListener);
        }
        this.f12127O.clearAnimation();
        this.f12127O.startAnimation(this.f12148j0);
    }

    private void b(int i7, Animation.AnimationListener animationListener) {
        if (this.f12124L) {
            s(i7, animationListener);
            return;
        }
        this.f12129Q = i7;
        this.f12149k0.reset();
        this.f12149k0.setDuration(200L);
        this.f12149k0.setInterpolator(this.f12126N);
        if (animationListener != null) {
            this.f12127O.b(animationListener);
        }
        this.f12127O.clearAnimation();
        this.f12127O.startAnimation(this.f12149k0);
    }

    private void d() {
        this.f12127O = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f12134V = bVar;
        bVar.l(1);
        this.f12127O.setImageDrawable(this.f12134V);
        this.f12127O.setVisibility(8);
        addView(this.f12127O);
    }

    private void f() {
        if (this.f12139d == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (!childAt.equals(this.f12127O)) {
                    this.f12139d = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f7) {
        if (f7 > this.f12151w) {
            m(true, true);
            return;
        }
        this.f12146i = false;
        this.f12134V.j(0.0f, 0.0f);
        b(this.f12119G, !this.f12124L ? new e() : null);
        this.f12134V.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void i(float f7) {
        this.f12134V.d(true);
        float fMin = Math.min(1.0f, Math.abs(f7 / this.f12151w));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f7) - this.f12151w;
        int i7 = this.f12133U;
        if (i7 <= 0) {
            i7 = this.f12144g0 ? this.f12132T - this.f12131S : this.f12132T;
        }
        float f8 = i7;
        double dMax = Math.max(0.0f, Math.min(fAbs, f8 * 2.0f) / f8) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i8 = this.f12131S + ((int) ((f8 * fMin) + (f8 * fPow * 2.0f)));
        if (this.f12127O.getVisibility() != 0) {
            this.f12127O.setVisibility(0);
        }
        if (!this.f12124L) {
            this.f12127O.setScaleX(1.0f);
            this.f12127O.setScaleY(1.0f);
        }
        if (this.f12124L) {
            setAnimationProgress(Math.min(1.0f, f7 / this.f12151w));
        }
        if (f7 < this.f12151w) {
            if (this.f12134V.getAlpha() > 76 && !h(this.f12137b0)) {
                q();
            }
        } else if (this.f12134V.getAlpha() < 255 && !h(this.f12138c0)) {
            p();
        }
        this.f12134V.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f12134V.e(Math.min(1.0f, fMax));
        this.f12134V.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i8 - this.f12119G);
    }

    private void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12123K) {
            this.f12123K = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void m(boolean z7, boolean z8) {
        if (this.f12146i != z7) {
            this.f12142e0 = z8;
            f();
            this.f12146i = z7;
            if (z7) {
                a(this.f12119G, this.f12147i0);
            } else {
                r(this.f12147i0);
            }
        }
    }

    private Animation n(int i7, int i8) {
        d dVar = new d(i7, i8);
        dVar.setDuration(300L);
        this.f12127O.b(null);
        this.f12127O.clearAnimation();
        this.f12127O.startAnimation(dVar);
        return dVar;
    }

    private void o(float f7) {
        float f8 = this.f12121I;
        float f9 = f7 - f8;
        int i7 = this.f12150v;
        if (f9 <= i7 || this.f12122J) {
            return;
        }
        this.f12120H = f8 + i7;
        this.f12122J = true;
        this.f12134V.setAlpha(76);
    }

    private void p() {
        this.f12138c0 = n(this.f12134V.getAlpha(), 255);
    }

    private void q() {
        this.f12137b0 = n(this.f12134V.getAlpha(), 76);
    }

    private void s(int i7, Animation.AnimationListener animationListener) {
        this.f12129Q = i7;
        this.f12130R = this.f12127O.getScaleX();
        h hVar = new h();
        this.f12140d0 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f12127O.b(animationListener);
        }
        this.f12127O.clearAnimation();
        this.f12127O.startAnimation(this.f12140d0);
    }

    private void setColorViewAlpha(int i7) {
        this.f12127O.getBackground().setAlpha(i7);
        this.f12134V.setAlpha(i7);
    }

    private void t(Animation.AnimationListener animationListener) {
        this.f12127O.setVisibility(0);
        this.f12134V.setAlpha(255);
        b bVar = new b();
        this.f12135W = bVar;
        bVar.setDuration(this.f12118F);
        if (animationListener != null) {
            this.f12127O.b(animationListener);
        }
        this.f12127O.clearAnimation();
        this.f12127O.startAnimation(this.f12135W);
    }

    public boolean c() {
        View view = this.f12139d;
        return view instanceof ListView ? androidx.core.widget.h.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.f12113A.a(f7, f8, z7);
    }

    @Override
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f12113A.b(f7, f8);
    }

    @Override
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f12113A.c(i7, i8, iArr, iArr2);
    }

    @Override
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f12113A.f(i7, i8, i9, i10, iArr);
    }

    public void e(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        if (i11 == 0) {
            this.f12113A.e(i7, i8, i9, i10, iArr, i11, iArr2);
        }
    }

    @Override
    protected int getChildDrawingOrder(int i7, int i8) {
        int i9 = this.f12128P;
        return i9 < 0 ? i8 : i8 == i7 + (-1) ? i9 : i8 >= i9 ? i8 + 1 : i8;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f12153z.a();
    }

    public int getProgressCircleDiameter() {
        return this.f12143f0;
    }

    public int getProgressViewEndOffset() {
        return this.f12132T;
    }

    public int getProgressViewStartOffset() {
        return this.f12131S;
    }

    @Override
    public boolean hasNestedScrollingParent() {
        return this.f12113A.j();
    }

    @Override
    public boolean isNestedScrollingEnabled() {
        return this.f12113A.l();
    }

    void j(float f7) {
        setTargetOffsetTopAndBottom((this.f12129Q + ((int) ((this.f12131S - r0) * f7))) - this.f12127O.getTop());
    }

    void l() {
        this.f12127O.clearAnimation();
        this.f12134V.stop();
        this.f12127O.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f12124L) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f12131S - this.f12119G);
        }
        this.f12119G = this.f12127O.getTop();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f12139d == null) {
            f();
        }
        View view = this.f12139d;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f12127O.getMeasuredWidth();
        int measuredHeight2 = this.f12127O.getMeasuredHeight();
        int i11 = measuredWidth / 2;
        int i12 = measuredWidth2 / 2;
        int i13 = this.f12119G;
        this.f12127O.layout(i11 - i12, i13, i11 + i12, measuredHeight2 + i13);
    }

    @Override
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f12139d == null) {
            f();
        }
        View view = this.f12139d;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f12127O.measure(View.MeasureSpec.makeMeasureSpec(this.f12143f0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f12143f0, 1073741824));
        this.f12128P = -1;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) == this.f12127O) {
                this.f12128P = i9;
                return;
            }
        }
    }

    @Override
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        return dispatchNestedFling(f7, f8, z7);
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i11 != 0) {
            return;
        }
        int i12 = iArr[1];
        e(i7, i8, i9, i10, this.f12115C, i11, iArr);
        int i13 = i10 - (iArr[1] - i12);
        if ((i13 == 0 ? i10 + this.f12115C[1] : i13) >= 0 || c()) {
            return;
        }
        float fAbs = this.f12152y + Math.abs(r1);
        this.f12152y = fAbs;
        i(fAbs);
        iArr[1] = iArr[1] + i13;
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f12154d);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f12146i);
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override
    public void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12125M && actionMasked == 0) {
            this.f12125M = false;
        }
        if (!isEnabled() || this.f12125M || c() || this.f12146i || this.f12117E) {
            return false;
        }
        if (actionMasked == 0) {
            this.f12123K = motionEvent.getPointerId(0);
            this.f12122J = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12123K);
                if (iFindPointerIndex < 0) {
                    Log.e(f12111l0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f12122J) {
                    float y7 = (motionEvent.getY(iFindPointerIndex) - this.f12120H) * 0.5f;
                    this.f12122J = false;
                    g(y7);
                }
                this.f12123K = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f12123K);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f12111l0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y8 = motionEvent.getY(iFindPointerIndex2);
                o(y8);
                if (this.f12122J) {
                    float f7 = (y8 - this.f12120H) * 0.5f;
                    if (f7 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i(f7);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f12111l0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f12123K = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    k(motionEvent);
                }
            }
        }
        return true;
    }

    void r(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f12136a0 = cVar;
        cVar.setDuration(150L);
        this.f12127O.b(animationListener);
        this.f12127O.clearAnimation();
        this.f12127O.startAnimation(this.f12136a0);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        ViewParent parent;
        View view = this.f12139d;
        if (view == null || Z.S(view)) {
            super.requestDisallowInterceptTouchEvent(z7);
        } else {
            if (this.f12145h0 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z7);
        }
    }

    void setAnimationProgress(float f7) {
        this.f12127O.setScaleX(f7);
        this.f12127O.setScaleY(f7);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f12134V.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = androidx.core.content.a.c(context, iArr[i7]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i7) {
        this.f12151w = i7;
    }

    @Override
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        if (z7) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z7) {
        this.f12145h0 = z7;
    }

    @Override
    public void setNestedScrollingEnabled(boolean z7) {
        this.f12113A.m(z7);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f12141e = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i7) {
        setProgressBackgroundColorSchemeResource(i7);
    }

    public void setProgressBackgroundColorSchemeColor(int i7) {
        this.f12127O.setBackgroundColor(i7);
    }

    public void setProgressBackgroundColorSchemeResource(int i7) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.c(getContext(), i7));
    }

    public void setRefreshing(boolean z7) {
        if (!z7 || this.f12146i == z7) {
            m(z7, false);
            return;
        }
        this.f12146i = z7;
        setTargetOffsetTopAndBottom((!this.f12144g0 ? this.f12132T + this.f12131S : this.f12132T) - this.f12119G);
        this.f12142e0 = false;
        t(this.f12147i0);
    }

    public void setSize(int i7) {
        if (i7 == 0 || i7 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i7 == 0) {
                this.f12143f0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f12143f0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f12127O.setImageDrawable(null);
            this.f12134V.l(i7);
            this.f12127O.setImageDrawable(this.f12134V);
        }
    }

    public void setSlingshotDistance(int i7) {
        this.f12133U = i7;
    }

    void setTargetOffsetTopAndBottom(int i7) {
        this.f12127O.bringToFront();
        Z.Y(this.f12127O, i7);
        this.f12119G = this.f12127O.getTop();
    }

    @Override
    public boolean startNestedScroll(int i7) {
        return this.f12113A.o(i7);
    }

    @Override
    public void stopNestedScroll() {
        this.f12113A.q();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        final boolean f12154d;

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

        SavedState(Parcelable parcelable, boolean z7) {
            super(parcelable);
            this.f12154d = z7;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f12154d ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f12154d = parcel.readByte() != 0;
        }
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        if (i8 > 0) {
            float f7 = this.f12152y;
            if (f7 > 0.0f) {
                float f8 = i8;
                if (f8 > f7) {
                    iArr[1] = (int) f7;
                    this.f12152y = 0.0f;
                } else {
                    this.f12152y = f7 - f8;
                    iArr[1] = i8;
                }
                i(this.f12152y);
            }
        }
        if (this.f12144g0 && i8 > 0 && this.f12152y == 0.0f && Math.abs(i8 - iArr[1]) > 0) {
            this.f12127O.setVisibility(8);
        }
        int[] iArr2 = this.f12114B;
        if (dispatchNestedPreScroll(i7 - iArr[0], i8 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f12153z.b(view, view2, i7);
        startNestedScroll(i7 & 2);
        this.f12152y = 0.0f;
        this.f12117E = true;
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return (!isEnabled() || this.f12125M || this.f12146i || (i7 & 2) == 0) ? false : true;
    }

    @Override
    public void onStopNestedScroll(View view) {
        this.f12153z.d(view);
        this.f12117E = false;
        float f7 = this.f12152y;
        if (f7 > 0.0f) {
            g(f7);
            this.f12152y = 0.0f;
        }
        stopNestedScroll();
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        onNestedScroll(view, i7, i8, i9, i10, i11, this.f12116D);
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i7, i8, i9, i10, 0, this.f12116D);
    }
}
