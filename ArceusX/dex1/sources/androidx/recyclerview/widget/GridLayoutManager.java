package androidx.recyclerview.widget;

import Za.qhkq.dHkZSUxHu;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import y0.C3019t;

public class GridLayoutManager extends LinearLayoutManager {

    boolean f11495I;

    int f11496J;

    int[] f11497K;

    View[] f11498L;

    final SparseIntArray f11499M;

    final SparseIntArray f11500N;

    c f11501O;

    final Rect f11502P;

    private boolean f11503Q;

    public static final class a extends c {
        @Override
        public int e(int i7, int i8) {
            return i7 % i8;
        }

        @Override
        public int f(int i7) {
            return 1;
        }
    }

    public static abstract class c {

        final SparseIntArray f11506a = new SparseIntArray();

        final SparseIntArray f11507b = new SparseIntArray();

        private boolean f11508c = false;

        private boolean f11509d = false;

        static int a(SparseIntArray sparseIntArray, int i7) {
            int size = sparseIntArray.size() - 1;
            int i8 = 0;
            while (i8 <= size) {
                int i9 = (i8 + size) >>> 1;
                if (sparseIntArray.keyAt(i9) < i7) {
                    i8 = i9 + 1;
                } else {
                    size = i9 - 1;
                }
            }
            int i10 = i8 - 1;
            if (i10 < 0 || i10 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i10);
        }

        int b(int i7, int i8) {
            if (!this.f11509d) {
                return d(i7, i8);
            }
            int i9 = this.f11507b.get(i7, -1);
            if (i9 != -1) {
                return i9;
            }
            int iD = d(i7, i8);
            this.f11507b.put(i7, iD);
            return iD;
        }

        int c(int i7, int i8) {
            if (!this.f11508c) {
                return e(i7, i8);
            }
            int i9 = this.f11506a.get(i7, -1);
            if (i9 != -1) {
                return i9;
            }
            int iE = e(i7, i8);
            this.f11506a.put(i7, iE);
            return iE;
        }

        public int d(int i7, int i8) {
            int i9;
            int i10;
            int iC;
            int iA;
            if (!this.f11509d || (iA = a(this.f11507b, i7)) == -1) {
                i9 = 0;
                i10 = 0;
                iC = 0;
            } else {
                i9 = this.f11507b.get(iA);
                i10 = iA + 1;
                iC = c(iA, i8) + f(iA);
                if (iC == i8) {
                    i9++;
                    iC = 0;
                }
            }
            int iF = f(i7);
            while (i10 < i7) {
                int iF2 = f(i10);
                iC += iF2;
                if (iC == i8) {
                    i9++;
                    iC = 0;
                } else if (iC > i8) {
                    i9++;
                    iC = iF2;
                }
                i10++;
            }
            return iC + iF > i8 ? i9 + 1 : i9;
        }

        public abstract int e(int i7, int i8);

        public abstract int f(int i7);

        public void g() {
            this.f11507b.clear();
        }

        public void h() {
            this.f11506a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11495I = false;
        this.f11496J = -1;
        this.f11499M = new SparseIntArray();
        this.f11500N = new SparseIntArray();
        this.f11501O = new a();
        this.f11502P = new Rect();
        e3(RecyclerView.p.m0(context, attributeSet, i7, i8).f11723b);
    }

    private void N2(RecyclerView.w wVar, RecyclerView.A a2, int i7, boolean z7) {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (z7) {
            i10 = 1;
            i9 = i7;
            i8 = 0;
        } else {
            i8 = i7 - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View view = this.f11498L[i8];
            b bVar = (b) view.getLayoutParams();
            int iA3 = a3(wVar, a2, l0(view));
            bVar.f11505f = iA3;
            bVar.f11504e = i11;
            i11 += iA3;
            i8 += i10;
        }
    }

    private void O2() {
        int iO = O();
        for (int i7 = 0; i7 < iO; i7++) {
            b bVar = (b) N(i7).getLayoutParams();
            int iA = bVar.a();
            this.f11499M.put(iA, bVar.f());
            this.f11500N.put(iA, bVar.e());
        }
    }

