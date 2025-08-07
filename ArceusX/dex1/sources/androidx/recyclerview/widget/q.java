package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class q extends u {

    private p f12016d;

    private p f12017e;

    class a extends m {
        a(Context context) {
            super(context);
        }

        @Override
        protected void o(View view, RecyclerView.A a2, RecyclerView.z.a aVar) {
            q qVar = q.this;
            int[] iArrC = qVar.c(qVar.f12024a.getLayoutManager(), view);
            int i7 = iArrC[0];
            int i8 = iArrC[1];
            int iW = w(Math.max(Math.abs(i7), Math.abs(i8)));
            if (iW > 0) {
                aVar.d(i7, i8, iW, this.f12005j);
            }
        }

        @Override
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override
        protected int x(int i7) {
            return Math.min(100, super.x(i7));
        }
    }

    private int k(View view, p pVar) {
        return (pVar.g(view) + (pVar.e(view) / 2)) - (pVar.m() + (pVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, p pVar2) {
        int iO = pVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = pVar2.m() + (pVar2.n() / 2);
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < iO; i8++) {
            View viewN = pVar.N(i8);
            int iAbs = Math.abs((pVar2.g(viewN) + (pVar2.e(viewN) / 2)) - iM);
            if (iAbs < i7) {
                view = viewN;
                i7 = iAbs;
            }
        }
        return view;
    }

    private p m(RecyclerView.p pVar) {
        p pVar2 = this.f12017e;
        if (pVar2 == null || pVar2.f12013a != pVar) {
            this.f12017e = p.a(pVar);
        }
        return this.f12017e;
    }

    private p n(RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    private p o(RecyclerView.p pVar) {
        p pVar2 = this.f12016d;
        if (pVar2 == null || pVar2.f12013a != pVar) {
            this.f12016d = p.c(pVar);
        }
        return this.f12016d;
    }

    private boolean p(RecyclerView.p pVar, int i7, int i8) {
        return pVar.p() ? i7 > 0 : i8 > 0;
    }

    private boolean q(RecyclerView.p pVar) {
        PointF pointFC;
        int iE = pVar.e();
        if (!(pVar instanceof RecyclerView.z.b) || (pointFC = ((RecyclerView.z.b) pVar).c(iE - 1)) == null) {
            return false;
        }
        return pointFC.x < 0.0f || pointFC.y < 0.0f;
    }

    @Override
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override
    protected RecyclerView.z d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.f12024a.getContext());
        }
        return null;
    }

    @Override
    public View f(RecyclerView.p pVar) {
        if (pVar.q()) {
            return l(pVar, o(pVar));
        }
        if (pVar.p()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override
    public int g(RecyclerView.p pVar, int i7, int i8) {
        p pVarN;
        int iE = pVar.e();
        if (iE == 0 || (pVarN = n(pVar)) == null) {
            return -1;
        }
        int iO = pVar.O();
        View view = null;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = pVar.N(i11);
            if (viewN != null) {
                int iK = k(viewN, pVarN);
                if (iK <= 0 && iK > i10) {
                    view2 = viewN;
                    i10 = iK;
                }
                if (iK >= 0 && iK < i9) {
                    view = viewN;
                    i9 = iK;
                }
            }
        }
        boolean zP = p(pVar, i7, i8);
        if (zP && view != null) {
            return pVar.l0(view);
        }
        if (!zP && view2 != null) {
            return pVar.l0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = pVar.l0(view) + (q(pVar) == zP ? -1 : 1);
        if (iL0 < 0 || iL0 >= iE) {
            return -1;
        }
        return iL0;
    }
}
