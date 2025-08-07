package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import k0.BAKp.xAQOwX;

public final class K extends AbstractC2016y {
    protected K() {
        this.f15378a.add(O.FOR_IN);
        this.f15378a.add(O.FOR_IN_CONST);
        this.f15378a.add(O.FOR_IN_LET);
        this.f15378a.add(O.FOR_LET);
        this.f15378a.add(O.FOR_OF);
        this.f15378a.add(O.FOR_OF_CONST);
        this.f15378a.add(O.FOR_OF_LET);
        this.f15378a.add(O.WHILE);
    }

    private static r c(I i7, Iterator<r> it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r rVarC = i7.a(it.next()).c((C1865f) rVar);
                if (rVarC instanceof C1881h) {
                    C1881h c1881h = (C1881h) rVarC;
                    if ("break".equals(c1881h.b())) {
                        return r.f15282g;
                    }
                    if ("return".equals(c1881h.b())) {
                        return c1881h;
                    }
                }
            }
        }
        return r.f15282g;
    }

    private static r d(I i7, r rVar, r rVar2) {
        return c(i7, rVar.j(), rVar2);
    }

    private static r e(I i7, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return c(i7, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override
    public final r a(String str, T1 t1, List<r> list) {
        O o2 = O.ADD;
        int iOrdinal = C1987u2.e(str).ordinal();
        if (iOrdinal == 65) {
            C1987u2.h(O.WHILE.name(), 4, list);
            r rVar = list.get(0);
            r rVar2 = list.get(1);
            r rVar3 = list.get(2);
            r rVarB = t1.b(list.get(3));
            if (t1.b(rVar3).g().booleanValue()) {
                r rVarC = t1.c((C1865f) rVarB);
                if (rVarC instanceof C1881h) {
                    C1881h c1881h = (C1881h) rVarC;
                    if ("break".equals(c1881h.b())) {
                        return r.f15282g;
                    }
                    if ("return".equals(c1881h.b())) {
                        return c1881h;
                    }
                }
            }
            while (t1.b(rVar).g().booleanValue()) {
                r rVarC2 = t1.c((C1865f) rVarB);
                if (rVarC2 instanceof C1881h) {
                    C1881h c1881h2 = (C1881h) rVarC2;
                    if ("break".equals(c1881h2.b())) {
                        return r.f15282g;
                    }
                    if ("return".equals(c1881h2.b())) {
                        return c1881h2;
                    }
                }
                t1.b(rVar2);
            }
            return r.f15282g;
        }
        switch (iOrdinal) {
            case 26:
                C1987u2.h(O.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C1992v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return d(new J(t1, list.get(0).e()), t1.b(list.get(1)), t1.b(list.get(2)));
            case 27:
                C1987u2.h(O.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C1992v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return d(new G(t1, list.get(0).e()), t1.b(list.get(1)), t1.b(list.get(2)));
            case 28:
                C1987u2.h(O.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C1992v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return d(new H(t1, list.get(0).e()), t1.b(list.get(1)), t1.b(list.get(2)));
            case 29:
                C1987u2.h(O.FOR_LET.name(), 4, list);
                r rVarB2 = t1.b(list.get(0));
                if (!(rVarB2 instanceof C1865f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C1865f c1865f = (C1865f) rVarB2;
                r rVar4 = list.get(1);
                r rVar5 = list.get(2);
                r rVarB3 = t1.b(list.get(3));
                T1 t1A = t1.a();
                for (int i7 = 0; i7 < c1865f.n(); i7++) {
                    String strE = c1865f.o(i7).e();
                    t1A.g(strE, t1.d(strE));
                }
                while (t1.b(rVar4).g().booleanValue()) {
                    r rVarC3 = t1.c((C1865f) rVarB3);
                    if (rVarC3 instanceof C1881h) {
                        C1881h c1881h3 = (C1881h) rVarC3;
                        if ("break".equals(c1881h3.b())) {
                            return r.f15282g;
                        }
                        if ("return".equals(c1881h3.b())) {
                            return c1881h3;
                        }
                    }
                    T1 t1A2 = t1.a();
                    for (int i8 = 0; i8 < c1865f.n(); i8++) {
                        String strE2 = c1865f.o(i8).e();
                        t1A2.g(strE2, t1A.d(strE2));
                    }
                    t1A2.b(rVar5);
                    t1A = t1A2;
                }
                return r.f15282g;
            case 30:
                C1987u2.h(O.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C1992v)) {
                    throw new IllegalArgumentException(xAQOwX.NvsQiyrlZkYn);
                }
                return e(new J(t1, list.get(0).e()), t1.b(list.get(1)), t1.b(list.get(2)));
            case 31:
                C1987u2.h(O.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C1992v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new G(t1, list.get(0).e()), t1.b(list.get(1)), t1.b(list.get(2)));
            case 32:
                C1987u2.h(O.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C1992v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new H(t1, list.get(0).e()), t1.b(list.get(1)), t1.b(list.get(2)));
            default:
                return super.b(str);
        }
    }
}
