package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class p {

    protected final RecyclerView.p f12013a;

    private int f12014b;

    final Rect f12015c;

    class a extends p {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override
        public int d(View view) {
            return this.f12013a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f12013a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f12013a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override
        public int g(View view) {
            return this.f12013a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override
        public int h() {
            return this.f12013a.s0();
        }

        @Override
        public int i() {
            return this.f12013a.s0() - this.f12013a.j0();
        }

        @Override
        public int j() {
            return this.f12013a.j0();
        }

        @Override
        public int k() {
            return this.f12013a.t0();
        }

        @Override
        public int l() {
            return this.f12013a.c0();
        }

        @Override
        public int m() {
            return this.f12013a.i0();
        }

        @Override
        public int n() {
            return (this.f12013a.s0() - this.f12013a.i0()) - this.f12013a.j0();
        }

        @Override
        public int p(View view) {
            this.f12013a.r0(view, true, this.f12015c);
            return this.f12015c.right;
        }

        @Override
        public int q(View view) {
            this.f12013a.r0(view, true, this.f12015c);
            return this.f12015c.left;
        }

        @Override
        public void r(int i7) {
            this.f12013a.G0(i7);
        }
    }

    class b extends p {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override
        public int d(View view) {
            return this.f12013a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f12013a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f12013a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override
        public int g(View view) {
            return this.f12013a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override
        public int h() {
            return this.f12013a.b0();
        }

        @Override
        public int i() {
            return this.f12013a.b0() - this.f12013a.h0();
        }

        @Override
        public int j() {
            return this.f12013a.h0();
        }

        @Override
        public int k() {
            return this.f12013a.c0();
        }

        @Override
        public int l() {
            return this.f12013a.t0();
        }

        @Override
        public int m() {
            return this.f12013a.k0();
        }

        @Override
        public int n() {
            return (this.f12013a.b0() - this.f12013a.k0()) - this.f12013a.h0();
        }

        @Override
        public int p(View view) {
            this.f12013a.r0(view, true, this.f12015c);
            return this.f12015c.bottom;
        }

        @Override
        public int q(View view) {
            this.f12013a.r0(view, true, this.f12015c);
            return this.f12015c.top;
        }

        @Override
        public void r(int i7) {
            this.f12013a.H0(i7);
        }
    }

    p(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static p a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static p b(RecyclerView.p pVar, int i7) {
        if (i7 == 0) {
            return a(pVar);
        }
        if (i7 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static p c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f12014b) {
            return 0;
        }
        return n() - this.f12014b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i7);

    public void s() {
        this.f12014b = n();
    }

    private p(RecyclerView.p pVar) {
        this.f12014b = Integer.MIN_VALUE;
        this.f12015c = new Rect();
        this.f12013a = pVar;
    }
}
