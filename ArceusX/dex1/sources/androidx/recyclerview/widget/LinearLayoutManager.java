package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import t4.gYZ.uCYQMIHsy;

public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {

    int f11510A;

    int f11511B;

    private boolean f11512C;

    SavedState f11513D;

    final a f11514E;

    private final b f11515F;

    private int f11516G;

    private int[] f11517H;

    int f11518s;

    private c f11519t;

    p f11520u;

    private boolean f11521v;

    private boolean f11522w;

    boolean f11523x;

    private boolean f11524y;

    private boolean f11525z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        int f11526d;

        int f11527e;

        boolean f11528i;

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

        boolean a() {
            return this.f11526d >= 0;
        }

        void b() {
            this.f11526d = -1;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f11526d);
            parcel.writeInt(this.f11527e);
            parcel.writeInt(this.f11528i ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f11526d = parcel.readInt();
            this.f11527e = parcel.readInt();
            this.f11528i = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f11526d = savedState.f11526d;
            this.f11527e = savedState.f11527e;
            this.f11528i = savedState.f11528i;
        }
    }

    static class a {

        p f11529a;

        int f11530b;

        int f11531c;

        boolean f11532d;

        boolean f11533e;

        a() {
            e();
        }

        void a() {
            this.f11531c = this.f11532d ? this.f11529a.i() : this.f11529a.m();
        }

        public void b(View view, int i7) {
            if (this.f11532d) {
                this.f11531c = this.f11529a.d(view) + this.f11529a.o();
            } else {
                this.f11531c = this.f11529a.g(view);
            }
            this.f11530b = i7;
        }

        public void c(View view, int i7) {
            int iO = this.f11529a.o();
            if (iO >= 0) {
                b(view, i7);
                return;
            }
            this.f11530b = i7;
            if (this.f11532d) {
                int i8 = (this.f11529a.i() - iO) - this.f11529a.d(view);
                this.f11531c = this.f11529a.i() - i8;
                if (i8 > 0) {
                    int iE = this.f11531c - this.f11529a.e(view);
                    int iM = this.f11529a.m();
                    int iMin = iE - (iM + Math.min(this.f11529a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f11531c += Math.min(i8, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f11529a.g(view);
            int iM2 = iG - this.f11529a.m();
            this.f11531c = iG;
            if (iM2 > 0) {
                int i9 = (this.f11529a.i() - Math.min(0, (this.f11529a.i() - iO) - this.f11529a.d(view))) - (iG + this.f11529a.e(view));
                if (i9 < 0) {
                    this.f11531c -= Math.min(iM2, -i9);
                }
            }
        }

        boolean d(View view, RecyclerView.A a2) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a2.b();
        }

        void e() {
            this.f11530b = -1;
            this.f11531c = Integer.MIN_VALUE;
            this.f11532d = false;
            this.f11533e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f11530b + uCYQMIHsy.pBfrUbTj + this.f11531c + ", mLayoutFromEnd=" + this.f11532d + ", mValid=" + this.f11533e + '}';
        }
    }

    protected static class b {

        public int f11534a;

        public boolean f11535b;

        public boolean f11536c;

        public boolean f11537d;

        protected b() {
        }

        void a() {
            this.f11534a = 0;
            this.f11535b = false;
            this.f11536c = false;
            this.f11537d = false;
        }
    }

    static class c {

        int f11539b;

        int f11540c;

        int f11541d;

        int f11542e;

        int f11543f;

        int f11544g;

        int f11548k;

        boolean f11550m;

        boolean f11538a = true;

        int f11545h = 0;

        int f11546i = 0;

        boolean f11547j = false;

        List<RecyclerView.D> f11549l = null;

        c() {
        }

        private View e() {
            int size = this.f11549l.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.f11549l.get(i7).f11658a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f11541d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f11541d = -1;
            } else {
                this.f11541d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.A a2) {
            int i7 = this.f11541d;
            return i7 >= 0 && i7 < a2.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f11549l != null) {
                return e();
            }
            View viewO = wVar.o(this.f11541d);
            this.f11541d += this.f11542e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f11549l.size();
            View view2 = null;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < size; i8++) {
                View view3 = this.f11549l.get(i8).f11658a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f11541d) * this.f11542e) >= 0 && iA < i7) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i7 = iA;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2() {
        if (this.f11518s == 1 || !q2()) {
            this.f11523x = this.f11522w;
        } else {
            this.f11523x = !this.f11522w;
        }
    }

    private boolean F2(RecyclerView.w wVar, RecyclerView.A a2, a aVar) {
        View viewJ2;
        boolean z7 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, a2)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z8 = this.f11521v;
        boolean z9 = this.f11524y;
        if (z8 != z9 || (viewJ2 = j2(wVar, a2, aVar.f11532d, z9)) == null) {
            return false;
        }
        aVar.b(viewJ2, l0(viewJ2));
        if (!a2.e() && P1()) {
            int iG = this.f11520u.g(viewJ2);
            int iD = this.f11520u.d(viewJ2);
            int iM = this.f11520u.m();
            int i7 = this.f11520u.i();
            boolean z10 = iD <= iM && iG < iM;
            if (iG >= i7 && iD > i7) {
                z7 = true;
            }
            if (z10 || z7) {
                if (aVar.f11532d) {
                    iM = i7;
                }
                aVar.f11531c = iM;
            }
        }
        return true;
    }

    private boolean G2(RecyclerView.A a2, a aVar) {
        int i7;
        if (!a2.e() && (i7 = this.f11510A) != -1) {
            if (i7 >= 0 && i7 < a2.b()) {
                aVar.f11530b = this.f11510A;
                SavedState savedState = this.f11513D;
                if (savedState != null && savedState.a()) {
                    boolean z7 = this.f11513D.f11528i;
                    aVar.f11532d = z7;
                    if (z7) {
                        aVar.f11531c = this.f11520u.i() - this.f11513D.f11527e;
                    } else {
                        aVar.f11531c = this.f11520u.m() + this.f11513D.f11527e;
                    }
                    return true;
                }
                if (this.f11511B != Integer.MIN_VALUE) {
                    boolean z8 = this.f11523x;
                    aVar.f11532d = z8;
                    if (z8) {
                        aVar.f11531c = this.f11520u.i() - this.f11511B;
                    } else {
                        aVar.f11531c = this.f11520u.m() + this.f11511B;
                    }
                    return true;
                }
                View viewH = H(this.f11510A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f11532d = (this.f11510A < l0(N(0))) == this.f11523x;
                    }
                    aVar.a();
                } else {
                    if (this.f11520u.e(viewH) > this.f11520u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f11520u.g(viewH) - this.f11520u.m() < 0) {
                        aVar.f11531c = this.f11520u.m();
                        aVar.f11532d = false;
                        return true;
                    }
                    if (this.f11520u.i() - this.f11520u.d(viewH) < 0) {
                        aVar.f11531c = this.f11520u.i();
                        aVar.f11532d = true;
                        return true;
                    }
                    aVar.f11531c = aVar.f11532d ? this.f11520u.d(viewH) + this.f11520u.o() : this.f11520u.g(viewH);
                }
                return true;
            }
            this.f11510A = -1;
            this.f11511B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(RecyclerView.w wVar, RecyclerView.A a2, a aVar) {
        if (G2(a2, aVar) || F2(wVar, a2, aVar)) {
            return;
        }
        aVar.a();
        aVar.f11530b = this.f11524y ? a2.b() - 1 : 0;
    }

    private void I2(int i7, int i8, boolean z7, RecyclerView.A a2) {
        int iM;
        this.f11519t.f11550m = z2();
        this.f11519t.f11543f = i7;
        int[] iArr = this.f11517H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a2, iArr);
        int iMax = Math.max(0, this.f11517H[0]);
        int iMax2 = Math.max(0, this.f11517H[1]);
        boolean z8 = i7 == 1;
        c cVar = this.f11519t;
        int i9 = z8 ? iMax2 : iMax;
        cVar.f11545h = i9;
        if (!z8) {
            iMax = iMax2;
        }
        cVar.f11546i = iMax;
        if (z8) {
            cVar.f11545h = i9 + this.f11520u.j();
            View viewM2 = m2();
            c cVar2 = this.f11519t;
            cVar2.f11542e = this.f11523x ? -1 : 1;
            int iL0 = l0(viewM2);
            c cVar3 = this.f11519t;
            cVar2.f11541d = iL0 + cVar3.f11542e;
            cVar3.f11539b = this.f11520u.d(viewM2);
            iM = this.f11520u.d(viewM2) - this.f11520u.i();
        } else {
            View viewN2 = n2();
            this.f11519t.f11545h += this.f11520u.m();
            c cVar4 = this.f11519t;
            cVar4.f11542e = this.f11523x ? 1 : -1;
            int iL02 = l0(viewN2);
            c cVar5 = this.f11519t;
            cVar4.f11541d = iL02 + cVar5.f11542e;
            cVar5.f11539b = this.f11520u.g(viewN2);
            iM = (-this.f11520u.g(viewN2)) + this.f11520u.m();
        }
        c cVar6 = this.f11519t;
        cVar6.f11540c = i8;
        if (z7) {
            cVar6.f11540c = i8 - iM;
        }
        cVar6.f11544g = iM;
    }

    private void J2(int i7, int i8) {
        this.f11519t.f11540c = this.f11520u.i() - i8;
        c cVar = this.f11519t;
        cVar.f11542e = this.f11523x ? -1 : 1;
        cVar.f11541d = i7;
        cVar.f11543f = 1;
        cVar.f11539b = i8;
        cVar.f11544g = Integer.MIN_VALUE;
    }

    private void K2(a aVar) {
        J2(aVar.f11530b, aVar.f11531c);
    }

    private void L2(int i7, int i8) {
        this.f11519t.f11540c = i8 - this.f11520u.m();
        c cVar = this.f11519t;
        cVar.f11541d = i7;
        cVar.f11542e = this.f11523x ? 1 : -1;
        cVar.f11543f = -1;
        cVar.f11539b = i8;
        cVar.f11544g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f11530b, aVar.f11531c);
    }

    private int S1(RecyclerView.A a2) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return s.a(a2, this.f11520u, b2(!this.f11525z, true), a2(!this.f11525z, true), this, this.f11525z);
    }

    private int T1(RecyclerView.A a2) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return s.b(a2, this.f11520u, b2(!this.f11525z, true), a2(!this.f11525z, true), this, this.f11525z, this.f11523x);
    }

    private int U1(RecyclerView.A a2) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return s.c(a2, this.f11520u, b2(!this.f11525z, true), a2(!this.f11525z, true), this, this.f11525z);
    }

    private View Z1() {
        return f2(0, O());
    }

    private View d2() {
        return f2(O() - 1, -1);
    }

    private View h2() {
        return this.f11523x ? Z1() : d2();
    }

    private View i2() {
        return this.f11523x ? d2() : Z1();
    }

    private int k2(int i7, RecyclerView.w wVar, RecyclerView.A a2, boolean z7) {
        int i8;
        int i9 = this.f11520u.i() - i7;
        if (i9 <= 0) {
            return 0;
        }
        int i10 = -B2(-i9, wVar, a2);
        int i11 = i7 + i10;
        if (!z7 || (i8 = this.f11520u.i() - i11) <= 0) {
            return i10;
        }
        this.f11520u.r(i8);
        return i8 + i10;
    }

    private int l2(int i7, RecyclerView.w wVar, RecyclerView.A a2, boolean z7) {
        int iM;
        int iM2 = i7 - this.f11520u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i8 = -B2(iM2, wVar, a2);
        int i9 = i7 + i8;
        if (!z7 || (iM = i9 - this.f11520u.m()) <= 0) {
            return i8;
        }
        this.f11520u.r(-iM);
        return i8 - iM;
    }

    private View m2() {
        return N(this.f11523x ? 0 : O() - 1);
    }

    private View n2() {
        return N(this.f11523x ? O() - 1 : 0);
    }

    private void t2(RecyclerView.w wVar, RecyclerView.A a2, int i7, int i8) {
        if (!a2.g() || O() == 0 || a2.e() || !P1()) {
            return;
        }
        List<RecyclerView.D> listK = wVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.D d7 = listK.get(i9);
            if (!d7.x()) {
                if ((d7.o() < iL0) != this.f11523x) {
                    iE += this.f11520u.e(d7.f11658a);
                } else {
                    iE2 += this.f11520u.e(d7.f11658a);
                }
            }
        }
        this.f11519t.f11549l = listK;
        if (iE > 0) {
            L2(l0(n2()), i7);
            c cVar = this.f11519t;
            cVar.f11545h = iE;
            cVar.f11540c = 0;
            cVar.a();
            Y1(wVar, this.f11519t, a2, false);
        }
        if (iE2 > 0) {
            J2(l0(m2()), i8);
            c cVar2 = this.f11519t;
            cVar2.f11545h = iE2;
            cVar2.f11540c = 0;
            cVar2.a();
            Y1(wVar, this.f11519t, a2, false);
        }
        this.f11519t.f11549l = null;
    }

    private void v2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f11538a || cVar.f11550m) {
            return;
        }
        int i7 = cVar.f11544g;
        int i8 = cVar.f11546i;
        if (cVar.f11543f == -1) {
            x2(wVar, i7, i8);
        } else {
            y2(wVar, i7, i8);
        }
    }

    private void w2(RecyclerView.w wVar, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 <= i7) {
            while (i7 > i8) {
                r1(i7, wVar);
                i7--;
            }
        } else {
            for (int i9 = i8 - 1; i9 >= i7; i9--) {
                r1(i9, wVar);
            }
        }
    }

    private void x2(RecyclerView.w wVar, int i7, int i8) {
        int iO = O();
        if (i7 < 0) {
            return;
        }
        int iH = (this.f11520u.h() - i7) + i8;
        if (this.f11523x) {
            for (int i9 = 0; i9 < iO; i9++) {
                View viewN = N(i9);
                if (this.f11520u.g(viewN) < iH || this.f11520u.q(viewN) < iH) {
                    w2(wVar, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = iO - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View viewN2 = N(i11);
            if (this.f11520u.g(viewN2) < iH || this.f11520u.q(viewN2) < iH) {
                w2(wVar, i10, i11);
                return;
            }
        }
    }

    private void y2(RecyclerView.w wVar, int i7, int i8) {
        if (i7 < 0) {
            return;
        }
        int i9 = i7 - i8;
        int iO = O();
        if (!this.f11523x) {
            for (int i10 = 0; i10 < iO; i10++) {
                View viewN = N(i10);
                if (this.f11520u.d(viewN) > i9 || this.f11520u.p(viewN) > i9) {
                    w2(wVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = iO - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View viewN2 = N(i12);
            if (this.f11520u.d(viewN2) > i9 || this.f11520u.p(viewN2) > i9) {
                w2(wVar, i11, i12);
                return;
            }
        }
    }

    @Override
    public int A(RecyclerView.A a2) {
        return U1(a2);
    }

    @Override
    public int A1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (this.f11518s == 1) {
            return 0;
        }
        return B2(i7, wVar, a2);
    }

    @Override
    public void B1(int i7) {
        this.f11510A = i7;
        this.f11511B = Integer.MIN_VALUE;
        SavedState savedState = this.f11513D;
        if (savedState != null) {
            savedState.b();
        }
        x1();
    }

    int B2(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (O() == 0 || i7 == 0) {
            return 0;
        }
        X1();
        this.f11519t.f11538a = true;
        int i8 = i7 > 0 ? 1 : -1;
        int iAbs = Math.abs(i7);
        I2(i8, iAbs, true, a2);
        c cVar = this.f11519t;
        int iY1 = cVar.f11544g + Y1(wVar, cVar, a2, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i7 = i8 * iY1;
        }
        this.f11520u.r(-i7);
        this.f11519t.f11548k = i7;
        return i7;
    }

    @Override
    public int C1(int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        if (this.f11518s == 0) {
            return 0;
        }
        return B2(i7, wVar, a2);
    }

    public void C2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        l(null);
        if (i7 != this.f11518s || this.f11520u == null) {
            p pVarB = p.b(this, i7);
            this.f11520u = pVarB;
            this.f11514E.f11529a = pVarB;
            this.f11518s = i7;
            x1();
        }
    }

    public void D2(boolean z7) {
        l(null);
        if (z7 == this.f11522w) {
            return;
        }
        this.f11522w = z7;
        x1();
    }

    public void E2(boolean z7) {
        l(null);
        if (this.f11524y == z7) {
            return;
        }
        this.f11524y = z7;
        x1();
    }

    @Override
    public View H(int i7) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i7 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i7) {
                return viewN;
            }
        }
        return super.H(i7);
    }

    @Override
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        if (this.f11512C) {
            o1(wVar);
            wVar.c();
        }
    }

    @Override
    public void M1(RecyclerView recyclerView, RecyclerView.A a2, int i7) {
        m mVar = new m(recyclerView.getContext());
        mVar.p(i7);
        N1(mVar);
    }

    @Override
    public View N0(View view, int i7, RecyclerView.w wVar, RecyclerView.A a2) {
        int iV1;
        A2();
        if (O() == 0 || (iV1 = V1(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        I2(iV1, (int) (this.f11520u.n() * 0.33333334f), false, a2);
        c cVar = this.f11519t;
        cVar.f11544g = Integer.MIN_VALUE;
        cVar.f11538a = false;
        Y1(wVar, cVar, a2, true);
        View viewI2 = iV1 == -1 ? i2() : h2();
        View viewN2 = iV1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(c2());
            accessibilityEvent.setToIndex(e2());
        }
    }

    @Override
    public boolean P1() {
        return this.f11513D == null && this.f11521v == this.f11524y;
    }

    protected void Q1(RecyclerView.A a2, int[] iArr) {
        int i7;
        int iO2 = o2(a2);
        if (this.f11519t.f11543f == -1) {
            i7 = 0;
        } else {
            i7 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i7;
    }

    void R1(RecyclerView.A a2, c cVar, RecyclerView.p.c cVar2) {
        int i7 = cVar.f11541d;
        if (i7 < 0 || i7 >= a2.b()) {
            return;
        }
        cVar2.a(i7, Math.max(0, cVar.f11544g));
    }

    int V1(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f11518s == 1) ? 1 : Integer.MIN_VALUE : this.f11518s == 0 ? 1 : Integer.MIN_VALUE : this.f11518s == 1 ? -1 : Integer.MIN_VALUE : this.f11518s == 0 ? -1 : Integer.MIN_VALUE : (this.f11518s != 1 && q2()) ? -1 : 1 : (this.f11518s != 1 && q2()) ? 1 : -1;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f11519t == null) {
            this.f11519t = W1();
        }
    }

    int Y1(RecyclerView.w wVar, c cVar, RecyclerView.A a2, boolean z7) {
        int i7 = cVar.f11540c;
        int i8 = cVar.f11544g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                cVar.f11544g = i8 + i7;
            }
            v2(wVar, cVar);
        }
        int i9 = cVar.f11540c + cVar.f11545h;
        b bVar = this.f11515F;
        while (true) {
            if ((!cVar.f11550m && i9 <= 0) || !cVar.c(a2)) {
                break;
            }
            bVar.a();
            s2(wVar, a2, cVar, bVar);
            if (!bVar.f11535b) {
                cVar.f11539b += bVar.f11534a * cVar.f11543f;
                if (!bVar.f11536c || cVar.f11549l != null || !a2.e()) {
                    int i10 = cVar.f11540c;
                    int i11 = bVar.f11534a;
                    cVar.f11540c = i10 - i11;
                    i9 -= i11;
                }
                int i12 = cVar.f11544g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + bVar.f11534a;
                    cVar.f11544g = i13;
                    int i14 = cVar.f11540c;
                    if (i14 < 0) {
                        cVar.f11544g = i13 + i14;
                    }
                    v2(wVar, cVar);
                }
                if (z7 && bVar.f11537d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - cVar.f11540c;
    }

    View a2(boolean z7, boolean z8) {
        return this.f11523x ? g2(0, O(), z7, z8) : g2(O() - 1, -1, z7, z8);
    }

    @Override
    public void b1(RecyclerView.w wVar, RecyclerView.A a2) {
        int i7;
        int i8;
        int i9;
        int i10;
        int iK2;
        int i11;
        View viewH;
        int iG;
        int i12;
        int i13 = -1;
        if (!(this.f11513D == null && this.f11510A == -1) && a2.b() == 0) {
            o1(wVar);
            return;
        }
        SavedState savedState = this.f11513D;
        if (savedState != null && savedState.a()) {
            this.f11510A = this.f11513D.f11526d;
        }
        X1();
        this.f11519t.f11538a = false;
        A2();
        View viewA0 = a0();
        a aVar = this.f11514E;
        if (!aVar.f11533e || this.f11510A != -1 || this.f11513D != null) {
            aVar.e();
            a aVar2 = this.f11514E;
            aVar2.f11532d = this.f11523x ^ this.f11524y;
            H2(wVar, a2, aVar2);
            this.f11514E.f11533e = true;
        } else if (viewA0 != null && (this.f11520u.g(viewA0) >= this.f11520u.i() || this.f11520u.d(viewA0) <= this.f11520u.m())) {
            this.f11514E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f11519t;
        cVar.f11543f = cVar.f11548k >= 0 ? 1 : -1;
        int[] iArr = this.f11517H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a2, iArr);
        int iMax = Math.max(0, this.f11517H[0]) + this.f11520u.m();
        int iMax2 = Math.max(0, this.f11517H[1]) + this.f11520u.j();
        if (a2.e() && (i11 = this.f11510A) != -1 && this.f11511B != Integer.MIN_VALUE && (viewH = H(i11)) != null) {
            if (this.f11523x) {
                i12 = this.f11520u.i() - this.f11520u.d(viewH);
                iG = this.f11511B;
            } else {
                iG = this.f11520u.g(viewH) - this.f11520u.m();
                i12 = this.f11511B;
            }
            int i14 = i12 - iG;
            if (i14 > 0) {
                iMax += i14;
            } else {
                iMax2 -= i14;
            }
        }
        a aVar3 = this.f11514E;
        if (!aVar3.f11532d ? !this.f11523x : this.f11523x) {
            i13 = 1;
        }
        u2(wVar, a2, aVar3, i13);
        B(wVar);
        this.f11519t.f11550m = z2();
        this.f11519t.f11547j = a2.e();
        this.f11519t.f11546i = 0;
        a aVar4 = this.f11514E;
        if (aVar4.f11532d) {
            M2(aVar4);
            c cVar2 = this.f11519t;
            cVar2.f11545h = iMax;
            Y1(wVar, cVar2, a2, false);
            c cVar3 = this.f11519t;
            i8 = cVar3.f11539b;
            int i15 = cVar3.f11541d;
            int i16 = cVar3.f11540c;
            if (i16 > 0) {
                iMax2 += i16;
            }
            K2(this.f11514E);
            c cVar4 = this.f11519t;
            cVar4.f11545h = iMax2;
            cVar4.f11541d += cVar4.f11542e;
            Y1(wVar, cVar4, a2, false);
            c cVar5 = this.f11519t;
            i7 = cVar5.f11539b;
            int i17 = cVar5.f11540c;
            if (i17 > 0) {
                L2(i15, i8);
                c cVar6 = this.f11519t;
                cVar6.f11545h = i17;
                Y1(wVar, cVar6, a2, false);
                i8 = this.f11519t.f11539b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f11519t;
            cVar7.f11545h = iMax2;
            Y1(wVar, cVar7, a2, false);
            c cVar8 = this.f11519t;
            i7 = cVar8.f11539b;
            int i18 = cVar8.f11541d;
            int i19 = cVar8.f11540c;
            if (i19 > 0) {
                iMax += i19;
            }
            M2(this.f11514E);
            c cVar9 = this.f11519t;
            cVar9.f11545h = iMax;
            cVar9.f11541d += cVar9.f11542e;
            Y1(wVar, cVar9, a2, false);
            c cVar10 = this.f11519t;
            i8 = cVar10.f11539b;
            int i20 = cVar10.f11540c;
            if (i20 > 0) {
                J2(i18, i7);
                c cVar11 = this.f11519t;
                cVar11.f11545h = i20;
                Y1(wVar, cVar11, a2, false);
                i7 = this.f11519t.f11539b;
            }
        }
        if (O() > 0) {
            if (this.f11523x ^ this.f11524y) {
                int iK22 = k2(i7, wVar, a2, true);
                i9 = i8 + iK22;
                i10 = i7 + iK22;
                iK2 = l2(i9, wVar, a2, false);
            } else {
                int iL2 = l2(i8, wVar, a2, true);
                i9 = i8 + iL2;
                i10 = i7 + iL2;
                iK2 = k2(i10, wVar, a2, false);
            }
            i8 = i9 + iK2;
            i7 = i10 + iK2;
        }
        t2(wVar, a2, i8, i7);
        if (a2.e()) {
            this.f11514E.e();
        } else {
            this.f11520u.s();
        }
        this.f11521v = this.f11524y;
    }

    View b2(boolean z7, boolean z8) {
        return this.f11523x ? g2(O() - 1, -1, z7, z8) : g2(0, O(), z7, z8);
    }

    @Override
    public PointF c(int i7) {
        if (O() == 0) {
            return null;
        }
        int i8 = (i7 < l0(N(0))) != this.f11523x ? -1 : 1;
        return this.f11518s == 0 ? new PointF(i8, 0.0f) : new PointF(0.0f, i8);
    }

    @Override
    public void c1(RecyclerView.A a2) {
        super.c1(a2);
        this.f11513D = null;
        this.f11510A = -1;
        this.f11511B = Integer.MIN_VALUE;
        this.f11514E.e();
    }

    public int c2() {
        View viewG2 = g2(0, O(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    public int e2() {
        View viewG2 = g2(O() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    View f2(int i7, int i8) {
        int i9;
        int i10;
        X1();
        if (i8 <= i7 && i8 >= i7) {
            return N(i7);
        }
        if (this.f11520u.g(N(i7)) < this.f11520u.m()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return this.f11518s == 0 ? this.f11706e.a(i7, i8, i9, i10) : this.f11707f.a(i7, i8, i9, i10);
    }

    @Override
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f11513D = savedState;
            if (this.f11510A != -1) {
                savedState.b();
            }
            x1();
        }
    }

    View g2(int i7, int i8, boolean z7, boolean z8) {
        X1();
        int i9 = z7 ? 24579 : 320;
        int i10 = z8 ? 320 : 0;
        return this.f11518s == 0 ? this.f11706e.a(i7, i8, i9, i10) : this.f11707f.a(i7, i8, i9, i10);
    }

    @Override
    public Parcelable h1() {
        if (this.f11513D != null) {
            return new SavedState(this.f11513D);
        }
        SavedState savedState = new SavedState();
        if (O() > 0) {
            X1();
            boolean z7 = this.f11521v ^ this.f11523x;
            savedState.f11528i = z7;
            if (z7) {
                View viewM2 = m2();
                savedState.f11527e = this.f11520u.i() - this.f11520u.d(viewM2);
                savedState.f11526d = l0(viewM2);
            } else {
                View viewN2 = n2();
                savedState.f11526d = l0(viewN2);
                savedState.f11527e = this.f11520u.g(viewN2) - this.f11520u.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    android.view.View j2(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.A r18, boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$A, boolean, boolean):android.view.View");
    }

    @Override
    public void l(String str) {
        if (this.f11513D == null) {
            super.l(str);
        }
    }

    @Deprecated
    protected int o2(RecyclerView.A a2) {
        if (a2.d()) {
            return this.f11520u.n();
        }
        return 0;
    }

    @Override
    public boolean p() {
        return this.f11518s == 0;
    }

    public int p2() {
        return this.f11518s;
    }

    @Override
    public boolean q() {
        return this.f11518s == 1;
    }

    protected boolean q2() {
        return d0() == 1;
    }

    public boolean r2() {
        return this.f11525z;
    }

    void s2(RecyclerView.w wVar, RecyclerView.A a2, c cVar, b bVar) {
        int i7;
        int i8;
        int i9;
        int iI0;
        int iF;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f11535b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f11549l == null) {
            if (this.f11523x == (cVar.f11543f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f11523x == (cVar.f11543f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f11534a = this.f11520u.e(viewD);
        if (this.f11518s == 1) {
            if (q2()) {
                iF = s0() - j0();
                iI0 = iF - this.f11520u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f11520u.f(viewD) + iI0;
            }
            if (cVar.f11543f == -1) {
                int i10 = cVar.f11539b;
                i9 = i10;
                i8 = iF;
                i7 = i10 - bVar.f11534a;
            } else {
                int i11 = cVar.f11539b;
                i7 = i11;
                i8 = iF;
                i9 = bVar.f11534a + i11;
            }
        } else {
            int iK0 = k0();
            int iF2 = this.f11520u.f(viewD) + iK0;
            if (cVar.f11543f == -1) {
                int i12 = cVar.f11539b;
                i8 = i12;
                i7 = iK0;
                i9 = iF2;
                iI0 = i12 - bVar.f11534a;
            } else {
                int i13 = cVar.f11539b;
                i7 = iK0;
                i8 = bVar.f11534a + i13;
                i9 = iF2;
                iI0 = i13;
            }
        }
        D0(viewD, iI0, i7, i8, i9);
        if (qVar.c() || qVar.b()) {
            bVar.f11536c = true;
        }
        bVar.f11537d = viewD.hasFocusable();
    }

    @Override
    public void t(int i7, int i8, RecyclerView.A a2, RecyclerView.p.c cVar) {
        if (this.f11518s != 0) {
            i7 = i8;
        }
        if (O() == 0 || i7 == 0) {
            return;
        }
        X1();
        I2(i7 > 0 ? 1 : -1, Math.abs(i7), true, a2);
        R1(a2, this.f11519t, cVar);
    }

    @Override
    public void u(int i7, RecyclerView.p.c cVar) {
        boolean z7;
        int i8;
        SavedState savedState = this.f11513D;
        if (savedState == null || !savedState.a()) {
            A2();
            z7 = this.f11523x;
            i8 = this.f11510A;
            if (i8 == -1) {
                i8 = z7 ? i7 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f11513D;
            z7 = savedState2.f11528i;
            i8 = savedState2.f11526d;
        }
        int i9 = z7 ? -1 : 1;
        for (int i10 = 0; i10 < this.f11516G && i8 >= 0 && i8 < i7; i10++) {
            cVar.a(i8, 0);
            i8 += i9;
        }
    }

    void u2(RecyclerView.w wVar, RecyclerView.A a2, a aVar, int i7) {
    }

    @Override
    public int v(RecyclerView.A a2) {
        return S1(a2);
    }

    @Override
    public int w(RecyclerView.A a2) {
        return T1(a2);
    }

    @Override
    public boolean w0() {
        return true;
    }

    @Override
    public int x(RecyclerView.A a2) {
        return U1(a2);
    }

    @Override
    public int y(RecyclerView.A a2) {
        return S1(a2);
    }

    @Override
    public int z(RecyclerView.A a2) {
        return T1(a2);
    }

    boolean z2() {
        return this.f11520u.k() == 0 && this.f11520u.h() == 0;
    }

    public LinearLayoutManager(Context context, int i7, boolean z7) {
        this.f11518s = 1;
        this.f11522w = false;
        this.f11523x = false;
        this.f11524y = false;
        this.f11525z = true;
        this.f11510A = -1;
        this.f11511B = Integer.MIN_VALUE;
        this.f11513D = null;
        this.f11514E = new a();
        this.f11515F = new b();
        this.f11516G = 2;
        this.f11517H = new int[2];
        C2(i7);
        D2(z7);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f11518s = 1;
        this.f11522w = false;
        this.f11523x = false;
        this.f11524y = false;
        this.f11525z = true;
        this.f11510A = -1;
        this.f11511B = Integer.MIN_VALUE;
        this.f11513D = null;
        this.f11514E = new a();
        this.f11515F = new b();
        this.f11516G = 2;
        this.f11517H = new int[2];
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i7, i8);
        C2(dVarM0.f11722a);
        D2(dVarM0.f11724c);
        E2(dVarM0.f11725d);
    }
}
