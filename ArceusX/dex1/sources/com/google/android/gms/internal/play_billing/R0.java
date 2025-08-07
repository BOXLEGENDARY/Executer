package com.google.android.gms.internal.play_billing;

final class R0 {

    static final R0 f15924b = new R0(new a("Failure occurred while trying to finish a future."));

    final Throwable f15925a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    R0(Throwable th) {
        th.getClass();
        this.f15925a = th;
    }
}
