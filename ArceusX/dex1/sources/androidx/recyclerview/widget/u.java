package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class u extends RecyclerView.s {

    RecyclerView f12024a;

    private Scroller f12025b;

    private final RecyclerView.u f12026c = new a();

    class a extends RecyclerView.u {

        boolean f12027a = false;

        a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i7) {
            super.a(recyclerView, i7);
            if (i7 == 0 && this.f12027a) {
                this.f12027a = false;
                u.this.j();
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i7, int i8) {
            if (i7 == 0 && i8 == 0) {
                return;
            }
            this.f12027a = true;
        }
    }

    private void e() {
        this.f12024a.Y0(this.f12026c);
        this.f12024a.setOnFlingListener(null);
    }

    private void h() throws IllegalStateException {
        if (this.f12024a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f12024a.j(this.f12026c);
        this.f12024a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i7, int i8) {
        RecyclerView.z zVarD;
        int iG;
        if (!(pVar instanceof RecyclerView.z.b) || (zVarD = d(pVar)) == null || (iG = g(pVar, i7, i8)) == -1) {
            return false;
        }
        zVarD.p(iG);
        pVar.N1(zVarD);
        return true;
    }

    @Override
    public boolean a(int i7, int i8) {
        RecyclerView.p layoutManager = this.f12024a.getLayoutManager();
        if (layoutManager == null || this.f12024a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f12024a.getMinFlingVelocity();
        return (Math.abs(i8) > minFlingVelocity || Math.abs(i7) > minFlingVelocity) && i(layoutManager, i7, i8);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f12024a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f12024a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f12025b = new Scroller(this.f12024a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.z d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i7, int i8);

    void j() {
        RecyclerView.p layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f12024a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i7 = iArrC[0];
        if (i7 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f12024a.l1(i7, iArrC[1]);
    }
}
