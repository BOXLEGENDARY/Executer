package com.google.android.gms.measurement.internal;

import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.google.android.gms.internal.measurement.C1836b2;
import com.google.android.gms.internal.measurement.C1851d1;
import com.google.android.gms.internal.measurement.C1907k1;
import com.google.android.gms.internal.measurement.Z5;

final class t4 extends s4 {

    private final C1907k1 f17039g;

    final u4 f17040h;

    t4(u4 u4Var, String str, int i7, C1907k1 c1907k1) {
        super(str, i7);
        this.f17040h = u4Var;
        this.f17039g = c1907k1;
    }

    @Override
    final int a() {
        return this.f17039g.w();
    }

    @Override
    final boolean b() {
        return false;
    }

    @Override
    final boolean c() {
        return true;
    }

    final boolean k(Long l7, Long l8, C1836b2 c1836b2, boolean z7) {
        Z5.b();
        boolean zB = this.f17040h.f16818a.z().B(this.f17015a, Y0.f16604Y);
        boolean zD = this.f17039g.D();
        boolean zE = this.f17039g.E();
        boolean zF = this.f17039g.F();
        Object[] objArr = zD || zE || zF;
        Boolean boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        if (z7 && objArr != true) {
            this.f17040h.f16818a.b().v().c(vxbbqXNtzfMxs.pveLgc, Integer.valueOf(this.f17016b), this.f17039g.G() ? Integer.valueOf(this.f17039g.w()) : null);
            return true;
        }
        C1851d1 c1851d1X = this.f17039g.x();
        boolean zD2 = c1851d1X.D();
        if (c1836b2.P()) {
            if (c1851d1X.F()) {
                boolJ = s4.j(s4.h(c1836b2.x(), c1851d1X.y()), zD2);
            } else {
                this.f17040h.f16818a.b().w().b("No number filter for long property. property", this.f17040h.f16818a.D().f(c1836b2.C()));
            }
        } else if (c1836b2.O()) {
            if (c1851d1X.F()) {
                boolJ = s4.j(s4.g(c1836b2.w(), c1851d1X.y()), zD2);
            } else {
                this.f17040h.f16818a.b().w().b("No number filter for double property. property", this.f17040h.f16818a.D().f(c1836b2.C()));
            }
        } else if (!c1836b2.R()) {
            this.f17040h.f16818a.b().w().b("User property has no value, property", this.f17040h.f16818a.D().f(c1836b2.C()));
        } else if (c1851d1X.H()) {
            boolJ = s4.j(s4.f(c1836b2.D(), c1851d1X.z(), this.f17040h.f16818a.b()), zD2);
        } else if (!c1851d1X.F()) {
            this.f17040h.f16818a.b().w().b("No string or number filter defined. property", this.f17040h.f16818a.D().f(c1836b2.C()));
        } else if (e4.P(c1836b2.D())) {
            boolJ = s4.j(s4.i(c1836b2.D(), c1851d1X.y()), zD2);
        } else {
            this.f17040h.f16818a.b().w().c("Invalid user property value for Numeric number filter. property, value", this.f17040h.f16818a.D().f(c1836b2.C()), c1836b2.D());
        }
        this.f17040h.f16818a.b().v().b("Property filter result", boolJ == null ? "null" : boolJ);
        if (boolJ == null) {
            return false;
        }
        this.f17017c = Boolean.TRUE;
        if (zF && !boolJ.booleanValue()) {
            return true;
        }
        if (!z7 || this.f17039g.D()) {
            this.f17018d = boolJ;
        }
        if (boolJ.booleanValue() && objArr != false && c1836b2.Q()) {
            long jY = c1836b2.y();
            if (l7 != null) {
                jY = l7.longValue();
            }
            if (zB && this.f17039g.D() && !this.f17039g.E() && l8 != null) {
                jY = l8.longValue();
            }
            if (this.f17039g.E()) {
                this.f17020f = Long.valueOf(jY);
            } else {
                this.f17019e = Long.valueOf(jY);
            }
        }
        return true;
    }
}
