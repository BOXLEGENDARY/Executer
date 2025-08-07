package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c4.C1748d;
import c4.C1750f;
import c4.C1751g;
import c4.C1752h;
import c4.C1753i;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import x0.C2986c;
import y0.C3019t;

public final class e<S> extends com.google.android.material.datepicker.m<S> {

    static final Object f17766H = "MONTHS_VIEW_GROUP_TAG";

    static final Object f17767I = "NAVIGATION_PREV_TAG";

    static final Object f17768J = "NAVIGATION_NEXT_TAG";

    static final Object f17769K = "SELECTOR_TOGGLE_TAG";

    private com.google.android.material.datepicker.b f17770A;

    private RecyclerView f17771B;

    private RecyclerView f17772C;

    private View f17773D;

    private View f17774E;

    private View f17775F;

    private View f17776G;

    private int f17777e;

    private DateSelector<S> f17778i;

    private CalendarConstraints f17779v;

    private DayViewDecorator f17780w;

    private Month f17781y;

    private l f17782z;

    class a implements View.OnClickListener {

        final com.google.android.material.datepicker.k f17783d;

        a(com.google.android.material.datepicker.k kVar) {
            this.f17783d = kVar;
        }

        @Override
        public void onClick(View view) {
            int iE2 = e.this.J().e2() - 1;
            if (iE2 >= 0) {
                e.this.M(this.f17783d.D(iE2));
            }
        }
    }

    class b implements Runnable {

        final int f17785d;

        b(int i7) {
            this.f17785d = i7;
        }

        @Override
        public void run() {
            e.this.f17772C.p1(this.f17785d);
        }
    }

