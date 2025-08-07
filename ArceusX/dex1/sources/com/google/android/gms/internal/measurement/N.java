package com.google.android.gms.internal.measurement;

import f6.ck.ZJZXBWla;
import java.util.Iterator;
import java.util.List;

public final class N extends AbstractC2016y {
    protected N() {
        this.f15378a.add(O.ASSIGN);
        this.f15378a.add(O.CONST);
        this.f15378a.add(O.CREATE_ARRAY);
        this.f15378a.add(O.CREATE_OBJECT);
        this.f15378a.add(O.EXPRESSION_LIST);
        this.f15378a.add(O.GET);
        this.f15378a.add(O.GET_INDEX);
        this.f15378a.add(O.GET_PROPERTY);
        this.f15378a.add(O.NULL);
        this.f15378a.add(O.SET_PROPERTY);
        this.f15378a.add(O.TYPEOF);
        this.f15378a.add(O.UNDEFINED);
        this.f15378a.add(O.VAR);
    }

    @Override
    public final r a(String str, T1 t1, List<r> list) {
        String str2;
        O o2 = O.ADD;
        int iOrdinal = C1987u2.e(str).ordinal();
        int i7 = 0;
        if (iOrdinal == 3) {
            C1987u2.h(O.ASSIGN.name(), 2, list);
            r rVarB = t1.b(list.get(0));
            if (!(rVarB instanceof C1992v)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", rVarB.getClass().getCanonicalName()));
            }
            if (!t1.h(rVarB.e())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", rVarB.e()));
            }
            r rVarB2 = t1.b(list.get(1));
            t1.g(rVarB.e(), rVarB2);
            return rVarB2;
        }
        if (iOrdinal == 14) {
            C1987u2.i(O.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i7 < list.size() - 1) {
                r rVarB3 = t1.b(list.get(i7));
                if (!(rVarB3 instanceof C1992v)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", rVarB3.getClass().getCanonicalName()));
                }
                t1.f(rVarB3.e(), t1.b(list.get(i7 + 1)));
                i7 += 2;
            }
            return r.f15282g;
        }
        if (iOrdinal == 24) {
            C1987u2.i(O.EXPRESSION_LIST.name(), 1, list);
            r rVarB4 = r.f15282g;
            while (i7 < list.size()) {
                rVarB4 = t1.b(list.get(i7));
                if (rVarB4 instanceof C1881h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i7++;
            }
            return rVarB4;
        }
        if (iOrdinal == 33) {
            C1987u2.h(O.GET.name(), 1, list);
            r rVarB5 = t1.b(list.get(0));
            if (rVarB5 instanceof C1992v) {
                return t1.d(rVarB5.e());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", rVarB5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            C1987u2.h(O.NULL.name(), 0, list);
            return r.f15283h;
        }
        if (iOrdinal == 58) {
            C1987u2.h(O.SET_PROPERTY.name(), 3, list);
            r rVarB6 = t1.b(list.get(0));
            r rVarB7 = t1.b(list.get(1));
            r rVarB8 = t1.b(list.get(2));
            if (rVarB6 == r.f15282g || rVarB6 == r.f15283h) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", rVarB7.e(), rVarB6.e()));
            }
            if ((rVarB6 instanceof C1865f) && (rVarB7 instanceof C1897j)) {
                ((C1865f) rVarB6).v(rVarB7.f().intValue(), rVarB8);
            } else if (rVarB6 instanceof InterfaceC1929n) {
                ((InterfaceC1929n) rVarB6).k(rVarB7.e(), rVarB8);
            }
            return rVarB8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C1865f();
            }
            C1865f c1865f = new C1865f();
            Iterator<r> it = list.iterator();
            while (it.hasNext()) {
                r rVarB9 = t1.b(it.next());
                if (rVarB9 instanceof C1881h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c1865f.v(i7, rVarB9);
                i7++;
            }
            return c1865f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C1937o();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C1937o c1937o = new C1937o();
            while (i7 < list.size() - 1) {
                r rVarB10 = t1.b(list.get(i7));
                r rVarB11 = t1.b(list.get(i7 + 1));
                if ((rVarB10 instanceof C1881h) || (rVarB11 instanceof C1881h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c1937o.k(rVarB10.e(), rVarB11);
                i7 += 2;
            }
            return c1937o;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            C1987u2.h(O.GET_PROPERTY.name(), 2, list);
            r rVarB12 = t1.b(list.get(0));
            r rVarB13 = t1.b(list.get(1));
            if ((rVarB12 instanceof C1865f) && C1987u2.k(rVarB13)) {
                return ((C1865f) rVarB12).o(rVarB13.f().intValue());
            }
            if (rVarB12 instanceof InterfaceC1929n) {
                return ((InterfaceC1929n) rVarB12).D(rVarB13.e());
            }
            if (rVarB12 instanceof C1992v) {
                if ("length".equals(rVarB13.e())) {
                    return new C1897j(Double.valueOf(rVarB12.e().length()));
                }
                if (C1987u2.k(rVarB13) && rVarB13.f().doubleValue() < rVarB12.e().length()) {
                    return new C1992v(String.valueOf(rVarB12.e().charAt(rVarB13.f().intValue())));
                }
            }
            return r.f15282g;
        }
        switch (iOrdinal) {
            case 62:
                C1987u2.h(O.TYPEOF.name(), 1, list);
                r rVarB14 = t1.b(list.get(0));
                if (rVarB14 instanceof C2000w) {
                    str2 = "undefined";
                } else if (rVarB14 instanceof C1873g) {
                    str2 = "boolean";
                } else if (rVarB14 instanceof C1897j) {
                    str2 = "number";
                } else if (rVarB14 instanceof C1992v) {
                    str2 = ZJZXBWla.qUyDIKkOtgotD;
                } else if (rVarB14 instanceof C1953q) {
                    str2 = "function";
                } else {
                    if ((rVarB14 instanceof C1968s) || (rVarB14 instanceof C1881h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", rVarB14));
                    }
                    str2 = "object";
                }
                return new C1992v(str2);
            case 63:
                C1987u2.h(O.UNDEFINED.name(), 0, list);
                return r.f15282g;
            case 64:
                C1987u2.i(O.VAR.name(), 1, list);
                Iterator<r> it2 = list.iterator();
                while (it2.hasNext()) {
                    r rVarB15 = t1.b(it2.next());
                    if (!(rVarB15 instanceof C1992v)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", rVarB15.getClass().getCanonicalName()));
                    }
                    t1.e(rVarB15.e(), r.f15282g);
                }
                return r.f15282g;
            default:
                return super.b(str);
        }
    }
}
