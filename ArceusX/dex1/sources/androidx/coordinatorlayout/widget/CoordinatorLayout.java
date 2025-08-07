package androidx.coordinatorlayout.widget;

import Q6.QtA.QXojhh;
import Za.qhkq.dHkZSUxHu;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.C1640s;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import com.appsflyer.R;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n0.C2622a;
import n0.C2623b;
import n0.C2624c;
import q0.C2731a;
import x0.C2985b;
import ya.HnSi.PLHvHoayk;

public class CoordinatorLayout extends ViewGroup implements F, G {

    static final String f10302N;

    static final Class<?>[] f10303O;

    static final ThreadLocal<Map<String, Constructor<c>>> f10304P;

    static final Comparator<View> f10305Q;

    private static final x0.d<Rect> f10306R;

    private boolean f10307A;

    private boolean f10308B;

    private int[] f10309C;

    private View f10310D;

    private View f10311E;

    private g f10312F;

    private boolean f10313G;

    private WindowInsetsCompat f10314H;

    private boolean f10315I;

    private Drawable f10316J;

    ViewGroup.OnHierarchyChangeListener f10317K;

    private I f10318L;

    private final H f10319M;

    private final List<View> f10320d;

    private final androidx.coordinatorlayout.widget.b<View> f10321e;

    private final List<View> f10322i;

    private final List<View> f10323v;

    private Paint f10324w;

    private final int[] f10325y;

    private final int[] f10326z;

    class a implements I {
        a() {
        }

