package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import n3.C2651i;

final class J1<V> extends FutureTask<V> implements Comparable<J1<V>> {

    private final long f16340d;

    final boolean f16341e;

    private final String f16342i;

    final L1 f16343v;

    J1(L1 l1, Runnable runnable, boolean z7, String str) {
        super(runnable, null);
        this.f16343v = l1;
        C2651i.l(str);
        long andIncrement = L1.f16366l.getAndIncrement();
        this.f16340d = andIncrement;
        this.f16342i = str;
        this.f16341e = z7;
        if (andIncrement == Long.MAX_VALUE) {
            l1.f16818a.b().r().a("Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(Object obj) {
        J1 j12 = (J1) obj;
        boolean z7 = this.f16341e;
        if (z7 == j12.f16341e) {
            long j7 = this.f16340d;
            long j8 = j12.f16340d;
            if (j7 < j8) {
                return -1;
            }
            if (j7 <= j8) {
                this.f16343v.f16818a.b().t().b("Two tasks share the same index. index", Long.valueOf(this.f16340d));
                return 0;
            }
        } else if (z7) {
            return -1;
        }
        return 1;
    }

    @Override
    protected final void setException(Throwable th) {
        this.f16343v.f16818a.b().r().b(this.f16342i, th);
        super.setException(th);
    }

    J1(L1 l1, Callable<V> callable, boolean z7, String str) {
        super(callable);
        this.f16343v = l1;
        C2651i.l("Task exception on worker thread");
        long andIncrement = L1.f16366l.getAndIncrement();
        this.f16340d = andIncrement;
        this.f16342i = "Task exception on worker thread";
        this.f16341e = z7;
        if (andIncrement == Long.MAX_VALUE) {
            l1.f16818a.b().r().a("Tasks index overflow");
        }
    }
}
