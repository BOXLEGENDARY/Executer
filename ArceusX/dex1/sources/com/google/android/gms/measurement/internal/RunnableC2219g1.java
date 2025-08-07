package com.google.android.gms.measurement.internal;

import android.util.Log;

final class RunnableC2219g1 implements Runnable {

    final int f16796d;

    final String f16797e;

    final Object f16798i;

    final Object f16799v;

    final Object f16800w;

    final C2234j1 f16801y;

    RunnableC2219g1(C2234j1 c2234j1, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f16801y = c2234j1;
        this.f16796d = i7;
        this.f16797e = str;
        this.f16798i = obj;
        this.f16799v = obj2;
        this.f16800w = obj3;
    }

    @Override
    public final void run() {
        C2303x1 c2303x1F = this.f16801y.f16818a.F();
        if (!c2303x1F.n()) {
            Log.println(6, this.f16801y.C(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f16801y.f16844c == 0) {
            if (this.f16801y.f16818a.z().H()) {
                C2234j1 c2234j1 = this.f16801y;
                c2234j1.f16818a.d();
                c2234j1.f16844c = 'C';
            } else {
                C2234j1 c2234j12 = this.f16801y;
                c2234j12.f16818a.d();
                c2234j12.f16844c = 'c';
            }
        }
        if (this.f16801y.f16845d < 0) {
            C2234j1 c2234j13 = this.f16801y;
            c2234j13.f16818a.z().q();
            c2234j13.f16845d = 46000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f16796d);
        char c2 = this.f16801y.f16844c;
        long j7 = this.f16801y.f16845d;
        String strA = C2234j1.A(true, this.f16797e, this.f16798i, this.f16799v, this.f16800w);
        StringBuilder sb = new StringBuilder(strA.length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j7);
        sb.append(":");
        sb.append(strA);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.f16797e.substring(0, 1024);
        }
        C2288u1 c2288u1 = c2303x1F.f17082d;
        if (c2288u1 != null) {
            c2288u1.b(string, 1L);
        }
    }
}