    private void P2(int i7) {
        this.f11497K = Q2(this.f11497K, this.f11496J, i7);
    }

    static int[] Q2(int[] iArr, int i7, int i8) {
        int i9;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i8) {
            iArr = new int[i7 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i8 / i7;
        int i12 = i8 % i7;
        int i13 = 0;
        for (int i14 = 1; i14 <= i7; i14++) {
            i10 += i12;
            if (i10 <= 0 || i7 - i10 >= i12) {
                i9 = i11;
            } else {
                i9 = i11 + 1;
                i10 -= i7;
            }
            i13 += i9;
            iArr[i14] = i13;
        }
        return iArr;
    }

    private void R2() {
        this.f11499M.clear();
        this.f11500N.clear();
    }

    private int S2(RecyclerView.A a2) {
        if (O() != 0 && a2.b() != 0) {
            X1();
            boolean zR2 = r2();
            View viewB2 = b2(!zR2, true);
            View viewA2 = a2(!zR2, true);
            if (viewB2 != null && viewA2 != null) {
                int iB = this.f11501O.b(l0(viewB2), this.f11496J);
                int iB2 = this.f11501O.b(l0(viewA2), this.f11496J);
                int iMax = this.f11523x ? Math.max(0, ((this.f11501O.b(a2.b() - 1, this.f11496J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.f11520u.d(viewA2) - this.f11520u.g(viewB2)) / ((this.f11501O.b(l0(viewA2), this.f11496J) - this.f11501O.b(l0(viewB2), this.f11496J)) + 1))) + (this.f11520u.m() - this.f11520u.g(viewB2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.A a2) {
        if (O() != 0 && a2.b() != 0) {
            X1();
            View viewB2 = b2(!r2(), true);
            View viewA2 = a2(!r2(), true);
            if (viewB2 != null && viewA2 != null) {
                if (!r2()) {
                    return this.f11501O.b(a2.b() - 1, this.f11496J) + 1;
                }
                int iD = this.f11520u.d(viewA2) - this.f11520u.g(viewB2);
                int iB = this.f11501O.b(l0(viewB2), this.f11496J);
                return (int) ((iD / ((this.f11501O.b(l0(viewA2), this.f11496J) - iB) + 1)) * (this.f11501O.b(a2.b() - 1, this.f11496J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.w wVar, RecyclerView.A a2, LinearLayoutManager.a aVar, int i7) {
        boolean z7 = i7 == 1;
        int iZ2 = Z2(wVar, a2, aVar.f11530b);
        if (z7) {
            while (iZ2 > 0) {
                int i8 = aVar.f11530b;
                if (i8 <= 0) {
                    return;
                }
                int i9 = i8 - 1;
                aVar.f11530b = i9;
                iZ2 = Z2(wVar, a2, i9);
            }
            return;
        }
        int iB = a2.b() - 1;
        int i10 = aVar.f11530b;
        while (i10 < iB) {
            int i11 = i10 + 1;
            int iZ22 = Z2(wVar, a2, i11);
            if (iZ22 <= iZ2) {
                break;
            }
            i10 = i11;
            iZ2 = iZ22;
        }
        aVar.f11530b = i10;
    }

    private void V2() {
        View[] viewArr = this.f11498L;
        if (viewArr == null || viewArr.length != this.f11496J) {
            this.f11498L = new View[this.f11496J];
        }
    }

    private int Y2(RecyclerView.w wVar, RecyclerView.A a2, int i7) {
        if (!a2.e()) {
            return this.f11501O.b(i7, this.f11496J);
        }
        int iF = wVar.f(i7);
        if (iF != -1) {
            return this.f11501O.b(iF, this.f11496J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    private int Z2(RecyclerView.w wVar, RecyclerView.A a2, int i7) {
        if (!a2.e()) {
            return this.f11501O.c(i7, this.f11496J);
        }
        int i8 = this.f11500N.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int iF = wVar.f(i7);
        if (iF != -1) {
            return this.f11501O.c(iF, this.f11496J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    private int a3(RecyclerView.w wVar, RecyclerView.A a2, int i7) {
        if (!a2.e()) {
            return this.f11501O.f(i7);
        }
        int i8 = this.f11499M.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int iF = wVar.f(i7);
        if (iF != -1) {
            return this.f11501O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    private void b3(float f7, int i7) {
        P2(Math.max(Math.round(f7 * this.f11496J), i7));
    }

    private void c3(View view, int i7, boolean z7) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f11727b;
        int i8 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i9 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f11504e, bVar.f11505f);
        if (this.f11518s == 1) {
            iP2 = RecyclerView.p.P(iW2, i7, i9, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = RecyclerView.p.P(this.f11520u.n(), c0(), i8, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = RecyclerView.p.P(iW2, i7, i8, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = RecyclerView.p.P(this.f11520u.n(), t0(), i9, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        d3(view, iP2, iP, z7);
    }

    private void d3(View view, int i7, int i8, boolean z7) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z7 ? L1(view, i7, i8, qVar) : J1(view, i7, i8, qVar)) {
            view.measure(i7, i8);
        }
    }

    private void f3() {
        int iB0;
        int iK0;
        if (p2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        P2(iB0 - iK0);
    }

    @Override
    public int A(RecyclerView.A a2) {
        return this.f11503Q ? T2(a2) : super.A(a2);
    }

    @Override
    public int A1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        f3();
        V2();
        return super.A1(i7, wVar, a2);
    }

    @Override
    public int C1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        f3();
        V2();
        return super.C1(i7, wVar, a2);
    }

    @Override
    public void E2(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override
    public void G1(Rect rect, int i7, int i8) {
        int iS;
        int iS2;
        if (this.f11497K == null) {
            super.G1(rect, i7, i8);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f11518s == 1) {
            iS2 = RecyclerView.p.s(i8, rect.height() + iK0, f0());
            int[] iArr = this.f11497K;
            iS = RecyclerView.p.s(i7, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i7, rect.width() + iI0, g0());
            int[] iArr2 = this.f11497K;
            iS2 = RecyclerView.p.s(i8, iArr2[iArr2.length - 1] + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override
    public RecyclerView.q I() {
        return this.f11518s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.A r27) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$A):android.view.View");
    }

    @Override
    public boolean P1() {
        return this.f11513D == null && !this.f11495I;
    }

    @Override
    void R1(RecyclerView.A a2, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.f11496J;
        for (int i7 = 0; i7 < this.f11496J && cVar.c(a2) && iF > 0; i7++) {
            int i8 = cVar.f11541d;
            cVar2.a(i8, Math.max(0, cVar.f11544g));
            iF -= this.f11501O.f(i8);
            cVar.f11541d += cVar.f11542e;
        }
    }

    @Override
    public int S(RecyclerView.w wVar, RecyclerView.A a2) {
        if (this.f11518s == 1) {
            return this.f11496J;
        }
        if (a2.b() < 1) {
            return 0;
        }
        return Y2(wVar, a2, a2.b() - 1) + 1;
    }

    @Override
    public void T0(RecyclerView.w wVar, RecyclerView.A a2, View view, C3019t c3019t) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, c3019t);
            return;
        }
        b bVar = (b) layoutParams;
        int iY2 = Y2(wVar, a2, bVar.a());
        if (this.f11518s == 0) {
            c3019t.h0(C3019t.f.a(bVar.e(), bVar.f(), iY2, 1, false, false));
        } else {
            c3019t.h0(C3019t.f.a(iY2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override
    public void V0(RecyclerView recyclerView, int i7, int i8) {
        this.f11501O.h();
        this.f11501O.g();
    }

    @Override
    public void W0(RecyclerView recyclerView) {
        this.f11501O.h();
        this.f11501O.g();
    }

    int W2(int i7, int i8) {
        if (this.f11518s != 1 || !q2()) {
            int[] iArr = this.f11497K;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f11497K;
        int i9 = this.f11496J;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    @Override
    public void X0(RecyclerView recyclerView, int i7, int i8, int i9) {
        this.f11501O.h();
        this.f11501O.g();
    }

    public int X2() {
        return this.f11496J;
    }

    @Override
    public void Y0(RecyclerView recyclerView, int i7, int i8) {
        this.f11501O.h();
        this.f11501O.g();
    }

    @Override
    public void a1(RecyclerView recyclerView, int i7, int i8, Object obj) {
        this.f11501O.h();
        this.f11501O.g();
    }

    @Override
    public void b1(RecyclerView.w wVar, RecyclerView.A a2) {
        if (a2.e()) {
            O2();
        }
        super.b1(wVar, a2);
        R2();
    }

    @Override
    public void c1(RecyclerView.A a2) {
        super.c1(a2);
        this.f11495I = false;
    }

    public void e3(int i7) {
        if (i7 == this.f11496J) {
            return;
        }
        this.f11495I = true;
        if (i7 >= 1) {
            this.f11496J = i7;
            this.f11501O.h();
            x1();
        } else {
            throw new IllegalArgumentException(dHkZSUxHu.CudCwQqkW + i7);
        }
    }

    @Override
    View j2(RecyclerView.w wVar, RecyclerView.A a2, boolean z7, boolean z8) {
        int i7;
        int iO;
        int iO2 = O();
        int i8 = 1;
        if (z8) {
            iO = O() - 1;
            i7 = -1;
            i8 = -1;
        } else {
            i7 = iO2;
            iO = 0;
        }
        int iB = a2.b();
        X1();
        int iM = this.f11520u.m();
        int i9 = this.f11520u.i();
        View view = null;
        View view2 = null;
        while (iO != i7) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && Z2(wVar, a2, iL0) == 0) {
                if (((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f11520u.g(viewN) < i9 && this.f11520u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i8;
        }
        return view != null ? view : view2;
    }

    @Override
    public int o0(RecyclerView.w wVar, RecyclerView.A a2) {
        if (this.f11518s == 0) {
            return this.f11496J;
        }
        if (a2.b() < 1) {
            return 0;
        }
        return Y2(wVar, a2, a2.b() - 1) + 1;
    }

    @Override
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override
    void s2(RecyclerView.w wVar, RecyclerView.A a2, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iF;
        int iF2;
        int iF3;
        int i14;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f11520u.l();
        boolean z7 = iL != 1073741824;
        int i15 = O() > 0 ? this.f11497K[this.f11496J] : 0;
        if (z7) {
            f3();
        }
        boolean z8 = cVar.f11542e == 1;
        int iZ2 = this.f11496J;
        if (!z8) {
            iZ2 = Z2(wVar, a2, cVar.f11541d) + a3(wVar, a2, cVar.f11541d);
        }
        int i16 = 0;
        while (i16 < this.f11496J && cVar.c(a2) && iZ2 > 0) {
            int i17 = cVar.f11541d;
            int iA3 = a3(wVar, a2, i17);
            if (iA3 > this.f11496J) {
                throw new IllegalArgumentException("Item at position " + i17 + " requires " + iA3 + " spans but GridLayoutManager has only " + this.f11496J + " spans.");
            }
            iZ2 -= iA3;
            if (iZ2 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.f11498L[i16] = viewD;
            i16++;
        }
        if (i16 == 0) {
            bVar.f11535b = true;
            return;
        }
        N2(wVar, a2, i16, z8);
        float f7 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            View view = this.f11498L[i19];
            if (cVar.f11549l == null) {
                if (z8) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z8) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.f11502P);
            c3(view, iL, false);
            int iE = this.f11520u.e(view);
            if (iE > i18) {
                i18 = iE;
            }
            float f8 = (this.f11520u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f11505f;
            if (f8 > f7) {
                f7 = f8;
            }
        }
        if (z7) {
            b3(f7, i15);
            i18 = 0;
            for (int i20 = 0; i20 < i16; i20++) {
                View view2 = this.f11498L[i20];
                c3(view2, 1073741824, true);
                int iE2 = this.f11520u.e(view2);
                if (iE2 > i18) {
                    i18 = iE2;
                }
            }
        }
        for (int i21 = 0; i21 < i16; i21++) {
            View view3 = this.f11498L[i21];
            if (this.f11520u.e(view3) != i18) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f11727b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f11504e, bVar2.f11505f);
                if (this.f11518s == 1) {
                    iP2 = RecyclerView.p.P(iW2, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iP = RecyclerView.p.P(iW2, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                d3(view3, iP2, iP, true);
            }
        }
        bVar.f11534a = i18;
        if (this.f11518s == 1) {
            if (cVar.f11543f == -1) {
                i12 = cVar.f11539b;
                i14 = i12 - i18;
            } else {
                i14 = cVar.f11539b;
                i12 = i14 + i18;
            }
            i10 = i14;
            i11 = 0;
            i9 = 0;
        } else {
            if (cVar.f11543f == -1) {
                i8 = cVar.f11539b;
                i7 = i8 - i18;
            } else {
                i7 = cVar.f11539b;
                i8 = i7 + i18;
            }
            i9 = i7;
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        int i24 = 0;
        while (i24 < i16) {
            View view4 = this.f11498L[i24];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f11518s == 1) {
                if (q2()) {
                    int iI0 = i0() + this.f11497K[this.f11496J - bVar3.f11504e];
                    iF3 = i12;
                    iF = iI0;
                    iF2 = iI0 - this.f11520u.f(view4);
                } else {
                    int iI02 = i0() + this.f11497K[bVar3.f11504e];
                    iF3 = i12;
                    iF2 = iI02;
                    iF = this.f11520u.f(view4) + iI02;
                }
                i13 = i10;
            } else {
                int iK0 = k0() + this.f11497K[bVar3.f11504e];
                i13 = iK0;
                iF = i11;
                iF2 = i9;
                iF3 = this.f11520u.f(view4) + iK0;
            }
            D0(view4, iF2, i13, iF, iF3);
            if (bVar3.c() || bVar3.b()) {
                bVar.f11536c = true;
            }
            bVar.f11537d |= view4.hasFocusable();
            i24++;
            i12 = iF3;
            i11 = iF;
            i9 = iF2;
            i10 = i13;
        }
        Arrays.fill(this.f11498L, (Object) null);
    }

    @Override
    void u2(RecyclerView.w wVar, RecyclerView.A a2, LinearLayoutManager.a aVar, int i7) {
        super.u2(wVar, a2, aVar, i7);
        f3();
        if (a2.b() > 0 && !a2.e()) {
            U2(wVar, a2, aVar, i7);
        }
        V2();
    }

    @Override
    public int w(RecyclerView.A a2) {
        return this.f11503Q ? S2(a2) : super.w(a2);
    }

    @Override
    public int x(RecyclerView.A a2) {
        return this.f11503Q ? T2(a2) : super.x(a2);
    }

    @Override
    public int z(RecyclerView.A a2) {
        return this.f11503Q ? S2(a2) : super.z(a2);
    }

    public static class b extends RecyclerView.q {

        int f11504e;

        int f11505f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11504e = -1;
            this.f11505f = 0;
        }

        public int e() {
            return this.f11504e;
        }

        public int f() {
            return this.f11505f;
        }

        public b(int i7, int i8) {
            super(i7, i8);
            this.f11504e = -1;
            this.f11505f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11504e = -1;
            this.f11505f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11504e = -1;
            this.f11505f = 0;
        }
    }

    public GridLayoutManager(Context context, int i7) {
        super(context);
        this.f11495I = false;
        this.f11496J = -1;
        this.f11499M = new SparseIntArray();
        this.f11500N = new SparseIntArray();
        this.f11501O = new a();
        this.f11502P = new Rect();
        e3(i7);
    }

    public GridLayoutManager(Context context, int i7, int i8, boolean z7) {
        super(context, i8, z7);
        this.f11495I = false;
        this.f11496J = -1;
        this.f11499M = new SparseIntArray();
        this.f11500N = new SparseIntArray();
        this.f11501O = new a();
        this.f11502P = new Rect();
        e3(i7);
    }
}
