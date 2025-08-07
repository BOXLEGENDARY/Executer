package C;

import C.T;
import android.os.SystemClock;
import z.C3039b0;
import z.r0;

public final class L implements r0.b {

    private final int f402a;

    private final int f403b;

    private final long f404c;

    private final Throwable f405d;

    public L(long j7, int i7, Throwable th) {
        this.f404c = SystemClock.elapsedRealtime() - j7;
        this.f403b = i7;
        if (th instanceof T.b) {
            this.f402a = 2;
            this.f405d = th;
            return;
        }
        if (!(th instanceof C3039b0)) {
            this.f402a = 0;
            this.f405d = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.f405d = th;
        if (th instanceof z.r) {
            this.f402a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.f402a = 1;
        } else {
            this.f402a = 0;
        }
    }

    @Override
    public Throwable a() {
        return this.f405d;
    }

    @Override
    public long b() {
        return this.f404c;
    }

    @Override
    public int d() {
        return this.f402a;
    }
}
