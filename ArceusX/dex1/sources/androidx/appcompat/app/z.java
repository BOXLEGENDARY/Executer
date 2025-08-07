package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1620h0;
import androidx.core.view.C1624j0;
import androidx.core.view.InterfaceC1622i0;
import androidx.core.view.InterfaceC1626k0;
import androidx.core.view.Z;
import g.C2447a;
import g.C2452f;
import g.C2456j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class z extends androidx.appcompat.app.a implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    private static final Interpolator f8757E = new AccelerateInterpolator();

    private static final Interpolator f8758F = new DecelerateInterpolator();

    boolean f8759A;

    Context f8763a;

    private Context f8764b;

    private Activity f8765c;

    ActionBarOverlayLayout f8766d;

    ActionBarContainer f8767e;

    DecorToolbar f8768f;

    ActionBarContextView f8769g;

    View f8770h;

    ScrollingTabContainerView f8771i;

    private boolean f8774l;

    d f8775m;

    androidx.appcompat.view.b f8776n;

    b.a f8777o;

    private boolean f8778p;

    private boolean f8780r;

    boolean f8783u;

    boolean f8784v;

    private boolean f8785w;

    androidx.appcompat.view.h f8787y;

    private boolean f8788z;

    private ArrayList<Object> f8772j = new ArrayList<>();

    private int f8773k = -1;

    private ArrayList<a.b> f8779q = new ArrayList<>();

    private int f8781s = 0;

    boolean f8782t = true;

    private boolean f8786x = true;

    final InterfaceC1622i0 f8760B = new a();

    final InterfaceC1622i0 f8761C = new b();

    final InterfaceC1626k0 f8762D = new c();

    class a extends C1624j0 {
        a() {
        }

        @Override
        public void onAnimationEnd(View view) {
            View view2;
            z zVar = z.this;
            if (zVar.f8782t && (view2 = zVar.f8770h) != null) {
                view2.setTranslationY(0.0f);
                z.this.f8767e.setTranslationY(0.0f);
            }
            z.this.f8767e.setVisibility(8);
            z.this.f8767e.setTransitioning(false);
            z zVar2 = z.this;
            zVar2.f8787y = null;
            zVar2.s();
            ActionBarOverlayLayout actionBarOverlayLayout = z.this.f8766d;
            if (actionBarOverlayLayout != null) {
                Z.k0(actionBarOverlayLayout);
            }
        }
    }

    class b extends C1624j0 {
        b() {
        }

        @Override
        public void onAnimationEnd(View view) {
            z zVar = z.this;
            zVar.f8787y = null;
            zVar.f8767e.requestLayout();
        }
    }

    class c implements InterfaceC1626k0 {
        c() {
        }

        @Override
        public void a(View view) {
            ((View) z.this.f8767e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        private final Context f8792i;

        private final androidx.appcompat.view.menu.g f8793v;

        private b.a f8794w;

        private WeakReference<View> f8795y;

        public d(Context context, b.a aVar) {
            this.f8792i = context;
            this.f8794w = aVar;
            androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(context).S(1);
            this.f8793v = gVarS;
            gVarS.R(this);
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f8794w;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f8794w == null) {
                return;
            }
            k();
            z.this.f8769g.showOverflowMenu();
        }

        @Override
        public void c() {
            z zVar = z.this;
            if (zVar.f8775m != this) {
                return;
            }
            if (z.r(zVar.f8783u, zVar.f8784v, false)) {
                this.f8794w.a(this);
            } else {
                z zVar2 = z.this;
                zVar2.f8776n = this;
                zVar2.f8777o = this.f8794w;
            }
            this.f8794w = null;
            z.this.q(false);
            z.this.f8769g.closeMode();
            z zVar3 = z.this;
            zVar3.f8766d.setHideOnContentScrollEnabled(zVar3.f8759A);
            z.this.f8775m = null;
        }

        @Override
        public View d() {
            WeakReference<View> weakReference = this.f8795y;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override
        public Menu e() {
            return this.f8793v;
        }

        @Override
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f8792i);
        }

        @Override
        public CharSequence g() {
            return z.this.f8769g.getSubtitle();
        }

        @Override
        public CharSequence i() {
            return z.this.f8769g.getTitle();
        }

        @Override
        public void k() {
            if (z.this.f8775m != this) {
                return;
            }
            this.f8793v.d0();
            try {
                this.f8794w.c(this, this.f8793v);
            } finally {
                this.f8793v.c0();
            }
        }

        @Override
        public boolean l() {
            return z.this.f8769g.isTitleOptional();
        }

        @Override
        public void m(View view) {
            z.this.f8769g.setCustomView(view);
            this.f8795y = new WeakReference<>(view);
        }

        @Override
        public void n(int i7) {
            o(z.this.f8763a.getResources().getString(i7));
        }

        @Override
        public void o(CharSequence charSequence) {
            z.this.f8769g.setSubtitle(charSequence);
        }

        @Override
        public void q(int i7) {
            r(z.this.f8763a.getResources().getString(i7));
        }

        @Override
        public void r(CharSequence charSequence) {
            z.this.f8769g.setTitle(charSequence);
        }

        @Override
        public void s(boolean z7) {
            super.s(z7);
            z.this.f8769g.setTitleOptional(z7);
        }

        public boolean t() {
            this.f8793v.d0();
            try {
                return this.f8794w.b(this, this.f8793v);
            } finally {
                this.f8793v.c0();
            }
        }
    }

    public z(Activity activity, boolean z7) {
        this.f8765c = activity;
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (z7) {
            return;
        }
        this.f8770h = decorView.findViewById(R.id.content);
    }

    private void C(boolean z7) {
        this.f8780r = z7;
        if (z7) {
            this.f8767e.setTabContainer(null);
            this.f8768f.setEmbeddedTabView(this.f8771i);
        } else {
            this.f8768f.setEmbeddedTabView(null);
            this.f8767e.setTabContainer(this.f8771i);
        }
        boolean z8 = w() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f8771i;
        if (scrollingTabContainerView != null) {
            if (z8) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8766d;
                if (actionBarOverlayLayout != null) {
                    Z.k0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f8768f.setCollapsible(!this.f8780r && z8);
        this.f8766d.setHasNonEmbeddedTabs(!this.f8780r && z8);
    }

    private boolean F() {
        return Z.R(this.f8767e);
    }

    private void G() {
        if (this.f8785w) {
            return;
        }
        this.f8785w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8766d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        H(false);
    }

    private void H(boolean z7) {
        if (r(this.f8783u, this.f8784v, this.f8785w)) {
            if (this.f8786x) {
                return;
            }
            this.f8786x = true;
            u(z7);
            return;
        }
        if (this.f8786x) {
            this.f8786x = false;
            t(z7);
        }
    }

    static boolean r(boolean z7, boolean z8, boolean z9) {
        if (z9) {
            return true;
        }
        return (z7 || z8) ? false : true;
    }

    private DecorToolbar v(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void x() {
        if (this.f8785w) {
            this.f8785w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f8766d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            H(false);
        }
    }

    private void y(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2452f.f20667q);
        this.f8766d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f8768f = v(view.findViewById(C2452f.f20651a));
        this.f8769g = (ActionBarContextView) view.findViewById(C2452f.f20656f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2452f.f20653c);
        this.f8767e = actionBarContainer;
        DecorToolbar decorToolbar = this.f8768f;
        if (decorToolbar == null || this.f8769g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f8763a = decorToolbar.getContext();
        boolean z7 = (this.f8768f.getDisplayOptions() & 4) != 0;
        if (z7) {
            this.f8774l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f8763a);
        E(aVarB.a() || z7);
        C(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f8763a.obtainStyledAttributes(null, C2456j.f20794a, C2447a.f20541c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C2456j.f20838k, false)) {
            D(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20828i, 0);
        if (dimensionPixelSize != 0) {
            B(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(int i7, int i8) {
        int displayOptions = this.f8768f.getDisplayOptions();
        if ((i8 & 4) != 0) {
            this.f8774l = true;
        }
        this.f8768f.setDisplayOptions((i7 & i8) | ((~i8) & displayOptions));
    }

    public void B(float f7) {
        Z.v0(this.f8767e, f7);
    }

    public void D(boolean z7) {
        if (z7 && !this.f8766d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f8759A = z7;
        this.f8766d.setHideOnContentScrollEnabled(z7);
    }

    public void E(boolean z7) {
        this.f8768f.setHomeButtonEnabled(z7);
    }

    @Override
    public boolean b() {
        DecorToolbar decorToolbar = this.f8768f;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f8768f.collapseActionView();
        return true;
    }

    @Override
    public void c(boolean z7) {
        if (z7 == this.f8778p) {
            return;
        }
        this.f8778p = z7;
        int size = this.f8779q.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f8779q.get(i7).a(z7);
        }
    }

    @Override
    public int d() {
        return this.f8768f.getDisplayOptions();
    }

    @Override
    public Context e() {
        if (this.f8764b == null) {
            TypedValue typedValue = new TypedValue();
            this.f8763a.getTheme().resolveAttribute(C2447a.f20546h, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f8764b = new ContextThemeWrapper(this.f8763a, i7);
            } else {
                this.f8764b = this.f8763a;
            }
        }
        return this.f8764b;
    }

    @Override
    public void enableContentAnimations(boolean z7) {
        this.f8782t = z7;
    }

    @Override
    public void f() {
        if (this.f8783u) {
            return;
        }
        this.f8783u = true;
        H(false);
    }

    @Override
    public void h(Configuration configuration) {
        C(androidx.appcompat.view.a.b(this.f8763a).g());
    }

    @Override
    public void hideForSystem() {
        if (this.f8784v) {
            return;
        }
        this.f8784v = true;
        H(true);
    }

    @Override
    public boolean j(int i7, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f8775m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i7, keyEvent, 0);
    }

    @Override
    public void m(boolean z7) {
        if (this.f8774l) {
            return;
        }
        z(z7);
    }

    @Override
    public void n(boolean z7) {
        androidx.appcompat.view.h hVar;
        this.f8788z = z7;
        if (z7 || (hVar = this.f8787y) == null) {
            return;
        }
        hVar.a();
    }

    @Override
    public void o(CharSequence charSequence) {
        this.f8768f.setWindowTitle(charSequence);
    }

    @Override
    public void onContentScrollStarted() {
        androidx.appcompat.view.h hVar = this.f8787y;
        if (hVar != null) {
            hVar.a();
            this.f8787y = null;
        }
    }

    @Override
    public void onContentScrollStopped() {
    }

    @Override
    public void onWindowVisibilityChanged(int i7) {
        this.f8781s = i7;
    }

    @Override
    public androidx.appcompat.view.b p(b.a aVar) {
        d dVar = this.f8775m;
        if (dVar != null) {
            dVar.c();
        }
        this.f8766d.setHideOnContentScrollEnabled(false);
        this.f8769g.killMode();
        d dVar2 = new d(this.f8769g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f8775m = dVar2;
        dVar2.k();
        this.f8769g.initForMode(dVar2);
        q(true);
        return dVar2;
    }

    public void q(boolean z7) {
        C1620h0 c1620h0;
        C1620h0 c1620h02;
        if (z7) {
            G();
        } else {
            x();
        }
        if (!F()) {
            if (z7) {
                this.f8768f.setVisibility(4);
                this.f8769g.setVisibility(0);
                return;
            } else {
                this.f8768f.setVisibility(0);
                this.f8769g.setVisibility(8);
                return;
            }
        }
        if (z7) {
            c1620h02 = this.f8768f.setupAnimatorToVisibility(4, 100L);
            c1620h0 = this.f8769g.setupAnimatorToVisibility(0, 200L);
        } else {
            c1620h0 = this.f8768f.setupAnimatorToVisibility(0, 200L);
            c1620h02 = this.f8769g.setupAnimatorToVisibility(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c1620h02, c1620h0);
        hVar.h();
    }

    void s() {
        b.a aVar = this.f8777o;
        if (aVar != null) {
            aVar.a(this.f8776n);
            this.f8776n = null;
            this.f8777o = null;
        }
    }

    @Override
    public void showForSystem() {
        if (this.f8784v) {
            this.f8784v = false;
            H(true);
        }
    }

    public void t(boolean z7) {
        View view;
        androidx.appcompat.view.h hVar = this.f8787y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f8781s != 0 || (!this.f8788z && !z7)) {
            this.f8760B.onAnimationEnd(null);
            return;
        }
        this.f8767e.setAlpha(1.0f);
        this.f8767e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f7 = -this.f8767e.getHeight();
        if (z7) {
            this.f8767e.getLocationInWindow(new int[]{0, 0});
            f7 -= r5[1];
        }
        C1620h0 c1620h0M = Z.e(this.f8767e).m(f7);
        c1620h0M.k(this.f8762D);
        hVar2.c(c1620h0M);
        if (this.f8782t && (view = this.f8770h) != null) {
            hVar2.c(Z.e(view).m(f7));
        }
        hVar2.f(f8757E);
        hVar2.e(250L);
        hVar2.g(this.f8760B);
        this.f8787y = hVar2;
        hVar2.h();
    }

    public void u(boolean z7) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f8787y;
        if (hVar != null) {
            hVar.a();
        }
        this.f8767e.setVisibility(0);
        if (this.f8781s == 0 && (this.f8788z || z7)) {
            this.f8767e.setTranslationY(0.0f);
            float f7 = -this.f8767e.getHeight();
            if (z7) {
                this.f8767e.getLocationInWindow(new int[]{0, 0});
                f7 -= r5[1];
            }
            this.f8767e.setTranslationY(f7);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C1620h0 c1620h0M = Z.e(this.f8767e).m(0.0f);
            c1620h0M.k(this.f8762D);
            hVar2.c(c1620h0M);
            if (this.f8782t && (view2 = this.f8770h) != null) {
                view2.setTranslationY(f7);
                hVar2.c(Z.e(this.f8770h).m(0.0f));
            }
            hVar2.f(f8758F);
            hVar2.e(250L);
            hVar2.g(this.f8761C);
            this.f8787y = hVar2;
            hVar2.h();
        } else {
            this.f8767e.setAlpha(1.0f);
            this.f8767e.setTranslationY(0.0f);
            if (this.f8782t && (view = this.f8770h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f8761C.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8766d;
        if (actionBarOverlayLayout != null) {
            Z.k0(actionBarOverlayLayout);
        }
    }

    public int w() {
        return this.f8768f.getNavigationMode();
    }

    public void z(boolean z7) {
        A(z7 ? 4 : 0, 4);
    }

    public z(Dialog dialog) {
        y(dialog.getWindow().getDecorView());
    }
}
