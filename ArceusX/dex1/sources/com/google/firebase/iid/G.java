package com.google.firebase.iid;

import n3.C2649g;
import n3.C2651i;

final class G {

    private final String f19022a;

    private final long f19023b;

    G(String str, long j7) {
        this.f19022a = (String) C2651i.l(str);
        this.f19023b = j7;
    }

    final String b() {
        return this.f19022a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return this.f19023b == g7.f19023b && this.f19022a.equals(g7.f19022a);
    }

    public final int hashCode() {
        return C2649g.c(this.f19022a, Long.valueOf(this.f19023b));
    }
}