        @Override
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.Q(windowInsetsCompat);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7, int i8) {
            if (i8 == 0) {
                return z(coordinatorLayout, v7, view, view2, i7);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v7, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v7, View view, int i7) {
            if (i7 == 0) {
                B(coordinatorLayout, v7, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v7) {
            return d(coordinatorLayout, v7) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v7, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v7) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v7) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v7, View view) {
            return false;
        }

        public WindowInsetsCompat f(CoordinatorLayout coordinatorLayout, V v7, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v7, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v7, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v7, int i7) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v7, int i7, int i8, int i9, int i10) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v7, View view, float f7, float f8, boolean z7) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v7, View view, float f7, float f8) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int[] iArr, int i9) {
            if (i9 == 0) {
                p(coordinatorLayout, v7, view, i7, i8, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int i9, int i10) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int i9, int i10, int i11) {
            if (i11 == 0) {
                r(coordinatorLayout, v7, view, i7, i8, i9, i10);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            iArr[0] = iArr[0] + i9;
            iArr[1] = iArr[1] + i10;
            s(coordinatorLayout, v7, view, i7, i8, i9, i10, i11);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7, int i8) {
            if (i8 == 0) {
                u(coordinatorLayout, v7, view, view2, i7);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v7, Rect rect, boolean z7) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v7, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v7) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f10317K;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f10317K;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override
        public boolean onPreDraw() {
            CoordinatorLayout.this.B(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        @Override
        public int compare(View view, View view2) {
            float fL = Z.L(view);
            float fL2 = Z.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f10302N = r02 != null ? r02.getName() : null;
        f10305Q = new h();
        f10303O = new Class[]{Context.class, AttributeSet.class};
        f10304P = new ThreadLocal<>();
        f10306R = new x0.f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2622a.f22225a);
    }

    static c E(Context context, AttributeSet attributeSet, String str) throws NoSuchMethodException, SecurityException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f10302N;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f10304P;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f10303O);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e7) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e7);
        }
    }

    private boolean F(MotionEvent motionEvent, int i7) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f10322i;
        t(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = list.get(i8);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zK || z7) || actionMasked == 0) {
                if (!zK && cVarF != null) {
                    if (i7 == 0) {
                        zK = cVarF.k(this, view, motionEvent);
                    } else if (i7 == 1) {
                        zK = cVarF.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f10310D = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z7 = zI && !zC;
                if (zI && !z7) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i7 == 0) {
                    cVarF.k(this, view, motionEventObtain);
                } else if (i7 == 1) {
                    cVarF.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    private void G() {
        this.f10320d.clear();
        this.f10321e.c();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVarS = s(childAt);
            fVarS.d(this, childAt);
            this.f10321e.b(childAt);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i7) {
                    View childAt2 = getChildAt(i8);
                    if (fVarS.b(this, childAt, childAt2)) {
                        if (!this.f10321e.d(childAt2)) {
                            this.f10321e.b(childAt2);
                        }
                        this.f10321e.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f10320d.addAll(this.f10321e.i());
        Collections.reverse(this.f10320d);
    }

    private static void I(Rect rect) {
        rect.setEmpty();
        f10306R.a(rect);
    }

    private void K(boolean z7) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z7) {
                    cVarF.k(this, childAt, motionEventObtain);
                } else {
                    cVarF.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((f) getChildAt(i8).getLayoutParams()).m();
        }
        this.f10310D = null;
        this.f10307A = false;
    }

    private static int L(int i7) {
        if (i7 == 0) {
            return 17;
        }
        return i7;
    }

    private static int M(int i7) {
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        return (i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0 ? i7 | 48 : i7;
    }

    private static int N(int i7) {
        if (i7 == 0) {
            return 8388661;
        }
        return i7;
    }

    private void O(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        int i8 = fVar.f10338i;
        if (i8 != i7) {
            Z.X(view, i7 - i8);
            fVar.f10338i = i7;
        }
    }

    private void P(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        int i8 = fVar.f10339j;
        if (i8 != i7) {
            Z.Y(view, i7 - i8);
            fVar.f10339j = i7;
        }
    }

    private void R() {
        if (!Z.w(this)) {
            Z.B0(this, null);
            return;
        }
        if (this.f10318L == null) {
            this.f10318L = new a();
        }
        Z.B0(this, this.f10318L);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rectB = f10306R.b();
        return rectB == null ? new Rect() : rectB;
    }

    private static int c(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
    }

    private void d(f fVar, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i7 + iMax, i8 + iMax2);
    }

    private WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat) {
        c cVarF;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (Z.w(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                windowInsetsCompat = cVarF.f(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    private void p(View view, int i7, Rect rect, Rect rect2, f fVar, int i8, int i9) {
        int iB = C1640s.b(L(fVar.f10332c), i7);
        int iB2 = C1640s.b(M(fVar.f10333d), i7);
        int i10 = iB & 7;
        int i11 = iB & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i12 = iB2 & 7;
        int i13 = iB2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int iWidth = i12 != 1 ? i12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i13 != 16 ? i13 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i10 == 1) {
            iWidth -= i8 / 2;
        } else if (i10 != 5) {
            iWidth -= i8;
        }
        if (i11 == 16) {
            iHeight -= i9 / 2;
        } else if (i11 != 80) {
            iHeight -= i9;
        }
        rect2.set(iWidth, iHeight, i8 + iWidth, i9 + iHeight);
    }

    private int q(int i7) {
        int[] iArr = this.f10309C;
        if (iArr == null) {
            Log.e("CoordinatorLayout", dHkZSUxHu.qlcFDYAWncBkVvM + this + PLHvHoayk.FRFsPGrdJY + i7);
            return 0;
        }
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i7 + " out of range for " + this);
        return 0;
    }

    private void t(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        Comparator<View> comparator = f10305Q;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean u(View view) {
        return this.f10321e.j(view);
    }

    private void w(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f10314H != null && Z.w(this) && !Z.w(view)) {
            rectA.left += this.f10314H.getSystemWindowInsetLeft();
            rectA.top += this.f10314H.getSystemWindowInsetTop();
            rectA.right -= this.f10314H.getSystemWindowInsetRight();
            rectA.bottom -= this.f10314H.getSystemWindowInsetBottom();
        }
        Rect rectA2 = a();
        C1640s.a(M(fVar.f10332c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i7);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        I(rectA);
        I(rectA2);
    }

    private void x(View view, View view2, int i7) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            n(view2, rectA);
            o(view, i7, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            I(rectA);
            I(rectA2);
        }
    }

    private void y(View view, int i7, int i8) {
        f fVar = (f) view.getLayoutParams();
        int iB = C1640s.b(N(fVar.f10332c), i8);
        int i9 = iB & 7;
        int i10 = iB & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i8 == 1) {
            i7 = width - i7;
        }
        int iQ = q(i7) - measuredWidth;
        if (i9 == 1) {
            iQ += measuredWidth / 2;
        } else if (i9 == 5) {
            iQ += measuredWidth;
        }
        int i11 = i10 != 16 ? i10 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iQ, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void z(View view, Rect rect, int i7) {
        boolean z7;
        boolean z8;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        if (Z.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            I(rectA2);
            if (rectA.isEmpty()) {
                I(rectA);
                return;
            }
            int iB = C1640s.b(fVar.f10337h, i7);
            boolean z9 = true;
            if ((iB & 48) != 48 || (i12 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f10339j) >= (i13 = rect.top)) {
                z7 = false;
            } else {
                P(view, i13 - i12);
                z7 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f10339j) < (i11 = rect.bottom)) {
                P(view, height - i11);
                z7 = true;
            }
            if (!z7) {
                P(view, 0);
            }
            if ((iB & 3) != 3 || (i9 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f10338i) >= (i10 = rect.left)) {
                z8 = false;
            } else {
                O(view, i10 - i9);
                z8 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f10338i) >= (i8 = rect.right)) {
                z9 = z8;
            } else {
                O(view, width - i8);
            }
            if (!z9) {
                O(view, 0);
            }
            I(rectA);
        }
    }

    void A(View view, int i7) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f10340k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            n(fVar.f10340k, rectA);
            k(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            p(view, i7, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z7 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i8 = rectA3.left - rectA2.left;
            int i9 = rectA3.top - rectA2.top;
            if (i8 != 0) {
                Z.X(view, i8);
            }
            if (i9 != 0) {
                Z.Y(view, i9);
            }
            if (z7 && (cVarF = fVar.f()) != null) {
                cVarF.h(this, view, fVar.f10340k);
            }
            I(rectA);
            I(rectA2);
            I(rectA3);
        }
    }

    final void B(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.B(int):void");
    }

    public void C(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f10340k;
        if (view2 != null) {
            x(view, view2, i7);
            return;
        }
        int i8 = fVar.f10334e;
        if (i8 >= 0) {
            y(view, i8, i7);
        } else {
            w(view, i7);
        }
    }

    public void D(View view, int i7, int i8, int i9, int i10) {
        measureChildWithMargins(view, i7, i8, i9, i10);
    }

    void H(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void J() {
        if (this.f10308B && this.f10312F != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f10312F);
        }
        this.f10313G = false;
    }

    final WindowInsetsCompat Q(WindowInsetsCompat windowInsetsCompat) {
        if (C2985b.a(this.f10314H, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f10314H = windowInsetsCompat;
        boolean z7 = false;
        boolean z8 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.f10315I = z8;
        if (!z8 && getBackground() == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        WindowInsetsCompat windowInsetsCompatE = e(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatE;
    }

    void b() {
        if (this.f10308B) {
            if (this.f10312F == null) {
                this.f10312F = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f10312F);
        }
        this.f10313G = true;
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f10330a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f10324w == null) {
                    this.f10324w = new Paint();
                }
                this.f10324w.setColor(fVar.f10330a.c(this, view));
                this.f10324w.setAlpha(c(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f10324w);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10316J;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(View view) {
        List listG = this.f10321e.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < listG.size(); i7++) {
            View view2 = (View) listG.get(i7);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (u(getChildAt(i7))) {
                z7 = true;
                break;
            }
            i7++;
        }
        if (z7 != this.f10313G) {
            if (z7) {
                b();
            } else {
                J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        G();
        return Collections.unmodifiableList(this.f10320d);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f10314H;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f10319M.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f10316J;
    }

    @Override
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void k(View view, boolean z7, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z7) {
            n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> l(View view) {
        List<View> listH = this.f10321e.h(view);
        this.f10323v.clear();
        if (listH != null) {
            this.f10323v.addAll(listH);
        }
        return this.f10323v;
    }

    public List<View> m(View view) {
        List listG = this.f10321e.g(view);
        this.f10323v.clear();
        if (listG != null) {
            this.f10323v.addAll(listG);
        }
        return this.f10323v;
    }

    void n(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    void o(View view, int i7, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        p(view, i7, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        K(false);
        if (this.f10313G) {
            if (this.f10312F == null) {
                this.f10312F = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f10312F);
        }
        if (this.f10314H == null && Z.w(this)) {
            Z.k0(this);
        }
        this.f10308B = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(false);
        if (this.f10313G && this.f10312F != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f10312F);
        }
        View view = this.f10311E;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f10308B = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f10315I || this.f10316J == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f10314H;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f10316J.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f10316J.draw(canvas);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K(true);
        }
        boolean zF = F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            K(true);
        }
        return zF;
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        c cVarF;
        int iZ = Z.z(this);
        int size = this.f10320d.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f10320d.get(i11);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.l(this, view, iZ))) {
                C(view, iZ);
            }
        }
    }

    @Override
    protected void onMeasure(int r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        c cVarF;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zN |= cVarF.n(this, childAt, view, f7, f8, z7);
                }
            }
        }
        if (zN) {
            B(1);
        }
        return zN;
    }

    @Override
    public boolean onNestedPreFling(View view, float f7, float f8) {
        c cVarF;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zO |= cVarF.o(this, childAt, view, f7, f8);
                }
            }
        }
        return zO;
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i7, i8, i9, i10, 0);
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f10327d;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            c cVarF = s(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVarF.x(this, childAt, parcelable2);
            }
        }
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableY = cVarF.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        savedState.f10327d = sparseArray;
        return savedState;
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void r(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.w(this, view, rect, z7)) {
            return super.requestChildRectangleOnScreen(view, rect, z7);
        }
        return true;
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        super.requestDisallowInterceptTouchEvent(z7);
        if (!z7 || this.f10307A) {
            return;
        }
        K(false);
        this.f10307A = true;
    }

    f s(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f10331b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f10331b = true;
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e7) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                    }
                }
                fVar.f10331b = true;
            }
        }
        return fVar;
    }

    @Override
    public void setFitsSystemWindows(boolean z7) {
        super.setFitsSystemWindows(z7);
        R();
    }

    @Override
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f10317K = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f10316J;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f10316J = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f10316J.setState(getDrawableState());
                }
                C2731a.m(this.f10316J, Z.z(this));
                this.f10316J.setVisible(getVisibility() == 0, false);
                this.f10316J.setCallback(this);
            }
            Z.e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        setStatusBarBackground(i7 != 0 ? androidx.core.content.a.e(getContext(), i7) : null);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f10316J;
        if (drawable == null || drawable.isVisible() == z7) {
            return;
        }
        this.f10316J.setVisible(z7, false);
    }

    public boolean v(View view, int i7, int i8) {
        Rect rectA = a();
        n(view, rectA);
        try {
            return rectA.contains(i7, i8);
        } finally {
            I(rectA);
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10316J;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10320d = new ArrayList();
        this.f10321e = new androidx.coordinatorlayout.widget.b<>();
        this.f10322i = new ArrayList();
        this.f10323v = new ArrayList();
        this.f10325y = new int[2];
        this.f10326z = new int[2];
        this.f10319M = new H(this);
        TypedArray typedArrayObtainStyledAttributes = i7 == 0 ? context.obtainStyledAttributes(attributeSet, C2624c.f22228b, 0, C2623b.f22226a) : context.obtainStyledAttributes(attributeSet, C2624c.f22228b, i7, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i7 == 0) {
                saveAttributeDataForStyleable(context, C2624c.f22228b, attributeSet, typedArrayObtainStyledAttributes, 0, C2623b.f22226a);
            } else {
                saveAttributeDataForStyleable(context, C2624c.f22228b, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2624c.f22229c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f10309C = resources.getIntArray(resourceId);
            float f7 = resources.getDisplayMetrics().density;
            int length = this.f10309C.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.f10309C[i8] = (int) (r12[i8] * f7);
            }
        }
        this.f10316J = typedArrayObtainStyledAttributes.getDrawable(C2624c.f22230d);
        typedArrayObtainStyledAttributes.recycle();
        R();
        super.setOnHierarchyChangeListener(new e());
        if (Z.x(this) == 0) {
            Z.x0(this, 1);
        }
    }

    @Override
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        c cVarF;
        int childCount = getChildCount();
        boolean z7 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i9) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f10325y;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.q(this, childAt, view, i7, i8, iArr2, i9);
                    int[] iArr3 = this.f10325y;
                    iMax = i7 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f10325y;
                    iMax2 = i8 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z7 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z7) {
            B(1);
        }
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        onNestedScroll(view, i7, i8, i9, i10, 0, this.f10326z);
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        c cVarF;
        this.f10319M.c(view, view2, i7, i8);
        this.f10311E = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i8) && (cVarF = fVar.f()) != null) {
                cVarF.v(this, childAt, view, view2, i7, i8);
            }
        }
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zA = cVarF.A(this, childAt, view, view2, i7, i8);
                    z7 |= zA;
                    fVar.r(i8, zA);
                } else {
                    fVar.r(i8, false);
                }
            }
        }
        return z7;
    }

    @Override
    public void onStopNestedScroll(View view, int i7) {
        this.f10319M.e(view, i7);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i7)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.C(this, childAt, view, i7);
                }
                fVar.l(i7);
                fVar.k();
            }
        }
        this.f10311E = null;
    }

    @Override
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        c cVarF;
        boolean z7;
        int iMin;
        int childCount = getChildCount();
        boolean z8 = false;
        int iMax = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i11) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f10325y;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.t(this, childAt, view, i7, i8, i9, i10, i11, iArr2);
                    int[] iArr3 = this.f10325y;
                    iMax = i9 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i10 > 0) {
                        z7 = true;
                        iMin = Math.max(i12, this.f10325y[1]);
                    } else {
                        z7 = true;
                        iMin = Math.min(i12, this.f10325y[1]);
                    }
                    i12 = iMin;
                    z8 = z7;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i12;
        if (z8) {
            B(1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        SparseArray<Parcelable> f10327d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i7 = parcel.readInt();
            int[] iArr = new int[i7];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f10327d = new SparseArray<>(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                this.f10327d.append(iArr[i8], parcelableArray[i8]);
            }
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            SparseArray<Parcelable> sparseArray = this.f10327d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = this.f10327d.keyAt(i8);
                parcelableArr[i8] = this.f10327d.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        c f10330a;

        boolean f10331b;

        public int f10332c;

        public int f10333d;

        public int f10334e;

        int f10335f;

        public int f10336g;

        public int f10337h;

        int f10338i;

        int f10339j;

        View f10340k;

        View f10341l;

        private boolean f10342m;

        private boolean f10343n;

        private boolean f10344o;

        private boolean f10345p;

        final Rect f10346q;

        Object f10347r;

        public f(int i7, int i8) {
            super(i7, i8);
            this.f10331b = false;
            this.f10332c = 0;
            this.f10333d = 0;
            this.f10334e = -1;
            this.f10335f = -1;
            this.f10336g = 0;
            this.f10337h = 0;
            this.f10346q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f10335f);
            this.f10340k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f10341l = null;
                    this.f10340k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f10335f) + JmBUOGMwkkxg.ZWafPykmaXKK + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f10341l = null;
                this.f10340k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException(QXojhh.dnAndQXslY);
                    }
                    this.f10341l = null;
                    this.f10340k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f10341l = viewFindViewById;
        }

        private boolean s(View view, int i7) {
            int iB = C1640s.b(((f) view.getLayoutParams()).f10336g, i7);
            return iB != 0 && (C1640s.b(this.f10337h, i7) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f10340k.getId() != this.f10335f) {
                return false;
            }
            View view2 = this.f10340k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f10341l = null;
                    this.f10340k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f10341l = view2;
            return true;
        }

        boolean a() {
            return this.f10340k == null && this.f10335f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f10341l || s(view2, Z.z(coordinatorLayout)) || ((cVar = this.f10330a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f10330a == null) {
                this.f10342m = false;
            }
            return this.f10342m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f10335f == -1) {
                this.f10341l = null;
                this.f10340k = null;
                return null;
            }
            if (this.f10340k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f10340k;
        }

        public int e() {
            return this.f10335f;
        }

        public c f() {
            return this.f10330a;
        }

        boolean g() {
            return this.f10345p;
        }

        Rect h() {
            return this.f10346q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z7 = this.f10342m;
            if (z7) {
                return true;
            }
            c cVar = this.f10330a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z7;
            this.f10342m = zA;
            return zA;
        }

        boolean j(int i7) {
            if (i7 == 0) {
                return this.f10343n;
            }
            if (i7 != 1) {
                return false;
            }
            return this.f10344o;
        }

        void k() {
            this.f10345p = false;
        }

        void l(int i7) {
            r(i7, false);
        }

        void m() {
            this.f10342m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f10330a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f10330a = cVar;
                this.f10347r = null;
                this.f10331b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z7) {
            this.f10345p = z7;
        }

        void q(Rect rect) {
            this.f10346q.set(rect);
        }

        void r(int i7, boolean z7) {
            if (i7 == 0) {
                this.f10343n = z7;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f10344o = z7;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10331b = false;
            this.f10332c = 0;
            this.f10333d = 0;
            this.f10334e = -1;
            this.f10335f = -1;
            this.f10336g = 0;
            this.f10337h = 0;
            this.f10346q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2624c.f22231e);
            this.f10332c = typedArrayObtainStyledAttributes.getInteger(C2624c.f22232f, 0);
            this.f10335f = typedArrayObtainStyledAttributes.getResourceId(C2624c.f22233g, -1);
            this.f10333d = typedArrayObtainStyledAttributes.getInteger(C2624c.f22234h, 0);
            this.f10334e = typedArrayObtainStyledAttributes.getInteger(C2624c.f22238l, -1);
            this.f10336g = typedArrayObtainStyledAttributes.getInt(C2624c.f22237k, 0);
            this.f10337h = typedArrayObtainStyledAttributes.getInt(C2624c.f22236j, 0);
            int i7 = C2624c.f22235i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i7);
            this.f10331b = zHasValue;
            if (zHasValue) {
                this.f10330a = CoordinatorLayout.E(context, attributeSet, typedArrayObtainStyledAttributes.getString(i7));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f10330a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f10331b = false;
            this.f10332c = 0;
            this.f10333d = 0;
            this.f10334e = -1;
            this.f10335f = -1;
            this.f10336g = 0;
            this.f10337h = 0;
            this.f10346q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10331b = false;
            this.f10332c = 0;
            this.f10333d = 0;
            this.f10334e = -1;
            this.f10335f = -1;
            this.f10336g = 0;
            this.f10337h = 0;
            this.f10346q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10331b = false;
            this.f10332c = 0;
            this.f10333d = 0;
            this.f10334e = -1;
            this.f10335f = -1;
            this.f10336g = 0;
            this.f10337h = 0;
            this.f10346q = new Rect();
        }
    }
}
