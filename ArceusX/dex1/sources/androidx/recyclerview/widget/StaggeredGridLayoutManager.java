package androidx.recyclerview.widget;

import K0.wJ.BtcVLuo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {

    private BitSet f11761B;

    private boolean f11766G;

    private boolean f11767H;

    private SavedState f11768I;

    private int f11769J;

    private int[] f11774O;

    d[] f11777t;

    p f11778u;

    p f11779v;

    private int f11780w;

    private int f11781x;

    private final l f11782y;

    private int f11776s = -1;

    boolean f11783z = false;

    boolean f11760A = false;

    int f11762C = -1;

    int f11763D = Integer.MIN_VALUE;

    LazySpanLookup f11764E = new LazySpanLookup();

    private int f11765F = 2;

    private final Rect f11770K = new Rect();

    private final b f11771L = new b();

    private boolean f11772M = false;

    private boolean f11773N = true;

    private final Runnable f11775P = new a();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        boolean f11790A;

        boolean f11791B;

        boolean f11792C;

        int f11793d;

        int f11794e;

        int f11795i;

        int[] f11796v;

        int f11797w;

        int[] f11798y;

        List<LazySpanLookup.FullSpanItem> f11799z;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState() {
        }

        void a() {
            this.f11796v = null;
            this.f11795i = 0;
            this.f11793d = -1;
            this.f11794e = -1;
        }

        void b() {
            this.f11796v = null;
            this.f11795i = 0;
            this.f11797w = 0;
            this.f11798y = null;
            this.f11799z = null;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f11793d);
            parcel.writeInt(this.f11794e);
            parcel.writeInt(this.f11795i);
            if (this.f11795i > 0) {
                parcel.writeIntArray(this.f11796v);
            }
            parcel.writeInt(this.f11797w);
            if (this.f11797w > 0) {
                parcel.writeIntArray(this.f11798y);
            }
            parcel.writeInt(this.f11790A ? 1 : 0);
            parcel.writeInt(this.f11791B ? 1 : 0);
            parcel.writeInt(this.f11792C ? 1 : 0);
            parcel.writeList(this.f11799z);
        }

        SavedState(Parcel parcel) {
            this.f11793d = parcel.readInt();
            this.f11794e = parcel.readInt();
            int i7 = parcel.readInt();
            this.f11795i = i7;
            if (i7 > 0) {
                int[] iArr = new int[i7];
                this.f11796v = iArr;
                parcel.readIntArray(iArr);
            }
            int i8 = parcel.readInt();
            this.f11797w = i8;
            if (i8 > 0) {
                int[] iArr2 = new int[i8];
                this.f11798y = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f11790A = parcel.readInt() == 1;
            this.f11791B = parcel.readInt() == 1;
            this.f11792C = parcel.readInt() == 1;
            this.f11799z = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f11795i = savedState.f11795i;
            this.f11793d = savedState.f11793d;
            this.f11794e = savedState.f11794e;
            this.f11796v = savedState.f11796v;
            this.f11797w = savedState.f11797w;
            this.f11798y = savedState.f11798y;
            this.f11790A = savedState.f11790A;
            this.f11791B = savedState.f11791B;
            this.f11792C = savedState.f11792C;
            this.f11799z = savedState.f11799z;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    class b {

        int f11801a;

        int f11802b;

        boolean f11803c;

        boolean f11804d;

        boolean f11805e;

        int[] f11806f;

        b() {
            c();
        }

        void a() {
            this.f11802b = this.f11803c ? StaggeredGridLayoutManager.this.f11778u.i() : StaggeredGridLayoutManager.this.f11778u.m();
        }

        void b(int i7) {
            if (this.f11803c) {
                this.f11802b = StaggeredGridLayoutManager.this.f11778u.i() - i7;
            } else {
                this.f11802b = StaggeredGridLayoutManager.this.f11778u.m() + i7;
            }
        }

        void c() {
            this.f11801a = -1;
            this.f11802b = Integer.MIN_VALUE;
            this.f11803c = false;
            this.f11804d = false;
            this.f11805e = false;
            int[] iArr = this.f11806f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f11806f;
            if (iArr == null || iArr.length < length) {
                this.f11806f = new int[StaggeredGridLayoutManager.this.f11777t.length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                this.f11806f[i7] = dVarArr[i7].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        d f11808e;

        boolean f11809f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f11809f;
        }

        public c(int i7, int i8) {
            super(i7, i8);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class d {

        ArrayList<View> f11810a = new ArrayList<>();

        int f11811b = Integer.MIN_VALUE;

        int f11812c = Integer.MIN_VALUE;

        int f11813d = 0;

        final int f11814e;

        d(int i7) {
            this.f11814e = i7;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f11808e = this;
            this.f11810a.add(view);
            this.f11812c = Integer.MIN_VALUE;
            if (this.f11810a.size() == 1) {
                this.f11811b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f11813d += StaggeredGridLayoutManager.this.f11778u.e(view);
            }
        }

        void b(boolean z7, int i7) {
            int iL = z7 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z7 || iL >= StaggeredGridLayoutManager.this.f11778u.i()) {
                if (z7 || iL <= StaggeredGridLayoutManager.this.f11778u.m()) {
                    if (i7 != Integer.MIN_VALUE) {
                        iL += i7;
                    }
                    this.f11812c = iL;
                    this.f11811b = iL;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList<View> arrayList = this.f11810a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f11812c = StaggeredGridLayoutManager.this.f11778u.d(view);
            if (cVarN.f11809f && (fullSpanItemF = StaggeredGridLayoutManager.this.f11764E.f(cVarN.a())) != null && fullSpanItemF.f11787e == 1) {
                this.f11812c += fullSpanItemF.a(this.f11814e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.f11810a.get(0);
            c cVarN = n(view);
            this.f11811b = StaggeredGridLayoutManager.this.f11778u.g(view);
            if (cVarN.f11809f && (fullSpanItemF = StaggeredGridLayoutManager.this.f11764E.f(cVarN.a())) != null && fullSpanItemF.f11787e == -1) {
                this.f11811b -= fullSpanItemF.a(this.f11814e);
            }
        }

        void e() {
            this.f11810a.clear();
            q();
            this.f11813d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f11783z ? i(this.f11810a.size() - 1, -1, true) : i(0, this.f11810a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f11783z ? i(0, this.f11810a.size(), true) : i(this.f11810a.size() - 1, -1, true);
        }

        int h(int i7, int i8, boolean z7, boolean z8, boolean z9) {
            int iM = StaggeredGridLayoutManager.this.f11778u.m();
            int i9 = StaggeredGridLayoutManager.this.f11778u.i();
            int i10 = i8 > i7 ? 1 : -1;
            while (i7 != i8) {
                View view = this.f11810a.get(i7);
                int iG = StaggeredGridLayoutManager.this.f11778u.g(view);
                int iD = StaggeredGridLayoutManager.this.f11778u.d(view);
                boolean z10 = false;
                boolean z11 = !z9 ? iG >= i9 : iG > i9;
                if (!z9 ? iD > iM : iD >= iM) {
                    z10 = true;
                }
                if (z11 && z10) {
                    if (z7 && z8) {
                        if (iG >= iM && iD <= i9) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z8) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i9) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i7 += i10;
            }
            return -1;
        }

        int i(int i7, int i8, boolean z7) {
            return h(i7, i8, false, false, z7);
        }

        public int j() {
            return this.f11813d;
        }

        int k() {
            int i7 = this.f11812c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            c();
            return this.f11812c;
        }

        int l(int i7) {
            int i8 = this.f11812c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f11810a.size() == 0) {
                return i7;
            }
            c();
            return this.f11812c;
        }

        public View m(int i7, int i8) {
            View view = null;
            if (i8 != -1) {
                int size = this.f11810a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f11810a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f11783z && staggeredGridLayoutManager.l0(view2) >= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f11783z && staggeredGridLayoutManager2.l0(view2) <= i7) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f11810a.size();
                int i9 = 0;
                while (i9 < size2) {
                    View view3 = this.f11810a.get(i9);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f11783z && staggeredGridLayoutManager3.l0(view3) <= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f11783z && staggeredGridLayoutManager4.l0(view3) >= i7) || !view3.hasFocusable()) {
                        break;
                    }
                    i9++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i7 = this.f11811b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            d();
            return this.f11811b;
        }

        int p(int i7) {
            int i8 = this.f11811b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f11810a.size() == 0) {
                return i7;
            }
            d();
            return this.f11811b;
        }

        void q() {
            this.f11811b = Integer.MIN_VALUE;
            this.f11812c = Integer.MIN_VALUE;
        }

        void r(int i7) {
            int i8 = this.f11811b;
            if (i8 != Integer.MIN_VALUE) {
                this.f11811b = i8 + i7;
            }
            int i9 = this.f11812c;
            if (i9 != Integer.MIN_VALUE) {
                this.f11812c = i9 + i7;
            }
        }

        void s() {
            int size = this.f11810a.size();
            View viewRemove = this.f11810a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f11808e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f11813d -= StaggeredGridLayoutManager.this.f11778u.e(viewRemove);
            }
            if (size == 1) {
                this.f11811b = Integer.MIN_VALUE;
            }
            this.f11812c = Integer.MIN_VALUE;
        }

        void t() {
            View viewRemove = this.f11810a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f11808e = null;
            if (this.f11810a.size() == 0) {
                this.f11812c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f11813d -= StaggeredGridLayoutManager.this.f11778u.e(viewRemove);
            }
            this.f11811b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f11808e = this;
            this.f11810a.add(0, view);
            this.f11811b = Integer.MIN_VALUE;
            if (this.f11810a.size() == 1) {
                this.f11812c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f11813d += StaggeredGridLayoutManager.this.f11778u.e(view);
            }
        }

        void v(int i7) {
            this.f11811b = i7;
            this.f11812c = i7;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i7, i8);
        L2(dVarM0.f11722a);
        N2(dVarM0.f11723b);
        M2(dVarM0.f11724c);
        this.f11782y = new l();
        e2();
    }

    private void A2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.A r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$A, boolean):void");
    }

    private boolean B2(int i7) {
        if (this.f11780w == 0) {
            return (i7 == -1) != this.f11760A;
        }
        return ((i7 == -1) == this.f11760A) == x2();
    }

    private void D2(View view) {
        for (int i7 = this.f11776s - 1; i7 >= 0; i7--) {
            this.f11777t[i7].u(view);
        }
    }

    private void E2(RecyclerView.w wVar, l lVar) {
        if (!lVar.f11995a || lVar.f12003i) {
            return;
        }
        if (lVar.f11996b == 0) {
            if (lVar.f11999e == -1) {
                F2(wVar, lVar.f12001g);
                return;
            } else {
                G2(wVar, lVar.f12000f);
                return;
            }
        }
        if (lVar.f11999e != -1) {
            int iR2 = r2(lVar.f12001g) - lVar.f12001g;
            G2(wVar, iR2 < 0 ? lVar.f12000f : Math.min(iR2, lVar.f11996b) + lVar.f12000f);
        } else {
            int i7 = lVar.f12000f;
            int iQ2 = i7 - q2(i7);
            F2(wVar, iQ2 < 0 ? lVar.f12001g : lVar.f12001g - Math.min(iQ2, lVar.f11996b));
        }
    }

    private void F2(RecyclerView.w wVar, int i7) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f11778u.g(viewN) < i7 || this.f11778u.q(viewN) < i7) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f11809f) {
                for (int i8 = 0; i8 < this.f11776s; i8++) {
                    if (this.f11777t[i8].f11810a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f11776s; i9++) {
                    this.f11777t[i9].s();
                }
            } else if (cVar.f11808e.f11810a.size() == 1) {
                return;
            } else {
                cVar.f11808e.s();
            }
            q1(viewN, wVar);
        }
    }

    private void G2(RecyclerView.w wVar, int i7) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f11778u.d(viewN) > i7 || this.f11778u.p(viewN) > i7) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f11809f) {
                for (int i8 = 0; i8 < this.f11776s; i8++) {
                    if (this.f11777t[i8].f11810a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f11776s; i9++) {
                    this.f11777t[i9].t();
                }
            } else if (cVar.f11808e.f11810a.size() == 1) {
                return;
            } else {
                cVar.f11808e.t();
            }
            q1(viewN, wVar);
        }
    }

    private void H2() {
        if (this.f11779v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < iO; i7++) {
            View viewN = N(i7);
            float fE = this.f11779v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f11776s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i8 = this.f11781x;
        int iRound = Math.round(fMax * this.f11776s);
        if (this.f11779v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f11779v.n());
        }
        T2(iRound);
        if (this.f11781x == i8) {
            return;
        }
        for (int i9 = 0; i9 < iO; i9++) {
            View viewN2 = N(i9);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f11809f) {
                if (x2() && this.f11780w == 1) {
                    int i10 = this.f11776s;
                    int i11 = cVar.f11808e.f11814e;
                    viewN2.offsetLeftAndRight(((-((i10 - 1) - i11)) * this.f11781x) - ((-((i10 - 1) - i11)) * i8));
                } else {
                    int i12 = cVar.f11808e.f11814e;
                    int i13 = this.f11781x * i12;
                    int i14 = i12 * i8;
                    if (this.f11780w == 1) {
                        viewN2.offsetLeftAndRight(i13 - i14);
                    } else {
                        viewN2.offsetTopAndBottom(i13 - i14);
                    }
                }
            }
        }
    }

    private void I2() {
        if (this.f11780w == 1 || !x2()) {
            this.f11760A = this.f11783z;
        } else {
            this.f11760A = !this.f11783z;
        }
    }

    private void K2(int i7) {
        l lVar = this.f11782y;
        lVar.f11999e = i7;
        lVar.f11998d = this.f11760A != (i7 == -1) ? -1 : 1;
    }

    private void O2(int i7, int i8) {
        for (int i9 = 0; i9 < this.f11776s; i9++) {
            if (!this.f11777t[i9].f11810a.isEmpty()) {
                U2(this.f11777t[i9], i7, i8);
            }
        }
    }

    private boolean P2(RecyclerView.A a2, b bVar) {
        bVar.f11801a = this.f11766G ? k2(a2.b()) : g2(a2.b());
        bVar.f11802b = Integer.MIN_VALUE;
        return true;
    }

    private void Q1(View view) {
        for (int i7 = this.f11776s - 1; i7 >= 0; i7--) {
            this.f11777t[i7].a(view);
        }
    }

    private void R1(b bVar) {
        SavedState savedState = this.f11768I;
        int i7 = savedState.f11795i;
        if (i7 > 0) {
            if (i7 == this.f11776s) {
                for (int i8 = 0; i8 < this.f11776s; i8++) {
                    this.f11777t[i8].e();
                    SavedState savedState2 = this.f11768I;
                    int i9 = savedState2.f11796v[i8];
                    if (i9 != Integer.MIN_VALUE) {
                        i9 += savedState2.f11791B ? this.f11778u.i() : this.f11778u.m();
                    }
                    this.f11777t[i8].v(i9);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.f11768I;
                savedState3.f11793d = savedState3.f11794e;
            }
        }
        SavedState savedState4 = this.f11768I;
        this.f11767H = savedState4.f11792C;
        M2(savedState4.f11790A);
        I2();
        SavedState savedState5 = this.f11768I;
        int i10 = savedState5.f11793d;
        if (i10 != -1) {
            this.f11762C = i10;
            bVar.f11803c = savedState5.f11791B;
        } else {
            bVar.f11803c = this.f11760A;
        }
        if (savedState5.f11797w > 1) {
            LazySpanLookup lazySpanLookup = this.f11764E;
            lazySpanLookup.f11784a = savedState5.f11798y;
            lazySpanLookup.f11785b = savedState5.f11799z;
        }
    }

    private void S2(int i7, RecyclerView.A a2) {
        int iN;
        int iN2;
        int iC;
        l lVar = this.f11782y;
        boolean z7 = false;
        lVar.f11996b = 0;
        lVar.f11997c = i7;
        if (!B0() || (iC = a2.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f11760A == (iC < i7)) {
                iN = this.f11778u.n();
                iN2 = 0;
            } else {
                iN2 = this.f11778u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f11782y.f12000f = this.f11778u.m() - iN2;
            this.f11782y.f12001g = this.f11778u.i() + iN;
        } else {
            this.f11782y.f12001g = this.f11778u.h() + iN;
            this.f11782y.f12000f = -iN2;
        }
        l lVar2 = this.f11782y;
        lVar2.f12002h = false;
        lVar2.f11995a = true;
        if (this.f11778u.k() == 0 && this.f11778u.h() == 0) {
            z7 = true;
        }
        lVar2.f12003i = z7;
    }

    private void U1(View view, c cVar, l lVar) {
        if (lVar.f11999e == 1) {
            if (cVar.f11809f) {
                Q1(view);
                return;
            } else {
                cVar.f11808e.a(view);
                return;
            }
        }
        if (cVar.f11809f) {
            D2(view);
        } else {
            cVar.f11808e.u(view);
        }
    }

    private void U2(d dVar, int i7, int i8) {
        int iJ = dVar.j();
        if (i7 == -1) {
            if (dVar.o() + iJ <= i8) {
                this.f11761B.set(dVar.f11814e, false);
            }
        } else if (dVar.k() - iJ >= i8) {
            this.f11761B.set(dVar.f11814e, false);
        }
    }

    private int V1(int i7) {
        if (O() == 0) {
            return this.f11760A ? 1 : -1;
        }
        return (i7 < n2()) != this.f11760A ? -1 : 1;
    }

    private int V2(int i7, int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return i7;
        }
        int mode = View.MeasureSpec.getMode(i7);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode) : i7;
    }

    private boolean X1(d dVar) {
        if (this.f11760A) {
            if (dVar.k() < this.f11778u.i()) {
                ArrayList<View> arrayList = dVar.f11810a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f11809f;
            }
        } else if (dVar.o() > this.f11778u.m()) {
            return !dVar.n(dVar.f11810a.get(0)).f11809f;
        }
        return false;
    }

    private int Y1(RecyclerView.A a2) {
        if (O() == 0) {
            return 0;
        }
        return s.a(a2, this.f11778u, i2(!this.f11773N), h2(!this.f11773N), this, this.f11773N);
    }

    private int Z1(RecyclerView.A a2) {
        if (O() == 0) {
            return 0;
        }
        return s.b(a2, this.f11778u, i2(!this.f11773N), h2(!this.f11773N), this, this.f11773N, this.f11760A);
    }

    private int a2(RecyclerView.A a2) {
        if (O() == 0) {
            return 0;
        }
        return s.c(a2, this.f11778u, i2(!this.f11773N), h2(!this.f11773N), this, this.f11773N);
    }

    private int b2(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f11780w == 1) ? 1 : Integer.MIN_VALUE : this.f11780w == 0 ? 1 : Integer.MIN_VALUE : this.f11780w == 1 ? -1 : Integer.MIN_VALUE : this.f11780w == 0 ? -1 : Integer.MIN_VALUE : (this.f11780w != 1 && x2()) ? -1 : 1 : (this.f11780w != 1 && x2()) ? 1 : -1;
    }

    private LazySpanLookup.FullSpanItem c2(int i7) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f11788i = new int[this.f11776s];
        for (int i8 = 0; i8 < this.f11776s; i8++) {
            fullSpanItem.f11788i[i8] = i7 - this.f11777t[i8].l(i7);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem d2(int i7) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f11788i = new int[this.f11776s];
        for (int i8 = 0; i8 < this.f11776s; i8++) {
            fullSpanItem.f11788i[i8] = this.f11777t[i8].p(i7) - i7;
        }
        return fullSpanItem;
    }

    private void e2() {
        this.f11778u = p.b(this, this.f11780w);
        this.f11779v = p.b(this, 1 - this.f11780w);
    }

    private int f2(RecyclerView.w wVar, l lVar, RecyclerView.A a2) {
        d dVarT2;
        int iE;
        int i7;
        int iE2;
        int iE3;
        boolean z7;
        ?? r9 = 0;
        this.f11761B.set(0, this.f11776s, true);
        int i8 = this.f11782y.f12003i ? lVar.f11999e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : lVar.f11999e == 1 ? lVar.f12001g + lVar.f11996b : lVar.f12000f - lVar.f11996b;
        O2(lVar.f11999e, i8);
        int i9 = this.f11760A ? this.f11778u.i() : this.f11778u.m();
        boolean z8 = false;
        while (lVar.a(a2) && (this.f11782y.f12003i || !this.f11761B.isEmpty())) {
            View viewB = lVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.f11764E.g(iA);
            boolean z9 = iG == -1 ? true : r9;
            if (z9) {
                dVarT2 = cVar.f11809f ? this.f11777t[r9] : t2(lVar);
                this.f11764E.n(iA, dVarT2);
            } else {
                dVarT2 = this.f11777t[iG];
            }
            d dVar = dVarT2;
            cVar.f11808e = dVar;
            if (lVar.f11999e == 1) {
                i(viewB);
            } else {
                j(viewB, r9);
            }
            z2(viewB, cVar, r9);
            if (lVar.f11999e == 1) {
                int iP2 = cVar.f11809f ? p2(i9) : dVar.l(i9);
                int iE4 = this.f11778u.e(viewB) + iP2;
                if (z9 && cVar.f11809f) {
                    LazySpanLookup.FullSpanItem fullSpanItemC2 = c2(iP2);
                    fullSpanItemC2.f11787e = -1;
                    fullSpanItemC2.f11786d = iA;
                    this.f11764E.a(fullSpanItemC2);
                }
                i7 = iE4;
                iE = iP2;
            } else {
                int iS2 = cVar.f11809f ? s2(i9) : dVar.p(i9);
                iE = iS2 - this.f11778u.e(viewB);
                if (z9 && cVar.f11809f) {
                    LazySpanLookup.FullSpanItem fullSpanItemD2 = d2(iS2);
                    fullSpanItemD2.f11787e = 1;
                    fullSpanItemD2.f11786d = iA;
                    this.f11764E.a(fullSpanItemD2);
                }
                i7 = iS2;
            }
            if (cVar.f11809f && lVar.f11998d == -1) {
                if (z9) {
                    this.f11772M = true;
                } else {
                    if (!(lVar.f11999e == 1 ? S1() : T1())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = this.f11764E.f(iA);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.f11789v = true;
                        }
                        this.f11772M = true;
                    }
                }
            }
            U1(viewB, cVar, lVar);
            if (x2() && this.f11780w == 1) {
                int i10 = cVar.f11809f ? this.f11779v.i() : this.f11779v.i() - (((this.f11776s - 1) - dVar.f11814e) * this.f11781x);
                iE3 = i10;
                iE2 = i10 - this.f11779v.e(viewB);
            } else {
                int iM = cVar.f11809f ? this.f11779v.m() : (dVar.f11814e * this.f11781x) + this.f11779v.m();
                iE2 = iM;
                iE3 = this.f11779v.e(viewB) + iM;
            }
            if (this.f11780w == 1) {
                D0(viewB, iE2, iE, iE3, i7);
            } else {
                D0(viewB, iE, iE2, i7, iE3);
            }
            if (cVar.f11809f) {
                O2(this.f11782y.f11999e, i8);
            } else {
                U2(dVar, this.f11782y.f11999e, i8);
            }
            E2(wVar, this.f11782y);
            if (!this.f11782y.f12002h || !viewB.hasFocusable()) {
                z7 = false;
            } else if (cVar.f11809f) {
                this.f11761B.clear();
                z7 = false;
            } else {
                z7 = false;
                this.f11761B.set(dVar.f11814e, false);
            }
            r9 = z7;
            z8 = true;
        }
        int i11 = r9;
        if (!z8) {
            E2(wVar, this.f11782y);
        }
        int iM2 = this.f11782y.f11999e == -1 ? this.f11778u.m() - s2(this.f11778u.m()) : p2(this.f11778u.i()) - this.f11778u.i();
        return iM2 > 0 ? Math.min(lVar.f11996b, iM2) : i11;
    }

    private int g2(int i7) {
        int iO = O();
        for (int i8 = 0; i8 < iO; i8++) {
            int iL0 = l0(N(i8));
            if (iL0 >= 0 && iL0 < i7) {
                return iL0;
            }
        }
        return 0;
    }

    private int k2(int i7) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i7) {
                return iL0;
            }
        }
        return 0;
    }

    private void l2(RecyclerView.w wVar, RecyclerView.A a2, boolean z7) {
        int i7;
        int iP2 = p2(Integer.MIN_VALUE);
        if (iP2 != Integer.MIN_VALUE && (i7 = this.f11778u.i() - iP2) > 0) {
            int i8 = i7 - (-J2(-i7, wVar, a2));
            if (!z7 || i8 <= 0) {
                return;
            }
            this.f11778u.r(i8);
        }
    }

    private void m2(RecyclerView.w wVar, RecyclerView.A a2, boolean z7) {
        int iM;
        int iS2 = s2(Integer.MAX_VALUE);
        if (iS2 != Integer.MAX_VALUE && (iM = iS2 - this.f11778u.m()) > 0) {
            int iJ2 = iM - J2(iM, wVar, a2);
            if (!z7 || iJ2 <= 0) {
                return;
            }
            this.f11778u.r(-iJ2);
        }
    }

    private int p2(int i7) {
        int iL = this.f11777t[0].l(i7);
        for (int i8 = 1; i8 < this.f11776s; i8++) {
            int iL2 = this.f11777t[i8].l(i7);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int q2(int i7) {
        int iP = this.f11777t[0].p(i7);
        for (int i8 = 1; i8 < this.f11776s; i8++) {
            int iP2 = this.f11777t[i8].p(i7);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int r2(int i7) {
        int iL = this.f11777t[0].l(i7);
        for (int i8 = 1; i8 < this.f11776s; i8++) {
            int iL2 = this.f11777t[i8].l(i7);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int s2(int i7) {
        int iP = this.f11777t[0].p(i7);
        for (int i8 = 1; i8 < this.f11776s; i8++) {
            int iP2 = this.f11777t[i8].p(i7);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private d t2(l lVar) {
        int i7;
        int i8;
        int i9;
        if (B2(lVar.f11999e)) {
            i8 = this.f11776s - 1;
            i7 = -1;
            i9 = -1;
        } else {
            i7 = this.f11776s;
            i8 = 0;
            i9 = 1;
        }
        d dVar = null;
        if (lVar.f11999e == 1) {
            int iM = this.f11778u.m();
            int i10 = Integer.MAX_VALUE;
            while (i8 != i7) {
                d dVar2 = this.f11777t[i8];
                int iL = dVar2.l(iM);
                if (iL < i10) {
                    dVar = dVar2;
                    i10 = iL;
                }
                i8 += i9;
            }
            return dVar;
        }
        int i11 = this.f11778u.i();
        int i12 = Integer.MIN_VALUE;
        while (i8 != i7) {
            d dVar3 = this.f11777t[i8];
            int iP = dVar3.p(i11);
            if (iP > i12) {
                dVar = dVar3;
                i12 = iP;
            }
            i8 += i9;
        }
        return dVar;
    }

    private void u2(int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u2(int, int, int):void");
    }

    private void y2(View view, int i7, int i8, boolean z7) {
        o(view, this.f11770K);
        c cVar = (c) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f11770K;
        int iV2 = V2(i7, i9 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f11770K;
        int iV22 = V2(i8, i10 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z7 ? L1(view, iV2, iV22, cVar) : J1(view, iV2, iV22, cVar)) {
            view.measure(iV2, iV22);
        }
    }

    private void z2(View view, c cVar, boolean z7) {
        if (cVar.f11809f) {
            if (this.f11780w == 1) {
                y2(view, this.f11769J, RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z7);
                return;
            } else {
                y2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f11769J, z7);
                return;
            }
        }
        if (this.f11780w == 1) {
            y2(view, RecyclerView.p.P(this.f11781x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z7);
        } else {
            y2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.P(this.f11781x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z7);
        }
    }

    @Override
    public int A(RecyclerView.A a2) {
        return a2(a2);
    }

    @Override
    public int A1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        return J2(i7, wVar, a2);
    }

    @Override
    public void B1(int i7) {
        SavedState savedState = this.f11768I;
        if (savedState != null && savedState.f11793d != i7) {
            savedState.a();
        }
        this.f11762C = i7;
        this.f11763D = Integer.MIN_VALUE;
        x1();
    }

    @Override
    public int C1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        return J2(i7, wVar, a2);
    }

    void C2(int i7, RecyclerView.A a2) {
        int iN2;
        int i8;
        if (i7 > 0) {
            iN2 = o2();
            i8 = 1;
        } else {
            iN2 = n2();
            i8 = -1;
        }
        this.f11782y.f11995a = true;
        S2(iN2, a2);
        K2(i8);
        l lVar = this.f11782y;
        lVar.f11997c = iN2 + lVar.f11998d;
        lVar.f11996b = Math.abs(i7);
    }

    @Override
    public void G0(int i7) {
        super.G0(i7);
        for (int i8 = 0; i8 < this.f11776s; i8++) {
            this.f11777t[i8].r(i7);
        }
    }

    @Override
    public void G1(Rect rect, int i7, int i8) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f11780w == 1) {
            iS2 = RecyclerView.p.s(i8, rect.height() + iK0, f0());
            iS = RecyclerView.p.s(i7, (this.f11781x * this.f11776s) + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i7, rect.width() + iI0, g0());
            iS2 = RecyclerView.p.s(i8, (this.f11781x * this.f11776s) + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override
    public void H0(int i7) {
        super.H0(i7);
        for (int i8 = 0; i8 < this.f11776s; i8++) {
            this.f11777t[i8].r(i7);
        }
    }

    @Override
    public RecyclerView.q I() {
        return this.f11780w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override
    public void I0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f11764E.b();
        for (int i7 = 0; i7 < this.f11776s; i7++) {
            this.f11777t[i7].e();
        }
    }

    @Override
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int J2(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (O() == 0 || i7 == 0) {
            return 0;
        }
        C2(i7, a2);
        int iF2 = f2(wVar, this.f11782y, a2);
        if (this.f11782y.f11996b >= iF2) {
            i7 = i7 < 0 ? -iF2 : iF2;
        }
        this.f11778u.r(-i7);
        this.f11766G = this.f11760A;
        l lVar = this.f11782y;
        lVar.f11996b = 0;
        E2(wVar, lVar);
        return i7;
    }

    @Override
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void L2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(BtcVLuo.ntYkqLwfyTcip);
        }
        l(null);
        if (i7 == this.f11780w) {
            return;
        }
        this.f11780w = i7;
        p pVar = this.f11778u;
        this.f11778u = this.f11779v;
        this.f11779v = pVar;
        x1();
    }

    @Override
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        s1(this.f11775P);
        for (int i7 = 0; i7 < this.f11776s; i7++) {
            this.f11777t[i7].e();
        }
        recyclerView.requestLayout();
    }

    @Override
    public void M1(RecyclerView recyclerView, RecyclerView.A a2, int i7) {
        m mVar = new m(recyclerView.getContext());
        mVar.p(i7);
        N1(mVar);
    }

    public void M2(boolean z7) {
        l(null);
        SavedState savedState = this.f11768I;
        if (savedState != null && savedState.f11790A != z7) {
            savedState.f11790A = z7;
        }
        this.f11783z = z7;
        x1();
    }

    @Override
    public View N0(View view, int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        I2();
        int iB2 = b2(i7);
        if (iB2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z7 = cVar.f11809f;
        d dVar = cVar.f11808e;
        int iO2 = iB2 == 1 ? o2() : n2();
        S2(iO2, a2);
        K2(iB2);
        l lVar = this.f11782y;
        lVar.f11997c = lVar.f11998d + iO2;
        lVar.f11996b = (int) (this.f11778u.n() * 0.33333334f);
        l lVar2 = this.f11782y;
        lVar2.f12002h = true;
        lVar2.f11995a = false;
        f2(wVar, lVar2, a2);
        this.f11766G = this.f11760A;
        if (!z7 && (viewM = dVar.m(iO2, iB2)) != null && viewM != viewG) {
            return viewM;
        }
        if (B2(iB2)) {
            for (int i8 = this.f11776s - 1; i8 >= 0; i8--) {
                View viewM2 = this.f11777t[i8].m(iO2, iB2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f11776s; i9++) {
                View viewM3 = this.f11777t[i9].m(iO2, iB2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z8 = (this.f11783z ^ true) == (iB2 == -1);
        if (!z7) {
            View viewH = H(z8 ? dVar.f() : dVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (B2(iB2)) {
            for (int i10 = this.f11776s - 1; i10 >= 0; i10--) {
                if (i10 != dVar.f11814e) {
                    View viewH2 = H(z8 ? this.f11777t[i10].f() : this.f11777t[i10].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < this.f11776s; i11++) {
                View viewH3 = H(z8 ? this.f11777t[i11].f() : this.f11777t[i11].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void N2(int i7) {
        l(null);
        if (i7 != this.f11776s) {
            w2();
            this.f11776s = i7;
            this.f11761B = new BitSet(this.f11776s);
            this.f11777t = new d[this.f11776s];
            for (int i8 = 0; i8 < this.f11776s; i8++) {
                this.f11777t[i8] = new d(i8);
            }
            x1();
        }
    }

    @Override
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            View viewI2 = i2(false);
            View viewH2 = h2(false);
            if (viewI2 == null || viewH2 == null) {
                return;
            }
            int iL0 = l0(viewI2);
            int iL02 = l0(viewH2);
            if (iL0 < iL02) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL02);
            } else {
                accessibilityEvent.setFromIndex(iL02);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override
    public boolean P1() {
        return this.f11768I == null;
    }

    boolean Q2(RecyclerView.A a2, b bVar) {
        int i7;
        if (!a2.e() && (i7 = this.f11762C) != -1) {
            if (i7 >= 0 && i7 < a2.b()) {
                SavedState savedState = this.f11768I;
                if (savedState == null || savedState.f11793d == -1 || savedState.f11795i < 1) {
                    View viewH = H(this.f11762C);
                    if (viewH != null) {
                        bVar.f11801a = this.f11760A ? o2() : n2();
                        if (this.f11763D != Integer.MIN_VALUE) {
                            if (bVar.f11803c) {
                                bVar.f11802b = (this.f11778u.i() - this.f11763D) - this.f11778u.d(viewH);
                            } else {
                                bVar.f11802b = (this.f11778u.m() + this.f11763D) - this.f11778u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f11778u.e(viewH) > this.f11778u.n()) {
                            bVar.f11802b = bVar.f11803c ? this.f11778u.i() : this.f11778u.m();
                            return true;
                        }
                        int iG = this.f11778u.g(viewH) - this.f11778u.m();
                        if (iG < 0) {
                            bVar.f11802b = -iG;
                            return true;
                        }
                        int i8 = this.f11778u.i() - this.f11778u.d(viewH);
                        if (i8 < 0) {
                            bVar.f11802b = i8;
                            return true;
                        }
                        bVar.f11802b = Integer.MIN_VALUE;
                    } else {
                        int i9 = this.f11762C;
                        bVar.f11801a = i9;
                        int i10 = this.f11763D;
                        if (i10 == Integer.MIN_VALUE) {
                            bVar.f11803c = V1(i9) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i10);
                        }
                        bVar.f11804d = true;
                    }
                } else {
                    bVar.f11802b = Integer.MIN_VALUE;
                    bVar.f11801a = this.f11762C;
                }
                return true;
            }
            this.f11762C = -1;
            this.f11763D = Integer.MIN_VALUE;
        }
        return false;
    }

    void R2(RecyclerView.A a2, b bVar) {
        if (Q2(a2, bVar) || P2(a2, bVar)) {
            return;
        }
        bVar.a();
        bVar.f11801a = 0;
    }

    boolean S1() {
        int iL = this.f11777t[0].l(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f11776s; i7++) {
            if (this.f11777t[i7].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean T1() {
        int iP = this.f11777t[0].p(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f11776s; i7++) {
            if (this.f11777t[i7].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void T2(int i7) {
        this.f11781x = i7 / this.f11776s;
        this.f11769J = View.MeasureSpec.makeMeasureSpec(i7, this.f11779v.k());
    }

    @Override
    public void V0(RecyclerView recyclerView, int i7, int i8) {
        u2(i7, i8, 1);
    }

    @Override
    public void W0(RecyclerView recyclerView) {
        this.f11764E.b();
        x1();
    }

    boolean W1() {
        int iN2;
        int iO2;
        if (O() == 0 || this.f11765F == 0 || !v0()) {
            return false;
        }
        if (this.f11760A) {
            iN2 = o2();
            iO2 = n2();
        } else {
            iN2 = n2();
            iO2 = o2();
        }
        if (iN2 == 0 && v2() != null) {
            this.f11764E.b();
            y1();
            x1();
            return true;
        }
        if (!this.f11772M) {
            return false;
        }
        int i7 = this.f11760A ? -1 : 1;
        int i8 = iO2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.f11764E.e(iN2, i8, i7, true);
        if (fullSpanItemE == null) {
            this.f11772M = false;
            this.f11764E.d(i8);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.f11764E.e(iN2, fullSpanItemE.f11786d, i7 * (-1), true);
        if (fullSpanItemE2 == null) {
            this.f11764E.d(fullSpanItemE.f11786d);
        } else {
            this.f11764E.d(fullSpanItemE2.f11786d + 1);
        }
        y1();
        x1();
        return true;
    }

    @Override
    public void X0(RecyclerView recyclerView, int i7, int i8, int i9) {
        u2(i7, i8, 8);
    }

    @Override
    public void Y0(RecyclerView recyclerView, int i7, int i8) {
        u2(i7, i8, 2);
    }

    @Override
    public void a1(RecyclerView recyclerView, int i7, int i8, Object obj) {
        u2(i7, i8, 4);
    }

    @Override
    public void b1(RecyclerView.w wVar, RecyclerView.A a2) {
        A2(wVar, a2, true);
    }

    @Override
    public PointF c(int i7) {
        int iV1 = V1(i7);
        PointF pointF = new PointF();
        if (iV1 == 0) {
            return null;
        }
        if (this.f11780w == 0) {
            pointF.x = iV1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV1;
        }
        return pointF;
    }

    @Override
    public void c1(RecyclerView.A a2) {
        super.c1(a2);
        this.f11762C = -1;
        this.f11763D = Integer.MIN_VALUE;
        this.f11768I = null;
        this.f11771L.c();
    }

    @Override
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f11768I = savedState;
            if (this.f11762C != -1) {
                savedState.a();
                this.f11768I.b();
            }
            x1();
        }
    }

    @Override
    public Parcelable h1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f11768I != null) {
            return new SavedState(this.f11768I);
        }
        SavedState savedState = new SavedState();
        savedState.f11790A = this.f11783z;
        savedState.f11791B = this.f11766G;
        savedState.f11792C = this.f11767H;
        LazySpanLookup lazySpanLookup = this.f11764E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f11784a) == null) {
            savedState.f11797w = 0;
        } else {
            savedState.f11798y = iArr;
            savedState.f11797w = iArr.length;
            savedState.f11799z = lazySpanLookup.f11785b;
        }
        if (O() > 0) {
            savedState.f11793d = this.f11766G ? o2() : n2();
            savedState.f11794e = j2();
            int i7 = this.f11776s;
            savedState.f11795i = i7;
            savedState.f11796v = new int[i7];
            for (int i8 = 0; i8 < this.f11776s; i8++) {
                if (this.f11766G) {
                    iP = this.f11777t[i8].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f11778u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f11777t[i8].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f11778u.m();
                        iP -= iM;
                    }
                }
                savedState.f11796v[i8] = iP;
            }
        } else {
            savedState.f11793d = -1;
            savedState.f11794e = -1;
            savedState.f11795i = 0;
        }
        return savedState;
    }

    View h2(boolean z7) {
        int iM = this.f11778u.m();
        int i7 = this.f11778u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f11778u.g(viewN);
            int iD = this.f11778u.d(viewN);
            if (iD > iM && iG < i7) {
                if (iD <= i7 || !z7) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override
    public void i1(int i7) {
        if (i7 == 0) {
            W1();
        }
    }

    View i2(boolean z7) {
        int iM = this.f11778u.m();
        int i7 = this.f11778u.i();
        int iO = O();
        View view = null;
        for (int i8 = 0; i8 < iO; i8++) {
            View viewN = N(i8);
            int iG = this.f11778u.g(viewN);
            if (this.f11778u.d(viewN) > iM && iG < i7) {
                if (iG >= iM || !z7) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int j2() {
        View viewH2 = this.f11760A ? h2(true) : i2(true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    @Override
    public void l(String str) {
        if (this.f11768I == null) {
            super.l(str);
        }
    }

    int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    int o2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override
    public boolean p() {
        return this.f11780w == 0;
    }

    @Override
    public boolean q() {
        return this.f11780w == 1;
    }

    @Override
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override
    public void t(int i7, int i8, RecyclerView.A a2, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f11780w != 0) {
            i7 = i8;
        }
        if (O() == 0 || i7 == 0) {
            return;
        }
        C2(i7, a2);
        int[] iArr = this.f11774O;
        if (iArr == null || iArr.length < this.f11776s) {
            this.f11774O = new int[this.f11776s];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f11776s; i10++) {
            l lVar = this.f11782y;
            if (lVar.f11998d == -1) {
                iL = lVar.f12000f;
                iP = this.f11777t[i10].p(iL);
            } else {
                iL = this.f11777t[i10].l(lVar.f12001g);
                iP = this.f11782y.f12001g;
            }
            int i11 = iL - iP;
            if (i11 >= 0) {
                this.f11774O[i9] = i11;
                i9++;
            }
        }
        Arrays.sort(this.f11774O, 0, i9);
        for (int i12 = 0; i12 < i9 && this.f11782y.a(a2); i12++) {
            cVar.a(this.f11782y.f11997c, this.f11774O[i12]);
            l lVar2 = this.f11782y;
            lVar2.f11997c += lVar2.f11998d;
        }
    }

    @Override
    public int v(RecyclerView.A a2) {
        return Y1(a2);
    }

    android.view.View v2() {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2():android.view.View");
    }

    @Override
    public int w(RecyclerView.A a2) {
        return Z1(a2);
    }

    @Override
    public boolean w0() {
        return this.f11765F != 0;
    }

    public void w2() {
        this.f11764E.b();
        x1();
    }

    @Override
    public int x(RecyclerView.A a2) {
        return a2(a2);
    }

    boolean x2() {
        return d0() == 1;
    }

    @Override
    public int y(RecyclerView.A a2) {
        return Y1(a2);
    }

    @Override
    public int z(RecyclerView.A a2) {
        return Z1(a2);
    }

    static class LazySpanLookup {

        int[] f11784a;

        List<FullSpanItem> f11785b;

        LazySpanLookup() {
        }

        private int i(int i7) {
            if (this.f11785b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i7);
            if (fullSpanItemF != null) {
                this.f11785b.remove(fullSpanItemF);
            }
            int size = this.f11785b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                }
                if (this.f11785b.get(i8).f11786d >= i7) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f11785b.get(i8);
            this.f11785b.remove(i8);
            return fullSpanItem.f11786d;
        }

        private void l(int i7, int i8) {
            List<FullSpanItem> list = this.f11785b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f11785b.get(size);
                int i9 = fullSpanItem.f11786d;
                if (i9 >= i7) {
                    fullSpanItem.f11786d = i9 + i8;
                }
            }
        }

        private void m(int i7, int i8) {
            List<FullSpanItem> list = this.f11785b;
            if (list == null) {
                return;
            }
            int i9 = i7 + i8;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f11785b.get(size);
                int i10 = fullSpanItem.f11786d;
                if (i10 >= i7) {
                    if (i10 < i9) {
                        this.f11785b.remove(size);
                    } else {
                        fullSpanItem.f11786d = i10 - i8;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f11785b == null) {
                this.f11785b = new ArrayList();
            }
            int size = this.f11785b.size();
            for (int i7 = 0; i7 < size; i7++) {
                FullSpanItem fullSpanItem2 = this.f11785b.get(i7);
                if (fullSpanItem2.f11786d == fullSpanItem.f11786d) {
                    this.f11785b.remove(i7);
                }
                if (fullSpanItem2.f11786d >= fullSpanItem.f11786d) {
                    this.f11785b.add(i7, fullSpanItem);
                    return;
                }
            }
            this.f11785b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f11784a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11785b = null;
        }

        void c(int i7) {
            int[] iArr = this.f11784a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i7, 10) + 1];
                this.f11784a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[o(i7)];
                this.f11784a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f11784a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i7) {
            List<FullSpanItem> list = this.f11785b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f11785b.get(size).f11786d >= i7) {
                        this.f11785b.remove(size);
                    }
                }
            }
            return h(i7);
        }

        public FullSpanItem e(int i7, int i8, int i9, boolean z7) {
            List<FullSpanItem> list = this.f11785b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem = this.f11785b.get(i10);
                int i11 = fullSpanItem.f11786d;
                if (i11 >= i8) {
                    return null;
                }
                if (i11 >= i7 && (i9 == 0 || fullSpanItem.f11787e == i9 || (z7 && fullSpanItem.f11789v))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i7) {
            List<FullSpanItem> list = this.f11785b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f11785b.get(size);
                if (fullSpanItem.f11786d == i7) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i7) {
            int[] iArr = this.f11784a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            return iArr[i7];
        }

        int h(int i7) {
            int[] iArr = this.f11784a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            int i8 = i(i7);
            if (i8 == -1) {
                int[] iArr2 = this.f11784a;
                Arrays.fill(iArr2, i7, iArr2.length, -1);
                return this.f11784a.length;
            }
            int iMin = Math.min(i8 + 1, this.f11784a.length);
            Arrays.fill(this.f11784a, i7, iMin, -1);
            return iMin;
        }

        void j(int i7, int i8) {
            int[] iArr = this.f11784a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            c(i9);
            int[] iArr2 = this.f11784a;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill(this.f11784a, i7, i9, -1);
            l(i7, i8);
        }

        void k(int i7, int i8) {
            int[] iArr = this.f11784a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            c(i9);
            int[] iArr2 = this.f11784a;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = this.f11784a;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            m(i7, i8);
        }

        void n(int i7, d dVar) {
            c(i7);
            this.f11784a[i7] = dVar.f11814e;
        }

        int o(int i7) {
            int length = this.f11784a.length;
            while (length <= i7) {
                length *= 2;
            }
            return length;
        }

        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            int f11786d;

            int f11787e;

            int[] f11788i;

            boolean f11789v;

            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override
                public FullSpanItem[] newArray(int i7) {
                    return new FullSpanItem[i7];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f11786d = parcel.readInt();
                this.f11787e = parcel.readInt();
                this.f11789v = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    this.f11788i = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i7) {
                int[] iArr = this.f11788i;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i7];
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f11786d + ", mGapDir=" + this.f11787e + ", mHasUnwantedGapAfter=" + this.f11789v + ", mGapPerSpan=" + Arrays.toString(this.f11788i) + '}';
            }

            @Override
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f11786d);
                parcel.writeInt(this.f11787e);
                parcel.writeInt(this.f11789v ? 1 : 0);
                int[] iArr = this.f11788i;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f11788i);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
