package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class f {

    final b f11859a;

    final a f11860b = new a();

    final List<View> f11861c = new ArrayList();

    static class a {

        long f11862a = 0;

        a f11863b;

        a() {
        }

        private void c() {
            if (this.f11863b == null) {
                this.f11863b = new a();
            }
        }

        void a(int i7) {
            if (i7 < 64) {
                this.f11862a &= ~(1 << i7);
                return;
            }
            a aVar = this.f11863b;
            if (aVar != null) {
                aVar.a(i7 - 64);
            }
        }

        int b(int i7) {
            a aVar = this.f11863b;
            return aVar == null ? i7 >= 64 ? Long.bitCount(this.f11862a) : Long.bitCount(this.f11862a & ((1 << i7) - 1)) : i7 < 64 ? Long.bitCount(this.f11862a & ((1 << i7) - 1)) : aVar.b(i7 - 64) + Long.bitCount(this.f11862a);
        }

        boolean d(int i7) {
            if (i7 < 64) {
                return (this.f11862a & (1 << i7)) != 0;
            }
            c();
            return this.f11863b.d(i7 - 64);
        }

        void e(int i7, boolean z7) {
            if (i7 >= 64) {
                c();
                this.f11863b.e(i7 - 64, z7);
                return;
            }
            long j7 = this.f11862a;
            boolean z8 = (Long.MIN_VALUE & j7) != 0;
            long j8 = (1 << i7) - 1;
            this.f11862a = ((j7 & (~j8)) << 1) | (j7 & j8);
            if (z7) {
                h(i7);
            } else {
                a(i7);
            }
            if (z8 || this.f11863b != null) {
                c();
                this.f11863b.e(0, z8);
            }
        }

        boolean f(int i7) {
            if (i7 >= 64) {
                c();
                return this.f11863b.f(i7 - 64);
            }
            long j7 = 1 << i7;
            long j8 = this.f11862a;
            boolean z7 = (j8 & j7) != 0;
            long j9 = j8 & (~j7);
            this.f11862a = j9;
            long j10 = j7 - 1;
            this.f11862a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
            a aVar = this.f11863b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f11863b.f(0);
            }
            return z7;
        }

        void g() {
            this.f11862a = 0L;
            a aVar = this.f11863b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i7) {
            if (i7 < 64) {
                this.f11862a |= 1 << i7;
            } else {
                c();
                this.f11863b.h(i7 - 64);
            }
        }

        public String toString() {
            if (this.f11863b == null) {
                return Long.toBinaryString(this.f11862a);
            }
            return this.f11863b.toString() + "xx" + Long.toBinaryString(this.f11862a);
        }
    }

    interface b {
        View a(int i7);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.D f(View view);

        void g(int i7);

        void h(View view);

        void i(View view, int i7);

        void j(int i7);

        void k(View view, int i7, ViewGroup.LayoutParams layoutParams);
    }

    f(b bVar) {
        this.f11859a = bVar;
    }

    private int h(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int iC = this.f11859a.c();
        int i8 = i7;
        while (i8 < iC) {
            int iB = i7 - (i8 - this.f11860b.b(i8));
            if (iB == 0) {
                while (this.f11860b.d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f11861c.add(view);
        this.f11859a.b(view);
    }

    private boolean t(View view) {
        if (!this.f11861c.remove(view)) {
            return false;
        }
        this.f11859a.h(view);
        return true;
    }

    void a(View view, int i7, boolean z7) {
        int iC = i7 < 0 ? this.f11859a.c() : h(i7);
        this.f11860b.e(iC, z7);
        if (z7) {
            l(view);
        }
        this.f11859a.i(view, iC);
    }

    void b(View view, boolean z7) {
        a(view, -1, z7);
    }

    void c(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        int iC = i7 < 0 ? this.f11859a.c() : h(i7);
        this.f11860b.e(iC, z7);
        if (z7) {
            l(view);
        }
        this.f11859a.k(view, iC, layoutParams);
    }

    void d(int i7) {
        int iH = h(i7);
        this.f11860b.f(iH);
        this.f11859a.g(iH);
    }

    View e(int i7) {
        int size = this.f11861c.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = this.f11861c.get(i8);
            RecyclerView.D dF = this.f11859a.f(view);
            if (dF.o() == i7 && !dF.v() && !dF.x()) {
                return view;
            }
        }
        return null;
    }

    View f(int i7) {
        return this.f11859a.a(h(i7));
    }

    int g() {
        return this.f11859a.c() - this.f11861c.size();
    }

    View i(int i7) {
        return this.f11859a.a(i7);
    }

    int j() {
        return this.f11859a.c();
    }

    void k(View view) {
        int iE = this.f11859a.e(view);
        if (iE >= 0) {
            this.f11860b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iE = this.f11859a.e(view);
        if (iE == -1 || this.f11860b.d(iE)) {
            return -1;
        }
        return iE - this.f11860b.b(iE);
    }

    boolean n(View view) {
        return this.f11861c.contains(view);
    }

    void o() {
        this.f11860b.g();
        for (int size = this.f11861c.size() - 1; size >= 0; size--) {
            this.f11859a.h(this.f11861c.get(size));
            this.f11861c.remove(size);
        }
        this.f11859a.d();
    }

    void p(View view) {
        int iE = this.f11859a.e(view);
        if (iE < 0) {
            return;
        }
        if (this.f11860b.f(iE)) {
            t(view);
        }
        this.f11859a.j(iE);
    }

    void q(int i7) {
        int iH = h(i7);
        View viewA = this.f11859a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f11860b.f(iH)) {
            t(viewA);
        }
        this.f11859a.j(iH);
    }

    boolean r(View view) {
        int iE = this.f11859a.e(view);
        if (iE == -1) {
            t(view);
            return true;
        }
        if (!this.f11860b.d(iE)) {
            return false;
        }
        this.f11860b.f(iE);
        t(view);
        this.f11859a.j(iE);
        return true;
    }

    void s(View view) {
        int iE = this.f11859a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f11860b.d(iE)) {
            this.f11860b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f11860b.toString() + ", hidden list:" + this.f11861c.size();
    }
}
