package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

final class C3 {

    private final B3 f14683a;

    private C3(B3 b3) {
        C1838b4.f(b3, "output");
        this.f14683a = b3;
        b3.f14657a = this;
    }

    public static C3 l(B3 b3) {
        C3 c3 = b3.f14657a;
        return c3 != null ? c3 : new C3(b3);
    }

    public final void A(int i7, List<Float> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.k(i7, Float.floatToRawIntBits(list.get(i8).floatValue()));
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).floatValue();
            i9 += 4;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.l(Float.floatToRawIntBits(list.get(i8).floatValue()));
            i8++;
        }
    }

    public final void B(int i7, Object obj, J4 j42) throws IOException {
        B3 b3 = this.f14683a;
        b3.s(i7, 3);
        j42.i((InterfaceC2021y4) obj, b3.f14657a);
        b3.s(i7, 4);
    }

    public final void C(int i7, int i8) throws IOException {
        this.f14683a.o(i7, i8);
    }

    public final void D(int i7, List<Integer> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.o(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iZ = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iZ += B3.z(list.get(i9).intValue());
        }
        this.f14683a.u(iZ);
        while (i8 < list.size()) {
            this.f14683a.p(list.get(i8).intValue());
            i8++;
        }
    }

    public final void E(int i7, long j7) throws IOException {
        this.f14683a.v(i7, j7);
    }

    public final void F(int i7, List<Long> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.v(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iB = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iB += B3.b(list.get(i9).longValue());
        }
        this.f14683a.u(iB);
        while (i8 < list.size()) {
            this.f14683a.w(list.get(i8).longValue());
            i8++;
        }
    }

    public final void G(int i7, Object obj, J4 j42) throws IOException {
        InterfaceC2021y4 interfaceC2021y4 = (InterfaceC2021y4) obj;
        C2028z3 c2028z3 = (C2028z3) this.f14683a;
        c2028z3.u((i7 << 3) | 2);
        AbstractC1853d3 abstractC1853d3 = (AbstractC1853d3) interfaceC2021y4;
        int iF = abstractC1853d3.f();
        if (iF == -1) {
            iF = j42.a(abstractC1853d3);
            abstractC1853d3.i(iF);
        }
        c2028z3.u(iF);
        j42.i(interfaceC2021y4, c2028z3.f14657a);
    }

    public final void H(int i7, int i8) throws IOException {
        this.f14683a.k(i7, i8);
    }

    public final void I(int i7, List<Integer> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.k(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).intValue();
            i9 += 4;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.l(list.get(i8).intValue());
            i8++;
        }
    }

    public final void J(int i7, long j7) throws IOException {
        this.f14683a.m(i7, j7);
    }

    public final void K(int i7, List<Long> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.m(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).longValue();
            i9 += 8;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.n(list.get(i8).longValue());
            i8++;
        }
    }

    public final void a(int i7, int i8) throws IOException {
        this.f14683a.t(i7, (i8 >> 31) ^ (i8 + i8));
    }

    public final void b(int i7, List<Integer> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                B3 b3 = this.f14683a;
                int iIntValue = list.get(i8).intValue();
                b3.t(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iA = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue2 = list.get(i9).intValue();
            iA += B3.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f14683a.u(iA);
        while (i8 < list.size()) {
            B3 b32 = this.f14683a;
            int iIntValue3 = list.get(i8).intValue();
            b32.u((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i8++;
        }
    }

    public final void c(int i7, long j7) throws IOException {
        this.f14683a.v(i7, (j7 >> 63) ^ (j7 + j7));
    }

    public final void d(int i7, List<Long> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                B3 b3 = this.f14683a;
                long jLongValue = list.get(i8).longValue();
                b3.v(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iB = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = list.get(i9).longValue();
            iB += B3.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f14683a.u(iB);
        while (i8 < list.size()) {
            B3 b32 = this.f14683a;
            long jLongValue3 = list.get(i8).longValue();
            b32.w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i8++;
        }
    }

    @Deprecated
    public final void e(int i7) throws IOException {
        this.f14683a.s(i7, 3);
    }

    public final void f(int i7, String str) throws IOException {
        this.f14683a.r(i7, str);
    }

    public final void g(int i7, List<String> list) throws IOException {
        int i8 = 0;
        if (!(list instanceof InterfaceC1886h4)) {
            while (i8 < list.size()) {
                this.f14683a.r(i7, list.get(i8));
                i8++;
            }
            return;
        }
        InterfaceC1886h4 interfaceC1886h4 = (InterfaceC1886h4) list;
        while (i8 < list.size()) {
            Object objC = interfaceC1886h4.c(i8);
            if (objC instanceof String) {
                this.f14683a.r(i7, (String) objC);
            } else {
                this.f14683a.j(i7, (AbstractC1980t3) objC);
            }
            i8++;
        }
    }

    public final void h(int i7, int i8) throws IOException {
        this.f14683a.t(i7, i8);
    }

    public final void i(int i7, List<Integer> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.t(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iA = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iA += B3.a(list.get(i9).intValue());
        }
        this.f14683a.u(iA);
        while (i8 < list.size()) {
            this.f14683a.u(list.get(i8).intValue());
            i8++;
        }
    }

    public final void j(int i7, long j7) throws IOException {
        this.f14683a.v(i7, j7);
    }

    public final void k(int i7, List<Long> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.v(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iB = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iB += B3.b(list.get(i9).longValue());
        }
        this.f14683a.u(iB);
        while (i8 < list.size()) {
            this.f14683a.w(list.get(i8).longValue());
            i8++;
        }
    }

    public final void m(int i7, boolean z7) throws IOException {
        this.f14683a.i(i7, z7);
    }

    public final void n(int i7, List<Boolean> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.i(i7, list.get(i8).booleanValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).booleanValue();
            i9++;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.h(list.get(i8).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public final void o(int i7, AbstractC1980t3 abstractC1980t3) throws IOException {
        this.f14683a.j(i7, abstractC1980t3);
    }

    public final void p(int i7, List<AbstractC1980t3> list) throws IOException {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f14683a.j(i7, list.get(i8));
        }
    }

    public final void q(int i7, double d7) throws IOException {
        this.f14683a.m(i7, Double.doubleToRawLongBits(d7));
    }

    public final void r(int i7, List<Double> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.m(i7, Double.doubleToRawLongBits(list.get(i8).doubleValue()));
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).doubleValue();
            i9 += 8;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.n(Double.doubleToRawLongBits(list.get(i8).doubleValue()));
            i8++;
        }
    }

    @Deprecated
    public final void s(int i7) throws IOException {
        this.f14683a.s(i7, 4);
    }

    public final void t(int i7, int i8) throws IOException {
        this.f14683a.o(i7, i8);
    }

    public final void u(int i7, List<Integer> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.o(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int iZ = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iZ += B3.z(list.get(i9).intValue());
        }
        this.f14683a.u(iZ);
        while (i8 < list.size()) {
            this.f14683a.p(list.get(i8).intValue());
            i8++;
        }
    }

    public final void v(int i7, int i8) throws IOException {
        this.f14683a.k(i7, i8);
    }

    public final void w(int i7, List<Integer> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.k(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).intValue();
            i9 += 4;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.l(list.get(i8).intValue());
            i8++;
        }
    }

    public final void x(int i7, long j7) throws IOException {
        this.f14683a.m(i7, j7);
    }

    public final void y(int i7, List<Long> list, boolean z7) throws IOException {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f14683a.m(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f14683a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).longValue();
            i9 += 8;
        }
        this.f14683a.u(i9);
        while (i8 < list.size()) {
            this.f14683a.n(list.get(i8).longValue());
            i8++;
        }
    }

    public final void z(int i7, float f7) throws IOException {
        this.f14683a.k(i7, Float.floatToRawIntBits(f7));
    }
}
