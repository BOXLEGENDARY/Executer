package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import m3.C2571b;
import n3.C2649g;

final class u {

    private final C2571b f14185a;

    private final Feature f14186b;

    u(C2571b c2571b, Feature feature, m3.p pVar) {
        this.f14185a = c2571b;
        this.f14186b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof u)) {
            u uVar = (u) obj;
            if (C2649g.b(this.f14185a, uVar.f14185a) && C2649g.b(this.f14186b, uVar.f14186b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2649g.c(this.f14185a, this.f14186b);
    }

    public final String toString() {
        return C2649g.d(this).a("key", this.f14185a).a("feature", this.f14186b).toString();
    }
}
