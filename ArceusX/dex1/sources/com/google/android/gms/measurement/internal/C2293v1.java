package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import n3.C2651i;

public final class C2293v1 {

    private final String f17062a;

    private boolean f17063b;

    private String f17064c;

    final C2303x1 f17065d;

    public C2293v1(C2303x1 c2303x1, String str, String str2) {
        this.f17065d = c2303x1;
        C2651i.f(str);
        this.f17062a = str;
    }

    public final String a() {
        if (!this.f17063b) {
            this.f17063b = true;
            this.f17064c = this.f17065d.o().getString(this.f17062a, null);
        }
        return this.f17064c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f17065d.o().edit();
        editorEdit.putString(this.f17062a, str);
        editorEdit.apply();
        this.f17064c = str;
    }
}