    class c extends C1605a {
        c() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.g0(null);
        }
    }

    class d extends n {

        final int f17788I;

        d(Context context, int i7, boolean z7, int i8) {
            super(context, i7, z7);
            this.f17788I = i8;
        }

        @Override
        protected void Q1(RecyclerView.A a2, int[] iArr) {
            if (this.f17788I == 0) {
                iArr[0] = e.this.f17772C.getWidth();
                iArr[1] = e.this.f17772C.getWidth();
            } else {
                iArr[0] = e.this.f17772C.getHeight();
                iArr[1] = e.this.f17772C.getHeight();
            }
        }
    }

    class C0157e implements m {
        C0157e() {
        }

        @Override
        public void a(long j7) {
            if (e.this.f17779v.h().n0(j7)) {
                e.this.f17778i.f1(j7);
                Iterator<com.google.android.material.datepicker.l<S>> it = e.this.f17867d.iterator();
                while (it.hasNext()) {
                    it.next().a(e.this.f17778i.P0());
                }
                e.this.f17772C.getAdapter().j();
                if (e.this.f17771B != null) {
                    e.this.f17771B.getAdapter().j();
                }
            }
        }
    }

    class f extends C1605a {
        f() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.x0(false);
        }
    }

    class g extends RecyclerView.o {

        private final Calendar f17792a = p.i();

        private final Calendar f17793b = p.i();

        g() {
        }

        @Override
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a2) {
            if ((recyclerView.getAdapter() instanceof q) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                q qVar = (q) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C2986c<Long, Long> c2986c : e.this.f17778i.A()) {
                    Long l7 = c2986c.f24317a;
                    if (l7 != null && c2986c.f24318b != null) {
                        this.f17792a.setTimeInMillis(l7.longValue());
                        this.f17793b.setTimeInMillis(c2986c.f24318b.longValue());
                        int iE = qVar.E(this.f17792a.get(1));
                        int iE2 = qVar.E(this.f17793b.get(1));
                        View viewH = gridLayoutManager.H(iE);
                        View viewH2 = gridLayoutManager.H(iE2);
                        int iX2 = iE / gridLayoutManager.X2();
                        int iX22 = iE2 / gridLayoutManager.X2();
                        int i7 = iX2;
                        while (i7 <= iX22) {
                            if (gridLayoutManager.H(gridLayoutManager.X2() * i7) != null) {
                                canvas.drawRect((i7 != iX2 || viewH == null) ? 0 : viewH.getLeft() + (viewH.getWidth() / 2), r9.getTop() + e.this.f17770A.f17757d.c(), (i7 != iX22 || viewH2 == null) ? recyclerView.getWidth() : viewH2.getLeft() + (viewH2.getWidth() / 2), r9.getBottom() - e.this.f17770A.f17757d.b(), e.this.f17770A.f17761h);
                            }
                            i7++;
                        }
                    }
                }
            }
        }
    }

    class h extends C1605a {
        h() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.p0(e.this.f17776G.getVisibility() == 0 ? e.this.getString(C1753i.f12942u) : e.this.getString(C1753i.f12940s));
        }
    }

    class i extends RecyclerView.u {

        final com.google.android.material.datepicker.k f17796a;

        final MaterialButton f17797b;

        i(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            this.f17796a = kVar;
            this.f17797b = materialButton;
        }

        @Override
        public void a(RecyclerView recyclerView, int i7) {
            if (i7 == 0) {
                recyclerView.announceForAccessibility(this.f17797b.getText());
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i7, int i8) {
            int iC2 = i7 < 0 ? e.this.J().c2() : e.this.J().e2();
            e.this.f17781y = this.f17796a.D(iC2);
            this.f17797b.setText(this.f17796a.E(iC2));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override
        public void onClick(View view) {
            e.this.Q();
        }
    }

    class k implements View.OnClickListener {

        final com.google.android.material.datepicker.k f17800d;

        k(com.google.android.material.datepicker.k kVar) {
            this.f17800d = kVar;
        }

        @Override
        public void onClick(View view) {
            int iC2 = e.this.J().c2() + 1;
            if (iC2 < e.this.f17772C.getAdapter().e()) {
                e.this.M(this.f17800d.D(iC2));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j7);
    }

    private void A(View view, com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C1750f.f12888r);
        materialButton.setTag(f17769K);
        Z.n0(materialButton, new h());
        View viewFindViewById = view.findViewById(C1750f.f12890t);
        this.f17773D = viewFindViewById;
        viewFindViewById.setTag(f17767I);
        View viewFindViewById2 = view.findViewById(C1750f.f12889s);
        this.f17774E = viewFindViewById2;
        viewFindViewById2.setTag(f17768J);
        this.f17775F = view.findViewById(C1750f.f12851A);
        this.f17776G = view.findViewById(C1750f.f12892v);
        N(l.DAY);
        materialButton.setText(this.f17781y.n());
        this.f17772C.j(new i(kVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f17774E.setOnClickListener(new k(kVar));
        this.f17773D.setOnClickListener(new a(kVar));
    }

    private RecyclerView.o B() {
        return new g();
    }

    static int H(Context context) {
        return context.getResources().getDimensionPixelSize(C1748d.f12790Q);
    }

    private static int I(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C1748d.f12797X) + resources.getDimensionPixelOffset(C1748d.f12798Y) + resources.getDimensionPixelOffset(C1748d.f12796W);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C1748d.f12792S);
        int i7 = com.google.android.material.datepicker.j.f17851z;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C1748d.f12790Q) * i7) + ((i7 - 1) * resources.getDimensionPixelOffset(C1748d.f12795V)) + resources.getDimensionPixelOffset(C1748d.f12788O);
    }

    public static <T> e<T> K(DateSelector<T> dateSelector, int i7, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        e<T> eVar = new e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.n());
        eVar.setArguments(bundle);
        return eVar;
    }

    private void L(int i7) {
        this.f17772C.post(new b(i7));
    }

    private void O() {
        Z.n0(this.f17772C, new f());
    }

    CalendarConstraints D() {
        return this.f17779v;
    }

    com.google.android.material.datepicker.b E() {
        return this.f17770A;
    }

    Month F() {
        return this.f17781y;
    }

    public DateSelector<S> G() {
        return this.f17778i;
    }

    LinearLayoutManager J() {
        return (LinearLayoutManager) this.f17772C.getLayoutManager();
    }

    void M(Month month) {
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f17772C.getAdapter();
        int iF = kVar.F(month);
        int iF2 = iF - kVar.F(this.f17781y);
        boolean z7 = Math.abs(iF2) > 3;
        boolean z8 = iF2 > 0;
        this.f17781y = month;
        if (z7 && z8) {
            this.f17772C.h1(iF - 3);
            L(iF);
        } else if (!z7) {
            L(iF);
        } else {
            this.f17772C.h1(iF + 3);
            L(iF);
        }
    }

    void N(l lVar) {
        this.f17782z = lVar;
        if (lVar == l.YEAR) {
            this.f17771B.getLayoutManager().B1(((q) this.f17771B.getAdapter()).E(this.f17781y.f17743i));
            this.f17775F.setVisibility(0);
            this.f17776G.setVisibility(8);
            this.f17773D.setVisibility(8);
            this.f17774E.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f17775F.setVisibility(8);
            this.f17776G.setVisibility(0);
            this.f17773D.setVisibility(0);
            this.f17774E.setVisibility(0);
            M(this.f17781y);
        }
    }

    void Q() {
        l lVar = this.f17782z;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            N(l.DAY);
        } else if (lVar == l.DAY) {
            N(lVar2);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f17777e = bundle.getInt("THEME_RES_ID_KEY");
        this.f17778i = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f17779v = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f17780w = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f17781y = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int i7;
        int i8;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f17777e);
        this.f17770A = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthO = this.f17779v.o();
        if (com.google.android.material.datepicker.g.H(contextThemeWrapper)) {
            i7 = C1752h.f12916q;
            i8 = 1;
        } else {
            i7 = C1752h.f12914o;
            i8 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i7, viewGroup, false);
        viewInflate.setMinimumHeight(I(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(C1750f.f12893w);
        Z.n0(gridView, new c());
        int iK = this.f17779v.k();
        gridView.setAdapter((ListAdapter) (iK > 0 ? new com.google.android.material.datepicker.d(iK) : new com.google.android.material.datepicker.d()));
        gridView.setNumColumns(monthO.f17744v);
        gridView.setEnabled(false);
        this.f17772C = (RecyclerView) viewInflate.findViewById(C1750f.f12896z);
        this.f17772C.setLayoutManager(new d(getContext(), i8, false, i8));
        this.f17772C.setTag(f17766H);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.f17778i, this.f17779v, this.f17780w, new C0157e());
        this.f17772C.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(C1751g.f12899c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C1750f.f12851A);
        this.f17771B = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f17771B.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f17771B.setAdapter(new q(this));
            this.f17771B.g(B());
        }
        if (viewInflate.findViewById(C1750f.f12888r) != null) {
            A(viewInflate, kVar);
        }
        if (!com.google.android.material.datepicker.g.H(contextThemeWrapper)) {
            new androidx.recyclerview.widget.q().b(this.f17772C);
        }
        this.f17772C.h1(kVar.F(this.f17781y));
        O();
        return viewInflate;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f17777e);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f17778i);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f17779v);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f17780w);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f17781y);
    }

    @Override
    public boolean q(com.google.android.material.datepicker.l<S> lVar) {
        return super.q(lVar);
    }
}
