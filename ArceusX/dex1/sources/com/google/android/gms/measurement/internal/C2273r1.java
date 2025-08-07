package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import n3.C2651i;

public final class C2273r1 {

    private final String f16988a;

    private final boolean f16989b;

    private boolean f16990c;

    private boolean f16991d;

    final C2303x1 f16992e;

    public C2273r1(C2303x1 c2303x1, String str, boolean z7) {
        this.f16992e = c2303x1;
        C2651i.f(str);
        this.f16988a = str;
        this.f16989b = z7;
    }

    public final void a(boolean z7) {
        SharedPreferences.Editor editorEdit = this.f16992e.o().edit();
        editorEdit.putBoolean(this.f16988a, z7);
        editorEdit.apply();
        this.f16991d = z7;
    }

    public final boolean b() {
        if (!this.f16990c) {
            this.f16990c = true;
            this.f16991d = this.f16992e.o().getBoolean(this.f16988a, this.f16989b);
        }
        return this.f16991d;
    }
}
