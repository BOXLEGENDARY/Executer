package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class E {
    public static r a(String str, C1865f c1865f, T1 t1, List<r> list) {
        String str2;
        char c2;
        double dA;
        String strE;
        double d7;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c2 = 18;
                    break;
                } else {
                    c2 = 65535;
                    break;
                }
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c2 = 0;
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c2 = 2;
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c2 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c2 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    str2 = "toString";
                    c2 = 3;
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c2 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c2 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c2 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c2 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c2 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c2 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c2 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c2 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c2 = 1;
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c2 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c2 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c2 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c2 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c2 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c2 = 65535;
                break;
            default:
                str2 = "toString";
                c2 = 65535;
                break;
        }
        AbstractC1905k abstractC1905k = null;
        switch (c2) {
            case 0:
                r rVarD = c1865f.d();
                if (!list.isEmpty()) {
                    Iterator<r> it = list.iterator();
                    while (it.hasNext()) {
                        r rVarB = t1.b(it.next());
                        if (rVarB instanceof C1881h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        C1865f c1865f2 = (C1865f) rVarD;
                        int iN = c1865f2.n();
                        if (rVarB instanceof C1865f) {
                            C1865f c1865f3 = (C1865f) rVarB;
                            Iterator<Integer> itQ = c1865f3.q();
                            while (itQ.hasNext()) {
                                Integer next = itQ.next();
                                c1865f2.v(next.intValue() + iN, c1865f3.o(next.intValue()));
                            }
                        } else {
                            c1865f2.v(iN, rVarB);
                        }
                    }
                }
                return rVarD;
            case 1:
                C1987u2.h("every", 1, list);
                r rVarB2 = t1.b(list.get(0));
                if (!(rVarB2 instanceof C1953q)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1865f.n() != 0 && b(c1865f, t1, (C1953q) rVarB2, Boolean.FALSE, Boolean.TRUE).n() != c1865f.n()) {
                    return r.f15288n;
                }
                return r.f15287m;
            case 2:
                C1987u2.h("filter", 1, list);
                r rVarB3 = t1.b(list.get(0));
                if (!(rVarB3 instanceof C1953q)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1865f.m() == 0) {
                    return new C1865f();
                }
                r rVarD2 = c1865f.d();
                C1865f c1865fB = b(c1865f, t1, (C1953q) rVarB3, null, Boolean.TRUE);
                C1865f c1865f4 = new C1865f();
                Iterator<Integer> itQ2 = c1865fB.q();
                while (itQ2.hasNext()) {
                    c1865f4.v(c1865f4.n(), ((C1865f) rVarD2).o(itQ2.next().intValue()));
                }
                return c1865f4;
            case 3:
                C1987u2.h("forEach", 1, list);
                r rVarB4 = t1.b(list.get(0));
                if (!(rVarB4 instanceof C1953q)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1865f.m() == 0) {
                    return r.f15282g;
                }
                b(c1865f, t1, (C1953q) rVarB4, null, null);
                return r.f15282g;
            case 4:
                C1987u2.j("indexOf", 2, list);
                r rVarB5 = r.f15282g;
                if (!list.isEmpty()) {
                    rVarB5 = t1.b(list.get(0));
                }
                if (list.size() > 1) {
                    dA = C1987u2.a(t1.b(list.get(1)).f().doubleValue());
                    if (dA >= c1865f.n()) {
                        return new C1897j(Double.valueOf(-1.0d));
                    }
                    if (dA < 0.0d) {
                        dA += c1865f.n();
                    }
                } else {
                    dA = 0.0d;
                }
                Iterator<Integer> itQ3 = c1865f.q();
                while (itQ3.hasNext()) {
                    int iIntValue = itQ3.next().intValue();
                    double d8 = iIntValue;
                    if (d8 >= dA && C1987u2.l(c1865f.o(iIntValue), rVarB5)) {
                        return new C1897j(Double.valueOf(d8));
                    }
                }
                return new C1897j(Double.valueOf(-1.0d));
            case 5:
                C1987u2.j("join", 1, list);
                if (c1865f.n() == 0) {
                    return r.f15289o;
                }
                if (list.size() > 0) {
                    r rVarB6 = t1.b(list.get(0));
                    strE = ((rVarB6 instanceof C1945p) || (rVarB6 instanceof C2000w)) ? BuildConfig.FLAVOR : rVarB6.e();
                } else {
                    strE = ",";
                }
                return new C1992v(c1865f.p(strE));
            case 6:
                C1987u2.j("lastIndexOf", 2, list);
                r rVarB7 = r.f15282g;
                if (!list.isEmpty()) {
                    rVarB7 = t1.b(list.get(0));
                }
                double dN = c1865f.n() - 1;
                if (list.size() > 1) {
                    r rVarB8 = t1.b(list.get(1));
                    dN = Double.isNaN(rVarB8.f().doubleValue()) ? c1865f.n() - 1 : C1987u2.a(rVarB8.f().doubleValue());
                    d7 = 0.0d;
                    if (dN < 0.0d) {
                        dN += c1865f.n();
                    }
                } else {
                    d7 = 0.0d;
                }
                if (dN < d7) {
                    return new C1897j(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(c1865f.n(), dN); iMin >= 0; iMin--) {
                    if (c1865f.w(iMin) && C1987u2.l(c1865f.o(iMin), rVarB7)) {
                        return new C1897j(Double.valueOf(iMin));
                    }
                }
                return new C1897j(Double.valueOf(-1.0d));
            case 7:
                C1987u2.h("map", 1, list);
                r rVarB9 = t1.b(list.get(0));
                if (rVarB9 instanceof C1953q) {
                    return c1865f.n() == 0 ? new C1865f() : b(c1865f, t1, (C1953q) rVarB9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                C1987u2.h("pop", 0, list);
                int iN2 = c1865f.n();
                if (iN2 == 0) {
                    return r.f15282g;
                }
                int i7 = iN2 - 1;
                r rVarO = c1865f.o(i7);
                c1865f.u(i7);
                return rVarO;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator<r> it2 = list.iterator();
                    while (it2.hasNext()) {
                        c1865f.v(c1865f.n(), t1.b(it2.next()));
                    }
                }
                return new C1897j(Double.valueOf(c1865f.n()));
            case '\n':
                return c(c1865f, t1, list, true);
            case 11:
                return c(c1865f, t1, list, false);
            case '\f':
                C1987u2.h("reverse", 0, list);
                int iN3 = c1865f.n();
                if (iN3 != 0) {
                    for (int i8 = 0; i8 < iN3 / 2; i8++) {
                        if (c1865f.w(i8)) {
                            r rVarO2 = c1865f.o(i8);
                            c1865f.v(i8, null);
                            int i9 = (iN3 - 1) - i8;
                            if (c1865f.w(i9)) {
                                c1865f.v(i8, c1865f.o(i9));
                            }
                            c1865f.v(i9, rVarO2);
                        }
                    }
                }
                return c1865f;
            case '\r':
                C1987u2.h("shift", 0, list);
                if (c1865f.n() == 0) {
                    return r.f15282g;
                }
                r rVarO3 = c1865f.o(0);
                c1865f.u(0);
                return rVarO3;
            case 14:
                C1987u2.j("slice", 2, list);
                if (list.isEmpty()) {
                    return c1865f.d();
                }
                double dN2 = c1865f.n();
                double dA2 = C1987u2.a(t1.b(list.get(0)).f().doubleValue());
                double dMax = dA2 < 0.0d ? Math.max(dA2 + dN2, 0.0d) : Math.min(dA2, dN2);
                if (list.size() == 2) {
                    double dA3 = C1987u2.a(t1.b(list.get(1)).f().doubleValue());
                    dN2 = dA3 < 0.0d ? Math.max(dN2 + dA3, 0.0d) : Math.min(dN2, dA3);
                }
                C1865f c1865f5 = new C1865f();
                for (int i10 = (int) dMax; i10 < dN2; i10++) {
                    c1865f5.v(c1865f5.n(), c1865f.o(i10));
                }
                return c1865f5;
            case 15:
                C1987u2.h("some", 1, list);
                r rVarB10 = t1.b(list.get(0));
                if (!(rVarB10 instanceof AbstractC1905k)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1865f.n() == 0) {
                    return r.f15288n;
                }
                AbstractC1905k abstractC1905k2 = (AbstractC1905k) rVarB10;
                Iterator<Integer> itQ4 = c1865f.q();
                while (itQ4.hasNext()) {
                    int iIntValue2 = itQ4.next().intValue();
                    if (c1865f.w(iIntValue2) && abstractC1905k2.a(t1, Arrays.asList(c1865f.o(iIntValue2), new C1897j(Double.valueOf(iIntValue2)), c1865f)).g().booleanValue()) {
                        return r.f15287m;
                    }
                }
                return r.f15288n;
            case 16:
                C1987u2.j("sort", 1, list);
                if (c1865f.n() >= 2) {
                    List<r> listR = c1865f.r();
                    if (!list.isEmpty()) {
                        r rVarB11 = t1.b(list.get(0));
                        if (!(rVarB11 instanceof AbstractC1905k)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC1905k = (AbstractC1905k) rVarB11;
                    }
                    Collections.sort(listR, new D(abstractC1905k, t1));
                    c1865f.s();
                    Iterator<r> it3 = listR.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        c1865f.v(i11, it3.next());
                        i11++;
                    }
                }
                return c1865f;
            case 17:
                if (list.isEmpty()) {
                    return new C1865f();
                }
                int iA = (int) C1987u2.a(t1.b(list.get(0)).f().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + c1865f.n());
                } else if (iA > c1865f.n()) {
                    iA = c1865f.n();
                }
                int iN4 = c1865f.n();
                C1865f c1865f6 = new C1865f();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) C1987u2.a(t1.b(list.get(1)).f().doubleValue()));
                    if (iMax > 0) {
                        for (int i12 = iA; i12 < Math.min(iN4, iA + iMax); i12++) {
                            c1865f6.v(c1865f6.n(), c1865f.o(iA));
                            c1865f.u(iA);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i13 = 2; i13 < list.size(); i13++) {
                            r rVarB12 = t1.b(list.get(i13));
                            if (rVarB12 instanceof C1881h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            c1865f.t((iA + i13) - 2, rVarB12);
                        }
                    }
                } else {
                    while (iA < iN4) {
                        c1865f6.v(c1865f6.n(), c1865f.o(iA));
                        c1865f.v(iA, null);
                        iA++;
                    }
                }
                return c1865f6;
            case 18:
                C1987u2.h(str2, 0, list);
                return new C1992v(c1865f.p(","));
            case 19:
                if (!list.isEmpty()) {
                    C1865f c1865f7 = new C1865f();
                    Iterator<r> it4 = list.iterator();
                    while (it4.hasNext()) {
                        r rVarB13 = t1.b(it4.next());
                        if (rVarB13 instanceof C1881h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c1865f7.v(c1865f7.n(), rVarB13);
                    }
                    int iN5 = c1865f7.n();
                    Iterator<Integer> itQ5 = c1865f.q();
                    while (itQ5.hasNext()) {
                        Integer next2 = itQ5.next();
                        c1865f7.v(next2.intValue() + iN5, c1865f.o(next2.intValue()));
                    }
                    c1865f.s();
                    Iterator<Integer> itQ6 = c1865f7.q();
                    while (itQ6.hasNext()) {
                        Integer next3 = itQ6.next();
                        c1865f.v(next3.intValue(), c1865f7.o(next3.intValue()));
                    }
                }
                return new C1897j(Double.valueOf(c1865f.n()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static C1865f b(C1865f c1865f, T1 t1, AbstractC1905k abstractC1905k, Boolean bool, Boolean bool2) {
        C1865f c1865f2 = new C1865f();
        Iterator<Integer> itQ = c1865f.q();
        while (itQ.hasNext()) {
            int iIntValue = itQ.next().intValue();
            if (c1865f.w(iIntValue)) {
                r rVarA = abstractC1905k.a(t1, Arrays.asList(c1865f.o(iIntValue), new C1897j(Double.valueOf(iIntValue)), c1865f));
                if (rVarA.g().equals(bool)) {
                    return c1865f2;
                }
                if (bool2 == null || rVarA.g().equals(bool2)) {
                    c1865f2.v(iIntValue, rVarA);
                }
            }
        }
        return c1865f2;
    }

    private static r c(C1865f c1865f, T1 t1, List<r> list, boolean z7) {
        r rVarA;
        C1987u2.i("reduce", 1, list);
        C1987u2.j("reduce", 2, list);
        r rVarB = t1.b(list.get(0));
        if (!(rVarB instanceof AbstractC1905k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            rVarA = t1.b(list.get(1));
            if (rVarA instanceof C1881h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c1865f.n() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            rVarA = null;
        }
        AbstractC1905k abstractC1905k = (AbstractC1905k) rVarB;
        int iN = c1865f.n();
        int i7 = z7 ? 0 : iN - 1;
        int i8 = z7 ? iN - 1 : 0;
        int i9 = true == z7 ? 1 : -1;
        if (rVarA == null) {
            rVarA = c1865f.o(i7);
            i7 += i9;
        }
        while ((i8 - i7) * i9 >= 0) {
            if (c1865f.w(i7)) {
                rVarA = abstractC1905k.a(t1, Arrays.asList(rVarA, c1865f.o(i7), new C1897j(Double.valueOf(i7)), c1865f));
                if (rVarA instanceof C1881h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i7 += i9;
            } else {
                i7 += i9;
            }
        }
        return rVarA;
    }
}
