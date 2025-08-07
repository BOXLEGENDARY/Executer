package I0;

import I0.b;

public final class e {

    double f1676a;

    double f1677b;

    private boolean f1678c;

    private double f1679d;

    private double f1680e;

    private double f1681f;

    private double f1682g;

    private double f1683h;

    private double f1684i;

    private final b.o f1685j;

    public e() {
        this.f1676a = Math.sqrt(1500.0d);
        this.f1677b = 0.5d;
        this.f1678c = false;
        this.f1684i = Double.MAX_VALUE;
        this.f1685j = new b.o();
    }

    private void b() {
        if (this.f1678c) {
            return;
        }
        if (this.f1684i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d7 = this.f1677b;
        if (d7 > 1.0d) {
            double d8 = this.f1676a;
            this.f1681f = ((-d7) * d8) + (d8 * Math.sqrt((d7 * d7) - 1.0d));
            double d9 = this.f1677b;
            double d10 = this.f1676a;
            this.f1682g = ((-d9) * d10) - (d10 * Math.sqrt((d9 * d9) - 1.0d));
        } else if (d7 >= 0.0d && d7 < 1.0d) {
            this.f1683h = this.f1676a * Math.sqrt(1.0d - (d7 * d7));
        }
        this.f1678c = true;
    }

    public float a() {
        return (float) this.f1684i;
    }

    public boolean c(float f7, float f8) {
        return ((double) Math.abs(f8)) < this.f1680e && ((double) Math.abs(f7 - a())) < this.f1679d;
    }

    public e d(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f1677b = f7;
        this.f1678c = false;
        return this;
    }

    public e e(float f7) {
        this.f1684i = f7;
        return this;
    }

    public e f(float f7) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f1676a = Math.sqrt(f7);
        this.f1678c = false;
        return this;
    }

    void g(double d7) {
        double dAbs = Math.abs(d7);
        this.f1679d = dAbs;
        this.f1680e = dAbs * 62.5d;
    }

    b.o h(double d7, double d8, long j7) {
        double dCos;
        double dPow;
        b();
        double d9 = j7 / 1000.0d;
        double d10 = d7 - this.f1684i;
        double d11 = this.f1677b;
        if (d11 > 1.0d) {
            double d12 = this.f1682g;
            double d13 = this.f1681f;
            double d14 = d10 - (((d12 * d10) - d8) / (d12 - d13));
            double d15 = ((d10 * d12) - d8) / (d12 - d13);
            dPow = (Math.pow(2.718281828459045d, d12 * d9) * d14) + (Math.pow(2.718281828459045d, this.f1681f * d9) * d15);
            double d16 = this.f1682g;
            double dPow2 = d14 * d16 * Math.pow(2.718281828459045d, d16 * d9);
            double d17 = this.f1681f;
            dCos = dPow2 + (d15 * d17 * Math.pow(2.718281828459045d, d17 * d9));
        } else if (d11 == 1.0d) {
            double d18 = this.f1676a;
            double d19 = d8 + (d18 * d10);
            double d20 = d10 + (d19 * d9);
            dPow = Math.pow(2.718281828459045d, (-d18) * d9) * d20;
            double dPow3 = d20 * Math.pow(2.718281828459045d, (-this.f1676a) * d9);
            double d21 = this.f1676a;
            dCos = (d19 * Math.pow(2.718281828459045d, (-d21) * d9)) + (dPow3 * (-d21));
        } else {
            double d22 = 1.0d / this.f1683h;
            double d23 = this.f1676a;
            double d24 = d22 * ((d11 * d23 * d10) + d8);
            double dPow4 = Math.pow(2.718281828459045d, (-d11) * d23 * d9) * ((Math.cos(this.f1683h * d9) * d10) + (Math.sin(this.f1683h * d9) * d24));
            double d25 = this.f1676a;
            double d26 = this.f1677b;
            double d27 = (-d25) * dPow4 * d26;
            double dPow5 = Math.pow(2.718281828459045d, (-d26) * d25 * d9);
            double d28 = this.f1683h;
            double dSin = (-d28) * d10 * Math.sin(d28 * d9);
            double d29 = this.f1683h;
            dCos = d27 + (dPow5 * (dSin + (d24 * d29 * Math.cos(d29 * d9))));
            dPow = dPow4;
        }
        b.o oVar = this.f1685j;
        oVar.f1670a = (float) (dPow + this.f1684i);
        oVar.f1671b = (float) dCos;
        return oVar;
    }

    public e(float f7) {
        this.f1676a = Math.sqrt(1500.0d);
        this.f1677b = 0.5d;
        this.f1678c = false;
        this.f1684i = Double.MAX_VALUE;
        this.f1685j = new b.o();
        this.f1684i = f7;
    }
}
