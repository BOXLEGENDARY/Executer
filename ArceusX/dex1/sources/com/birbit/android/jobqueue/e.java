package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class e implements Serializable {

    private transient long f13710A;

    private transient long f13711B;

    private transient boolean f13712C;

    volatile transient boolean f13713D;

    private transient Context f13714E;

    private volatile transient boolean f13715F;

    private volatile transient boolean f13716G;

    private transient String f13717d = UUID.randomUUID().toString();

    transient int f13718e;

    private transient String f13719i;

    private transient boolean f13720v;

    private transient Set<String> f13721w;

    private transient int f13722y;

    transient int f13723z;

    protected e(i iVar) {
        this.f13718e = iVar.f13784a;
        this.f13720v = iVar.g();
        this.f13719i = iVar.c();
        this.f13723z = iVar.d();
        this.f13710A = Math.max(0L, iVar.b());
        this.f13711B = Math.max(0L, iVar.a());
        this.f13712C = iVar.i();
        String strE = iVar.e();
        if (iVar.f() != null || strE != null) {
            HashSet<String> hashSetF = iVar.f() != null ? iVar.f() : new HashSet<>();
            if (strE != null) {
                String strA = a(strE);
                hashSetF.add(strA);
                if (this.f13719i == null) {
                    this.f13719i = strA;
                }
            }
            this.f13721w = Collections.unmodifiableSet(hashSetF);
        }
        long j7 = this.f13711B;
        if (j7 <= 0 || j7 >= this.f13710A) {
            return;
        }
        throw new IllegalArgumentException("deadline cannot be less than the delay. It does not make sense. deadline:" + this.f13711B + ",delay:" + this.f13710A);
    }

    private String a(String str) {
        return "job-single-id:" + str;
    }

    long b() {
        return this.f13711B;
    }

    public final long c() {
        return this.f13710A;
    }

    public final String d() {
        return this.f13717d;
    }

    public final int e() {
        return this.f13723z;
    }

    protected int f() {
        return 20;
    }

    public final String g() {
        return this.f13719i;
    }

    public final String h() {
        Set<String> set = this.f13721w;
        if (set == null) {
            return null;
        }
        for (String str : set) {
            if (str.startsWith("job-single-id:")) {
                return str;
            }
        }
        return null;
    }

    public final Set<String> i() {
        return this.f13721w;
    }

    public final boolean j() {
        return this.f13720v;
    }

    public abstract void k();

    protected abstract void l(int i7, Throwable th);

    public abstract void m() throws Throwable;

    final int n(f fVar, int i7, Timer timer) {
        boolean zC;
        boolean z7;
        Throwable th;
        this.f13722y = i7;
        if (C2491a.e()) {
            C2491a.b("running job %s", getClass().getSimpleName());
        }
        boolean z8 = false;
        try {
            m();
            if (C2491a.e()) {
                C2491a.b("finished job %s", this);
            }
            th = null;
            z7 = false;
            zC = false;
        } catch (Throwable th2) {
            C2491a.d(th2, "error while executing job %s", this);
            boolean z9 = fVar.F() && fVar.b() <= timer.nanoTime();
            zC = i7 < f() && !z9;
            if (zC && !this.f13713D) {
                try {
                    f2.d dVarR = r(th2, i7, f());
                    if (dVarR == null) {
                        dVarR = f2.d.f20478e;
                    }
                    fVar.f13740q = dVarR;
                    zC = dVarR.c();
                } catch (Throwable th3) {
                    C2491a.d(th3, "shouldReRunOnThrowable did throw an exception", new Object[0]);
                }
            }
            z8 = true;
            z7 = z9;
            th = th2;
        }
        C2491a.b("safeRunResult for %s : %s. re run:%s. cancelled: %s", this, Boolean.valueOf(!z8), Boolean.valueOf(zC), Boolean.valueOf(this.f13713D));
        if (!z8) {
            return 1;
        }
        if (fVar.s()) {
            return 6;
        }
        if (fVar.r()) {
            return 3;
        }
        if (zC) {
            return 4;
        }
        if (z7) {
            return 7;
        }
        if (i7 < f()) {
            fVar.E(th);
            return 5;
        }
        fVar.E(th);
        return 2;
    }

    void o(Context context) {
        this.f13714E = context;
    }

    void p(boolean z7) {
        this.f13716G = z7;
    }

    boolean q() {
        return this.f13712C;
    }

    protected abstract f2.d r(Throwable th, int i7, int i8);

    final void s(f fVar) {
        if (this.f13715F) {
            throw new IllegalStateException("Cannot set a Job from JobHolder after it is sealed.");
        }
        this.f13717d = fVar.f13725b;
        this.f13719i = fVar.f13728e;
        this.f13723z = fVar.h();
        this.f13720v = fVar.f13726c;
        this.f13721w = fVar.f13737n;
        this.f13718e = fVar.f13733j;
        this.f13715F = true;
    }
}
