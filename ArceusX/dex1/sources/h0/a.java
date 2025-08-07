package H0;

import H0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import g0.l;
import java.util.ArrayList;
import java.util.List;
import y0.C3019t;
import y0.C3020u;
import y0.C3021v;

public abstract class a extends C1605a {

    private static final Rect f1526n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    private static final b.a<C3019t> f1527o = new C0021a();

    private static final b.InterfaceC0022b<l<C3019t>, C3019t> f1528p = new b();

    private final AccessibilityManager f1533h;

    private final View f1534i;

    private c f1535j;

    private final Rect f1529d = new Rect();

    private final Rect f1530e = new Rect();

    private final Rect f1531f = new Rect();

    private final int[] f1532g = new int[2];

    int f1536k = Integer.MIN_VALUE;

    int f1537l = Integer.MIN_VALUE;

    private int f1538m = Integer.MIN_VALUE;

    class C0021a implements b.a<C3019t> {
        C0021a() {
        }

        @Override
        public void a(C3019t c3019t, Rect rect) {
            c3019t.j(rect);
        }
    }

    class b implements b.InterfaceC0022b<l<C3019t>, C3019t> {
        b() {
        }

        @Override
        public C3019t a(l<C3019t> lVar, int i7) {
            return lVar.j(i7);
        }

        @Override
        public int b(l<C3019t> lVar) {
            return lVar.i();
        }
    }

    private class c extends C3020u {
        c() {
        }

        @Override
        public C3019t b(int i7) {
            return C3019t.U(a.this.H(i7));
        }

        @Override
        public C3019t d(int i7) {
            int i8 = i7 == 2 ? a.this.f1536k : a.this.f1537l;
            if (i8 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i8);
        }

