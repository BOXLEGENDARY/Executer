package com.google.android.gms.internal.play_billing;

final class G2 extends Throwable {
    G2(String str) {
        super("Failure occurred while trying to finish a future.");
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
