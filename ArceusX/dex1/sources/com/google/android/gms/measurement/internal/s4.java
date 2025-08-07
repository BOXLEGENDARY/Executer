package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1891i1;
import com.google.android.gms.internal.measurement.C1947p1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import n3.C2651i;

abstract class s4 {

    final String f17015a;

    final int f17016b;

    Boolean f17017c;

    Boolean f17018d;

    Long f17019e;

    Long f17020f;

    s4(String str, int i7) {
        this.f17015a = str;
        this.f17016b = i7;
    }

    private static Boolean d(String str, int i7, boolean z7, String str2, List<String> list, String str3, C2234j1 c2234j1) {
        if (i7 == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && i7 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i7 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (c2234j1 != null) {
                            c2234j1.w().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean e(BigDecimal bigDecimal, C1891i1 c1891i1, double d7) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C2651i.l(c1891i1);
        if (c1891i1.D()) {
            if (c1891i1.I() != 1) {
                if (c1891i1.I() == 5) {
                    if (!c1891i1.H() || !c1891i1.G()) {
                        return null;
                    }
                } else if (!c1891i1.E()) {
                    return null;
                }
                int I2 = c1891i1.I();
                if (c1891i1.I() == 5) {
                    if (e4.P(c1891i1.B()) && e4.P(c1891i1.z())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c1891i1.B());
                            bigDecimal4 = new BigDecimal(c1891i1.z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!e4.P(c1891i1.y())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c1891i1.y());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (I2 == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i7 = I2 - 1;
                if (i7 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i7 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i7 != 3) {
                    if (i7 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d7 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d7).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d7).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    static Boolean f(String str, C1947p1 c1947p1, C2234j1 c2234j1) {
        List<String> list;
        C2651i.l(c1947p1);
        if (str == null || !c1947p1.F() || c1947p1.G() == 1) {
            return null;
        }
        if (c1947p1.G() == 7) {
            if (c1947p1.w() == 0) {
                return null;
            }
        } else if (!c1947p1.E()) {
            return null;
        }
        int iG = c1947p1.G();
        boolean zC = c1947p1.C();
        String strZ = (zC || iG == 2 || iG == 7) ? c1947p1.z() : c1947p1.z().toUpperCase(Locale.ENGLISH);
        if (c1947p1.w() == 0) {
            list = null;
        } else {
            List<String> listB = c1947p1.B();
            if (!zC) {
                ArrayList arrayList = new ArrayList(listB.size());
                Iterator<String> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listB = Collections.unmodifiableList(arrayList);
            }
            list = listB;
        }
        return d(str, iG, zC, strZ, list, iG == 2 ? strZ : null, c2234j1);
    }

    static Boolean g(double d7, C1891i1 c1891i1) {
        try {
            return e(new BigDecimal(d7), c1891i1, Math.ulp(d7));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(long j7, C1891i1 c1891i1) {
        try {
            return e(new BigDecimal(j7), c1891i1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, C1891i1 c1891i1) {
        if (!e4.P(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), c1891i1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}
