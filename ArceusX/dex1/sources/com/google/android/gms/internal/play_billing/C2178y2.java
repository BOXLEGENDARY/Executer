package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

final class C2178y2 implements InterfaceC2067f4 {

    private final AbstractC2172x2 f16191a;

    private C2178y2(AbstractC2172x2 abstractC2172x2) {
        byte[] bArr = W2.f15951b;
        this.f16191a = abstractC2172x2;
        abstractC2172x2.f16167a = this;
    }

    public static C2178y2 L(AbstractC2172x2 abstractC2172x2) {
        C2178y2 c2178y2 = abstractC2172x2.f16167a;
        return c2178y2 != null ? c2178y2 : new C2178y2(abstractC2172x2);
    }

    @Override
    public final void A(int i7, int i8) throws IOException {
        this.f16191a.i(i7, i8);
    }

    @Override
    public final void B(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2090j3)) {
            if (!z7) {
                while (i8 < list.size()) {
                    AbstractC2172x2 abstractC2172x2 = this.f16191a;
                    long jLongValue = ((Long) list.get(i8)).longValue();
                    abstractC2172x2.w(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long jLongValue2 = ((Long) list.get(i9)).longValue();
                iA += AbstractC2172x2.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f16191a.v(iA);
            while (i8 < list.size()) {
                AbstractC2172x2 abstractC2172x22 = this.f16191a;
                long jLongValue3 = ((Long) list.get(i8)).longValue();
                abstractC2172x22.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i8++;
            }
            return;
        }
        C2090j3 c2090j3 = (C2090j3) list;
        if (!z7) {
            while (i8 < c2090j3.size()) {
                AbstractC2172x2 abstractC2172x23 = this.f16191a;
                long jE = c2090j3.e(i8);
                abstractC2172x23.w(i7, (jE >> 63) ^ (jE + jE));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iA2 = 0;
        for (int i10 = 0; i10 < c2090j3.size(); i10++) {
            long jE2 = c2090j3.e(i10);
            iA2 += AbstractC2172x2.a((jE2 >> 63) ^ (jE2 + jE2));
        }
        this.f16191a.v(iA2);
        while (i8 < c2090j3.size()) {
            AbstractC2172x2 abstractC2172x24 = this.f16191a;
            long jE3 = c2090j3.e(i8);
            abstractC2172x24.x((jE3 >> 63) ^ (jE3 + jE3));
            i8++;
        }
    }

    @Override
    public final void C(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2184z2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.k(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).doubleValue();
                i9 += 8;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.l(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        C2184z2 c2184z2 = (C2184z2) list;
        if (!z7) {
            while (i8 < c2184z2.size()) {
                this.f16191a.k(i7, Double.doubleToRawLongBits(c2184z2.e(i8)));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c2184z2.size(); i12++) {
            c2184z2.e(i12);
            i11 += 8;
        }
        this.f16191a.v(i11);
        while (i8 < c2184z2.size()) {
            this.f16191a.l(Double.doubleToRawLongBits(c2184z2.e(i8)));
            i8++;
        }
    }

    @Override
    public final void D(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof K2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.i(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).floatValue();
                i9 += 4;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.j(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        K2 k22 = (K2) list;
        if (!z7) {
            while (i8 < k22.size()) {
                this.f16191a.i(i7, Float.floatToRawIntBits(k22.e(i8)));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < k22.size(); i12++) {
            k22.e(i12);
            i11 += 4;
        }
        this.f16191a.v(i11);
        while (i8 < k22.size()) {
            this.f16191a.j(Float.floatToRawIntBits(k22.e(i8)));
            i8++;
        }
    }

    @Override
    public final void E(int i7, int i8) throws IOException {
        this.f16191a.u(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override
    public final void F(int i7, List list) throws IOException {
        int i8 = 0;
        if (!(list instanceof InterfaceC2066f3)) {
            while (i8 < list.size()) {
                this.f16191a.s(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        InterfaceC2066f3 interfaceC2066f3 = (InterfaceC2066f3) list;
        while (i8 < list.size()) {
            Object objA = interfaceC2066f3.a();
            if (objA instanceof String) {
                this.f16191a.s(i7, (String) objA);
            } else {
                this.f16191a.h(i7, (AbstractC2131q2) objA);
            }
            i8++;
        }
    }

    @Override
    public final void G(int i7, long j7) throws IOException {
        this.f16191a.w(i7, j7);
    }

    @Override
    public final void H(int i7, Object obj, F3 f32) throws IOException {
        AbstractC2172x2 abstractC2172x2 = this.f16191a;
        abstractC2172x2.t(i7, 3);
        f32.h((InterfaceC2155u3) obj, abstractC2172x2.f16167a);
        abstractC2172x2.t(i7, 4);
    }

    @Override
    public final void I(int i7, AbstractC2131q2 abstractC2131q2) throws IOException {
        this.f16191a.h(i7, abstractC2131q2);
    }

    @Override
    @Deprecated
    public final void J(int i7) throws IOException {
        this.f16191a.t(i7, 4);
    }

    @Override
    @Deprecated
    public final void K(int i7) throws IOException {
        this.f16191a.t(i7, 3);
    }

    @Override
    public final void a(int i7, Object obj, F3 f32) throws IOException {
        this.f16191a.p(i7, (InterfaceC2155u3) obj, f32);
    }

    @Override
    public final void b(int i7, long j7) throws IOException {
        this.f16191a.k(i7, j7);
    }

    @Override
    public final void c(int i7, List list) throws IOException {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f16191a.h(i7, (AbstractC2131q2) list.get(i8));
        }
    }

    @Override
    public final void d(int i7, String str) throws IOException {
        this.f16191a.s(i7, str);
    }

    @Override
    public final void e(int i7, int i8) throws IOException {
        this.f16191a.u(i7, i8);
    }

    @Override
    public final void f(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof S2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.i(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.j(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        S2 s22 = (S2) list;
        if (!z7) {
            while (i8 < s22.size()) {
                this.f16191a.i(i7, s22.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < s22.size(); i12++) {
            s22.e(i12);
            i11 += 4;
        }
        this.f16191a.v(i11);
        while (i8 < s22.size()) {
            this.f16191a.j(s22.e(i8));
            i8++;
        }
    }

    @Override
    public final void g(int i7, int i8) throws IOException {
        this.f16191a.i(i7, i8);
    }

    @Override
    public final void h(int i7, boolean z7) throws IOException {
        this.f16191a.g(i7, z7);
    }

    @Override
    public final void i(int i7, long j7) throws IOException {
        this.f16191a.w(i7, j7);
    }

    @Override
    public final void j(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2077h2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.g(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).booleanValue();
                i9++;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.f(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        C2077h2 c2077h2 = (C2077h2) list;
        if (!z7) {
            while (i8 < c2077h2.size()) {
                this.f16191a.g(i7, c2077h2.g(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c2077h2.size(); i12++) {
            c2077h2.g(i12);
            i11++;
        }
        this.f16191a.v(i11);
        while (i8 < c2077h2.size()) {
            this.f16191a.f(c2077h2.g(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override
    public final void k(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof S2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.u(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iB += AbstractC2172x2.B(((Integer) list.get(i9)).intValue());
            }
            this.f16191a.v(iB);
            while (i8 < list.size()) {
                this.f16191a.v(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        S2 s22 = (S2) list;
        if (!z7) {
            while (i8 < s22.size()) {
                this.f16191a.u(i7, s22.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iB2 = 0;
        for (int i10 = 0; i10 < s22.size(); i10++) {
            iB2 += AbstractC2172x2.B(s22.e(i10));
        }
        this.f16191a.v(iB2);
        while (i8 < s22.size()) {
            this.f16191a.v(s22.e(i8));
            i8++;
        }
    }

    @Override
    public final void l(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof S2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.i(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.j(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        S2 s22 = (S2) list;
        if (!z7) {
            while (i8 < s22.size()) {
                this.f16191a.i(i7, s22.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < s22.size(); i12++) {
            s22.e(i12);
            i11 += 4;
        }
        this.f16191a.v(i11);
        while (i8 < s22.size()) {
            this.f16191a.j(s22.e(i8));
            i8++;
        }
    }

    @Override
    public final void m(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2090j3)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.k(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).longValue();
                i9 += 8;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.l(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        C2090j3 c2090j3 = (C2090j3) list;
        if (!z7) {
            while (i8 < c2090j3.size()) {
                this.f16191a.k(i7, c2090j3.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c2090j3.size(); i12++) {
            c2090j3.e(i12);
            i11 += 8;
        }
        this.f16191a.v(i11);
        while (i8 < c2090j3.size()) {
            this.f16191a.l(c2090j3.e(i8));
            i8++;
        }
    }

    @Override
    public final void n(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof S2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.m(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iA += AbstractC2172x2.a(((Integer) list.get(i9)).intValue());
            }
            this.f16191a.v(iA);
            while (i8 < list.size()) {
                this.f16191a.n(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        S2 s22 = (S2) list;
        if (!z7) {
            while (i8 < s22.size()) {
                this.f16191a.m(i7, s22.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iA2 = 0;
        for (int i10 = 0; i10 < s22.size(); i10++) {
            iA2 += AbstractC2172x2.a(s22.e(i10));
        }
        this.f16191a.v(iA2);
        while (i8 < s22.size()) {
            this.f16191a.n(s22.e(i8));
            i8++;
        }
    }

    @Override
    public final void o(int i7, long j7) throws IOException {
        this.f16191a.k(i7, j7);
    }

    @Override
    public final void p(int i7, int i8) throws IOException {
        this.f16191a.m(i7, i8);
    }

    @Override
    public final void q(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof S2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.m(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iA += AbstractC2172x2.a(((Integer) list.get(i9)).intValue());
            }
            this.f16191a.v(iA);
            while (i8 < list.size()) {
                this.f16191a.n(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        S2 s22 = (S2) list;
        if (!z7) {
            while (i8 < s22.size()) {
                this.f16191a.m(i7, s22.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iA2 = 0;
        for (int i10 = 0; i10 < s22.size(); i10++) {
            iA2 += AbstractC2172x2.a(s22.e(i10));
        }
        this.f16191a.v(iA2);
        while (i8 < s22.size()) {
            this.f16191a.n(s22.e(i8));
            i8++;
        }
    }

    @Override
    public final void r(int i7, int i8) throws IOException {
        this.f16191a.m(i7, i8);
    }

    @Override
    public final void s(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof S2)) {
            if (!z7) {
                while (i8 < list.size()) {
                    AbstractC2172x2 abstractC2172x2 = this.f16191a;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    abstractC2172x2.u(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iB += AbstractC2172x2.B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f16191a.v(iB);
            while (i8 < list.size()) {
                AbstractC2172x2 abstractC2172x22 = this.f16191a;
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                abstractC2172x22.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        S2 s22 = (S2) list;
        if (!z7) {
            while (i8 < s22.size()) {
                AbstractC2172x2 abstractC2172x23 = this.f16191a;
                int iE = s22.e(i8);
                abstractC2172x23.u(i7, (iE >> 31) ^ (iE + iE));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iB2 = 0;
        for (int i10 = 0; i10 < s22.size(); i10++) {
            int iE2 = s22.e(i10);
            iB2 += AbstractC2172x2.B((iE2 >> 31) ^ (iE2 + iE2));
        }
        this.f16191a.v(iB2);
        while (i8 < s22.size()) {
            AbstractC2172x2 abstractC2172x24 = this.f16191a;
            int iE3 = s22.e(i8);
            abstractC2172x24.v((iE3 >> 31) ^ (iE3 + iE3));
            i8++;
        }
    }

    @Override
    public final void t(int i7, double d7) throws IOException {
        this.f16191a.k(i7, Double.doubleToRawLongBits(d7));
    }

    @Override
    public final void u(int i7, long j7) throws IOException {
        this.f16191a.w(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override
    public final void v(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2090j3)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.w(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iA += AbstractC2172x2.a(((Long) list.get(i9)).longValue());
            }
            this.f16191a.v(iA);
            while (i8 < list.size()) {
                this.f16191a.x(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        C2090j3 c2090j3 = (C2090j3) list;
        if (!z7) {
            while (i8 < c2090j3.size()) {
                this.f16191a.w(i7, c2090j3.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iA2 = 0;
        for (int i10 = 0; i10 < c2090j3.size(); i10++) {
            iA2 += AbstractC2172x2.a(c2090j3.e(i10));
        }
        this.f16191a.v(iA2);
        while (i8 < c2090j3.size()) {
            this.f16191a.x(c2090j3.e(i8));
            i8++;
        }
    }

    @Override
    public final void w(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2090j3)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.k(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).longValue();
                i9 += 8;
            }
            this.f16191a.v(i9);
            while (i8 < list.size()) {
                this.f16191a.l(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        C2090j3 c2090j3 = (C2090j3) list;
        if (!z7) {
            while (i8 < c2090j3.size()) {
                this.f16191a.k(i7, c2090j3.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c2090j3.size(); i12++) {
            c2090j3.e(i12);
            i11 += 8;
        }
        this.f16191a.v(i11);
        while (i8 < c2090j3.size()) {
            this.f16191a.l(c2090j3.e(i8));
            i8++;
        }
    }

    @Override
    public final void x(int i7, float f7) throws IOException {
        this.f16191a.i(i7, Float.floatToRawIntBits(f7));
    }

    @Override
    public final void y(int i7, List list, boolean z7) throws IOException {
        int i8 = 0;
        if (!(list instanceof C2090j3)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f16191a.w(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f16191a.t(i7, 2);
            int iA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iA += AbstractC2172x2.a(((Long) list.get(i9)).longValue());
            }
            this.f16191a.v(iA);
            while (i8 < list.size()) {
                this.f16191a.x(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        C2090j3 c2090j3 = (C2090j3) list;
        if (!z7) {
            while (i8 < c2090j3.size()) {
                this.f16191a.w(i7, c2090j3.e(i8));
                i8++;
            }
            return;
        }
        this.f16191a.t(i7, 2);
        int iA2 = 0;
        for (int i10 = 0; i10 < c2090j3.size(); i10++) {
            iA2 += AbstractC2172x2.a(c2090j3.e(i10));
        }
        this.f16191a.v(iA2);
        while (i8 < c2090j3.size()) {
            this.f16191a.x(c2090j3.e(i8));
            i8++;
        }
    }

    @Override
    public final void z(int i7, Object obj) throws IOException {
        if (obj instanceof AbstractC2131q2) {
            this.f16191a.r(i7, (AbstractC2131q2) obj);
        } else {
            this.f16191a.q(i7, (InterfaceC2155u3) obj);
        }
    }
}
