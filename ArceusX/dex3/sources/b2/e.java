package b2;

import android.view.Choreographer;

public class e extends a implements Choreographer.FrameCallback {
    private P1.d C;
    private float i = 1.0f;
    private boolean v = false;
    private long w = 0;
    private float y = 0.0f;
    private int z = 0;
    private float A = -2.1474836E9f;
    private float B = 2.1474836E9f;
    protected boolean D = false;

    private void F() {
        if (this.C == null) {
            return;
        }
        float f = this.y;
        if (f < this.A || f > this.B) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.A), Float.valueOf(this.B), Float.valueOf(this.y)));
        }
    }

    private float k() {
        P1.d dVar = this.C;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.i()) / Math.abs(this.i);
    }

    private boolean p() {
        return o() < 0.0f;
    }

    public void B(float f) {
        C(this.A, f);
    }

    public void C(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        P1.d dVar = this.C;
        float fP = dVar == null ? -3.4028235E38f : dVar.p();
        P1.d dVar2 = this.C;
        float f3 = dVar2 == null ? Float.MAX_VALUE : dVar2.f();
        float fC = g.c(f, fP, f3);
        float fC2 = g.c(f2, fP, f3);
        if (fC == this.A && fC2 == this.B) {
            return;
        }
        this.A = fC;
        this.B = fC2;
        z((int) g.c(this.y, fC, fC2));
    }

    public void D(int i) {
        C(i, (int) this.B);
    }

    public void E(float f) {
        this.i = f;
    }

    @Override
    public void cancel() {
        a();
        t();
    }

    @Override
    public void doFrame(long j) {
        s();
        if (this.C == null || !isRunning()) {
            return;
        }
        P1.c.a("LottieValueAnimator#doFrame");
        float fK = (this.w != 0 ? j - r1 : 0L) / k();
        float f = this.y;
        if (p()) {
            fK = -fK;
        }
        float f2 = f + fK;
        this.y = f2;
        boolean zE = g.e(f2, n(), l());
        this.y = g.c(this.y, n(), l());
        this.w = j;
        e();
        if (!zE) {
            if (getRepeatCount() == -1 || this.z < getRepeatCount()) {
                c();
                this.z++;
                if (getRepeatMode() == 2) {
                    this.v = !this.v;
                    x();
                } else {
                    this.y = p() ? l() : n();
                }
                this.w = j;
            } else {
                this.y = this.i < 0.0f ? n() : l();
                t();
                b(p());
            }
        }
        F();
        P1.c.b("LottieValueAnimator#doFrame");
    }

    public void g() {
        this.C = null;
        this.A = -2.1474836E9f;
        this.B = 2.1474836E9f;
    }

    @Override
    public float getAnimatedFraction() {
        float fN;
        float fL;
        float fN2;
        if (this.C == null) {
            return 0.0f;
        }
        if (p()) {
            fN = l() - this.y;
            fL = l();
            fN2 = n();
        } else {
            fN = this.y - n();
            fL = l();
            fN2 = n();
        }
        return fN / (fL - fN2);
    }

    @Override
    public Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override
    public long getDuration() {
        P1.d dVar = this.C;
        if (dVar == null) {
            return 0L;
        }
        return (long) dVar.d();
    }

    public void h() {
        t();
        b(p());
    }

    public float i() {
        P1.d dVar = this.C;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.y - dVar.p()) / (this.C.f() - this.C.p());
    }

    @Override
    public boolean isRunning() {
        return this.D;
    }

    public float j() {
        return this.y;
    }

    public float l() {
        P1.d dVar = this.C;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.B;
        return f == 2.1474836E9f ? dVar.f() : f;
    }

    public float n() {
        P1.d dVar = this.C;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.A;
        return f == -2.1474836E9f ? dVar.p() : f;
    }

    public float o() {
        return this.i;
    }

    public void q() {
        t();
    }

    public void r() {
        this.D = true;
        d(p());
        z((int) (p() ? l() : n()));
        this.w = 0L;
        this.z = 0;
        s();
    }

    protected void s() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.v) {
            return;
        }
        this.v = false;
        x();
    }

    protected void t() {
        v(true);
    }

    protected void v(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.D = false;
        }
    }

    public void w() {
        this.D = true;
        s();
        this.w = 0L;
        if (p() && j() == n()) {
            this.y = l();
        } else {
            if (p() || j() != l()) {
                return;
            }
            this.y = n();
        }
    }

    public void x() {
        E(-o());
    }

    public void y(P1.d dVar) {
        boolean z = this.C == null;
        this.C = dVar;
        if (z) {
            C((int) Math.max(this.A, dVar.p()), (int) Math.min(this.B, dVar.f()));
        } else {
            C((int) dVar.p(), (int) dVar.f());
        }
        float f = this.y;
        this.y = 0.0f;
        z((int) f);
        e();
    }

    public void z(float f) {
        if (this.y == f) {
            return;
        }
        this.y = g.c(f, n(), l());
        this.w = 0L;
        e();
    }
}
