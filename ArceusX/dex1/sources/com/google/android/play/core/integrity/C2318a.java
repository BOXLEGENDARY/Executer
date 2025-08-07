package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import l3.C2527b;

public class C2318a extends C2527b {

    private final Throwable f18822e;

    C2318a(int i7, Throwable th) {
        super(new Status(i7, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i7), A4.a.a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f18822e = th;
    }

    @Override
    public final synchronized Throwable getCause() {
        return this.f18822e;
    }
}
