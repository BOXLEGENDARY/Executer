package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1607b;
import g.C2447a;
import g.C2453g;
import java.util.ArrayList;
import q0.C2731a;

class C1597b extends androidx.appcompat.view.menu.b implements AbstractC1607b.a {

    d f9239D;

    private Drawable f9240E;

    private boolean f9241F;

    private boolean f9242G;

    private boolean f9243H;

    private int f9244I;

    private int f9245J;

    private int f9246K;

    private boolean f9247L;

    private boolean f9248M;

    private boolean f9249N;

    private boolean f9250O;

    private int f9251P;

    private final SparseBooleanArray f9252Q;

    e f9253R;

    a f9254S;

    c f9255T;

    private C0071b f9256U;

    final f f9257V;

    int f9258W;

    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, C2447a.f20552n);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = C1597b.this.f9239D;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) C1597b.this).f8923B : view2);
            }
            l(C1597b.this.f9257V);
        }

        @Override
        protected void g() {
            C1597b c1597b = C1597b.this;
            c1597b.f9254S = null;
            c1597b.f9258W = 0;
            super.g();
        }
    }

    private class C0071b extends ActionMenuItemView.b {
        C0071b() {
        }

        @Override
        public androidx.appcompat.view.menu.p a() {
            a aVar = C1597b.this.f9254S;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    private class c implements Runnable {

        private e f9261d;

        public c(e eVar) {
            this.f9261d = eVar;
        }

        @Override
        public void run() {
            if (((androidx.appcompat.view.menu.b) C1597b.this).f8927i != null) {
                ((androidx.appcompat.view.menu.b) C1597b.this).f8927i.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) C1597b.this).f8923B;
            if (view != null && view.getWindowToken() != null && this.f9261d.o()) {
                C1597b.this.f9253R = this.f9261d;
            }
            C1597b.this.f9255T = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {

        class a extends ForwardingListener {

            final C1597b f9264d;

            a(View view, C1597b c1597b) {
                super(view);
                this.f9264d = c1597b;
            }

            @Override
            public androidx.appcompat.view.menu.p getPopup() {
                e eVar = C1597b.this.f9253R;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override
            public boolean onForwardingStarted() {
                C1597b.this.M();
                return true;
            }

            @Override
            public boolean onForwardingStopped() {
                C1597b c1597b = C1597b.this;
                if (c1597b.f9255T != null) {
                    return false;
                }
                c1597b.C();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C2447a.f20551m);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new a(this, C1597b.this));
        }

        @Override
        public boolean needsDividerAfter() {
            return false;
        }

        @Override
        public boolean needsDividerBefore() {
            return false;
        }

        @Override
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1597b.this.M();
            return true;
        }

        @Override
        protected boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C2731a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z7) {
            super(context, gVar, view, z7, C2447a.f20552n);
            j(8388613);
            l(C1597b.this.f9257V);
        }

        @Override
        protected void g() {
            if (((androidx.appcompat.view.menu.b) C1597b.this).f8927i != null) {
                ((androidx.appcompat.view.menu.b) C1597b.this).f8927i.close();
            }
            C1597b.this.f9253R = null;
            super.g();
        }
    }

    private class f implements m.a {
        f() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a aVarN = C1597b.this.n();
            if (aVarN != null) {
                aVarN.a(gVar, z7);
            }
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) C1597b.this).f8927i) {
                return false;
            }
            C1597b.this.f9258W = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a aVarN = C1597b.this.n();
            if (aVarN != null) {
                return aVarN.b(gVar);
            }
            return false;
        }
    }

    public C1597b(Context context) {
        super(context, C2453g.f20679c, C2453g.f20678b);
        this.f9252Q = new SparseBooleanArray();
        this.f9257V = new f();
    }

    private View A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f8923B;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable B() {
        d dVar = this.f9239D;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f9241F) {
            return this.f9240E;
        }
        return null;
    }

    public boolean C() {
        Object obj;
        c cVar = this.f9255T;
        if (cVar != null && (obj = this.f8923B) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f9255T = null;
            return true;
        }
        e eVar = this.f9253R;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean D() {
        a aVar = this.f9254S;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean E() {
        return this.f9255T != null || F();
    }

    public boolean F() {
        e eVar = this.f9253R;
        return eVar != null && eVar.f();
    }

    public boolean G() {
        return this.f9242G;
    }

    public void H(Configuration configuration) {
        if (!this.f9247L) {
            this.f9246K = androidx.appcompat.view.a.b(this.f8926e).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f8927i;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void I(boolean z7) {
        this.f9250O = z7;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f8923B = actionMenuView;
        actionMenuView.initialize(this.f8927i);
    }

    public void K(Drawable drawable) {
        d dVar = this.f9239D;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f9241F = true;
            this.f9240E = drawable;
        }
    }

    public void L(boolean z7) {
        this.f9242G = z7;
        this.f9243H = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f9242G || F() || (gVar = this.f8927i) == null || this.f8923B == null || this.f9255T != null || gVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f8926e, this.f8927i, this.f9239D, true));
        this.f9255T = cVar;
        ((View) this.f8923B).post(cVar);
        return true;
    }

    @Override
    public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
        z();
        super.a(gVar, z7);
    }

    @Override
    public void b(boolean z7) {
        super.b(z7);
        ((View) this.f8923B).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f8927i;
        boolean z8 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> arrayListS = gVar.s();
            int size = arrayListS.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC1607b abstractC1607bB = arrayListS.get(i7).b();
                if (abstractC1607bB != null) {
                    abstractC1607bB.setSubUiVisibilityListener(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f8927i;
        ArrayList<androidx.appcompat.view.menu.i> arrayListZ = gVar2 != null ? gVar2.z() : null;
        if (this.f9242G && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z8 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f9239D == null) {
                this.f9239D = new d(this.f8925d);
            }
            ViewGroup viewGroup = (ViewGroup) this.f9239D.getParent();
            if (viewGroup != this.f8923B) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f9239D);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8923B;
                actionMenuView.addView(this.f9239D, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            d dVar = this.f9239D;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f8923B;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f9239D);
                }
            }
        }
        ((ActionMenuView) this.f8923B).setOverflowReserved(this.f9242G);
    }

    @Override
    public boolean c() {
        ArrayList<androidx.appcompat.view.menu.i> arrayListE;
        int size;
        int i7;
        int iMeasureChildForCells;
        boolean z7;
        int i8;
        C1597b c1597b = this;
        androidx.appcompat.view.menu.g gVar = c1597b.f8927i;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayListE = gVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i9 = c1597b.f9246K;
        int i10 = c1597b.f9245J;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1597b.f8923B;
        boolean z8 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.appcompat.view.menu.i iVar = arrayListE.get(i13);
            if (iVar.o()) {
                i11++;
            } else if (iVar.n()) {
                i12++;
            } else {
                z8 = true;
            }
            if (c1597b.f9250O && iVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (c1597b.f9242G && (z8 || i12 + i11 > i9)) {
            i9--;
        }
        int i14 = i9 - i11;
        SparseBooleanArray sparseBooleanArray = c1597b.f9252Q;
        sparseBooleanArray.clear();
        if (c1597b.f9248M) {
            int i15 = c1597b.f9251P;
            iMeasureChildForCells = i10 / i15;
            i7 = i15 + ((i10 % i15) / iMeasureChildForCells);
        } else {
            i7 = 0;
            iMeasureChildForCells = 0;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < size) {
            androidx.appcompat.view.menu.i iVar2 = arrayListE.get(i16);
            if (iVar2.o()) {
                View viewO = c1597b.o(iVar2, view, viewGroup);
                if (c1597b.f9248M) {
                    iMeasureChildForCells -= ActionMenuView.measureChildForCells(viewO, i7, iMeasureChildForCells, iMakeMeasureSpec, r32);
                } else {
                    viewO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewO.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                z7 = r32;
                i8 = size;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z9 = sparseBooleanArray.get(groupId2);
                boolean z10 = (i14 > 0 || z9) && i10 > 0 && (!c1597b.f9248M || iMeasureChildForCells > 0);
                boolean z11 = z10;
                i8 = size;
                if (z10) {
                    View viewO2 = c1597b.o(iVar2, null, viewGroup);
                    if (c1597b.f9248M) {
                        int iMeasureChildForCells2 = ActionMenuView.measureChildForCells(viewO2, i7, iMeasureChildForCells, iMakeMeasureSpec, 0);
                        iMeasureChildForCells -= iMeasureChildForCells2;
                        if (iMeasureChildForCells2 == 0) {
                            z11 = false;
                        }
                    } else {
                        viewO2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z12 = z11;
                    int measuredWidth2 = viewO2.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z10 = z12 & (!c1597b.f9248M ? i10 + i17 <= 0 : i10 < 0);
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z9) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i18 = 0; i18 < i16; i18++) {
                        androidx.appcompat.view.menu.i iVar3 = arrayListE.get(i18);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i14++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z10) {
                    i14--;
                }
                iVar2.u(z10);
                z7 = false;
            } else {
                z7 = r32;
                i8 = size;
                iVar2.u(z7);
            }
            i16++;
            r32 = z7;
            size = i8;
            view = null;
            c1597b = this;
        }
        return true;
    }

    @Override
    public void g(Context context, androidx.appcompat.view.menu.g gVar) {
        super.g(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f9243H) {
            this.f9242G = aVarB.h();
        }
        if (!this.f9249N) {
            this.f9244I = aVarB.c();
        }
        if (!this.f9247L) {
            this.f9246K = aVarB.d();
        }
        int measuredWidth = this.f9244I;
        if (this.f9242G) {
            if (this.f9239D == null) {
                d dVar = new d(this.f8925d);
                this.f9239D = dVar;
                if (this.f9241F) {
                    dVar.setImageDrawable(this.f9240E);
                    this.f9240E = null;
                    this.f9241F = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9239D.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f9239D.getMeasuredWidth();
        } else {
            this.f9239D = null;
        }
        this.f9245J = measuredWidth;
        this.f9251P = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override
    public boolean h(androidx.appcompat.view.menu.r rVar) {
        boolean z7 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f8927i) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View viewA = A(rVar2.getItem());
        if (viewA == null) {
            return false;
        }
        this.f9258W = rVar.getItem().getItemId();
        int size = rVar.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
            i7++;
        }
        a aVar = new a(this.f8926e, rVar, viewA);
        this.f9254S = aVar;
        aVar.i(z7);
        this.f9254S.m();
        super.h(rVar);
        return true;
    }

    @Override
    public void i(boolean z7) {
        if (z7) {
            super.h(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f8927i;
        if (gVar != null) {
            gVar.e(false);
        }
    }

    @Override
    public void k(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.b(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f8923B);
        if (this.f9256U == null) {
            this.f9256U = new C0071b();
        }
        actionMenuItemView.setPopupCallback(this.f9256U);
    }

    @Override
    public boolean m(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.f9239D) {
            return false;
        }
        return super.m(viewGroup, i7);
    }

    @Override
    public View o(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.o(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override
    public androidx.appcompat.view.menu.n p(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f8923B;
        androidx.appcompat.view.menu.n nVarP = super.p(viewGroup);
        if (nVar != nVarP) {
            ((ActionMenuView) nVarP).setPresenter(this);
        }
        return nVarP;
    }

    @Override
    public boolean r(int i7, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean z() {
        return C() | D();
    }
}
