package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

public final class C2160v2 extends IOException {
    C2160v2(long j7, long j8, int i7, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i7))), th);
    }

    C2160v2(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