        @Override
        public boolean f(int i7, int i8, Bundle bundle) {
            return a.this.P(i7, i8, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1534i = view;
        this.f1533h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (Z.x(view) == 0) {
            Z.x0(view, 1);
        }
    }

    private static Rect D(View view, int i7, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i7 == 17) {
            rect.set(width, 0, width, height);
        } else if (i7 == 33) {
            rect.set(0, height, width, height);
        } else if (i7 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f1534i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f1534i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i7) {
        if (i7 == 19) {
            return 33;
        }
        if (i7 != 21) {
            return i7 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i7, Rect rect) {
        C3019t c3019t;
        l<C3019t> lVarY = y();
        int i8 = this.f1537l;
        C3019t c3019tD = i8 == Integer.MIN_VALUE ? null : lVarY.d(i8);
        if (i7 == 1 || i7 == 2) {
            c3019t = (C3019t) H0.b.d(lVarY, f1528p, f1527o, c3019tD, i7, Z.z(this.f1534i) == 1, false);
        } else {
            if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i9 = this.f1537l;
            if (i9 != Integer.MIN_VALUE) {
                z(i9, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f1534i, i7, rect2);
            }
            c3019t = (C3019t) H0.b.c(lVarY, f1528p, f1527o, c3019tD, rect2, i7);
        }
        return T(c3019t != null ? lVarY.g(lVarY.e(c3019t)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i7, int i8, Bundle bundle) {
        return i8 != 1 ? i8 != 2 ? i8 != 64 ? i8 != 128 ? J(i7, i8, bundle) : n(i7) : S(i7) : o(i7) : T(i7);
    }

    private boolean R(int i7, Bundle bundle) {
        return Z.c0(this.f1534i, i7, bundle);
    }

    private boolean S(int i7) {
        int i8;
        if (!this.f1533h.isEnabled() || !this.f1533h.isTouchExplorationEnabled() || (i8 = this.f1536k) == i7) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            n(i8);
        }
        this.f1536k = i7;
        this.f1534i.invalidate();
        U(i7, 32768);
        return true;
    }

    private void V(int i7) {
        int i8 = this.f1538m;
        if (i8 == i7) {
            return;
        }
        this.f1538m = i7;
        U(i7, 128);
        U(i8, 256);
    }

    private boolean n(int i7) {
        if (this.f1536k != i7) {
            return false;
        }
        this.f1536k = Integer.MIN_VALUE;
        this.f1534i.invalidate();
        U(i7, 65536);
        return true;
    }

    private boolean p() {
        int i7 = this.f1537l;
        return i7 != Integer.MIN_VALUE && J(i7, 16, null);
    }

    private AccessibilityEvent q(int i7, int i8) {
        return i7 != -1 ? r(i7, i8) : s(i8);
    }

    private AccessibilityEvent r(int i7, int i8) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i8);
        C3019t c3019tH = H(i7);
        accessibilityEventObtain.getText().add(c3019tH.w());
        accessibilityEventObtain.setContentDescription(c3019tH.q());
        accessibilityEventObtain.setScrollable(c3019tH.N());
        accessibilityEventObtain.setPassword(c3019tH.M());
        accessibilityEventObtain.setEnabled(c3019tH.G());
        accessibilityEventObtain.setChecked(c3019tH.D());
        L(i7, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c3019tH.n());
        C3021v.c(accessibilityEventObtain, this.f1534i, i7);
        accessibilityEventObtain.setPackageName(this.f1534i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i7) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i7);
        this.f1534i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private C3019t t(int i7) {
        C3019t c3019tS = C3019t.S();
        c3019tS.k0(true);
        c3019tS.m0(true);
        c3019tS.e0("android.view.View");
        Rect rect = f1526n;
        c3019tS.Z(rect);
        c3019tS.a0(rect);
        c3019tS.u0(this.f1534i);
        N(i7, c3019tS);
        if (c3019tS.w() == null && c3019tS.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c3019tS.j(this.f1530e);
        if (this.f1530e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iH = c3019tS.h();
        if ((iH & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iH & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c3019tS.s0(this.f1534i.getContext().getPackageName());
        c3019tS.z0(this.f1534i, i7);
        if (this.f1536k == i7) {
            c3019tS.X(true);
            c3019tS.a(128);
        } else {
            c3019tS.X(false);
            c3019tS.a(64);
        }
        boolean z7 = this.f1537l == i7;
        if (z7) {
            c3019tS.a(2);
        } else if (c3019tS.H()) {
            c3019tS.a(1);
        }
        c3019tS.n0(z7);
        this.f1534i.getLocationOnScreen(this.f1532g);
        c3019tS.k(this.f1529d);
        if (this.f1529d.equals(rect)) {
            c3019tS.j(this.f1529d);
            if (c3019tS.f24361b != -1) {
                C3019t c3019tS2 = C3019t.S();
                for (int i8 = c3019tS.f24361b; i8 != -1; i8 = c3019tS2.f24361b) {
                    c3019tS2.v0(this.f1534i, -1);
                    c3019tS2.Z(f1526n);
                    N(i8, c3019tS2);
                    c3019tS2.j(this.f1530e);
                    Rect rect2 = this.f1529d;
                    Rect rect3 = this.f1530e;
                    rect2.offset(rect3.left, rect3.top);
                }
                c3019tS2.W();
            }
            this.f1529d.offset(this.f1532g[0] - this.f1534i.getScrollX(), this.f1532g[1] - this.f1534i.getScrollY());
        }
        if (this.f1534i.getLocalVisibleRect(this.f1531f)) {
            this.f1531f.offset(this.f1532g[0] - this.f1534i.getScrollX(), this.f1532g[1] - this.f1534i.getScrollY());
            if (this.f1529d.intersect(this.f1531f)) {
                c3019tS.a0(this.f1529d);
                if (E(this.f1529d)) {
                    c3019tS.D0(true);
                }
            }
        }
        return c3019tS;
    }

    private C3019t u() {
        C3019t c3019tT = C3019t.T(this.f1534i);
        Z.a0(this.f1534i, c3019tT);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (c3019tT.m() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            c3019tT.c(this.f1534i, ((Integer) arrayList.get(i7)).intValue());
        }
        return c3019tT;
    }

    private l<C3019t> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        l<C3019t> lVar = new l<>();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            lVar.h(arrayList.get(i7).intValue(), t(arrayList.get(i7).intValue()));
        }
        return lVar;
    }

    private void z(int i7, Rect rect) {
        H(i7).j(rect);
    }

    public final int A() {
        return this.f1537l;
    }

    protected abstract int B(float f7, float f8);

    protected abstract void C(List<Integer> list);

    C3019t H(int i7) {
        return i7 == -1 ? u() : t(i7);
    }

    public final void I(boolean z7, int i7, Rect rect) {
        int i8 = this.f1537l;
        if (i8 != Integer.MIN_VALUE) {
            o(i8);
        }
        if (z7) {
            G(i7, rect);
        }
    }

    protected abstract boolean J(int i7, int i8, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i7, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(C3019t c3019t);

    protected abstract void N(int i7, C3019t c3019t);

    protected abstract void O(int i7, boolean z7);

    boolean P(int i7, int i8, Bundle bundle) {
        return i7 != -1 ? Q(i7, i8, bundle) : R(i8, bundle);
    }

    public final boolean T(int i7) {
        int i8;
        if ((!this.f1534i.isFocused() && !this.f1534i.requestFocus()) || (i8 = this.f1537l) == i7) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            o(i8);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1537l = i7;
        O(i7, true);
        U(i7, 8);
        return true;
    }

    public final boolean U(int i7, int i8) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.f1533h.isEnabled() || (parent = this.f1534i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f1534i, q(i7, i8));
    }

    @Override
    public C3020u b(View view) {
        if (this.f1535j == null) {
            this.f1535j = new c();
        }
        return this.f1535j;
    }

    @Override
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override
    public void g(View view, C3019t c3019t) {
        super.g(view, c3019t);
        M(c3019t);
    }

    public final boolean o(int i7) {
        if (this.f1537l != i7) {
            return false;
        }
        this.f1537l = Integer.MIN_VALUE;
        O(i7, false);
        U(i7, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f1533h.isEnabled() || !this.f1533h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f1538m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i7 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z7 = false;
                    while (i7 < repeatCount && G(iF, null)) {
                        i7++;
                        z7 = true;
                    }
                    return z7;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f1536k;
    }
}
