package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

final class I1 extends TimeoutException {
    I1(String str, J1 j12) {
        super(str);
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
