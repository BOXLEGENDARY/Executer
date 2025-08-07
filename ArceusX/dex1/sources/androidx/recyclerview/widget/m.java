package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class m extends RecyclerView.z {

    protected PointF f12006k;

    private final DisplayMetrics f12007l;

    private float f12009n;

    protected final LinearInterpolator f12004i = new LinearInterpolator();

    protected final DecelerateInterpolator f12005j = new DecelerateInterpolator();

    private boolean f12008m = false;

    protected int f12010o = 0;

    protected int f12011p = 0;

    public m(Context context) {
        this.f12007l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f12008m) {
            this.f12009n = v(this.f12007l);
            this.f12008m = true;
        }
        return this.f12009n;
    }

    private int y(int i7, int i8) {
        int i9 = i7 - i8;
        if (i7 * i9 <= 0) {
            return 0;
        }
        return i9;
    }

    protected int B() {
        PointF pointF = this.f12006k;
        if (pointF != null) {
            float f7 = pointF.y;
            if (f7 != 0.0f) {
                return f7 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.z.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f12006k = pointFA;
        this.f12010o = (int) (pointFA.x * 10000.0f);
        this.f12011p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f12010o * 1.2f), (int) (this.f12011p * 1.2f), (int) (x(10000) * 1.2f), this.f12004i);
    }

    @Override
    protected void l(int i7, int i8, RecyclerView.A a2, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f12010o = y(this.f12010o, i7);
        int iY = y(this.f12011p, i8);
        this.f12011p = iY;
        if (this.f12010o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override
    protected void m() {
    }

    @Override
    protected void n() {
        this.f12011p = 0;
        this.f12010o = 0;
        this.f12006k = null;
    }

    @Override
    protected void o(View view, RecyclerView.A a2, RecyclerView.z.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f12005j);
        }
    }

    public int s(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == -1) {
            return i9 - i7;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                return i10 - i8;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i12 = i9 - i7;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i10 - i8;
        if (i13 < 0) {
            return i13;
        }
        return 0;
    }

    public int t(View view, int i7) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.p()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.V(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.i0(), pVarE.s0() - pVarE.j0(), i7);
    }

    public int u(View view, int i7) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.q()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.Z(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.T(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.k0(), pVarE.b0() - pVarE.h0(), i7);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i7) {
        return (int) Math.ceil(x(i7) / 0.3356d);
    }

    protected int x(int i7) {
        return (int) Math.ceil(Math.abs(i7) * A());
    }

    protected int z() {
        PointF pointF = this.f12006k;
        if (pointF != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f) {
                return f7 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
