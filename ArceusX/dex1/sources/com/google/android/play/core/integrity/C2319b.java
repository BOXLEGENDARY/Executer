package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import l3.C2527b;

public class C2319b extends C2527b {

    private final Throwable f18823e;

    C2319b(int i7, Throwable th) {
        super(new Status(i7, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i7), A4.b.a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f18823e = th;
    }

    @Override
    public final synchronized Throwable getCause() {
        return this.f18823e;
    }
}
