package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.Set;

public class f {

    private Long f13724a;

    public final String f13725b;

    public final boolean f13726c;

    private int f13727d;

    public final String f13728e;

    private int f13729f;

    private long f13730g;

    private long f13731h;

    private long f13732i;

    int f13733j;

    private long f13734k;

    private boolean f13735l;

    final transient e f13736m;

    protected final Set<String> f13737n;

    private volatile boolean f13738o;

    private volatile boolean f13739p;

    f2.d f13740q;

    private Throwable f13741r;

    public static class b {

        private int f13742a;

        private String f13743b;

        private boolean f13744c;

        private String f13745d;

        private e f13747f;

        private long f13748g;

        private Long f13750i;

        private long f13751j;

        private Set<String> f13755n;

        private int f13756o;

        private int f13746e = 0;

        private long f13749h = Long.MIN_VALUE;

        private long f13752k = Long.MAX_VALUE;

        private boolean f13753l = false;

        private int f13754m = 0;

        public f a() {
            f fVar;
            e eVar = this.f13747f;
            if (eVar == null) {
                throw new IllegalArgumentException("must provide a job");
            }
            int i7 = this.f13754m & 2047;
            if (i7 != 2047) {
                throw new IllegalArgumentException("must provide all required fields. your result:" + Long.toBinaryString(i7));
            }
            f fVar2 = new f(this.f13743b, this.f13744c, this.f13742a, this.f13745d, this.f13746e, eVar, this.f13748g, this.f13749h, this.f13751j, this.f13755n, this.f13756o, this.f13752k, this.f13753l);
            Long l7 = this.f13750i;
            if (l7 != null) {
                fVar = fVar2;
                fVar.A(l7.longValue());
            } else {
                fVar = fVar2;
            }
            this.f13747f.s(fVar);
            return fVar;
        }

        public b b(long j7) {
            this.f13748g = j7;
            this.f13754m |= 32;
            return this;
        }

        public b c(long j7, boolean z7) {
            this.f13752k = j7;
            this.f13753l = z7;
            this.f13754m |= 128;
            return this;
        }

        public b d(long j7) {
            this.f13749h = j7;
            this.f13754m |= 64;
            return this;
        }

        public b e(String str) {
            this.f13745d = str;
            this.f13754m |= 8;
            return this;
        }

        public b f(String str) {
            this.f13743b = str;
            this.f13754m |= 4;
            return this;
        }

        public b g(long j7) {
            this.f13750i = Long.valueOf(j7);
            return this;
        }

        public b h(e eVar) {
            this.f13747f = eVar;
            this.f13754m |= 16;
            return this;
        }

        public b i(boolean z7) {
            this.f13744c = z7;
            this.f13754m |= 2;
            return this;
        }

        public b j(int i7) {
            this.f13742a = i7;
            this.f13754m |= 1;
            return this;
        }

        public b k(int i7) {
            this.f13756o = i7;
            this.f13754m |= 1024;
            return this;
        }

        public b l(int i7) {
            this.f13746e = i7;
            return this;
        }

        public b m(long j7) {
            this.f13751j = j7;
            this.f13754m |= 256;
            return this;
        }

        public b n(Set<String> set) {
            this.f13755n = set;
            this.f13754m |= 512;
            return this;
        }
    }

    public void A(long j7) {
        this.f13724a = Long.valueOf(j7);
    }

    public void B(int i7) {
        this.f13727d = i7;
        this.f13736m.f13723z = i7;
    }

    public void C(int i7) {
        this.f13729f = i7;
    }

    public void D(long j7) {
        this.f13732i = j7;
    }

    void E(Throwable th) {
        this.f13741r = th;
    }

    public boolean F() {
        return this.f13735l;
    }

    public long a() {
        return this.f13731h;
    }

    public long b() {
        return this.f13734k;
    }

    public long c() {
        return this.f13730g;
    }

    public String d() {
        return this.f13728e;
    }

    public String e() {
        return this.f13725b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f13725b.equals(((f) obj).f13725b);
        }
        return false;
    }

    public Long f() {
        return this.f13724a;
    }

    public e g() {
        return this.f13736m;
    }

    public int h() {
        return this.f13727d;
    }

    public int hashCode() {
        return this.f13725b.hashCode();
    }

    public int i() {
        return this.f13733j;
    }

    public f2.d j() {
        return this.f13740q;
    }

    public int k() {
        return this.f13729f;
    }

    public long l() {
        return this.f13732i;
    }

    public Set<String> m() {
        return this.f13737n;
    }

    Throwable n() {
        return this.f13741r;
    }

    public boolean o() {
        return this.f13734k != Long.MAX_VALUE;
    }

    public boolean p() {
        return this.f13730g != Long.MIN_VALUE;
    }

    public boolean q() {
        Set<String> set = this.f13737n;
        return set != null && set.size() > 0;
    }

    public boolean r() {
        return this.f13738o;
    }

    public boolean s() {
        return this.f13739p;
    }

    public void t() {
        this.f13738o = true;
        this.f13736m.f13713D = true;
    }

    public void u() {
        this.f13739p = true;
        t();
    }

    public void v(int i7) {
        this.f13736m.l(i7, this.f13741r);
    }

    int w(int i7, Timer timer) {
        return this.f13736m.n(this, i7, timer);
    }

    public void x(Context context) {
        this.f13736m.o(context);
    }

    public void y(boolean z7) {
        this.f13736m.p(z7);
    }

    public void z(long j7) {
        this.f13730g = j7;
    }

    private f(String str, boolean z7, int i7, String str2, int i8, e eVar, long j7, long j8, long j9, Set<String> set, int i9, long j10, boolean z8) {
        this.f13725b = str;
        this.f13726c = z7;
        this.f13727d = i7;
        this.f13728e = str2;
        this.f13729f = i8;
        this.f13731h = j7;
        this.f13730g = j8;
        this.f13736m = eVar;
        this.f13732i = j9;
        this.f13733j = i9;
        this.f13737n = set;
        this.f13734k = j10;
        this.f13735l = z8;
    }
}
