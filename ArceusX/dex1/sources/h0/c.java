package H0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.Z;
import java.util.Arrays;

public class c {

    private static final Interpolator f1544x = new a();

    private int f1545a;

    private int f1546b;

    private float[] f1548d;

    private float[] f1549e;

    private float[] f1550f;

    private float[] f1551g;

    private int[] f1552h;

    private int[] f1553i;

    private int[] f1554j;

    private int f1555k;

    private VelocityTracker f1556l;

    private float f1557m;

    private float f1558n;

    private int f1559o;

    private final int f1560p;

    private int f1561q;

    private OverScroller f1562r;

    private final AbstractC0023c f1563s;

    private View f1564t;

    private boolean f1565u;

    private final ViewGroup f1566v;

    private int f1547c = -1;

    private final Runnable f1567w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            c.this.E(0);
        }
    }

    public static abstract class AbstractC0023c {
        public abstract int a(View view, int i7, int i8);

        public abstract int b(View view, int i7, int i8);

        public int c(int i7) {
            return i7;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i7, int i8) {
        }

        public boolean g(int i7) {
            return false;
        }

        public void h(int i7, int i8) {
        }

        public void i(View view, int i7) {
        }

        public abstract void j(int i7);

        public abstract void k(View view, int i7, int i8, int i9, int i10);

        public abstract void l(View view, float f7, float f8);

        public abstract boolean m(View view, int i7);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0023c abstractC0023c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0023c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1566v = viewGroup;
        this.f1563s = abstractC0023c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1560p = i7;
        this.f1559o = i7;
        this.f1546b = viewConfiguration.getScaledTouchSlop();
        this.f1557m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1558n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1562r = new OverScroller(context, f1544x);
    }

    private void A() {
        this.f1556l.computeCurrentVelocity(1000, this.f1557m);
        n(e(this.f1556l.getXVelocity(this.f1547c), this.f1558n, this.f1557m), e(this.f1556l.getYVelocity(this.f1547c), this.f1558n, this.f1557m));
    }

    private void B(float f7, float f8, int i7) {
        boolean zC = c(f7, f8, i7, 1);
        boolean z7 = zC;
        if (c(f8, f7, i7, 4)) {
            z7 = (zC ? 1 : 0) | 4;
        }
        boolean z8 = z7;
        if (c(f7, f8, i7, 2)) {
            z8 = (z7 ? 1 : 0) | 2;
        }
        ?? r02 = z8;
        if (c(f8, f7, i7, 8)) {
            r02 = (z8 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f1553i;
            iArr[i7] = iArr[i7] | r02;
            this.f1563s.f(r02, i7);
        }
    }

    private void C(float f7, float f8, int i7) {
        q(i7);
        float[] fArr = this.f1548d;
        this.f1550f[i7] = f7;
        fArr[i7] = f7;
        float[] fArr2 = this.f1549e;
        this.f1551g[i7] = f8;
        fArr2[i7] = f8;
        this.f1552h[i7] = t((int) f7, (int) f8);
        this.f1555k |= 1 << i7;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (x(pointerId)) {
                float x7 = motionEvent.getX(i7);
                float y7 = motionEvent.getY(i7);
                this.f1550f[pointerId] = x7;
                this.f1551g[pointerId] = y7;
            }
        }
    }

    private boolean c(float f7, float f8, int i7, int i8) {
        float fAbs = Math.abs(f7);
        float fAbs2 = Math.abs(f8);
        if ((this.f1552h[i7] & i8) != i8 || (this.f1561q & i8) == 0 || (this.f1554j[i7] & i8) == i8 || (this.f1553i[i7] & i8) == i8) {
            return false;
        }
        int i9 = this.f1546b;
        if (fAbs <= i9 && fAbs2 <= i9) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f1563s.g(i8)) {
            return (this.f1553i[i7] & i8) == 0 && fAbs > ((float) this.f1546b);
        }
        int[] iArr = this.f1554j;
        iArr[i7] = iArr[i7] | i8;
        return false;
    }

    private boolean d(View view, float f7, float f8) {
        if (view == null) {
            return false;
        }
        boolean z7 = this.f1563s.d(view) > 0;
        boolean z8 = this.f1563s.e(view) > 0;
        if (!z7 || !z8) {
            return z7 ? Math.abs(f7) > ((float) this.f1546b) : z8 && Math.abs(f8) > ((float) this.f1546b);
        }
        float f9 = (f7 * f7) + (f8 * f8);
        int i7 = this.f1546b;
        return f9 > ((float) (i7 * i7));
    }

    private float e(float f7, float f8, float f9) {
        float fAbs = Math.abs(f7);
        if (fAbs < f8) {
            return 0.0f;
        }
        return fAbs > f9 ? f7 > 0.0f ? f9 : -f9 : f7;
    }

    private int f(int i7, int i8, int i9) {
        int iAbs = Math.abs(i7);
        if (iAbs < i8) {
            return 0;
        }
        return iAbs > i9 ? i7 > 0 ? i9 : -i9 : i7;
    }

    private void g() {
        float[] fArr = this.f1548d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f1549e, 0.0f);
        Arrays.fill(this.f1550f, 0.0f);
        Arrays.fill(this.f1551g, 0.0f);
        Arrays.fill(this.f1552h, 0);
        Arrays.fill(this.f1553i, 0);
        Arrays.fill(this.f1554j, 0);
        this.f1555k = 0;
    }

    private void h(int i7) {
        if (this.f1548d == null || !w(i7)) {
            return;
        }
        this.f1548d[i7] = 0.0f;
        this.f1549e[i7] = 0.0f;
        this.f1550f[i7] = 0.0f;
        this.f1551g[i7] = 0.0f;
        this.f1552h[i7] = 0;
        this.f1553i[i7] = 0;
        this.f1554j[i7] = 0;
        this.f1555k = (~(1 << i7)) & this.f1555k;
    }

    private int i(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        int width = this.f1566v.getWidth();
        float f7 = width / 2;
        float fO = f7 + (o(Math.min(1.0f, Math.abs(i7) / width)) * f7);
        int iAbs = Math.abs(i8);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int iF = f(i9, (int) this.f1558n, (int) this.f1557m);
        int iF2 = f(i10, (int) this.f1558n, (int) this.f1557m);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i8);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i11 = iAbs3 + iAbs4;
        int i12 = iAbs + iAbs2;
        if (iF != 0) {
            f7 = iAbs3;
            f8 = i11;
        } else {
            f7 = iAbs;
            f8 = i12;
        }
        float f11 = f7 / f8;
        if (iF2 != 0) {
            f9 = iAbs4;
            f10 = i11;
        } else {
            f9 = iAbs2;
            f10 = i12;
        }
        return (int) ((i(i7, iF, this.f1563s.d(view)) * f11) + (i(i8, iF2, this.f1563s.e(view)) * (f9 / f10)));
    }

    public static c l(ViewGroup viewGroup, float f7, AbstractC0023c abstractC0023c) {
        c cVarM = m(viewGroup, abstractC0023c);
        cVarM.f1546b = (int) (cVarM.f1546b * (1.0f / f7));
        return cVarM;
    }

    public static c m(ViewGroup viewGroup, AbstractC0023c abstractC0023c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0023c);
    }

    private void n(float f7, float f8) {
        this.f1565u = true;
        this.f1563s.l(this.f1564t, f7, f8);
        this.f1565u = false;
        if (this.f1545a == 1) {
            E(0);
        }
    }

    private float o(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    private void p(int i7, int i8, int i9, int i10) {
        int left = this.f1564t.getLeft();
        int top = this.f1564t.getTop();
        if (i9 != 0) {
            i7 = this.f1563s.a(this.f1564t, i7, i9);
            Z.X(this.f1564t, i7 - left);
        }
        int i11 = i7;
        if (i10 != 0) {
            i8 = this.f1563s.b(this.f1564t, i8, i10);
            Z.Y(this.f1564t, i8 - top);
        }
        int i12 = i8;
        if (i9 == 0 && i10 == 0) {
            return;
        }
        this.f1563s.k(this.f1564t, i11, i12, i11 - left, i12 - top);
    }

    private void q(int i7) {
        float[] fArr = this.f1548d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1549e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1550f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1551g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1552h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1553i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1554j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1548d = fArr2;
            this.f1549e = fArr3;
            this.f1550f = fArr4;
            this.f1551g = fArr5;
            this.f1552h = iArr;
            this.f1553i = iArr2;
            this.f1554j = iArr3;
        }
    }

    private boolean s(int i7, int i8, int i9, int i10) {
        int left = this.f1564t.getLeft();
        int top = this.f1564t.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        if (i11 == 0 && i12 == 0) {
            this.f1562r.abortAnimation();
            E(0);
            return false;
        }
        this.f1562r.startScroll(left, top, i11, i12, j(this.f1564t, i11, i12, i9, i10));
        E(2);
        return true;
    }

    private int t(int i7, int i8) {
        int i9 = i7 < this.f1566v.getLeft() + this.f1559o ? 1 : 0;
        if (i8 < this.f1566v.getTop() + this.f1559o) {
            i9 |= 4;
        }
        if (i7 > this.f1566v.getRight() - this.f1559o) {
            i9 |= 2;
        }
        return i8 > this.f1566v.getBottom() - this.f1559o ? i9 | 8 : i9;
    }

    private boolean x(int i7) {
        if (w(i7)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i7) {
        this.f1566v.removeCallbacks(this.f1567w);
        if (this.f1545a != i7) {
            this.f1545a = i7;
            this.f1563s.j(i7);
            if (this.f1545a == 0) {
                this.f1564t = null;
            }
        }
    }

    public boolean F(int i7, int i8) {
        if (this.f1565u) {
            return s(i7, i8, (int) this.f1556l.getXVelocity(this.f1547c), (int) this.f1556l.getYVelocity(this.f1547c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean G(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: H0.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i7, int i8) {
        this.f1564t = view;
        this.f1547c = -1;
        boolean zS = s(i7, i8, 0, 0);
        if (!zS && this.f1545a == 0 && this.f1564t != null) {
            this.f1564t = null;
        }
        return zS;
    }

    boolean I(View view, int i7) {
        if (view == this.f1564t && this.f1547c == i7) {
            return true;
        }
        if (view == null || !this.f1563s.m(view, i7)) {
            return false;
        }
        this.f1547c = i7;
        b(view, i7);
        return true;
    }

    public void a() {
        this.f1547c = -1;
        g();
        VelocityTracker velocityTracker = this.f1556l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1556l = null;
        }
    }

    public void b(View view, int i7) {
        if (view.getParent() == this.f1566v) {
            this.f1564t = view;
            this.f1547c = i7;
            this.f1563s.i(view, i7);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1566v + ")");
    }

    public boolean k(boolean z7) {
        if (this.f1545a == 2) {
            boolean zComputeScrollOffset = this.f1562r.computeScrollOffset();
            int currX = this.f1562r.getCurrX();
            int currY = this.f1562r.getCurrY();
            int left = currX - this.f1564t.getLeft();
            int top = currY - this.f1564t.getTop();
            if (left != 0) {
                Z.X(this.f1564t, left);
            }
            if (top != 0) {
                Z.Y(this.f1564t, top);
            }
            if (left != 0 || top != 0) {
                this.f1563s.k(this.f1564t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f1562r.getFinalX() && currY == this.f1562r.getFinalY()) {
                this.f1562r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z7) {
                    this.f1566v.post(this.f1567w);
                } else {
                    E(0);
                }
            }
        }
        return this.f1545a == 2;
    }

    public View r(int i7, int i8) {
        for (int childCount = this.f1566v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1566v.getChildAt(this.f1563s.c(childCount));
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f1546b;
    }

    public boolean v(int i7, int i8) {
        return y(this.f1564t, i7, i8);
    }

    public boolean w(int i7) {
        return ((1 << i7) & this.f1555k) != 0;
    }

    public boolean y(View view, int i7, int i8) {
        return view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1556l == null) {
            this.f1556l = VelocityTracker.obtain();
        }
        this.f1556l.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x7, (int) y7);
            C(x7, y7, pointerId);
            I(viewR, pointerId);
            int i9 = this.f1552h[pointerId];
            int i10 = this.f1561q;
            if ((i9 & i10) != 0) {
                this.f1563s.h(i9 & i10, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1545a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1545a == 1) {
                if (x(this.f1547c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1547c);
                    float x8 = motionEvent.getX(iFindPointerIndex);
                    float y8 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f1550f;
                    int i11 = this.f1547c;
                    int i12 = (int) (x8 - fArr[i11]);
                    int i13 = (int) (y8 - this.f1551g[i11]);
                    p(this.f1564t.getLeft() + i12, this.f1564t.getTop() + i13, i12, i13);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i8 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i8);
                if (x(pointerId2)) {
                    float x9 = motionEvent.getX(i8);
                    float y9 = motionEvent.getY(i8);
                    float f7 = x9 - this.f1548d[pointerId2];
                    float f8 = y9 - this.f1549e[pointerId2];
                    B(f7, f8, pointerId2);
                    if (this.f1545a != 1) {
                        View viewR2 = r((int) x9, (int) y9);
                        if (d(viewR2, f7, f8) && I(viewR2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i8++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f1545a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            C(x10, y10, pointerId3);
            if (this.f1545a != 0) {
                if (v((int) x10, (int) y10)) {
                    I(this.f1564t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x10, (int) y10), pointerId3);
                int i14 = this.f1552h[pointerId3];
                int i15 = this.f1561q;
                if ((i14 & i15) != 0) {
                    this.f1563s.h(i14 & i15, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f1545a == 1 && pointerId4 == this.f1547c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i8 >= pointerCount2) {
                    i7 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i8);
                if (pointerId5 != this.f1547c) {
                    View viewR3 = r((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                    View view = this.f1564t;
                    if (viewR3 == view && I(view, pointerId5)) {
                        i7 = this.f1547c;
                        break;
                    }
                }
                i8++;
            }
            if (i7 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}
