package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import n3.C2651i;

public final class C2283t1 {

    private final String f17023a;

    private final long f17024b;

    private boolean f17025c;

    private long f17026d;

    final C2303x1 f17027e;

    public C2283t1(C2303x1 c2303x1, String str, long j7) {
        this.f17027e = c2303x1;
        C2651i.f(str);
        this.f17023a = str;
        this.f17024b = j7;
    }

    public final long a() {
        if (!this.f17025c) {
            this.f17025c = true;
            this.f17026d = this.f17027e.o().getLong(this.f17023a, this.f17024b);
        }
        return this.f17026d;
    }

    public final void b(long j7) {
        SharedPreferences.Editor editorEdit = this.f17027e.o().edit();
        editorEdit.putLong(this.f17023a, j7);
        editorEdit.apply();
        this.f17026d = j7;
    }
}
