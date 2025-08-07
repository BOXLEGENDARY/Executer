package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t extends RecyclerView.m {

    boolean f12023g = true;

    public final void A(RecyclerView.D d7) {
        I(d7);
        h(d7);
    }

    public final void B(RecyclerView.D d7) {
        J(d7);
    }

    public final void C(RecyclerView.D d7, boolean z7) {
        K(d7, z7);
        h(d7);
    }

    public final void D(RecyclerView.D d7, boolean z7) {
        L(d7, z7);
    }

    public final void E(RecyclerView.D d7) {
        M(d7);
        h(d7);
    }

    public final void F(RecyclerView.D d7) {
        N(d7);
    }

    public final void G(RecyclerView.D d7) {
        O(d7);
        h(d7);
    }

    public final void H(RecyclerView.D d7) {
        P(d7);
    }

    public void I(RecyclerView.D d7) {
    }

    public void J(RecyclerView.D d7) {
    }

    public void K(RecyclerView.D d7, boolean z7) {
    }

    public void L(RecyclerView.D d7, boolean z7) {
    }

    public void M(RecyclerView.D d7) {
    }

    public void N(RecyclerView.D d7) {
    }

    public void O(RecyclerView.D d7) {
    }

    public void P(RecyclerView.D d7) {
    }

    @Override
    public boolean a(RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i7;
        int i8;
        return (cVar == null || ((i7 = cVar.f11697a) == (i8 = cVar2.f11697a) && cVar.f11698b == cVar2.f11698b)) ? w(d7) : y(d7, i7, cVar.f11698b, i8, cVar2.f11698b);
    }

    @Override
    public boolean b(RecyclerView.D d7, RecyclerView.D d8, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i7;
        int i8;
        int i9 = cVar.f11697a;
        int i10 = cVar.f11698b;
        if (d8.L()) {
            int i11 = cVar.f11697a;
            i8 = cVar.f11698b;
            i7 = i11;
        } else {
            i7 = cVar2.f11697a;
            i8 = cVar2.f11698b;
        }
        return x(d7, d8, i9, i10, i7, i8);
    }

    @Override
    public boolean c(RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i7 = cVar.f11697a;
        int i8 = cVar.f11698b;
        View view = d7.f11658a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f11697a;
        int top = cVar2 == null ? view.getTop() : cVar2.f11698b;
        if (d7.x() || (i7 == left && i8 == top)) {
            return z(d7);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d7, i7, i8, left, top);
    }

    @Override
    public boolean d(RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i7 = cVar.f11697a;
        int i8 = cVar2.f11697a;
        if (i7 != i8 || cVar.f11698b != cVar2.f11698b) {
            return y(d7, i7, cVar.f11698b, i8, cVar2.f11698b);
        }
        E(d7);
        return false;
    }

    @Override
    public boolean f(RecyclerView.D d7) {
        return !this.f12023g || d7.v();
    }

    public abstract boolean w(RecyclerView.D d7);

    public abstract boolean x(RecyclerView.D d7, RecyclerView.D d8, int i7, int i8, int i9, int i10);

    public abstract boolean y(RecyclerView.D d7, int i7, int i8, int i9, int i10);

    public abstract boolean z(RecyclerView.D d7);
}
