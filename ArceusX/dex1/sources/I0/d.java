package I0;

import I0.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;

public final class d extends b<d> {

    private e f1673A;

    private float f1674B;

    private boolean f1675C;

    public <K> d(K k7, c<K> cVar) {
        super(k7, cVar);
        this.f1673A = null;
        this.f1674B = Float.MAX_VALUE;
        this.f1675C = false;
    }

    private void o() {
        e eVar = this.f1673A;
        if (eVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = eVar.a();
        if (dA > this.f1664g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f1665h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override
    public void i() {
        o();
        this.f1673A.g(d());
        super.i();
    }

    @Override
    boolean k(long j7) {
        if (this.f1675C) {
            float f7 = this.f1674B;
            if (f7 != Float.MAX_VALUE) {
                this.f1673A.e(f7);
                this.f1674B = Float.MAX_VALUE;
            }
            this.f1659b = this.f1673A.a();
            this.f1658a = 0.0f;
            this.f1675C = false;
            return true;
        }
        if (this.f1674B != Float.MAX_VALUE) {
            this.f1673A.a();
            long j8 = j7 / 2;
            b.o oVarH = this.f1673A.h(this.f1659b, this.f1658a, j8);
            this.f1673A.e(this.f1674B);
            this.f1674B = Float.MAX_VALUE;
            b.o oVarH2 = this.f1673A.h(oVarH.f1670a, oVarH.f1671b, j8);
            this.f1659b = oVarH2.f1670a;
            this.f1658a = oVarH2.f1671b;
        } else {
            b.o oVarH3 = this.f1673A.h(this.f1659b, this.f1658a, j7);
            this.f1659b = oVarH3.f1670a;
            this.f1658a = oVarH3.f1671b;
        }
        float fMax = Math.max(this.f1659b, this.f1665h);
        this.f1659b = fMax;
        float fMin = Math.min(fMax, this.f1664g);
        this.f1659b = fMin;
        if (!n(fMin, this.f1658a)) {
            return false;
        }
        this.f1659b = this.f1673A.a();
        this.f1658a = 0.0f;
        return true;
    }

    public void l(float f7) {
        if (e()) {
            this.f1674B = f7;
            return;
        }
        if (this.f1673A == null) {
            this.f1673A = new e(f7);
        }
        this.f1673A.e(f7);
        i();
    }

    public boolean m() {
        return this.f1673A.f1677b > 0.0d;
    }

    boolean n(float f7, float f8) {
        return this.f1673A.c(f7, f8);
    }

    public d p(e eVar) {
        this.f1673A = eVar;
        return this;
    }

    public void q() {
        if (!m()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f1663f) {
            this.f1675C = true;
        }
    }
}
