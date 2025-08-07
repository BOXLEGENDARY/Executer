package com.google.android.gms.measurement.internal;

import Z.tNT.PexNRiLSd;
import Za.qhkq.dHkZSUxHu;
import android.text.TextUtils;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import n3.C2651i;

public final class C2234j1 extends AbstractC2230i2 {

    private char f16844c;

    private long f16845d;

    private String f16846e;

    private final C2224h1 f16847f;

    private final C2224h1 f16848g;

    private final C2224h1 f16849h;

    private final C2224h1 f16850i;

    private final C2224h1 f16851j;

    private final C2224h1 f16852k;

    private final C2224h1 f16853l;

    private final C2224h1 f16854m;

    private final C2224h1 f16855n;

    C2234j1(N1 n1) {
        super(n1);
        this.f16844c = (char) 0;
        this.f16845d = -1L;
        this.f16847f = new C2224h1(this, 6, false, false);
        this.f16848g = new C2224h1(this, 6, true, false);
        this.f16849h = new C2224h1(this, 6, false, true);
        this.f16850i = new C2224h1(this, 5, false, false);
        this.f16851j = new C2224h1(this, 5, true, false);
        this.f16852k = new C2224h1(this, 5, false, true);
        this.f16853l = new C2224h1(this, 4, false, false);
        this.f16854m = new C2224h1(this, 3, false, false);
        this.f16855n = new C2224h1(this, 2, false, false);
    }

    static String A(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String strB = B(z7, obj);
        String strB2 = B(z7, obj2);
        String strB3 = B(z7, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    static String B(boolean z7, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        boolean z8 = obj instanceof Long;
        String str2 = dHkZSUxHu.zBfNg;
        int i7 = 0;
        if (z8) {
            if (!z7) {
                return obj.toString();
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = str2;
            }
            String strValueOf = String.valueOf(Math.abs(l7.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append(PexNRiLSd.ifqvRoQgkAca);
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C2229i1 ? ((C2229i1) obj).f16833a : z7 ? str2 : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String strG = G(N1.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(strG)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i7++;
        }
        return sb2.toString();
    }

    private static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    protected static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new C2229i1(str);
    }

    protected final String C() {
        String str;
        synchronized (this) {
            try {
                if (this.f16846e == null) {
                    if (this.f16818a.Q() != null) {
                        this.f16846e = this.f16818a.Q();
                    } else {
                        this.f16846e = this.f16818a.z().w();
                    }
                }
                C2651i.l(this.f16846e);
                str = this.f16846e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected final void F(int i7, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z7 && Log.isLoggable(C(), i7)) {
            Log.println(i7, C(), A(false, str, obj, obj2, obj3));
        }
        if (z8 || i7 < 5) {
            return;
        }
        C2651i.l(str);
        L1 l1G = this.f16818a.G();
        if (l1G == null) {
            Log.println(6, C(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!l1G.n()) {
                Log.println(6, C(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i7 >= 9) {
                i7 = 8;
            }
            l1G.z(new RunnableC2219g1(this, i7, str, obj, obj2, obj3));
        }
    }

    @Override
    protected final boolean j() {
        return false;
    }

    public final C2224h1 q() {
        return this.f16854m;
    }

    public final C2224h1 r() {
        return this.f16847f;
    }

    public final C2224h1 s() {
        return this.f16849h;
    }

    public final C2224h1 t() {
        return this.f16848g;
    }

    public final C2224h1 u() {
        return this.f16853l;
    }

    public final C2224h1 v() {
        return this.f16855n;
    }

    public final C2224h1 w() {
        return this.f16850i;
    }

    public final C2224h1 x() {
        return this.f16852k;
    }

    public final C2224h1 y() {
        return this.f16851j;
    }
}
